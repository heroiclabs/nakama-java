// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A list of tournaments.
 * </pre>
 *
 * Protobuf type {@code nakama.api.TournamentList}
 */
public  final class TournamentList extends
    com.google.protobuf.GeneratedMessageLite<
        TournamentList, TournamentList.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.TournamentList)
    TournamentListOrBuilder {
  private TournamentList() {
    tournaments_ = emptyProtobufList();
    cursor_ = "";
  }
  private int bitField0_;
  public static final int TOURNAMENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.api.Tournament> tournaments_;
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  public java.util.List<com.heroiclabs.nakama.api.Tournament> getTournamentsList() {
    return tournaments_;
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.api.TournamentOrBuilder> 
      getTournamentsOrBuilderList() {
    return tournaments_;
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  public int getTournamentsCount() {
    return tournaments_.size();
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  public com.heroiclabs.nakama.api.Tournament getTournaments(int index) {
    return tournaments_.get(index);
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  public com.heroiclabs.nakama.api.TournamentOrBuilder getTournamentsOrBuilder(
      int index) {
    return tournaments_.get(index);
  }
  private void ensureTournamentsIsMutable() {
    if (!tournaments_.isModifiable()) {
      tournaments_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tournaments_);
     }
  }

  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void setTournaments(
      int index, com.heroiclabs.nakama.api.Tournament value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTournamentsIsMutable();
    tournaments_.set(index, value);
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void setTournaments(
      int index, com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
    ensureTournamentsIsMutable();
    tournaments_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void addTournaments(com.heroiclabs.nakama.api.Tournament value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTournamentsIsMutable();
    tournaments_.add(value);
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void addTournaments(
      int index, com.heroiclabs.nakama.api.Tournament value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTournamentsIsMutable();
    tournaments_.add(index, value);
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void addTournaments(
      com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
    ensureTournamentsIsMutable();
    tournaments_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void addTournaments(
      int index, com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
    ensureTournamentsIsMutable();
    tournaments_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void addAllTournaments(
      java.lang.Iterable<? extends com.heroiclabs.nakama.api.Tournament> values) {
    ensureTournamentsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, tournaments_);
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void clearTournaments() {
    tournaments_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  private void removeTournaments(int index) {
    ensureTournamentsIsMutable();
    tournaments_.remove(index);
  }

  public static final int CURSOR_FIELD_NUMBER = 2;
  private java.lang.String cursor_;
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  public java.lang.String getCursor() {
    return cursor_;
  }
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cursor_);
  }
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  private void setCursor(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cursor_ = value;
  }
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  private void clearCursor() {
    
    cursor_ = getDefaultInstance().getCursor();
  }
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  private void setCursorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cursor_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < tournaments_.size(); i++) {
      output.writeMessage(1, tournaments_.get(i));
    }
    if (!cursor_.isEmpty()) {
      output.writeString(2, getCursor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tournaments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tournaments_.get(i));
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getCursor());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.TournamentList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.TournamentList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A list of tournaments.
   * </pre>
   *
   * Protobuf type {@code nakama.api.TournamentList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.TournamentList, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.TournamentList)
      com.heroiclabs.nakama.api.TournamentListOrBuilder {
    // Construct using com.heroiclabs.nakama.api.TournamentList.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Tournament> getTournamentsList() {
      return java.util.Collections.unmodifiableList(
          instance.getTournamentsList());
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public int getTournamentsCount() {
      return instance.getTournamentsCount();
    }/**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public com.heroiclabs.nakama.api.Tournament getTournaments(int index) {
      return instance.getTournaments(index);
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder setTournaments(
        int index, com.heroiclabs.nakama.api.Tournament value) {
      copyOnWrite();
      instance.setTournaments(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder setTournaments(
        int index, com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
      copyOnWrite();
      instance.setTournaments(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder addTournaments(com.heroiclabs.nakama.api.Tournament value) {
      copyOnWrite();
      instance.addTournaments(value);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder addTournaments(
        int index, com.heroiclabs.nakama.api.Tournament value) {
      copyOnWrite();
      instance.addTournaments(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder addTournaments(
        com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
      copyOnWrite();
      instance.addTournaments(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder addTournaments(
        int index, com.heroiclabs.nakama.api.Tournament.Builder builderForValue) {
      copyOnWrite();
      instance.addTournaments(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder addAllTournaments(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.Tournament> values) {
      copyOnWrite();
      instance.addAllTournaments(values);
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder clearTournaments() {
      copyOnWrite();
      instance.clearTournaments();
      return this;
    }
    /**
     * <pre>
     * The list of tournaments returned.
     * </pre>
     *
     * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
     */
    public Builder removeTournaments(int index) {
      copyOnWrite();
      instance.removeTournaments(index);
      return this;
    }

    /**
     * <pre>
     * A pagination cursor (optional).
     * </pre>
     *
     * <code>optional string cursor = 2;</code>
     */
    public java.lang.String getCursor() {
      return instance.getCursor();
    }
    /**
     * <pre>
     * A pagination cursor (optional).
     * </pre>
     *
     * <code>optional string cursor = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      return instance.getCursorBytes();
    }
    /**
     * <pre>
     * A pagination cursor (optional).
     * </pre>
     *
     * <code>optional string cursor = 2;</code>
     */
    public Builder setCursor(
        java.lang.String value) {
      copyOnWrite();
      instance.setCursor(value);
      return this;
    }
    /**
     * <pre>
     * A pagination cursor (optional).
     * </pre>
     *
     * <code>optional string cursor = 2;</code>
     */
    public Builder clearCursor() {
      copyOnWrite();
      instance.clearCursor();
      return this;
    }
    /**
     * <pre>
     * A pagination cursor (optional).
     * </pre>
     *
     * <code>optional string cursor = 2;</code>
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCursorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.TournamentList)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.TournamentList();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        tournaments_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.TournamentList other = (com.heroiclabs.nakama.api.TournamentList) arg1;
        tournaments_= visitor.visitList(tournaments_, other.tournaments_);
        cursor_ = visitor.visitString(!cursor_.isEmpty(), cursor_,
            !other.cursor_.isEmpty(), other.cursor_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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
                if (!tournaments_.isModifiable()) {
                  tournaments_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(tournaments_);
                }
                tournaments_.add(
                    input.readMessage(com.heroiclabs.nakama.api.Tournament.parser(), extensionRegistry));
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                cursor_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.TournamentList.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.TournamentList)
  private static final com.heroiclabs.nakama.api.TournamentList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TournamentList();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.TournamentList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TournamentList> PARSER;

  public static com.google.protobuf.Parser<TournamentList> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

