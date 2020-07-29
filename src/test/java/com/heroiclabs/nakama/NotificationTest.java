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

import com.heroiclabs.nakama.api.Notification;
import com.heroiclabs.nakama.api.NotificationList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class NotificationTest {
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
    public void testCreateAndListenForNewNotification() throws Exception {
        final List<Boolean> callbacks = new ArrayList<Boolean>();
        final CountDownLatch latch = new CountDownLatch(1);
        socket.connect(session, new AbstractSocketListener() {
            @Override
            public void onNotifications(final NotificationList notifications) {
                super.onNotifications(notifications);
                callbacks.add(true);
                Assert.assertNotNull(notifications);
                Assert.assertNotNull(notifications.getNotificationsList());
                Assert.assertEquals(1, notifications.getNotificationsCount());
                Assert.assertEquals(1, notifications.getNotificationsList().size());
                final Notification n = notifications.getNotificationsList().get(0);

                Assert.assertEquals(1, n.getCode());
                Assert.assertEquals("{\"reward_coins\":1000}", n.getContent());
                Assert.assertTrue(n.getPersistent());
                Assert.assertEquals(session.getUserId(), n.getSenderId());
                Assert.assertNotNull(n.getCreateTime());
                Assert.assertNotEquals(0, n.getCreateTime().getSeconds());
                latch.countDown();
            }
        }).get();

        final String payload = "{\"user_id\":\"" + session.getUserId() + "\"}";
        socket.rpc("clientrpc.send_notification", payload).get();
        latch.await(10, TimeUnit.SECONDS);
        Assert.assertEquals(1, callbacks.size());
    }

    @Test
    public void testCreateAndListNotifications() throws Exception {
        socket.connect(session, new AbstractSocketListener() {}).get();

        final String payload = "{\"user_id\":\"" + session.getUserId() + "\"}";
        socket.rpc("clientrpc.send_notification", payload).get();

        final NotificationList notifications = client.listNotifications(session).get();
        Assert.assertNotNull(notifications);
        Assert.assertNotNull(notifications.getNotificationsList());
        Assert.assertEquals(1, notifications.getNotificationsCount());
        Assert.assertEquals(1, notifications.getNotificationsList().size());

    }
}
