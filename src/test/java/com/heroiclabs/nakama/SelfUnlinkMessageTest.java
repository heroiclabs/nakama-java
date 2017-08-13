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

public class SelfUnlinkMessageTest {

    private Client client;

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
    public void testUnlinkCustom() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final String customId = UUID.randomUUID().toString();

        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);
        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Session>() {
            @Override
            public Deferred<Boolean> call(Session session) throws Exception {
                final SelfLinkMessage link = SelfLinkMessage.Builder.custom(customId);
                return client.send(link);
            }
        }).addCallbackDeferring(new Callback<Deferred<Self>, Boolean>() {
            @Override
            public Deferred<Self> call(Boolean done) throws Exception {
                final SelfFetchMessage fetch = SelfFetchMessage.Builder.build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<Self, Self>() {
            @Override
            public Self call(Self self) throws Exception {
                Assert.assertEquals(customId, self.getCustomId());
                Assert.assertEquals(1, self.getDeviceIds().size());
                Assert.assertEquals(deviceId, self.getDeviceIds().get(0));
                return self;
            }
        }).addCallbackDeferring(new Callback<Deferred<Boolean>, Self>() {
            @Override
            public Deferred<Boolean> call(Self self) throws Exception {
                final SelfUnlinkMessage unlink = SelfUnlinkMessage.Builder.custom(customId);
                return client.send(unlink);
            }
        }).addCallbackDeferring(new Callback<Deferred<Self>, Boolean>() {
            @Override
            public Deferred<Self> call(Boolean done) throws Exception {
                final SelfFetchMessage fetch = SelfFetchMessage.Builder.build();
                return client.send(fetch);
            }
        }).addCallback(new Callback<Self, Self>() {
            @Override
            public Self call(Self self) throws Exception {
                Assert.assertEquals("", self.getCustomId());
                Assert.assertEquals(1, self.getDeviceIds().size());
                Assert.assertEquals(deviceId, self.getDeviceIds().get(0));
                return self;
            }
        }).addErrback(new Callback<Boolean, Exception>() {
            @Override
            public Boolean call(Exception e) throws Exception {
                e.printStackTrace(System.err);
                return Boolean.FALSE;
            }
        });

        deferred.join(2000);
    }

}
