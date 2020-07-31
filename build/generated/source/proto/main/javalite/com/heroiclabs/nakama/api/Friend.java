// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A friend of a user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Friend}
 */
public  final class Friend extends
    com.google.protobuf.GeneratedMessageLite<
        Friend, Friend.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.Friend)
    FriendOrBuilder {
  private Friend() {
  }
  /**
   * <pre>
   * The friendship status.
   * </pre>
   *
   * Protobuf enum {@code nakama.api.Friend.State}
   */
  public enum State
      implements com.google.protobuf.Internal.EnumLite {
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
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

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

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:nakama.api.Friend.State)
  }

  public static final int USER_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.api.User user_;
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  public com.heroiclabs.nakama.api.User getUser() {
    return user_ == null ? com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  private void setUser(com.heroiclabs.nakama.api.User value) {
    if (value == null) {
      throw new NullPointerException();
    }
    user_ = value;
    
    }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  private void setUser(
      com.heroiclabs.nakama.api.User.Builder builderForValue) {
    user_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  private void mergeUser(com.heroiclabs.nakama.api.User value) {
    if (user_ != null &&
        user_ != com.heroiclabs.nakama.api.User.getDefaultInstance()) {
      user_ =
        com.heroiclabs.nakama.api.User.newBuilder(user_).mergeFrom(value).buildPartial();
    } else {
      user_ = value;
    }
    
  }
  /**
   * <pre>
   * The user object.
   * </pre>
   *
   * <code>optional .nakama.api.User user = 1;</code>
   */
  private void clearUser() {  user_ = null;
    
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value state_;
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  public com.google.protobuf.Int32Value getState() {
    return state_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : state_;
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void setState(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    state_ = value;
    
    }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void setState(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    state_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void mergeState(com.google.protobuf.Int32Value value) {
    if (state_ != null &&
        state_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      state_ =
        com.google.protobuf.Int32Value.newBuilder(state_).mergeFrom(value).buildPartial();
    } else {
      state_ = value;
    }
    
  }
  /**
   * <pre>
   * The friend status.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void clearState() {  state_ = null;
    
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  private void setUpdateTime(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    updateTime_ = value;
    
    }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  private void setUpdateTime(
      com.google.protobuf.Timestamp.Builder builderForValue) {
    updateTime_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  private void mergeUpdateTime(com.google.protobuf.Timestamp value) {
    if (updateTime_ != null &&
        updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      updateTime_ =
        com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
    } else {
      updateTime_ = value;
    }
    
  }
  /**
   * <pre>
   * Time of the latest relationship update.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
   */
  private void clearUpdateTime() {  updateTime_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    if (state_ != null) {
      output.writeMessage(2, getState());
    }
    if (updateTime_ != null) {
      output.writeMessage(3, getUpdateTime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateTime());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friend parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.Friend prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A friend of a user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Friend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.Friend, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Friend)
      com.heroiclabs.nakama.api.FriendOrBuilder {
    // Construct using com.heroiclabs.nakama.api.Friend.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public boolean hasUser() {
      return instance.hasUser();
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public com.heroiclabs.nakama.api.User getUser() {
      return instance.getUser();
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public Builder setUser(com.heroiclabs.nakama.api.User value) {
      copyOnWrite();
      instance.setUser(value);
      return this;
      }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public Builder setUser(
        com.heroiclabs.nakama.api.User.Builder builderForValue) {
      copyOnWrite();
      instance.setUser(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public Builder mergeUser(com.heroiclabs.nakama.api.User value) {
      copyOnWrite();
      instance.mergeUser(value);
      return this;
    }
    /**
     * <pre>
     * The user object.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public Builder clearUser() {  copyOnWrite();
      instance.clearUser();
      return this;
    }

    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public boolean hasState() {
      return instance.hasState();
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public com.google.protobuf.Int32Value getState() {
      return instance.getState();
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder setState(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setState(value);
      return this;
      }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder setState(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setState(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder mergeState(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeState(value);
      return this;
    }
    /**
     * <pre>
     * The friend status.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder clearState() {  copyOnWrite();
      instance.clearState();
      return this;
    }

    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public boolean hasUpdateTime() {
      return instance.hasUpdateTime();
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      return instance.getUpdateTime();
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setUpdateTime(value);
      return this;
      }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdateTime(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeUpdateTime(value);
      return this;
    }
    /**
     * <pre>
     * Time of the latest relationship update.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder clearUpdateTime() {  copyOnWrite();
      instance.clearUpdateTime();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Friend)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.Friend();
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
        com.heroiclabs.nakama.api.Friend other = (com.heroiclabs.nakama.api.Friend) arg1;
        user_ = visitor.visitMessage(user_, other.user_);
        state_ = visitor.visitMessage(state_, other.state_);
        updateTime_ = visitor.visitMessage(updateTime_, other.updateTime_);
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
                com.heroiclabs.nakama.api.User.Builder subBuilder = null;
                if (user_ != null) {
                  subBuilder = user_.toBuilder();
                }
                user_ = input.readMessage(com.heroiclabs.nakama.api.User.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(user_);
                  user_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (state_ != null) {
                  subBuilder = state_.toBuilder();
                }
                state_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(state_);
                  state_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                com.google.protobuf.Timestamp.Builder subBuilder = null;
                if (updateTime_ != null) {
                  subBuilder = updateTime_.toBuilder();
                }
                updateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(updateTime_);
                  updateTime_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.Friend.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.Friend)
  private static final com.heroiclabs.nakama.api.Friend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Friend();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.Friend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Friend> PARSER;

  public static com.google.protobuf.Parser<Friend> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

