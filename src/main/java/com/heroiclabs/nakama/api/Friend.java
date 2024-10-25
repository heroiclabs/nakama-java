// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A friend of a user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Friend}
 */
public final class Friend extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.Friend)
    FriendOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Friend.class.getName());
  }
  // Use Friend.newBuilder() to construct.
  private Friend(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Friend() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Friend_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Friend_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.Friend.class, com.heroiclabs.nakama.api.Friend.Builder.class);
  }

  /**
   * <pre>
   * The friendship status.
   * </pre>
   *
   * Protobuf enum {@code nakama.api.Friend.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The user is a friend of the current user.
     * </pre>
     *
     * <code>FRIEND = 0;</code>
     */
    FRIEND(0),
    /**
     * <pre>
     * The current user has sent an invite to the user.
     * </pre>
     *
     * <code>INVITE_SENT = 1;</code>
     */
    INVITE_SENT(1),
    /**
     * <pre>
     * The current user has received an invite from this user.
     * </pre>
     *
     * <code>INVITE_RECEIVED = 2;</code>
     */
    INVITE_RECEIVED(2),
    /**
     * <pre>
     * The current user has blocked this user.
     * </pre>
     *
     * <code>BLOCKED = 3;</code>
     */
    BLOCKED(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 2,
        /* suffix= */ "",
        State.class.getName());
    }
    /**
     * <pre>
     * The user is a friend of the current user.
     * </pre>
     *
     * <code>FRIEND = 0;</code>
     */
    public static final int FRIEND_VALUE = 0;
    /**
     * <pre>
     * The current user has sent an invite to the user.
     * </pre>
     *
     * <code>INVITE_SENT = 1;</code>
     */
    public static final int INVITE_SENT_VALUE = 1;
    /**
     * <pre>
     * The current user has received an invite from this user.
     * </pre>
     *
     * <code>INVITE_RECEIVED = 2;</code>
     */
    public static final int INVITE_RECEIVED_VALUE = 2;
    /**
     * <pre>
     * The current user has blocked this user.
     * </pre>
     *
     * <code>BLOCKED = 3;</code>
     */
    public static final int BLOCKED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return FRIEND;
        case 1: return INVITE_SENT;
        case 2: return INVITE_RECEIVED;
        case 3: return BLOCKED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.Friend.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:nakama.api.Friend.State)
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.api.User user_;
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.User getUser() {
    return user_ == null ? com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.api.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value state_;
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getState() {
    return state_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : state_;
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getStateOrBuilder() {
    return state_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : state_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getState());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateTime());
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
    if (!(obj instanceof com.heroiclabs.nakama.api.Friend)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.Friend other = (com.heroiclabs.nakama.api.Friend) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime()
          .equals(other.getUpdateTime())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.Friend parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.Friend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.Friend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.Friend prototype) {
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
   * A friend of a user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Friend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Friend)
      com.heroiclabs.nakama.api.FriendOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Friend_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Friend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.Friend.class, com.heroiclabs.nakama.api.Friend.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.Friend.newBuilder()
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
        getUserFieldBuilder();
        getStateFieldBuilder();
        getUpdateTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_Friend_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Friend getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.Friend.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Friend build() {
      com.heroiclabs.nakama.api.Friend result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.Friend buildPartial() {
      com.heroiclabs.nakama.api.Friend result = new com.heroiclabs.nakama.api.Friend(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.Friend result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = stateBuilder_ == null
            ? state_
            : stateBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null
            ? updateTime_
            : updateTimeBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.Friend) {
        return mergeFrom((com.heroiclabs.nakama.api.Friend)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.Friend other) {
      if (other == com.heroiclabs.nakama.api.Friend.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasState()) {
        mergeState(other.getState());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
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
    private int bitField0_;

    private com.heroiclabs.nakama.api.User user_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.User, com.heroiclabs.nakama.api.User.Builder, com.heroiclabs.nakama.api.UserOrBuilder> userBuilder_;
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     * @return The user.
     */
    public com.heroiclabs.nakama.api.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(com.heroiclabs.nakama.api.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(
        com.heroiclabs.nakama.api.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public Builder mergeUser(com.heroiclabs.nakama.api.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != com.heroiclabs.nakama.api.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public com.heroiclabs.nakama.api.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    public com.heroiclabs.nakama.api.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>.nakama.api.User user = 1 [json_name = "user"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.api.User, com.heroiclabs.nakama.api.User.Builder, com.heroiclabs.nakama.api.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.api.User, com.heroiclabs.nakama.api.User.Builder, com.heroiclabs.nakama.api.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.google.protobuf.Int32Value state_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> stateBuilder_;
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     * @return The state.
     */
    public com.google.protobuf.Int32Value getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public Builder setState(com.google.protobuf.Int32Value value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public Builder setState(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public Builder mergeState(com.google.protobuf.Int32Value value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          state_ != null &&
          state_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      if (state_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public com.google.protobuf.Int32Value.Builder getStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : state_;
      }
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value state = 2 [json_name = "state"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updateTimeBuilder_;
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          updateTime_ != null &&
          updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      if (updateTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      }
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(),
                getParentForChildren(),
                isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Friend)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.Friend)
  private static final com.heroiclabs.nakama.api.Friend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.Friend();
  }

  public static com.heroiclabs.nakama.api.Friend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Friend>
      PARSER = new com.google.protobuf.AbstractParser<Friend>() {
    @java.lang.Override
    public Friend parsePartialFrom(
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

  public static com.google.protobuf.Parser<Friend> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Friend> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.Friend getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
