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

import lombok.Data;
import lombok.NonNull;

@Data
public class AuthenticateMessage {

    private final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload;

    private AuthenticateMessage(final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload) {
        this.payload = payload;
    }

    public static AuthenticateMessage custom(final @NonNull String id) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setCustom(id);
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage device(final @NonNull String id) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setDevice(id);
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage email(final @NonNull String email, final @NonNull String password) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setEmail(com.heroiclabs.nakama.Api.AuthenticateRequest.Email.newBuilder()
                                .setEmail(email)
                                .setPassword(password)
                                .build());
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage facebook(final @NonNull String oauthToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setFacebook(oauthToken);
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage gameCenter(final @NonNull String playerId, final @NonNull String bundleId,
                                                 final long timestamp, final @NonNull String salt,
                                                 final @NonNull String signature, final @NonNull String publicKeyUrl) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setGameCenter(com.heroiclabs.nakama.Api.AuthenticateRequest.GameCenter.newBuilder()
                                .setPlayerId(playerId)
                                .setBundleId(bundleId)
                                .setTimestamp(timestamp)
                                .setSalt(salt)
                                .setSignature(signature)
                                .setPublicKeyUrl(publicKeyUrl)
                                .build());
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage google(final @NonNull String oauthToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setGoogle(oauthToken);
        return new AuthenticateMessage(payload);
    }

    public static AuthenticateMessage steam(final @NonNull String sessionToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setSteam(sessionToken);
        return new AuthenticateMessage(payload);
    }
}
