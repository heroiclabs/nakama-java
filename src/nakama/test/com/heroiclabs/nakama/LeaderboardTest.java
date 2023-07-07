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

import com.google.gson.Gson;
import com.heroiclabs.nakama.api.LeaderboardRecord;
import com.heroiclabs.nakama.api.LeaderboardRecordList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class LeaderboardTest {
    private Client client;
    private Session session;

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
    }

    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testWriteAndListLeaderboard() throws Exception {
        final String rpcPayload = "{ \"operator\": \"set\" }";
        final String payload = client.rpc(session, "clientrpc.create_leaderboard", rpcPayload).get().getPayload();
        final Map<String, String> json = (new Gson()).fromJson(payload, Map.class);
        final String leaderboardId = json.get("leaderboard_id");
        final String metadata = "{\"tarmac\": \"wet\"}";

        LeaderboardRecord record = client.writeLeaderboardRecord(session, leaderboardId, 10, 20, metadata).get();
        Assert.assertNotNull(record);
        Assert.assertEquals(leaderboardId, record.getLeaderboardId());
        Assert.assertEquals(metadata, record.getMetadata());
        Assert.assertEquals(10, record.getScore());
        Assert.assertEquals(20, record.getSubscore());
        Assert.assertEquals(session.getUserId(), record.getOwnerId());
        Assert.assertEquals(session.getUsername(), record.getUsername().getValue());

        final LeaderboardRecordList records = client.listLeaderboardRecords(session, leaderboardId).get();
        Assert.assertNotNull(records);
        Assert.assertEquals(1, records.getRecordsList().size());

        record = records.getRecordsList().get(0);
        Assert.assertNotNull(record);
        Assert.assertEquals(leaderboardId, record.getLeaderboardId());
        Assert.assertEquals(metadata, record.getMetadata());
        Assert.assertEquals(10, record.getScore());
        Assert.assertEquals(20, record.getSubscore());
        Assert.assertEquals(session.getUserId(), record.getOwnerId());
        Assert.assertEquals(session.getUsername(), record.getUsername().getValue());
    }
}
