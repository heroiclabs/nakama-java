// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface KickGroupUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.KickGroupUsersRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The group ID to kick from.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The group ID to kick from.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  java.util.List<String>
      getUserIdsList();
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  int getUserIdsCount();
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * The users to kick.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);
}
