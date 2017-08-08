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

import java.util.List;

/**
 * The user which represents yourself in the server.
 */
public interface Self extends User {
    /**
     * @return The custom Id linked with the user.
     */
    String getCustomId();

    /**
     * @return A list of device Ids linked with the user.
     */
    List<String> getDeviceIds();

    /**
     * @return The email address linked with the user.
     */
    String getEmail();

    /**
     * @return The Facebook Id linked with the user.
     */
    String getFacebookId();

    /**
     * @return The Game Center Id linked with the user.
     */
    String getGameCenterId();

    /**
     * @return The Google Id linked with the user.
     */
    String getGoogleId();

    /**
     * @return The Steam Id linked with the user.
     */
    String getSteamId();

    /**
     * @return True if the email address for the user is verified.
     */
    boolean isVerified();
}
