// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface AccountEmailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountEmail)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 3;</code>
   */
  int getVarsCount();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 3;</code>
   */
  boolean containsVars(
      java.lang.String key);
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVars();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVarsMap();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 3;</code>
   */

  java.lang.String getVarsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 3;</code>
   */

  java.lang.String getVarsOrThrow(
      java.lang.String key);
}
