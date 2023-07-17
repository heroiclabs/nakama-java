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
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.heroiclabs.satori.api.*;

public class SatoriTest {
    private Client grpcClient, httpClient;

    @Before
    public void init() {
        grpcClient = new DefaultClient("bb4b2da1-71ba-429e-b5f3-36556abbf4c9", "127.0.0.1", 7449, false);
        httpClient = new HttpClient("bb4b2da1-71ba-429e-b5f3-36556abbf4c9", "127.0.0.1", 7450, false);
    }

    @Test
    public void testAuthenticate() throws Exception {
        Map<String, String> props = new HashMap<String, String>() {{
            put("region", "EU");
            put("language", "en");
        }};
        Session session = grpcClient.authenticate(UUID.randomUUID().toString(), props, new HashMap<>()).get();
        Assert.assertNotNull(session);
        Assert.assertNotNull(session.getRefreshToken());
        Assert.assertNotNull(session.getAuthToken());
        session = httpClient.authenticate(UUID.randomUUID().toString(), props, new HashMap<>()).get();
        Assert.assertNotNull(session);
        Assert.assertNotNull(session.getRefreshToken());
        Assert.assertNotNull(session.getAuthToken());
    }

    @Test
    public void testLogout() throws Exception {
        final Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Assert.assertNotNull(session);
        grpcClient.authenticateLogout(session).get();
        Assert.assertThrows(Exception.class, () -> grpcClient.getFlags(session, new String[]{}).get());
    }

    @Test
    public void testGetExperiments() throws Exception {
        final Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        final ExperimentList experimentList = grpcClient.getAllExperiments(session).get();
        Assert.assertTrue(experimentList.getExperimentsCount() == 1);
    }

    @Test
    public void testGetFlag() throws Exception {
        final Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        final Flag flag = grpcClient.getFlag(session, "MinBuildNumber").get();
        Assert.assertNotNull(flag);
    }


    @After
    public void shutdown() throws Exception {
        grpcClient.disconnect(5000, TimeUnit.MILLISECONDS);
    }
}

