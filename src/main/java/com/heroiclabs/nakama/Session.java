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

/**
 * A session connects a user to the server.
 */
public interface Session {
    /**
     * @return UTC timestamp when the session was restored.
     */
    long getCreatedAt();

    /**
     * @return UTC timestamp when the session expires.
     */
    long getExpiresAt();

    /**
     * @return The handle (nickname) of the user.
     */
    String getHandle();

    /**
     * @return The ID of the user.
     */
    String getId();

    /**
     * @return The session token returned by the server after register or login.
     */
    String getToken();

    /**
     * @param currentTimeMillis The current time in milliseconds to compare with token.
     * @return True if the session has expired.
     */
    boolean isExpired(long currentTimeMillis);
}
