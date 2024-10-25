// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A collection of zero or more friends of the user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.FriendList}
 */
public final class FriendList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.FriendList)
    FriendListOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      FriendList.class.getName());
  }
  // Use FriendList.newBuilder() to construct.
  private FriendList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FriendList() {
    friends_ = java.util.Collections.emptyList();
    cursor_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_FriendList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_FriendList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.FriendList.class, com.heroiclabs.nakama.api.FriendList.Builder.class);
  }

  public static final int FRIENDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.heroiclabs.nakama.api.Friend> friends_;
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
   */
  @java.lang.Override
  public java.util.List<com.heroiclabs.nakama.api.Friend> getFriendsList() {
    return friends_;
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.heroiclabs.nakama.api.FriendOrBuilder> 
      getFriendsOrBuilderList() {
    return friends_;
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
   */
  @java.lang.Override
  public int getFriendsCount() {
    return friends_.size();
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.Friend getFriends(int index) {
    return friends_.get(index);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.FriendOrBuilder getFriendsOrBuilder(
      int index) {
    return friends_.get(index);
  }

  public static final int CURSOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cursor_ = "";
  /**
   * <pre>
   * Cursor for the next page of results, if any.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
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
   * Cursor for the next page of results, if any.
   * </pre>
   *
   * <code>string cursor = 2 [json_name = "cursor"];</code>
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
    for (int i = 0; i < friends_.size(); i++) {
      output.writeMessage(1, friends_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursor_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, cursor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < friends_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, friends_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursor_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, cursor_);
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
    if (!(obj instanceof com.heroiclabs.nakama.api.FriendList)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.FriendList other = (com.heroiclabs.nakama.api.FriendList) obj;

    if (!getFriendsList()
        .equals(other.getFriendsList())) return false;
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
    if (getFriendsCount() > 0) {
      hash = (37 * hash) + FRIENDS_FIELD_NUMBER;
      hash = (53 * hash) + getFriendsList().hashCode();
    }
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.FriendList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.FriendList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.FriendList parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.FriendList prototype) {
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
   * A collection of zero or more friends of the user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.FriendList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.FriendList)
      com.heroiclabs.nakama.api.FriendListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_FriendList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_FriendList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.FriendList.class, com.heroiclabs.nakama.api.FriendList.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.FriendList.newBuilder()
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
      if (friendsBuilder_ == null) {
        friends_ = java.util.Collections.emptyList();
      } else {
        friends_ = null;
        friendsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      cursor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_FriendList_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.FriendList getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.FriendList.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.FriendList build() {
      com.heroiclabs.nakama.api.FriendList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.FriendList buildPartial() {
      com.heroiclabs.nakama.api.FriendList result = new com.heroiclabs.nakama.api.FriendList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.heroiclabs.nakama.api.FriendList result) {
      if (friendsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          friends_ = java.util.Collections.unmodifiableList(friends_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.friends_ = friends_;
      } else {
        result.friends_ = friendsBuilder_.build();
      }
    }

    private void buildPartial0(com.heroiclabs.nakama.api.FriendList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cursor_ = cursor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.FriendList) {
        return mergeFrom((com.heroiclabs.nakama.api.FriendList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.FriendList other) {
      if (other == com.heroiclabs.nakama.api.FriendList.getDefaultInstance()) return this;
      if (friendsBuilder_ == null) {
        if (!other.friends_.isEmpty()) {
          if (friends_.isEmpty()) {
            friends_ = other.friends_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFriendsIsMutable();
            friends_.addAll(other.friends_);
          }
          onChanged();
        }
      } else {
        if (!other.friends_.isEmpty()) {
          if (friendsBuilder_.isEmpty()) {
            friendsBuilder_.dispose();
            friendsBuilder_ = null;
            friends_ = other.friends_;
            bitField0_ = (bitField0_ & ~0x00000001);
            friendsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFriendsFieldBuilder() : null;
          } else {
            friendsBuilder_.addAllMessages(other.friends_);
          }
        }
      }
      if (!other.getCursor().isEmpty()) {
        cursor_ = other.cursor_;
        bitField0_ |= 0x00000002;
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
              com.heroiclabs.nakama.api.Friend m =
                  input.readMessage(
                      com.heroiclabs.nakama.api.Friend.parser(),
                      extensionRegistry);
              if (friendsBuilder_ == null) {
                ensureFriendsIsMutable();
                friends_.add(m);
              } else {
                friendsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              cursor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.heroiclabs.nakama.api.Friend> friends_ =
      java.util.Collections.emptyList();
    private void ensureFriendsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        friends_ = new java.util.ArrayList<com.heroiclabs.nakama.api.Friend>(friends_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.Friend, com.heroiclabs.nakama.api.Friend.Builder, com.heroiclabs.nakama.api.FriendOrBuilder> friendsBuilder_;

    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Friend> getFriendsList() {
      if (friendsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(friends_);
      } else {
        return friendsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public int getFriendsCount() {
      if (friendsBuilder_ == null) {
        return friends_.size();
      } else {
        return friendsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public com.heroiclabs.nakama.api.Friend getFriends(int index) {
      if (friendsBuilder_ == null) {
        return friends_.get(index);
      } else {
        return friendsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder setFriends(
        int index, com.heroiclabs.nakama.api.Friend value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.set(index, value);
        onChanged();
      } else {
        friendsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder setFriends(
        int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.set(index, builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder addFriends(com.heroiclabs.nakama.api.Friend value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.add(value);
        onChanged();
      } else {
        friendsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder addFriends(
        int index, com.heroiclabs.nakama.api.Friend value) {
      if (friendsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFriendsIsMutable();
        friends_.add(index, value);
        onChanged();
      } else {
        friendsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder addFriends(
        com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.add(builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder addFriends(
        int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.add(index, builderForValue.build());
        onChanged();
      } else {
        friendsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder addAllFriends(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.Friend> values) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, friends_);
        onChanged();
      } else {
        friendsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder clearFriends() {
      if (friendsBuilder_ == null) {
        friends_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        friendsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public Builder removeFriends(int index) {
      if (friendsBuilder_ == null) {
        ensureFriendsIsMutable();
        friends_.remove(index);
        onChanged();
      } else {
        friendsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public com.heroiclabs.nakama.api.Friend.Builder getFriendsBuilder(
        int index) {
      return getFriendsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public com.heroiclabs.nakama.api.FriendOrBuilder getFriendsOrBuilder(
        int index) {
      if (friendsBuilder_ == null) {
        return friends_.get(index);  } else {
        return friendsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public java.util.List<? extends com.heroiclabs.nakama.api.FriendOrBuilder> 
         getFriendsOrBuilderList() {
      if (friendsBuilder_ != null) {
        return friendsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(friends_);
      }
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public com.heroiclabs.nakama.api.Friend.Builder addFriendsBuilder() {
      return getFriendsFieldBuilder().addBuilder(
          com.heroiclabs.nakama.api.Friend.getDefaultInstance());
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public com.heroiclabs.nakama.api.Friend.Builder addFriendsBuilder(
        int index) {
      return getFriendsFieldBuilder().addBuilder(
          index, com.heroiclabs.nakama.api.Friend.getDefaultInstance());
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1 [json_name = "friends"];</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Friend.Builder> 
         getFriendsBuilderList() {
      return getFriendsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.heroiclabs.nakama.api.Friend, com.heroiclabs.nakama.api.Friend.Builder, com.heroiclabs.nakama.api.FriendOrBuilder> 
        getFriendsFieldBuilder() {
      if (friendsBuilder_ == null) {
        friendsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.heroiclabs.nakama.api.Friend, com.heroiclabs.nakama.api.Friend.Builder, com.heroiclabs.nakama.api.FriendOrBuilder>(
                friends_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        friends_ = null;
      }
      return friendsBuilder_;
    }

    private java.lang.Object cursor_ = "";
    /**
     * <pre>
     * Cursor for the next page of results, if any.
     * </pre>
     *
     * <code>string cursor = 2 [json_name = "cursor"];</code>
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
     * Cursor for the next page of results, if any.
     * </pre>
     *
     * <code>string cursor = 2 [json_name = "cursor"];</code>
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
     * Cursor for the next page of results, if any.
     * </pre>
     *
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cursor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cursor for the next page of results, if any.
     * </pre>
     *
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      cursor_ = getDefaultInstance().getCursor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cursor for the next page of results, if any.
     * </pre>
     *
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cursor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.FriendList)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.FriendList)
  private static final com.heroiclabs.nakama.api.FriendList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.FriendList();
  }

  public static com.heroiclabs.nakama.api.FriendList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FriendList>
      PARSER = new com.google.protobuf.AbstractParser<FriendList>() {
    @java.lang.Override
    public FriendList parsePartialFrom(
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

  public static com.google.protobuf.Parser<FriendList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FriendList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.FriendList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
