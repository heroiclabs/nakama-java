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

import com.google.protobuf.ByteString;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public interface TopicMessageSendMessage extends CollatedMessage<TopicMessageAck> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static TopicMessageSendMessage build(final @NonNull TopicId topicId, final @NonNull byte[] data) {
            com.heroiclabs.nakama.Api.TTopicMessageSend.Builder msg = com.heroiclabs.nakama.Api.TTopicMessageSend.newBuilder();

            msg.setData(ByteString.copyFrom(data));
            switch (topicId.getTopicType()) {
                case Room:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setRoom(ByteString.copyFrom(topicId.getId())));
                    break;
                case Group:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setGroupId(ByteString.copyFrom(topicId.getId())));
                    break;
                case DirectMessage:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setDm(ByteString.copyFrom(topicId.getId())));
                    break;
            }

            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setTopicMessageSend(msg);
            return new DefaultTopicMessageSendMessage(payload);
        }

    }
}
