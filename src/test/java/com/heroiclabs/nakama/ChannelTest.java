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

import com.heroiclabs.nakama.api.ChannelMessage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ChannelTest {
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
    public void testCreateRoom() throws Exception {
        socket.connect(session, new AbstractSocketListener() {});
        final Channel channel = socket.joinChat("myroom", ChannelType.ROOM).get();
        Assert.assertNotNull(channel);
        Assert.assertNotNull(channel.getId());
        Assert.assertNotNull(channel.getPresences());
        Assert.assertNotNull(channel.getSelf());
        Assert.assertEquals(session.getUserId(), channel.getSelf().getUserId());
        socket.leaveChat(channel.getId()).get();
        socket.disconnect();
    }

    @Test
    public void testCreateRoomAndMessage() throws Exception {
        final List<Boolean> callbacks = new ArrayList<Boolean>();
        final CountDownLatch latch = new CountDownLatch(2);
        final String content = "{\"message\":\"Hello world\"}";
        socket.connect(session, new AbstractSocketListener() {
            @Override
            public void onChannelMessage(final ChannelMessage message) {
                super.onChannelMessage(message);
                callbacks.add(true);
                Assert.assertNotNull(message);
                Assert.assertNotNull(message.getMessageId());
                Assert.assertNotNull(message.getChannelId());
                Assert.assertNotEquals(0, message.getCreateTime().getSeconds());
                Assert.assertNotEquals(0, message.getUpdateTime().getSeconds());
                Assert.assertEquals(session.getUserId(), message.getSenderId());
                Assert.assertEquals(content, message.getContent());
                latch.countDown();
            }

            @Override
            public void onChannelPresence(final ChannelPresenceEvent presence) {
                super.onChannelPresence(presence);
                callbacks.add(true);
                Assert.assertNotNull(presence);
                Assert.assertNull(presence.getLeaves());
                Assert.assertNotNull(presence.getJoins());
                Assert.assertNotNull(presence.getJoins().get(0));
                Assert.assertEquals(session.getUserId(), presence.getJoins().get(0).getUserId());
                latch.countDown();
            }
        });
        final Channel channel = socket.joinChat("myroom2", ChannelType.ROOM).get();
        Assert.assertNotNull(channel);
        final ChannelMessageAck ack = socket.writeChatMessage(channel.getId(), content).get();
        Assert.assertNotNull(ack);
        Assert.assertNotNull(ack.getMessageId());
        Assert.assertEquals(channel.getId(), ack.getChannelId());
        Assert.assertNotNull(ack.getCreateTime());
        Assert.assertNotNull(ack.getUpdateTime());

        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(2, callbacks.size());
    }
}
