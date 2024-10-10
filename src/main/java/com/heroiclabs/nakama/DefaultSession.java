/*
 * Copyright 2020 The Nakama Authors
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.*;
import okio.ByteString;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Default implementation of Session interface.
 */
@Getter
@EqualsAndHashCode
@ToString
public class DefaultSession implements Session {
    private long createTime;
    private long expireTime;
    private boolean created;
    private String username;
    private String userId;
    private String authToken;
    private String refreshToken;
    private long refreshExpireTime;
    private Map<String, String> vars;

    DefaultSession(final String token, final String refreshToken, final boolean created) {
        this.update(token, refreshToken);
        this.created = created;
    }

    @Override
    public boolean IsExpired() {
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

    @Override
    public void update(final String token, final String refreshToken) {
        final String[] decoded = token.split("\\.");
        if (decoded.length != 3) {
            throw new IllegalArgumentException("Not a valid token.");
        }
        final String decodedJson = ByteString.decodeBase64(decoded[1]).string(Charset.defaultCharset());
        Type type = new TypeToken<Map<String, Object>>(){}.getType();

        Gson gson = new Gson();
        Map<String, Object> jsonMap = gson.fromJson(decodedJson, type);

        this.createTime = System.currentTimeMillis();
        this.expireTime = Math.round(((Double) jsonMap.get("exp")) * 1000L);
        this.username = jsonMap.get("usn").toString();
        this.userId = jsonMap.get("uid").toString();
        this.vars = new HashMap();
        if (jsonMap.get("vrs") != null) {
            val v = jsonMap.get("vrs");
            if (v instanceof Map) {
                val vm = (Map) v;
                for (Object key : vm.keySet()) {
                    this.vars.put(key.toString(), vm.get(key).toString());
                }
            }
        }

        this.authToken = token;
        this.refreshToken = refreshToken;

        if (refreshToken != null && !refreshToken.isEmpty()) {
            Map<String, Object> decoded2 = jwtUnpack(refreshToken);
            this.refreshExpireTime = Math.round(((Double) decoded2.get("exp")) * 1000L);
        } else {
            this.refreshExpireTime = 0L;
        }
    }

    /**
     * Restore a session from an authentication token.
     * @param token The authentication token from a Session.
     * @param refreshToken The authentication refresh token from a Session.
     * @return A session restored from the authentication token.
     */
    public static Session restore(final String token, final String refreshToken) {
        return new DefaultSession(token, refreshToken, false);
    }

    private static Map<String, Object> jwtUnpack(String jwt) {
        String payload = jwt.split("\\.")[1];
        String decodedJson = ByteString.decodeBase64(payload).string(Charset.defaultCharset());
        Type type = new TypeToken<Map<String, Object>>() {
        }.getType();

        Gson gson = new Gson();
        return gson.fromJson(decodedJson, type);
    }
}
