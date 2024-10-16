// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface WriteTournamentRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.WriteTournamentRecordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The tournament ID to write the record for.
   * </pre>
   *
   * <code>string tournament_id = 1 [json_name = "tournamentId"];</code>
   * @return The tournamentId.
   */
  java.lang.String getTournamentId();
  /**
   * <pre>
   * The tournament ID to write the record for.
   * </pre>
   *
   * <code>string tournament_id = 1 [json_name = "tournamentId"];</code>
   * @return The bytes for tournamentId.
   */
  com.google.protobuf.ByteString
      getTournamentIdBytes();

  /**
   * <pre>
   * Record input.
   * </pre>
   *
   * <code>.nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite record = 2 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  boolean hasRecord();
  /**
   * <pre>
   * Record input.
   * </pre>
   *
   * <code>.nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite record = 2 [json_name = "record"];</code>
   * @return The record.
   */
  com.heroiclabs.nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite getRecord();
  /**
   * <pre>
   * Record input.
   * </pre>
   *
   * <code>.nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite record = 2 [json_name = "record"];</code>
   */
  com.heroiclabs.nakama.api.WriteTournamentRecordRequest.TournamentRecordWriteOrBuilder getRecordOrBuilder();
}
