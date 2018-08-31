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

import com.heroiclabs.nakama.api.ChannelMessage;
import com.heroiclabs.nakama.api.NotificationList;

/**
 * A listener for receiving {@code Client} events.
 */
public abstract class AbstractClientListener implements ClientListener {
    @Override public void onDisconnect() {}
    @Override public void onChannelMessage(final ChannelMessage message) {}
    @Override public void onChannelPresence(final ChannelPresenceEvent presence) {}
    @Override public void onMatchmakeMatched(final MatchmakerMatched matched) {}
    @Override public void onMatchData(final MatchData matchData) {}
    @Override public void onMatchPresence(final MatchPresenceEvent matchPresence) {}
    @Override public void onNotifications(final NotificationList notifications) {}
    @Override public void onStatusPresence(final StatusPresenceEvent presence) {}
    @Override public void onStreamPresence(final StreamPresenceEvent presence) {}
    @Override public void onStreamData(final StreamData data) {}
}
