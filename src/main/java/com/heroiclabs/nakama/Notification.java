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
 * Represents a notification aimed at a particular user.
 */
public interface Notification {
    /**
     * @return The unique ID of the notification.
     */
    String getId();

    /**
     * @return The subject text.
     */
    String getSubject();

    /**
     * @return The notification body.
     */
    String getContent();

    /**
     * @return The notification code.
     */
    long getCode();

    /**
     * @return The user ID of the sender, or an empty string if it's a system notification.
     */
    String getSenderId();

    /**
     * @return The UTC milliseconds timestamp when the notification was created.
     */
    long getCreatedAt();

    /**
     * @return The UTC milliseconds timestamp when the notification expires.
     */
    long getExpiresAt();

    /**
     * @return true if the notification was persisted and may be retrieved later, false if
     *         the notification was only delivered and not stored.
     */
    boolean isPersistent();
}
