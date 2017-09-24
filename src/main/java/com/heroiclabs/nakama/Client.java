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

import com.stumbleupon.async.Deferred;

/**
 * A client for the Nakama server.
 */
public interface Client {
    /**
     * @return The current server time in UTC milliseconds as reported by the server
     *         during the last heartbeat exchange. If this client has never been
     *         connected the function returns local device current UTC milliseconds.
     */
    long serverTime();

    /**
     * @param message The {@code AuthenticateMessage} to send to the server.
     * @return A {@code Session} for the user.
     */
    Deferred<Session> login(AuthenticateMessage message);

    /**
     * @param message The {@code AuthenticateMessage} to send to the server.
     * @return A {@code Session} for the user.
     */
    Deferred<Session> register(AuthenticateMessage message);

    /**
     * @param session The {@code Session} to connect the socket with.
     * @return Placeholder return type to allow chaining operations.
     */
    Deferred<Session> connect(Session session);

    /**
     * @return Placeholder return type to allow chaining operations.
     */
    Deferred<Boolean> disconnect();

    /**
     * @return Placeholder return type to allow chaining operations.
     */
    Deferred<Boolean> logout();

    /**
     * @param message The message to send.
     * @param <T> The expected return type.
     * @return An instance of the expected return type.
     */
    <T> Deferred<T> send(CollatedMessage<T> message);

    /**
     * @param message The message to send.
     * @return Placeholder return type to allow chaining operations.
     */
    Deferred<Boolean> send(UncollatedMessage message);
}
