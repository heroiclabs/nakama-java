/*
 * Copyright 2023 The Satori Authors
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

package com.heroiclabs.satori;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import okio.ByteString;
import com.auth0.jwt.JWT;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
@ToString
public class DefaultSession implements Session {
    private long createTime;
    private long expireTime;
    private long refreshExpireTime;
    private String refreshToken;
    private String identityId;
    private String authToken;

    DefaultSession(final String authToken, final String refreshToken) {
        this.update(authToken, refreshToken);
    }

    @Override
    public boolean isExpired() {
        return isExpired(new Date());
    }

    @Override
    public boolean isExpired(Date dateTime) {
        return (expireTime - dateTime.getTime()) < 0L;
    }

    @Override
    public boolean isRefreshExpired() {
        return isRefreshExpired(new Date());
    }

    @Override
    public boolean isRefreshExpired(Date dateTime) {
        return (refreshExpireTime - dateTime.getTime()) < 0L;
    }

    /**
     * In-place update a session with new token/refresh-token.
     *
     * @param token        Authentication token.
     * @param refreshToken Refresh token.
     */
    @Override
    public void update(String token, String refreshToken) {
        this.createTime = System.currentTimeMillis();
        this.authToken = authToken;
        this.refreshToken = refreshToken;

        Map<String, Object> decoded = jwtUnpack(authToken);
        this.expireTime = Math.round(((Double) decoded.get("exp")) * 1000L);
        this.identityId = decoded.get("iid").toString();

        if (refreshToken != null && !refreshToken.isEmpty()) {
            Map<String, Object> decoded2 = jwtUnpack(refreshToken);
            this.refreshExpireTime = Math.round(((Double) decoded2.get("exp")) * 1000L);
        } else {
            this.refreshExpireTime = 0L;
        }
    }

    public static Session restore(String authToken, String refreshToken) {
        if (authToken == null || authToken.isEmpty()) {
            return null;
        }
        return new DefaultSession(authToken, refreshToken);
    }

    private static Map<String, Object> jwtUnpack(String jwt) {
        String payload = jwt.split("\\.")[1];
        String decodedJson = ByteString.decodeBase64(payload).string(Charset.defaultCharset());
        Type type = new TypeToken<Map<String, Object>>() {
        }.getType();

        Gson gson = new Gson();
        return gson.fromJson(decodedJson, type);
    }

    /**
     * Utility function to create a new Session from a Signing Key. This function is to be used for server-to-server
     * calls only. The signing key should never be shared with the clients.
     * @param signingKey The session signing key configured in Satori.
     * @param apiKeyName The api key name to be used in the token. This has to be an existing value configured in the Satori dashboard.
     * @param identityId The user identity id for the session.
     * @param tokenDuration The duration of the validity of the session.
     */
    public static Session fromSigningKey(@NonNull String signingKey, @NonNull String apiKeyName, @NonNull String identityId, @NonNull Duration tokenDuration) throws JWTCreationException, IllegalArgumentException {
        if (signingKey.isEmpty()) {
            throw new IllegalArgumentException("signingKey cannot be empty");
        }
        if (apiKeyName.isEmpty()) {
            throw new IllegalArgumentException("apiKeyName cannot be empty");
        }
        if (identityId.isEmpty()) {
            throw new IllegalArgumentException("identityId cannot be empty");
        }
        if (tokenDuration.isNegative()) {
            throw new IllegalArgumentException("tokenDuration is invalid");
        }

        Instant issuedAt = Instant.now();
        Instant expiresAt = issuedAt.plus(tokenDuration);

        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("sid", "");
        claims.put("iid", identityId);
        claims.put("iat", issuedAt.getEpochSecond());
        claims.put("exp", expiresAt.getEpochSecond());
        claims.put("api", apiKeyName);

        Algorithm algorithm = Algorithm.HMAC256(signingKey);
        String token = JWT.create()
                .withPayload(claims)
                .sign(algorithm);

        return new DefaultSession(token, null);
    }
}
