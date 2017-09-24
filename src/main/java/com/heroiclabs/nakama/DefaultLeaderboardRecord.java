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

import lombok.*;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultLeaderboardRecord implements LeaderboardRecord {
    private final byte[] leaderboardId;
    private final byte[] ownerId;
    private final String handle;
    private final String lang;
    private final String location;
    private final String timezone;
    private final long rank;
    private final long score;
    private final long numScore;
    private final byte[] metadata;
    private final long rankedAt;
    private final long updatedAt;
    private final long expiresAt;

    static LeaderboardRecord fromProto(final @NonNull com.heroiclabs.nakama.Api.LeaderboardRecord record) {
        return new DefaultLeaderboardRecord(
                record.getLeaderboardId().toByteArray(),
                record.getOwnerId().toByteArray(),
                record.getHandle(),
                record.getLang(),
                record.getLocation(),
                record.getTimezone(),
                record.getRank(),
                record.getScore(),
                record.getNumScore(),
                record.getMetadata().toByteArray(),
                record.getRankedAt(),
                record.getUpdatedAt(),
                record.getExpiresAt()
        );
    }

    public <T> T getMetadata(final Class<T> clazz) {
        return DefaultClient.GSON.fromJson(new String(metadata), clazz);
    }

}
