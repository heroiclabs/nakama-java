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

public interface StorageRemoveMessage extends CollatedMessage<Boolean> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static Builder newBuilder() {
            return new Builder(com.heroiclabs.nakama.Api.TStorageRemove.newBuilder());
        }

        private final @NonNull com.heroiclabs.nakama.Api.TStorageRemove.Builder remove;

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key) {
            com.heroiclabs.nakama.Api.TStorageRemove.StorageKey.Builder record =
                    com.heroiclabs.nakama.Api.TStorageRemove.StorageKey.newBuilder()
                            .setBucket(bucket)
                            .setCollection(collection)
                            .setRecord(key);
            remove.addKeys(record);
            return this;
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final String version) {
            com.heroiclabs.nakama.Api.TStorageRemove.StorageKey.Builder record =
                    com.heroiclabs.nakama.Api.TStorageRemove.StorageKey.newBuilder()
                            .setBucket(bucket)
                            .setCollection(collection)
                            .setRecord(key);
            if (version != null) {
                record = record.setVersion(version);
            }
            remove.addKeys(record);
            return this;
        }

        public StorageRemoveMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setStorageRemove(remove);
            return new DefaultStorageRemoveMessage(payload);
        }

    }

}
