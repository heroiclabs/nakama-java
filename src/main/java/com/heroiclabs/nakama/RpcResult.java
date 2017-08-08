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

/**
 * The result of an RPC call to the code runtime in the server.
 */
public interface RpcResult {
    /**
     * @return The Id of the RPC function which was registered in the server.
     */
    String getId();

    /**
     * @return The payload result sent back from the function call. May be {@code null}.
     */
    byte[] getPayload();

    /**
     * @param clazz A hint for the type of the class.
     * @param <T> A type parameter for the payload to decode.
     * @return The decoded payload from the RPC call.
     */
    <T> T getPayload(final Class<T> clazz);
}
