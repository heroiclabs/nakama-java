/*
 * Copyright 2023 The Satori Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.satori;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Nullable;

import com.google.protobuf.BoolValue;
import com.heroiclabs.nakama.api.NakamaGrpc;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import com.google.common.io.BaseEncoding;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.stub.MetadataUtils;
import com.heroiclabs.satori.api.*;

@Slf4j
public class DefaultClient implements Client {

    private final ManagedChannel managedChannel;
    private SatoriGrpc.SatoriFutureStub stub;

    private final int deadlineAfterMs;
    private static final String USERAGENT = "satori-java-client";

    private final Metadata basicAuthMetadata;

    @Getter @Setter
    private boolean autoRefreshSession = true;
    @Getter @Setter
    private int defaultExpiryTimeMinutes = 5;

    /**
     * A client to interact with the Satori server.
     * @param apiKey The key used to authenticate with the server without a session.
     * @param host The host address of the server. Defaults to "127.0.0.1".
     * @param port The port number of the server. Defaults to 7349.
     * @param ssl Set connection strings to use the secure mode with the server. Defaults to false. The server must be configured to make use of this option. With HTTP, GRPC, and WebSockets the server must
     * be configured with an SSL certificate or use a load balancer which performs SSL termination. For rUDP you
     * must configure the server to expose it's IP address so it can be bundled within session tokens. See the
     * server documentation for more information.
     */
    public DefaultClient(@NonNull final String apiKey, @NonNull final String host, final int port, final boolean ssl) {
        this(apiKey, host, port, ssl, 0, Long.MAX_VALUE, 0L, false);
    }

    /**
     * A client to interact with the Satori Satori.
     * @param apiKey The key used to authenticate with the server without a session.
     * @param host The host address of the server.
     * @param port The port number of the server. Defaults to 7349.
     * @param ssl Set connection strings to use the secure mode with the server. Defaults to false. The server must be configured to make use of this option. With HTTP, GRPC, and WebSockets the server must
     * be configured with an SSL certificate or use a load balancer which performs SSL termination. For rUDP you
     * must configure the server to expose it's IP address so it can be bundled within session tokens. See the
     * server documentation for more information.
     * @param deadlineAfterMs Timeout for the gRPC messages.
     * @param keepAliveTimeMs Sets the time without read activity before sending a keepalive ping. An unreasonably small
     * value might be increased, and {@code Long.MAX_VALUE} nano seconds or an unreasonably large
     * value will disable keepalive. Defaults to infinite.
     * @param keepAliveTimeoutMs Sets the time waiting for read activity after sending a keepalive ping. If the time expires
     * without any read activity on the connection, the connection is considered dead. An unreasonably
     * small value might be increased. Defaults to 20 seconds.
     * @param trace Trace all actions performed by the client. Defaults to false.
     */
    public DefaultClient(@NonNull final String apiKey, @NonNull final String host, final int port, final boolean ssl,
                         final int deadlineAfterMs, final long keepAliveTimeMs, final long keepAliveTimeoutMs,  final boolean trace) {
        this.deadlineAfterMs = deadlineAfterMs;

        // TODO investigate executor
        // TODO investigate disconnect errors
        ManagedChannelBuilder builder = OkHttpChannelBuilder
                .forAddress(host, port)
                .userAgent(USERAGENT);

        builder = ssl ? builder.useTransportSecurity() : builder.usePlaintext();
        builder = keepAliveTimeMs < Long.MAX_VALUE ? builder.keepAliveTime(keepAliveTimeMs, TimeUnit.MILLISECONDS) : builder;
        builder = keepAliveTimeoutMs > 0L ? builder.keepAliveTimeout(keepAliveTimeoutMs, TimeUnit.MILLISECONDS) : builder;
        this.managedChannel = builder.build();
        this.stub = SatoriGrpc.newFutureStub(this.managedChannel);

        final String base64Auth = BaseEncoding.base64().encode((apiKey + ":").getBytes());
        final String basicAuth = "Basic " + base64Auth;
        this.basicAuthMetadata = new Metadata();
        basicAuthMetadata.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), basicAuth);
    }

    private SatoriGrpc.SatoriFutureStub getStub() {
        return getStub(null);
    }

    private SatoriGrpc.SatoriFutureStub getStub(final Session session) {
        Metadata metadata = this.basicAuthMetadata;
        if (session != null) {
            metadata = new Metadata();
            metadata.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER),
                    "Bearer " + session.getAuthToken());
        }

        SatoriGrpc.SatoriFutureStub newStub = this.stub.withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));
        if (this.deadlineAfterMs > 0) {
            newStub = newStub.withDeadlineAfter(deadlineAfterMs, TimeUnit.MILLISECONDS);
        }

        return newStub;
    }

    @Override
    public ListenableFuture<Session> authenticate(@NonNull final String id, final Map<String, String> defaultProperties,
            final Map<String, String> customProperties) {
        return convertSession(getStub().authenticate(AuthenticateRequest.newBuilder()
                .setId(id)
                .putAllDefault(defaultProperties)
                .putAllCustom(customProperties)
                .build()));
    }

    @Override
    public ListenableFuture<Empty> authenticateLogout(@NonNull final Session session) {
        return autoRefreshSession(session, getStub(session).authenticateLogout(AuthenticateLogoutRequest.newBuilder()
                .setToken(session.getAuthToken())
                .setRefreshToken(session.getRefreshToken())
                .build()));
    }

    @Override
    public ListenableFuture<Empty> deleteIdentity(@NonNull final Session session) {
        return autoRefreshSession(session, getStub(session).deleteIdentity(Empty.newBuilder().build()));
    }

    @Override
    public ListenableFuture<Empty> deleteMessage(@NonNull final Session session, @NonNull final String messageId) {
        return autoRefreshSession(session, getStub(session).deleteMessage(DeleteMessageRequest.newBuilder().setId(messageId).build()));
    }

    @Override
    public void disconnect() {
        this.managedChannel.shutdownNow();
    }

    @Override
    public void disconnect(final long timeout, @NonNull final TimeUnit unit) throws InterruptedException {
        this.managedChannel.shutdown();
        this.managedChannel.awaitTermination(timeout, unit);
    }

    @Override
    public ListenableFuture<Empty> event(@NonNull final Session session, @NonNull final Event event) {
        return autoRefreshSession(session, getStub(session).event(EventRequest.newBuilder()
                .addEvents(toProtoEvent(event))
                .build()));
    }

    @Override
    public ListenableFuture<Empty> events(@NonNull final Session session, @NonNull final List<Event> events) {
        EventRequest.Builder builder = EventRequest.newBuilder();

        for (int i = 0; i < events.size(); i++) {
            builder.addEvents(toProtoEvent(events.get(i)));
        }

        return autoRefreshSession(session, getStub(session).event(builder.build()));
    }

    @Override
    public ListenableFuture<ExperimentList> getAllExperiments(@NonNull final Session session) {
        return autoRefreshSession(session, getStub(session).getExperiments(GetExperimentsRequest.newBuilder()
                .build()));
    }

    @Override
    public ListenableFuture<ExperimentList> getExperiments(@NonNull final Session session, @NonNull final String... names) {
        return autoRefreshSession(session, getStub(session).getExperiments(GetExperimentsRequest.newBuilder()
                .addAllNames(Arrays.asList(names))
                .build()));
    }

    @Override
    public ListenableFuture<Flag> getFlag(@NonNull final Session session, @NonNull final String name) {
        ListenableFuture<FlagList> futureFlagsList = getFlags(session, name);
        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                return flagList.getFlagsList().get(0);
            }

            throw new IllegalArgumentException("Flag '" + name + "' not found.");
        }, MoreExecutors.directExecutor());
    }

    @Override
    public ListenableFuture<Flag> getFlag(@NonNull final Session session, @NonNull final String name, @NonNull final String defaultValue) {
        ListenableFuture<FlagList> futureFlagsList = getFlags(session, name);

        futureFlagsList = Futures.catching(futureFlagsList, Throwable.class, throwable -> {
            FlagList.Builder flagListBuilder = FlagList.newBuilder();
            flagListBuilder.addFlags(Flag.newBuilder().setName(name).setValue(defaultValue).build());
            return flagListBuilder.build();
        }, MoreExecutors.directExecutor());

        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                return flagList.getFlagsList().get(0);
            }

            Flag.Builder builder = Flag.newBuilder();
            return builder.setName(name).setValue(defaultValue).build();
        }, MoreExecutors.directExecutor());
    }

    @Override
    public ListenableFuture<FlagList> getFlags(@NonNull final Session session, String... names) {
        return autoRefreshSession(session, getStub(session).getFlags(GetFlagsRequest.newBuilder()
                .addAllNames(Arrays.asList(names))
                .build()));
    }

    @Override
    public ListenableFuture<Flag> getFlagDefault(@NonNull String name) {
        ListenableFuture<FlagList> futureFlagsList = getFlagsDefault(name);
        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                return flagList.getFlagsList().get(0);
            }

            throw new IllegalArgumentException("Flag '" + name + "' not found.");
        }, MoreExecutors.directExecutor());
    }

    @Override
    public ListenableFuture<Flag> getFlagDefault(@NonNull String name, @NonNull String defaultValue) {
        ListenableFuture<FlagList> futureFlagsList = getFlagsDefault(name);

        futureFlagsList = Futures.catching(futureFlagsList, Throwable.class, throwable -> {
            FlagList.Builder flagListBuilder = FlagList.newBuilder();
            flagListBuilder.addFlags(Flag.newBuilder().setName(name).setValue(defaultValue).build());
            return flagListBuilder.build();
        }, MoreExecutors.directExecutor());

        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                return flagList.getFlagsList().get(0);
            }

            Flag.Builder builder = Flag.newBuilder();
            return builder.setName(name).setValue(defaultValue).build();
        }, MoreExecutors.directExecutor());
    }

    @Override
    public ListenableFuture<FlagList> getFlagsDefault(String... names) {
        return getStub().getFlags(GetFlagsRequest.newBuilder().addAllNames(Arrays.asList(names)).build());
    }

    @Override
    public ListenableFuture<LiveEventList> getLiveEvents(@NonNull final Session session, String... names) {
        return autoRefreshSession(session, getStub(session).getLiveEvents(GetLiveEventsRequest.newBuilder()
                .addAllNames(Arrays.asList(names))
                .build()));
    }

    @Override
    public ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session) {
        return autoRefreshSession(session, getStub(session).getMessageList(GetMessageListRequest.newBuilder().build()));
    }

    @Override
    public ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, final int limit) {
        return autoRefreshSession(session, getStub(session).getMessageList(GetMessageListRequest.newBuilder().setLimit(limit).build()));
    }

    @Override
    public ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, final int limit, final boolean forward) {
        return autoRefreshSession(session, getStub(session).getMessageList(GetMessageListRequest.newBuilder().setLimit(limit).setForward(forward).build()));
    }

    @Override
    public ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, final int limit, final boolean forward, @NonNull final String cursor) {
        return autoRefreshSession(session, getStub(session).getMessageList(GetMessageListRequest.newBuilder().setLimit(limit).setForward(forward).setCursor(cursor).build()));
    }

    @Override
    public ListenableFuture<Properties> listProperties(@NonNull Session session) {
        return autoRefreshSession(session, getStub(session).listProperties(Empty.newBuilder().build()));
    }

    @Override
    public ListenableFuture<Session> identify(@NonNull Session session, @NonNull String id,
            @NonNull Map<String, String> defaultProperties, @NonNull Map<String, String> customProperties) {
        return convertSession(getStub(session).identify(IdentifyRequest.newBuilder().setId(id).build()));
    }

    @Override
    public ListenableFuture<Session> sessionRefresh(Session session) {
        return convertSession(getStub(session).authenticateRefresh(
            AuthenticateRefreshRequest.newBuilder().setRefreshToken(session.getRefreshToken()).build()), session);
    }

    @Override
    public ListenableFuture<Empty> updateMessage(@NonNull final Session session, @NonNull final String id, final long readTime) {
        return autoRefreshSession(session, getStub(session).updateMessage(UpdateMessageRequest.newBuilder().setId(id).setReadTime(readTime).build()));
    }

    @Override
    public ListenableFuture<Empty> updateMessage(@NonNull final Session session, @NonNull final String id, final long readTime, final long consumeTime) {
        return autoRefreshSession(session, getStub(session).updateMessage(UpdateMessageRequest.newBuilder().setId(id).setReadTime(readTime).setConsumeTime(consumeTime).build()));
    }

    @Override
    public ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties) {
        // Assuming we have a method to convert Properties to a Map
        return autoRefreshSession(session, getStub(session).updateProperties(UpdatePropertiesRequest.newBuilder()
                .putAllDefault(defaultProperties)
                .putAllCustom(customProperties)
                .build()));
    }

    @Override
    public ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties, final boolean recompute) {
        // Assuming we have a method to convert Properties to a Map
        return autoRefreshSession(session, getStub(session).updateProperties(UpdatePropertiesRequest.newBuilder()
                .putAllDefault(defaultProperties)
                .putAllCustom(customProperties)
                .setRecompute(BoolValue.newBuilder().setValue(recompute).build())
                .build()));
    }

    private ListenableFuture<Session> convertSession(final ListenableFuture<com.heroiclabs.satori.api.Session> future) {
        return convertSession(future, null);
    }

    private ListenableFuture<Session> convertSession(final ListenableFuture<com.heroiclabs.satori.api.Session> future, Session existingSession) {
      return Futures.transformAsync(future, new AsyncFunction<com.heroiclabs.satori.api.Session, Session>() {
          @Override
          public ListenableFuture<Session> apply(@NonNull final com.heroiclabs.satori.api.Session input) {
              if (existingSession != null) {
                  existingSession.update(input.getToken(), input.getRefreshToken());
                  return Futures.immediateFuture(existingSession);
              } else {
                  final Session result = new DefaultSession(input.getToken(), input.getRefreshToken());
                  return Futures.immediateFuture(result);
              }
          }
      }, MoreExecutors.directExecutor());
    }

    private <V> ListenableFuture<V> autoRefreshSession(Session session, ListenableFuture<V> future) {
        Date now = Date.from(Instant.now().atZone(ZoneId.of("UTC")).plusMinutes(defaultExpiryTimeMinutes).toInstant());
        if (autoRefreshSession && session.getRefreshToken() != null && !session.getRefreshToken().isEmpty() && session.isRefreshExpired(now)) {
            ListenableFuture<List<Object>> futures = Futures.allAsList(sessionRefresh(session), future);
            return Futures.transformAsync(futures, new AsyncFunction<List<Object>, V>() {
                @Override
                public ListenableFuture<V> apply(@Nullable final List<Object> input) {
                    return Futures.immediateFuture((V)input.get(1)); // ignore 0 as that's the session itself.
                }
            }, MoreExecutors.directExecutor());
        } else {
            return future;
        }
    }

    private Timestamp toProtoTimestamp(Instant instant) {
        return Timestamp.newBuilder()
            .setSeconds(instant.getEpochSecond())
            .setNanos(instant.getNano())
            .build();
    }

    private com.heroiclabs.satori.api.Event toProtoEvent(Event event) {
        com.heroiclabs.satori.api.Event.Builder eventBuilder = com.heroiclabs.satori.api.Event.newBuilder();
        eventBuilder
            .setName(event.getName())
            .setValue(event.getValue())
            .setTimestamp(toProtoTimestamp(event.getTimestamp()))
            .putAllMetadata(event.getMetadata());

        return eventBuilder.build();
    }
}
