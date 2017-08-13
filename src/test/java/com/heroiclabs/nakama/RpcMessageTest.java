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

public class RpcMessageTest {

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

    @Test(expected = Error.class)
    public void rpcNotFound() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<RpcResult>, Session>() {
            @Override
            public Deferred<RpcResult> call(Session session) throws Exception {
                final CollatedMessage<RpcResult> rpc = RpcMessage.Builder.newBuilder("NOT_FOUND").build();
                return client.send(rpc);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.RUNTIME_FUNCTION_NOT_FOUND, error.getCode());
                return error;
            }
        });
        deferred.join(2000);
        Assert.fail("Should not reach this point.");
    }

    @Test(expected = Error.class)
    public void rpcFail() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<RpcResult>, Session>() {
            @Override
            public Deferred<RpcResult> call(Session session) throws Exception {
                final CollatedMessage<RpcResult> rpc = RpcMessage.Builder.newBuilder("client_rpc_fail").build();
                return client.send(rpc);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.RUNTIME_FUNCTION_EXCEPTION, error.getCode());
                return error;
            }
        });
        deferred.join(2000);
        Assert.fail("Should not reach this point.");
    }

    @Test
    public void rpcEcho() throws Exception {
        final String deviceId = UUID.randomUUID().toString();
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(deviceId);

        final byte[] payload = "foo".getBytes();
        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).addCallbackDeferring(new Callback<Deferred<RpcResult>, Session>() {
            @Override
            public Deferred<RpcResult> call(Session session) throws Exception {
                final CollatedMessage<RpcResult> rpc = RpcMessage.Builder.newBuilder("client_rpc_echo")
                        .payload(payload)
                        .build();
                return client.send(rpc);
            }
        }).addErrback(new Callback<RpcResult, RpcResult>() {
            @Override
            public RpcResult call(RpcResult result) throws Exception {
                Assert.assertArrayEquals(payload, result.getPayload());
                return result;
            }
        });
        deferred.join(2000);
    }

}
