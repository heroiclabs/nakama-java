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

public interface StorageListMessage extends CollatedMessage<ResultSet<StorageRecord>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static Builder newBuilderUserId(final @NonNull String userId) {
            return new Builder(com.heroiclabs.nakama.Api.TStorageList.newBuilder()
                    .setUserId(userId));
        }

        public static Builder newBuilderBucket(final @NonNull String bucket) {
            return new Builder(com.heroiclabs.nakama.Api.TStorageList.newBuilder()
                    .setBucket(bucket));
        }

        private final @NonNull com.heroiclabs.nakama.Api.TStorageList.Builder list;

        public Builder userId(final @NonNull String userId) {
            list.setUserId(userId);
            return this;
        }

        public Builder bucket(final @NonNull String bucket) {
            list.setBucket(bucket);
            return this;
        }

        public Builder collection(final @NonNull String collection) {
            list.setCollection(collection);
            return this;
        }

        public Builder limit(final int limit) {
            list.setLimit(limit);
            return this;
        }

        public Builder cursor(final @NonNull Cursor cursor) {
            list.setCursor(cursor.getValue());
            return this;
        }

        public StorageListMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setStorageList(list);
            return new DefaultStorageListMessage(payload);
        }

    }

}
