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

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public interface TopicMessageSendMessage extends CollatedMessage<TopicMessageAck> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static TopicMessageSendMessage build(final @NonNull TopicId topicId, final @NonNull String data) {
            com.heroiclabs.nakama.Api.TTopicMessageSend.Builder msg = com.heroiclabs.nakama.Api.TTopicMessageSend.newBuilder();

            msg.setData(data);
            switch (topicId.getTopicType()) {
                case Room:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setRoom(topicId.getId()));
                    break;
                case Group:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setGroupId(topicId.getId()));
                    break;
                case DirectMessage:
                    msg.setTopic(com.heroiclabs.nakama.Api.TopicId.newBuilder().setDm(topicId.getId()));
                    break;
            }

            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setTopicMessageSend(msg);
            return new DefaultTopicMessageSendMessage(payload);
        }

    }
}
