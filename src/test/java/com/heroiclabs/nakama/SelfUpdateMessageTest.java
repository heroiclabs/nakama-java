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

public class SelfUpdateMessageTest {

    private Client client;
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
    public void testUpdate() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);
        final String newHandle = UUID.randomUUID().toString().substring(0, 20);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Session>() {
            @Override
            public Deferred<Boolean> call(Session session) throws Exception {
                final CollatedMessage<Boolean> update = SelfUpdateMessage.Builder.newBuilder()
                        .handle(newHandle)
                        .build();
                return client.send(update);
            }
        }).addCallbackDeferring(new Callback<Deferred<Self>, Boolean>() {
            @Override
            public Deferred<Self> call(Boolean result) throws Exception {
                Assert.assertEquals(true, result);

                final CollatedMessage<Self> fetch = SelfFetchMessage.Builder.build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<Self, Self>() {
            @Override
            public Self call(Self self) throws Exception {
                Assert.assertEquals(newHandle, self.getHandle());
                return self;
            }
        });

        deferred.join(2000);
    }

    @Test(expected = Error.class)
    public void testUpdateHandleTooLong() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);
        final String newHandle = UUID.randomUUID().toString();

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Session>() {
            @Override
            public Deferred<Boolean> call(Session session) throws Exception {
                final CollatedMessage<Boolean> update = SelfUpdateMessage.Builder.newBuilder()
                        .handle(newHandle)
                        .build();
                return client.send(update);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.BAD_INPUT, error.getCode());
                return error;
            }
        });

        deferred.join(2000);
        Assert.fail("Should not reach this point.");
    }

    @Test(expected = Error.class)
    public void testUpdateHandleInUse() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
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
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Self>() {
            @Override
            public Deferred<Boolean> call(Self self) throws Exception {
                return client.disconnect();
            }
        }).addCallbackDeferring(new Callback<Deferred<Session>, Boolean>() {
            @Override
            public Deferred<Session> call(Boolean result) throws Exception {
                final String otherDeviceId = UUID.randomUUID().toString();
                final AuthenticateMessage otherAuth = AuthenticateMessage.Builder.device(otherDeviceId);
                return client.register(otherAuth);
            }
        }).addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallback(new Callback<Deferred<Boolean>, Session>() {
            @Override
            public Deferred<Boolean> call(Session session) throws Exception {
                final CollatedMessage<Boolean> update = SelfUpdateMessage.Builder.newBuilder()
                        .handle(handle)
                        .build();
                return client.send(update);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.USER_HANDLE_INUSE, error.getCode());
                return error;
            }
        });

        deferred.join(2000);
        Assert.fail("Should not reach this point.");
    }

}
