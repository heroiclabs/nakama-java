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

import com.google.common.io.BaseEncoding;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;
import com.heroiclabs.satori.api.*;
import com.heroiclabs.satori.api.Properties;
import io.grpc.okhttp.OkHttpChannelBuilder;
import kotlin.Pair;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@Slf4j
public class HttpClient implements Client {

    private final OkHttpClient client;

    private final String basicAuth;
    private final HttpUrl url;

    private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String USERAGENT = "satori-java-client";

    /**
     * A client to interact with the Satori server.
     * @param apiKey The key used to authenticate with the server without a session.
     * @param host The host address of the server. Defaults to "127.0.0.1".
     * @param port The port number of the server. Defaults to 7349.
     * @param ssl Set connection strings to use the secure mode with the server. Defaults to false. The server must be configured to make use of this option. With HTTP, GRPC, and WebSockets the server must
     * be configured with an SSL certificate or use a load balancer which performs SSL termination. For rUDP you
     * must configure the server to expose its IP address, so it can be bundled within session tokens. See the
     * server documentation for more information.
     */
    public HttpClient(@NonNull final String apiKey, @NonNull final String host, final int port, final boolean ssl) {
        this(apiKey, host, port, ssl, 10_000, 0, 0L);
    }

    /**
     * A client to interact with the Satori server.
     * @param apiKey The key used to authenticate with the server without a session.
     * @param host The host address of the server.
     * @param port The port number of the server. Defaults to 7349.
     * @param ssl Set connection strings to use the secure mode with the server. Defaults to false. The server must be configured to make use of this option. The server must
     * be configured with an SSL certificate or use a load balancer which performs SSL termination.
     * @param connectTimeoutMs Sets the default connect timeout for new connections. A value of 0 means no timeout, otherwise values must be between 1 and {@code Integer.MAX_VALUE} when converted to milliseconds.
     * The default value is 10 seconds.
     * @param callTimeoutMs Sets the default timeout for complete calls. A value of 0 means no timeout, otherwise values must be between 1 and {@code Integer.MAX_VALUE} when converted to milliseconds.
     * @param pingIntervalMs Sets the interval between HTTP/2 pings initiated by this client. Use this to automatically send ping frames until either the connection fails or it is closed.
     * This keeps the connection alive and may detect connectivity failures. The default value of 0 disables client-initiated pings.
     */
    public HttpClient(@NonNull final String apiKey, @NonNull final String host, final int port, final boolean ssl,
                      final int connectTimeoutMs, final int callTimeoutMs, final long pingIntervalMs) {
        String scheme = ssl ? "https" : "http";
        this.url = new HttpUrl.Builder()
                .scheme(scheme)
                .host(host)
                .port(port)
                .build();

        this.client = new OkHttpClient.Builder()
                .connectTimeout(connectTimeoutMs, TimeUnit.MILLISECONDS)
                .callTimeout(callTimeoutMs, TimeUnit.MILLISECONDS)
                .pingInterval(pingIntervalMs, TimeUnit.MILLISECONDS)
                .build();

        final String base64Auth = BaseEncoding.base64().encode((apiKey + ":").getBytes());
        this.basicAuth = "Basic " + base64Auth;
    }

    private SatoriGrpc.SatoriFutureStub getStub() {
        return SatoriGrpc.newFutureStub(OkHttpChannelBuilder.forAddress("", 0).build());
    }

    private SatoriGrpc.SatoriFutureStub getStub(Session session) {
        return SatoriGrpc.newFutureStub(OkHttpChannelBuilder.forAddress("", 0).build());
    }

    private Request request(final Session session) {
        String authValue = session != null ? "Bearer " + session.getAuthToken() : this.basicAuth;

        return new Request.Builder()
                .header("authorization", authValue)
                .header("User-Agent", USERAGENT)
                .build();
    }

    @Override
    public ListenableFuture<Session> authenticate(@NonNull final String id, final Map<String, String> defaultProperties,
            final Map<String, String> customProperties) {
        AuthenticateRequest authRequest = AuthenticateRequest.newBuilder()
                .setId(id)
                .putAllDefault(defaultProperties)
                .putAllCustom(customProperties)
                .build();
        return post(null, authRequest, "v1/authenticate", com.heroiclabs.satori.api.Session.newBuilder(), convertSession);
    }

    @Override
    public ListenableFuture<Empty> authenticateLogout(@NonNull final Session session) {
        AuthenticateLogoutRequest logoutRequest = AuthenticateLogoutRequest.newBuilder()
                .setToken(session.getAuthToken())
                .setRefreshToken(session.getRefreshToken())
                .build();

        return post(session, logoutRequest, "v1/authenticate/logout", Empty.newBuilder());
    }

    @Override
    public ListenableFuture<Empty> event(@NonNull final Session session, @NonNull final Event event) {
        EventRequest eventRequest = EventRequest.newBuilder()
                .addEvents(toProtoEvent(event))
                .build();

        return post(session, eventRequest, "v1/event", Empty.newBuilder());
    }

    @Override
    public ListenableFuture<Empty> events(@NonNull final Session session, @NonNull final List<Event> events) {
        EventRequest.Builder builder = EventRequest.newBuilder();

        for (Event event : events) {
            builder.addEvents(toProtoEvent(event));
        }

        return post(session, builder.build(), "v1/event", Empty.newBuilder());
    }

    @Override
    public ListenableFuture<ExperimentList> getAllExperiments(@NonNull final Session session) {
        return get(session, "v1/experiment", Collections.emptyList(), ExperimentList.newBuilder());
    }

