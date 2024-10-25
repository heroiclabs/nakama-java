// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface PartyDataSendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.PartyDataSend)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Party ID to send to.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The partyId.
   */
  java.lang.String getPartyId();
  /**
   * <pre>
   * Party ID to send to.
   * </pre>
   *
   * <code>string party_id = 1 [json_name = "partyId"];</code>
   * @return The bytes for partyId.
   */
  com.google.protobuf.ByteString
      getPartyIdBytes();

  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>int64 op_code = 2 [json_name = "opCode"];</code>
   * @return The opCode.
   */
  long getOpCode();

  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>bytes data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}