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

public interface NotificationsListMessage extends CollatedMessage<ResultSet<Notification>> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static NotificationsListMessage.Builder newBuilder(final long limit) {
            return new NotificationsListMessage.Builder(com.heroiclabs.nakama.Api.TNotificationsList.newBuilder()
                    .setLimit(limit));
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TNotificationsList.Builder list;

        public NotificationsListMessage.Builder cursor(final @NonNull Cursor cursor) {
            this.list.setResumableCursor(cursor.getValue());
            return this;
        }

        public NotificationsListMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setNotificationsList(list);
            return new DefaultNotificationsListMessage(payload);
        }
    }

}
