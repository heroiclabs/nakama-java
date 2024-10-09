/*
 * Copyright 2020 The Nakama Authors
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
    Error(final @NonNull String message) {
        super(message);
    }

    /**
     * @param message The error message to construct with.
     */
    Error(final @NonNull String message, final @NonNull Throwable cause) {
        super(message, cause);
    }

    /**
     * The error code for the problem.
     */
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public enum ErrorCode {
        UNKNOWN(0),
        RUNTIME_EXCEPTION(1),
        UNRECOGNISED_PAYLOAD(2),
        MISSING_PAYLOAD(3),
        BAD_INPUT(4),
        MATCH_NOT_FOUND(5),
        MATCH_JOIN_REJECTED(6),
        RUNTIME_FUNCTION_NOT_FOUND(7),
        RUNTIME_FUNCTION_EXCEPTION(8);

        private final int code;

        static ErrorCode fromInt(final int code) {
            switch (code) {
                case 0:
                    return RUNTIME_EXCEPTION;
                case 1:
                    return UNRECOGNISED_PAYLOAD;
                case 2:
                    return MISSING_PAYLOAD;
                case 3:
                    return BAD_INPUT;
                case 4:
                    return MATCH_NOT_FOUND;
                case 5:
                    return MATCH_JOIN_REJECTED;
                case 6:
                    return RUNTIME_FUNCTION_NOT_FOUND;
                case 7:
                    return RUNTIME_FUNCTION_EXCEPTION;
                default:
                    return UNKNOWN;
            }
        }
    }

    /**
     * @return The code for the error.
     */
    public abstract ErrorCode getCode();

    /**
     * @return The collation ID associated with this error. Could be null.
     */
    public abstract String getCollationId();
}