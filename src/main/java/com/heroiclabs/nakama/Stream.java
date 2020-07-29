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

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)

/**
 * A realtime socket stream on the server.
 */
public class Stream {

    /**
     * The descriptor of the stream. Used with direct chat messages and contains a second user id.
     */
    private String descriptor;

    /**
     * Identifies streams which have a context across users like a chat channel room.
     */
    private String label;

    /**
     * The mode of the stream.
     */
    private int mode;

    /**
     * The subject of the stream. This is usually a user id.
     */
    private String subject;
}
