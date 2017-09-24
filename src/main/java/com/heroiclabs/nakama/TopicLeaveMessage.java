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

public interface TopicLeaveMessage extends CollatedMessage<Boolean> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static TopicLeaveMessage.Builder newBuilder() {
            return new TopicLeaveMessage.Builder(com.heroiclabs.nakama.Api.TTopicsLeave.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TTopicsLeave.Builder leaves;

        public TopicLeaveMessage.Builder Leave(final @NonNull TopicId topicId) {
            com.heroiclabs.nakama.Api.TTopicsLeave.Builder topicLeave = com.heroiclabs.nakama.Api.TTopicsLeave.newBuilder();
            com.heroiclabs.nakama.Api.TopicId.Builder topicBuilder = null;
            switch (topicId.getTopicType()) {
                case Room:
                    topicBuilder = com.heroiclabs.nakama.Api.TopicId.newBuilder().setRoom(ByteString.copyFrom(topicId.getId()));
                    break;
                case Group:
                    topicBuilder = com.heroiclabs.nakama.Api.TopicId.newBuilder().setGroupId(ByteString.copyFrom(topicId.getId()));
                    break;
                case DirectMessage:
                    topicBuilder = com.heroiclabs.nakama.Api.TopicId.newBuilder().setDm(ByteString.copyFrom(topicId.getId()));
                    break;
            }
            topicLeave.addTopics(topicBuilder);
            return this;
        }

        public TopicLeaveMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setTopicsLeave(leaves);
            return new DefaultTopicLeaveMessage(payload);
        }

    }
}
