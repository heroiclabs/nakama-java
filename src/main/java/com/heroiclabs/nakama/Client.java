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

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Empty;
import com.heroiclabs.nakama.api.*;
import lombok.NonNull;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A client to interact with Nakama server.
 */
public interface Client {

    /**
     * Disconnects the client. This function kills all outgoing exchanges and waits until the channel is shutdown.
     */
    void disconnect(final long timeout, @NonNull final TimeUnit unit) throws InterruptedException;

    /**
     * Disconnects the client. This function kills all outgoing exchanges immediately without waiting.
     */
    void disconnect();

    /**
     * Create a new socket from the client with the default port set to 7350.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket();

    /**
     * Create a new socket from the client.
     * @param port The port number of the server. Default should be 7350.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket(final int port);

    /**
     * Create a new socket from the client.
     * @param port The port number of the server. Default should be 7350.
     * @param socketTimeoutMs Sets the connect, read and write timeout for new connections.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket(final int port, final int socketTimeoutMs);

    /**
     * Create a new socket from the client.
     * @param host The host URL of the server.
     * @param port The port number of the server. Default should be 7350.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket(final String host, final int port);

    /**
     * Create a new socket from the client.
     * @param host The host URL of the server.
     * @param port The port number of the server. Default should be 7350.
     * @param ssl Whether to use SSL to connect to the server.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket(final String host, final int port, final boolean ssl);

    /**
     * Create a new socket from the client.
     * @param host The host URL of the server.
     * @param port The port number of the server. Default should be 7350.
     * @param ssl Whether to use SSL to connect to the server.
     * @param socketTimeoutMs Sets the connect, read and write timeout for new connections.
     * @return a new SocketClient instance.
     */
    SocketClient createSocket(final String host, final int port, final boolean ssl, final int socketTimeoutMs);

    /**
     * Add one or more friends by id.
     * @param session The session of the user.
     * @param ids The ids of the users to add or invite as friends.
     * @return A future.
     */
    ListenableFuture<Empty> addFriends(@NonNull final Session session, @NonNull final String... ids);

