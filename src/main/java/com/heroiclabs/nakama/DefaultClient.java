/*
 * Copyright 2020 The Nakama Authors
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

package com.heroiclabs.nakama;

import com.google.common.io.BaseEncoding;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.*;
import com.heroiclabs.nakama.api.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.stub.MetadataUtils;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import lombok.var;

import javax.annotation.Nonnegative;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DefaultClient implements Client {
    private static final String USERAGENT = "nakama-java-client";

    private final String host;
    private final int port;
    private final boolean ssl;

    private final int deadlineAfterMs;
    private final boolean trace;

    private final ManagedChannel managedChannel;
    private final NakamaGrpc.NakamaFutureStub stub;
    private final Metadata basicAuthMetadata;

    /**
     * A client to interact with Nakama server.
     * @param serverKey The key used to authenticate with the server without a session. Defaults to "defaultkey".
     */
    public DefaultClient(@NonNull final String serverKey) {
        this(serverKey, "127.0.0.1", 7349, false);
    }

    /**
     * A client to interact with Nakama server.
     * @param serverKey The key used to authenticate with the server without a session. Defaults to "defaultkey".
     * @param host The host address of the server. Defaults to "127.0.0.1".
     * @param port The port number of the server. Defaults to 7349.
     * @param ssl Set connection strings to use the secure mode with the server. Defaults to false. The server must be configured to make use of this option. With HTTP, GRPC, and WebSockets the server must
     * be configured with an SSL certificate or use a load balancer which performs SSL termination. For rUDP you
     * must configure the server to expose it's IP address so it can be bundled within session tokens. See the
     * server documentation for more information.
     */
    public DefaultClient(@NonNull final String serverKey, @NonNull final String host, final int port, final boolean ssl) {
        this(serverKey, host, port, ssl, 0, Long.MAX_VALUE, 0L, false);
    }

    /**
     * A client to interact with Nakama server.
     * @param serverKey The key used to authenticate with the server without a session. Defaults to "defaultkey".
     * @param host The host address of the server. Defaults to "127.0.0.1".
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
    public DefaultClient(@NonNull final String serverKey, @NonNull final String host, final int port, final boolean ssl,
                         final int deadlineAfterMs, final long keepAliveTimeMs, final long keepAliveTimeoutMs,  final boolean trace) {
        this.host = host;
        this.port = port;
        this.ssl = ssl;
        this.deadlineAfterMs = deadlineAfterMs;
        this.trace = trace;

        // TODO investigate executor
        // TODO investigate disconnect errors
        ManagedChannelBuilder builder = OkHttpChannelBuilder
                .forAddress(host, port)
                .userAgent(USERAGENT);

        builder = ssl ? builder.useTransportSecurity() : builder.usePlaintext();
        builder = keepAliveTimeMs < Long.MAX_VALUE ? builder.keepAliveTime(keepAliveTimeMs, TimeUnit.MILLISECONDS) : builder;
        builder = keepAliveTimeoutMs > 0L ? builder.keepAliveTimeout(keepAliveTimeoutMs, TimeUnit.MILLISECONDS) : builder;
        this.managedChannel = builder.build();
        this.stub = NakamaGrpc.newFutureStub(this.managedChannel);

        final String base64Auth = BaseEncoding.base64().encode((serverKey + ":").getBytes());
        final String basicAuth = "Basic " + base64Auth;
        this.basicAuthMetadata = new Metadata();
        basicAuthMetadata.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), basicAuth);
    }

    private NakamaGrpc.NakamaFutureStub getStub() {
        return getStub(null);
    }

    private NakamaGrpc.NakamaFutureStub getStub(final Session session) {
        Metadata metadata = this.basicAuthMetadata;
        if (session != null) {
            metadata = new Metadata();
            metadata.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + session.getAuthToken());
        }

        NakamaGrpc.NakamaFutureStub newStub = MetadataUtils.attachHeaders(this.stub, metadata);
        if (this.deadlineAfterMs > 0) {
            newStub = newStub.withDeadlineAfter(deadlineAfterMs, TimeUnit.MILLISECONDS);
        }

        return newStub;
    }

    private ListenableFuture<Session> convertSession(final ListenableFuture<com.heroiclabs.nakama.api.Session> future) {
      return Futures.transformAsync(future, new AsyncFunction<com.heroiclabs.nakama.api.Session, Session>() {
          @Override
          public ListenableFuture<Session> apply(@Nullable final com.heroiclabs.nakama.api.Session input) {
              final Session result = new DefaultSession(input.getToken(), input.getCreated());
              return Futures.immediateFuture(result);
          }
      }, MoreExecutors.directExecutor());
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

    public SocketClient createSocket() {
        return createSocket(7350);
    }

    @Override
    public SocketClient createSocket(final int port) {
        return createSocket(port, WebSocketClient.DEFAULT_TIMEOUT_MS, WebSocketClient.DEFAULT_PING_MS);
    }

    @Override
    public SocketClient createSocket(final String host, final int port) {
        return createSocket(host, port, ssl);
    }

    @Override
    public SocketClient createSocket(final int port, final int socketTimeoutMs) {
        return new WebSocketClient(host, port, ssl, socketTimeoutMs, WebSocketClient.DEFAULT_PING_MS, this.trace);
    }

    @Override
    public SocketClient createSocket(final String host, final int port, final boolean ssl) {
        return new WebSocketClient(host, port, ssl, WebSocketClient.DEFAULT_TIMEOUT_MS, WebSocketClient.DEFAULT_PING_MS, this.trace);
    }

    @Override
    public SocketClient createSocket(final String host, final int port, final boolean ssl, final int socketTimeoutMs) {
        return new WebSocketClient(host, port, ssl, socketTimeoutMs, WebSocketClient.DEFAULT_PING_MS, this.trace);
    }

    @Override
    public SocketClient createSocket(final String host, final int port, final boolean ssl, final int socketTimeoutMs, final int socketPingMs) {
        return new WebSocketClient(host, port, ssl, socketTimeoutMs, socketPingMs, this.trace);
    }

    @Override
    public ListenableFuture<Empty> addFriends(@NonNull final Session session, @NonNull final String... ids) {
        return getStub(session).addFriends(AddFriendsRequest.newBuilder().addAllIds(Arrays.asList(ids)).build());
    }

    @Override
    public ListenableFuture<Empty> addFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames) {
        final var builder = AddFriendsRequest.newBuilder();
        if (ids != null) {
            builder.addAllIds(ids);
        }
        if (usernames != null) {
            builder.addAllUsernames(Arrays.asList(usernames));
        }
        return getStub(session).addFriends(builder.build());
    }

    @Override
    public ListenableFuture<Empty> addGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids) {
        return getStub(session).addGroupUsers(AddGroupUsersRequest.newBuilder()
                .setGroupId(groupId)
                .addAllUserIds(Arrays.asList(ids))
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .setId(id)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final Map<String, String> vars) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .putAllVars(vars)
                        .setId(id)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final String username) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .setId(id)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .setId(id)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create, @NonNull final String username) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .setId(id)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateCustom(AuthenticateCustomRequest.newBuilder()
                .setAccount(AccountCustom.newBuilder()
                        .putAllVars(vars)
                        .setId(id)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateCustom(@NonNull final AuthenticateCustomRequest request) {
        return convertSession(getStub().authenticateCustom(request));
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .setId(id)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final Map<String, String> vars) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .putAllVars(vars)
                        .setId(id)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final String username) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .setId(id)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .setId(id)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create, @NonNull final String username) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .setId(id)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateDevice(AuthenticateDeviceRequest.newBuilder()
                .setAccount(AccountDevice.newBuilder()
                        .putAllVars(vars)
                        .setId(id)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateDevice(@NonNull final AuthenticateDeviceRequest request) {
        return convertSession(getStub().authenticateDevice(request));
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final Map<String, String> vars) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .putAllVars(vars)
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final String username) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create, @NonNull final String username) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateEmail(AuthenticateEmailRequest.newBuilder()
                .setAccount(AccountEmail.newBuilder()
                        .putAllVars(vars)
                        .setEmail(email)
                        .setPassword(password)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateEmail(@NonNull final AuthenticateEmailRequest request) {
        return convertSession(getStub().authenticateEmail(request));
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .setToken(accessToken)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final Map<String, String> vars) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .putAllVars(vars)
                        .setToken(accessToken)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final String username) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, @NonNull final String username) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, @NonNull final String username, final boolean importFriends) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .setSync(BoolValue.newBuilder().setValue(importFriends).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, final String username, final boolean importFriends, @NonNull final Map<String, String> vars) {
        return authenticateFacebook(AuthenticateFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder()
                        .putAllVars(vars)
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .setSync(BoolValue.newBuilder().setValue(importFriends).build())
                .build());
    }

    private ListenableFuture<Session> authenticateFacebook(@NonNull final AuthenticateFacebookRequest request) {
        return convertSession(getStub().authenticateFacebook(request));
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .setToken(accessToken)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final Map<String, String> vars) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .putAllVars(vars)
                        .setToken(accessToken)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final String username) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create, @NonNull final String username) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateGoogle(AuthenticateGoogleRequest.newBuilder()
                .setAccount(AccountGoogle.newBuilder()
                        .putAllVars(vars)
                        .setToken(accessToken)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateGoogle(@NonNull final AuthenticateGoogleRequest request) {
        return convertSession(getStub().authenticateGoogle(request));
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .setToken(token)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final Map<String, String> vars) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .putAllVars(vars)
                        .setToken(token)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final String username) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .setToken(token)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .setToken(token)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create, @NonNull final String username) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .setToken(token)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateSteam(AuthenticateSteamRequest.newBuilder()
                .setAccount(AccountSteam.newBuilder()
                        .putAllVars(vars)
                        .setToken(token)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateSteam(@NonNull final AuthenticateSteamRequest request) {
        return convertSession(getStub().authenticateSteam(request));
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final  String playerId, @NonNull final  String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final Map<String, String> vars) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .putAllVars(vars)
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final String username) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .setUsername(username)
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create, @NonNull final String username) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    @Override
    public ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create, final String username, @NonNull final Map<String, String> vars) {
        return authenticateGameCenter(AuthenticateGameCenterRequest.newBuilder()
                .setAccount(AccountGameCenter.newBuilder()
                        .putAllVars(vars)
                        .setPlayerId(playerId)
                        .setBundleId(bundleId)
                        .setTimestampSeconds(timestampSeconds)
                        .setSalt(salt)
                        .setPublicKeyUrl(publicKeyUrl)
                        .build())
                .setUsername(username)
                .setCreate(BoolValue.newBuilder().setValue(create).build())
                .build());
    }

    private ListenableFuture<Session> authenticateGameCenter(@NonNull final AuthenticateGameCenterRequest request) {
        return convertSession(getStub().authenticateGameCenter(request));
    }

    @Override
    public ListenableFuture<Empty> banGroupUsers(@NonNull final Session session, @NonNull String groupId, @NonNull final String... ids) {
        return getStub(session).banGroupUsers(BanGroupUsersRequest.newBuilder().setGroupId(groupId).addAllUserIds(Arrays.asList(ids)).build());
    }

    @Override
    public ListenableFuture<Empty> blockFriends(@NonNull final Session session, @NonNull final String... ids) {
        return getStub(session).blockFriends(BlockFriendsRequest.newBuilder().addAllIds(Arrays.asList(ids)).build());
    }

    @Override
    public ListenableFuture<Empty> blockFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames) {
        final var builder = BlockFriendsRequest.newBuilder();
        if (ids != null) {
            builder.addAllIds(ids);
        }
        if (usernames != null) {
            builder.addAllUsernames(Arrays.asList(usernames));
        }
        return getStub(session).blockFriends(builder.build());
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name) {
        return createGroup(session, name, null, null, null);
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description) {
        return createGroup(session, name, description, null, null);
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl) {
        return createGroup(session, name, description, avatarUrl, null);
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag) {
        final var builder = CreateGroupRequest.newBuilder().setName(name);

        if (description != null) {
            builder.setDescription(description);
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(avatarUrl);
        }
        if (langTag != null) {
            builder.setLangTag(langTag);
        }

        return getStub(session).createGroup(builder.build());
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag, final boolean open) {
        final var builder = CreateGroupRequest.newBuilder().setName(name).setOpen(open);

        if (description != null) {
            builder.setDescription(description);
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(avatarUrl);
        }
        if (langTag != null) {
            builder.setLangTag(langTag);
        }

        return getStub(session).createGroup(builder.build());
    }

    @Override
    public ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag, final boolean open, final int maxCount) {
        final var builder = CreateGroupRequest.newBuilder().setName(name).setOpen(open);

        if (description != null) {
            builder.setDescription(description);
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(avatarUrl);
        }
        if (langTag != null) {
            builder.setLangTag(langTag);
        }
        if (maxCount > 0) {
            builder.setMaxCount(maxCount);
        }

        return getStub(session).createGroup(builder.build());
    }

    @Override
    public ListenableFuture<Empty> deleteFriends(@NonNull final Session session, @NonNull final String... ids) {
        return getStub(session).deleteFriends(DeleteFriendsRequest.newBuilder().addAllIds(Arrays.asList(ids)).build());
    }

    @Override
    public ListenableFuture<Empty> deleteFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames) {
        final var builder = DeleteFriendsRequest.newBuilder();
        if (ids != null) {
            builder.addAllIds(ids);
        }
        if (usernames != null) {
            builder.addAllUsernames(Arrays.asList(usernames));
        }
        return getStub(session).deleteFriends(builder.build());
    }

    @Override
    public ListenableFuture<Empty> deleteGroup(@NonNull final Session session, @NonNull final String groupId) {
        return getStub(session).deleteGroup(DeleteGroupRequest.newBuilder().setGroupId(groupId).build());
    }

    @Override
    public ListenableFuture<Empty> deleteLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId) {
        return getStub(session).deleteLeaderboardRecord(DeleteLeaderboardRecordRequest.newBuilder().setLeaderboardId(leaderboardId).build());
    }

    @Override
    public ListenableFuture<Empty> deleteNotifications(@NonNull final Session session, @NonNull final String... notificationIds) {
        return getStub(session).deleteNotifications(DeleteNotificationsRequest.newBuilder().addAllIds(Arrays.asList(notificationIds)).build());
    }

    @Override
    public ListenableFuture<Empty> deleteStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds) {
        final DeleteStorageObjectsRequest.Builder builder = DeleteStorageObjectsRequest.newBuilder();
        for (final StorageObjectId id : objectIds) {
            final DeleteStorageObjectId.Builder b = DeleteStorageObjectId.newBuilder()
                    .setCollection(id.getCollection());

            if (id.getKey() != null) {
                b.setKey(id.getKey());
            }

            if (id.getVersion() != null) {
                b.setVersion(id.getVersion());
            }

            builder.addObjectIds(b.build());
        }
        return getStub(session).deleteStorageObjects(builder.build());
    }

    @Override
    public ListenableFuture<Empty> emitEvent(@NonNull final Session session, @NonNull final String name, @NonNull final Map<String, String> properties) {
        return getStub(session).event(Event.newBuilder().setName(name).putAllProperties(properties).build());
    }

    @Override
    public ListenableFuture<Account> getAccount(@NonNull final Session session) {
        return getStub(session).getAccount(Empty.getDefaultInstance());
    }

    @Override
    public ListenableFuture<Users> getUsers(@NonNull final Session session, @NonNull final String... ids) {
        final var builder = GetUsersRequest.newBuilder().addAllIds(Arrays.asList(ids));
        return getStub(session).getUsers(builder.build());
    }

    @Override
    public ListenableFuture<Users> getUsers(@NonNull final Session session, final Iterable<String> ids, final String... usernames) {
        final var builder = GetUsersRequest.newBuilder();
        if (ids != null) {
            builder.addAllIds(ids);
        }
        if (usernames != null) {
            builder.addAllUsernames(Arrays.asList(usernames));
        }
        return getStub(session).getUsers(builder.build());
    }

    @Override
    public ListenableFuture<Users> getUsers(@NonNull final Session session, final Iterable<String> ids, final Iterable<String> usernames, final String... facebookIds) {
        final var builder = GetUsersRequest.newBuilder();
        if (ids != null) {
            builder.addAllIds(ids);
        }
        if (usernames != null) {
            builder.addAllUsernames(usernames);
        }
        if (facebookIds != null) {
            builder.addAllFacebookIds(Arrays.asList(facebookIds));
        }
        return getStub(session).getUsers(builder.build());
    }

    @Override
    public ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token) {
        return getStub(session).importFacebookFriends(ImportFacebookFriendsRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder().setToken(token).build())
                .build());
    }

    @Override
    public ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token, final boolean reset) {
        return getStub(session).importFacebookFriends(ImportFacebookFriendsRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder().setToken(token).build())
                .setReset(BoolValue.newBuilder().setValue(reset).getDefaultInstanceForType())
                .build());
    }

    @Override
    public ListenableFuture<Empty> joinGroup(@NonNull final Session session, @NonNull final String groupId) {
        return getStub(session).joinGroup(JoinGroupRequest.newBuilder().setGroupId(groupId).build());
    }

    @Override
    public ListenableFuture<Empty> joinTournament(@NonNull final Session session, @NonNull final String tournamentId) {
        return getStub(session).joinTournament(JoinTournamentRequest.newBuilder().setTournamentId(tournamentId).build());
    }

    @Override
    public ListenableFuture<Empty> kickGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids) {
        return getStub(session).kickGroupUsers(KickGroupUsersRequest.newBuilder()
                .setGroupId(groupId)
                .addAllUserIds(Arrays.asList(ids))
                .build());
    }

    @Override
    public ListenableFuture<Empty> leaveGroup(@NonNull final Session session, @NonNull final String groupId) {
        return getStub(session).leaveGroup(LeaveGroupRequest.newBuilder().setGroupId(groupId).build());
    }

    @Override
    public ListenableFuture<Empty> linkCustom(@NonNull final Session session, @NonNull final String id) {
        return getStub(session).linkCustom(AccountCustom.newBuilder().setId(id).build());
    }

    @Override
    public ListenableFuture<Empty> linkDevice(@NonNull final Session session, @NonNull final String id) {
        return getStub(session).linkDevice(AccountDevice.newBuilder().setId(id).build());
    }

    @Override
    public ListenableFuture<Empty> linkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password) {
        return getStub(session).linkEmail(AccountEmail.newBuilder().setEmail(email).setPassword(password).build());
    }

    @Override
    public ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken) {
        return getStub(session).linkFacebook(LinkFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder().setToken(accessToken).build())
                .build());
    }

    @Override
    public ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken, final boolean importFriends) {
        return getStub(session).linkFacebook(LinkFacebookRequest.newBuilder()
                .setAccount(AccountFacebook.newBuilder().setToken(accessToken).build())
                .setSync(BoolValue.newBuilder().setValue(importFriends).build())
                .build());
    }

    @Override
    public ListenableFuture<Empty> linkGoogle(@NonNull final Session session, @NonNull final String accessToken) {
        return getStub(session).linkGoogle(AccountGoogle.newBuilder().setToken(accessToken).build());
    }

    @Override
    public ListenableFuture<Empty> linkSteam(@NonNull final Session session, @NonNull final String token) {
        return getStub(session).linkSteam(AccountSteam.newBuilder().setToken(token).build());
    }

    @Override
    public ListenableFuture<Empty> linkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl) {
        return getStub(session).linkGameCenter(AccountGameCenter.newBuilder()
                .setPlayerId(playerId)
                .setBundleId(bundleId)
                .setTimestampSeconds(timestampSeconds)
                .setSalt(salt)
                .setSignature(signature)
                .setPublicKeyUrl(publicKeyUrl)
                .build());
    }

    @Override
    public ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId) {
        return listChannelMessages(session, channelId, 0, null);
    }

    @Override
    public ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit) {
        return listChannelMessages(session, channelId, limit, null);
    }

    @Override
    public ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit, final String cursor) {
        final var builder = ListChannelMessagesRequest.newBuilder().setChannelId(channelId);
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listChannelMessages(builder.build());
    }

    @Override
    public ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit, final String cursor, final boolean forward) {
        final var builder = ListChannelMessagesRequest.newBuilder().setChannelId(channelId);
        builder.setForward(BoolValue.newBuilder().setValue(forward).getDefaultInstanceForType());
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listChannelMessages(builder.build());
    }

    @Override
    public ListenableFuture<FriendList> listFriends(@NonNull final Session session) {
        return getStub(session).listFriends(ListFriendsRequest.newBuilder().build());
    }

    @Override
    public ListenableFuture<FriendList> listFriends(@NonNull final Session session, final int state, final int limit, final String cursor) {
        final var builder = ListFriendsRequest.newBuilder();

        if (state > -1) {
            builder.setState(Int32Value.newBuilder().setValue(state).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }

        return getStub(session).listFriends(builder.build());
    }

    @Override
    public ListenableFuture<GroupUserList> listGroupUsers(@NonNull final Session session, @NonNull final String groupId) {
        return getStub(session).listGroupUsers(ListGroupUsersRequest.newBuilder().setGroupId(groupId).build());
    }

    @Override
    public ListenableFuture<GroupUserList> listGroupUsers(@NonNull final Session session, @NonNull final String groupId, final int state, final int limit, final String cursor) {
        final var builder = ListGroupUsersRequest.newBuilder();

        if (state > -1) {
            builder.setState(Int32Value.newBuilder().setValue(state).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }

        return getStub(session).listGroupUsers(builder.build());
    }

    @Override
    public ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name) {
        return listGroups(session, name, 0, null);
    }

    @Override
    public ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name, final int limit) {
        return listGroups(session, name, limit, null);
    }

    @Override
    public ListenableFuture<GroupList> listGroups(@NonNull final Session session, final String name, final int limit, final String cursor) {
        final var builder = ListGroupsRequest.newBuilder();
        if (name != null) {
            builder.setName(name);
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listGroups(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId) {
        return listLeaderboardRecords(session, leaderboardId, null, -1, 0, null);
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final String... ownerIds) {
        return listLeaderboardRecords(session, leaderboardId, Arrays.asList(ownerIds), -1, 0, null);
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds, final int expiry) {
        return listLeaderboardRecords(session, leaderboardId, ownerIds, expiry, 0, null);
    }

    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds, final int expiry, final int limit) {
        return listLeaderboardRecords(session, leaderboardId, ownerIds, expiry, limit, null);
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds, final int expiry, final int limit, final String cursor) {
        final var builder = ListLeaderboardRecordsRequest.newBuilder().setLeaderboardId(leaderboardId);
        if (ownerIds != null) {
            builder.addAllOwnerIds(ownerIds);
        }
        if (expiry > 0) {
            builder.setExpiry(Int64Value.newBuilder().setValue(expiry).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listLeaderboardRecords(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, final String ownerId) {
        return listLeaderboardRecordsAroundOwner(session, leaderboardId, ownerId, -1, 0);
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, final String ownerId, final int expiry) {
        return listLeaderboardRecordsAroundOwner(session, leaderboardId, ownerId, expiry, 0);
    }

    @Override
    public ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, final String ownerId, final int expiry, final int limit) {
        final var builder = ListLeaderboardRecordsAroundOwnerRequest.newBuilder().setLeaderboardId(leaderboardId).setOwnerId(ownerId);
        if (expiry > 0) {
            builder.setExpiry(Int64Value.newBuilder().setValue(expiry).build());
        }
        if (limit > 0) {
            builder.setLimit(UInt32Value.newBuilder().setValue(limit).build());
        }
        return getStub(session).listLeaderboardRecordsAroundOwner(builder.build());
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session) {
        return listMatches(session, -1, -1, 0, null);
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min) {
        return listMatches(session, min, -1, 0, null);
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max) {
        return listMatches(session, min, max, 0, null);
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit) {
        return listMatches(session, min, max, limit, null);
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit, final String label) {
        final var builder = ListMatchesRequest.newBuilder();
        if (min >= 0) {
            builder.setMinSize(Int32Value.newBuilder().setValue(min).build());
        }
        if (max >= 0) {
            builder.setMaxSize(Int32Value.newBuilder().setValue(max).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (label != null) {
            builder.setLabel(StringValue.newBuilder().setValue(label).build());
        }
        return getStub(session).listMatches(builder.build());
    }

    @Override
    public ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit, final String label, final boolean authoritative) {
        final var builder = ListMatchesRequest.newBuilder();
        if (min >= 0) {
            builder.setMinSize(Int32Value.newBuilder().setValue(min).build());
        }
        if (max >= 0) {
            builder.setMaxSize(Int32Value.newBuilder().setValue(max).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (label != null) {
            builder.setLabel(StringValue.newBuilder().setValue(label).build());
        }
        builder.setAuthoritative(BoolValue.newBuilder().setValue(authoritative).build());
        return getStub(session).listMatches(builder.build());
    }

    @Override
    public ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session) {
        return listNotifications(session, 0, null);
    }

    @Override
    public ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, final int limit) {
        return listNotifications(session, limit, null);
    }

    @Override
    public ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, final int limit, final String cacheableCursor) {
        final var builder = ListNotificationsRequest.newBuilder();
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cacheableCursor != null) {
            builder.setCacheableCursor(cacheableCursor);
        }
        return getStub(session).listNotifications(builder.build());
    }

    @Override
    public ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection) {
        return listStorageObjects(session, collection, 0, null);
    }

    @Override
    public ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, final int limit) {
        return listStorageObjects(session, collection, limit, null);
    }

    @Override
    public ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, final int limit, final String cursor) {
        return listUsersStorageObjects(session, collection, null, 0, null);
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session) {
        return getStub(session).listTournaments(ListTournamentsRequest.newBuilder().build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int limit, final String cursor) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();
        if (categoryStart >= 0) {
            builder.setCategoryStart(UInt32Value.newBuilder().setValue(categoryStart).build());
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();

        if (categoryStart >= 0) {
            builder.setCategoryStart(UInt32Value.newBuilder().setValue(categoryStart).build());
        }
        if (categoryEnd >= 0) {
            builder.setCategoryEnd(UInt32Value.newBuilder().setValue(categoryEnd).build());
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();

        if (categoryStart >= 0) {
            builder.setCategoryStart(UInt32Value.newBuilder().setValue(categoryStart).build());
        }
        if (categoryEnd >= 0) {
            builder.setCategoryEnd(UInt32Value.newBuilder().setValue(categoryEnd).build());
        }
        if (startTime >= 0) {
            builder.setStartTime(UInt32Value.newBuilder().setValue((int) startTime).build());
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime, final long endTime) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();

        if (categoryStart >= 0) {
            builder.setCategoryStart(UInt32Value.newBuilder().setValue(categoryStart).build());
        }
        if (categoryEnd >= 0) {
            builder.setCategoryEnd(UInt32Value.newBuilder().setValue(categoryEnd).build());
        }
        if (startTime >= 0) {
            builder.setStartTime(UInt32Value.newBuilder().setValue((int) startTime).build());
        }
        if (endTime >= 0) {
            builder.setEndTime(UInt32Value.newBuilder().setValue((int) endTime).build());
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime, final long endTime, final int limit, final String cursor) {
        ListTournamentsRequest.Builder builder = ListTournamentsRequest.newBuilder();
        if (categoryStart >= 0) {
            builder.setCategoryStart(UInt32Value.newBuilder().setValue(categoryStart).build());
        }
        if (categoryEnd >= 0) {
            builder.setCategoryEnd(UInt32Value.newBuilder().setValue(categoryEnd).build());
        }
        if (startTime >= 0) {
            builder.setStartTime(UInt32Value.newBuilder().setValue((int) startTime).build());
        }
        if (endTime >= 0) {
            builder.setEndTime(UInt32Value.newBuilder().setValue((int) endTime).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listTournaments(builder.build());
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId) {
        return listTournamentRecords(session, tournamentId, -1, 0, null);
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry) {
        return listTournamentRecords(session, tournamentId, expiry, 0, null);
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit) {
        return listTournamentRecords(session, tournamentId, expiry, limit, null);
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit, final String cursor) {
        ListTournamentRecordsRequest.Builder builder = ListTournamentRecordsRequest.newBuilder().setTournamentId(tournamentId);
        if (expiry > 0) {
            builder.setExpiry(Int64Value.newBuilder().setValue(expiry).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listTournamentRecords(builder.build());
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, @NonNull final String... ownerIds) {
        ListTournamentRecordsRequest.Builder builder = ListTournamentRecordsRequest.newBuilder().setTournamentId(tournamentId);
        if (ownerIds != null) {
            builder.addAllOwnerIds(Arrays.asList(ownerIds));
        }
        return getStub(session).listTournamentRecords(builder.build());
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit, final String cursor, @NonNull final String... ownerIds) {
        ListTournamentRecordsRequest.Builder builder = ListTournamentRecordsRequest.newBuilder().setTournamentId(tournamentId);
        if (ownerIds != null) {
            builder.addAllOwnerIds(Arrays.asList(ownerIds));
        }
        if (expiry > 0) {
            builder.setExpiry(Int64Value.newBuilder().setValue(expiry).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listTournamentRecords(builder.build());
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, final String ownerId) {
        return listTournamentRecordsAroundOwner(session, tournamentId, ownerId, -1, 0);
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, final String ownerId, final int expiry) {
        return listTournamentRecordsAroundOwner(session, tournamentId, ownerId, expiry, 0);
    }

    @Override
    public ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, final String ownerId, final int expiry, final int limit) {
        final var builder = ListTournamentRecordsAroundOwnerRequest.newBuilder().setTournamentId(tournamentId).setOwnerId(ownerId);
        if (expiry > 0) {
            builder.setExpiry(Int64Value.newBuilder().setValue(expiry).build());
        }
        if (limit > 0) {
            builder.setLimit(UInt32Value.newBuilder().setValue(limit).build());
        }
        return getStub(session).listTournamentRecordsAroundOwner(builder.build());
    }

    @Override
    public ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session) {
        return listUserGroups(session, null);
    }

    @Override
    public ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session, final String userId) {
        final var builder = ListUserGroupsRequest.newBuilder();
        if (userId != null) {
            builder.setUserId(userId);
        }
        return getStub(session).listUserGroups(builder.build());
    }

    @Override
    public ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session, final String userId, int state, int limit, String cursor) {
        final var builder = ListUserGroupsRequest.newBuilder();

        if (state > -1) {
            builder.setState(Int32Value.newBuilder().setValue(state).build());
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }

        return getStub(session).listUserGroups(builder.build());
    }

    @Override
    public ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId) {
        return listUsersStorageObjects(session, collection, userId, 0, null);
    }

    @Override
    public ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId, final int limit) {
        return listUsersStorageObjects(session, collection, userId, limit, null);
    }

    @Override
    public ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId, final int limit, final String cursor) {
        final var builder = ListStorageObjectsRequest.newBuilder().setCollection(collection);
        if (userId != null) {
            builder.setUserId(userId);
        }
        if (limit > 0) {
            builder.setLimit(Int32Value.newBuilder().setValue(limit).build());
        }
        if (cursor != null) {
            builder.setCursor(cursor);
        }
        return getStub(session).listStorageObjects(builder.build());
    }

    @Override
    public ListenableFuture<Empty> promoteGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids) {
        final var userIds = Arrays.asList(ids);
        return getStub(session).promoteGroupUsers(PromoteGroupUsersRequest.newBuilder().setGroupId(groupId).addAllUserIds(userIds).build());
    }

    @Override
    public ListenableFuture<StorageObjects> readStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds) {
        final ReadStorageObjectsRequest.Builder builder = ReadStorageObjectsRequest.newBuilder();
        for (@NonNull final StorageObjectId id : objectIds) {
            final ReadStorageObjectId.Builder b = ReadStorageObjectId.newBuilder()
                    .setCollection(id.getCollection());

            if (id.getKey() != null) {
                b.setKey(id.getKey());
            }

            if (id.getUserId() != null) {
                b.setUserId(id.getUserId());
            }

            builder.addObjectIds(b.build());
        }
        return getStub(session).readStorageObjects(builder.build());
    }

    @Override
    public ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id) {
        return rpc(session, id, null);
    }

    @Override
    public ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id, final String payload) {
        final var builder = Rpc.newBuilder().setId(id);
        if (payload != null) {
            builder.setPayload(payload);
        }
        return getStub(session).rpcFunc(builder.build());
    }

    @Override
    public ListenableFuture<Empty> unlinkCustom(@NonNull final Session session, @NonNull final String id) {
        return getStub(session).unlinkCustom(AccountCustom.newBuilder().setId(id).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkDevice(@NonNull final Session session, @NonNull final String id) {
        return getStub(session).unlinkDevice(AccountDevice.newBuilder().setId(id).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password) {
        return getStub(session).unlinkEmail(AccountEmail.newBuilder().setEmail(email).setPassword(password).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkFacebook(@NonNull final Session session, @NonNull final String accessToken) {
        return getStub(session).unlinkFacebook(AccountFacebook.newBuilder().setToken(accessToken).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkGoogle(@NonNull final Session session, @NonNull final String accessToken) {
        return getStub(session).unlinkGoogle(AccountGoogle.newBuilder().setToken(accessToken).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkSteam(@NonNull final Session session, @NonNull final String token) {
        return getStub(session).unlinkSteam(AccountSteam.newBuilder().setToken(token).build());
    }

    @Override
    public ListenableFuture<Empty> unlinkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl) {
        return getStub(session).unlinkGameCenter(AccountGameCenter.newBuilder()
                .setPlayerId(playerId)
                .setBundleId(bundleId)
                .setTimestampSeconds(timestampSeconds)
                .setSalt(salt)
                .setSignature(signature)
                .setPublicKeyUrl(publicKeyUrl)
                .build());
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username) {
        return updateAccount(session, username, null, null, null, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName) {
        return updateAccount(session, username, displayName, null, null, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl) {
        return updateAccount(session, username, displayName, avatarUrl, null, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag) {
        return updateAccount(session, username, displayName, avatarUrl, langTag, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag, final String location) {
        return updateAccount(session, username, displayName, avatarUrl, langTag, location, null);
    }

    @Override
    public ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag, final String location, final String timezone) {
        final var builder = UpdateAccountRequest.newBuilder();
        if (username != null) {
            builder.setUsername(StringValue.newBuilder().setValue(username).build());
        }
        if (displayName != null) {
            builder.setDisplayName(StringValue.newBuilder().setValue(displayName).build());
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(StringValue.newBuilder().setValue(avatarUrl).build());
        }
        if (langTag != null) {
            builder.setLangTag(StringValue.newBuilder().setValue(langTag).build());
        }
        if (location != null) {
            builder.setLocation(StringValue.newBuilder().setValue(location).build());
        }
        if (timezone != null) {
            builder.setTimezone(StringValue.newBuilder().setValue(timezone).build());
        }
        return getStub(session).updateAccount(builder.build());
    }

    @Override
    public ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name) {
        return updateGroup(session, groupId, name, null, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description) {
        return updateGroup(session, groupId, name, description, null, null);
    }

    @Override
    public ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl) {
        return updateGroup(session, groupId, name, description, avatarUrl, null);
    }

    @Override
    public ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl, final String langTag) {
        final var builder = UpdateGroupRequest.newBuilder().setGroupId(groupId);
        if (name != null) {
            builder.setName(StringValue.newBuilder().setValue(name).build());
        }
        if (description != null) {
            builder.setDescription(StringValue.newBuilder().setValue(description).build());
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(StringValue.newBuilder().setValue(avatarUrl).build());
        }
        if (langTag != null) {
            builder.setLangTag(StringValue.newBuilder().setValue(langTag).build());
        }
        return getStub(session).updateGroup(builder.build());
    }

    @Override
    public ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl, final String langTag, final boolean open) {
        final var builder = UpdateGroupRequest.newBuilder().setGroupId(groupId);
        if (name != null) {
            builder.setName(StringValue.newBuilder().setValue(name).build());
        }
        if (description != null) {
            builder.setDescription(StringValue.newBuilder().setValue(description).build());
        }
        if (avatarUrl != null) {
            builder.setAvatarUrl(StringValue.newBuilder().setValue(avatarUrl).build());
        }
        if (langTag != null) {
            builder.setLangTag(StringValue.newBuilder().setValue(langTag).build());
        }
        builder.setOpen(BoolValue.newBuilder().setValue(open).build());
        return getStub(session).updateGroup(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score) {
        final var builder = WriteLeaderboardRecordRequest.newBuilder().setLeaderboardId(leaderboardId);
        final var recordBuilder = WriteLeaderboardRecordRequest.LeaderboardRecordWrite.newBuilder().setScore(score);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeLeaderboardRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final long subscore) {
        final var builder = WriteLeaderboardRecordRequest.newBuilder().setLeaderboardId(leaderboardId);
        final var recordBuilder = WriteLeaderboardRecordRequest.LeaderboardRecordWrite.newBuilder()
                .setScore(score)
                .setSubscore(subscore);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeLeaderboardRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final String metadata) {
        final var builder = WriteLeaderboardRecordRequest.newBuilder().setLeaderboardId(leaderboardId);
        final var recordBuilder = WriteLeaderboardRecordRequest.LeaderboardRecordWrite.newBuilder()
                .setScore(score)
                .setMetadata(metadata);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeLeaderboardRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final long subscore, final String metadata) {
        final var builder = WriteLeaderboardRecordRequest.newBuilder().setLeaderboardId(leaderboardId);
        final var recordBuilder = WriteLeaderboardRecordRequest.LeaderboardRecordWrite.newBuilder()
                .setScore(score)
                .setSubscore(subscore)
                .setMetadata(metadata);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeLeaderboardRecord(builder.build());
    }

    @Override
    public ListenableFuture<StorageObjectAcks> writeStorageObjects(@NonNull final Session session, @NonNull final StorageObjectWrite... objects) {
        final WriteStorageObjectsRequest.Builder builder = WriteStorageObjectsRequest.newBuilder();
        for (@NonNull final StorageObjectWrite object : objects) {
            final WriteStorageObject.Builder b = WriteStorageObject.newBuilder()
                    .setCollection(object.getCollection())
                    .setKey(object.getKey())
                    .setValue(object.getValue());

            if (object.getVersion() != null) {
                b.setVersion(object.getVersion());
            }

            if (object.getPermissionRead() != null) {
                b.setPermissionRead(Int32Value.newBuilder().setValue(object.getPermissionRead().getValue()).build());
            }

            if (object.getPermissionWrite() != null) {
                b.setPermissionWrite(Int32Value.newBuilder().setValue(object.getPermissionWrite().getValue()).build());
            }
            builder.addObjects(b);
        }
        return getStub(session).writeStorageObjects(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score) {
        final var builder = WriteTournamentRecordRequest.newBuilder().setTournamentId(tournamentId);
        final var recordBuilder = WriteTournamentRecordRequest.TournamentRecordWrite.newBuilder().setScore(score);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeTournamentRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, final long subscore) {
        final var builder = WriteTournamentRecordRequest.newBuilder().setTournamentId(tournamentId);
        final var recordBuilder = WriteTournamentRecordRequest.TournamentRecordWrite.newBuilder()
                .setScore(score)
                .setSubscore(subscore);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeTournamentRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, @NonNull final String metadata) {
        final var builder = WriteTournamentRecordRequest.newBuilder().setTournamentId(tournamentId);
        final var recordBuilder = WriteTournamentRecordRequest.TournamentRecordWrite.newBuilder()
                .setScore(score)
                .setMetadata(metadata);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeTournamentRecord(builder.build());
    }

    @Override
    public ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, final long subscore, @NonNull final String metadata) {
        final var builder = WriteTournamentRecordRequest.newBuilder().setTournamentId(tournamentId);
        final var recordBuilder = WriteTournamentRecordRequest.TournamentRecordWrite.newBuilder()
                .setScore(score)
                .setSubscore(subscore)
                .setMetadata(metadata);
        builder.setRecord(recordBuilder.build());
        return getStub(session).writeTournamentRecord(builder.build());
    }
}
