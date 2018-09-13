/*
 * Copyright 2018 The Nakama Authors
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
import com.heroiclabs.nakama.api.Tournament;
import com.heroiclabs.nakama.api.TournamentList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TournamentTest {
    private Client client;
    private Session session;
    private Gson gson = new Gson();

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
    public void testCreateTournamentAndTournamentDelete() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking best tournament duration 10s, no end";
        object.duration = 10;
        object.category = 5;
        object.join_required = true;
        object.operator = 0;
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = 1;
        object.title = "tournament-test";

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        TournamentList tournaments = client.listTournaments(session, true, 100, null).get();
        Tournament t = null;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                t = tt;
                break;
            }
        }

        Assert.assertNotNull(t);
        Assert.assertEquals(t.getId(), tournamentId);
        Assert.assertEquals(t.getSize(), 0);
        Assert.assertEquals(t.getCategory(), object.category);
        Assert.assertEquals(t.getDescription(), object.description);
        Assert.assertEquals(t.getTitle(), object.title);
        Assert.assertEquals(t.getEndTime().getSeconds(), 0);
        Assert.assertNotEquals(t.getCreateTime(), 0);
        Assert.assertTrue(t.getCanEnter());
        Assert.assertNotEquals(t.getEndActive(), 0);
        Assert.assertEquals(t.getNextReset(), 0);
        Assert.assertEquals(t.getMetadata(), "{}");
        Assert.assertEquals(t.getMaxSize(), object.max_size);
        Assert.assertEquals(t.getMaxNumScore(), object.max_num_score);

        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testTournamentWrite() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking best tournament duration 10s, no end";
        object.duration = 10;
        object.category = 6;
        object.join_required = true;
        object.operator = 0;
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = 1;
        object.title = "tournament-test";

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        int score = 10;
        int subscore = 20;
        final String metadata = "{\"tarmac\": \"wet\"}";
        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, score, subscore, metadata).get();
        Assert.assertEquals(record.getLeaderboardId(), tournamentId);
        Assert.assertEquals(record.getOwnerId(), session.getUserId());
        Assert.assertEquals(record.getUsername().getValue(), session.getUsername());
        Assert.assertNull(record.getExpiryTime());
        Assert.assertEquals(record.getScore(), score);
        Assert.assertEquals(record.getSubscore(), subscore);
        Assert.assertEquals(record.getMetadata(), metadata);
        Assert.assertEquals(record.getNumScore(), 1);
        Assert.assertEquals(record.getMaxNumScore(), object.max_num_score);
//        Assert.assertEquals(record.getRank(), 1);
        Assert.assertNotEquals(record.getCreateTime().getSeconds(), 0);
        Assert.assertNotEquals(record.getUpdateTime().getSeconds(), 0);

        TournamentList tournaments = client.listTournaments(session, true, session.getUserId(), 100, null).get();
        Tournament t = tournaments.getTournaments(0);
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                t = tt;
                break;
            }
        }

        Assert.assertEquals(t.getId(), tournamentId);
        Assert.assertEquals(t.getSize(), 1);
        Assert.assertEquals(t.getCategory(), object.category);
    }
}

class TournamentObject {
    public int sort_order;
    public int operator;
    public int category;
    public String description;
    public int duration;
    public int end_time;
    public boolean join_required;
    public int max_size;
    public int max_num_score;
    public String title;
}

class TournamentId {
    String tournament_id;
}
