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

import lombok.*;

import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
/**
 * A batch of joins and leaves on the low level stream.
 * Streams are built on to provide abstractions for matches, chat channels, etc. In most cases you'll never need to
 * interact with the low level stream itself.
 */
public class StreamPresenceEvent {
    /**
     * Presences of users who joined the stream.
     */
    private List<UserPresence> leaves;

    /**
     * Presences of users who left the stream.
     */
    private List<UserPresence> joins;

    /**
     * The identifier for the stream.
     */
    private Stream stream;
}
