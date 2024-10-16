// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

public interface MatchJoinOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.MatchJoin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return Whether the matchId field is set.
   */
  boolean hasMatchId();
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The matchId.
   */
  java.lang.String getMatchId();
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The bytes for matchId.
   */
  com.google.protobuf.ByteString
      getMatchIdBytes();

  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  com.heroiclabs.nakama.rtapi.MatchJoin.IdCase getIdCase();
}
