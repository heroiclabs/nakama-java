// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface ChannelMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ChannelMessage)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The channel this message belongs to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * The channel this message belongs to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * The unique ID of this message.
   * </pre>
   *
   * <code>optional string message_id = 2;</code>
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * The unique ID of this message.
   * </pre>
   *
   * <code>optional string message_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   * The code representing a message type or category.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value code = 3;</code>
   */
  boolean hasCode();
  /**
   * <pre>
   * The code representing a message type or category.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value code = 3;</code>
   */
  com.google.protobuf.Int32Value getCode();

  /**
   * <pre>
   * Message sender, usually a user ID.
   * </pre>
   *
   * <code>optional string sender_id = 4;</code>
   */
  java.lang.String getSenderId();
  /**
   * <pre>
   * Message sender, usually a user ID.
   * </pre>
   *
   * <code>optional string sender_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getSenderIdBytes();

  /**
   * <pre>
   * The username of the message sender, if any.
   * </pre>
   *
   * <code>optional string username = 5;</code>
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The username of the message sender, if any.
   * </pre>
   *
   * <code>optional string username = 5;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The content payload.
   * </pre>
   *
   * <code>optional string content = 6;</code>
   */
  java.lang.String getContent();
  /**
   * <pre>
   * The content payload.
   * </pre>
   *
   * <code>optional string content = 6;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * The UNIX time when the message was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 7;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The UNIX time when the message was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   * <pre>
   * The UNIX time when the message was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 8;</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The UNIX time when the message was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   * <pre>
   * True if the message was persisted to the channel's history, false otherwise.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue persistent = 9;</code>
   */
  boolean hasPersistent();
  /**
   * <pre>
   * True if the message was persisted to the channel's history, false otherwise.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue persistent = 9;</code>
   */
  com.google.protobuf.BoolValue getPersistent();

  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>optional string room_name = 10;</code>
   */
  java.lang.String getRoomName();
  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>optional string room_name = 10;</code>
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>optional string group_id = 11;</code>
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>optional string group_id = 11;</code>
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_one = 12;</code>
   */
  java.lang.String getUserIdOne();
  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_one = 12;</code>
   */
  com.google.protobuf.ByteString
      getUserIdOneBytes();

  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_two = 13;</code>
   */
  java.lang.String getUserIdTwo();
  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_two = 13;</code>
   */
  com.google.protobuf.ByteString
      getUserIdTwoBytes();
}
