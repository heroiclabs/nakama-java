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

import java.util.List;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultSelf implements Self {

    private final String avatarUrl;

    private final long createdAt;

    private final String fullname;

    private final String handle;

    private final byte[] id;

    private final String lang;

    private final long lastOnlineAt;

    private final String location;

    private final byte[] metadata;

    private final String timezone;

    private final long updatedAt;

    private final String customId;

    private final List<String> deviceIds;

    private final String email;

    private final String facebookId;

    private final String gameCenterId;

    private final String googleId;

    private final String steamId;

    private final boolean verified;

    public <T> T getMetadata(final Class<T> clazz) {
        return DefaultClient.GSON.fromJson(new String(metadata), clazz);
    }

    static Self fromProto(final @NonNull com.heroiclabs.nakama.Api.Self self) {
        return new DefaultSelf(self.getUser().getAvatarUrl(), self.getUser().getCreatedAt(),
                self.getUser().getFullname(), self.getUser().getHandle(), self.getUser().getId().toByteArray(),
                self.getUser().getLang(), self.getUser().getLastOnlineAt(), self.getUser().getLocation(),
                self.getUser().getMetadata().toByteArray(), self.getUser().getTimezone(), self.getUser().getUpdatedAt(),
                self.getCustomId(), self.getDeviceIdsList(), self.getEmail(), self.getFacebookId(),
                self.getGamecenterId(), self.getGoogleId(), self.getSteamId(), self.getVerified());
    }

}
