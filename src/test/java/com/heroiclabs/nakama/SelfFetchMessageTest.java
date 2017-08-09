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

public class SelfFetchMessageTest {

    private static Client client;

    @BeforeClass
    public static void init() {
        client = DefaultClient.builder("defaultkey").build();
        Assert.assertNotNull(client);
    }

    @After
    public void teardown() throws Exception {
        client.disconnect().join(2000);
    }

    @Test
    public void testSelfFetch() throws Exception {
        final String customId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.custom(customId);
        final Self self = client.register(auth)
                .addCallbackDeferring(new Callback<Deferred<Boolean>, Session>() {
                        @Override
                        public Deferred<Boolean> call(Session session) throws Exception {
                            return client.connect(session);
                        }
                    })
                .addCallbackDeferring(new Callback<Deferred<Self>, Boolean>() {
                        @Override
                        public Deferred<Self> call(Boolean arg) throws Exception {
                            final CollatedMessage<Self> selfFetch = SelfFetchMessage.Builder.build();
                            return client.send(selfFetch);
                        }
                    })
                .join(2000);
        Assert.assertNotNull(self);
        Assert.assertEquals(customId, self.getCustomId());
    }

}
