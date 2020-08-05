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

import lombok.*;

@Data
/**
 * An object which represents a connected user in the server.
 * The server allows the same user to be connected with multiple sessions. To uniquely identify them a tuple of
 * <c>{ user_id, session_id }</c> is used which is exposed as this object.
 */
public class UserPresence {
    /**
     * True if this presence generates stored events like persistent chat messages or notifications.
     */
    private boolean persistence;

    /**
     * The session id of the user.
     */
    private String sessionId;

    /**
     * The status of the user with the presence on the server.
     */
    private String status;

    /**
     * The username for the user.
     */
    private String username;

    /**
     * The id of the user.
     */
    private String userId;
}