    /**
     * Add one or more friends by id or username.
     * @param session The session of the user.
     * @param ids The ids of the users to add or invite as friends.
     * @param usernames The usernames of the users to add as friends.
     * @return A future.
     */
    ListenableFuture<Empty> addFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames);

    /**
     * Add one or more users to the group.
     * @param session The session of the user.
     * @param groupId The id of the group to add users into.
     * @param ids The ids of the users to add or invite to the group.
     * @return A future.
     */
    ListenableFuture<Empty> addGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, @NonNull final String username);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with a custom id.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateCustom(@NonNull final String id, final boolean create, final String username, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, @NonNull final String username);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with a device id.
     * @param id A device identifier usually obtained from a platform API.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateDevice(@NonNull final String id, final boolean create, final String username, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, @NonNull final String username);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with an email and password.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateEmail(@NonNull final String email, @NonNull final String password, final boolean create, final String username, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, @NonNull final String username);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param importFriends True if the Facebook friends should be imported.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, @NonNull final String username, final boolean importFriends);

    /**
     * Authenticate a user with a Facebook auth token.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param importFriends True if the Facebook friends should be imported.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateFacebook(@NonNull final String accessToken, final boolean create, final String username, final boolean importFriends, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, @NonNull final String username);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with a Google auth token.
     * @param accessToken An OAuth access token from the Google SDK.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGoogle(@NonNull final String accessToken, final boolean create, final String username, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, @NonNull final String username);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with a Steam auth token.
     * @param token An authentication token from the Steam network.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateSteam(@NonNull final String token, final boolean create, @NonNull final String username, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);


    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final Map<String, String> vars);

    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, @NonNull final String username);

    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @param create True if the user should be created when authenticated.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create);

    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create, @NonNull final String username);

    /**
     * Authenticate a user with Apple Game Center.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @param create True if the user should be created when authenticated.
     * @param username A username used to create the user.
     * @param vars Extra information that will be bundled in the session token.
     * @return A future to resolve a session object.
     */
    ListenableFuture<Session> authenticateGameCenter(@NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl, final boolean create, final String username, @NonNull final Map<String, String> vars);

    /**
     * Bans a user from a group. This will prevent the user from being able to rejoin the group.
     * @param session The session of the user.
     * @param groupId The group to ban the users from.
     * @param ids The users to ban from the group..
     * @return A future.
     */
    public ListenableFuture<Empty> banGroupUsers(@NonNull final Session session, @NonNull String groupId, @NonNull final String... ids);

    /**
     * Block one or more friends by id.
     * @param session The session of the user.
     * @param ids The ids of the users to block.
     * @return A future.
     */
    ListenableFuture<Empty> blockFriends(@NonNull final Session session, @NonNull final String... ids);

    /**
     * Block one or more friends by id or username.
     * @param session The session of the user.
     * @param ids The ids of the users to block.
     * @param usernames The usernames of the users to block.
     * @return A future.
     */
    ListenableFuture<Empty> blockFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @param description A description for the group.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @param description A description for the group.
     * @param avatarUrl An avatar url for the group.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @param description A description for the group.
     * @param avatarUrl An avatar url for the group.
     * @param langTag A language tag in BCP-47 format for the group.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @param description A description for the group.
     * @param avatarUrl An avatar url for the group.
     * @param langTag A language tag in BCP-47 format for the group.
     * @param open True if the group should have open membership.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag, final boolean open);

    /**
     * Create a group.
     * @param session The session of the user.
     * @param name The name for the group.
     * @param description A description for the group.
     * @param avatarUrl An avatar url for the group.
     * @param langTag A language tag in BCP-47 format for the group.
     * @param open True if the group should have open membership.
     * @param maxCount Maximum number of group members.
     * @return A future to resolve a new group object.
     */
    ListenableFuture<Group> createGroup(@NonNull final Session session, @NonNull final String name, final String description, final String avatarUrl, final String langTag, final boolean open, final int maxCount);

    /**
     * Delete one more or users by id.
     * @param session The session of the user.
     * @param ids the user ids to remove as friends.
     * @return A future.
     */
    ListenableFuture<Empty> deleteFriends(@NonNull final Session session, @NonNull final String... ids);

    /**
     * Delete one more or users by id or username from friends.
     * @param session The session of the user.
     * @param ids the user ids to remove as friends.
     * @param usernames The usernames to remove as friends.
     * @return A future.
     */
    ListenableFuture<Empty> deleteFriends(@NonNull final Session session, final Iterable<String> ids, final String... usernames);

    /**
     * Delete a group by id.
     *
     * @param session The session of the user.
     * @param groupId The group id to to remove.
     * @return A future.
     */
    ListenableFuture<Empty> deleteGroup(@NonNull final Session session, @NonNull final String groupId);

    /**
     * Delete a leaderboard record.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard with the record to be deleted.
     * @return A future.
     */
    ListenableFuture<Empty> deleteLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId);

    /**
     * Delete one or more notifications by id.
     *
     * @param session The session of the user.
     * @param notificationIds The notification ids to remove.
     * @return A future.
     */
    ListenableFuture<Empty> deleteNotifications(@NonNull final Session session, @NonNull final String... notificationIds);

    /**
     * Delete one or more storage objects.
     *
     * @param session The session of the user.
     * @param objectIds The ids of the objects to delete.
     * @return A future.
     */
    ListenableFuture<Empty> deleteStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds);

    /**
     * Submit an event for processing in the server's registered runtime custom events handler.
     *
     * @param session The session of the user.
     * @param name An event name, type, category, or identifier.
     * @param properties Arbitrary event property values.
     * @return A future.
     */
    ListenableFuture<Empty> emitEvent(@NonNull final Session session, @NonNull final String name, @NonNull final Map<String, String> properties);

    /**
     * Fetch the user account owned by the session.
     *
     * @param session The session of the user.
     * @return A future to resolve an account object.
     */
    ListenableFuture<Account> getAccount(@NonNull final Session session);

    /**
     * Fetch one or more users by id, usernames, and Facebook ids.
     *
     * @param session The session of the user.
     * @param ids List of user IDs.
     * @return A future to resolve user objects.
     */
    ListenableFuture<Users> getUsers(@NonNull final Session session, @NonNull final String... ids);

    /**
     * Fetch one or more users by id, usernames, and Facebook ids.
     *
     * @param session The session of the user.
     * @param ids List of user IDs.
     * @param usernames List of usernames.
     * @return A future to resolve user objects.
     */
    ListenableFuture<Users> getUsers(@NonNull final Session session, final Iterable<String> ids, final String... usernames);

    /**
     * Fetch one or more users by id, usernames, and Facebook ids.
     *
     * @param session The session of the user.
     * @param ids List of user IDs.
     * @param usernames List of usernames.
     * @param facebookIds List of Facebook IDs.
     * @return A future to resolve user objects.
     */
    ListenableFuture<Users> getUsers(@NonNull final Session session, final Iterable<String> ids, final Iterable<String> usernames, final String... facebookIds);

    /**
     * Import Facebook friends and add them to the user's account.
     *
     * The server will import friends when the user authenticates with Facebook. This function can be used to be
     * explicit with the import operation.
     *
     * @param session The session of the user.
     * @param token An OAuth access token from the Facebook SDK.
     * @return A future.
     */
    ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token);

    /**
     * Import Facebook friends and add them to the user's account.
     *
     * The server will import friends when the user authenticates with Facebook. This function can be used to be
     * explicit with the import operation.
     *
     * @param session The session of the user.
     * @param token An OAuth access token from the Facebook SDK.
     * @param reset True if the Facebook friend import for the user should be reset.
     * @return A future.
     */
    ListenableFuture<Empty> importFacebookFriends(@NonNull final Session session, @NonNull final String token, final boolean reset);

    /**
     * Join a group if it has open membership or request to join it.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to join.
     * @return A future.
     */
    ListenableFuture<Empty> joinGroup(@NonNull final Session session, @NonNull final String groupId);

    /**
     * Join a group if it has open membership or request to join it.
     *
     * @param session The session of the user.
     * @param tournamentId The id of the tournament to join.
     * @return A future.
     */
    ListenableFuture<Empty> joinTournament(@NonNull final Session session, @NonNull final String tournamentId);

    /**
     * Kick one or more users from the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group.
     * @param ids The ids of the users to kick.
     * @return A future.
     */
    ListenableFuture<Empty> kickGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);

    /**
     * Leave a group by id.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to leave.
     * @return A future.
     */
    ListenableFuture<Empty> leaveGroup(@NonNull final Session session, @NonNull final String groupId);

    /**
     * Link a custom id to the user account owned by the session.
     *
     * @param session The session of the user.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @return A future.
     */
    ListenableFuture<Empty> linkCustom(@NonNull final Session session, @NonNull final String id);

    /**
     * Link a device id to the user account owned by the session.
     *
     * @param session The session of the user.
     * @param id A device identifier usually obtained from a platform API.
     * @return A future.
     */
    ListenableFuture<Empty> linkDevice(@NonNull final Session session, @NonNull final String id);

    /**
     * Link an email with password to the user account owned by the session.
     *
     * @param session The session of the user.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @return A future.
     */
    ListenableFuture<Empty> linkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password);

    /**
     * Link a Facebook profile to a user account.
     *
     * @param session The session of the user.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @return A future.
     */
    ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken);

    /**
     * Link a Facebook profile to a user account.
     *
     * @param session The session of the user.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @param importFriends True if the Facebook friends should be imported.
     * @return A future.
     */
    ListenableFuture<Empty> linkFacebook(@NonNull final Session session, @NonNull final String accessToken, final boolean importFriends);

    /**
     * Link a Google profile to a user account.
     *
     * @param session The session of the user.
     * @param accessToken An OAuth access token from the Google SDK.
     * @return A future.
     */
    ListenableFuture<Empty> linkGoogle(@NonNull final Session session, @NonNull final String accessToken);

    /**
     * Link a Steam profile to a user account.
     *
     * @param session The session of the user.
     * @param token An authentication token from the Steam network.
     * @return A future.
     */
    ListenableFuture<Empty> linkSteam(@NonNull final Session session, @NonNull final String token);

    /**
     * Link a Game Center profile to a user account.
     *
     * @param session The session of the user.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @return A future.
     */
    ListenableFuture<Empty> linkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);

    /**
     * List messages from a chat channel.
     *
     * @param session The session of the user.
     * @param channelId A channel identifier.
     * @return A future to resolve channel message objects.
     */
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId);

    /**
     * List messages from a chat channel.
     *
     * @param session The session of the user.
     * @param channelId A channel identifier.
     * @param limit The number of chat messages to list.
     * @return A future to resolve channel message objects.
     */
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit);

    /**
     * List messages from a chat channel.
     *
     * @param session The session of the user.
     * @param channelId A channel identifier.
     * @param limit The number of chat messages to list.
     * @param cursor A cursor for the current position in the messages history to list.
     * @return A future to resolve channel message objects.
     */
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit, final String cursor);

    /**
     * List messages from a chat channel.
     *
     * @param session The session of the user.
     * @param channelId A channel identifier.
     * @param limit The number of chat messages to list.
     * @param forward Fetch messages forward from the current cursor (or the start).
     * @param cursor A cursor for the current position in the messages history to list.
     * @return A future to resolve channel message objects.
     */
    ListenableFuture<ChannelMessageList> listChannelMessages(@NonNull final Session session, @NonNull final String channelId, final int limit, final String cursor, final boolean forward);

    /**
     * List of friends of the current user.
     *
     * @param session The session of the user.
     * @return A future to resolve friend objects.
     */
    ListenableFuture<FriendList> listFriends(@NonNull final Session session);

    /**
     * List of friends of the current user.
     *
     * @param session The session of the user.
     * @param state The friend state to list.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor An optional next page cursor.
     * @return A future to resolve friend objects.
     */
    ListenableFuture<FriendList> listFriends(@NonNull final Session session, final int state, final int limit, final String cursor);

    /**
     * List all users part of the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group.
     * @return A future to resolve group user objects.
     */
    ListenableFuture<GroupUserList> listGroupUsers(@NonNull final Session session, @NonNull final String groupId);

    /**
     * List all users part of the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group.
     * @param state The group user state to list.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor An optional next page cursor.
     * @return A future to resolve group user objects.
     */
    ListenableFuture<GroupUserList> listGroupUsers(@NonNull final Session session, @NonNull final String groupId, final int state, final int limit, final String cursor);

    /**
     * List groups on the server.
     *
     * @param session The session of the user.
     * @param name The name filter to apply to the group list.
     * @return A future to resolve group objects.
     */
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name);

    /**
     * List groups on the server.
     *
     * @param session The session of the user.
     * @param name The name filter to apply to the group list.
     * @param limit The number of groups to list.
     * @return A future to resolve group objects.
     */
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, @NonNull final String name, final int limit);

    /**
     * List groups on the server.
     *
     * @param session The session of the user.
     * @param name The name filter to apply to the group list.
     * @param limit The number of groups to list.
     * @param cursor A cursor for the current position in the groups to list.
     * @return A future to resolve group objects.
     */
    ListenableFuture<GroupList> listGroups(@NonNull final Session session, final String name, final int limit, final String cursor);

    /**
     * List records from a leaderboard.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId);

    /**
     * List records from a leaderboard.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerIds Record owners to fetch with the list of records.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final String... ownerIds);

    /**
     * List records from a leaderboard.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerIds Record owners to fetch with the list of records.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds, final int expiry);

    /**
     * List records from a leaderboard.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerIds Record owners to fetch with the list of records.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit The number of records to list.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds, final int expiry, final int limit);

    /**
     * List records from a leaderboard.
     *
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerIds Record owners to fetch with the list of records.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit The number of records to list.
     * @param cursor A cursor for the current position in the leaderboard records to list.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecords(@NonNull final Session session, @NonNull final String leaderboardId, final Iterable<String> ownerIds,  final int expiry, final int limit, final String cursor);

    /**
     * List leaderboard records from a given leaderboard around the owner.
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerId The owner to retrieve records around.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final String ownerId);

    /**
     * List leaderrboard records from a given leaderboard around the owner.
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerId The owner to retrieve records around.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final String ownerId, final int expiry);

    /**
     * List leaderrboard records from a given leaderboard around the owner.
     * @param session The session of the user.
     * @param leaderboardId The id of the leaderboard to list.
     * @param ownerId The owner to retrieve records around.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit Max number of records to return. Between 1 and 100.
     * @return A future to resolve leaderboard record objects.
     */
    ListenableFuture<LeaderboardRecordList> listLeaderboardRecordsAroundOwner(@NonNull final Session session, @NonNull final String leaderboardId, @NonNull final String ownerId, final int expiry, final int limit);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @param min The minimum number of match participants.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @param min The minimum number of match participants.
     * @param max The maximum number of match participants.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @param min The minimum number of match participants.
     * @param max The maximum number of match participants.
     * @param limit The number of matches to list.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @param min The minimum number of match participants.
     * @param max The maximum number of match participants.
     * @param limit The number of matches to list.
     * @param label The label to filter the match list on.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit, final String label);

    /**
     * Fetch a list of matches active on the server.
     *
     * @param session The session of the user.
     * @param min The minimum number of match participants.
     * @param max The maximum number of match participants.
     * @param limit The number of matches to list.
     * @param authoritative <c>True</c> to include authoritative matches.
     * @param label The label to filter the match list on.
     * @return A future to resolve match.
     */
    ListenableFuture<MatchList> listMatches(@NonNull final Session session, final int min, final int max, final int limit, final String label, final boolean authoritative);

    /**
     * List notifications for the user with an optional cursor.
     *
     * @param session The session of the user.
     * @return A future to resolve notifications objects.
     */
    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session);

    /**
     * List notifications for the user with an optional cursor.
     *
     * @param session The session of the user.
     * @param limit The number of notifications to list.
     * @return A future to resolve notifications objects.
     */
    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, final int limit);

    /**
     * List notifications for the user with an optional cursor.
     *
     * @param session The session of the user.
     * @param limit The number of notifications to list.
     * @param cacheableCursor A cursor for the current position in notifications to list.
     * @return A future to resolve notifications objects.
     */
    ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(@NonNull final Session session, final int limit, final String cacheableCursor);

    /**
     * List storage objects in a collection which have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection);

    /**
     * List storage objects in a collection which have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @param limit The number of objects to list.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, final int limit);

    /**
     * List storage objects in a collection which have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @param limit The number of objects to list.
     * @param cursor A cursor to paginate over the collection.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listStorageObjects(@NonNull final Session session, @NonNull final String collection, final int limit, final String cursor);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor A next page cursor for listings.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int limit, final String cursor);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param categoryStart The start of the categories to include. Defaults to 0.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param categoryStart The start of the categories to include. Defaults to 0.
     * @param categoryEnd The end of the categories to include. Defaults to 128.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param categoryStart The start of the categories to include. Defaults to 0.
     * @param categoryEnd The end of the categories to include. Defaults to 128.
     * @param startTime The start time for tournaments. Defaults to current Unix time.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param categoryStart The start of the categories to include. Defaults to 0.
     * @param categoryEnd The end of the categories to include. Defaults to 128.
     * @param startTime The start time for tournaments. Defaults to current Unix time.
     * @param endTime The end time for tournaments. Defaults to +1 year from current Unix time.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime, final long endTime);

    /**
     * List active/upcoming tournaments based on given filters.
     * @param session The session of the user.
     * @param categoryStart The start of the categories to include. Defaults to 0.
     * @param categoryEnd The end of the categories to include. Defaults to 128.
     * @param startTime The start time for tournaments. Defaults to current Unix time.
     * @param endTime The end time for tournaments. Defaults to +1 year from current Unix time.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor A next page cursor for listings.
     * @return a future which resolved to a tournament list.
     */
    ListenableFuture<TournamentList> listTournaments(@NonNull final Session session, final int categoryStart, final int categoryEnd, final long startTime, final long endTime, final int limit, final String cursor);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit Max number of records to return. Between 1 and 100.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor A next or previous page cursor.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit, final String cursor);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param ownerIds One or more owners to retrieve records for.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, @NonNull final String... ownerIds);

    /**
     * List tournament records from a given tournament.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor A next or previous page cursor.
     * @param ownerIds One or more owners to retrieve records for.
     * @return a future which resolved to a tournament record list.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecords(@NonNull final Session session, @NonNull final String tournamentId, final int expiry, final int limit, final String cursor, @NonNull final String... ownerIds);

    /**
     * List tournament records from a given tournament around the owner.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param ownerId The owner to retrieve records around.
     * @return A future to resolve tournament record objects.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, @NonNull final String ownerId);

    /**
     * List tournament records from a given tournament around the owner.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param ownerId The owner to retrieve records around.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @return A future to resolve tournament record objects.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, @NonNull final String ownerId, final int expiry);

    /**
     * List tournament records from a given tournament around the owner.
     * @param session The session of the user.
     * @param tournamentId The ID of the tournament to list for.
     * @param ownerId The owner to retrieve records around.
     * @param expiry Expiry in seconds (since epoch) to begin fetching records from.
     * @param limit Max number of records to return. Between 1 and 100.
     * @return A future to resolve tournament record objects.
     */
    ListenableFuture<TournamentRecordList> listTournamentRecordsAroundOwner(@NonNull final Session session, @NonNull final String tournamentId, @NonNull final String ownerId, final int expiry, final int limit);

    /**
     * List of groups the current user is a member of.
     *
     * @param session The session of the user.
     * @return A future which resolves to group objects.
     */
    ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session);

    /**
     * List groups a user is a member of.
     *
     * @param session The session of the user.
     * @param userId The id of the user whose groups to list.
     * @return A future which resolves to group objects.
     */
    ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session, final String userId);

    /**
     * List groups a user is a member of.
     *
     * @param session The session of the user.
     * @param userId The id of the user whose groups to list.
     * @param state The user group state to list.
     * @param limit Max number of records to return. Between 1 and 100.
     * @param cursor An optional next page cursor.
     * @return A future which resolves to group objects.
     */
    ListenableFuture<UserGroupList> listUserGroups(@NonNull final Session session, @NonNull final String userId, final int state, final int limit, final String cursor);

    /**
     * List storage objects in a collection which belong to a specific user and have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @param userId The user ID of the user to list objects for.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId);

    /**
     * List storage objects in a collection which belong to a specific user and have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @param userId The user ID of the user to list objects for.
     * @param limit The number of objects to list.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId, final int limit);

    /**
     * List storage objects in a collection which belong to a specific user and have public read access.
     *
     * @param session The session of the user.
     * @param collection The collection to list over.
     * @param userId The user ID of the user to list objects for.
     * @param limit The number of objects to list.
     * @param cursor A cursor to paginate over the collection.
     * @return A future which resolves to a storage object list.
     */
    ListenableFuture<StorageObjectList> listUsersStorageObjects(@NonNull final Session session, @NonNull final String collection, final String userId, final int limit, final String cursor);

    /**
     * Promote one or more users in the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to promote users into.
     * @param ids The ids of the users to promote.
     * @return A future.
     */
    ListenableFuture<Empty> promoteGroupUsers(@NonNull final Session session, @NonNull final String groupId, @NonNull final String... ids);

    /**
     * Read one or more objects from the storage engine.
     *
     * @param session The session of the user.
     * @param objectIds The objects to read.
     * @return A future to resolve storage objects.
     */
    ListenableFuture<StorageObjects> readStorageObjects(@NonNull final Session session, @NonNull final StorageObjectId... objectIds);

    /**
     * Execute a Lua function with an input payload on the server.
     *
     * @param session The session of the user.
     * @param id The id of the function to execute on the server.
     * @return A future to resolve an RPC response.
     */
    ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id);

    /**
     * Execute a Lua function with an input payload on the server.
     *
     * @param session The session of the user.
     * @param id The id of the function to execute on the server.
     * @param payload The payload to send with the function call.
     * @return A future to resolve an RPC response.
     */
    ListenableFuture<Rpc> rpc(@NonNull final Session session, @NonNull final String id, final String payload);

