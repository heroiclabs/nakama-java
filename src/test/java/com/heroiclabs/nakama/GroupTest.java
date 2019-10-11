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

import com.heroiclabs.nakama.api.Group;
import com.heroiclabs.nakama.api.GroupList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

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
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

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
}
