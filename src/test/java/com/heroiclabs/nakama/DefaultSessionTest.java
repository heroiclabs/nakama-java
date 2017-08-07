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

import org.junit.Assert;
import org.junit.Test;

public final class DefaultSessionTest {

    private static final String JWT_TOKEN =
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." +
            "eyJleHAiOjE1MDIxMTQzOTEsImhhbiI6IlhhRlRBVnNKUWYiLCJ1aWQiOiJmMTNhYzczYS05MDRhLTQ1Y2UtODdmNi1lZjJkYjM3ZmY5MWEifQ." +
            "54XAbZr5zFT658wy2OEQXZeOHsEH9kdC3IuHpQontkk";

    private static final String JWT_TOKEN_HANDLE = "XaFTAVsJQf";

    private static final byte[] JWT_TOKEN_ID = "f13ac73a-904a-45ce-87f6-ef2db37ff91a".getBytes();

    @Test
    public void sessionRestore() {
        Session session = DefaultSession.restore(JWT_TOKEN);

        Assert.assertEquals(JWT_TOKEN, session.getToken());
        Assert.assertEquals(JWT_TOKEN_HANDLE, session.getHandle());
        Assert.assertArrayEquals(JWT_TOKEN_ID, session.getId());
    }

    @Test
    public void checkSessionHasExpired() {
        Session session = DefaultSession.restore(JWT_TOKEN);

        Assert.assertTrue(session.isExpired(System.currentTimeMillis()));
    }

}
