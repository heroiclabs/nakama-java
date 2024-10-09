// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.realtime;

/**
 * <pre>
 * Join an existing realtime match.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.MatchJoin}
 */
public final class MatchJoin extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.MatchJoin)
    MatchJoinOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      MatchJoin.class.getName());
  }
  // Use MatchJoin.newBuilder() to construct.
  private MatchJoin(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MatchJoin() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 3:
        return internalGetMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.realtime.MatchJoin.class, com.heroiclabs.nakama.realtime.MatchJoin.Builder.class);
  }

  private int idCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object id_;
  public enum IdCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MATCH_ID(1),
    TOKEN(2),
    ID_NOT_SET(0);
    private final int value;
    private IdCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdCase forNumber(int value) {
      switch (value) {
        case 1: return MATCH_ID;
        case 2: return TOKEN;
        case 0: return ID_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public IdCase
  getIdCase() {
    return IdCase.forNumber(
        idCase_);
  }

  public static final int MATCH_ID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return Whether the matchId field is set.
   */
  public boolean hasMatchId() {
    return idCase_ == 1;
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The matchId.
   */
  public java.lang.String getMatchId() {
    java.lang.Object ref = "";
    if (idCase_ == 1) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idCase_ == 1) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>string match_id = 1 [json_name = "matchId"];</code>
   * @return The bytes for matchId.
   */
  public com.google.protobuf.ByteString
      getMatchIdBytes() {
    java.lang.Object ref = "";
    if (idCase_ == 1) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (idCase_ == 1) {
        id_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  public boolean hasToken() {
    return idCase_ == 2;
  }
  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  public java.lang.String getToken() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (idCase_ == 2) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A matchmaking result token.
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = "";
    if (idCase_ == 2) {
      ref = id_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (idCase_ == 2) {
        id_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 3;
  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_MetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> metadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }
  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public boolean containsMetadata(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * An optional set of key-value metadata pairs to be passed to the match handler, if any.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (idCase_ == 1) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (idCase_ == 2) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, id_);
    }
    com.google.protobuf.GeneratedMessage
      .serializeStringMapTo(
        output,
        internalGetMetadata(),
        MetadataDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idCase_ == 1) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (idCase_ == 2) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, id_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      metadata__ = MetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, metadata__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.heroiclabs.nakama.realtime.MatchJoin)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.realtime.MatchJoin other = (com.heroiclabs.nakama.realtime.MatchJoin) obj;

    if (!internalGetMetadata().equals(
        other.internalGetMetadata())) return false;
    if (!getIdCase().equals(other.getIdCase())) return false;
    switch (idCase_) {
      case 1:
        if (!getMatchId()
            .equals(other.getMatchId())) return false;
        break;
      case 2:
        if (!getToken()
            .equals(other.getToken())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    switch (idCase_) {
      case 1:
        hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
        hash = (53 * hash) + getMatchId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.realtime.MatchJoin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.realtime.MatchJoin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.MatchJoin parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.realtime.MatchJoin prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Join an existing realtime match.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.MatchJoin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.MatchJoin)
      com.heroiclabs.nakama.realtime.MatchJoinOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 3:
          return internalGetMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.realtime.MatchJoin.class, com.heroiclabs.nakama.realtime.MatchJoin.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.realtime.MatchJoin.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableMetadata().clear();
      idCase_ = 0;
      id_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_MatchJoin_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.MatchJoin getDefaultInstanceForType() {
      return com.heroiclabs.nakama.realtime.MatchJoin.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.MatchJoin build() {
      com.heroiclabs.nakama.realtime.MatchJoin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.MatchJoin buildPartial() {
      com.heroiclabs.nakama.realtime.MatchJoin result = new com.heroiclabs.nakama.realtime.MatchJoin(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.realtime.MatchJoin result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadata_ = internalGetMetadata();
        result.metadata_.makeImmutable();
      }
    }

    private void buildPartialOneofs(com.heroiclabs.nakama.realtime.MatchJoin result) {
      result.idCase_ = idCase_;
      result.id_ = this.id_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.realtime.MatchJoin) {
        return mergeFrom((com.heroiclabs.nakama.realtime.MatchJoin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.realtime.MatchJoin other) {
      if (other == com.heroiclabs.nakama.realtime.MatchJoin.getDefaultInstance()) return this;
      internalGetMutableMetadata().mergeFrom(
          other.internalGetMetadata());
      bitField0_ |= 0x00000004;
      switch (other.getIdCase()) {
        case MATCH_ID: {
          idCase_ = 1;
          id_ = other.id_;
          onChanged();
          break;
        }
        case TOKEN: {
          idCase_ = 2;
          id_ = other.id_;
          onChanged();
          break;
        }
        case ID_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              idCase_ = 1;
              id_ = s;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              idCase_ = 2;
              id_ = s;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              metadata__ = input.readMessage(
                  MetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableMetadata().getMutableMap().put(
                  metadata__.getKey(), metadata__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int idCase_ = 0;
    private java.lang.Object id_;
    public IdCase
        getIdCase() {
      return IdCase.forNumber(
          idCase_);
    }

    public Builder clearId() {
      idCase_ = 0;
      id_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @return Whether the matchId field is set.
     */
    @java.lang.Override
    public boolean hasMatchId() {
      return idCase_ == 1;
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @return The matchId.
     */
    @java.lang.Override
    public java.lang.String getMatchId() {
      java.lang.Object ref = "";
      if (idCase_ == 1) {
        ref = id_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 1) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @return The bytes for matchId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 1) {
        ref = id_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (idCase_ == 1) {
          id_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @param value The matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      idCase_ = 1;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMatchId() {
      if (idCase_ == 1) {
        idCase_ = 0;
        id_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>string match_id = 1 [json_name = "matchId"];</code>
     * @param value The bytes for matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      idCase_ = 1;
      id_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return Whether the token field is set.
     */
    @java.lang.Override
    public boolean hasToken() {
      return idCase_ == 2;
    }
    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The token.
     */
    @java.lang.Override
    public java.lang.String getToken() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 2) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The bytes for token.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (idCase_ == 2) {
          id_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      idCase_ = 2;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      if (idCase_ == 2) {
        idCase_ = 0;
        id_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A matchmaking result token.
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      idCase_ = 2;
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> metadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      if (metadata_ == null) {
        metadata_ = com.google.protobuf.MapField.newMapField(
            MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return metadata_;
    }
    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public boolean containsMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getMetadataOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    public Builder removeMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableMetadata() {
      bitField0_ |= 0x00000004;
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    public Builder putMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableMetadata().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3 [json_name = "metadata"];</code>
     */
    public Builder putAllMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.MatchJoin)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.MatchJoin)
  private static final com.heroiclabs.nakama.realtime.MatchJoin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.realtime.MatchJoin();
  }

  public static com.heroiclabs.nakama.realtime.MatchJoin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchJoin>
      PARSER = new com.google.protobuf.AbstractParser<MatchJoin>() {
    @java.lang.Override
    public MatchJoin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MatchJoin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchJoin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.realtime.MatchJoin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

