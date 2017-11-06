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
 * A user in the server.
 */
public interface User {
    /**
     * @return A URL string which points at a avatar image or similar.
     */
    String getAvatarUrl();

    /**
     * @return UTC timestamp when the user was created.
     */
    long getCreatedAt();

    /**
     * @return The full name for a user.
     */
    String getFullname();

    /**
     * @return The handle (nickname) of the user.
     */
    String getHandle();

    /**
     * @return The ID of the user.
     */
    String getId();

    /**
     * @return The (BCP-47) lang tag set by the user.
     */
    String getLang();

    /**
     * @return UTC timestamp when the user was last online.
     */
    long getLastOnlineAt();

    /**
     * @return The location set by the user.
     */
    String getLocation();

    /**
     * @return The metadata stored for the user.
     */
    String getMetadata();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the metadata to decode.
     * @return The decoded metadata for the user.
     */
    <T> T getMetadata(final Class<T> clazz);

    /**
     * @return The timezone set by the user.
     */
    String getTimezone();

    /**
     * @return UTC timestamp when the user was updated.
     */
    long getUpdatedAt();
}
