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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
@ToString
public class DefaultSession implements Session {
    private final long createTime;
    private final long expireTime;
    private final boolean created;
    private final String username;
    private final String userId;
    private final String authToken;
    private final Map<String, String> vars;

    DefaultSession(final String token, final boolean created) {
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
            var v = jsonMap.get("vrs");
            if (v instanceof Map) {
                var vm = (Map) v;
                for (Object key : vm.keySet()) {
                    this.vars.put(key.toString(), vm.get(key).toString());
                }
            }
        }

        this.created = created;
        this.authToken = token;
    }

    @Override
    public boolean IsExpired() {
        return isExpired(new Date());
    }

    @Override
    public boolean isExpired(Date dateTime) {
        return (expireTime - dateTime.getTime()) < 0L;
    }

    /**
     * Restore a session from an authentication token.
     * @param token The authentication token from a <c>Session</c>.
     * @return A session restored from the authentication token.
     */
    public static Session restore(final String token) {
        return new DefaultSession(token, false);
    }
}