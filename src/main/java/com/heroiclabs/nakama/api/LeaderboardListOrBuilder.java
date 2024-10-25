// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

public interface LeaderboardListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.LeaderboardList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of leaderboards returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Leaderboard leaderboards = 1 [json_name = "leaderboards"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Leaderboard> 
      getLeaderboardsList();
  /**
   * <pre>
   * The list of leaderboards returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Leaderboard leaderboards = 1 [json_name = "leaderboards"];</code>
   */
  com.heroiclabs.nakama.api.Leaderboard getLeaderboards(int index);
  /**
   * <pre>
   * The list of leaderboards returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Leaderboard leaderboards = 1 [json_name = "leaderboards"];</code>
   */
  int getLeaderboardsCount();
  /**
   * <pre>
   * The list of leaderboards returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Leaderboard leaderboards = 1 [json_name = "leaderboards"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.LeaderboardOrBuilder> 
      getLeaderboardsOrBuilderList();
  /**
   * <pre>
   * The list of leaderboards returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Leaderboard leaderboards = 1 [json_name = "leaderboards"];</code>
   */
  com.heroiclabs.nakama.api.LeaderboardOrBuilder getLeaderboardsOrBuilder(
      int index);

  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}