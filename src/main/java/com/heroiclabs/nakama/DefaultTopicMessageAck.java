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

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultTopicMessageAck implements TopicMessageAck {
    private final String messageId;
    private final String handle;
    private final long createdAt;
    private final long expiresAt;

    static TopicMessageAck fromProto(final @NonNull com.heroiclabs.nakama.Api.TTopicMessageAck ack) {
        return new DefaultTopicMessageAck(ack.getMessageId(), ack.getHandle(), ack.getCreatedAt(), ack.getExpiresAt());
    }
}
