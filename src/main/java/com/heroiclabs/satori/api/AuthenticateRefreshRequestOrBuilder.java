// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/satori/api/satori.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.satori.api;

public interface AuthenticateRefreshRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:satori.api.AuthenticateRefreshRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <pre>
   * Refresh token.
   * </pre>
   *
   * <code>string refresh_token = 1 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();
}
