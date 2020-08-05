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

import com.heroiclabs.nakama.api.Group;
import com.heroiclabs.nakama.api.GroupList;
import com.heroiclabs.nakama.api.GroupUserList;
import com.heroiclabs.nakama.api.GroupUserList.GroupUser;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class GroupTest {
    private Client client;
    private Session session;

    @Before
    public void init() throws Exception {
        client = new DefaultClient("defaultkey");
        session = client.authenticateCustom(UUID.randomUUID().toString()).get();
    }

    @After
    public void shutdown() throws Exception {
        client.disconnect(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testCreateAndUpdateGroup() throws Exception {
        String generatedString = createGeneratedName();

        final String groupName = "group_name" + generatedString;
        final String groupDescription = "group_description";
        final String groupAvatarUrl = "group_avatar_url";
        final String groupLang = "fa";

        Group group = client.createGroup(session, groupName, groupDescription, groupAvatarUrl, groupLang).get();
        Assert.assertNotNull(group);
        Assert.assertNotEquals("", group.getId());
        Assert.assertEquals(groupName, group.getName());
        Assert.assertEquals(groupDescription, group.getDescription());
        Assert.assertEquals(groupAvatarUrl, group.getAvatarUrl());
        Assert.assertEquals(groupLang, group.getLangTag());

        final String groupNameUpdate = groupName + "2";
        client.updateGroup(session, group.getId(), groupNameUpdate).get();

        GroupList groupList = client.listGroups(session, groupNameUpdate).get();
        Assert.assertEquals(1, groupList.getGroupsCount());
    }

    @Test
    public void testAddUsersToGroup() throws Exception {

        final String member1Id = UUID.randomUUID().toString();
        final Client member1Client = new DefaultClient("defaultkey");
        final Session member1Session = member1Client.authenticateCustom(member1Id).get();

        final String member2Id = UUID.randomUUID().toString();
        final Client member2Client = new DefaultClient("defaultkey");
        final Session member2Session = member2Client.authenticateCustom(member2Id).get();

        Group group = createGroup(session);
        client.addGroupUsers(session, group.getId(), member1Session.getUserId(), member2Session.getUserId()).get();
        GroupUserList users = client.listGroupUsers(session, group.getId()).get();
        Logger.getGlobal().info("count is " + users.getGroupUsersCount());

        Assert.assertTrue(users.getGroupUsersCount() == 3);

        List<GroupUser> usersList = users.getGroupUsersList();

        Predicate<String> isId = id -> usersList.stream().anyMatch(user -> user.getUser().getId().equals(id));
        Assert.assertTrue(isId.test(session.getUserId()));
        Assert.assertTrue(isId.test(member1Session.getUserId()));
        Assert.assertTrue(isId.test(member2Session.getUserId()));
    }

    @Test
    public void testBanUsersFromGroup() throws Exception {
        final String member1Id = UUID.randomUUID().toString();
        final Client member1Client = new DefaultClient("defaultkey");
        final Session member1Session = member1Client.authenticateCustom(member1Id).get();

        final String member2Id = UUID.randomUUID().toString();
        final Client member2Client = new DefaultClient("defaultkey");
        final Session member2Session = member2Client.authenticateCustom(member2Id).get();

        Group group = createGroup(session);
        client.addGroupUsers(session, group.getId(), member1Session.getUserId(), member2Session.getUserId()).get();

        GroupUserList users = client.listGroupUsers(session, group.getId()).get();
        Assert.assertTrue(users.getGroupUsersCount() == 3);

        client.banGroupUsers(session, group.getId(), member2Session.getUserId()).get();

        //was successful ban
        GroupUserList remainingUsers = client.listGroupUsers(session, group.getId()).get();
        Assert.assertTrue(remainingUsers.getGroupUsersCount() == 2);

        Predicate<GroupUser> member2Exists = user -> user.getUser().getId() == member2Session.getUserId();
        Assert.assertFalse(remainingUsers.getGroupUsersList().stream().anyMatch(member2Exists));

        // cannot ban the group creator
        client.banGroupUsers(session, group.getId(), session.getUserId()).get();
        Assert.assertTrue(remainingUsers.getGroupUsersCount() == 2);
    }

    private Group createGroup(Session session) throws Exception {
        String generatedName = createGeneratedName();

        final String groupName = "group_name" + generatedName;
        final String groupDescription = "group_description";
        final String groupAvatarUrl = "group_avatar_url";
        final String groupLang = "fa";

        return client.createGroup(session, groupName, groupDescription, groupAvatarUrl, groupLang).get();
    }

    private String createGeneratedName()
    {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}
