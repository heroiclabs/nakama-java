/*
 * Copyright 2023 The Satori Authors
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

package com.heroiclabs.satori;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Empty;
import com.heroiclabs.satori.api.*;

import lombok.NonNull;
import org.checkerframework.checker.units.qual.N;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A client for the API in the Satori server.
 */
public interface Client {

    /**
     * Authenticate against the server.
     * @param id An optional user id.
     * @param defaultProperties Optional default properties to update with this call. If not set, properties are left as they are on the server.
     * @param customProperties Optional custom properties to update with this call. If not set, properties are left as they are on the server.
     * @return A future which resolves to a user session.
     */
    ListenableFuture<Session> authenticate(final String id, Map<String, String> defaultProperties, Map<String, String> customProperties);

    /**
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * @param session The session of the user.
     * @return A future object which represents the asynchronous operation.
     */
    ListenableFuture<Empty> authenticateLogout(@NonNull final Session session);

    /**
     * Delete the caller's identity and associated data.
     * @param session The session of the user.
     * @return A future object.
     */
    ListenableFuture<Empty> deleteIdentity(@NonNull Session session);

    /**
     * The request to delete a scheduled message.
     * @param session The session of the user.
     * @param messageId The ID of the message to delete.
     * @return A future object.
     */
    ListenableFuture<Empty> deleteMessage(@NonNull Session session, @NonNull final String messageId);

    /**
     * Disconnects the client. This function kills all outgoing exchanges immediately without waiting.
     */
    void disconnect();

    /**
     * Disconnects the client. This function kills all outgoing exchanges and waits until the channel is shutdown.
     */
    void disconnect(final long timeout, @NonNull final TimeUnit unit) throws InterruptedException;

    /**
     * Send an event for this session.
     * @param session The session of the user.
     * @param event The event to send.
     * @return A future object.
     */
    ListenableFuture<Empty> event(@NonNull final Session session, @NonNull final Event event);

    /**
     * Send a batch of events for this session.
     * @param session The session of the user.
     * @param events The batch of events which will be sent.
     * @return A future object.
     */
    ListenableFuture<Empty> events(@NonNull final Session session, @NonNull final List<Event> events);

    /**
     * Get all experiments data.
     * @param session The session of the user.
     * @return A future which resolves to all experiments that this identity is involved with.
     */
    ListenableFuture<ExperimentList> getAllExperiments(@NonNull final Session session);

    /**
     * Get specific experiments data.
     * @param session The session of the user.
     * @param names Experiment names.
     * @return A future which resolves to all experiments that this identity is involved with.
     */
    ListenableFuture<ExperimentList> getExperiments(@NonNull final Session session,  @NonNull final String... names);

    /**
     * Get a single flag for this identity.
     * @param session The session of the user.
     * @param name The name of the flag.
     * @param defaultValue The default value if the server is unreachable or the flag does not exist.
     * @return A future which resolves to a single feature flag.
     */
    ListenableFuture<Flag> getFlag(@NonNull Session session, @NonNull final String name, @NonNull final String defaultValue);

    /**
     * Get a single flag for this identity.
     * @param session The session of the user.
     * @param name The name of the flag.
     * @return A future which resolves to a single feature flag.
     */
    ListenableFuture<Flag> getFlag(@NonNull Session session, @NonNull final String name);

    /**
     * Get flags for this identity.
     * @param session The session of the user.
     * @param names The names of the flags.
     * @return A future which resolves to a list of feature flags.
     */
    ListenableFuture<FlagList> getFlags(@NonNull final Session session,  @NonNull final String... names);

    /**
     * List all available default flags.
     *
     * @param names Flag names, if empty all flags are returned.
     * @return A ListenableFuture which resolves to all available default flags.
     */
    public ListenableFuture<FlagList> getFlagsDefault(final String... names);

    /**
     * Get a single default flag for this identity.
     *
     * @param name The name of the flag.
     * @return A ListenableFuture which resolves to a single default feature flag.
     */
    ListenableFuture<Flag> getFlagDefault(@NonNull final String name);

