// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Batch get storage objects.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ReadStorageObjectsRequest}
 */
public  final class ReadStorageObjectsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ReadStorageObjectsRequest, ReadStorageObjectsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ReadStorageObjectsRequest)
    ReadStorageObjectsRequestOrBuilder {
  private ReadStorageObjectsRequest() {
    objectIds_ = emptyProtobufList();
  }
  public static final int OBJECT_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.api.ReadStorageObjectId> objectIds_;
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  public java.util.List<com.heroiclabs.nakama.api.ReadStorageObjectId> getObjectIdsList() {
    return objectIds_;
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.api.ReadStorageObjectIdOrBuilder> 
      getObjectIdsOrBuilderList() {
    return objectIds_;
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  public int getObjectIdsCount() {
    return objectIds_.size();
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  public com.heroiclabs.nakama.api.ReadStorageObjectId getObjectIds(int index) {
    return objectIds_.get(index);
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  public com.heroiclabs.nakama.api.ReadStorageObjectIdOrBuilder getObjectIdsOrBuilder(
      int index) {
    return objectIds_.get(index);
  }
  private void ensureObjectIdsIsMutable() {
    if (!objectIds_.isModifiable()) {
      objectIds_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(objectIds_);
     }
  }

  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void setObjectIds(
      int index, com.heroiclabs.nakama.api.ReadStorageObjectId value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectIdsIsMutable();
    objectIds_.set(index, value);
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void setObjectIds(
      int index, com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
    ensureObjectIdsIsMutable();
    objectIds_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void addObjectIds(com.heroiclabs.nakama.api.ReadStorageObjectId value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectIdsIsMutable();
    objectIds_.add(value);
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void addObjectIds(
      int index, com.heroiclabs.nakama.api.ReadStorageObjectId value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectIdsIsMutable();
    objectIds_.add(index, value);
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void addObjectIds(
      com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
    ensureObjectIdsIsMutable();
    objectIds_.add(builderForValue.build());
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void addObjectIds(
      int index, com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
    ensureObjectIdsIsMutable();
    objectIds_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void addAllObjectIds(
      java.lang.Iterable<? extends com.heroiclabs.nakama.api.ReadStorageObjectId> values) {
    ensureObjectIdsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, objectIds_);
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void clearObjectIds() {
    objectIds_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Batch of storage objects.
   * </pre>
   *
   * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
   */
  private void removeObjectIds(int index) {
    ensureObjectIdsIsMutable();
    objectIds_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < objectIds_.size(); i++) {
      output.writeMessage(1, objectIds_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objectIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objectIds_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ReadStorageObjectsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Batch get storage objects.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ReadStorageObjectsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ReadStorageObjectsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ReadStorageObjectsRequest)
      com.heroiclabs.nakama.api.ReadStorageObjectsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ReadStorageObjectsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.ReadStorageObjectId> getObjectIdsList() {
      return java.util.Collections.unmodifiableList(
          instance.getObjectIdsList());
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public int getObjectIdsCount() {
      return instance.getObjectIdsCount();
    }/**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public com.heroiclabs.nakama.api.ReadStorageObjectId getObjectIds(int index) {
      return instance.getObjectIds(index);
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder setObjectIds(
        int index, com.heroiclabs.nakama.api.ReadStorageObjectId value) {
      copyOnWrite();
      instance.setObjectIds(index, value);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder setObjectIds(
        int index, com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
      copyOnWrite();
      instance.setObjectIds(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder addObjectIds(com.heroiclabs.nakama.api.ReadStorageObjectId value) {
      copyOnWrite();
      instance.addObjectIds(value);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder addObjectIds(
        int index, com.heroiclabs.nakama.api.ReadStorageObjectId value) {
      copyOnWrite();
      instance.addObjectIds(index, value);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder addObjectIds(
        com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
      copyOnWrite();
      instance.addObjectIds(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder addObjectIds(
        int index, com.heroiclabs.nakama.api.ReadStorageObjectId.Builder builderForValue) {
      copyOnWrite();
      instance.addObjectIds(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder addAllObjectIds(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.ReadStorageObjectId> values) {
      copyOnWrite();
      instance.addAllObjectIds(values);
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder clearObjectIds() {
      copyOnWrite();
      instance.clearObjectIds();
      return this;
    }
    /**
     * <pre>
     * Batch of storage objects.
     * </pre>
     *
     * <code>repeated .nakama.api.ReadStorageObjectId object_ids = 1;</code>
     */
    public Builder removeObjectIds(int index) {
      copyOnWrite();
      instance.removeObjectIds(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ReadStorageObjectsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ReadStorageObjectsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        objectIds_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.ReadStorageObjectsRequest other = (com.heroiclabs.nakama.api.ReadStorageObjectsRequest) arg1;
        objectIds_= visitor.visitList(objectIds_, other.objectIds_);
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
                if (!objectIds_.isModifiable()) {
                  objectIds_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(objectIds_);
                }
                objectIds_.add(
                    input.readMessage(com.heroiclabs.nakama.api.ReadStorageObjectId.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ReadStorageObjectsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ReadStorageObjectsRequest)
  private static final com.heroiclabs.nakama.api.ReadStorageObjectsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReadStorageObjectsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ReadStorageObjectsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReadStorageObjectsRequest> PARSER;

  public static com.google.protobuf.Parser<ReadStorageObjectsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

