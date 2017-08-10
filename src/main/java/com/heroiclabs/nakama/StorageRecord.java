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
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A record from the storage engine in the server.
 */
public interface StorageRecord extends RecordId {
    /**
     * A set of permissions for if a record can be read.
     */
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum PermissionRead {
        NO_READ(0),
        OWNER_READ(1),
        PUBLIC_READ(2);

        @Getter
        private final int code;

        // Static helpers to transform wire protocol int codes into their enum equivalents.
        private static final Map<Integer, PermissionRead> codeMappings;
        static {
            Map<Integer, PermissionRead> codes = new HashMap<>();
            for (PermissionRead code : PermissionRead.values()) {
                codes.put(code.code, code);
            }
            codeMappings = Collections.unmodifiableMap(codes);
        }
        static PermissionRead fromInt(final int code) {
            return codeMappings.get(code);
        }
    }

    /**
     * A set of permissions for if a record can be written.
     */
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum PermissionWrite {
        NO_WRITE(0),
        OWNER_WRITE(1);

        @Getter
        private final int code;

        // Static helpers to transform wire protocol int codes into their enum equivalents.
        private static final Map<Integer, PermissionWrite> codeMappings;
        static {
            Map<Integer, PermissionWrite> codes = new HashMap<>();
            for (PermissionWrite code : PermissionWrite.values()) {
                codes.put(code.code, code);
            }
            codeMappings = Collections.unmodifiableMap(codes);
        }
        static PermissionWrite fromInt(final int code) {
            return codeMappings.get(code);
        }
    }

    /**
     * @return UTC timestamp when the record was created.
     */
    long getCreatedAt();

    /**
     * @return UTC timestamp when the record will expire.
     */
    long getExpiresAt();

    /**
     * @return The read permission for the record.
     */
    PermissionRead getPermissionRead();

    /**
     * @return The write permission for the record.
     */
    PermissionWrite getPermissionWrite();

    /**
     * @return The value (content) of the record.
     */
    byte[] getValue();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the value to decode.
     * @return The decoded value of the record.
     */
    <T> T getValue(final Class<T> clazz);

    /**
     * @return UTC timestamp when the record was updated.
     */
    long getUpdatedAt();

    /**
     * @return The Id of the user who owns the record.
     */
    byte[] getUserId();
}
