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

import com.google.common.util.concurrent.ListenableFuture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SessionTest {
    private Client client;

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
    }

    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testSessionSuccessful() throws Exception {
        final ListenableFuture<Session> future = client.authenticateCustom(UUID.randomUUID().toString());
        final Session session = future.get();
        Assert.assertNotNull(session);
        Assert.assertNotNull(session.getAuthToken());
        Assert.assertNotEquals("", session.getAuthToken());

        Assert.assertNotNull(session.getUserId());
        Assert.assertNotEquals("", session.getUserId());

        Assert.assertNotNull(session.getUsername());
        Assert.assertNotEquals("", session.getUsername());

        Assert.assertNotEquals(0, session.getCreateTime());
        Assert.assertNotEquals(0, session.getExpireTime());
    }
}
