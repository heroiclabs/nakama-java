/*
 * Copyright 2020 The Nakama Authors
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

import com.heroiclabs.nakama.api.Rpc;
import io.grpc.StatusRuntimeException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class RpcTest {
    private Client client;
    private Session session;
    private SocketClient socket;

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
        socket = client.createSocket();
    }

    @After
    public void shutdown() throws Exception {
        socket.disconnect();
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testPingRpc() throws Exception {
        final String rpcId = "clientrpc.rpc_get";
        final String rpcPayload = "{ \"hello\": \"world\" }";
        final Rpc result = client.rpc(session, rpcId, rpcPayload).get();
//        Assert.assertEquals(rpcId, result.getId());
        Assert.assertEquals("{\"message\":\"PONG\"}", result.getPayload());
    }

    @Test
    public void testPingRpcSocket() throws Exception {
        socket.connect(session, new AbstractSocketListener() {
            @Override
            public void onDisconnect(final Throwable t) { }
        });
        final String rpcId = "clientrpc.rpc_get";
        final String rpcPayload = "{ \"hello\": \"world\" }";
        final Rpc result = socket.rpc(rpcId, rpcPayload).get();
        Assert.assertEquals(rpcId, result.getId());
        Assert.assertEquals("{\"message\":\"PONG\"}", result.getPayload());
    }

    @Test(expected = StatusRuntimeException.class)
    public void testRpcFail() throws Exception {
        final String rpcId = "clientrpc.rpc_fail";
        try {
            final Rpc result = client.rpc(session, rpcId).get();
            Assert.assertNull(result);
        } catch (Exception e) {
            throw (StatusRuntimeException) e.getCause();
        }
    }

    @Test(expected = Error.class)
    public void testRpcFailSocket() throws Exception {
        socket.connect(session, new AbstractSocketListener() {});
        final String rpcId = "clientrpc.rpc_fail";
        try {
            final Rpc result = socket.rpc(rpcId).get();
            Assert.assertNull(result);
        } catch (Exception e) {
            throw (Error) e.getCause();
        }
    }

    @Test(expected = StatusRuntimeException.class)
    public void testRpcNotFound() throws Exception {
        final String rpcId = "notfound";
        try {
            final Rpc result = client.rpc(session, rpcId).get();
            Assert.assertNull(result);
        } catch (final Exception ex) {
            StatusRuntimeException e = (StatusRuntimeException) ex.getCause();
            Assert.assertEquals(Error.ErrorCode.RUNTIME_FUNCTION_NOT_FOUND, Error.ErrorCode.fromInt(e.getStatus().getCode().value() + 1));
            throw e;
        }
    }

    @Test(expected = Error.class)
    public void testRpcNotFoundSocket() throws Exception {
        socket.connect(session, new AbstractSocketListener() {});
        final String rpcId = "notfound";
        try {
            final Rpc result = socket.rpc(rpcId).get();
            Assert.assertNull(result);
        } catch (final Exception ex) {
            Error e = (Error) ex.getCause();
            Assert.assertEquals(Error.ErrorCode.RUNTIME_FUNCTION_NOT_FOUND, e.getCode());
            throw e;
        }
    }
}
