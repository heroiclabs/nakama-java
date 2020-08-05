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
 * A state change received from a stream.
 */
public class StreamData {
    /**
     * The user who sent the state change. May be <c>null</c>.
     */
    private UserPresence sender;

    /**
     * The contents of the state change.
     */
    private String data;

    /**
     * The identifier for the stream.
     */
    private Stream stream;

    /**
     * True if this data was delivered reliably, false otherwise.
     */
    private boolean reliable;
}
