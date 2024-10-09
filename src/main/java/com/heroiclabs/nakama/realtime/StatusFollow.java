// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.realtime;

/**
 * <pre>
 * Start receiving status updates for some set of users.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.StatusFollow}
 */
public final class StatusFollow extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.StatusFollow)
    StatusFollowOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      StatusFollow.class.getName());
  }
  // Use StatusFollow.newBuilder() to construct.
  private StatusFollow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StatusFollow() {
    userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    usernames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StatusFollow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StatusFollow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.realtime.StatusFollow.class, com.heroiclabs.nakama.realtime.StatusFollow.Builder.class);
  }

  public static final int USER_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
  }

  public static final int USERNAMES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList usernames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return A list containing the usernames.
   */
  public com.google.protobuf.ProtocolStringList
      getUsernamesList() {
    return usernames_;
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @return The count of usernames.
   */
  public int getUsernamesCount() {
    return usernames_.size();
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the element to return.
   * @return The usernames at the given index.
   */
  public java.lang.String getUsernames(int index) {
    return usernames_.get(index);
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the usernames at the given index.
   */
  public com.google.protobuf.ByteString
      getUsernamesBytes(int index) {
    return usernames_.getByteString(index);
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
    for (int i = 0; i < userIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, userIds_.getRaw(i));
    }
    for (int i = 0; i < usernames_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, usernames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(userIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < usernames_.size(); i++) {
        dataSize += computeStringSizeNoTag(usernames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUsernamesList().size();
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
    if (!(obj instanceof com.heroiclabs.nakama.realtime.StatusFollow)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.realtime.StatusFollow other = (com.heroiclabs.nakama.realtime.StatusFollow) obj;

    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
    if (!getUsernamesList()
        .equals(other.getUsernamesList())) return false;
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
    if (getUserIdsCount() > 0) {
      hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdsList().hashCode();
    }
    if (getUsernamesCount() > 0) {
      hash = (37 * hash) + USERNAMES_FIELD_NUMBER;
      hash = (53 * hash) + getUsernamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.realtime.StatusFollow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.realtime.StatusFollow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.StatusFollow parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.realtime.StatusFollow prototype) {
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
   * Start receiving status updates for some set of users.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.StatusFollow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.StatusFollow)
      com.heroiclabs.nakama.realtime.StatusFollowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StatusFollow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StatusFollow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.realtime.StatusFollow.class, com.heroiclabs.nakama.realtime.StatusFollow.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.realtime.StatusFollow.newBuilder()
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
      userIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      usernames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StatusFollow_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StatusFollow getDefaultInstanceForType() {
      return com.heroiclabs.nakama.realtime.StatusFollow.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StatusFollow build() {
      com.heroiclabs.nakama.realtime.StatusFollow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StatusFollow buildPartial() {
      com.heroiclabs.nakama.realtime.StatusFollow result = new com.heroiclabs.nakama.realtime.StatusFollow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.realtime.StatusFollow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        userIds_.makeImmutable();
        result.userIds_ = userIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        usernames_.makeImmutable();
        result.usernames_ = usernames_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.realtime.StatusFollow) {
        return mergeFrom((com.heroiclabs.nakama.realtime.StatusFollow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.realtime.StatusFollow other) {
      if (other == com.heroiclabs.nakama.realtime.StatusFollow.getDefaultInstance()) return this;
      if (!other.userIds_.isEmpty()) {
        if (userIds_.isEmpty()) {
          userIds_ = other.userIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUserIdsIsMutable();
          userIds_.addAll(other.userIds_);
        }
        onChanged();
      }
      if (!other.usernames_.isEmpty()) {
        if (usernames_.isEmpty()) {
          usernames_ = other.usernames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureUsernamesIsMutable();
          usernames_.addAll(other.usernames_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUsernamesIsMutable();
              usernames_.add(s);
              break;
            } // case 18
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

    private com.google.protobuf.LazyStringArrayList userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserIdsIsMutable() {
      if (!userIds_.isModifiable()) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      userIds_.makeImmutable();
      return userIds_;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index to set the value at.
     * @param value The userIds to set.
     * @return This builder for chaining.
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param value The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param values The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserIds() {
      userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param value The bytes of the userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList usernames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUsernamesIsMutable() {
      if (!usernames_.isModifiable()) {
        usernames_ = new com.google.protobuf.LazyStringArrayList(usernames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @return A list containing the usernames.
     */
    public com.google.protobuf.ProtocolStringList
        getUsernamesList() {
      usernames_.makeImmutable();
      return usernames_;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @return The count of usernames.
     */
    public int getUsernamesCount() {
      return usernames_.size();
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param index The index of the element to return.
     * @return The usernames at the given index.
     */
    public java.lang.String getUsernames(int index) {
      return usernames_.get(index);
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the usernames at the given index.
     */
    public com.google.protobuf.ByteString
        getUsernamesBytes(int index) {
      return usernames_.getByteString(index);
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param index The index to set the value at.
     * @param value The usernames to set.
     * @return This builder for chaining.
     */
    public Builder setUsernames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUsernamesIsMutable();
      usernames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param value The usernames to add.
     * @return This builder for chaining.
     */
    public Builder addUsernames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUsernamesIsMutable();
      usernames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param values The usernames to add.
     * @return This builder for chaining.
     */
    public Builder addAllUsernames(
        java.lang.Iterable<java.lang.String> values) {
      ensureUsernamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, usernames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsernames() {
      usernames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2 [json_name = "usernames"];</code>
     * @param value The bytes of the usernames to add.
     * @return This builder for chaining.
     */
    public Builder addUsernamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUsernamesIsMutable();
      usernames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.StatusFollow)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.StatusFollow)
  private static final com.heroiclabs.nakama.realtime.StatusFollow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.realtime.StatusFollow();
  }

  public static com.heroiclabs.nakama.realtime.StatusFollow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusFollow>
      PARSER = new com.google.protobuf.AbstractParser<StatusFollow>() {
    @java.lang.Override
    public StatusFollow parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatusFollow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusFollow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.realtime.StatusFollow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

