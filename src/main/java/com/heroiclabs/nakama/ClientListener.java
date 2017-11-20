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

import java.util.List;

/**
 * A listener for receiving {@code Client} events.
 */
public interface ClientListener {
    /**
     * Called when the client socket disconnects.
     */
    void onDisconnect();

    /**
     * Called when a new topic message has been received.
     *
     * @param message The {@code TopicMessage} received.
     */
    void onTopicMessage(TopicMessage message);

    /**
     * Called when a new topic presence update has been received.
     *
     * @param presence The {@code TopicPresence} received.
     */
    void onTopicPresence(TopicPresence presence);

    /**
     * Called when a matchmaking has found a match.
     *
     * @param matched The {@code MatchmakeMatched} received.
     */
    void onMatchmakeMatched(MatchmakeMatched matched);

    /**
     * Called when a new match data is received.
     *
     * @param matchData The {@code MatchData} received.
     */
    void onMatchData(MatchData matchData);

    /**
     * Called when a new match presence update is received.
     *
     * @param matchPresence The {@code MatchPresence} received.
     */
    void onMatchPresence(MatchPresence matchPresence);

    /**
     * Called when the client receives new notifications.
     *
     * @param notifications The list of {@code Notification} received.
     */
    void onNotifications(List<Notification> notifications);
}
