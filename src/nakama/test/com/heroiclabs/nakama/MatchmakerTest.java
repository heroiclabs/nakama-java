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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MatchmakerTest {
    private Client client;
    private Client client2;
    private SocketClient socket;
    private Session session;
    private Session session2;
    private SocketClient socket2;

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
        socket = client.createSocket();
        client2 = new DefaultClient("defaultkey");
        session2 = client2.authenticateCustom(UUID.randomUUID().toString()).get();
        socket2 = client2.createSocket();
    }

    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testMatchmakerMatchedJoinMatch() throws Exception {
        final List<String> callbacks = new ArrayList<String>();
        final CountDownLatch latch = new CountDownLatch(2);
        socket.connect(session, new AbstractSocketListener() {
            @Override
            public void onMatchmakerMatched(final MatchmakerMatched matched) {
                super.onMatchmakerMatched(matched);
                callbacks.add(matched.getToken());

                Assert.assertNotNull(matched);
                Assert.assertNotNull(matched.getToken());
                Assert.assertNotNull(matched.getSelf());
                Assert.assertNotNull(matched.getSelf().getPresence());
                Assert.assertNotNull(matched.getUsers());
                Assert.assertNotEquals(0, matched.getUsers().size());
                latch.countDown();
            }
        }).get();

        socket2.connect(session2, new AbstractSocketListener() {
            @Override
            public void onMatchmakerMatched(final MatchmakerMatched matched) {
                super.onMatchmakerMatched(matched);
                callbacks.add(matched.getToken());

                Assert.assertNotNull(matched);
                Assert.assertNotNull(matched.getToken());
                Assert.assertNotNull(matched.getSelf());
                Assert.assertNotNull(matched.getSelf().getPresence());
                Assert.assertNotNull(matched.getUsers());
                Assert.assertNotEquals(0, matched.getUsers().size());
                latch.countDown();
            }
        }).get();

        Map<String, String> map = new HashMap<String, String>();
        map.put("a3", "baz");

        MatchmakerTicket ticket = socket.addMatchmaker(2, 4, "properties.a3:bar", map).get();
        Assert.assertNotNull(ticket);
        Assert.assertNotNull(ticket.getTicket());
        Assert.assertFalse(ticket.getTicket().isEmpty());

        Map<String, String> map2 = new HashMap<String, String>();
        map.put("a3", "bar");
        socket2.addMatchmaker(2, 4, "properties.a3:baz", map2).get();

        latch.await(15, TimeUnit.SECONDS);
        Assert.assertEquals(2, callbacks.size());

        Match match = socket.joinMatchToken(callbacks.get(0)).get();
        Match match2 = socket2.joinMatchToken(callbacks.get(1)).get();

        final String payload = "{\"hello\":\"world!\"}";
        socket.sendMatchData(match.getMatchId(), 1, payload.getBytes());
        socket2.sendMatchData(match2.getMatchId(), 1, payload.getBytes());
    }
}
