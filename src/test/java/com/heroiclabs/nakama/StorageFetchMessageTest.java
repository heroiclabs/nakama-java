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

public class StorageFetchMessageTest {

    private Client client;
    private byte[] userId;

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
    public void testFetchNotFound() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();

        final Deferred<Session> deferred = client.register(auth);

        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<StorageRecord>>, Session>() {
            @Override
            public Deferred<ResultSet<StorageRecord>> call(Session session) throws Exception {
                final CollatedMessage<ResultSet<StorageRecord>> fetch = StorageFetchMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record")
                        .build();
                return client.send(fetch);
            }
        })
        .addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> records) throws Exception {
                Assert.assertEquals(0, records.getResults().size());
                return records;
            }
        });

        deferred.join(2000);
    }

    @Test
    public void testFetchNoPermission() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final byte[] value = "{\"foo\":\"bar\"}".getBytes();

        final Deferred<Session> deferred = client.register(auth);

        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, Session>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(Session session) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value)
                        .build();
                return client.send(write);
            }
        })
        .addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertEquals(1, records.getResults().size());
                Assert.assertEquals(bucket, records.getResults().get(0).getBucket());
                return records;
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<StorageRecord>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<StorageRecord>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<StorageRecord>> fetch = StorageFetchMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record")
                        .build();
                return client.send(fetch);
            }
        })
        .addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> records) throws Exception {
                Assert.assertEquals(0, records.getResults().size());
                return records;
            }
        });

        deferred.join(2000);
    }

    @Test
    public void testFetch() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final byte[] value = "{\"foo\":\"bar\"}".getBytes();

        final Deferred<Session> deferred = client.register(auth);

        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                userId = session.getId();
                return client.connect(session);
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, Session>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(Session session) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value,
                                StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                        .build();
                return client.send(write);
            }
        })
        .addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertEquals(1, records.getResults().size());
                Assert.assertEquals(bucket, records.getResults().get(0).getBucket());
                return records;
            }
        })
        .addCallbackDeferring(new Callback<Deferred<ResultSet<StorageRecord>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<StorageRecord>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<StorageRecord>> fetch = StorageFetchMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", userId)
                        .build();
                return client.send(fetch);
            }
        })
        .addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> records) throws Exception {
                Assert.assertEquals(1, records.getResults().size());
                Assert.assertEquals(bucket, records.getResults().get(0).getBucket());
                return records;
            }
        });

        deferred.join(2000);
    }

}
