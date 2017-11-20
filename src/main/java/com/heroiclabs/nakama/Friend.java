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

public interface Friend extends User {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum FriendType {
        /** A standard friend relationship. */
        FRIEND(0),
        /** An incoming friend request. */
        INVITE(1),
        /** A sent friend request. */
        INVITED(2),
        /** A blocked user. */
        BLOCKED(3);

        @Getter
        private final int code;

        static Friend.FriendType fromLong(final long state) {
            switch ((int) state) {
                case 0:
                    return FRIEND;
                case 1:
                    return INVITE;
                case 2:
                    return INVITED;
                case 3:
                    return BLOCKED;
                default:
                    String message = String.format("Unrecognised friend state type: %s", state);
                    throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * @return An enum representing the type of relationship to this friend.
     */
    FriendType getState();

}
