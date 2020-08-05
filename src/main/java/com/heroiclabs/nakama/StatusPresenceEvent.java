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
 * A status update event about other users who've come online or gone offline.
 */
public class StatusPresenceEvent {

    /**
     * Presences of users who joined the server.
     *This join information is in response to a subscription made to be notified when a user comes online.
     */
    private List<UserPresence> joins;

    /**
     * Presences of users who left the server.
     * This leave information is in response to a subscription made to be notified when a user goes offline.
     */
    private List<UserPresence> leaves;
}
