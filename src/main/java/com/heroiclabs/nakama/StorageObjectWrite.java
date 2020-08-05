/*
 * Copyright 2020 The Nakama Authors
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

import lombok.Data;

@Data
/**
 * An identifier and values for a storage object.
 */
public class StorageObjectWrite {
    /**
     * The collection which stores the object.
     */
    private final String collection;

    /**
     * The key of the object within the collection.
     */
    private final String key;

    /**
     * The actual content of the object. Must be JSON.
     */
    private final String value;

    /**
     * Read permission of the object.
     */
    private final PermissionRead permissionRead;

    /**
     * Write permission of the object.
     */
    private final PermissionWrite permissionWrite;

    /**
     * The version hash of the object to check against the server.
     */
    private String version;
}
