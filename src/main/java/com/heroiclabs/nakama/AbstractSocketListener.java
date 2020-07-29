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

import com.heroiclabs.nakama.api.ChannelMessage;
import com.heroiclabs.nakama.api.NotificationList;

/**
 * A listener for receiving {@code Client} events.
 */
public abstract class AbstractSocketListener implements SocketListener {
    /**
     * Called when the client socket disconnects.
     *
     * Throwable t is set if an error caused the disconnect.
     */
    @Override public void onDisconnect(final Throwable t) {}

    /**
     * Called when the client receives an error.
     *
     * @param error The {@code Error} received.
     */
    @Override public void onError(final Error error) {}

    /**
     * Called when a new topic message has been received.
     *
     * @param message The {@code ChannelMessage} received.
     */
    @Override public void onChannelMessage(final ChannelMessage message) {}

    /**
     * Called when a new topic presence update has been received.
     *
     * @param presence The {@code ChannelPresenceEvent} received.
     */
    @Override public void onChannelPresence(final ChannelPresenceEvent presence) {}

    /**
     * Called when a matchmaking has found a match.
     *
     * @param matched The {@code MatchmakerMatched} received.
     */
    @Override public void onMatchmakerMatched(final MatchmakerMatched matched) {}

    /**
     * Called when a new match data is received.
     *
     * @param matchData The {@code MatchData} received.
     */
    @Override public void onMatchData(final MatchData matchData) {}

    /**
     * Called when a new match presence update is received.
     *
     * @param matchPresence The {@code MatchPresenceEvent} received.
     */
    @Override public void onMatchPresence(final MatchPresenceEvent matchPresence) {}

    /**
     * Called when the client receives new notifications.
     *
     * @param notifications The list of {@code Notification} received.
     */
    @Override public void onNotifications(final NotificationList notifications) {}

    /**
     * Called when the client receives status presence updates.
     *
     * @param presence Updated {@code StatusPresenceEvent} presence.
     */
    @Override public void onStatusPresence(final StatusPresenceEvent presence) {}

    /**
     * Called when the client receives stream presence updates.
     *
     * @param presence Updated {@code StreamPresenceEvent} presence.
     */
    @Override public void onStreamPresence(final StreamPresenceEvent presence) {}

    /**
     * Called when the client receives stream data.
     *
     * @param data Stream {@code StreamData} data received.
     */
    @Override public void onStreamData(final StreamData data) {}
}
