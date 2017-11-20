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

public class GroupsJoinMessageTest {

    private Client client1;
    private Client client2;

    private Session session1;
    private Session session2;

    @Before
    public void init() throws Exception {
        client1 = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client1);

        client2 = DefaultClient.defaults("defaultkey");
        Assert.assertNotNull(client2);

        AuthenticateMessage auth1 = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred1 = client1.register(auth1);
        deferred1.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client1.connect(session);
            }
        }).addCallback(new Callback<Session, Session>() {
            @Override
            public Session call(Session session) throws Exception {
                session1 = session;
                return session;
            }
        }).join(2000);

        AuthenticateMessage auth2 = AuthenticateMessage.Builder.custom(UUID.randomUUID().toString());
        final Deferred<Session> deferred2 = client2.register(auth2);
        deferred2.addCallbackDeferring(new Callback<Deferred<Session>, Session>() {
            @Override
            public Deferred<Session> call(Session session) throws Exception {
                return client2.connect(session);
            }
        }).addCallback(new Callback<Session, Session>() {
            @Override
            public Session call(Session session) throws Exception {
                session2 = session;
                return session;
            }
        }).join(2000);
    }

    @After
    public void teardown() throws Exception {
        client1.disconnect().join(2000);
        client2.disconnect().join(2000);
    }

    @Test
    public void groupsJoinPublic() throws Exception {
        final String name = UUID.randomUUID().toString();
        GroupsCreateMessage create = GroupsCreateMessage.Builder.newBuilder()
                .group(name, null, null, null, "{}", false)
                .build();
        final Deferred<ResultSet<Group>> deferred = client1.send(create);
        deferred.addCallbackDeferring(new Callback<Deferred<Boolean>, ResultSet<Group>>() {
            @Override
            public Deferred<Boolean> call(ResultSet<Group> groups) throws Exception {
                Assert.assertEquals(1, groups.getResults().size());
                Assert.assertEquals(name, groups.getResults().get(0).getName());
                GroupsJoinMessage join = GroupsJoinMessage.Builder.newBuilder()
                        .id(groups.getResults().get(0).getId())
                        .build();
                return client2.send(join);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<GroupSelf>>, Boolean>() {
            @Override
            public Deferred<ResultSet<GroupSelf>> call(Boolean success) throws Exception {
                Assert.assertTrue(success);
                GroupsSelfListMessage list = GroupsSelfListMessage.Builder.build();
                return client2.send(list);
            }
        }).addCallback(new Callback<ResultSet<GroupSelf>, ResultSet<GroupSelf>>() {
            @Override
            public ResultSet<GroupSelf> call(ResultSet<GroupSelf> groups) throws Exception {
                Assert.assertEquals(1, groups.getResults().size());
                Assert.assertEquals(name, groups.getResults().get(0).getName());
                Assert.assertEquals(Group.MembershipType.MEMBER, groups.getResults().get(0).getState());
                return groups;
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

    @Test
    public void groupsJoinPrivate() throws Exception {
        final String name = UUID.randomUUID().toString();
        GroupsCreateMessage create = GroupsCreateMessage.Builder.newBuilder()
                .group(name, null, null, null, "{}", true)
                .build();
        final Deferred<ResultSet<Group>> deferred = client1.send(create);
        deferred.addCallbackDeferring(new Callback<Deferred<Boolean>, ResultSet<Group>>() {
            @Override
            public Deferred<Boolean> call(ResultSet<Group> groups) throws Exception {
                Assert.assertEquals(1, groups.getResults().size());
                Assert.assertEquals(name, groups.getResults().get(0).getName());
                GroupsJoinMessage join = GroupsJoinMessage.Builder.newBuilder()
                        .id(groups.getResults().get(0).getId())
                        .build();
                return client2.send(join);
            }
        }).addCallbackDeferring(new Callback<Deferred<ResultSet<GroupSelf>>, Boolean>() {
            @Override
            public Deferred<ResultSet<GroupSelf>> call(Boolean success) throws Exception {
                Assert.assertTrue(success);
                GroupsSelfListMessage list = GroupsSelfListMessage.Builder.build();
                return client2.send(list);
            }
        }).addCallback(new Callback<ResultSet<GroupSelf>, ResultSet<GroupSelf>>() {
            @Override
            public ResultSet<GroupSelf> call(ResultSet<GroupSelf> groups) throws Exception {
                Assert.assertEquals(0, groups.getResults().size());
                return groups;
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
