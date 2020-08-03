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
import com.heroiclabs.nakama.api.Account;
import com.heroiclabs.nakama.api.LeaderboardRecord;
import com.heroiclabs.nakama.api.Tournament;
import com.heroiclabs.nakama.api.TournamentList;
import org.junit.*;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.time.Instant;

import static java.lang.Thread.sleep;

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
    public void testListTournaments() throws Exception {

        TournamentObject object = new TournamentObject();

        List<String> idsList = new ArrayList<String>();

        int duration = 10;

        for (int i = 0; i < 3; i++)
        {
            object.description = "tournament " + i + " set tournament duration 10s";
            object.duration = duration;
            object.category = 6;
            object.join_required = false;
            object.operator = "set";
            object.max_num_score = 1;
            object.max_size = 2;
            object.sort_order = "desc";
            object.title = "tournament-test";
            object.end_time = Instant.now().getEpochSecond() + object.duration;

            final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
            final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;

            idsList.add(tournamentId);
        }

        List<Tournament> tournamentsList = client.listTournaments(session, 100, null).get().getTournamentsList();
        Set<Tournament> matchingTournaments = tournamentsList.stream().filter(tt -> idsList.contains(tt.getId())).collect(Collectors.toSet());
        Assert.assertTrue(idsList.size() == matchingTournaments.size());
    }

    @Test
    public void testCreateMultipleTournament() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "create multiple tournaments with same id";
        object.duration = 10;
        object.category = 5;
        object.join_required = true;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String response = client.rpc(session, "clientrpc.create_same_tournament_multiple_times", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);
    }

    @Test
    public void testCreateTournamentAndTournamentDelete() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, no end";
        object.duration = 10;
        object.category = 5;
        object.join_required = true;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        TournamentList tournaments = client.listTournaments(session, 100, null).get();
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
        Assert.assertEquals(t.getEndTime().getSeconds(), object.end_time);
        Assert.assertNotEquals(t.getCreateTime(), 0);
        Assert.assertTrue(t.getCanEnter());
        Assert.assertNotEquals(t.getEndActive(), 0);
        Assert.assertEquals(t.getMetadata(), "{}");
        Assert.assertEquals(t.getMaxSize(), object.max_size);
        Assert.assertEquals(t.getMaxNumScore(), object.max_num_score);

        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testCreateTournamentInFuture() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, no end, start in future";
        object.start_time = Instant.now().getEpochSecond() + 10;
        object.duration = 10;
        object.category = 5;
        object.join_required = true;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = object.start_time + object.duration;

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        TournamentList tournaments = client.listTournaments(session, 100, null).get();
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
        Assert.assertEquals(t.getEndTime().getSeconds(), object.end_time);
        Assert.assertNotEquals(t.getCreateTime(), 0);
        Assert.assertFalse(t.getCanEnter());
        Assert.assertEquals(t.getEndActive(), 0);
        Assert.assertEquals(t.getMetadata(), "{}");
        Assert.assertEquals(t.getMaxSize(), object.max_size);
        Assert.assertEquals(t.getMaxNumScore(), object.max_num_score);

        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testListTournamentByCategory() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "tournament listing by category=20";
        object.duration = 10;
        object.category = 20;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        int categoryStart = object.category;
        int categoryEnd = object.category;
        int startTime = -1;
        int endTime = -1;
        TournamentList tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        boolean found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);
        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testListTournamentByCategoryRange() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "tournament listing by 20<category<40";
        object.duration = 10;
        object.category = 30;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        int categoryStart = 20;
        int categoryEnd = 40;
        int startTime = -1;
        int endTime = -1;
        TournamentList tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        boolean found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);
        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testListTournamentByEndTime() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "tournament listing by end time 3s";
        object.end_time = Instant.now().getEpochSecond() + 3;
        object.duration = 1;
        object.category = 30;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";

        final String response = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(response, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        int categoryStart = 20;
        int categoryEnd = 40;
        int startTime = -1;
        long endTime = object.end_time;
        TournamentList tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        boolean found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);

        endTime = Instant.now().getEpochSecond(); // now

        tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }

        Assert.assertFalse(found);

        sleep(5000);

        // tournament has ended 2s ago.
        endTime = 0;
        tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);

        endTime = object.end_time; // tournament has ended 2s ago.
        tournaments = client.listTournaments(session, categoryStart, categoryEnd, startTime, endTime, 100, null).get();
        Assert.assertNotNull(tournaments);

        found = false;
        for (Tournament tt : tournaments.getTournamentsList()) {
            if (tt.getId().equals(tournamentId)) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);

        client.rpc(session, "clientrpc.delete_tournament", response).get();
    }

    @Test
    public void testTournamentWrite() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s";
        object.duration = 10;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

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
        Assert.assertEquals(record.getExpiryTime().getSeconds(), object.end_time);
        Assert.assertEquals(record.getScore(), score);
        Assert.assertEquals(record.getSubscore(), subscore);
        Assert.assertEquals(record.getMetadata(), metadata);
        Assert.assertEquals(record.getNumScore(), 1);
        Assert.assertEquals(record.getMaxNumScore(), object.max_num_score);
        Assert.assertEquals(record.getRank(), 1);
        Assert.assertNotEquals(record.getCreateTime().getSeconds(), 0);
        Assert.assertNotEquals(record.getUpdateTime().getSeconds(), 0);

        TournamentList tournaments = client.listTournaments(session, 100, null).get();
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

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteFailBecauseFull() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, fail more than 1 record";
        object.duration = 10;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 1; // set full after one write
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        Client client2 = new DefaultClient("defaultkey");
        Session session2 = client.authenticateCustom(UUID.randomUUID().toString()).get();

        Exception err = null;
        try {
            client2.writeTournamentRecord(session2, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteFailBecauseTooManyAttempts() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, fail more than 1 attempt";
        object.duration = 10;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1; // cannot write multiple times
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        Exception err = null;
        try {
            client.writeTournamentRecord(session, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteFailBecauseJoinRequired() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, fail join required";
        object.duration = 10;
        object.category = 6;
        object.join_required = true;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        client.joinTournament(session, tournamentId).get();

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        Client client2 = new DefaultClient("defaultkey");
        Session session2 = client.authenticateCustom(UUID.randomUUID().toString()).get();

        Exception err = null;
        try {
            // do not join prior to write...
            client2.writeTournamentRecord(session2, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteJoinNotRequired() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, joining idempotent";
        object.duration = 10;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        client.joinTournament(session, tournamentId).get();

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteOutsideDuration() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 3s, write outside duration";
        object.duration = 3;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        sleep(object.duration * 1000);

        Client client2 = new DefaultClient("defaultkey");
        Session session2 = client.authenticateCustom(UUID.randomUUID().toString()).get();

        Exception err = null;
        try {
            client2.writeTournamentRecord(session2, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteAfterDurationAndEndTime() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 3s, after tournament end time";
        object.end_time = Instant.now().getEpochSecond() + 5;
        object.duration = 3;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        sleep(object.duration * 1000);

        Session session2 = client.authenticateCustom(UUID.randomUUID().toString()).get();

        Exception err = null;
        try {
            client.writeTournamentRecord(session2, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        sleep(2 * 1000);
        Session session3 = client.authenticateCustom(UUID.randomUUID().toString()).get();
        err = null;
        try {
            client.writeTournamentRecord(session3, tournamentId, 30).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteManyRanks() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, ranks calculation";
        object.duration = 10;
        object.category = 100;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 10;
        object.sort_order = "asc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;

        Assert.assertNotNull(tournamentId);

        List<LeaderboardRecord> records = new ArrayList<LeaderboardRecord>();

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 20).get();
        Assert.assertNotNull(record);
        records.add(record);
        Assert.assertEquals(1, record.getRank());

        for (int i = 1; i < object.max_size; i++) {
            Session newSession = client.authenticateCustom(UUID.randomUUID().toString()).get();
            record = client.writeTournamentRecord(newSession, tournamentId, i).get();
            records.add(record);
            Assert.assertNotNull(record);
            Assert.assertEquals(i, record.getRank());
        }

        records = client.listLeaderboardRecords(session, tournamentId, session.getUserId()).get().getOwnerRecordsList();
        Assert.assertEquals(1, records.size());
        Assert.assertEquals(object.max_size, records.get(0).getRank());

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentListRecordAfterExpiry() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 3s, end_time 4s, list records";
        object.duration = 3;
        object.end_time = Instant.now().getEpochSecond() + 4;
        object.category = 100;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 10;
        object.sort_order = "asc";
        object.title = "tournament-test";

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        client.writeTournamentRecord(session, tournamentId, 20).get();

        sleep(5 * 1000);

        List<LeaderboardRecord> records = client.listLeaderboardRecords(session, tournamentId, session.getUserId()).get().getOwnerRecordsList();
        Assert.assertEquals(0, records.size());

        List<String> owners = Collections.singletonList(session.getUserId());
        records = client.listLeaderboardRecords(session, tournamentId, owners, (int)object.end_time).get().getOwnerRecordsList();
        Assert.assertEquals(1, records.size());

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWriteSubscoreRank() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, no end, ranks calculation with subscore";
        object.duration = 10;
        object.category = 100;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 10;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 20, 10).get();
        Assert.assertNotNull(record);
        Assert.assertEquals(1, record.getRank());

        Session session2 = client.authenticateCustom(UUID.randomUUID().toString()).get();
        record = client.writeTournamentRecord(session2, tournamentId, 20, 5).get();
        Assert.assertNotNull(record);
        Assert.assertEquals(2, record.getRank());

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    @Ignore("requires setting token expiry to more than 180s")
    public void testTournamentWithResetScheduleAndCheckSize() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10, reset 1min, ranks calculation.";
        object.reset_schedule = "* * * * *"; // every 1 min
        object.duration = 10;
        object.category = 100;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 1;
        object.sort_order = "desc";
        object.title = "tournament-test";

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("utc"));
        int waitPeriod = (60 - c.get(Calendar.SECOND)) + 1;
        sleep(waitPeriod * 1000);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 20, 10).get();
        Assert.assertNotNull(record);
        Assert.assertEquals(1, record.getRank());

        sleep(5000);

        Exception err = null;
        try {
            client.writeTournamentRecord(session, tournamentId, 20, 10).get();
        } catch (Exception ex) {
            err = ex;
        } finally {
            Assert.assertNotNull(err);
        }

        sleep(56 * 1000);

        List<LeaderboardRecord> records = client.listLeaderboardRecords(session, tournamentId, session.getUserId()).get().getOwnerRecordsList();
        Assert.assertEquals(0, records.size());

        record = client.writeTournamentRecord(session, tournamentId, 30, 20).get();
        Assert.assertNotNull(record);
        Assert.assertEquals(1, record.getRank());

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentAddAttempts() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10s, add 1 attempt";
        object.duration = 10;
        object.category = 6;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1; // cannot write multiple times
        object.max_size = 2;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        LeaderboardRecord record = client.writeTournamentRecord(session, tournamentId, 10).get();
        Assert.assertNotNull(record);

        Exception err = null;
        try {
            client.writeTournamentRecord(session, tournamentId, 20).get();
        } catch (Exception e) {
            err = e;
        } finally {
            Assert.assertNotNull(err);
        }

        TournamentAddAttempt tournamentAddAttempt = new TournamentAddAttempt();
        tournamentAddAttempt.count = 1;
        tournamentAddAttempt.tournament_id = tournamentId;
        tournamentAddAttempt.owner_id = session.getUserId();
        client.rpc(session, "clientrpc.addattempt_tournament", gson.toJson(tournamentAddAttempt)).get();

        record = client.writeTournamentRecord(session, tournamentId, 20, 30).get();
        Assert.assertNotNull(record);

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentCheckEndCallback() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 2s";
        object.duration = 2;
        object.category = 25;
        object.join_required = false;
        object.operator = "set";
        object.max_num_score = 1;
        object.max_size = 1;
        object.sort_order = "desc";
        object.title = "tournament-test";
        object.end_time = Instant.now().getEpochSecond() + object.duration;

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        client.writeTournamentRecord(session, tournamentId, 100).get();

        sleep((object.duration + 1) * 1000);

        Account account = client.getAccount(session).get();
        Assert.assertTrue(account.getUser().getMetadata().contains(tournamentId));

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }

    @Test
    public void testTournamentWithLargeResetSchedule() throws Exception {
        TournamentObject object = new TournamentObject();
        object.description = "checking set tournament duration 10, reset 1min, ranks calculation.";
        object.reset_schedule = "0 9 * * *"; // 9am each day
        object.duration = 28800; // 8hrs
        object.category = 100;
        object.join_required = true;
        object.operator = "set";
        object.max_num_score = 100;
        object.max_size = 10000000;
        object.sort_order = "desc";
        object.title = "tournament-test";

        final String payload = client.rpc(session, "clientrpc.create_tournament", gson.toJson(object)).get().getPayload();
        final String tournamentId = gson.fromJson(payload, TournamentId.class).tournament_id;
        Assert.assertNotNull(tournamentId);

        client.rpc(session, "clientrpc.delete_tournament", "{\"tournament_id\": \"" + tournamentId + "\"}").get();
    }
}

class TournamentObject {
    public String sort_order;
    public String operator;
    public int category;
    public String description;
    public int duration;
    public long end_time;
    public boolean join_required;
    public int max_size;
    public int max_num_score;
    public String title;
    public long start_time;
    public String reset_schedule;
}

class TournamentId {
    String tournament_id;
}

class TournamentAddAttempt {
    String tournament_id;
    String owner_id;
    int count;
}
