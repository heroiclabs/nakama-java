// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List tournament records from a given tournament around the owner.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListTournamentRecordsAroundOwnerRequest}
 */
public  final class ListTournamentRecordsAroundOwnerRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListTournamentRecordsAroundOwnerRequest, ListTournamentRecordsAroundOwnerRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListTournamentRecordsAroundOwnerRequest)
    ListTournamentRecordsAroundOwnerRequestOrBuilder {
  private ListTournamentRecordsAroundOwnerRequest() {
    tournamentId_ = "";
    ownerId_ = "";
  }
  public static final int TOURNAMENT_ID_FIELD_NUMBER = 1;
  private java.lang.String tournamentId_;
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  public java.lang.String getTournamentId() {
    return tournamentId_;
  }
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTournamentIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tournamentId_);
  }
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void setTournamentId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    tournamentId_ = value;
  }
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void clearTournamentId() {
    
    tournamentId_ = getDefaultInstance().getTournamentId();
  }
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void setTournamentIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    tournamentId_ = value.toStringUtf8();
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value limit_;
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  public com.google.protobuf.UInt32Value getLimit() {
    return limit_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  private void setLimit(com.google.protobuf.UInt32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  private void setLimit(
      com.google.protobuf.UInt32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  private void mergeLimit(com.google.protobuf.UInt32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.UInt32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int OWNER_ID_FIELD_NUMBER = 3;
  private java.lang.String ownerId_;
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  public java.lang.String getOwnerId() {
    return ownerId_;
  }
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(ownerId_);
  }
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  private void setOwnerId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    ownerId_ = value;
  }
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  private void clearOwnerId() {
    
    ownerId_ = getDefaultInstance().getOwnerId();
  }
  /**
   * <pre>
   * The owner to retrieve records around.
   * </pre>
   *
   * <code>optional string owner_id = 3;</code>
   */
  private void setOwnerIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    ownerId_ = value.toStringUtf8();
  }

  public static final int EXPIRY_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value expiry_;
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  public boolean hasExpiry() {
    return expiry_ != null;
  }
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  public com.google.protobuf.Int64Value getExpiry() {
    return expiry_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : expiry_;
  }
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  private void setExpiry(com.google.protobuf.Int64Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    expiry_ = value;
    
    }
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  private void setExpiry(
      com.google.protobuf.Int64Value.Builder builderForValue) {
    expiry_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  private void mergeExpiry(com.google.protobuf.Int64Value value) {
    if (expiry_ != null &&
        expiry_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      expiry_ =
        com.google.protobuf.Int64Value.newBuilder(expiry_).mergeFrom(value).buildPartial();
    } else {
      expiry_ = value;
    }
    
  }
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
   */
  private void clearExpiry() {  expiry_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!tournamentId_.isEmpty()) {
      output.writeString(1, getTournamentId());
    }
    if (limit_ != null) {
      output.writeMessage(2, getLimit());
    }
    if (!ownerId_.isEmpty()) {
      output.writeString(3, getOwnerId());
    }
    if (expiry_ != null) {
      output.writeMessage(4, getExpiry());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!tournamentId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getTournamentId());
    }
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLimit());
    }
    if (!ownerId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getOwnerId());
    }
    if (expiry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getExpiry());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List tournament records from a given tournament around the owner.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListTournamentRecordsAroundOwnerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListTournamentRecordsAroundOwnerRequest)
      com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ID of the tournament to list for.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public java.lang.String getTournamentId() {
      return instance.getTournamentId();
    }
    /**
     * <pre>
     * The ID of the tournament to list for.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTournamentIdBytes() {
      return instance.getTournamentIdBytes();
    }
    /**
     * <pre>
     * The ID of the tournament to list for.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder setTournamentId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTournamentId(value);
      return this;
    }
    /**
     * <pre>
     * The ID of the tournament to list for.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder clearTournamentId() {
      copyOnWrite();
      instance.clearTournamentId();
      return this;
    }
    /**
     * <pre>
     * The ID of the tournament to list for.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder setTournamentIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTournamentIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public com.google.protobuf.UInt32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public Builder setLimit(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public Builder setLimit(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public Builder mergeLimit(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value limit = 2;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * The owner to retrieve records around.
     * </pre>
     *
     * <code>optional string owner_id = 3;</code>
     */
    public java.lang.String getOwnerId() {
      return instance.getOwnerId();
    }
    /**
     * <pre>
     * The owner to retrieve records around.
     * </pre>
     *
     * <code>optional string owner_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerIdBytes() {
      return instance.getOwnerIdBytes();
    }
    /**
     * <pre>
     * The owner to retrieve records around.
     * </pre>
     *
     * <code>optional string owner_id = 3;</code>
     */
    public Builder setOwnerId(
        java.lang.String value) {
      copyOnWrite();
      instance.setOwnerId(value);
      return this;
    }
    /**
     * <pre>
     * The owner to retrieve records around.
     * </pre>
     *
     * <code>optional string owner_id = 3;</code>
     */
    public Builder clearOwnerId() {
      copyOnWrite();
      instance.clearOwnerId();
      return this;
    }
    /**
     * <pre>
     * The owner to retrieve records around.
     * </pre>
     *
     * <code>optional string owner_id = 3;</code>
     */
    public Builder setOwnerIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOwnerIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public boolean hasExpiry() {
      return instance.hasExpiry();
    }
    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public com.google.protobuf.Int64Value getExpiry() {
      return instance.getExpiry();
    }
    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public Builder setExpiry(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setExpiry(value);
      return this;
      }
    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public Builder setExpiry(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setExpiry(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public Builder mergeExpiry(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeExpiry(value);
      return this;
    }
    /**
     * <pre>
     * Expiry in seconds (since epoch) to begin fetching records from.
     * </pre>
     *
     * <code>optional .google.protobuf.Int64Value expiry = 4;</code>
     */
    public Builder clearExpiry() {  copyOnWrite();
      instance.clearExpiry();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListTournamentRecordsAroundOwnerRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest();
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
        com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest other = (com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest) arg1;
        tournamentId_ = visitor.visitString(!tournamentId_.isEmpty(), tournamentId_,
            !other.tournamentId_.isEmpty(), other.tournamentId_);
        limit_ = visitor.visitMessage(limit_, other.limit_);
        ownerId_ = visitor.visitString(!ownerId_.isEmpty(), ownerId_,
            !other.ownerId_.isEmpty(), other.ownerId_);
        expiry_ = visitor.visitMessage(expiry_, other.expiry_);
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

                tournamentId_ = s;
                break;
              }
              case 18: {
                com.google.protobuf.UInt32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                ownerId_ = s;
                break;
              }
              case 34: {
                com.google.protobuf.Int64Value.Builder subBuilder = null;
                if (expiry_ != null) {
                  subBuilder = expiry_.toBuilder();
                }
                expiry_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(expiry_);
                  expiry_ = subBuilder.buildPartial();
                }

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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ListTournamentRecordsAroundOwnerRequest)
  private static final com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListTournamentRecordsAroundOwnerRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListTournamentRecordsAroundOwnerRequest> PARSER;

  public static com.google.protobuf.Parser<ListTournamentRecordsAroundOwnerRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

