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

public interface TopicJoinMessage extends CollatedMessage<ResultSet<Topic>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static TopicJoinMessage.Builder newBuilder() {
            return new TopicJoinMessage.Builder(com.heroiclabs.nakama.Api.TTopicsJoin.newBuilder());
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TTopicsJoin.Builder joins;

        public TopicJoinMessage.Builder topicDirectMessage(final @NonNull String userId) {
            com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.Builder topicJoinBuilder = com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.newBuilder();
            topicJoinBuilder.setUserId(userId);
            joins.addJoins(topicJoinBuilder);
            return this;
        }

        public TopicJoinMessage.Builder topicRoom(final @NonNull String room) {
            com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.Builder topicJoinBuilder = com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.newBuilder();
            topicJoinBuilder.setRoom(room);
            joins.addJoins(topicJoinBuilder);
            return this;
        }

        public TopicJoinMessage.Builder topicGroup(final @NonNull String groupId) {
            com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.Builder topicJoinBuilder = com.heroiclabs.nakama.Api.TTopicsJoin.TopicJoin.newBuilder();
            topicJoinBuilder.setGroupId(groupId);
            joins.addJoins(topicJoinBuilder);
            return this;
        }

        public TopicJoinMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setTopicsJoin(joins);
            return new DefaultTopicJoinMessage(payload);
        }

    }
}
