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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

public class SocketTest {
    private Session session;
    private SocketClient socket;

    @Before
    public void init() throws Exception {
        final Client client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
        socket = client.createSocket();
    }

    @After
    public void shutdown() throws Exception {
        socket.disconnect();
    }

    @Test(expected = Error.class)
    public void sendNotConnectedUnhandled() throws Throwable {
        try {
            socket.createMatch().get();
        } catch (Exception e) {
            throw e.getCause();
        }
    }

    @Test
    public void sendConnectedNoException() throws Exception {
        socket.connect(session, new AbstractSocketListener() {}).get();
        try {
            final Match match = socket.createMatch().get();
            Assert.assertNotNull(match);
            Assert.assertNotNull(match.getMatchId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class TestSocketConnectCallback implements FutureCallback<Session> {
        public boolean failureDispatched = false;
        public boolean successDispatched = false;

        @Override
        public void onSuccess(@org.jetbrains.annotations.Nullable Session result) {
            this.successDispatched = true;
        }

        @Override
        public void onFailure(Throwable t) {
            this.failureDispatched = true;
        }
    }

    @Test
    public void sendConnectedFailureHandled() {
        final ExecutorService executor = Executors.newSingleThreadExecutor();

        final TestSocketConnectCallback connectCallback = new TestSocketConnectCallback();
        Futures.addCallback(socket.connect(new InvalidSession(), new AbstractSocketListener(){}), connectCallback, executor);

        try {
            executor.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Assert.fail("Current thread interrupted.");
        }

        Assert.assertTrue("Failure callback was not dispatched.", connectCallback.failureDispatched);
    }

    @Test
    public void sendConnectedSuccessHandled() {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        final TestSocketConnectCallback connectCallback = new TestSocketConnectCallback();

        Futures.addCallback(socket.connect(session, new AbstractSocketListener(){}), connectCallback, executor);

        try {
            executor.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Assert.fail("Current thread interrupted.");
        }

        Assert.assertTrue("Success callback was not dispatched.", connectCallback.successDispatched);
    }
}
