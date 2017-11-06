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

public class StorageWriteMessageTest {

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
    public void testWrite() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

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
        });
        deferred.join(2000);
    }

    @Test
    public void testWriteIfNoneMatch() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

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
                        .record(bucket, "collection", "record", value, "*")
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
        });
        deferred.join(2000);
    }

    @Test(expected = Error.class)
    public void testWriteIfNoneMatchFail() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

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
        .addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value, "*")
                        .build();
                return client.send(write);
            }
        })
        .addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.STORAGE_REJECTED, error.getCode());
                return error;
            }
        });
        deferred.join(2000);

        Assert.fail("Should not reach this point.");
    }

    @Test
    public void testWriteIfMatch() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

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
        .addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value, records.getResults().get(0).getVersion())
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
        });
        deferred.join(2000);
    }

    @Test(expected = Error.class)
    public void testWriteIfMatchFail() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final String bucket = UUID.randomUUID().toString();
        final String value = "{\"foo\":\"bar\"}";

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, Session>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(Session session) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value)
                        .build();
                return client.send(write);
            }
        }).addCallback(new Callback<ResultSet<RecordId>, ResultSet<RecordId>>() {
            @Override
            public ResultSet<RecordId> call(ResultSet<RecordId> records) throws Exception {
                Assert.assertEquals(1, records.getResults().size());
                Assert.assertEquals(bucket, records.getResults().get(0).getBucket());
                return records;
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<RecordId>>, ResultSet<RecordId>>() {
            @Override
            public Deferred<ResultSet<RecordId>> call(ResultSet<RecordId> records) throws Exception {
                final CollatedMessage<ResultSet<RecordId>> write = StorageWriteMessage.Builder.newBuilder()
                        .record(bucket, "collection", "record", value, "bad version")
                        .build();
                return client.send(write);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.STORAGE_REJECTED, error.getCode());
                return error;
            }
        });
        deferred.join(2000);

        Assert.fail("Should not reach this point.");
    }

}
