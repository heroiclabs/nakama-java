// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List publicly readable storage objects in a given collection.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListStorageObjectsRequest}
 */
public final class ListStorageObjectsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListStorageObjectsRequest)
    ListStorageObjectsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      ListStorageObjectsRequest.class.getName());
  }
  // Use ListStorageObjectsRequest.newBuilder() to construct.
  private ListStorageObjectsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListStorageObjectsRequest() {
    userId_ = "";
    collection_ = "";
    cursor_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ListStorageObjectsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ListStorageObjectsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.ListStorageObjectsRequest.class, com.heroiclabs.nakama.api.ListStorageObjectsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLECTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collection_ = "";
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>string collection = 2 [json_name = "collection"];</code>
   * @return The collection.
   */
  @java.lang.Override
  public java.lang.String getCollection() {
    java.lang.Object ref = collection_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collection_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>string collection = 2 [json_name = "collection"];</code>
   * @return The bytes for collection.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollectionBytes() {
    java.lang.Object ref = collection_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collection_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return Whether the limit field is set.
   */
  @java.lang.Override
  public boolean hasLimit() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * The number of storage objects to list. Between 1 and 100.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }

  public static final int CURSOR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cursor_ = "";
  /**
   * <pre>
   * The cursor to page through results from.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  @java.lang.Override
  public java.lang.String getCursor() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cursor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The cursor to page through results from.
   * </pre>
   *
   * <code>string cursor = 4 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCursorBytes() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cursor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(collection_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, collection_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getLimit());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursor_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, cursor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(collection_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, collection_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLimit());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursor_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, cursor_);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.ListStorageObjectsRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.ListStorageObjectsRequest other = (com.heroiclabs.nakama.api.ListStorageObjectsRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getCollection()
        .equals(other.getCollection())) return false;
    if (hasLimit() != other.hasLimit()) return false;
    if (hasLimit()) {
      if (!getLimit()
          .equals(other.getLimit())) return false;
    }
    if (!getCursor()
        .equals(other.getCursor())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
    hash = (53 * hash) + getCollection().hashCode();
    if (hasLimit()) {
      hash = (37 * hash) + LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getLimit().hashCode();
    }
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListStorageObjectsRequest prototype) {
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
   * List publicly readable storage objects in a given collection.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListStorageObjectsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListStorageObjectsRequest)
      com.heroiclabs.nakama.api.ListStorageObjectsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ListStorageObjectsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ListStorageObjectsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.ListStorageObjectsRequest.class, com.heroiclabs.nakama.api.ListStorageObjectsRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.ListStorageObjectsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getLimitFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = "";
      collection_ = "";
      limit_ = null;
      if (limitBuilder_ != null) {
        limitBuilder_.dispose();
        limitBuilder_ = null;
      }
      cursor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ListStorageObjectsRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ListStorageObjectsRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.ListStorageObjectsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ListStorageObjectsRequest build() {
      com.heroiclabs.nakama.api.ListStorageObjectsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ListStorageObjectsRequest buildPartial() {
      com.heroiclabs.nakama.api.ListStorageObjectsRequest result = new com.heroiclabs.nakama.api.ListStorageObjectsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.ListStorageObjectsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.collection_ = collection_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.limit_ = limitBuilder_ == null
            ? limit_
            : limitBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.cursor_ = cursor_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.ListStorageObjectsRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.ListStorageObjectsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.ListStorageObjectsRequest other) {
      if (other == com.heroiclabs.nakama.api.ListStorageObjectsRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCollection().isEmpty()) {
        collection_ = other.collection_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLimit()) {
        mergeLimit(other.getLimit());
      }
      if (!other.getCursor().isEmpty()) {
        cursor_ = other.cursor_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              collection_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLimitFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              cursor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
    private int bitField0_;

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * ID of the user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object collection_ = "";
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>string collection = 2 [json_name = "collection"];</code>
     * @return The collection.
     */
    public java.lang.String getCollection() {
      java.lang.Object ref = collection_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collection_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>string collection = 2 [json_name = "collection"];</code>
     * @return The bytes for collection.
     */
    public com.google.protobuf.ByteString
        getCollectionBytes() {
      java.lang.Object ref = collection_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collection_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>string collection = 2 [json_name = "collection"];</code>
     * @param value The collection to set.
     * @return This builder for chaining.
     */
    public Builder setCollection(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collection_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>string collection = 2 [json_name = "collection"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollection() {
      collection_ = getDefaultInstance().getCollection();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>string collection = 2 [json_name = "collection"];</code>
     * @param value The bytes for collection to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collection_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value limit_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> limitBuilder_;
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     * @return Whether the limit field is set.
     */
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     * @return The limit.
     */
    public com.google.protobuf.Int32Value getLimit() {
      if (limitBuilder_ == null) {
        return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
      } else {
        return limitBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      if (limitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limit_ = value;
      } else {
        limitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (limitBuilder_ == null) {
        limit_ = builderForValue.build();
      } else {
        limitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      if (limitBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          limit_ != null &&
          limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
          getLimitBuilder().mergeFrom(value);
        } else {
          limit_ = value;
        }
      } else {
        limitBuilder_.mergeFrom(value);
      }
      if (limit_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      limit_ = null;
      if (limitBuilder_ != null) {
        limitBuilder_.dispose();
        limitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public com.google.protobuf.Int32Value.Builder getLimitBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLimitFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder() {
      if (limitBuilder_ != null) {
        return limitBuilder_.getMessageOrBuilder();
      } else {
        return limit_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
      }
    }
    /**
     * <pre>
     * The number of storage objects to list. Between 1 and 100.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value limit = 3 [json_name = "limit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getLimitFieldBuilder() {
      if (limitBuilder_ == null) {
        limitBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getLimit(),
                getParentForChildren(),
                isClean());
        limit_ = null;
      }
      return limitBuilder_;
    }

    private java.lang.Object cursor_ = "";
    /**
     * <pre>
     * The cursor to page through results from.
     * </pre>
     *
     * <code>string cursor = 4 [json_name = "cursor"];</code>
     * @return The cursor.
     */
    public java.lang.String getCursor() {
      java.lang.Object ref = cursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The cursor to page through results from.
     * </pre>
     *
     * <code>string cursor = 4 [json_name = "cursor"];</code>
     * @return The bytes for cursor.
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      java.lang.Object ref = cursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The cursor to page through results from.
     * </pre>
     *
     * <code>string cursor = 4 [json_name = "cursor"];</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cursor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The cursor to page through results from.
     * </pre>
     *
     * <code>string cursor = 4 [json_name = "cursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      cursor_ = getDefaultInstance().getCursor();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The cursor to page through results from.
     * </pre>
     *
     * <code>string cursor = 4 [json_name = "cursor"];</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cursor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListStorageObjectsRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.ListStorageObjectsRequest)
  private static final com.heroiclabs.nakama.api.ListStorageObjectsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.ListStorageObjectsRequest();
  }

  public static com.heroiclabs.nakama.api.ListStorageObjectsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStorageObjectsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListStorageObjectsRequest>() {
    @java.lang.Override
    public ListStorageObjectsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStorageObjectsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStorageObjectsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.ListStorageObjectsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
