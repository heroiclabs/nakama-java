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

public interface LeaderboardRecordWriteMessage extends CollatedMessage<ResultSet<LeaderboardRecord>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class LeaderboardRecordWrite {
        private final @NonNull
        com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.LeaderboardRecordWrite.Builder write;

        public static LeaderboardRecordWriteMessage.LeaderboardRecordWrite newBuilder(final @NonNull byte[] leaderboardId) {
            com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.LeaderboardRecordWrite.Builder b = com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.LeaderboardRecordWrite.newBuilder();
            b.setLeaderboardId(ByteString.copyFrom(leaderboardId));
            return new LeaderboardRecordWriteMessage.LeaderboardRecordWrite(b);
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite location(final @NonNull String location) {
            write.setLocation(location);
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite timezone(final @NonNull String timezone) {
            write.setTimezone(timezone);
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite metadata(final @NonNull byte[] metadata) {
            write.setMetadata(ByteString.copyFrom(metadata));
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite increment(final long value) {
            write.setIncr(value);
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite decrement(final long value) {
            write.setDecr(value);
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite set(final long value) {
            write.setSet(value);
            return this;
        }

        public LeaderboardRecordWriteMessage.LeaderboardRecordWrite best(final long value) {
            write.setBest(value);
            return this;
        }

        private com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.LeaderboardRecordWrite.Builder build() {
            return write;
        }
    }

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static LeaderboardRecordWriteMessage.Builder newBuilder() {
            return new LeaderboardRecordWriteMessage.Builder(com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TLeaderboardRecordsWrite.Builder writes;

        public LeaderboardRecordWriteMessage.Builder add(final @NonNull LeaderboardRecordWrite write) {
            writes.addRecords(write.build());
            return this;
        }

        public LeaderboardRecordWriteMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLeaderboardRecordsWrite(writes);
            return new DefaultLeaderboardRecordWriteMessage(payload);
        }

    }
}
