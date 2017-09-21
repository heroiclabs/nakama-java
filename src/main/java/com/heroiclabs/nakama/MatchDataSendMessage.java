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

public interface MatchDataSendMessage extends UncollatedMessage {
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static MatchDataSendMessage.Builder newBuilder() {
            return new DefaultMatchDataSendMessage.Builder(com.heroiclabs.nakama.Api.MatchDataSend.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.MatchDataSend.Builder matchData;

        public MatchDataSendMessage.Builder matchId(final @NonNull byte[] matchId) {
            matchData.setMatchId(ByteString.copyFrom(matchId));
            return this;
        }

        public MatchDataSendMessage.Builder opCode(final long opcode) {
            matchData.setOpCode(opcode);
            return this;
        }

        public MatchDataSendMessage.Builder data(final @NonNull byte[] data) {
            matchData.setData(ByteString.copyFrom(data));
            return this;
        }

        public MatchDataSendMessage.Builder presences(final @NonNull UserPresence[] presences) {
            for (UserPresence p : presences) {
                com.heroiclabs.nakama.Api.UserPresence.Builder up = com.heroiclabs.nakama.Api.UserPresence.newBuilder();
                up.setHandle(p.getHandle());
                up.setSessionId(ByteString.copyFrom(p.getSessionId()));
                up.setUserId(ByteString.copyFrom(p.getUserId()));
                matchData.addPresences(up);
            }

            return this;
        }

        public MatchDataSendMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setMatchDataSend(matchData);
            return new DefaultMatchDataSendMessage(payload);
        }

    }
}
