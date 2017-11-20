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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a group with user members.
 */
public interface Group {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum MembershipType {
        /** The user is a group administrator. */
        ADMIN(0),
        /** The user is a regular group member. */
        MEMBER(1),
        /** The user has submitted a request to join the group. */
        JOIN(2);

        @Getter
        private final int code;

        static Group.MembershipType fromLong(final long state) {
            switch ((int) state) {
                case 0:
                    return ADMIN;
                case 1:
                    return MEMBER;
                case 2:
                    return JOIN;
                default:
                    String message = String.format("Unrecognised group state type: %s", state);
                    throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * @return The group unique ID.
     */
    String getId();

    /**
     * @return true if it's a private group requiring approval to join, false otherwise.
     */
    boolean isPrivate();

    /**
     * @return The ID of the user that created the group.
     */
    String getCreatorId();

    /**
     * @return The name of the group.
     */
    String getName();

    /**
     * @return The group's description.
     */
    String getDescription();

    /**
     * @return The group's avatar URL.
     */
    String getAvatarUrl();

    /**
     * @return The group's lang tag.
     */
    String getLang();

    /**
     * @return The offset in milliseconds representing the group's timezone relative to UTC.
     */
    long getUtcOffsetMs();

    /**
     * @return The metadata stored for the group.
     */
    String getMetadata();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the metadata to decode.
     * @return The decoded metadata for the group.
     */
    <T> T getMetadata(final Class<T> clazz);

    /**
     * @return The number of group members.
     */
    long getCount();

    /**
     * @return The UTC milliseconds timestamp when the group was created.
     */
    long getCreatedAt();

    /**
     * @return The UTC milliseconds timestamp when the group data was last updated.
     */
    long getUpdatedAt();

}
