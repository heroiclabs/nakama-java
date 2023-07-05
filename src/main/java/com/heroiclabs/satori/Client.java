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

import lombok.NonNull;
import satori.api.SatoriOuterClass.ExperimentList;
import satori.api.SatoriOuterClass.Flag;
import satori.api.SatoriOuterClass.FlagList;
import satori.api.SatoriOuterClass.LiveEventList;
import satori.api.SatoriOuterClass.Properties;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A client for the API in the Satori server.
 */
public interface Client {

    /**
     * Disconnects the client. This function kills all outgoing exchanges and waits until the channel is shutdown.
     */
    void disconnect(final long timeout, @NonNull final TimeUnit unit) throws InterruptedException;

    /**
     * Disconnects the client. This function kills all outgoing exchanges immediately without waiting.
     */
    void disconnect();

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
     * @param defaultValue The default value if the server is unreachable.
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
     * Update or create properties for an identity.
     * @param session The session of the user.
     * @param properties The properties to update or create.
     * @return A future object.
     */
    public ListenableFuture<Empty> updateProperties(@NonNull final Session session, @NonNull final Map<String, String> defaultProperties, @NonNull final Map<String, String> customProperties);

    /**
     * Delete the caller's identity and associated data.
     * @param session The session of the user.
     * @return A future object.
     */
    ListenableFuture<Empty> deleteIdentity(@NonNull Session session);

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
}
