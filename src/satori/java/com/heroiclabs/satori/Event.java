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

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.jetbrains.annotations.NotNull;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * An event to be published to the server.
 */
@EqualsAndHashCode
@ToString
public class Event {
    private final String name;
    private final Instant timestamp;
    private final String value;
    private final Map<String, String> metadata;
    private final String id;

    /**
     * The event constructor.
     * @param name The name of the event.
     * @param timestamp The time when the event was triggered.
     * @param value Optional value.
     * @param metadata Event metadata, if any.
     * @param id Optional event ID assigned by the client, used to de-duplicate in retransmission scenarios.
     *           If not supplied the server will assign a randomly generated unique event identifier.
     */
    public Event(@NotNull final String name, @NotNull final Instant timestamp, @NotNull final String value, final Map<String, String> metadata, final String id) {
        this.name = name;
        this.timestamp = timestamp;
        this.value = value;
        this.metadata = metadata == null ? new HashMap<>() : new HashMap<>(metadata);
        this.id = id;
    }

    /**
     * The event constructor.
     * @param name The name of the event.
     * @param timestamp The time when the event was triggered.
     * @param value Optional value.
     * @param metadata Event metadata, if any.
    */
    public Event(@NotNull final String name, @NotNull final Instant timestamp, @NotNull final String value, final Map<String, String> metadata) {
        this.name = name;
        this.timestamp = timestamp;
        this.value = value;
        this.metadata = metadata == null ? new HashMap<>() : new HashMap<>(metadata);
        this.id = "";
    }

    /**
     * The name of the event.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * The time when the event was triggered.
     * @return timestamp
     */
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Optional value.
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Event metadata, if any.
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }

    /**
     * Optional event ID assigned by the client, used to de-duplicate in retransmission scenarios.
     * @return id
     */
    public String getId() {
        return id;
    }
}