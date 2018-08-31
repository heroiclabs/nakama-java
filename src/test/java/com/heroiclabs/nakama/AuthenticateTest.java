/*
 * Copyright 2018 The Nakama Authors
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

import com.google.common.util.concurrent.ListenableFuture;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class AuthenticateTest {
    private Client client;

    @Before
    public void init() {
        client = new DefaultClient("defaultkey");
        Assert.assertNotNull(client);
    }

    @Test
    public void testDevice() throws Exception {
        final ListenableFuture<Session> future = client.authenticateDevice(UUID.randomUUID().toString());
        Assert.assertNotNull(future);
        Assert.assertNotNull(future.get());
    }

    @Test
    public void testCustom() throws Exception {
        final ListenableFuture<Session> future = client.authenticateCustom(UUID.randomUUID().toString());
        Assert.assertNotNull(future);
        Assert.assertNotNull(future.get());
    }
}
