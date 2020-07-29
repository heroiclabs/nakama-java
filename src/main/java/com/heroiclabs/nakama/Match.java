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
 * A multiplayer match.
 */
public class Match {
    /**
     * True if this match has an authoritative handler on the server.
     */
    private boolean authoritative;
    /**
     * The unique match identifier.
     */
    private String matchId;
    /**
     * A label for the match which can be filtered on.
     */
    private String label;
    /**
     * The presences already in the match.
     */
    private List<UserPresence> presences;
    /**
     * The number of users currently in the match.
     */
    private int size;
    /**
     * The current user in this match. i.e. Yourself.
     */
    private UserPresence self;
}
