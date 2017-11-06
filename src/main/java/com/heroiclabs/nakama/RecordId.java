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

/**
 * The composite identifier which represents a record from the storage engine.
 */
public interface RecordId {
    /**
     * @return The bucket (namespace) for the collections of records.
     */
    String getBucket();

    /**
     * @return The collection the record belongs within.
     */
    String getCollection();

    /**
     * @return The key of the record.
     */
    String getKey();

    /**
     * @return The version of the record which has been fetched.
     */
    String getVersion();
}
