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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class AuthenticateTest {
    private Client client;

    @Before
    public void init() {
        client = new DefaultClient("defaultkey");
        Assert.assertNotNull(client);
    }

    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testDevice() throws Exception {
        final ListenableFuture<Session> future = client.authenticateDevice(UUID.randomUUID().toString());
        Assert.assertNotNull(future);
        Assert.assertNotNull(future.get());

    }

    @Test
    public void testCustom() throws Exception {
        final ListenableFuture<Session> future = client.authenticateCustom(UUID.randomUUID().toString());
        Assert.assertNotNull(future);
        Assert.assertNotNull(future.get());
    }

    @Test
    public void testCustomVars() throws Exception {
        final Map<String, String> vars = new HashMap<>();
        vars.put("hello", "world");
        final ListenableFuture<Session> future = client.authenticateCustom(UUID.randomUUID().toString(), vars);
        Assert.assertNotNull(future);
        final Session session = future.get();
        Assert.assertNotNull(session);
        final Map<String, String> sessionVars = session.getVars();
        Assert.assertNotNull(sessionVars);
        Assert.assertEquals("world", sessionVars.get("hello"));
    }
}
