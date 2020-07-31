// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface ListUserGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListUserGroupsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  com.google.protobuf.Int32Value getLimit();

  /**
   * <pre>
   * The user group state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 3;</code>
   */
  boolean hasState();
  /**
   * <pre>
   * The user group state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 3;</code>
   */
  com.google.protobuf.Int32Value getState();

  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
