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

import java.util.Map;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
/**
 * The user with the parameters they sent to the server when asking for opponents.
 */
public class MatchmakerUser {
    /**
     * The numeric properties which this user asked to matchmake with.
     */
    private Map<String, Double> numericProperties;
    /**
     * The presence of the user.
     */
    private UserPresence presence;
    /**
     * The string properties which this user asked to matchmake with.
     */
    private Map<String, String> stringProperties;
}
