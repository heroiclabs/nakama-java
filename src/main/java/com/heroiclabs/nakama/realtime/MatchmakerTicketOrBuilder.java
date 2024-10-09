// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.realtime;

public interface MatchmakerTicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.MatchmakerTicket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ticket that can be used to cancel matchmaking.
   * </pre>
   *
   * <code>string ticket = 1 [json_name = "ticket"];</code>
   * @return The ticket.
   */
  java.lang.String getTicket();
  /**
   * <pre>
   * The ticket that can be used to cancel matchmaking.
   * </pre>
   *
   * <code>string ticket = 1 [json_name = "ticket"];</code>
   * @return The bytes for ticket.
   */
  com.google.protobuf.ByteString
      getTicketBytes();
}
