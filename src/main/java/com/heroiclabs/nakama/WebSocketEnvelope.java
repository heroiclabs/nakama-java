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

import lombok.Data;

@Data
/**
 * Realtime message envelope.
 */
class WebSocketEnvelope {
    private String cid;
    private WebSocketError error;
    private RpcMessage rpc;
    private Channel channel;
    private ChannelJoinMessage channelJoin;
    private ChannelLeaveMessage channelLeave;
    private ChannelMessage channelMessage;
    private ChannelMessageAck channelMessageAck;
    private ChannelSendMessage channelMessageSend;
    private ChannelUpdateMessage channelMessageUpdate;
    private ChannelRemoveMessage channelRemoveMessage;
    private ChannelPresenceEvent channelPresenceEvent;
    private Match match;
    private MatchCreateMessage matchCreate;
    private MatchData matchData;
    private MatchSendMessage matchDataSend;
    private MatchJoinMessage matchJoin;
    private MatchLeaveMessage matchLeave;
    private MatchPresenceEvent matchPresenceEvent;
    private MatchmakerAddMessage matchmakerAdd;
    private MatchmakerMatched matchmakerMatched;
    private MatchmakerRemoveMessage matchmakerRemove;
    private MatchmakerTicket matchmakerTicket;
    private NotificationList notifications;
    private Status status;
    private StatusFollowMessage statusFollow;
    private StatusPresenceEvent statusPresenceEvent;
    private StatusUnfollowMessage statusUnfollow;
    private StatusUpdateMessage statusUpdate;
    private StreamData streamData;
    private StreamPresenceEvent streamPresenceEvent;
}
