/*
 * Copyright 2018 The Nakama Authors
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

import com.google.common.util.concurrent.ListenableFuture;
import com.heroiclabs.nakama.api.Rpc;
import lombok.NonNull;

import java.util.Map;

public interface SocketClient {
    ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final ClientListener listener);
    ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final ClientListener listener, final boolean createStatus);
    ListenableFuture<Boolean> disconnect();

    ListenableFuture<Channel> channelJoin(@NonNull final String target, @NonNull final ChannelType type);
    ListenableFuture<Channel> channelJoin(@NonNull final String target, @NonNull final ChannelType type, boolean persistence);
    ListenableFuture<Channel> channelJoin(@NonNull final String target, @NonNull final ChannelType type, boolean persistence, boolean hidden);

    ListenableFuture<Void> channelLeave(@NonNull final String channelId);

    ListenableFuture<ChannelMessageAck> channelMessageRemove(@NonNull final String channelId, @NonNull final String messageId);

    ListenableFuture<ChannelMessageAck> channelMessageSend(@NonNull final String channelId, @NonNull final String content);

    ListenableFuture<ChannelMessageAck> channelMessageUpdate(@NonNull final String channelId, @NonNull final String messageId, @NonNull final String content);

    ListenableFuture<Match> matchCreate();

    ListenableFuture<Match> matchJoin(@NonNull final String matchId);
    ListenableFuture<Match> matchJoinToken(@NonNull final String token);

    ListenableFuture<Void> matchLeave(@NonNull final String matchId);

    ListenableFuture<MatchmakerTicket> matchmakerAdd();
    ListenableFuture<MatchmakerTicket> matchmakerAdd(final int minCount);
    ListenableFuture<MatchmakerTicket> matchmakerAdd(final int minCount, final int maxCount);
    ListenableFuture<MatchmakerTicket> matchmakerAdd(final int minCount, final int maxCount, final String query);
    ListenableFuture<MatchmakerTicket> matchmakerAdd(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties);
    ListenableFuture<MatchmakerTicket> matchmakerAdd(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties, final Map<String, Double> numericProperties);

    ListenableFuture<Void> matchmakerRemove(@NonNull final String ticket);

    ListenableFuture<Void> matchDataSend(@NonNull final String matchId, @NonNull final String opCode, @NonNull String data);
    ListenableFuture<Void> matchDataSend(@NonNull final String matchId, @NonNull final String opCode, @NonNull String data, UserPresence... presences);

    ListenableFuture<Rpc> rpc(@NonNull final String id);
    ListenableFuture<Rpc> rpc(@NonNull final String id, final String payload);

    ListenableFuture<Status> statusFollow(@NonNull final String... userIds);

    ListenableFuture<Void> statusUnfollow(@NonNull final String... userIds);

    ListenableFuture<Void> statusUpdate(@NonNull final String status);
}
