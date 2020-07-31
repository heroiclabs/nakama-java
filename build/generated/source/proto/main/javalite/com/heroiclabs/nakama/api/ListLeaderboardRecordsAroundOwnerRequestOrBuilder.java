// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface ListLeaderboardRecordsAroundOwnerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListLeaderboardRecordsAroundOwnerRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  java.lang.String getLeaderboardId();
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getLeaderboardIdBytes();

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  com.google.protobuf.UInt32Value getLimit();

  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  java.lang.String getOwnerId();
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getOwnerIdBytes();

  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  boolean hasExpiry();
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  com.google.protobuf.Int64Value getExpiry();
}
