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

import java.util.Date;

public interface Session {

    /**
     * The authorization token used to construct this session.
     */
    String getAuthToken();

    /**
     * The UNIX timestamp when this session will expire.
     */
    long getExpireTime();

    /**
     * If the session has expired.
     */
    boolean isExpired();

    /**
     * Check if the session has expired against the input time.
     * @param dateTime The time to compare against the session.
     * @return true if the session has expired.
     */
    boolean isExpired(Date dateTime);

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
     * Refresh token that can be used for session token renewal.
     */
    String getRefreshToken();

    /**
     * The ID of the user who owns this session.
     */
    String getIdentityId();

    /**
     * In-place update a session with new token/refresh-token.
     * @param token Authentication token.
     * @param refreshToken Refresh token.
     */
    void update(String token, String refreshToken);
}
