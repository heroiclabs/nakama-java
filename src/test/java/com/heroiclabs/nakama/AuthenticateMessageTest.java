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
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

public class AuthenticateMessageTest {

    private static Client client;

    @BeforeClass
    public static void init() {
        client = DefaultClient.builder("defaultkey").build();
        Assert.assertNotNull(client);
    }

    @Test
    public void testDevice() throws Exception {
        final AuthenticateMessage auth = AuthenticateMessage.Builder.device(UUID.randomUUID().toString());
        final Session session = client.register(auth).join(2000);
        Assert.assertNotNull(session);
    }

    @Test
    public void loginOrRegister() throws Exception {
        final String id = UUID.randomUUID().toString();
        final AuthenticateMessage message = AuthenticateMessage.Builder.device(id);
        client.login(message)
                .addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
                    @Override
                    public Deferred<Session> call(Session session) throws Exception {
                        return client.connect(session);
                    }
                })
                .addErrback(new Callback<Deferred<Session>, Error>() {
                    @Override
                    public Deferred<Session> call(Error err) throws Exception {
                        if (err.getCode() == Error.ErrorCode.USER_NOT_FOUND) {
                            return client.register(message);
                        }
                        throw err;
                    }
                })
                .addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
                    @Override
                    public Deferred<Session> call(Session session) throws Exception {
                        return client.connect(session);
                    }
                })
                .addErrback(new Callback<Error, Error>() {
                    @Override
                    public Error call(Error err) throws Exception {
                        System.out.format("Error: code '%s' with '%s'.", err.getCode(), err.getMessage());
                        return err;
                    }
                })
                .join(2000);
    }

}
