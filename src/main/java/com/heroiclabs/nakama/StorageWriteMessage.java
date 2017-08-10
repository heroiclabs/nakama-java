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

import com.google.protobuf.ByteString;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public interface StorageWriteMessage extends CollatedMessage<ResultSet<RecordId>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        static Builder newBuilder() {
            return new Builder(com.heroiclabs.nakama.Api.TStorageWrite.newBuilder());
        }

        private final @NonNull com.heroiclabs.nakama.Api.TStorageWrite.Builder writes;

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull byte[] value, final byte[] version,
                              final StorageRecord.PermissionRead read,
                              final StorageRecord.PermissionWrite write) {
            com.heroiclabs.nakama.Api.TStorageWrite.StorageData.Builder record =
                    com.heroiclabs.nakama.Api.TStorageWrite.StorageData.newBuilder()
                            .setBucket(bucket)
                            .setCollection(collection)
                            .setRecord(key)
                            .setValue(ByteString.copyFrom(value));
            if (version != null) {
                record = record.setVersion(ByteString.copyFrom(version));
            }
            if (read != null) {
                record = record.setPermissionRead(read.getCode());
            }
            if (write != null) {
                record = record.setPermissionWrite(write.getCode());
            }
            writes.addData(record);
            return this;
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull byte[] value) {
            return record(bucket, collection, key, value, null, null, null);
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull byte[] value, final StorageRecord.PermissionRead read,
                              final StorageRecord.PermissionWrite write) {
            return record(bucket, collection, key, value, null, read, write);
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull byte[] value, final byte[] version) {
            return record(bucket, collection, key, value, version, null, null);
        }

        public StorageWriteMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setStorageWrite(writes);
            return new DefaultStorageWriteMessage(payload);
        }

    }

}
