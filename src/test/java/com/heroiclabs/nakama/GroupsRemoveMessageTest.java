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
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class GroupsRemoveMessageTest {

    private Client client;

    @Before
    public void init() throws Exception {
        client = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client);

        AuthenticateMessage auth = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred = client.register(auth);
        deferred.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client.connect(session);
            }
        }).join(2000);
    }

    @After
    public void teardown() throws Exception {
        client.disconnect().join(2000);
    }

    @Test(expected = Error.class)
    public void groupsRemoveNotFound() throws Exception {
        GroupsRemoveMessage remove = GroupsRemoveMessage.Builder.newBuilder()
                .id(UUID.randomUUID().toString())
                .build();
        final Deferred<Boolean> deferred = client.send(remove);
        deferred.addCallback(new Callback<Boolean, Boolean>() {
            @Override
            public Boolean call(Boolean success) throws Exception {
                Assert.fail("Should not reach this point.");
                return success;
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.assertEquals(Error.ErrorCode.RUNTIME_EXCEPTION, error.getCode());
                return error;
            }
        });
        deferred.join(2000);
    }

    @Test
    public void groupsRemove() throws Exception {
        final String name = UUID.randomUUID().toString();
        GroupsCreateMessage create = GroupsCreateMessage.Builder.newBuilder()
                .group(name, null, null, null, "{}", false)
                .build();
        final Deferred<ResultSet<Group>> deferred = client.send(create);
        deferred.addCallbackDeferring(new Callback<Deferred<Boolean>, ResultSet<Group>>() {
            @Override
            public Deferred<Boolean> call(ResultSet<Group> groups) throws Exception {
                Assert.assertEquals(1, groups.getResults().size());
                Assert.assertEquals(name, groups.getResults().get(0).getName());
                GroupsRemoveMessage remove = GroupsRemoveMessage.Builder.newBuilder()
                        .id(groups.getResults().get(0).getId())
                        .build();
                return client.send(remove);
            }
        }).addErrback(new Callback<Error, Error>() {
            @Override
            public Error call(Error error) throws Exception {
                Assert.fail("Should not reach this point.");
                return error;
            }
        });
        deferred.join(2000);
    }

}
