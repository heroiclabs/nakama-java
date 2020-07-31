// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Update fields in a given group.
 * </pre>
 *
 * Protobuf type {@code nakama.api.UpdateGroupRequest}
 */
public  final class UpdateGroupRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UpdateGroupRequest, UpdateGroupRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.UpdateGroupRequest)
    UpdateGroupRequestOrBuilder {
  private UpdateGroupRequest() {
    groupId_ = "";
  }
  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private java.lang.String groupId_;
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  public java.lang.String getGroupId() {
    return groupId_;
  }
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
  }
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void setGroupId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    groupId_ = value;
  }
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void clearGroupId() {
    
    groupId_ = getDefaultInstance().getGroupId();
  }
  /**
   * <pre>
   * The ID of the group to update.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void setGroupIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    groupId_ = value.toStringUtf8();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue name_;
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  private void setName(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    name_ = value;
    
    }
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  private void setName(
      com.google.protobuf.StringValue.Builder builderForValue) {
    name_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  private void mergeName(com.google.protobuf.StringValue value) {
    if (name_ != null &&
        name_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      name_ =
        com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
    } else {
      name_ = value;
    }
    
  }
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue name = 2;</code>
   */
  private void clearName() {  name_ = null;
    
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue description_;
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  public com.google.protobuf.StringValue getDescription() {
    return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
  }
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  private void setDescription(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    description_ = value;
    
    }
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  private void setDescription(
      com.google.protobuf.StringValue.Builder builderForValue) {
    description_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  private void mergeDescription(com.google.protobuf.StringValue value) {
    if (description_ != null &&
        description_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      description_ =
        com.google.protobuf.StringValue.newBuilder(description_).mergeFrom(value).buildPartial();
    } else {
      description_ = value;
    }
    
  }
  /**
   * <pre>
   * Description string.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue description = 3;</code>
   */
  private void clearDescription() {  description_ = null;
    
  }

  public static final int LANG_TAG_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue langTag_;
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  public boolean hasLangTag() {
    return langTag_ != null;
  }
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  public com.google.protobuf.StringValue getLangTag() {
    return langTag_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : langTag_;
  }
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  private void setLangTag(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    langTag_ = value;
    
    }
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  private void setLangTag(
      com.google.protobuf.StringValue.Builder builderForValue) {
    langTag_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  private void mergeLangTag(com.google.protobuf.StringValue value) {
    if (langTag_ != null &&
        langTag_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      langTag_ =
        com.google.protobuf.StringValue.newBuilder(langTag_).mergeFrom(value).buildPartial();
    } else {
      langTag_ = value;
    }
    
  }
  /**
   * <pre>
   * Lang tag.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  private void clearLangTag() {  langTag_ = null;
    
  }

  public static final int AVATAR_URL_FIELD_NUMBER = 5;
  private com.google.protobuf.StringValue avatarUrl_;
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  public boolean hasAvatarUrl() {
    return avatarUrl_ != null;
  }
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  public com.google.protobuf.StringValue getAvatarUrl() {
    return avatarUrl_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : avatarUrl_;
  }
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  private void setAvatarUrl(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    avatarUrl_ = value;
    
    }
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  private void setAvatarUrl(
      com.google.protobuf.StringValue.Builder builderForValue) {
    avatarUrl_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  private void mergeAvatarUrl(com.google.protobuf.StringValue value) {
    if (avatarUrl_ != null &&
        avatarUrl_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      avatarUrl_ =
        com.google.protobuf.StringValue.newBuilder(avatarUrl_).mergeFrom(value).buildPartial();
    } else {
      avatarUrl_ = value;
    }
    
  }
  /**
   * <pre>
   * Avatar URL.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
   */
  private void clearAvatarUrl() {  avatarUrl_ = null;
    
  }

  public static final int OPEN_FIELD_NUMBER = 6;
  private com.google.protobuf.BoolValue open_;
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  public boolean hasOpen() {
    return open_ != null;
  }
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  public com.google.protobuf.BoolValue getOpen() {
    return open_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : open_;
  }
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  private void setOpen(com.google.protobuf.BoolValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    open_ = value;
    
    }
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  private void setOpen(
      com.google.protobuf.BoolValue.Builder builderForValue) {
    open_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  private void mergeOpen(com.google.protobuf.BoolValue value) {
    if (open_ != null &&
        open_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
      open_ =
        com.google.protobuf.BoolValue.newBuilder(open_).mergeFrom(value).buildPartial();
    } else {
      open_ = value;
    }
    
  }
  /**
   * <pre>
   * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue open = 6;</code>
   */
  private void clearOpen() {  open_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!groupId_.isEmpty()) {
      output.writeString(1, getGroupId());
    }
    if (name_ != null) {
      output.writeMessage(2, getName());
    }
    if (description_ != null) {
      output.writeMessage(3, getDescription());
    }
    if (langTag_ != null) {
      output.writeMessage(4, getLangTag());
    }
    if (avatarUrl_ != null) {
      output.writeMessage(5, getAvatarUrl());
    }
    if (open_ != null) {
      output.writeMessage(6, getOpen());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!groupId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getGroupId());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getName());
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDescription());
    }
    if (langTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLangTag());
    }
    if (avatarUrl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAvatarUrl());
    }
    if (open_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getOpen());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.UpdateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.UpdateGroupRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Update fields in a given group.
   * </pre>
   *
   * Protobuf type {@code nakama.api.UpdateGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.UpdateGroupRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.UpdateGroupRequest)
      com.heroiclabs.nakama.api.UpdateGroupRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.UpdateGroupRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ID of the group to update.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      return instance.getGroupId();
    }
    /**
     * <pre>
     * The ID of the group to update.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return instance.getGroupIdBytes();
    }
    /**
     * <pre>
     * The ID of the group to update.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder setGroupId(
        java.lang.String value) {
      copyOnWrite();
      instance.setGroupId(value);
      return this;
    }
    /**
     * <pre>
     * The ID of the group to update.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder clearGroupId() {
      copyOnWrite();
      instance.clearGroupId();
      return this;
    }
    /**
     * <pre>
     * The ID of the group to update.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGroupIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public com.google.protobuf.StringValue getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setName(value);
      return this;
      }
    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setName(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeName(value);
      return this;
    }
    /**
     * <pre>
     * Name.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue name = 2;</code>
     */
    public Builder clearName() {  copyOnWrite();
      instance.clearName();
      return this;
    }

    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public boolean hasDescription() {
      return instance.hasDescription();
    }
    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public com.google.protobuf.StringValue getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public Builder setDescription(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
      }
    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public Builder setDescription(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setDescription(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public Builder mergeDescription(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeDescription(value);
      return this;
    }
    /**
     * <pre>
     * Description string.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue description = 3;</code>
     */
    public Builder clearDescription() {  copyOnWrite();
      instance.clearDescription();
      return this;
    }

    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public boolean hasLangTag() {
      return instance.hasLangTag();
    }
    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public com.google.protobuf.StringValue getLangTag() {
      return instance.getLangTag();
    }
    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public Builder setLangTag(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setLangTag(value);
      return this;
      }
    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public Builder setLangTag(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setLangTag(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public Builder mergeLangTag(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeLangTag(value);
      return this;
    }
    /**
     * <pre>
     * Lang tag.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
     */
    public Builder clearLangTag() {  copyOnWrite();
      instance.clearLangTag();
      return this;
    }

    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public boolean hasAvatarUrl() {
      return instance.hasAvatarUrl();
    }
    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public com.google.protobuf.StringValue getAvatarUrl() {
      return instance.getAvatarUrl();
    }
    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public Builder setAvatarUrl(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setAvatarUrl(value);
      return this;
      }
    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public Builder setAvatarUrl(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setAvatarUrl(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public Builder mergeAvatarUrl(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeAvatarUrl(value);
      return this;
    }
    /**
     * <pre>
     * Avatar URL.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue avatar_url = 5;</code>
     */
    public Builder clearAvatarUrl() {  copyOnWrite();
      instance.clearAvatarUrl();
      return this;
    }

    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public boolean hasOpen() {
      return instance.hasOpen();
    }
    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public com.google.protobuf.BoolValue getOpen() {
      return instance.getOpen();
    }
    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public Builder setOpen(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.setOpen(value);
      return this;
      }
    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public Builder setOpen(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      copyOnWrite();
      instance.setOpen(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public Builder mergeOpen(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.mergeOpen(value);
      return this;
    }
    /**
     * <pre>
     * Open is true if anyone should be allowed to join, or false if joins must be approved by a group admin.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue open = 6;</code>
     */
    public Builder clearOpen() {  copyOnWrite();
      instance.clearOpen();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.UpdateGroupRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.UpdateGroupRequest();
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
        com.heroiclabs.nakama.api.UpdateGroupRequest other = (com.heroiclabs.nakama.api.UpdateGroupRequest) arg1;
        groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
            !other.groupId_.isEmpty(), other.groupId_);
        name_ = visitor.visitMessage(name_, other.name_);
        description_ = visitor.visitMessage(description_, other.description_);
        langTag_ = visitor.visitMessage(langTag_, other.langTag_);
        avatarUrl_ = visitor.visitMessage(avatarUrl_, other.avatarUrl_);
        open_ = visitor.visitMessage(open_, other.open_);
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

                groupId_ = s;
                break;
              }
              case 18: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (name_ != null) {
                  subBuilder = name_.toBuilder();
                }
                name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(name_);
                  name_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (description_ != null) {
                  subBuilder = description_.toBuilder();
                }
                description_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(description_);
                  description_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (langTag_ != null) {
                  subBuilder = langTag_.toBuilder();
                }
                langTag_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(langTag_);
                  langTag_ = subBuilder.buildPartial();
                }

                break;
              }
              case 42: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (avatarUrl_ != null) {
                  subBuilder = avatarUrl_.toBuilder();
                }
                avatarUrl_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(avatarUrl_);
                  avatarUrl_ = subBuilder.buildPartial();
                }

                break;
              }
              case 50: {
                com.google.protobuf.BoolValue.Builder subBuilder = null;
                if (open_ != null) {
                  subBuilder = open_.toBuilder();
                }
                open_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(open_);
                  open_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.UpdateGroupRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.UpdateGroupRequest)
  private static final com.heroiclabs.nakama.api.UpdateGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UpdateGroupRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.UpdateGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpdateGroupRequest> PARSER;

  public static com.google.protobuf.Parser<UpdateGroupRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

