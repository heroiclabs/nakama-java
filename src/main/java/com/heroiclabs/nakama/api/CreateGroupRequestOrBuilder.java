// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface CreateGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.CreateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique name for the group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * A unique name for the group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A description for the group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description for the group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>string lang_tag = 3 [json_name = "langTag"];</code>
   * @return The langTag.
   */
  java.lang.String getLangTag();
  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>string lang_tag = 3 [json_name = "langTag"];</code>
   * @return The bytes for langTag.
   */
  com.google.protobuf.ByteString
      getLangTagBytes();

  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>string avatar_url = 4 [json_name = "avatarUrl"];</code>
   * @return The avatarUrl.
   */
  java.lang.String getAvatarUrl();
  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>string avatar_url = 4 [json_name = "avatarUrl"];</code>
   * @return The bytes for avatarUrl.
   */
  com.google.protobuf.ByteString
      getAvatarUrlBytes();

  /**
   * <pre>
   * Mark a group as open or not where only admins can accept members.
   * </pre>
   *
   * <code>bool open = 5 [json_name = "open"];</code>
   * @return The open.
   */
  boolean getOpen();

  /**
   * <pre>
   * Maximum number of group members.
   * </pre>
   *
   * <code>int32 max_count = 6 [json_name = "maxCount"];</code>
   * @return The maxCount.
   */
  int getMaxCount();
}