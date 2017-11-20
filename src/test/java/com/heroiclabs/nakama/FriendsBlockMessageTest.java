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

public class FriendsBlockMessageTest {

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

    @Test(expected = Error.class)
    public void friendsBlockNotFound() throws Exception {
        FriendsBlockMessage block = FriendsBlockMessage.Builder.newBuilder().id(UUID.randomUUID().toString()).build();
        final Deferred<Boolean> deferred = client1.send(block);
        deferred.addCallback(new Callback<Boolean, Boolean>() {
            @Override
            public Boolean call(Boolean success) throws Exception {
                Assert.fail("Should not reach this point.");
                return success;
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.RUNTIME_EXCEPTION, error.getCode());
                return error;
            }
        });
        deferred.join(2000);
        Assert.fail("Should not reach this point.");
    }

    @Test
    public void friendsBlock() throws Exception {
        FriendsBlockMessage block = FriendsBlockMessage.Builder.newBuilder().id(session2.getId()).build();
        final Deferred<Boolean> deferred = client1.send(block);
        deferred.addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.fail("Should not reach this point.");
                return error;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void friendsBlockAfterAddMutual() throws Exception {
        FriendsAddMessage add1 = FriendsAddMessage.Builder.newBuilder().id(session2.getId()).build();
        final Deferred<Boolean> deferred = client1.send(add1);
        deferred.addCallbackDeferring(new Callback<Deferred<Boolean>, Boolean>() {
            @Override
            public Deferred<Boolean> call(Boolean success) throws Exception {
                FriendsAddMessage add2 = FriendsAddMessage.Builder.newBuilder().id(session1.getId()).build();
                return client2.send(add2);
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Boolean>() {
            @Override
            public Deferred<Boolean> call(Boolean success) throws Exception {
                FriendsBlockMessage block = FriendsBlockMessage.Builder.newBuilder().id(session2.getId()).build();
                return client1.send(block);
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
