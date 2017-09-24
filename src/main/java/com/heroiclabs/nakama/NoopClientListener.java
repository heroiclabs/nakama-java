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

/**
 * Default implementation of client listener, all operations are no-op.
 */
public class NoopClientListener implements ClientListener {
    @Override public void onDisconnect() {}
    @Override public void onTopicMessage(TopicMessage message) {}
    @Override public void onTopicPresence(TopicPresence presence) {}
    @Override public void onMatchmakeMatched(MatchmakeMatched matched) {}
    @Override public void onMatchData(MatchData matchData) {}
    @Override public void onMatchPresence(MatchPresence matchPresence) {}
}
