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

public interface TopicMessagesListMessage extends CollatedMessage<ResultSet<TopicMessage>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static TopicMessagesListMessage.Builder newBuilder() {
            return new TopicMessagesListMessage.Builder(com.heroiclabs.nakama.Api.TTopicMessagesList.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TTopicMessagesList.Builder lists;

        public TopicMessagesListMessage.Builder forward(final @NonNull boolean forward) {
            lists.setForward(forward);
            return this;
        }

        public TopicMessagesListMessage.Builder cursor(final @NonNull Cursor cursor) {
            lists.setCursor(ByteString.copyFrom(cursor.getValue()));
            return this;
        }

        public TopicMessagesListMessage.Builder limit(final @NonNull long limit) {
            lists.setLimit(limit);
            return this;
        }

        public TopicMessagesListMessage.Builder topicDirectMessage(final @NonNull byte[] userId) {
            lists.setUserId(ByteString.copyFrom(userId));
            return this;
        }

        public TopicMessagesListMessage.Builder topicRoom(final @NonNull byte[] room) {
            lists.setRoom(ByteString.copyFrom(room));
            return this;
        }

        public TopicMessagesListMessage.Builder topicGroup(final @NonNull byte[] groupId) {
            lists.setGroupId(ByteString.copyFrom(groupId));
            return this;
        }

        public TopicMessagesListMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setTopicMessagesList(lists);
            return new DefaultTopicMessagesListMessage(payload);
        }

    }

}
