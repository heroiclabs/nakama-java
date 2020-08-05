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

import lombok.*;

import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
/**
 * A batch of join and leave presences on a chat channel.
 */
public class ChannelPresenceEvent {
    /**
     * The unique identifier of the chat channel.
     */
    private String channelId;

    /**
     * The unique identifier of the chat channel.
     */
    private List<UserPresence> joins;

    /**
     * Presences of users who left the channel.
     */
    private List<UserPresence> leaves;

    /**
     * The name of the chat room, or an empty string if this message was not sent through a chat room.
     */
    private String roomName;

    /**
     *  The ID of the group, or an empty string if this message was not sent through a group channel.
     */
    private String groupId;

    /**
     * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
     */
    private String userIdOne;

    /**
     * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
     */
    private String userIdTwo;
}
