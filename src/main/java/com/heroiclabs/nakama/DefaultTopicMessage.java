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
public class DefaultTopicMessage implements TopicMessage {
    private final TopicId topic;
    private final byte[] userId;
    private final byte[] messageId;
    private final long createdAt;
    private final long expiresAt;
    private final String handle;
    private final TopicMessageType type;
    private final byte[] data;

    static DefaultTopicMessage fromProto(final @NonNull com.heroiclabs.nakama.Api.TopicMessage message) {
        return new DefaultTopicMessage(
                DefaultTopicId.fromProto(message.getTopic()),
                message.getUserId().toByteArray(),
                message.getMessageId().toByteArray(),
                message.getCreatedAt(),
                message.getExpiresAt(),
                message.getHandle(),
                TopicMessageType.fromProto((int)message.getType()),
                message.getData().toByteArray()
        );
    }
}
