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
        // socket.connect(session, new AbstractSocketListener() {}).get();
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
}
