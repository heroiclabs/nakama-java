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

public class StorageListMessageTest {

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
    public void testListNoRecords() throws Exception {
        final String bucket = UUID.randomUUID().toString();

        final CollatedMessage<ResultSet<StorageRecord>> list = StorageListMessage.Builder.newBuilderBucket(bucket)
                        .collection("collection")
                        .build();
        final Deferred<ResultSet<StorageRecord>> deferred = client1.send(list);
        deferred.addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> results) throws Exception {
                Assert.assertEquals(0, results.getResults().size());
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void testList() throws Exception {
        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

        final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record2", value,
                                StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                        .record(bucket, "collection", "record1", value,
                                StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                        .record(bucket, "collection", "record3", value,
                                StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                        .build();
        final Deferred<ResultSet<RecordId>> deferred = client1.send(write);
        deferred.addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertEquals(3, records.getResults().size());
                return records;
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<StorageRecord>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<StorageRecord>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<StorageRecord>> list = StorageListMessage.Builder.newBuilderUserId(session1.getId())
                        .bucket(bucket)
                        .collection("collection")
                        .build();
                return client1.send(list);
            }
        }).addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> results) throws Exception {
                Assert.assertEquals(3, results.getResults().size());
                Assert.assertEquals("record1", results.getResults().get(0).getKey());
                Assert.assertEquals("record2", results.getResults().get(1).getKey());
                Assert.assertEquals("record3", results.getResults().get(2).getKey());
                for (StorageRecord record : results.getResults()) {
                    Assert.assertEquals(bucket, record.getBucket());
                    Assert.assertEquals("collection", record.getCollection());
                    Assert.assertEquals(session1.getId(), record.getUserId());
                    Assert.assertEquals(value, record.getValue());
                }
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void testListOtherUser() throws Exception {
        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

        final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                .record(bucket, "collection", "record2", value,
                        StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                .record(bucket, "collection", "record1", value,
                        StorageRecord.PermissionRead.OWNER_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                .record(bucket, "collection", "record3", value,
                        StorageRecord.PermissionRead.PUBLIC_READ, StorageRecord.PermissionWrite.OWNER_WRITE)
                .build();
        final Deferred<ResultSet<RecordId>> deferred = client1.send(write);
        deferred.addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertEquals(3, records.getResults().size());
                return records;
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<StorageRecord>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<StorageRecord>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<StorageRecord>> list = StorageListMessage.Builder.newBuilderBucket(bucket)
                        .collection("collection")
                        .build();
                return client2.send(list);
            }
        }).addCallback(new Callback<ResultSet<StorageRecord>, ResultSet<StorageRecord>>() {
            @Override
            public ResultSet<StorageRecord> call(ResultSet<StorageRecord> results) throws Exception {
                Assert.assertEquals(1, results.getResults().size());
                Assert.assertEquals("record3", results.getResults().get(0).getKey());
                for (StorageRecord record : results.getResults()) {
                    Assert.assertEquals(bucket, record.getBucket());
                    Assert.assertEquals("collection", record.getCollection());
                    Assert.assertEquals(session1.getId(), record.getUserId());
                    Assert.assertEquals(value, record.getValue());
                }
                Assert.assertNull(results.getCursor());
                return results;
            }
        });
        deferred.join(2000);
    }

}
