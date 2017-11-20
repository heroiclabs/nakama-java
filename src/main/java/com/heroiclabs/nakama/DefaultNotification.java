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
class DefaultNotification implements Notification {
    private final String id;
    private final String subject;
    private final String content;
    private final long code;
    private final String senderId;
    private final long createdAt;
    private final long expiresAt;
    private final boolean persistent;

    static Notification fromProto(final @NonNull com.heroiclabs.nakama.Api.Notification notification) {
        return new DefaultNotification(notification.getId(), notification.getSubject(), notification.getContent(),
                notification.getCode(), notification.getSenderId(), notification.getCreatedAt(),
                notification.getExpiresAt(), notification.getPersistent());
    }

}
