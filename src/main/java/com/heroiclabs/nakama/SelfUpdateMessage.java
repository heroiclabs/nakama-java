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

public interface SelfUpdateMessage extends CollatedMessage<Boolean> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        static Builder builder() {
            return new Builder(com.heroiclabs.nakama.Api.TSelfUpdate.newBuilder());
        }

        private final @NonNull com.heroiclabs.nakama.Api.TSelfUpdate.Builder update;

        public Builder handle(final @NonNull String handle) {
            update.setHandle(handle);
            return this;
        }

        public Builder fullname(final @NonNull String fullname) {
            update.setFullname(fullname);
            return this;
        }

        public Builder timezone(final @NonNull String timezone) {
            update.setTimezone(timezone);
            return this;
        }

        public Builder location(final @NonNull String location) {
            update.setLocation(location);
            return this;
        }

        public Builder lang(final @NonNull String lang) {
            update.setLang(lang);
            return this;
        }

        public Builder metadata(final @NonNull byte[] metadata) {
            update.setMetadata(ByteString.copyFrom(metadata));
            return this;
        }

        public Builder avatarUrl(final @NonNull String avatarUrl) {
            update.setAvatarUrl(avatarUrl);
            return this;
        }

        public SelfUpdateMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setSelfUpdate(update);
            return new DefaultSelfUpdateMessage(payload);
        }

    }

}
