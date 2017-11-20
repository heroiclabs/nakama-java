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

public class FriendsListMessageTest {

    private Client client1;
    private Client client2;

    private Session session1;
    private Session session2;

    @Before
    public void init() throws Exception {
        client1 = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client1);

        client2 = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client2);

        AuthenticateMessage auth1 = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred1 = client1.register(auth1);
        deferred1.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client1.connect(session);
            }
        }).addCallback(new Callback<Session, Session>() {
            @Override
            public Session call(Session session) throws Exception {
                session1 = session;
                return session;
            }
        }).join(2000);

        AuthenticateMessage auth2 = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred2 = client2.register(auth2);
        deferred2.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client2.connect(session);
            }
        }).addCallback(new Callback<Session, Session>() {
            @Override
            public Session call(Session session) throws Exception {
                session2 = session;
                return session;
            }
        }).join(2000);
    }

    @After
    public void teardown() throws Exception {
        client1.disconnect().join(2000);
        client2.disconnect().join(2000);
    }

    @Test
    public void friendsListEmpty() throws Exception {
        FriendsListMessage list = FriendsListMessage.Builder.build();
        final Deferred<ResultSet<Friend>> deferred = client1.send(list);
        deferred.addCallback(new Callback<ResultSet<Friend>, ResultSet<Friend>>() {
            @Override
            public ResultSet<Friend> call(ResultSet<Friend> friends) throws Exception {
                Assert.assertEquals(0, friends.getResults().size());
                return friends;
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
    public void friendsListAfterBlock() throws Exception {
        FriendsBlockMessage block = FriendsBlockMessage.Builder.newBuilder().id(session2.getId()).build();
        final Deferred<Boolean> deferred = client1.send(block);
        deferred.addCallbackDeferring(new Callback<Deferred<ResultSet<Friend>>, Boolean>() {
            @Override
            public Deferred<ResultSet<Friend>> call(Boolean success) throws Exception {
                Assert.assertTrue(success);
                FriendsListMessage list = FriendsListMessage.Builder.build();
                return client1.send(list);
            }
        }).addCallback(new Callback<ResultSet<Friend>, ResultSet<Friend>>() {
            @Override
            public ResultSet<Friend> call(ResultSet<Friend> friends) throws Exception {
                Assert.assertEquals(1, friends.getResults().size());
                Assert.assertEquals(Friend.FriendType.BLOCKED, friends.getResults().get(0).getState());
                Assert.assertEquals(session2.getId(), friends.getResults().get(0).getId());
                Assert.assertEquals(session2.getHandle(), friends.getResults().get(0).getHandle());
                return friends;
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
