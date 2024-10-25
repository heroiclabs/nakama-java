// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface UpdateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.UpdateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The identifier of the messages.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The identifier of the messages.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The time the message was read at the client.
   * </pre>
   *
   * <code>int64 read_time = 2 [json_name = "readTime"];</code>
   * @return The readTime.
   */
  long getReadTime();

  /**
   * <pre>
   * The time the message was consumed by the identity.
   * </pre>
   *
   * <code>int64 consume_time = 3 [json_name = "consumeTime"];</code>
   * @return The consumeTime.
   */
  long getConsumeTime();
}