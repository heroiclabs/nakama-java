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
import lombok.AllArgsConstructor;
import lombok.NonNull;

public interface StorageUpdateMessage extends CollatedMessage<ResultSet<RecordId>> {

    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static Builder newBuilder() {
            return new Builder(com.heroiclabs.nakama.Api.TStorageUpdate.newBuilder());
        }

        private final @NonNull com.heroiclabs.nakama.Api.TStorageUpdate.Builder updates;

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull OpBuilder ops, final String version,
                              final StorageRecord.PermissionRead read,
                              final StorageRecord.PermissionWrite write) {
            com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.StorageKey.Builder updateKey =
                    com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.StorageKey.newBuilder()
                            .setBucket(bucket)
                            .setCollection(collection)
                            .setRecord(key);
            if (version != null) {
                updateKey = updateKey.setVersion(version);
            }
            com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.Builder record =
                    com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.newBuilder()
                            .setKey(updateKey)
                            .addOps(ops.ops);
            if (read != null) {
                record = record.setPermissionRead(read.getCode());
            }
            if (write != null) {
                record = record.setPermissionWrite(write.getCode());
            }
            updates.addUpdates(record);
            return this;
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull OpBuilder ops) {
            return record(bucket, collection, key, ops, null, null, null);
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull OpBuilder ops, final StorageRecord.PermissionRead read,
                              final StorageRecord.PermissionWrite write) {
            return record(bucket, collection, key, ops, null, read, write);
        }

        public Builder record(final @NonNull String bucket, final @NonNull String collection, final @NonNull String key,
                              final @NonNull OpBuilder ops, final String version) {
            return record(bucket, collection, key, ops, version, null, null);
        }

        public StorageUpdateMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setStorageUpdate(updates);
            return new DefaultStorageUpdateMessage(payload);
        }

    }

    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class OpBuilder {

        public static OpBuilder newBuilder() {
            return new OpBuilder(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder());
        }

        final @NonNull com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.Builder ops;

        public OpBuilder add(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.ADD.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder append(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.APPEND.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder copy(final @NonNull String path, final @NonNull String from) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.COPY.getNumber())
                    .setPath(path)
                    .setFrom(from));
            return this;
        }

        public OpBuilder incr(final @NonNull String path, final long value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.INCR.getNumber())
                    .setPath(path)
                    .setValue(Long.toString(value)));
            return this;
        }

        public OpBuilder init(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.INIT.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder merge(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.MERGE.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder move(final @NonNull String path, final @NonNull String from) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.MOVE.getNumber())
                    .setPath(path)
                    .setFrom(from));
            return this;
        }

        // TODO support nested patch
        // public OpBuilder patch(final @NonNull String path, final @NonNull byte[] value) {}

        public OpBuilder remove(final @NonNull String path) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.REMOVE.getNumber())
                    .setPath(path));
            return this;
        }

        public OpBuilder replace(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.REPLACE.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder test(final @NonNull String path, final @NonNull String value) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.TEST.getNumber())
                    .setPath(path)
                    .setValue(value));
            return this;
        }

        public OpBuilder compare(final @NonNull String path, final @NonNull String value, final long assertValue) {
            ops.addOps(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.newBuilder()
                    .setOp(com.heroiclabs.nakama.Api.TStorageUpdate.StorageUpdate.UpdateOp.UpdateOpCode.COMPARE.getNumber())
                    .setPath(path)
                    .setValue(value)
                    .setAssert(assertValue));
            return this;
        }

        public OpBuilder build() {
            return this;
        }

    }

}
