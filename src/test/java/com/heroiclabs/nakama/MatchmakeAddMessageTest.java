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

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MatchmakeAddMessageTest {

    private Client client1;
    private Client client2;

    private CountDownLatch latch1;
    private CountDownLatch latch2;
    private MatchToken token1;
    private MatchToken token2;

    private CountDownLatch latch3;
    private MatchData data;

    private MatchmakeMatched matched1;
    private MatchmakeMatched matched2;

    @Before
    public void init() {
        client1 = DefaultClient.builder("defaultkey").listener(new ClientListener() {
            @Override public void onDisconnect() {}
            @Override public void onTopicMessage(TopicMessage message) {}
            @Override public void onTopicPresence(TopicPresence presence) {}
            @Override public void onMatchmakeMatched(MatchmakeMatched matched) {
                token1 = matched.getToken();
                matched1 = matched;
                latch1.countDown();
            }
            @Override public void onMatchData(MatchData matchData) {
                data = matchData;
                latch3.countDown();
            }
            @Override public void onMatchPresence(MatchPresence matchPresence) {}
            @Override public void onNotifications(List<Notification> notifications) {}
        }).build();
        Assert.assertNotNull(client1);
        latch1 = new CountDownLatch(1);

        client2 = DefaultClient.builder("defaultkey").listener(new ClientListener() {
            @Override public void onDisconnect() {}
            @Override public void onTopicMessage(TopicMessage message) {}
            @Override public void onTopicPresence(TopicPresence presence) {}
            @Override public void onMatchmakeMatched(MatchmakeMatched matched) {
                token2 = matched.getToken();
                matched2 = matched;
                latch2.countDown();
            }
            @Override public void onMatchData(MatchData matchData) {}
            @Override public void onMatchPresence(MatchPresence matchPresence) {}
            @Override public void onNotifications(List<Notification> notifications) {}
        }).build();
        Assert.assertNotNull(client2);
        latch2 = new CountDownLatch(1);

        latch3 = new CountDownLatch(1);
    }

    @After
    public void teardown() throws Exception {
        client1.disconnect().join(2000);
        client2.disconnect().join(2000);
    }

    @Test
    public void add() throws Exception {
        final String deviceId1 = UUID.randomUUID().toString();
        final AuthenticateMessage auth1 = AuthenticateMessage.Builder.device(deviceId1);
        final String deviceId2 = UUID.randomUUID().toString();
        final AuthenticateMessage auth2 = AuthenticateMessage.Builder.device(deviceId2);

        final Deferred<Session> deferred = client1.register(auth1);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client1.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client2.register(auth2);
            }
        }).addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client2.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<MatchmakeTicket>, Session>() {
            @Override
            public Deferred<MatchmakeTicket> call(Session session) throws Exception {
                final CollatedMessage<MatchmakeTicket> add = MatchmakeAddMessage.Builder.newBuilder(2)
                    .addProperty("rank", 12)
                    .addProperty("modes", new HashSet<>(Arrays.asList("tdm", "ffa")))
                    .addProperty("divisions", new HashSet<>(Arrays.asList("silver1")))
                    .addRangeFilter("rank", 10, 15)
                    .addTermFilter("modes", new HashSet<>(Arrays.asList("tdm", "ffa")), false)
                    .addTermFilter("divisions", new HashSet<>(Arrays.asList("bronze3","silver1", "silver2")), false) // like RocketLeague
                    .build();
                return client1.send(add);
            }
        }).addCallbackDeferring(new Callback<Deferred<MatchmakeTicket>, MatchmakeTicket>() {
            @Override
            public Deferred<MatchmakeTicket> call(MatchmakeTicket ticket) throws Exception {
                final CollatedMessage<MatchmakeTicket> add = MatchmakeAddMessage.Builder.newBuilder(2)
                        .addProperty("rank", 10)
                        .addProperty("modes", new HashSet<>(Arrays.asList("tdm", "ffa")))
                        .addProperty("divisions", new HashSet<>(Arrays.asList("bronze3")))
                        .addRangeFilter("rank", 8, 12)
                        .addTermFilter("modes", new HashSet<>(Arrays.asList("tdm", "ffa")), false)
                        .addTermFilter("divisions", new HashSet<>(Arrays.asList("bronze2","bronze3", "silver1")), false)
                        .build();
                return client2.send(add);
            }
        });
        deferred.join(2000);
        latch1.await(2, TimeUnit.SECONDS);
        latch2.await(2, TimeUnit.SECONDS);
        Assert.assertNotNull(token1);
        Assert.assertNotNull(token2);

        MatchmakeUserProperty c1Props = matched1.getProperties().get(0);
        if (!matched1.getSelf().getUserId().equals(matched1.getProperties().get(0).getUserId()))
        {
            c1Props = matched1.getProperties().get(1);
        }

        Assert.assertEquals(((long)c1Props.getProperties().get("rank")), 12);
        Assert.assertEquals(((MatchmakeRangeFilter)c1Props.getFilters().get("rank")).getLowerbound(), 10);

        final CollatedMessage<ResultSet<Match>> matchJoin = MatchesJoinMessage.Builder.newBuilder().token(token1).build();
        final Deferred<ResultSet<Match>> deferred2 = client1.send(matchJoin);
        deferred2.addCallbackDeferring(new Callback<Deferred<ResultSet<Match>>, ResultSet<Match>>() {
            @Override
            public Deferred<ResultSet<Match>> call(ResultSet<Match> matches) throws Exception {
                Assert.assertEquals(1, matches.getResults().size());

                final CollatedMessage<ResultSet<Match>> matchJoin = MatchesJoinMessage.Builder.newBuilder().token(token2).build();
                return client2.send(matchJoin);
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, ResultSet<Match>>() {
            @Override
            public Deferred<Boolean> call(ResultSet<Match> matches) throws Exception {
                Assert.assertEquals(1, matches.getResults().size());

                final UncollatedMessage data = MatchDataSendMessage.Builder
                        .newBuilder(matches.getResults().get(0).getId())
                        .data("test".getBytes())
                        .build();
                return client2.send(data);
            }
        });
        deferred2.join(2000);
        latch3.await(2, TimeUnit.SECONDS);
        Assert.assertNotNull(data);
    }

}
