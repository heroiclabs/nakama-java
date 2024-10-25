// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface ListStorageObjectsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListStorageObjectsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>string collection = 2 [json_name = "collection"];</code>
   * @return The collection.
   */
  java.lang.String getCollection();
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>string collection = 2 [json_name = "collection"];</code>
   * @return The bytes for collection.
   */
  com.google.protobuf.ByteString
      getCollectionBytes();

  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();
  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();

  /**
   * <pre>
   * The cursor to page through results from.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * The cursor to page through results from.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}