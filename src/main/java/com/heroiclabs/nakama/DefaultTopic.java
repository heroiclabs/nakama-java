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
class DefaultTopic implements Topic {
    private final TopicId topicId;
    private final List<UserPresence> presences;
    private final UserPresence self;

    static Topic fromProto(final @NonNull com.heroiclabs.nakama.Api.TTopics.Topic topic) {
        List<UserPresence> userPresences = new ArrayList<UserPresence>();
        for (com.heroiclabs.nakama.Api.UserPresence u : topic.getPresencesList()) {
            userPresences.add(DefaultUserPresence.fromProto(u));
        }

        return new DefaultTopic(DefaultTopicId.fromProto(topic.getTopic()), userPresences, DefaultUserPresence.fromProto(topic.getSelf()));
    }
}
