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

import com.google.protobuf.Empty;
import org.junit.Assert;

import java.time.Duration;
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

        final Session session2 = httpClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Assert.assertNotNull(session2);
        httpClient.authenticateLogout(session2).get();
        Assert.assertThrows(Exception.class, () -> httpClient.getFlags(session2, new String[]{}).get());
    }

    @Test
    public void testGetExperiments() throws Exception {
        Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        ExperimentList experimentList = grpcClient.getAllExperiments(session).get();
        Assert.assertEquals(1, experimentList.getExperimentsCount());

        session = httpClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        experimentList = httpClient.getAllExperiments(session).get();
        Assert.assertEquals(1, experimentList.getExperimentsCount());
    }

    @Test
    public void testGetFlags() throws Exception {
        Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        FlagList flagList = grpcClient.getFlags(session).get();
        Assert.assertEquals(3, flagList.getFlagsCount());

        session = httpClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        flagList = httpClient.getFlags(session).get();
        Assert.assertEquals(3, flagList.getFlagsCount());
    }

    @Test
    public void testGetFlag() throws Exception {
        Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Flag flag = grpcClient.getFlag(session, "MinBuildNumber").get();
        Assert.assertNotNull(flag);

        session = httpClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        flag = httpClient.getFlag(session, "MinBuildNumber").get();
        Assert.assertNotNull(flag);
    }

    @Test
    public void testGetFlagDefaultValue() throws Exception {
        String bogusAuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzaWQiOiJmYTk1NDkxMS0xOGQ5LTQyODAtYTQ5ZC0yOGVmODAzNTdlNGUiLCJpaWQiOiIwNTk1MzAxNy00ODY4LTQ2MDQtYjM2Ni1kZWMxZWUyZjIyYWEiLCJleHAiOjE2ODk2OTYzNjQsImlhdCI6MTY4OTY5Mjc2NCwiYXBpIjoiYW5kcm9pZCJ9.J_KohdF3A_huhim8w9OUxVQ18UcCrmeUZeBkwgaSBwU";
        String bogusRefreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzaWQiOiJmYTk1NDkxMS0xOGQ5LTQyODAtYTQ5ZC0yOGVmODAzNTdlNGUiLCJpaWQiOiIwNTk1MzAxNy00ODY4LTQ2MDQtYjM2Ni1kZWMxZWUyZjIyYWEiLCJleHAiOjE2ODk2OTYzNjQsImlhdCI6MTY4OTY5Mjc2NH0.6K3WoIg1RsSI1Uwfqn6EPg5Kum7VLwq_eu0Inwl4nMk";

        Client grpcClientNoNetwork = new DefaultClient("bb4b2da1-71ba-429e-b5f3-36556abbf4c9", "0.0.0.0", 7449, false);
        Flag flag = grpcClientNoNetwork.getFlag(new DefaultSession(bogusAuthToken, bogusRefreshToken), "MinBuildNumber", "true").get();
        Assert.assertNotNull(flag);
        Assert.assertEquals("true", flag.getValue());

        Client httpClientNoNetwork = new HttpClient("bb4b2da1-71ba-429e-b5f3-36556abbf4c9", "0.0.0.0", 7450, false);
        flag = httpClientNoNetwork.getFlag(new DefaultSession(bogusAuthToken, bogusRefreshToken), "MinBuildNumber", "true").get();
        Assert.assertNotNull(flag);
        Assert.assertEquals("true", flag.getValue());
    }

    @Test
    public void testDeleteIdentity() throws Exception {
        Session session = grpcClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        Empty empty = grpcClient.deleteIdentity(session).get();
        Assert.assertNotNull(empty);

        session = httpClient.authenticate(UUID.randomUUID().toString(), new HashMap<String, String>(), new HashMap<String, String>()).get();
        empty = httpClient.deleteIdentity(session).get();
        Assert.assertNotNull(empty);
    }

    @Test
    public void testFromSigningKeySession() throws Exception {
        Duration d = Duration.ofDays(1);
        Session session = DefaultSession.fromSigningKey("defaultsigningkey", "default", "21052f26-2a06-11ee-99bf-637d1a117e47", d);

        FlagList flagList = httpClient.getFlags(session).get();
        Assert.assertNotNull(flagList);
    }

    @Test
    public void testRestore() throws Exception {
        Duration d = Duration.ofDays(1);
        Session session1 = DefaultSession.fromSigningKey("defaultsigningkey", "default", "21052f26-2a06-11ee-99bf-637d1a117e47", d);
        Session session2 = DefaultSession.restore(session1.getAuthToken(), null);

        Assert.assertNotNull(session2);
        Assert.assertEquals(session1.getIdentityId(), session2.getIdentityId());
        Assert.assertEquals(session1.getExpireTime(), session2.getExpireTime());
    }
    @After
    public void shutdown() throws Exception {
        grpcClient.disconnect(5000, TimeUnit.MILLISECONDS);
    }
}

