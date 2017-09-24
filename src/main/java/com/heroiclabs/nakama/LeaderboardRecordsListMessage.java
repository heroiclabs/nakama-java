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

import com.google.protobuf.ByteString;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

public interface LeaderboardRecordsListMessage extends CollatedMessage<ResultSet<LeaderboardRecord>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static LeaderboardRecordsListMessage.Builder newBuilder(final @NonNull byte[] leaderboardId) {
            com.heroiclabs.nakama.Api.TLeaderboardRecordsList.Builder b = com.heroiclabs.nakama.Api.TLeaderboardRecordsList.newBuilder();
            b.setLeaderboardId(ByteString.copyFrom(leaderboardId));
            return new DefaultLeaderboardRecordsListMessage.Builder(b);
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TLeaderboardRecordsList.Builder listing;

        public LeaderboardRecordsListMessage.Builder filterByPagingToOwnerId(final @NonNull byte[] ownerId) {
            listing.setOwnerId(ByteString.copyFrom(ownerId));
            return this;
        }

        public LeaderboardRecordsListMessage.Builder filterByPagingToOwnerIds(final @NonNull List<byte[]> ownerIds) {
            com.heroiclabs.nakama.Api.TLeaderboardRecordsList.Owners.Builder o = com.heroiclabs.nakama.Api.TLeaderboardRecordsList.Owners.newBuilder();
            for (byte[] b : ownerIds) {
                o.addOwnerIds(ByteString.copyFrom(b));
            }
            listing.setOwnerIds(o);
            return this;
        }

        public LeaderboardRecordsListMessage.Builder filterByLang(final @NonNull String lang) {
            listing.setLang(lang);
            return this;
        }

        public LeaderboardRecordsListMessage.Builder filterByTimezone(final @NonNull String tz) {
            listing.setTimezone(tz);
            return this;
        }

        public LeaderboardRecordsListMessage.Builder limit(final long limit) {
            listing.setLimit(limit);
            return this;
        }

        public LeaderboardRecordsListMessage.Builder cursor(final @NonNull byte[] cursor) {
            listing.setCursor(ByteString.copyFrom(cursor));
            return this;
        }

        public LeaderboardRecordsListMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLeaderboardRecordsList(listing);
            return new DefaultLeaderboardRecordsListMessage(payload);
        }

    }
}
