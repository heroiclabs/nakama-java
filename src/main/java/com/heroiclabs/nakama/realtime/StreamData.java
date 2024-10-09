// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.realtime;

/**
 * <pre>
 * A data message delivered over a stream.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.StreamData}
 */
public final class StreamData extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.StreamData)
    StreamDataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      StreamData.class.getName());
  }
  // Use StreamData.newBuilder() to construct.
  private StreamData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StreamData() {
    data_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StreamData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StreamData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.realtime.StreamData.class, com.heroiclabs.nakama.realtime.StreamData.Builder.class);
  }

  private int bitField0_;
  public static final int STREAM_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.realtime.Stream stream_;
  /**
   * <pre>
   * The stream this data message relates to.
   * </pre>
   *
   * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
   * @return Whether the stream field is set.
   */
  @java.lang.Override
  public boolean hasStream() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The stream this data message relates to.
   * </pre>
   *
   * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
   * @return The stream.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.realtime.Stream getStream() {
    return stream_ == null ? com.heroiclabs.nakama.realtime.Stream.getDefaultInstance() : stream_;
  }
  /**
   * <pre>
   * The stream this data message relates to.
   * </pre>
   *
   * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.realtime.StreamOrBuilder getStreamOrBuilder() {
    return stream_ == null ? com.heroiclabs.nakama.realtime.Stream.getDefaultInstance() : stream_;
  }

  public static final int SENDER_FIELD_NUMBER = 2;
  private com.heroiclabs.nakama.realtime.UserPresence sender_;
  /**
   * <pre>
   * The sender, if any.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
   * @return Whether the sender field is set.
   */
  @java.lang.Override
  public boolean hasSender() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The sender, if any.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.heroiclabs.nakama.realtime.UserPresence getSender() {
    return sender_ == null ? com.heroiclabs.nakama.realtime.UserPresence.getDefaultInstance() : sender_;
  }
  /**
   * <pre>
   * The sender, if any.
   * </pre>
   *
   * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
   */
  @java.lang.Override
  public com.heroiclabs.nakama.realtime.UserPresenceOrBuilder getSenderOrBuilder() {
    return sender_ == null ? com.heroiclabs.nakama.realtime.UserPresence.getDefaultInstance() : sender_;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object data_ = "";
  /**
   * <pre>
   * Arbitrary contents of the data message.
   * </pre>
   *
   * <code>string data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Arbitrary contents of the data message.
   * </pre>
   *
   * <code>string data = 3 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELIABLE_FIELD_NUMBER = 4;
  private boolean reliable_ = false;
  /**
   * <pre>
   * True if this data was delivered reliably, false otherwise.
   * </pre>
   *
   * <code>bool reliable = 4 [json_name = "reliable"];</code>
   * @return The reliable.
   */
  @java.lang.Override
  public boolean getReliable() {
    return reliable_;
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
      output.writeMessage(1, getStream());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getSender());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(data_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, data_);
    }
    if (reliable_ != false) {
      output.writeBool(4, reliable_);
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
        .computeMessageSize(1, getStream());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSender());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(data_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, data_);
    }
    if (reliable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, reliable_);
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
    if (!(obj instanceof com.heroiclabs.nakama.realtime.StreamData)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.realtime.StreamData other = (com.heroiclabs.nakama.realtime.StreamData) obj;

    if (hasStream() != other.hasStream()) return false;
    if (hasStream()) {
      if (!getStream()
          .equals(other.getStream())) return false;
    }
    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (!getSender()
          .equals(other.getSender())) return false;
    }
    if (!getData()
        .equals(other.getData())) return false;
    if (getReliable()
        != other.getReliable()) return false;
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
    if (hasStream()) {
      hash = (37 * hash) + STREAM_FIELD_NUMBER;
      hash = (53 * hash) + getStream().hashCode();
    }
    if (hasSender()) {
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
    }
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + RELIABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReliable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.realtime.StreamData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.realtime.StreamData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.realtime.StreamData parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.realtime.StreamData prototype) {
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
   * A data message delivered over a stream.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.StreamData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.StreamData)
      com.heroiclabs.nakama.realtime.StreamDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StreamData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StreamData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.realtime.StreamData.class, com.heroiclabs.nakama.realtime.StreamData.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.realtime.StreamData.newBuilder()
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
        getStreamFieldBuilder();
        getSenderFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      stream_ = null;
      if (streamBuilder_ != null) {
        streamBuilder_.dispose();
        streamBuilder_ = null;
      }
      sender_ = null;
      if (senderBuilder_ != null) {
        senderBuilder_.dispose();
        senderBuilder_ = null;
      }
      data_ = "";
      reliable_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.realtime.RealtimeProto.internal_static_nakama_realtime_StreamData_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StreamData getDefaultInstanceForType() {
      return com.heroiclabs.nakama.realtime.StreamData.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StreamData build() {
      com.heroiclabs.nakama.realtime.StreamData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.realtime.StreamData buildPartial() {
      com.heroiclabs.nakama.realtime.StreamData result = new com.heroiclabs.nakama.realtime.StreamData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.realtime.StreamData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stream_ = streamBuilder_ == null
            ? stream_
            : streamBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sender_ = senderBuilder_ == null
            ? sender_
            : senderBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.data_ = data_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reliable_ = reliable_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.realtime.StreamData) {
        return mergeFrom((com.heroiclabs.nakama.realtime.StreamData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.realtime.StreamData other) {
      if (other == com.heroiclabs.nakama.realtime.StreamData.getDefaultInstance()) return this;
      if (other.hasStream()) {
        mergeStream(other.getStream());
      }
      if (other.hasSender()) {
        mergeSender(other.getSender());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getReliable() != false) {
        setReliable(other.getReliable());
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
                  getStreamFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSenderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              data_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              reliable_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.heroiclabs.nakama.realtime.Stream stream_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.realtime.Stream, com.heroiclabs.nakama.realtime.Stream.Builder, com.heroiclabs.nakama.realtime.StreamOrBuilder> streamBuilder_;
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     * @return Whether the stream field is set.
     */
    public boolean hasStream() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     * @return The stream.
     */
    public com.heroiclabs.nakama.realtime.Stream getStream() {
      if (streamBuilder_ == null) {
        return stream_ == null ? com.heroiclabs.nakama.realtime.Stream.getDefaultInstance() : stream_;
      } else {
        return streamBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public Builder setStream(com.heroiclabs.nakama.realtime.Stream value) {
      if (streamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stream_ = value;
      } else {
        streamBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public Builder setStream(
        com.heroiclabs.nakama.realtime.Stream.Builder builderForValue) {
      if (streamBuilder_ == null) {
        stream_ = builderForValue.build();
      } else {
        streamBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public Builder mergeStream(com.heroiclabs.nakama.realtime.Stream value) {
      if (streamBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          stream_ != null &&
          stream_ != com.heroiclabs.nakama.realtime.Stream.getDefaultInstance()) {
          getStreamBuilder().mergeFrom(value);
        } else {
          stream_ = value;
        }
      } else {
        streamBuilder_.mergeFrom(value);
      }
      if (stream_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public Builder clearStream() {
      bitField0_ = (bitField0_ & ~0x00000001);
      stream_ = null;
      if (streamBuilder_ != null) {
        streamBuilder_.dispose();
        streamBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public com.heroiclabs.nakama.realtime.Stream.Builder getStreamBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStreamFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    public com.heroiclabs.nakama.realtime.StreamOrBuilder getStreamOrBuilder() {
      if (streamBuilder_ != null) {
        return streamBuilder_.getMessageOrBuilder();
      } else {
        return stream_ == null ?
            com.heroiclabs.nakama.realtime.Stream.getDefaultInstance() : stream_;
      }
    }
    /**
     * <pre>
     * The stream this data message relates to.
     * </pre>
     *
     * <code>.nakama.realtime.Stream stream = 1 [json_name = "stream"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.realtime.Stream, com.heroiclabs.nakama.realtime.Stream.Builder, com.heroiclabs.nakama.realtime.StreamOrBuilder> 
        getStreamFieldBuilder() {
      if (streamBuilder_ == null) {
        streamBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.realtime.Stream, com.heroiclabs.nakama.realtime.Stream.Builder, com.heroiclabs.nakama.realtime.StreamOrBuilder>(
                getStream(),
                getParentForChildren(),
                isClean());
        stream_ = null;
      }
      return streamBuilder_;
    }

    private com.heroiclabs.nakama.realtime.UserPresence sender_;
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.realtime.UserPresence, com.heroiclabs.nakama.realtime.UserPresence.Builder, com.heroiclabs.nakama.realtime.UserPresenceOrBuilder> senderBuilder_;
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     * @return Whether the sender field is set.
     */
    public boolean hasSender() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     * @return The sender.
     */
    public com.heroiclabs.nakama.realtime.UserPresence getSender() {
      if (senderBuilder_ == null) {
        return sender_ == null ? com.heroiclabs.nakama.realtime.UserPresence.getDefaultInstance() : sender_;
      } else {
        return senderBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public Builder setSender(com.heroiclabs.nakama.realtime.UserPresence value) {
      if (senderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sender_ = value;
      } else {
        senderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public Builder setSender(
        com.heroiclabs.nakama.realtime.UserPresence.Builder builderForValue) {
      if (senderBuilder_ == null) {
        sender_ = builderForValue.build();
      } else {
        senderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public Builder mergeSender(com.heroiclabs.nakama.realtime.UserPresence value) {
      if (senderBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          sender_ != null &&
          sender_ != com.heroiclabs.nakama.realtime.UserPresence.getDefaultInstance()) {
          getSenderBuilder().mergeFrom(value);
        } else {
          sender_ = value;
        }
      } else {
        senderBuilder_.mergeFrom(value);
      }
      if (sender_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sender_ = null;
      if (senderBuilder_ != null) {
        senderBuilder_.dispose();
        senderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public com.heroiclabs.nakama.realtime.UserPresence.Builder getSenderBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSenderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    public com.heroiclabs.nakama.realtime.UserPresenceOrBuilder getSenderOrBuilder() {
      if (senderBuilder_ != null) {
        return senderBuilder_.getMessageOrBuilder();
      } else {
        return sender_ == null ?
            com.heroiclabs.nakama.realtime.UserPresence.getDefaultInstance() : sender_;
      }
    }
    /**
     * <pre>
     * The sender, if any.
     * </pre>
     *
     * <code>.nakama.realtime.UserPresence sender = 2 [json_name = "sender"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.heroiclabs.nakama.realtime.UserPresence, com.heroiclabs.nakama.realtime.UserPresence.Builder, com.heroiclabs.nakama.realtime.UserPresenceOrBuilder> 
        getSenderFieldBuilder() {
      if (senderBuilder_ == null) {
        senderBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.heroiclabs.nakama.realtime.UserPresence, com.heroiclabs.nakama.realtime.UserPresence.Builder, com.heroiclabs.nakama.realtime.UserPresenceOrBuilder>(
                getSender(),
                getParentForChildren(),
                isClean());
        sender_ = null;
      }
      return senderBuilder_;
    }

    private java.lang.Object data_ = "";
    /**
     * <pre>
     * Arbitrary contents of the data message.
     * </pre>
     *
     * <code>string data = 3 [json_name = "data"];</code>
     * @return The data.
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Arbitrary contents of the data message.
     * </pre>
     *
     * <code>string data = 3 [json_name = "data"];</code>
     * @return The bytes for data.
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Arbitrary contents of the data message.
     * </pre>
     *
     * <code>string data = 3 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Arbitrary contents of the data message.
     * </pre>
     *
     * <code>string data = 3 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      data_ = getDefaultInstance().getData();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Arbitrary contents of the data message.
     * </pre>
     *
     * <code>string data = 3 [json_name = "data"];</code>
     * @param value The bytes for data to set.
     * @return This builder for chaining.
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      data_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean reliable_ ;
    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>bool reliable = 4 [json_name = "reliable"];</code>
     * @return The reliable.
     */
    @java.lang.Override
    public boolean getReliable() {
      return reliable_;
    }
    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>bool reliable = 4 [json_name = "reliable"];</code>
     * @param value The reliable to set.
     * @return This builder for chaining.
     */
    public Builder setReliable(boolean value) {

      reliable_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>bool reliable = 4 [json_name = "reliable"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReliable() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reliable_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.StreamData)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.StreamData)
  private static final com.heroiclabs.nakama.realtime.StreamData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.realtime.StreamData();
  }

  public static com.heroiclabs.nakama.realtime.StreamData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamData>
      PARSER = new com.google.protobuf.AbstractParser<StreamData>() {
    @java.lang.Override
    public StreamData parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.realtime.StreamData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

