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
import lombok.AllArgsConstructor;
import lombok.NonNull;

public interface SelfUnlinkMessage extends CollatedMessage<Boolean> {

    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static SelfUnlinkMessage custom(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setCustom(id));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage device(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setDevice(id));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage email(final @NonNull String email) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setEmail(email));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage facebook(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setFacebook(id));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage gameCenter(final @NonNull String playerId) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setGameCenter(playerId));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage google(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setGoogle(id));
            return new DefaultSelfUnlinkMessage(payload);
        }

        public static SelfUnlinkMessage steam(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setUnlink(com.heroiclabs.nakama.Api.TUnlink.newBuilder()
                                    .setSteam(id));
            return new DefaultSelfUnlinkMessage(payload);
        }

    }

}
