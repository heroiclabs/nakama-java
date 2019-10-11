// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Represents a realtime match.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Match}
 */
public  final class Match extends
    com.google.protobuf.GeneratedMessageLite<
        Match, Match.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.Match)
    MatchOrBuilder {
  private Match() {
    matchId_ = "";
  }
  public static final int MATCH_ID_FIELD_NUMBER = 1;
  private java.lang.String matchId_;
  /**
   * <pre>
   * The ID of the match, can be used to join.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  public java.lang.String getMatchId() {
    return matchId_;
  }
  /**
   * <pre>
   * The ID of the match, can be used to join.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMatchIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(matchId_);
  }
  /**
   * <pre>
   * The ID of the match, can be used to join.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void setMatchId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    matchId_ = value;
  }
  /**
   * <pre>
   * The ID of the match, can be used to join.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void clearMatchId() {
    
    matchId_ = getDefaultInstance().getMatchId();
  }
  /**
   * <pre>
   * The ID of the match, can be used to join.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void setMatchIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    matchId_ = value.toStringUtf8();
  }

  public static final int AUTHORITATIVE_FIELD_NUMBER = 2;
  private boolean authoritative_;
  /**
   * <pre>
   * True if it's an server-managed authoritative match, false otherwise.
   * </pre>
   *
   * <code>optional bool authoritative = 2;</code>
   */
  public boolean getAuthoritative() {
    return authoritative_;
  }
  /**
   * <pre>
   * True if it's an server-managed authoritative match, false otherwise.
   * </pre>
   *
   * <code>optional bool authoritative = 2;</code>
   */
  private void setAuthoritative(boolean value) {
    
    authoritative_ = value;
  }
  /**
   * <pre>
   * True if it's an server-managed authoritative match, false otherwise.
   * </pre>
   *
   * <code>optional bool authoritative = 2;</code>
   */
  private void clearAuthoritative() {
    
    authoritative_ = false;
  }

  public static final int LABEL_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue label_;
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  public com.google.protobuf.StringValue getLabel() {
    return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void setLabel(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    label_ = value;
    
    }
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void setLabel(
      com.google.protobuf.StringValue.Builder builderForValue) {
    label_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void mergeLabel(com.google.protobuf.StringValue value) {
    if (label_ != null &&
        label_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      label_ =
        com.google.protobuf.StringValue.newBuilder(label_).mergeFrom(value).buildPartial();
    } else {
      label_ = value;
    }
    
  }
  /**
   * <pre>
   * Match label, if any.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void clearLabel() {  label_ = null;
    
  }

  public static final int SIZE_FIELD_NUMBER = 4;
  private int size_;
  /**
   * <pre>
   * Current number of users in the match.
   * </pre>
   *
   * <code>optional int32 size = 4;</code>
   */
  public int getSize() {
    return size_;
  }
  /**
   * <pre>
   * Current number of users in the match.
   * </pre>
   *
   * <code>optional int32 size = 4;</code>
   */
  private void setSize(int value) {
    
    size_ = value;
  }
  /**
   * <pre>
   * Current number of users in the match.
   * </pre>
   *
   * <code>optional int32 size = 4;</code>
   */
  private void clearSize() {
    
    size_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!matchId_.isEmpty()) {
      output.writeString(1, getMatchId());
    }
    if (authoritative_ != false) {
      output.writeBool(2, authoritative_);
    }
    if (label_ != null) {
      output.writeMessage(3, getLabel());
    }
    if (size_ != 0) {
      output.writeInt32(4, size_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!matchId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getMatchId());
    }
    if (authoritative_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, authoritative_);
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLabel());
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, size_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.Match parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Match parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Match parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Match parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.Match prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Represents a realtime match.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Match}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.Match, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Match)
      com.heroiclabs.nakama.api.MatchOrBuilder {
    // Construct using com.heroiclabs.nakama.api.Match.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ID of the match, can be used to join.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public java.lang.String getMatchId() {
      return instance.getMatchId();
    }
    /**
     * <pre>
     * The ID of the match, can be used to join.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      return instance.getMatchIdBytes();
    }
    /**
     * <pre>
     * The ID of the match, can be used to join.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder setMatchId(
        java.lang.String value) {
      copyOnWrite();
      instance.setMatchId(value);
      return this;
    }
    /**
     * <pre>
     * The ID of the match, can be used to join.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder clearMatchId() {
      copyOnWrite();
      instance.clearMatchId();
      return this;
    }
    /**
     * <pre>
     * The ID of the match, can be used to join.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder setMatchIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMatchIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * True if it's an server-managed authoritative match, false otherwise.
     * </pre>
     *
     * <code>optional bool authoritative = 2;</code>
     */
    public boolean getAuthoritative() {
      return instance.getAuthoritative();
    }
    /**
     * <pre>
     * True if it's an server-managed authoritative match, false otherwise.
     * </pre>
     *
     * <code>optional bool authoritative = 2;</code>
     */
    public Builder setAuthoritative(boolean value) {
      copyOnWrite();
      instance.setAuthoritative(value);
      return this;
    }
    /**
     * <pre>
     * True if it's an server-managed authoritative match, false otherwise.
     * </pre>
     *
     * <code>optional bool authoritative = 2;</code>
     */
    public Builder clearAuthoritative() {
      copyOnWrite();
      instance.clearAuthoritative();
      return this;
    }

    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public boolean hasLabel() {
      return instance.hasLabel();
    }
    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public com.google.protobuf.StringValue getLabel() {
      return instance.getLabel();
    }
    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setLabel(value);
      return this;
      }
    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setLabel(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder mergeLabel(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeLabel(value);
      return this;
    }
    /**
     * <pre>
     * Match label, if any.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder clearLabel() {  copyOnWrite();
      instance.clearLabel();
      return this;
    }

    /**
     * <pre>
     * Current number of users in the match.
     * </pre>
     *
     * <code>optional int32 size = 4;</code>
     */
    public int getSize() {
      return instance.getSize();
    }
    /**
     * <pre>
     * Current number of users in the match.
     * </pre>
     *
     * <code>optional int32 size = 4;</code>
     */
    public Builder setSize(int value) {
      copyOnWrite();
      instance.setSize(value);
      return this;
    }
    /**
     * <pre>
     * Current number of users in the match.
     * </pre>
     *
     * <code>optional int32 size = 4;</code>
     */
    public Builder clearSize() {
      copyOnWrite();
      instance.clearSize();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Match)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.Match();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.Match other = (com.heroiclabs.nakama.api.Match) arg1;
        matchId_ = visitor.visitString(!matchId_.isEmpty(), matchId_,
            !other.matchId_.isEmpty(), other.matchId_);
        authoritative_ = visitor.visitBoolean(authoritative_ != false, authoritative_,
            other.authoritative_ != false, other.authoritative_);
        label_ = visitor.visitMessage(label_, other.label_);
        size_ = visitor.visitInt(size_ != 0, size_,
            other.size_ != 0, other.size_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                matchId_ = s;
                break;
              }
              case 16: {

                authoritative_ = input.readBool();
                break;
              }
              case 26: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (label_ != null) {
                  subBuilder = label_.toBuilder();
                }
                label_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(label_);
                  label_ = subBuilder.buildPartial();
                }

                break;
              }
              case 32: {

                size_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.Match.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.api.Match)
  private static final com.heroiclabs.nakama.api.Match DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Match();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.Match getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Match> PARSER;

  public static com.google.protobuf.Parser<Match> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

