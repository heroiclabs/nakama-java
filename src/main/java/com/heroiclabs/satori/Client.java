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
import com.heroiclabs.nakama.api.Event;

import lombok.NonNull;
import satori.api.SatoriOuterClass.ExperimentList;
import satori.api.SatoriOuterClass.Flag;
import satori.api.SatoriOuterClass.FlagList;
import satori.api.SatoriOuterClass.LiveEventList;
import satori.api.SatoriOuterClass.Session;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
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
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to a user session.
     */
    ListenableFuture<Session> authenticate(final String id, Map<String, String> defaultProperties, Map<String, String> customProperties);

    /**
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * @param session The session of the user.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future object which represents the asynchronous operation.
     */
    ListenableFuture<Empty> authenticateLogout(@NonNull final Session session);

    /**
     * Send an event for this session.
     * @param session The session of the user.
     * @param event The event to send.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future object.
     */
    ListenableFuture<Empty> event(@NonNull final Session session, @NonNull final Event event);

    /**
     * Send a batch of events for this session.
     * @param session The session of the user.
     * @param events The batch of events which will be sent.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future object.
     */
    ListenableFuture<Empty> events(@NonNull final Session session, @NonNull final List<Event> events);

    /**
     * Get all experiments data.
     * @param session The session of the user.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to all experiments that this identity is involved with.
     */
    ListenableFuture<ExperimentList> getAllExperiments(@NonNull final Session session);

    /**
     * Get specific experiments data.
     * @param session The session of the user.
     * @param names Experiment names.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to all experiments that this identity is involved with.
     */
    ListenableFuture<ExperimentList> getExperiments(@NonNull Session session, final String... names);

    /**
     * Get a single flag for this identity.
     * @param session The session of the user.
     * @param name The name of the flag.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to a single feature flag.
     */
    ListenableFuture<Flag> getFlag(@NonNull Session session, String name);

    /**
     * Get flags for this identity.
     * @param session The session of the user.
     * @param names The names of the flags.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to a list of feature flags.
     */
    ListenableFuture<FlagList> getFlags(@NonNull Session session, final String... names);

    /**
     * Get all live events.
     * @param session The session of the user.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future which resolves to a list of all live events.
     */
    ListenableFuture<LiveEventList> getLiveEvents(@NonNull Session session);

    /**
     * Update or create properties for an identity.
     * @param session The session of the user.
     * @param properties The properties to update or create.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future object.
     */
    ListenableFuture<Empty> updateProperties(@NonNull Session session, Properties properties);

    /**
     * Delete the caller's identity and associated data.
     * @param session The session of the user.
     * @throws CancellationException can be used to cancel the request while mid-flight.
     * @return A future object.
     */
    ListenableFuture<Empty> deleteIdentity(@NonNull Session session);
}

