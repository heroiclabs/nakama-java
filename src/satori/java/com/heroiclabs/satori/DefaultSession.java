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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import okio.ByteString;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
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

    public boolean isExpired() {
        return isExpired(new Date());
    }

    public boolean isExpired(Date dateTime) {
        return (expireTime - dateTime.getTime()) < 0L;
    }

    public boolean isRefreshExpired() {
        return isRefreshExpired(new Date());
    }

    public boolean isRefreshExpired(Date dateTime) {
        return (refreshExpireTime - dateTime.getTime()) < 0L;
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
        Type type = new TypeToken<Map<String, Object>>(){}.getType();

        Gson gson = new Gson();
        return gson.fromJson(decodedJson, type);
    }
}
