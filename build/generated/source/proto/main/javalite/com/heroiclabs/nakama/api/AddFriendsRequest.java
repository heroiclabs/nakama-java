// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Add one or more friends to the current user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AddFriendsRequest}
 */
public  final class AddFriendsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        AddFriendsRequest, AddFriendsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.AddFriendsRequest)
    AddFriendsRequestOrBuilder {
  private AddFriendsRequest() {
    ids_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    usernames_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> ids_;
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  public java.util.List<String> getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        ids_.get(index));
  }
  private void ensureIdsIsMutable() {
    if (!ids_.isModifiable()) {
      ids_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(ids_);
     }
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  private void setIds(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
    ids_.set(index, value);
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  private void addIds(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
    ids_.add(value);
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  private void addAllIds(
      java.lang.Iterable<java.lang.String> values) {
    ensureIdsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, ids_);
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  private void clearIds() {
    ids_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * The account id of a user.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   */
  private void addIdsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureIdsIsMutable();
    ids_.add(value.toStringUtf8());
  }

  public static final int USERNAMES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> usernames_;
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public java.util.List<String> getUsernamesList() {
    return usernames_;
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public int getUsernamesCount() {
    return usernames_.size();
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public java.lang.String getUsernames(int index) {
    return usernames_.get(index);
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUsernamesBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        usernames_.get(index));
  }
  private void ensureUsernamesIsMutable() {
    if (!usernames_.isModifiable()) {
      usernames_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(usernames_);
     }
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void setUsernames(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernamesIsMutable();
    usernames_.set(index, value);
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addUsernames(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernamesIsMutable();
    usernames_.add(value);
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addAllUsernames(
      java.lang.Iterable<java.lang.String> values) {
    ensureUsernamesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, usernames_);
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void clearUsernames() {
    usernames_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * The account username of a user.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addUsernamesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureUsernamesIsMutable();
    usernames_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ids_.size(); i++) {
      output.writeString(1, ids_.get(i));
    }
    for (int i = 0; i < usernames_.size(); i++) {
      output.writeString(2, usernames_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(ids_.get(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < usernames_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(usernames_.get(i));
      }
      size += dataSize;
      size += 1 * getUsernamesList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AddFriendsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.AddFriendsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Add one or more friends to the current user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AddFriendsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.AddFriendsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AddFriendsRequest)
      com.heroiclabs.nakama.api.AddFriendsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.AddFriendsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public java.util.List<String>
        getIdsList() {
      return java.util.Collections.unmodifiableList(
          instance.getIdsList());
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public int getIdsCount() {
      return instance.getIdsCount();
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public java.lang.String getIds(int index) {
      return instance.getIds(index);
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return instance.getIdsBytes(index);
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public Builder setIds(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setIds(index, value);
      return this;
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public Builder addIds(
        java.lang.String value) {
      copyOnWrite();
      instance.addIds(value);
      return this;
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllIds(values);
      return this;
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public Builder clearIds() {
      copyOnWrite();
      instance.clearIds();
      return this;
    }
    /**
     * <pre>
     * The account id of a user.
     * </pre>
     *
     * <code>repeated string ids = 1;</code>
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addIdsBytes(value);
      return this;
    }

    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public java.util.List<String>
        getUsernamesList() {
      return java.util.Collections.unmodifiableList(
          instance.getUsernamesList());
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public int getUsernamesCount() {
      return instance.getUsernamesCount();
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public java.lang.String getUsernames(int index) {
      return instance.getUsernames(index);
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernamesBytes(int index) {
      return instance.getUsernamesBytes(index);
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder setUsernames(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setUsernames(index, value);
      return this;
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addUsernames(
        java.lang.String value) {
      copyOnWrite();
      instance.addUsernames(value);
      return this;
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addAllUsernames(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllUsernames(values);
      return this;
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder clearUsernames() {
      copyOnWrite();
      instance.clearUsernames();
      return this;
    }
    /**
     * <pre>
     * The account username of a user.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addUsernamesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addUsernamesBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AddFriendsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.AddFriendsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        ids_.makeImmutable();
        usernames_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.AddFriendsRequest other = (com.heroiclabs.nakama.api.AddFriendsRequest) arg1;
        ids_= visitor.visitList(ids_, other.ids_);
        usernames_= visitor.visitList(usernames_, other.usernames_);
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
                if (!ids_.isModifiable()) {
                  ids_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(ids_);
                }
                ids_.add(s);
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();
                if (!usernames_.isModifiable()) {
                  usernames_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(usernames_);
                }
                usernames_.add(s);
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.AddFriendsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.AddFriendsRequest)
  private static final com.heroiclabs.nakama.api.AddFriendsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AddFriendsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.AddFriendsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AddFriendsRequest> PARSER;

  public static com.google.protobuf.Parser<AddFriendsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

