// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface FriendsOfFriendsListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.FriendsOfFriendsList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User friends of friends.
   * </pre>
   *
   * <code>repeated .nakama.api.FriendsOfFriendsList.FriendOfFriend friends_of_friends = 1 [json_name = "friendsOfFriends"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.FriendsOfFriendsList.FriendOfFriend> 
      getFriendsOfFriendsList();
  /**
   * <pre>
   * User friends of friends.
   * </pre>
   *
   * <code>repeated .nakama.api.FriendsOfFriendsList.FriendOfFriend friends_of_friends = 1 [json_name = "friendsOfFriends"];</code>
   */
  com.heroiclabs.nakama.api.FriendsOfFriendsList.FriendOfFriend getFriendsOfFriends(int index);
  /**
   * <pre>
   * User friends of friends.
   * </pre>
   *
   * <code>repeated .nakama.api.FriendsOfFriendsList.FriendOfFriend friends_of_friends = 1 [json_name = "friendsOfFriends"];</code>
   */
  int getFriendsOfFriendsCount();
  /**
   * <pre>
   * User friends of friends.
   * </pre>
   *
   * <code>repeated .nakama.api.FriendsOfFriendsList.FriendOfFriend friends_of_friends = 1 [json_name = "friendsOfFriends"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.FriendsOfFriendsList.FriendOfFriendOrBuilder> 
      getFriendsOfFriendsOrBuilderList();
  /**
   * <pre>
   * User friends of friends.
   * </pre>
   *
   * <code>repeated .nakama.api.FriendsOfFriendsList.FriendOfFriend friends_of_friends = 1 [json_name = "friendsOfFriends"];</code>
   */
  com.heroiclabs.nakama.api.FriendsOfFriendsList.FriendOfFriendOrBuilder getFriendsOfFriendsOrBuilder(
      int index);

  /**
   * <pre>
   * Cursor for the next page of results, if any.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * Cursor for the next page of results, if any.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}