//    TODO(mo): Is this still needed from the client / doable using gRPC?
//    ListenableFuture<Rpc> rpc(@NonNull final String httpKey, @NonNull final String id);
//    ListenableFuture<Rpc> rpc(@NonNull final String httpKey, @NonNull final String id, @NonNull final String payload);

    /**
     * Unlink a custom id from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param id A custom identifier usually obtained from an external authentication service.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkCustom(@NonNull final Session session, @NonNull final String id);

    /**
     * Unlink a device id from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param id A device identifier usually obtained from a platform API.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkDevice(@NonNull final Session session, @NonNull final String id);

    /**
     * Unlink an email with password from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param email The email address of the user.
     * @param password The password for the user.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkEmail(@NonNull final Session session, @NonNull final String email, @NonNull final String password);

    /**
     * Unlink a Facebook profile from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param accessToken An OAuth access token from the Facebook SDK.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkFacebook(@NonNull final Session session, @NonNull final String accessToken);

    /**
     * Unlink a Google profile from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param accessToken An OAuth access token from the Google SDK.
     * @return A future.
     */

    ListenableFuture<Empty> unlinkGoogle(@NonNull final Session session, @NonNull final String accessToken);

    /**
     * Unlink a Steam profile from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param token An authentication token from the Steam network.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkSteam(@NonNull final Session session, @NonNull final String token);

    /**
     * Unlink a Game Center profile from the user account owned by the session.
     *
     * @param session The session of the user.
     * @param playerId The player id of the user in Game Center.
     * @param bundleId The bundle id of the Game Center application.
     * @param timestampSeconds The date and time that the signature was created.
     * @param salt A random <c>NSString</c> used to compute the hash and keep it randomized.
     * @param signature The verification signature data generated.
     * @param publicKeyUrl The URL for the public encryption key.
     * @return A future.
     */
    ListenableFuture<Empty> unlinkGameCenter(@NonNull final Session session, @NonNull final String playerId, @NonNull final String bundleId, final long timestampSeconds, @NonNull final String salt, @NonNull final String signature, @NonNull final String publicKeyUrl);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @param displayName A new display name for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @param displayName A new display name for the user.
     * @param avatarUrl A new avatar url for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @param displayName A new display name for the user.
     * @param avatarUrl A new avatar url for the user.
     * @param langTag A new language tag in BCP-47 format for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @param displayName A new display name for the user.
     * @param avatarUrl A new avatar url for the user.
     * @param langTag A new language tag in BCP-47 format for the user.
     * @param location A new location for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag, final String location);

    /**
     * Update the current user's account on the server.
     *
     * @param session The session for the user.
     * @param username The new username for the user.
     * @param displayName A new display name for the user.
     * @param avatarUrl A new avatar url for the user.
     * @param langTag A new language tag in BCP-47 format for the user.
     * @param location A new location for the user.
     * @param timezone New timezone information for the user.
     * @return A future to complete the account update.
     */
    ListenableFuture<Empty> updateAccount(@NonNull final Session session, final String username, final String displayName, final String avatarUrl, final String langTag, final String location, final String timezone);

    /**
     * Update a group.
     *
     * The user must have the correct access permissions for the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to update.
     * @param name A new name for the group.
     * @return A future.
     */
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name);

    /**
     * Update a group.
     *
     * The user must have the correct access permissions for the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to update.
     * @param name A new name for the group.
     * @param description A new description for the group.
     * @return A future.
     */
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description);

    /**
     * Update a group.
     *
     * The user must have the correct access permissions for the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to update.
     * @param name A new name for the group.
     * @param description A new description for the group.
     * @param avatarUrl A new avatar url for the group.
     * @return A future.
     */
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl);

    /**
     * Update a group.
     *
     * The user must have the correct access permissions for the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to update.
     * @param name A new name for the group.
     * @param description A new description for the group.
     * @param avatarUrl A new avatar url for the group.
     * @param langTag A new language tag in BCP-47 format for the group.
     * @return A future.
     */
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl, final String langTag);

    /**
     * Update a group.
     *
     * The user must have the correct access permissions for the group.
     *
     * @param session The session of the user.
     * @param groupId The id of the group to update.
     * @param name A new name for the group.
     * @param description A new description for the group.
     * @param avatarUrl A new avatar url for the group.
     * @param langTag A new language tag in BCP-47 format for the group.
     * @param open True if the group should have open membership.
     * @return A future.
     */
    ListenableFuture<Empty> updateGroup(@NonNull final Session session, @NonNull final String groupId, final String name, final String description, final String avatarUrl, final String langTag, final boolean open);

    /**
     * Write a record to a leaderboard.
     *
     * @param session The session for the user.
     * @param leaderboardId The id of the leaderboard to write.
     * @param score The score for the leaderboard record.
     * @return A future to complete the leaderboard record write.
     */
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score);

    /**
     * Write a record to a leaderboard.
     *
     * @param session The session for the user.
     * @param leaderboardId The id of the leaderboard to write.
     * @param score The score for the leaderboard record.
     * @param subscore The subscore for the leaderboard record.
     * @return A future to complete the leaderboard record write.
     */
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final long subscore);

    /**
     * Write a record to a leaderboard.
     *
     * @param session The session for the user.
     * @param leaderboardId The id of the leaderboard to write.
     * @param score The score for the leaderboard record.
     * @param metadata The metadata for the leaderboard record.
     * @return A future to complete the leaderboard record write.
     */
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final String metadata);

    /**
     * Write a record to a leaderboard.
     *
     * @param session The session for the user.
     * @param leaderboardId The id of the leaderboard to write.
     * @param score The score for the leaderboard record.
     * @param subscore The subscore for the leaderboard record.
     * @param metadata The metadata for the leaderboard record.
     * @return A future to complete the leaderboard record write.
     */
    ListenableFuture<LeaderboardRecord> writeLeaderboardRecord(@NonNull final Session session, @NonNull final String leaderboardId, final long score, final long subscore, final String metadata);

    /**
     * Write objects to the storage engine.
     *
     * @param session The session of the user.
     * @param objects The objects to write.
     * @return A future to resolve the acknowledgements with writes.
     */
    ListenableFuture<StorageObjectAcks> writeStorageObjects(@NonNull final Session session, @NonNull final StorageObjectWrite... objects);

    /**
     * A request to submit a score to a tournament.
     *
     * @param session The session for the user.
     * @param tournamentId The tournament ID to write the record for.
     * @param score The score value to submit.
     * @return A future to complete the tournament record write.
     */
    ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score);

    /**
     * A request to submit a score to a tournament.
     *
     * @param session The session for the user.
     * @param tournamentId The tournament ID to write the record for.
     * @param score The score value to submit.
     * @param subscore An optional secondary value.
     * @return A future to complete the tournament record write.
     */
    ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, final long subscore);

    /**
     * A request to submit a score to a tournament.
     *
     * @param session The session for the user.
     * @param tournamentId The tournament ID to write the record for.
     * @param score The score value to submit.
     * @param metadata A JSON object of additional properties.
     * @return A future to complete the tournament record write.
     */
    ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, final String metadata);

    /**
     * A request to submit a score to a tournament.
     *
     * @param session The session for the user.
     * @param tournamentId The tournament ID to write the record for.
     * @param score The score value to submit.
     * @param subscore  An optional secondary value.
     * @param metadata A JSON object of additional properties.
     * @return A future to complete the tournament record write.
     */
    ListenableFuture<LeaderboardRecord> writeTournamentRecord(@NonNull final Session session, @NonNull final String tournamentId, final long score, final long subscore, final String metadata);
}
