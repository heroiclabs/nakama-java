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
 * The object which represents a leaderboard object.
 */
public interface Leaderboard {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum SortOrder {
        ASCENDING(0),
        DESCENDING(1);

        @Getter
        private final int code;

        static Leaderboard.SortOrder fromLong(final long sort) {
            switch ((int) sort) {
                case 0:
                    return ASCENDING;
                case 1:
                    return DESCENDING;
                default:
                    String message = String.format("Unrecognised leaderboard sort order: %s", sort);
                    throw new IllegalArgumentException(message);
            }
        }
    }

    /**
     * @return Leaderboard ID.
     */
    String getId();

    /**
     * @return Whether leaderboard is server authoritative or not.
     */
    boolean isAuthoritative();

    /**
     * @return Sort order for the record.
     */
    SortOrder getSort();

    /**
     * @return Record count.
     */
    long getCount();

    /**
     * @return Reset schedule.
     */
    String getResetSchedule();

    /**
     * @return Metadata associated with the leaderboard.
     */
    String getMetadata();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the metadata to decode.
     * @return Metadata associated with the leaderboard.
     */
    <T> T getMetadata(final Class<T> clazz);

    String getNextId();

    String getPrevId();
}
