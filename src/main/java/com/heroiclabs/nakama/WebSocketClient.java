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
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.*;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.google.type.Date;
import com.heroiclabs.nakama.api.NotificationList;
import com.heroiclabs.nakama.api.Rpc;
import com.heroiclabs.nakama.rtapi.PartyMatchmakerTicket;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import okio.ByteString;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * WebSocket implementation of Socket interface.
 */
@Slf4j
public class WebSocketClient implements SocketClient {
    private static class ByteArrayToBase64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
        public JsonElement serialize(final byte[] src, final Type typeOfSrc, final JsonSerializationContext context) {
            return new JsonPrimitive(BaseEncoding.base64().encode(src));
        }

        @Override
        public byte[] deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return BaseEncoding.base64().decode(jsonElement.getAsString());
        }
    }

    // The connect, read and write timeout for new connections.
    public static final int DEFAULT_TIMEOUT_MS = 5000;

    // The interval at which to send Ping frames to the server.
    public static final int DEFAULT_PING_MS = 5000;

    static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
            .registerTypeAdapter(Date.class, new GsonDateDeserializer())
            .create();

    private final String host;
    private final int port;
    private final boolean ssl;
    private final boolean trace;
    private final Map<String, SettableFuture<?>> collationIds;
    private final OkHttpClient.Builder clientBuilder;
    private final boolean shouldShutdownListenerThreadExecService;
    private boolean shouldShutdownOkHttpThreadExecService;
    private ExecutorService listenerThreadExec;
    private WebSocket socket;

    WebSocketClient(@NonNull final String host, final int port, final boolean ssl,
                    final int socketTimeoutMs, final int socketPingMs, final boolean trace,
                    ExecutorService listenerThreadExec) {
        this.host = host;
        this.port = port;
        this.ssl = ssl;
        this.trace = trace;
        this.collationIds = new ConcurrentHashMap<>();
        if (listenerThreadExec != null) {
            this.listenerThreadExec = listenerThreadExec;
            this.shouldShutdownListenerThreadExecService = false;
        } else {
            this.listenerThreadExec = Executors.newSingleThreadExecutor();
            this.shouldShutdownListenerThreadExecService = true;
        }

        clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(socketTimeoutMs, TimeUnit.MILLISECONDS)
                .readTimeout(socketTimeoutMs, TimeUnit.MILLISECONDS)
                .writeTimeout(socketTimeoutMs, TimeUnit.MILLISECONDS)
                .pingInterval(socketPingMs, TimeUnit.SECONDS);

        this.shouldShutdownOkHttpThreadExecService = true;
        clientBuilder.setDispatcher$okhttp(new Dispatcher());
    }

    WebSocketClient(@NonNull final String host, final int port, final boolean ssl,
                    final int socketTimeoutMs, final int socketPingMs, final boolean trace,
                    ExecutorService listenerThreadExec, @NonNull ExecutorService okHttpThreadExec, final int maxNumConcurrentRequests) {
        this(host, port, ssl, socketTimeoutMs, socketPingMs, trace, listenerThreadExec);
        this.shouldShutdownOkHttpThreadExecService = false;
        Dispatcher dispatcher = new Dispatcher(okHttpThreadExec);
        dispatcher.setMaxRequests(maxNumConcurrentRequests);
        clientBuilder.setDispatcher$okhttp(dispatcher);
    }

    @Override
    public ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final SocketListener listener) {
        return connect(session, listener, false);
    }

    @Override
    public ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final SocketListener listener, final boolean createStatus) {
        if (socket != null) {
            return Futures.immediateFailedFuture(new DefaultError("Socket is already connected"));
        }

        final String url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath("/ws")
                .addQueryParameter("token", session.getAuthToken())
                .addQueryParameter("status", Boolean.toString(createStatus))
                .build()
                .toString()
                .replaceFirst("http", "ws");

        final Request request = new Request.Builder()
                .url(url)
                .build();

        if (trace) {
            log.debug("Connect: " + request.toString());
        }

        return createWebsocket(session, listener, request);
    }

    private ListenableFuture<Session> createWebsocket(@NonNull final Session session, @NonNull final SocketListener listener, @NonNull final Request request) {
        if (this.listenerThreadExec == null || this.listenerThreadExec.isShutdown()) {
            // in case of previously closed/failed socket.
            this.listenerThreadExec = Executors.newSingleThreadExecutor();
        }

        final SettableFuture<Session> connectFuture = SettableFuture.create();
        if (clientBuilder.getDispatcher$okhttp().executorService().isShutdown()) {
            if (this.shouldShutdownOkHttpThreadExecService) {
                // in case we are managing the OkHttpExecService, and it was previously shutdown, then recreate it before creating the client.
                clientBuilder.setDispatcher$okhttp(new Dispatcher());
            } else {
                connectFuture.setException(new Throwable("websocket dispatcher thread executing has been previously shutdown."));
                return connectFuture;
            }
        }

        final Object lock = this;
        final OkHttpClient client = clientBuilder.build();
        socket = client.newWebSocket(request, new WebSocketListener() {
            @Override
            public void onOpen(final WebSocket webSocket, final Response response) {
                super.onOpen(webSocket, response);
                // Notify the deferred caller that the client has connected and is ready to use.
                connectFuture.set(session);
            }

            @Override
            public void onMessage(final WebSocket webSocket, final ByteString bytes) {
                super.onMessage(webSocket, bytes);
                // No binary messages are expected.
                log.warn("Unexpected binary message from server: " + bytes.base64());
            }

            @Override
            public void onMessage(final WebSocket webSocket, final String text) {
                super.onMessage(webSocket, text);

                final WebSocketEnvelope env;
                try {
                    env = GSON.fromJson(text, WebSocketEnvelope.class);
                } catch (final JsonSyntaxException e) {
                    log.error("Error decoding incoming message from server: " + e.getMessage());
                    return;
                }

                final String collationId = env.getCid();
                if (collationId == null || "".equals(collationId)) {
                    listenerThreadExec.execute(new Runnable() {
                        @Override
                        public void run() {
                            if (env.getError() != null) {
                                listener.onError(new DefaultError(collationId, env.getError()));
                            } else if (env.getChannelMessage() != null) {
                                final ChannelMessage m = env.getChannelMessage();
                                final com.heroiclabs.nakama.api.ChannelMessage.Builder builder = com.heroiclabs.nakama.api.ChannelMessage.newBuilder();
                                if (m.getMessageId() != null) {
                                    builder.setMessageId(m.getMessageId());
                                }
                                if (m.getSenderId() != null) {
                                    builder.setSenderId(m.getSenderId());
                                }
                                if (m.getChannelId() != null) {
                                    builder.setChannelId(m.getChannelId());
                                }
                                if (m.getUsername() != null) {
                                    builder.setUsername(m.getUsername());
                                }
                                if (m.getContent() != null) {
                                    builder.setContent(m.getContent());
                                }
                                if (m.getCreateTime() != null) {
                                    builder.setCreateTime(Timestamp.newBuilder().setSeconds(m.getCreateTime().getTime() / 1000).build());
                                }
                                if (m.getUpdateTime() != null) {
                                    builder.setUpdateTime(Timestamp.newBuilder().setSeconds(m.getUpdateTime().getTime() / 1000).build());
                                }
                                builder.setPersistent(BoolValue.newBuilder().setValue(m.isPersistent()).getDefaultInstanceForType());
                                builder.setCode(Int32Value.newBuilder().setValue(m.getCode()).build());
                                listener.onChannelMessage(builder.build());
                            } else if (env.getChannelPresenceEvent() != null) {
                                listener.onChannelPresence(env.getChannelPresenceEvent());
                            } else if (env.getMatchData() != null) {
                                listener.onMatchData(env.getMatchData());
                            } else if (env.getMatchPresenceEvent() != null) {
                                listener.onMatchPresence(env.getMatchPresenceEvent());
                            } else if (env.getMatchmakerMatched() != null) {
                                listener.onMatchmakerMatched(env.getMatchmakerMatched());
                            } else if (env.getNotifications() != null) {
                                final NotificationList.Builder resultBuilder = NotificationList.newBuilder();
                                for (final Notification n : env.getNotifications().getNotifications()) {
                                    final com.heroiclabs.nakama.api.Notification.Builder builder = com.heroiclabs.nakama.api.Notification.newBuilder();
                                    if (n.getContent() != null) {
                                        builder.setContent(n.getContent());
                                    }
                                    if (n.getId() != null) {
                                        builder.setId(n.getId());
                                    }
                                    if (n.getSenderId() != null) {
                                        builder.setSenderId(n.getSenderId());
                                    }
                                    if (n.getSubject() != null) {
                                        builder.setSubject(n.getSubject());
                                    }
                                    if (n.getCreateTime() != null) {
                                        builder.setCreateTime(Timestamp.newBuilder().setSeconds(n.getCreateTime().getTime() / 1000).build());
                                    }
                                    builder.setCode(n.getCode());
                                    builder.setPersistent(n.isPersistent());

                                    resultBuilder.addNotifications(builder.build());
                                }
                                listener.onNotifications(resultBuilder.build());
                            } else if (env.getStatusPresenceEvent() != null) {
                                listener.onStatusPresence(env.getStatusPresenceEvent());
                            } else if (env.getStreamData() != null) {
                                listener.onStreamData(env.getStreamData());
                            } else if (env.getStreamPresenceEvent() != null) {
                                listener.onStreamPresence(env.getStreamPresenceEvent());
                            } else if (env.getPartyPresenceEvent() != null) {
                                listener.onPartyPresence(env.getPartyPresenceEvent());
                            } else if (env.getPartyData() != null) {
                                listener.onPartyData(env.getPartyData());
                            } else {
                                log.error("Unrecognised incoming uncollated message from server: " + env.toString());
                            }
                        }
                    });
                } else {
                    final SettableFuture cidFuture = collationIds.remove(collationId);
                    if (cidFuture == null) {
                        log.warn("No matching future for incoming collation ID: " + collationId);
                        return;
                    }

                    if (env.getError() != null) {
                        cidFuture.setException(new DefaultError(collationId, env.getError()));
                    } else if (env.getRpc() != null) {
                        final com.heroiclabs.nakama.api.Rpc.Builder apiRpcBuilder = com.heroiclabs.nakama.api.Rpc.newBuilder();
                        if (env.getRpc().getId() != null) {
                            apiRpcBuilder.setId(env.getRpc().getId());
                        }
                        if (env.getRpc().getPayload() != null) {
                            apiRpcBuilder.setPayload(env.getRpc().getPayload());
                        }
                        cidFuture.set(apiRpcBuilder.build());
                    } else if (env.getChannel() != null) {
                        cidFuture.set(env.getChannel());
                    } else if (env.getChannelMessageAck() != null) {
                        cidFuture.set(env.getChannelMessageAck());
                    } else if (env.getMatch() != null) {
                        cidFuture.set(env.getMatch());
                    } else if (env.getMatchmakerTicket() != null) {
                        cidFuture.set(env.getMatchmakerTicket());
                    } else if (env.getStatus() != null) {
                        cidFuture.set(env.getStatus());
                    } else if (env.getParty() != null) {
                        cidFuture.set(env.getParty());
                    } else if (env.getPartyJoinRequest() != null) {
                        cidFuture.set(env.getPartyJoinRequest());
                    } else if (env.getPartyMatchmakerTicket() != null) {
                        cidFuture.set(env.getPartyMatchmakerTicket());
                    } else {
                        cidFuture.set(null);
                    }
                }
            }

            @Override
            public void onClosing(final WebSocket webSocket, final int code, final String reason) {
                super.onClosing(webSocket, code, reason);
                // No action needed here.
            }

            @Override
            public void onClosed(final WebSocket webSocket, final int code, final String reason) {
                super.onClosed(webSocket, code, reason);
                listener.onDisconnect(null);

                // Graceful socket disconnect is complete, clean up.
                synchronized (lock) {
                    socket.cancel();
                    socket = null;
                    collationIds.clear();

                    if (!connectFuture.isCancelled() && !connectFuture.isDone()) {
                        connectFuture.setException(new Throwable("Socket closed."));
                    }

                    if (shouldShutdownListenerThreadExecService) {
                        listenerThreadExec.shutdown();
                    }

                    // clean up OkHttp Websocket resources.
                    client.connectionPool().evictAll();
                    if (shouldShutdownOkHttpThreadExecService) {
                        client.dispatcher().executorService().shutdown();
                    }
                }
            }

            @Override
            public void onFailure(final WebSocket webSocket, final Throwable t, final Response response) {
                super.onFailure(webSocket, t, response);
                listener.onDisconnect(t);
                // Socket has failed and is no longer connected, clean up.
                synchronized (lock) {
                    socket.cancel();
                    socket = null;
                    collationIds.clear();

                    if (!connectFuture.isCancelled() && !connectFuture.isDone()) {
                        connectFuture.setException(t);
                    }

                    if (shouldShutdownListenerThreadExecService) {
                        listenerThreadExec.shutdown();
                    }

                    // clean up OkHttp Websocket resources.
                    client.connectionPool().evictAll();
                    if (shouldShutdownOkHttpThreadExecService) {
                        client.dispatcher().executorService().shutdown();
                    }
                }
            }
        });
        return connectFuture;
    }

    @Override
    public synchronized ListenableFuture<Boolean> disconnect() {
        if (socket != null) {
            // Returns true if a shutdown was initiated, false if already shutting down or disconnected.
            // Either result is acceptable here.
            // Socket reference will be set to null when disconnect is completed.
            // Don't nullify the socket at this stage as we'll need to have the OnClose called.
            socket.close(1000, null);
        }
        return Futures.immediateFuture(true);
    }

    @Override
    public synchronized void disconnectSocket() {
        if (socket != null) {
            // Returns true if a shutdown was initiated, false if already shutting down or disconnected.
            // Either result is acceptable here.
            // Socket reference will be set to null when disconnect is completed.
            // Don't nullify the socket at this stage as we'll need to have the OnClose called.
            socket.close(1000, null);
        }
    }

    @Override
    public ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type) {
        final ChannelJoinMessage msg = new ChannelJoinMessage(target, type.getValue());

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type, final boolean persistence) {
        final ChannelJoinMessage msg = new ChannelJoinMessage(target, type.getValue());
        msg.setPersistence(persistence);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type, final boolean persistence, final boolean hidden) {
        final ChannelJoinMessage msg = new ChannelJoinMessage(target, type.getValue());
        msg.setPersistence(persistence);
        msg.setHidden(hidden);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> leaveChat(@NonNull final String channelId) {
        final ChannelLeaveMessage msg = new ChannelLeaveMessage(channelId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelLeave(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<ChannelMessageAck> removeChatMessage(@NonNull final String channelId, @NonNull final String messageId) {
        final ChannelRemoveMessage msg = new ChannelRemoveMessage(channelId, messageId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelRemoveMessage(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<ChannelMessageAck> writeChatMessage(@NonNull final String channelId, @NonNull final String content) {
        final ChannelSendMessage msg = new ChannelSendMessage(channelId, content);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelMessageSend(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<ChannelMessageAck> updateChatMessage(@NonNull final String channelId, @NonNull final String messageId, @NonNull final String content) {
        final ChannelUpdateMessage msg = new ChannelUpdateMessage(channelId, messageId, content);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setChannelMessageUpdate(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Match> createMatch() {
        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchCreate(new MatchCreateMessage());
        return send(env);
    }

    @Override
    public ListenableFuture<Match> joinMatch(@NonNull final String matchId) {
        final MatchJoinMessage msg = new MatchJoinMessage();
        msg.setMatchId(matchId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Match> joinMatch(String matchId, Map<String, String> metadata) {
        final MatchJoinMessage msg = new MatchJoinMessage();
        msg.setMatchId(matchId);
        msg.setMetadata(metadata);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchJoin(msg);

        return send(env);
    }

    @Override
    public ListenableFuture<Match> joinMatchToken(@NonNull final String token) {
        final MatchJoinMessage msg = new MatchJoinMessage();
        msg.setToken(token);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> leaveMatch(@NonNull final String matchId) {
        final MatchLeaveMessage msg = new MatchLeaveMessage(matchId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchLeave(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker() {
        return addMatchmaker(0, 0, null, null, null);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount) {
        return addMatchmaker(minCount, minCount, null, null, null);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount) {
        return addMatchmaker(minCount, maxCount, null, null, null);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query) {
        return addMatchmaker(minCount, maxCount, query, null, null);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties) {
        return addMatchmaker(minCount, maxCount, query, stringProperties, null);
    }

    @Override
    public ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties, final Map<String, Double> numericProperties) {
        final MatchmakerAddMessage msg = new MatchmakerAddMessage();
        if (minCount > 0) {
            msg.setMinCount(minCount);
        }
        if (maxCount > 0) {
            msg.setMaxCount(maxCount);
        }
        if (query != null) {
            msg.setQuery(query);
        }
        if (stringProperties != null) {
            msg.setStringProperties(stringProperties);
        }
        if (numericProperties != null) {
            msg.setNumericProperties(numericProperties);
        }

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchmakerAdd(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> removeMatchmaker(@NonNull final String ticket) {
        final MatchmakerRemoveMessage msg = new MatchmakerRemoveMessage(ticket);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchmakerRemove(msg);
        return send(env);
    }

    @Override
    public void sendMatchData(@NonNull final String matchId, final long opCode, @NonNull final byte[] data) {
        sendMatchData(matchId, opCode, data, new UserPresence[]{});
    }

    @Override
    public void sendMatchData(@NonNull final String matchId, final long opCode, @NonNull final byte[] data, final UserPresence... presences) {
        final MatchSendMessage msg = new MatchSendMessage(matchId, opCode, data);
        if (presences != null) {
            msg.setPresences(Arrays.asList(presences));
        }

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setMatchDataSend(msg);
        sendAsync(env);
    }

    @Override
    public ListenableFuture<Rpc> rpc(@NonNull final String id) {
        return rpc(id, null);
    }

    @Override
    public ListenableFuture<Rpc> rpc(@NonNull final String id, final String payload) {
        final RpcMessage message = new RpcMessage();
        message.setId(id);
        if (payload != null) {
            message.setPayload(payload);
        }

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setRpc(message);
        return send(env);
    }

    @Override
    public ListenableFuture<Status> followUsers(@NonNull final String... userIds) {
        final StatusFollowMessage message = new StatusFollowMessage(Arrays.asList(userIds), null);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setStatusFollow(message);
        return send(env);
    }

    @Override
    public ListenableFuture<Status> followUsers(final List<String> userIds, @NonNull final String... usernames) {
        final StatusFollowMessage message = new StatusFollowMessage(userIds, Arrays.asList(usernames));

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setStatusFollow(message);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> unfollowUsers(@NonNull final String... userIds) {
        final StatusUnfollowMessage message = new StatusUnfollowMessage(Arrays.asList(userIds));

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setStatusUnfollow(message);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> updateStatus(final String status) {
        final StatusUpdateMessage message = new StatusUpdateMessage(status);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setStatusUpdate(message);
        return send(env);
    }

    @Override
    public ListenableFuture<Party> createParty(boolean open, int maxSize) {
        final PartyCreateMessage msg = new PartyCreateMessage();
        msg.setOpen(open);
        msg.setMaxSize(maxSize);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyCreate(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> joinParty(@NonNull String partyId) {
        final PartyJoinMessage msg = new PartyJoinMessage();
        msg.setPartyId(partyId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyJoin(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> leaveParty(@NonNull String partyId) {
        final PartyLeaveMessage msg = new PartyLeaveMessage();
        msg.setPartyId(partyId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyLeave(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> promoteParty(@NonNull String partyId, UserPresence userPresence) {
        final PartyPromoteMessage msg = new PartyPromoteMessage();
        msg.setPartyId(partyId);
        msg.setPresence(userPresence);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyPromote(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> acceptParty(@NonNull String partyId, UserPresence userPresence) {
        final PartyAcceptMessage msg = new PartyAcceptMessage();
        msg.setPartyId(partyId);
        msg.setPresence(userPresence);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyAccept(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> removeParty(@NonNull String partyId, UserPresence userPresence) {
        final PartyRemoveMessage msg = new PartyRemoveMessage();
        msg.setPartyId(partyId);
        msg.setPresence(userPresence);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyRemove(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Party> closeParty(@NonNull String partyId) {
        final PartyCloseMessage msg = new PartyCloseMessage();
        msg.setPartyId(partyId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyClose(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<PartyJoinRequest> listPartyJoinRequest(@NonNull String partyId) {
        final PartyJoinRequestListMessage msg = new PartyJoinRequestListMessage();
        msg.setPartyId(partyId);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyJoinRequestList(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<PartyMatchmakerTicket> addPartyMatchmaker(@NonNull String partyId, int minCount, int maxCount, @NonNull String query, Map<String, String> stringProperties, Map<String, Double> numericProperties, int countMultiple) {
        final PartyMatchmakerAddMessage msg = new PartyMatchmakerAddMessage();
        msg.setPartyId(partyId);
        msg.setMaxCount(minCount);
        msg.setMaxCount(maxCount);
        msg.setQuery(query);
        msg.setStringProperties(stringProperties);
        msg.setNumericProperties(numericProperties);
        msg.setCountMultiple(countMultiple);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyMatchmakerAdd(msg);
        return send(env);
    }

    @Override
    public ListenableFuture<Void> removePartyMatchmaker(@NonNull String partyId, @NonNull String ticket) {
        final PartyMatchmakerRemoveMessage msg = new PartyMatchmakerRemoveMessage();
        msg.setPartyId(partyId);
        msg.setTicket(ticket);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyMatchmakerRemove(msg);
        return send(env);
    }

    @Override
    public void sendPartyData(@NonNull String partyId, int opCode, @NonNull byte[] data) {
        final PartyDataSendMessage msg = new PartyDataSendMessage(partyId, opCode, data);

        final WebSocketEnvelope env = new WebSocketEnvelope();
        env.setPartyDataSend(msg);
        sendAsync(env);
    }

    private void sendAsync(@NonNull final WebSocketEnvelope webSocketEnvelope) {
        if (socket == null) {
            throw new RuntimeException(new DefaultError("Socket is not connected."));
        }

        final boolean enqueued = socket.send(GSON.toJson(webSocketEnvelope));
        if (!enqueued) {
            throw new RuntimeException(new DefaultError("Could not enqueue message - is the socket connected?"));
        }
    }

    private <T> ListenableFuture<T> send(@NonNull final WebSocketEnvelope webSocketEnvelope) {
        if (socket == null) {
            return Futures.immediateFailedFuture(new DefaultError("Socket is not connected."));
        }

        final SettableFuture<T> future = SettableFuture.create();
        final String collationId = UUID.randomUUID().toString();
        webSocketEnvelope.setCid(collationId);
        collationIds.put(collationId, future);

        final boolean enqueued = socket.send(GSON.toJson(webSocketEnvelope));
        if (!enqueued) {
            future.setException(new DefaultError("Could not enqueue message - is the socket connected?"));
        }
        return future;
    }
}
