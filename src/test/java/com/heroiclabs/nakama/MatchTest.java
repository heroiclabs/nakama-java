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
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MatchTest {
    private Client client;
    private Session session;
    private SocketClient socket;
    private Gson gson = new Gson();

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
        socket = client.createSocket();
    }

    @After
    public void shutdown() throws Exception {
        socket.disconnect();
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testCreateMatchAndSendAndReceiveData() throws Exception {
        final List<Boolean> callbacks = new ArrayList<Boolean>();
        final CountDownLatch latch = new CountDownLatch(2);
        final String payload = "{\"hello\":\"world!\"}";
        socket.connect(session, new AbstractSocketListener() {
            @Override
            public void onMatchPresence(final MatchPresenceEvent presence) {
                super.onMatchPresence(presence);
                callbacks.add(true);
                Assert.assertNotNull(presence);
                Assert.assertNull(presence.getLeaves());
                Assert.assertNotNull(presence.getJoins());
                Assert.assertNotNull(presence.getJoins().get(0));
                Assert.assertEquals(session.getUserId(), presence.getJoins().get(0).getUserId());
                latch.countDown();
            }

            @Override
            public void onMatchData(final MatchData data) {
                super.onMatchData(data);
                callbacks.add(true);
                Assert.assertNotNull(data);
                Assert.assertNotNull(data.getData());
                Assert.assertNotNull(data.getMatchId());
                Assert.assertEquals(1, data.getOpCode());
                Assert.assertEquals(payload, new String(data.getData()));
                latch.countDown();
            }
        }).get();

        String response = socket.rpc("p2prelayer.create").get().getPayload();
        final String matchId = gson.fromJson(response, MatchId.class).match_id;

        socket.joinMatch(matchId).get();

        socket.sendMatchData(matchId, 1, payload.getBytes());

        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(2, callbacks.size());
    }
}

class MatchId {
    String match_id;
}
