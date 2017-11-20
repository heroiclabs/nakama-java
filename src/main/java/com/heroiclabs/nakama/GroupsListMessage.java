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

public interface GroupsListMessage extends CollatedMessage<ResultSet<Group>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static GroupsListMessage.Builder newBuilder() {
            return new GroupsListMessage.Builder(com.heroiclabs.nakama.Api.TGroupsList.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TGroupsList.Builder list;

        public GroupsListMessage.Builder limit(final long limit) {
            this.list.setPageLimit(limit);
            return this;
        }

        public GroupsListMessage.Builder orderAscending(final boolean orderAscending) {
            this.list.setOrderByAsc(orderAscending);
            return this;
        }

        public GroupsListMessage.Builder filterByLang(final @NonNull String lang) {
            this.list.clearFilter();
            this.list.setLang(lang);
            return this;
        }

        public GroupsListMessage.Builder filterByCreatedAt(final long createdAt) {
            this.list.clearFilter();
            this.list.setCreatedAt(createdAt);
            return this;
        }

        public GroupsListMessage.Builder filterByCount(final long count) {
            this.list.clearFilter();
            this.list.setCount(count);
            return this;
        }

        public GroupsListMessage.Builder cursor(final @NonNull Cursor cursor) {
            this.list.setCursor(cursor.getValue());
            return this;
        }

        public GroupsListMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setGroupsList(list);
            return new DefaultGroupsListMessage(payload);
        }
    }

}
