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
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import okio.ByteString;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DefaultCursor implements Cursor {

    private final byte[] value;

    public String serialize() {
        return ByteString.of(value).base64();
    }

    /**
     * @param serializedCursor Restore a cursor which has been stored with {@code serialize()}.
     * @return A new cursor which was stored.
     */
    public static Cursor restore(final String serializedCursor) {
        final byte[] cursor = ByteString.decodeBase64(serializedCursor).toByteArray();
        return new DefaultCursor(cursor);
    }
}
