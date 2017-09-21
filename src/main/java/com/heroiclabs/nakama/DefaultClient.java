/*
 * Copyright 2017 The Nakama Authors
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

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stumbleupon.async.Deferred;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import okio.ByteString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DefaultClient implements Client {

    static final Gson GSON = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private final String serverKey;
    private final String host;
    private final int port;
    private final String lang;

    private final boolean ssl;
    private final int connectTimeout;
    private final int timeout;

    private final boolean trace;

    private final ClientListener listener;

    private final TopicListener topicListener;

    private final MatchListener matchListener;

    private final Map<String, Deferred> collationIds;

    private final OkHttpClient client;
    private WebSocket socket;

    private long serverTime;

    private DefaultClient(final String serverKey, final String host, final int port, final String lang,
                          final boolean ssl, final int connectTimeout, final int timeout, final boolean trace,
                          final ClientListener listener, final TopicListener topicListener, final MatchListener matchListener) {
        this.host = host;
        this.port = port;
        this.serverKey = serverKey;
        this.lang = lang;
        this.ssl = ssl;
        this.connectTimeout = connectTimeout;
        this.timeout = timeout;
        this.trace = trace;
        this.listener = listener;
        this.topicListener = topicListener;
        this.matchListener = matchListener;

        collationIds = new ConcurrentHashMap<>();

        client = new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
                .readTimeout(timeout, TimeUnit.MILLISECONDS)
                .writeTimeout(timeout, TimeUnit.MILLISECONDS)
                .build();
    }

    @Override
    public long serverTime() {
        return serverTime != 0 ? serverTime : System.currentTimeMillis();
    }

    @Override
    public Deferred<Session> login(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/login");
    }

    @Override
    public Deferred<Session> register(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/register");
    }

    private Deferred<Session> authenticate(final AuthenticateMessage auth, final String path) {
        final Deferred<Session> deferred = new Deferred<>();

        final byte[] payload = auth.asBytes(UUID.randomUUID().toString());

        final HttpUrl url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath(path)
                .build();

        final Request request = new Request.Builder()
                .url(url)
                .method("POST", RequestBody.create(MediaType.parse("application/octet-stream;"), payload))
                .header("Authorization", "Basic " + ByteString.of((serverKey + ":").getBytes()).base64())
                .header("Accept-Language", lang)
                .header("User-Agent", "nakama-java/0.1.0") // TODO set user-agent based on build version.
                .build();

        if (trace) {
            log.debug("Authenticate request: " + request.toString());
        }

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                deferred.callback(new DefaultError("Error sending message to server", Error.ErrorCode.UNKNOWN));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final ResponseBody body = response.body();
                if (body == null) {
                    deferred.callback(new DefaultError("Error in response body from server", Error.ErrorCode.UNKNOWN));
                    return;
                }
                final com.heroiclabs.nakama.Api.AuthenticateResponse authResponse;
                try {
                    authResponse = com.heroiclabs.nakama.Api.AuthenticateResponse.parseFrom(body.byteStream());
                } catch (IOException e) {
                    deferred.callback(new DefaultError("Error reading response from server", Error.ErrorCode.UNKNOWN));
                    return;
                } finally {
                    response.close();
                }

                if (trace) {
                    log.debug("Authenticate response: " + response.toString());
                }

                switch (authResponse.getIdCase()) {
                    case ERROR:
                        deferred.callback(new DefaultError(authResponse.getError().getMessage(), authResponse.getError().getCode()));
                        break;
                    case SESSION:
                        deferred.callback(DefaultSession.restore(authResponse.getSession().getToken()));
                        break;
                    default:
                        deferred.callback(new DefaultError("Unknown response format from server", Error.ErrorCode.UNKNOWN));
                        break;
                }
            }
        });

        return deferred;
    }

    @Override
    public synchronized Deferred<Session> connect(final @NonNull Session session) {
        final Deferred<Session> deferred = new Deferred<>();

        if (socket != null) {
            deferred.callback(new DefaultError("Client is already connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final String url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath("/api")
                .addQueryParameter("token", session.getToken())
                .addQueryParameter("lang", lang)
                .build()
                .toString()
                .replaceFirst("http", "ws");

        final Request request = new Request.Builder()
                .url(url)
                .build();

        if (trace) {
            log.debug("Connect: " + request.toString());
        }

        final Object lock = this;
        socket = client.newWebSocket(request, new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                super.onOpen(webSocket, response);
                // Notify the deferred caller that the client has connected and is ready to use.
                deferred.callback(session);
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                super.onMessage(webSocket, text);
                // No text messages are expected.
                log.warn("Unexpected string message from server: " + text);
            }

            @Override
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                super.onMessage(webSocket, bytes);

                final com.heroiclabs.nakama.Api.Envelope envelope;
                try {
                    envelope = com.heroiclabs.nakama.Api.Envelope.parseFrom(bytes.toByteArray());
                } catch (IOException e) {
                    // TODO onError callback
                    log.error("Error decoding incoming message from server: " + e.getMessage());
                    return;
                }

                final String collationId = envelope.getCollationId();
                if (collationId == null) {
                    switch (envelope.getPayloadCase()) {
                        case PAYLOAD_NOT_SET:
                            log.error("No payload in incoming uncollated message from server: " + envelope.toString());
                            break;
                        case HEARTBEAT:
                            final long newServerTime = envelope.getHeartbeat().getTimestamp();
                            if (newServerTime > serverTime) {
                                // Don't let server time go backwards.
                                serverTime = newServerTime;
                            }
                            break;
                        case TOPIC_MESSAGE:
                            if (topicListener != null) {
                                topicListener.onTopicMessage(DefaultTopicMessage.fromProto(envelope.getTopicMessage()));
                            }
                            break;
                        case TOPIC_PRESENCE:
                            if (topicListener != null) {
                                topicListener.onTopicPresence(DefaultTopicPresence.fromProto(envelope.getTopicPresence()));
                            }
                            break;
                        case MATCH_DATA:
                            if (matchListener != null) {
                                matchListener.onMatchData(DefaultMatchData.fromProto(envelope.getMatchData()));
                            }
                            break;
                        case MATCH_PRESENCE:
                            if (matchListener != null) {
                                matchListener.onMatchPresence(DefaultMatchPresence.fromProto(envelope.getMatchPresence()));
                            }
                            break;
                        case MATCHMAKE_MATCHED:
                            if (matchListener != null) {
                                matchListener.onMatchmakeMatched(DefaultMatchmakeMatched.fromProto(envelope.getMatchmakeMatched()));
                            }
                            break;
                        default:
                            break;
                    }
                    return;
                }

                final Deferred def = collationIds.get(collationId);
                if (def == null) {
                    log.warn("No matching deferred receiver for incoming collation ID: " + collationId);
                    return;
                }

                switch (envelope.getPayloadCase()) {
                    case PAYLOAD_NOT_SET:
                        def.callback(Boolean.TRUE);
                        break;
                    case ERROR:
                        def.callback(new DefaultError(envelope.getError().getMessage(), envelope.getError().getCode()));
                        break;
                    case SELF:
                        def.callback(DefaultSelf.fromProto(envelope.getSelf().getSelf()));
                        break;
                    case USERS:
                        final List<User> users = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.User user : envelope.getUsers().getUsersList()) {
                            users.add(DefaultUser.fromProto(user));
                        }
                        def.callback(new DefaultResultSet<User>(null, users));
                        break;
                    case STORAGE_DATA:
                        final List<StorageRecord> records = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.TStorageData.StorageData data : envelope.getStorageData().getDataList()) {
                            records.add(DefaultStorageRecord.fromProto(data));
                        }
                        Cursor cursor = null;
                        if (envelope.getStorageData().getCursor() != null && envelope.getStorageData().getCursor().size() > 0) {
                            cursor = new DefaultCursor(envelope.getStorageData().getCursor().toByteArray());
                        }
                        def.callback(new DefaultResultSet<StorageRecord>(cursor, records));
                        break;
                    case STORAGE_KEYS:
                        final List<RecordId> recordIds = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.TStorageKeys.StorageKey key : envelope.getStorageKeys().getKeysList()) {
                            recordIds.add(DefaultRecordId.fromProto(key));
                        }
                        def.callback(new DefaultResultSet<RecordId>(null, recordIds));
                        break;
                    case RPC:
                        def.callback(DefaultRpcResult.fromProto(envelope.getRpc()));
                        break;
                    case TOPICS:
                        final List<Topic> topics = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.TTopics.Topic topic : envelope.getTopics().getTopicsList()) {
                            topics.add(DefaultTopic.fromProto(topic));
                        }
                        def.callback(new DefaultResultSet<Topic>(null, topics));
                        break;
                    case TOPIC_MESSAGE_ACK:
                        def.callback(DefaultTopicMessageAck.fromProto(envelope.getTopicMessageAck()));
                        break;
                    case TOPIC_MESSAGES:
                        final List<TopicMessage> messages = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.TopicMessage m : envelope.getTopicMessages().getMessagesList()) {
                            messages.add(DefaultTopicMessage.fromProto(m));
                        }
                        def.callback(new DefaultResultSet<TopicMessage>(new DefaultCursor(envelope.getTopicMessages().getCursor().toByteArray()), messages));
                        break;
                    case MATCH:
                        def.callback(DefaultMatch.fromProto(envelope.getMatch()));
                    case MATCHES:
                        final List<Match> matches = new ArrayList<>();
                        for (final com.heroiclabs.nakama.Api.Match m : envelope.getMatches().getMatchesList()) {
                            matches.add(DefaultMatch.fromProto(m));
                        }
                        def.callback(new DefaultResultSet<Match>(null, matches));
                        break;
                    case MATCHMAKE_TICKET:
                        def.callback(DefaultMatchmakeTicket.fromProto(envelope.getMatchmakeTicket()));
                    default:
                        def.callback(new DefaultError(envelope.getError().getMessage(), envelope.getError().getCode()));
                        break;
                }
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                super.onClosing(webSocket, code, reason);
                // No action needed here.
            }

            @Override
            public void onClosed(WebSocket webSocket, int code, String reason) {
                super.onClosed(webSocket, code, reason);
                // Graceful socket disconnect is complete, clean up.
                synchronized (lock) {
                    socket = null;
                    // TODO callback any leftover deferred items with a disconnect error message?
                    collationIds.clear();
                }
                if (listener != null) {
                    listener.onDisconnect();
                }
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                super.onFailure(webSocket, t, response);
                // Socket has failed and is no longer connected, clean up.
                synchronized (lock) {
                    socket = null;
                    // TODO callback any leftover deferred items with a disconnect error message?
                    collationIds.clear();
                }
                if (listener != null) {
                    listener.onDisconnect();
                }
            }
        });

        return deferred;
    }

    @Override
    public synchronized Deferred<Boolean> disconnect() {
        final Deferred<Boolean> deferred = new Deferred<>();

        if (socket != null) {
            // Returns true if a shutdown was initiated, false if already shutting down or disconnected.
            // Either result is acceptable here.
            // Socket reference will be set to null when disconnect is completed.
            socket.close(1000, null);
        }

        deferred.callback(Boolean.TRUE);
        return deferred;
    }

    @Override
    public Deferred<Boolean> logout() {
        return send(LogoutMessage.Builder.build());
    }

    @Override
    public <T> Deferred<T> send(final @NonNull CollatedMessage<T> message) {
        final Deferred<T> deferred = new Deferred<>();

        if (socket == null) {
            deferred.callback(new DefaultError("Client is not connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final String collationId = UUID.randomUUID().toString();
        final byte[] payload = message.asBytes(collationId);

        final boolean isEnqueued = socket.send(ByteString.of(payload));
        if (!isEnqueued) {
            deferred.callback(new DefaultError("Failed to send message, make sure the client is connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        collationIds.put(collationId, deferred);
        return deferred;
    }

    @Override
    public Deferred<Boolean> send(final @NonNull Message message) {
        final Deferred<Boolean> deferred = new Deferred<>();

        if (socket == null) {
            deferred.callback(new DefaultError("Client is not connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final byte[] payload = message.asBytes();

        final boolean isEnqueued = socket.send(ByteString.of(payload));
        if (!isEnqueued) {
            deferred.callback(new DefaultError("Failed to send message, make sure the client is connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        deferred.callback(Boolean.TRUE);
        return deferred;
    }

    public static Client defaults(String serverKey) {
        return builder(serverKey).build();
    }

    public static Builder builder(String serverKey) {
        return new Builder(serverKey);
    }

    @RequiredArgsConstructor
    public static class Builder {
        private final @NonNull String serverKey;
        private String host = "127.0.0.1";
        private int port = 7350;
        private String lang = "en";
        private boolean ssl = false;
        private int connectTimeout = 3000;
        private int timeout = 5000;
        private boolean trace = false;
        private ClientListener listener;
        private TopicListener topicListener;
        private MatchListener matchListener;

        public Client build() {
            return new DefaultClient(serverKey, host, port, lang, ssl, connectTimeout, timeout, trace, listener, topicListener, matchListener);
        }

        public Builder host(final @NonNull String host) {
            this.host = host;
            return this;
        }

        public Builder port(final int port) {
            this.port = port;
            return this;
        }

        public Builder lang(final @NonNull String lang) {
            this.lang = lang;
            return this;
        }

        public Builder ssl(final boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder connectTimeout(final int connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder timeout(final int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder trace(final boolean trace) {
            this.trace = trace;
            return this;
        }

        public Builder listener(final ClientListener listener) {
            this.listener = listener;
            return this;
        }

        public Builder topicListener(final TopicListener topicListener) {
            this.topicListener = topicListener;
            return this;
        }

        public Builder matchListener(final MatchListener matchListener) {
            this.matchListener = matchListener;
            return this;
        }
    }
}
