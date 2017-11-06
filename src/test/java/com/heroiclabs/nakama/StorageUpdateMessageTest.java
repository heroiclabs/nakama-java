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

public class StorageUpdateMessageTest {

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
    public void testStorageUpdate() throws Exception {
        final String deviceId = UUID.randomUUID().toString();

        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);
        final Deferred<Session> deferred = client.register(auth);

        final String bucket = UUID.randomUUID().toString();
        final String jsonString = "{\"coins\": 100, \"gems\": 10, \"artifacts\": 0}";

        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, Session>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(Session session) throws Exception {
                final StorageUpdateMessage message = StorageUpdateMessage.Builder.newBuilder()
                        .record(bucket, "collection", "key", StorageUpdateMessage.OpBuilder.newBuilder()
                        .init("/foo", jsonString)
                        .incr("/foo/coins", -10))
                        .build();
                return client.send(message);
            }
        }).addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertNotNull(records);
                Assert.assertEquals(1, records.getResults().size());
                Assert.assertEquals(bucket, records.getResults().get(0).getBucket());
                Assert.assertEquals("collection", records.getResults().get(0).getBucket());
                Assert.assertEquals("key", records.getResults().get(0).getKey());
                return records;
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
