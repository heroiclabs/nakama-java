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

public interface TopicMessage {
    enum TopicMessageType {
        Chat,
        GroupJoin,
        GroupAdd,
        GroupLeave,
        GroupKick,
        GroupPromoted;

        static TopicMessageType fromProto(int type) {
            switch(type) {
                case 0:
                    return TopicMessageType.Chat;
                case 1:
                    return TopicMessageType.GroupJoin;
                case 2:
                    return TopicMessageType.GroupAdd;
                case 3:
                    return TopicMessageType.GroupLeave;
                case 4:
                    return TopicMessageType.GroupKick;
                case 5:
                    return TopicMessageType.GroupPromoted;
            }

            return null;
        }
    }

    /**
     * @returns Topic ID associated with this message
     */
    TopicId getTopic();

    /**
     * @returns User ID associcated with this message
     */
    byte[] getUserId();

    /**
     * @returns Message ID
     */
    byte[] getMessageId();

    /**
     * @returns When message was created
     */
    long getCreatedAt();

    /**
     * @returns When message expires
     */
    long getExpiresAt();

    /**
     * @returns User Handle associated with this message
     */
    String getHandle();

    /**
     * @returns Message Type
     */
    TopicMessageType getType();

    /**
     * @returns Data in the message
     */
    byte[] getData();
}
