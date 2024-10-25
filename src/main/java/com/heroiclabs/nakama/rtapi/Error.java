// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/rtapi/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * A logical error which may occur on the server.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.Error}
 */
public final class Error extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.Error)
    ErrorOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Error.class.getName());
  }
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Error() {
    message_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 3:
        return internalGetContext();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.rtapi.Error.class, com.heroiclabs.nakama.rtapi.Error.Builder.class);
  }

  /**
   * <pre>
   * The selection of possible error codes.
   * </pre>
   *
   * Protobuf enum {@code nakama.realtime.Error.Code}
   */
  public enum Code
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * An unexpected result from the server.
     * </pre>
     *
     * <code>RUNTIME_EXCEPTION = 0;</code>
     */
    RUNTIME_EXCEPTION(0),
    /**
     * <pre>
     * The server received a message which is not recognised.
     * </pre>
     *
     * <code>UNRECOGNIZED_PAYLOAD = 1;</code>
     */
    UNRECOGNIZED_PAYLOAD(1),
    /**
     * <pre>
     * A message was expected but contains no content.
     * </pre>
     *
     * <code>MISSING_PAYLOAD = 2;</code>
     */
    MISSING_PAYLOAD(2),
    /**
     * <pre>
     * Fields in the message have an invalid format.
     * </pre>
     *
     * <code>BAD_INPUT = 3;</code>
     */
    BAD_INPUT(3),
    /**
     * <pre>
     * The match id was not found.
     * </pre>
     *
     * <code>MATCH_NOT_FOUND = 4;</code>
     */
    MATCH_NOT_FOUND(4),
    /**
     * <pre>
     * The match join was rejected.
     * </pre>
     *
     * <code>MATCH_JOIN_REJECTED = 5;</code>
     */
    MATCH_JOIN_REJECTED(5),
    /**
     * <pre>
     * The runtime function does not exist on the server.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_NOT_FOUND = 6;</code>
     */
    RUNTIME_FUNCTION_NOT_FOUND(6),
    /**
     * <pre>
     * The runtime function executed with an error.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_EXCEPTION = 7;</code>
     */
    RUNTIME_FUNCTION_EXCEPTION(7),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 2,
        /* suffix= */ "",
        Code.class.getName());
    }
    /**
     * <pre>
     * An unexpected result from the server.
     * </pre>
     *
     * <code>RUNTIME_EXCEPTION = 0;</code>
     */
    public static final int RUNTIME_EXCEPTION_VALUE = 0;
    /**
     * <pre>
     * The server received a message which is not recognised.
     * </pre>
     *
     * <code>UNRECOGNIZED_PAYLOAD = 1;</code>
     */
    public static final int UNRECOGNIZED_PAYLOAD_VALUE = 1;
    /**
     * <pre>
     * A message was expected but contains no content.
     * </pre>
     *
     * <code>MISSING_PAYLOAD = 2;</code>
     */
    public static final int MISSING_PAYLOAD_VALUE = 2;
    /**
     * <pre>
     * Fields in the message have an invalid format.
     * </pre>
     *
     * <code>BAD_INPUT = 3;</code>
     */
    public static final int BAD_INPUT_VALUE = 3;
    /**
     * <pre>
     * The match id was not found.
     * </pre>
     *
     * <code>MATCH_NOT_FOUND = 4;</code>
     */
    public static final int MATCH_NOT_FOUND_VALUE = 4;
    /**
     * <pre>
     * The match join was rejected.
     * </pre>
     *
     * <code>MATCH_JOIN_REJECTED = 5;</code>
     */
    public static final int MATCH_JOIN_REJECTED_VALUE = 5;
    /**
     * <pre>
     * The runtime function does not exist on the server.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_NOT_FOUND = 6;</code>
     */
    public static final int RUNTIME_FUNCTION_NOT_FOUND_VALUE = 6;
    /**
     * <pre>
     * The runtime function executed with an error.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_EXCEPTION = 7;</code>
     */
    public static final int RUNTIME_FUNCTION_EXCEPTION_VALUE = 7;


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
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Code forNumber(int value) {
      switch (value) {
        case 0: return RUNTIME_EXCEPTION;
        case 1: return UNRECOGNIZED_PAYLOAD;
        case 2: return MISSING_PAYLOAD;
        case 3: return BAD_INPUT;
        case 4: return MATCH_NOT_FOUND;
        case 5: return MATCH_JOIN_REJECTED;
        case 6: return RUNTIME_FUNCTION_NOT_FOUND;
        case 7: return RUNTIME_FUNCTION_EXCEPTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Code>() {
            public Code findValueByNumber(int number) {
              return Code.forNumber(number);
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
      return com.heroiclabs.nakama.rtapi.Error.getDescriptor().getEnumTypes().get(0);
    }

    private static final Code[] VALUES = values();

    public static Code valueOf(
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

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:nakama.realtime.Error.Code)
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <pre>
   * The error code which should be one of "Error.Code" enums.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_FIELD_NUMBER = 3;
  private static final class ContextDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_ContextEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> context_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetContext() {
    if (context_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ContextDefaultEntryHolder.defaultEntry);
    }
    return context_;
  }
  public int getContextCount() {
    return internalGetContext().getMap().size();
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
   */
  @java.lang.Override
  public boolean containsContext(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetContext().getMap().containsKey(key);
  }
  /**
   * Use {@link #getContextMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getContext() {
    return getContextMap();
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getContextMap() {
    return internalGetContext().getMap();
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getContextOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetContext().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
   */
  @java.lang.Override
  public java.lang.String getContextOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetContext().getMap();
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    com.google.protobuf.GeneratedMessage
      .serializeStringMapTo(
        output,
        internalGetContext(),
        ContextDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetContext().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      context__ = ContextDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, context__);
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
    if (!(obj instanceof com.heroiclabs.nakama.rtapi.Error)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.rtapi.Error other = (com.heroiclabs.nakama.rtapi.Error) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!internalGetContext().equals(
        other.internalGetContext())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (!internalGetContext().getMap().isEmpty()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetContext().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.rtapi.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.rtapi.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.Error prototype) {
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
   * A logical error which may occur on the server.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.Error)
      com.heroiclabs.nakama.rtapi.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 3:
          return internalGetContext();
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
          return internalGetMutableContext();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.rtapi.Error.class, com.heroiclabs.nakama.rtapi.Error.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.rtapi.Error.newBuilder()
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
      code_ = 0;
      message_ = "";
      internalGetMutableContext().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.rtapi.RealtimeProto.internal_static_nakama_realtime_Error_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Error getDefaultInstanceForType() {
      return com.heroiclabs.nakama.rtapi.Error.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Error build() {
      com.heroiclabs.nakama.rtapi.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.rtapi.Error buildPartial() {
      com.heroiclabs.nakama.rtapi.Error result = new com.heroiclabs.nakama.rtapi.Error(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.rtapi.Error result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.context_ = internalGetContext();
        result.context_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.rtapi.Error) {
        return mergeFrom((com.heroiclabs.nakama.rtapi.Error)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.rtapi.Error other) {
      if (other == com.heroiclabs.nakama.rtapi.Error.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      internalGetMutableContext().mergeFrom(
          other.internalGetContext());
      bitField0_ |= 0x00000004;
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
            case 8: {
              code_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              context__ = input.readMessage(
                  ContextDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableContext().getMutableMap().put(
                  context__.getKey(), context__.getValue());
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

    private int code_ ;
    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {

      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> context_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetContext() {
      if (context_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ContextDefaultEntryHolder.defaultEntry);
      }
      return context_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableContext() {
      if (context_ == null) {
        context_ = com.google.protobuf.MapField.newMapField(
            ContextDefaultEntryHolder.defaultEntry);
      }
      if (!context_.isMutable()) {
        context_ = context_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return context_;
    }
    public int getContextCount() {
      return internalGetContext().getMap().size();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    @java.lang.Override
    public boolean containsContext(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetContext().getMap().containsKey(key);
    }
    /**
     * Use {@link #getContextMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getContext() {
      return getContextMap();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getContextMap() {
      return internalGetContext().getMap();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getContextOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetContext().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    @java.lang.Override
    public java.lang.String getContextOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetContext().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearContext() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableContext().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    public Builder removeContext(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableContext().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableContext() {
      bitField0_ |= 0x00000004;
      return internalGetMutableContext().getMutableMap();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    public Builder putContext(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableContext().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3 [json_name = "context"];</code>
     */
    public Builder putAllContext(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableContext().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.Error)
  }

  // @@protoc_insertion_point(class_scope:nakama.realtime.Error)
  private static final com.heroiclabs.nakama.rtapi.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.rtapi.Error();
  }

  public static com.heroiclabs.nakama.rtapi.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error>
      PARSER = new com.google.protobuf.AbstractParser<Error>() {
    @java.lang.Override
    public Error parsePartialFrom(
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

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.rtapi.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
