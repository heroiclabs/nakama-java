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

import com.stumbleupon.async.Callback;
import com.stumbleupon.async.Deferred;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class LeaderboardRecordsListMessageTest {

    private Client client;

    private Session session;

    @Before
    public void init() throws Exception {
        client = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client);

        AuthenticateMessage auth = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session s) throws Exception {
                session = s;
                return client.connect(session);
            }
        }).join(2000);
    }

    @After
    public void teardown() throws Exception {
        client.disconnect().join(2000);
    }

    @Test
    public void leaderboardRecordsList() throws Exception {
        final String leaderboardId = UUID.randomUUID().toString();
        RpcMessage rpc = RpcMessage.Builder.newBuilder("generate_leaderboard")
                .payload("{\"leaderboard_id\":\"" + leaderboardId +"\"}")
                .build();
        final Deferred<RpcResult> deferred = client.send(rpc);
        deferred.addCallbackDeferring(new Callback<Deferred<ResultSet<LeaderboardRecord>>, RpcResult>() {
            @Override
            public Deferred<ResultSet<LeaderboardRecord>> call(RpcResult result) throws Exception {
                LeaderboardRecordsListMessage list = LeaderboardRecordsListMessage.Builder.newBuilder(leaderboardId).limit(10).build();
                return client.send(list);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<LeaderboardRecord>>, ResultSet<LeaderboardRecord>>() {
            @Override
            public Deferred<ResultSet<LeaderboardRecord>> call(ResultSet<LeaderboardRecord> records) throws Exception {
                Assert.assertEquals(10, records.getResults().size());
                Assert.assertNotNull(records.getCursor());
                LeaderboardRecordsListMessage list = LeaderboardRecordsListMessage.Builder.newBuilder(leaderboardId)
                        .cursor(records.getCursor())
                        .limit(10)
                        .build();
                return client.send(list);
            }
        }).addCallback(new Callback<ResultSet<LeaderboardRecord>, ResultSet<LeaderboardRecord>>() {
            @Override
            public ResultSet<LeaderboardRecord> call(ResultSet<LeaderboardRecord> records) throws Exception {
                Assert.assertEquals(5, records.getResults().size());
                return records;
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.fail("Should not reach this point.");
                return error;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void leaderboardRecordsListHaystack() throws Exception {
        final String leaderboardId = UUID.randomUUID().toString();
        RpcMessage rpc = RpcMessage.Builder.newBuilder("generate_leaderboard")
                .payload("{\"leaderboard_id\":\"" + leaderboardId +"\"}")
                .build();
        final Deferred<RpcResult> deferred = client.send(rpc);
        deferred.addCallbackDeferring(new Callback<Deferred<ResultSet<LeaderboardRecord>>, RpcResult>() {
            @Override
            public Deferred<ResultSet<LeaderboardRecord>> call(RpcResult result) throws Exception {
                LeaderboardRecordWriteMessage write = LeaderboardRecordWriteMessage.Builder.newBuilder()
                        .add(LeaderboardRecordWriteMessage.LeaderboardRecordWrite.newBuilder(leaderboardId)
                                .set(7))
                        .build();
                return client.send(write);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<LeaderboardRecord>>, ResultSet<LeaderboardRecord>>() {
            @Override
            public Deferred<ResultSet<LeaderboardRecord>> call(ResultSet<LeaderboardRecord> records) throws Exception {
                LeaderboardRecordsListMessage list = LeaderboardRecordsListMessage.Builder.newBuilder(leaderboardId)
                        .limit(10)
                        .filterByPagingToOwnerId(session.getId())
                        .build();
                return client.send(list);
            }
        }).addCallback(new Callback<ResultSet<LeaderboardRecord>, ResultSet<LeaderboardRecord>>() {
            @Override
            public ResultSet<LeaderboardRecord> call(ResultSet<LeaderboardRecord> records) throws Exception {
                Assert.assertEquals(10, records.getResults().size());
                Assert.assertNotNull(records.getCursor());
                return records;
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.fail("Should not reach this point.");
                return error;
            }
        });
        deferred.join(2000);
    }

}
