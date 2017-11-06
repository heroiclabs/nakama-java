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
class DefaultUser implements User {

    private final String avatarUrl;

    private final long createdAt;

    private final String fullname;

    private final String handle;

    private final String id;

    private final String lang;

    private final long lastOnlineAt;

    private final String location;

    private final String metadata;

    private final String timezone;

    private final long updatedAt;

    public <T> T getMetadata(final Class<T> clazz) {
        return DefaultClient.GSON.fromJson(metadata, clazz);
    }

    static User fromProto(final @NonNull com.heroiclabs.nakama.Api.User user) {
        return new DefaultUser(user.getAvatarUrl(), user.getCreatedAt(),
                user.getFullname(), user.getHandle(), user.getId(),
                user.getLang(), user.getLastOnlineAt(), user.getLocation(),
                user.getMetadata(), user.getTimezone(), user.getUpdatedAt());
    }

}