    @Override
    public ListenableFuture<ExperimentList> getExperiments(@NonNull final Session session, @NonNull final String... names) {
        List<Pair<String, String>> params = new ArrayList<>();
        for (String name : names) {
            params.add(new Pair<>("names", name));
        }
        return get(session, "v1/experiment", params, ExperimentList.newBuilder());
    }

    @Override
    public ListenableFuture<Flag> getFlag(@NonNull final Session session, @NonNull final String name) {
        List<Pair<String, String>> params = new ArrayList<>();
        params.add(new Pair<>("names", name));

        return get(session, "v1/flag", params, FlagList.newBuilder());
    }

    @Override
    public ListenableFuture<FlagList> getFlags(@NonNull final Session session, String... names) {
        List<Pair<String, String>> params = new ArrayList<>();
        for (String name : names) {
            params.add(new Pair<>("names", name));
        }
        return get(session, "v1/flag", params, FlagList.newBuilder());
    }

    @Override
    public ListenableFuture<Flag> getFlagDefault(@NonNull String name) {
        ListenableFuture<FlagList> futureFlagsList = getFlagsDefault(name);
        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                flagList.getFlagsList().get(0);
            }

            throw new IllegalArgumentException("Flag '" + name + "' not found.");
        }, MoreExecutors.directExecutor());
    }

    @Override
    public ListenableFuture<Flag> getFlagDefault(@NonNull String name, @NonNull String defaultValue) {
        ListenableFuture<FlagList> futureFlagsList = getFlagsDefault(name);
        return Futures.transform(futureFlagsList, flagList -> {
            if (flagList.getFlagsList().size() == 1) {
                flagList.getFlagsList().get(0);
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
        return getStub(session).getLiveEvents(GetLiveEventsRequest.newBuilder()
                .addAllNames(Arrays.asList(names))
                .build());
    }

    @Override
    public ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties) {
        // Assuming we have a method to convert Properties to a Map
        return getStub(session).updateProperties(UpdatePropertiesRequest.newBuilder()
                .putAllDefault(defaultProperties)
                .putAllCustom(customProperties)
                .build());
    }

    @Override
    public ListenableFuture<Empty> deleteIdentity(@NonNull final Session session) {
        return getStub(session).deleteIdentity(Empty.newBuilder().build());
    }

    @Override
    public void disconnect() {
//        this.managedChannel.shutdownNow();
    }

    @Override
    public void disconnect(final long timeout, @NonNull final TimeUnit unit) throws InterruptedException {
//        this.managedChannel.shutdown();
//        this.managedChannel.awaitTermination(timeout, unit);
    }

    @Override
    public ListenableFuture<Properties> listProperties(@NonNull Session session) {
        return getStub(session).listProperties(Empty.newBuilder().build());
    }

    @Override
    public ListenableFuture<Session> identify(@NonNull Session session, @NonNull String id,
            @NonNull Map<String, String> defaultProperties, @NonNull Map<String, String> customProperties) {
//        return convertSession(getStub(session).identify(IdentifyRequest.newBuilder().setId(id).build()));
        return null;
    }


    @Override
    public ListenableFuture<Session> sessionRefresh(Session session) {
//        return convertSession(getStub(session).authenticateRefresh(
//            AuthenticateRefreshRequest.newBuilder().setRefreshToken(session.getRefreshToken()).build()));
        return null;
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

    private final Function<com.heroiclabs.satori.api.Session, Session> convertSession = (input)
            -> new DefaultSession(input.getToken(), input.getRefreshToken());

    private <T extends Message> ListenableFuture<T> post(Session session, Message requestBody, String path, T.Builder responseBuilder) {
        return post(session, requestBody, path, responseBuilder, Function.identity());
    }

    private <T extends Message, O> ListenableFuture<O> post(Session session, Message requestBody, String path, T.Builder responseBuilder, Function<T, O> responseConverter) {
        SettableFuture<O> future = SettableFuture.create();
        String body;
        try {
            body = JsonFormat.printer().print(requestBody);
        } catch (InvalidProtocolBufferException e) {
            future.setException(e);
            return future;
        }
        Request request = request(session).newBuilder()
                .url(url.newBuilder().addPathSegments(path).build())
                .post(RequestBody.create(body, JSON))
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                future.setException(e);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (!response.isSuccessful()) {
                    future.setException(new IOException("Response error: " + response));
                } else {
                    if (response.body() != null) {
                        JsonFormat.parser().ignoringUnknownFields().merge(response.body().string(), responseBuilder);
                    }
                    T protoResponse = (T) responseBuilder.build();
                    future.set(responseConverter.apply(protoResponse));
                }
            }
        });

        return future;
    }

    private <T extends Message> ListenableFuture<T> get(Session session, String path, List<Pair<String, String>> params, T.Builder responseBuilder) {
        SettableFuture<T> future = SettableFuture.create();
        HttpUrl.Builder urlBuilder = url.newBuilder().addPathSegments(path);
        for (Pair<String, String> param : params ) {
            urlBuilder.addEncodedQueryParameter(param.getFirst(), param.getSecond());
        }
        Request request = request(session).newBuilder()
                .url(urlBuilder.build())
                .get()
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                future.setException(e);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (!response.isSuccessful()) {
                    future.setException(new IOException("Response error: " + response));
                } else {
                    if (response.body() != null) {
                        JsonFormat.parser().ignoringUnknownFields().merge(response.body().string(), responseBuilder);
                    }
                    T protoResponse = (T) responseBuilder.build();
                    future.set(protoResponse);
                }
            }
        });

        return future;
    }
}
