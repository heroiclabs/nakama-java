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
import com.google.protobuf.Empty;
import com.heroiclabs.nakama.api.*;
import lombok.NonNull;

public interface Client {
    SocketClient createSocket(@NonNull final String host, @NonNull final int port, @NonNull final boolean ssl);
    SocketClient createSocket(@NonNull final String host, @NonNull final int port, @NonNull final boolean ssl, @NonNull final int socketTimeoutMs);
    
    ListenableFuture<Empty> addFriends(@NonNull final Session session, @NonNull final String... ids);
    ListenableFuture<Empty> addFriends(@NonNull final Session session, @NonNull final Iterable<String> ids, @NonNull final String... usernames);

    ListenableFuture<Empty> addGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);

    ListenableFuture<Session> authenticateCustom(@NonNull final String id);
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final String username);
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final boolean create);
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateDevice(@NonNull final String id);
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final String username);
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final boolean create);
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password);
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final String username);
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final boolean create);
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken);
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final String username);
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final boolean create);
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken);
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final String username);
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final boolean create);
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateSteam(@NonNull final String token);
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final String username);
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final boolean create);
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final String username);
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final boolean create);
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final boolean create, @NonNull final String username);

    ListenableFuture<Empty> blockFriends(@NonNull final Session session, @NonNull final String... ids);
    ListenableFuture<Empty> blockFriends(@NonNull final Session session, @NonNull final Iterable<String> ids, @NonNull final String... usernames);

    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name);
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, @NonNull final String description);
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl);
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl, @NonNull final String langTag);
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl, @NonNull final String langTag, @NonNull final boolean open);

    ListenableFuture<Empty> deleteFriends(@NonNull final Session session, @NonNull final String... ids);
    ListenableFuture<Empty> deleteFriends(@NonNull final Session session, @NonNull final Iterable<String> ids, @NonNull final String... usernames);

    ListenableFuture<Empty> deleteGroup(@NonNull final Session session, @NonNull final String groupId);

    ListenableFuture<Empty> deleteLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId);

    ListenableFuture<Empty> deleteNotifications(@NonNull final Session session, @NonNull final String... notificationIds);

    ListenableFuture<Empty> deleteStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds);

    ListenableFuture<Account> getAccount(@NonNull final Session session);
    ListenableFuture<Users> getUsers(@NonNull final Session session, @NonNull final String... ids);
    ListenableFuture<Users> getUsers(@NonNull final Session session, @NonNull final Iterable<String> ids, @NonNull final String... usernames);
    ListenableFuture<Users> getUsers(@NonNull final Session session, @NonNull final Iterable<String> ids, @NonNull final Iterable<String> usernames, @NonNull final String... facebookIds);

    ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token);
    ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token, @NonNull final boolean reset);

    ListenableFuture<Empty> joinGroup(@NonNull final Session session, @NonNull final String groupId);
    ListenableFuture<Empty> kickGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);
    ListenableFuture<Empty> leaveGroup(@NonNull final Session session, @NonNull final String groupId);

    ListenableFuture<Empty> linkCustom(@NonNull final Session session, @NonNull final String id);
    ListenableFuture<Empty> linkDevice(@NonNull final Session session, @NonNull final String id);
    ListenableFuture<Empty> linkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password);
    ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken);
    ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken, @NonNull final boolean importFriends);
    ListenableFuture<Empty> linkGoogle(@NonNull final Session session, @NonNull final String accessToken);
    ListenableFuture<Empty> linkSteam(@NonNull final Session session, @NonNull final String token);
    ListenableFuture<Empty> linkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);

    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId);
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, @NonNull final int limit);
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, @NonNull final int limit, @NonNull final String cursor);
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, @NonNull final int limit, @NonNull final String cursor, @NonNull final boolean forward);

    ListenableFuture<Friends> listFriends(@NonNull final Session session);

    ListenableFuture<GroupUserList> listGroupUsers(@NonNull final Session session, @NonNull final String groupId);
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name);
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name, @NonNull final int limit);
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name, @NonNull final int limit, @NonNull final String cursor);

    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId);
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final String... ownerIds);
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final Iterable<String> ownerIds, @NonNull final int limit);
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final Iterable<String> ownerIds, @NonNull final int limit, @NonNull final String cursor);

    ListenableFuture<MatchList> listMatches(@NonNull final Session session);
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, @NonNull final int min);
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, @NonNull final int min, @NonNull final int max);
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, @NonNull final int min, @NonNull final int max, @NonNull final int limit);
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, @NonNull final int min, @NonNull final int max, @NonNull final int limit, @NonNull final String label);
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, @NonNull final int min, @NonNull final int max, @NonNull final int limit, @NonNull final String label, @NonNull final boolean authoritative);

    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session);
    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, @NonNull final int limit);
    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, @NonNull final int limit, @NonNull final String cacheableCursor);

    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection);
    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, @NonNull final int limit);
    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, @NonNull final int limit, @NonNull final String cursor);

    ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session);
    ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session, @NonNull final String userId);

    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, @NonNull final String userId);
    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, @NonNull final String userId, @NonNull final int limit);
    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, @NonNull final String userId, @NonNull final int limit, @NonNull final String cursor);

    ListenableFuture<Empty> promoteGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);

    ListenableFuture<StorageObjects> readStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds);

    ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id);
    ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id, final String payload);

//    TODO(mo): Is this still needed from the client / doable using gRPC?
//    ListenableFuture<Rpc> rpc(@NonNull final String httpKey, @NonNull final String id);
//    ListenableFuture<Rpc> rpc(@NonNull final String httpKey, @NonNull final String id, @NonNull final String payload);

    ListenableFuture<Empty> unlinkCustom(@NonNull final Session session, @NonNull final String id);
    ListenableFuture<Empty> unlinkDevice(@NonNull final Session session, @NonNull final String id);
    ListenableFuture<Empty> unlinkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password);
    ListenableFuture<Empty> unlinkFacebook(@NonNull final Session session, @NonNull final String accessToken);
    ListenableFuture<Empty> unlinkGoogle(@NonNull final Session session, @NonNull final String accessToken);
    ListenableFuture<Empty> unlinkSteam(@NonNull final Session session, @NonNull final String token);
    ListenableFuture<Empty> unlinkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, @NonNull final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);

    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username);
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username, @NonNull final String displayName);
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username, @NonNull final String displayName, @NonNull final String avatarUrl);
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username, @NonNull final String displayName, @NonNull final String avatarUrl, @NonNull final String langTag);
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username, @NonNull final String displayName, @NonNull final String avatarUrl, @NonNull final String langTag, @NonNull final String location);
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, @NonNull final String username, @NonNull final String displayName, @NonNull final String avatarUrl, @NonNull final String langTag, @NonNull final String location, @NonNull final String timezone);

    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, @NonNull final String name);
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, @NonNull final String name, @NonNull final String description);
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl);
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl, @NonNull final String langTag);
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, @NonNull final String name, @NonNull final String description, @NonNull final String avatarUrl, @NonNull final String langTag, @NonNull final boolean open);

    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final long score);
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final long score, @NonNull final long subscore);
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final long score, @NonNull final String metadata);
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final long score, @NonNull final long subscore, @NonNull final String metadata);

    ListenableFuture<StorageObjectAcks> writeStorageObjects(@NonNull final Session session, @NonNull final StorageObjectWrite... objects);


}
