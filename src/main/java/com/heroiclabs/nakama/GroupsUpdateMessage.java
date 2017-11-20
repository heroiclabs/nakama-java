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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public interface GroupsUpdateMessage extends CollatedMessage<Boolean> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static GroupsUpdateMessage.Builder newBuilder() {
            return new GroupsUpdateMessage.Builder(com.heroiclabs.nakama.Api.TGroupsUpdate.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TGroupsUpdate.Builder updates;

        public GroupsUpdateMessage.Builder group(final @NonNull String groupId,
                                                 final @NonNull String name, final String description,
                                                 final String avatarUrl, final String lang,
                                                 final @NonNull String metadata, final boolean isPrivate) {
            com.heroiclabs.nakama.Api.TGroupsUpdate.GroupUpdate.Builder g =
                    com.heroiclabs.nakama.Api.TGroupsUpdate.GroupUpdate.newBuilder()
                            .setGroupId(groupId)
                            .setName(name)
                            .setMetadata(metadata)
                            .setPrivate(isPrivate);
            if (description != null) {
                g.setDescription(description);
            }
            if (avatarUrl != null) {
                g.setAvatarUrl(avatarUrl);
            }
            if (lang != null) {
                g.setLang(lang);
            }
            this.updates.addGroups(g.build());
            return this;
        }

        public GroupsUpdateMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setGroupsUpdate(updates);
            return new DefaultGroupsUpdateMessage(payload);
        }
    }

}
