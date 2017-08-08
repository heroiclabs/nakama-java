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

import lombok.NonNull;

public interface AuthenticateMessage extends CollatedMessage<Session> {

    com.heroiclabs.nakama.Api.AuthenticateRequest.Builder getPayload();

    static AuthenticateMessage custom(final @NonNull String id) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setCustom(id);
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage device(final @NonNull String id) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setDevice(id);
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage email(final @NonNull String email, final @NonNull String password) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setEmail(com.heroiclabs.nakama.Api.AuthenticateRequest.Email.newBuilder()
                                .setEmail(email)
                                .setPassword(password)
                                .build());
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage facebook(final @NonNull String oauthToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setFacebook(oauthToken);
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage gameCenter(final @NonNull String playerId, final @NonNull String bundleId,
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
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage google(final @NonNull String oauthToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setGoogle(oauthToken);
        return new DefaultAuthenticateMessage(payload);
    }

    static AuthenticateMessage steam(final @NonNull String sessionToken) {
        final com.heroiclabs.nakama.Api.AuthenticateRequest.Builder payload =
                com.heroiclabs.nakama.Api.AuthenticateRequest.newBuilder()
                        .setSteam(sessionToken);
        return new DefaultAuthenticateMessage(payload);
    }
}
