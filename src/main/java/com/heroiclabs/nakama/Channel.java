/*
 * Copyright 2018 The Nakama Authors
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

enum ChannelType {
    ROOM(0),
    DIRECT_MESSAGE(1),
    GROUP(2);

    private final int value;
    ChannelType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Channel {
    private String id;
    private List<UserPresence> presences;
    private UserPresence self;
}