    /**
     * Get a single default flag for this identity.
     * Unlike {@link #getFlagDefault(String)} this method will return the default
     * value specified and will not raise an exception if the network is unreachable.
     *
     * @param name The name of the flag.
     * @param defaultValue The default value if the server is unreachable or the flag does not exist.
     * @return A ListenableFuture which resolves to a single default feature flag.
     */
    ListenableFuture<Flag> getFlagDefault(@NonNull final String name, @NonNull final String defaultValue);

    /**
     * Get live events.
     * @param session The session of the user.
     * @param names The live events to get. Returns all live events if none are supplied.
     * @return A future which resolves to a list of live events.
     */
    ListenableFuture<LiveEventList> getLiveEvents(@NonNull final Session session, String... names);

    /**
     * Get the list of messages for the identity.
     * @param session The session of the user.
     * @return A future which resolves to all messages.
     */
    ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session);

    /**
     * Get the list of messages for the identity.
     * @param session The session of the user.
     * @param limit Max number of messages to return. Between 1 and 100.
     * @return A future which resolves to all messages.
     */
    ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, @NonNull final int limit);

    /**
     * Get the list of messages for the identity.
     * @param session The session of the user.
     * @param limit Max number of messages to return. Between 1 and 100.
     * @param forward True if listing should be older messages to newer, false if reverse.
     * @return A future which resolves to all messages.
     */
    ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, @NonNull final int limit, @NonNull final boolean forward);

    /**
     * Get the list of messages for the identity.
     * @param session The session of the user.
     * @param limit Max number of messages to return. Between 1 and 100.
     * @param forward True if listing should be older messages to newer, false if reverse.
     * @param cursor A pagination cursor.
     * @return A future which resolves to all messages.
     */
    ListenableFuture<GetMessageListResponse> getMessageList(@NonNull final Session session, @NonNull final int limit, @NonNull final boolean forward, @NonNull final String cursor);

    /**
     * List properties associated with this identity.
     *
     * @param session The session of the user.
     * @return A ListenableFuture which resolves to a list of live events.
     */
    ListenableFuture<Properties> listProperties(@NonNull final Session session);

    /**
     * Identify a session with a new ID.
     *
     * @param session The session of the user.
     * @param id Identity ID to enrich the current session and return a new session. The old session will
     * no longer be usable. Must be between eight and 128 characters (inclusive). Must be an alphanumeric string
     * with only underscores and hyphens allowed.
     * @param defaultProperties The default properties.
     * @param customProperties The custom event properties.
     * @return A ListenableFuture which resolves to the new session for the user.
     */
    ListenableFuture<Session> identify(@NonNull final Session session, @NonNull final String id, @NonNull final Map<String, String> defaultProperties,
                                            @NonNull final Map<String, String> customProperties);

    /**
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     *
     * @param session The session of the user.
     * @return A future which resolves to a user session.
     */
    ListenableFuture<Session> sessionRefresh(Session session);

    /**
     * The request to update the status of a message.
     * @param session The session of the user.
     * @param id The identifier of the message.
     * @param readTime The time the message was read at the client.
     * @return A future.
     */
    ListenableFuture<Empty> updateMessage(@NonNull final Session session, @NonNull final String id, @NonNull final long readTime);

    /**
     * The request to update the status of a message.
     * @param session The session of the user.
     * @param id The identifier of the message.
     * @param readTime The time the message was read at the client.
     * @param consumeTime The time the message was consumed by the identity.
     * @return A future.
     */
    ListenableFuture<Empty> updateMessage(@NonNull final Session session, @NonNull final String id, @NonNull final long readTime, @NonNull final long consumeTime);

    /**
     * Update or create properties for an identity.
     * @param session The session of the user.
     * @param defaultProperties The properties to update or create.
     * @param customProperties The properties to update or create.
     * @return A future object.
     */
    ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties);

    /**
     * Update or create properties for an identity.
     * @param session The session of the user.
     * @param defaultProperties The properties to update or create.
     * @param customProperties The properties to update or create.
     * @param recompute Informs the server to recompute the audience membership of the identity.
     * @return A future object.
     */
    ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties, @NonNull final boolean recompute);
}
