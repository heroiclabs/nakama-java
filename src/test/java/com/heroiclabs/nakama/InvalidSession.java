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

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

class InvalidSession implements Session {

    @Override
    public String getAuthToken() {
        return "badtoken";
    }

    @Override
    public String getRefreshToken() {return "badrefreshtoken";}

    @Override
    public boolean isCreated() {
        return true;
    }

    @Override
    public long getCreateTime() {
        return new Date().getTime();
    }

    @Override
    public long getExpireTime() {
        return new Date().getTime() + 5000L;
    }

    @Override
    public boolean IsExpired() {
        return false;
    }

    @Override
    public boolean isRefreshExpired() { return false; }

    @Override
    public boolean isRefreshExpired(Date dateTime) { return false; }

    @Override
    public long getRefreshExpireTime() { return new Date().getTime() + 5000L; }

    @Override
    public String getUsername() {
        return "invalid_username";
    }

    @Override
    public String getUserId() {
        return "invalid_user";
    }

    @Override
    public boolean isExpired(Date dateTime) {
        return false;
    }

    @Override
    public Map<String, String> getVars() {
        return new Hashtable<String, String>();
    }

    /**
     * In-place update a session with new token/refresh-token.
     *
     * @param token        Authentication token.
     * @param refreshToken Refresh token.
     */
    @Override
    public void update(String token, String refreshToken) {}
}