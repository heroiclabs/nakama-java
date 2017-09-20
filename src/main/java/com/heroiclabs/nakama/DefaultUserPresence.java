/*
 * Copyright 2017 The Nakama Authors
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

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultUserPresence implements UserPresence {
    private final byte[] userId;
    private final byte[] sessionId;
    private final String handle;

    static DefaultUserPresence fromProto(final @NonNull com.heroiclabs.nakama.Api.UserPresence presence) {
        return new DefaultUserPresence(presence.getUserId().toByteArray(), presence.getSessionId().toByteArray(), presence.getHandle());
    }
}