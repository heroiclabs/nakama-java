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
public class DefaultGroup implements Group {

    private final String id;
    @Getter(AccessLevel.PRIVATE)
    private final boolean priv;
    private final String creatorId;
    private final String name;
    private final String description;
    private final String avatarUrl;
    private final String lang;
    private final long utcOffsetMs;
    private final String metadata;
    private final long count;
    private final long createdAt;
    private final long updatedAt;

    public boolean isPrivate() {
        return priv;
    }

    public <T> T getMetadata(final Class<T> clazz) {
        return DefaultClient.GSON.fromJson(metadata, clazz);
    }

    static Group fromProto(final @NonNull com.heroiclabs.nakama.Api.Group group) {
        return new DefaultGroup(group.getId(), group.getPrivate(), group.getCreatorId(), group.getName(),
                group.getDescription(), group.getAvatarUrl(), group.getLang(), group.getUtcOffsetMs(),
                group.getMetadata(), group.getCount(), group.getCreatedAt(), group.getUpdatedAt());
    }

}
