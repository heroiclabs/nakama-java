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
import org.junit.*;

import java.util.UUID;

public class UsersFetchMessageTest {

    private Client client;
    private String userId;
    private String handle;

    @Before
    public void init() {
        client = DefaultClient.builder("defaultkey").build();
        Assert.assertNotNull(client);
    }

    @After
    public void teardown() throws Exception {
        client.disconnect().join(2000);
    }

    @Test
    public void testFetchNoUsers() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<User>>, Session>() {
            @Override
            public Deferred<ResultSet<User>> call(Session session) throws Exception {
                final CollatedMessage<ResultSet<User>> fetch = UsersFetchMessage.Builder.newBuilder()
                        .handle("not found")
                        .id("")
                        .build();
                return client.send(fetch);
            }
        })
        .addCallback(new Callback<ResultSet<User>, ResultSet<User>>() {
            @Override
            public ResultSet<User> call(ResultSet<User> results) throws Exception {
                Assert.assertEquals(0, results.getResults().size());
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void testListHandle() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                userId = session.getId();
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Self>, Session>() {
            @Override
            public Deferred<Self> call(Session session) throws Exception {
                final CollatedMessage<Self> fetch = SelfFetchMessage.Builder.build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<Self, Self>() {
            @Override
            public Self call(Self self) throws Exception {
                handle = self.getHandle();
                return self;
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<User>>, Self>() {
            @Override
            public Deferred<ResultSet<User>> call(Self self) throws Exception {
                final CollatedMessage<ResultSet<User>> fetch = UsersFetchMessage.Builder.newBuilder()
                        .handle(handle)
                        .build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<ResultSet<User>, ResultSet<User>>() {
            @Override
            public ResultSet<User> call(ResultSet<User> results) throws Exception {
                Assert.assertEquals(1, results.getResults().size());
                Assert.assertEquals(handle, results.getResults().get(0).getHandle());
                Assert.assertEquals(userId, results.getResults().get(0).getId());
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void testListId() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                userId = session.getId();
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Self>, Session>() {
            @Override
            public Deferred<Self> call(Session session) throws Exception {
                final CollatedMessage<Self> fetch = SelfFetchMessage.Builder.build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<Self, Self>() {
            @Override
            public Self call(Self self) throws Exception {
                handle = self.getHandle();
                return self;
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<User>>, Self>() {
            @Override
            public Deferred<ResultSet<User>> call(Self self) throws Exception {
                final CollatedMessage<ResultSet<User>> fetch = UsersFetchMessage.Builder.newBuilder()
                        .id(userId)
                        .build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<ResultSet<User>, ResultSet<User>>() {
            @Override
            public ResultSet<User> call(ResultSet<User> results) throws Exception {
                Assert.assertEquals(1, results.getResults().size());
                Assert.assertEquals(userId, results.getResults().get(0).getId());
                Assert.assertEquals(handle, results.getResults().get(0).getHandle());
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

}
