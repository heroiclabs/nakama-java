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

import java.util.List;

/**
 * The object which represents a leaderboard record.
 */
public interface LeaderboardRecord {

    /**
     * @returns Leaderboard ID.
     */
    byte[] getLeaderboardId();

    /**
     * @returns User ID that owns this record.
     */
    byte[] getOwnerId();

    /**
     * @returns User handle.
     */
    String getHandle();

    /**
     * @returns Language associated with the record.
     */
    String getLang();

    /**
     * @returns Location associated with the record.
     */
    String getLocation();

    /**
     * @returns Timezone associated with the record.
     */
    String getTimezone();

    long getRank();

    long getScore();

    long getNumScore();

    /**
     * @returns Metadata associated with the leaderboard record.
     */
    byte[] getMetadata();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the metadata to decode.
     * @return Metadata associated with the leaderboard.
     */
    <T> T getMetadata(final Class<T> clazz);

    long getRankedAt();

    /**
     * @returns When the record was last updated
     */
    long getUpdatedAt();

    /**
     * @returns When the record expires.
     */
    long getExpiresAt();

}
