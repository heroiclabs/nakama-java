/*
 * Copyright 2023 The Nakama Authors
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

package com.heroiclabs.satori;

import org.junit.Assert;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.util.concurrent.ListenableFuture;

import com.heroiclabs.satori.api.*;

public class SatoriTest {
    private Client client;

    @Before
    public void init() {
        client = new DefaultClient("bb4b2da1-71ba-429e-b5f3-36556abbf4c9", "127.0.0.1", 7449, false);
    }

    @Test
    public void testAuthenticate() throws Exception {
        final Session session = client.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Assert.assertNotNull(session);
        Assert.assertNotNull(session.getRefreshToken());
        Assert.assertNotNull(session.getAuthToken());
    }

    @Test
    public void testLogout() throws Exception {
        final Session session = client.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Assert.assertNotNull(session);
        client.authenticateLogout(session).get();
        Assert.assertThrows(Exception.class, () -> client.getFlags(session, new String[]{}).get());
    }

    @Test
    public void testGetExperiments() throws Exception {
        final Session session = client.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        final ExperimentList experimentList = client.getAllExperiments(session).get();
        Assert.assertTrue(experimentList.getExperiments().length() == 1);
    }


    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }
}
