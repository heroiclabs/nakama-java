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

/**
 * An error caused from an operation with the server.
 */
public abstract class Error extends Exception {

    /**
     * @param message The error message to construct with.
     */
    public Error(final @NonNull String message) {
        super(message);
    }

    /**
     * The error code for the problem.
     */
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    enum ErrorCode {
        UNKNOWN(0),
        RUNTIME_EXCEPTION(1),
        UNRECOGNISED_PAYLOAD(2),
        MISSING_PAYLOAD(3),
        BAD_INPUT(4),
        AUTH_ERROR(5),
        USER_NOT_FOUND(6),
        USER_REGISTER_INUSE(7),
        USER_LINK_INUSE(8),
        USER_LINK_PROVIDER_UNAVAILABLE(9),
        USER_UNLINK_DISALLOWED(10),
        USER_HANDLE_INUSE(11),
        GROUP_NAME_INUSE(12),
        GROUP_LAST_ADMIN(13),
        STORAGE_REJECTED(14),
        MATCH_NOT_FOUND(15),
        RUNTIME_FUNCTION_NOT_FOUND(16),
        RUNTIME_FUNCTION_EXCEPTION(17);

        private final int code;
    }

    /**
     * @return The code for the error.
     */
    abstract ErrorCode getCode();
}
