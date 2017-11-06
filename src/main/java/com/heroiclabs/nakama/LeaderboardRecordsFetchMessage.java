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

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public interface LeaderboardRecordsFetchMessage extends CollatedMessage<ResultSet<LeaderboardRecord>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static LeaderboardRecordsFetchMessage.Builder newBuilder() {
            return new LeaderboardRecordsFetchMessage.Builder(com.heroiclabs.nakama.Api.TLeaderboardRecordsFetch.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TLeaderboardRecordsFetch.Builder fetch;

        public LeaderboardRecordsFetchMessage.Builder fetch(final @NonNull String leaderboardId) {
            fetch.addLeaderboardIds(leaderboardId);
            return this;
        }

        public LeaderboardRecordsFetchMessage.Builder limit(final long limit) {
            fetch.setLimit(limit);
            return this;
        }

        public LeaderboardRecordsFetchMessage.Builder cursor(final @NonNull String cursor) {
            fetch.setCursor(cursor);
            return this;
        }

        public LeaderboardRecordsFetchMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLeaderboardRecordsFetch(fetch);
            return new DefaultLeaderboardRecordsFetchMessage(payload);
        }

    }
}
