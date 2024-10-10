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
import java.util.Map;

/**
 * A session used with requests sent to Nakama server.
 */
public interface Session {
    /**
     * @return The authentication token used to construct this session.
     */
    String getAuthToken();

    /**
     * @return The refresh token used to construct this session.
     */
    String getRefreshToken();

    /**
     * @return True if the user account for this session was just created.
     */
    boolean isCreated();

    /**
     * @return The timestamp in seconds when this session object was created.
     */
    long getCreateTime();

    /**
     * @return The timestamp in seconds when this session will expire.
     */
    long getExpireTime();

    /**
     * @return True if the session has expired against the current time.
     */
    boolean IsExpired();

    /**
     * If the refresh token has expired.
     */
    boolean isRefreshExpired();

    /**
     * If the refresh token has expired.
     * @param dateTime The time to compare against the refresh token against.
     * @return true if the refresh token has expired.
     */
    boolean isRefreshExpired(Date dateTime);

    /**
     * The UNIX timestamp when the refresh token will expire.
     */
    long getRefreshExpireTime();

    /**
     * @return The username of the user who owns this session.
     */
    String getUsername();

    /**
     * @return The ID of the user who owns this session.
     */
    String getUserId();

    /**
     * Check if the session has expired against the input time.
     * @param dateTime The time to compare against the session.
     * @return true if the session has expired.
     */
    boolean isExpired(Date dateTime);

    /**
     * @return Get session vars.
     */
    Map<String, String> getVars();

    /**
     * In-place update a session with new token/refresh-token.
     * @param token Authentication token.
     * @param refreshToken Refresh token.
     */
    void update(String token, String refreshToken);
}
