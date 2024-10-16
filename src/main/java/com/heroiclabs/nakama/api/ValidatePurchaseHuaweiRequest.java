// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/api.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Huawei IAP Purchase validation request
 * </pre>
 *
 * Protobuf type {@code nakama.api.ValidatePurchaseHuaweiRequest}
 */
public final class ValidatePurchaseHuaweiRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:nakama.api.ValidatePurchaseHuaweiRequest)
    ValidatePurchaseHuaweiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      ValidatePurchaseHuaweiRequest.class.getName());
  }
  // Use ValidatePurchaseHuaweiRequest.newBuilder() to construct.
  private ValidatePurchaseHuaweiRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ValidatePurchaseHuaweiRequest() {
    purchase_ = "";
    signature_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseHuaweiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseHuaweiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.class, com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PURCHASE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object purchase_ = "";
  /**
   * <pre>
   * JSON encoded Huawei InAppPurchaseData.
   * </pre>
   *
   * <code>string purchase = 1 [json_name = "purchase"];</code>
   * @return The purchase.
   */
  @java.lang.Override
  public java.lang.String getPurchase() {
    java.lang.Object ref = purchase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      purchase_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * JSON encoded Huawei InAppPurchaseData.
   * </pre>
   *
   * <code>string purchase = 1 [json_name = "purchase"];</code>
   * @return The bytes for purchase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPurchaseBytes() {
    java.lang.Object ref = purchase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      purchase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signature_ = "";
  /**
   * <pre>
   * InAppPurchaseData signature.
   * </pre>
   *
   * <code>string signature = 2 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public java.lang.String getSignature() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signature_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * InAppPurchaseData signature.
   * </pre>
   *
   * <code>string signature = 2 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERSIST_FIELD_NUMBER = 3;
  private com.google.protobuf.BoolValue persist_;
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
   * @return Whether the persist field is set.
   */
  @java.lang.Override
  public boolean hasPersist() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
   * @return The persist.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getPersist() {
    return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
  }
  /**
   * <pre>
   * Persist the purchase
   * </pre>
   *
   * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getPersistOrBuilder() {
    return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(purchase_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, purchase_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signature_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, signature_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPersist());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(purchase_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, purchase_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signature_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, signature_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPersist());
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
    if (!(obj instanceof com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest)) {
      return super.equals(obj);
    }
    com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest other = (com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest) obj;

    if (!getPurchase()
        .equals(other.getPurchase())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (hasPersist() != other.hasPersist()) return false;
    if (hasPersist()) {
      if (!getPersist()
          .equals(other.getPersist())) return false;
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
    hash = (37 * hash) + PURCHASE_FIELD_NUMBER;
    hash = (53 * hash) + getPurchase().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    if (hasPersist()) {
      hash = (37 * hash) + PERSIST_FIELD_NUMBER;
      hash = (53 * hash) + getPersist().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest parseFrom(
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
  public static Builder newBuilder(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest prototype) {
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
   * Huawei IAP Purchase validation request
   * </pre>
   *
   * Protobuf type {@code nakama.api.ValidatePurchaseHuaweiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ValidatePurchaseHuaweiRequest)
      com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseHuaweiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseHuaweiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.class, com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.Builder.class);
    }

    // Construct using com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.newBuilder()
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
        getPersistFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      purchase_ = "";
      signature_ = "";
      persist_ = null;
      if (persistBuilder_ != null) {
        persistBuilder_.dispose();
        persistBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.heroiclabs.nakama.api.ApiProto.internal_static_nakama_api_ValidatePurchaseHuaweiRequest_descriptor;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest getDefaultInstanceForType() {
      return com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest build() {
      com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest buildPartial() {
      com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest result = new com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.purchase_ = purchase_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.signature_ = signature_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.persist_ = persistBuilder_ == null
            ? persist_
            : persistBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest) {
        return mergeFrom((com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest other) {
      if (other == com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.getDefaultInstance()) return this;
      if (!other.getPurchase().isEmpty()) {
        purchase_ = other.purchase_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSignature().isEmpty()) {
        signature_ = other.signature_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPersist()) {
        mergePersist(other.getPersist());
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
              purchase_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              signature_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPersistFieldBuilder().getBuilder(),
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

    private java.lang.Object purchase_ = "";
    /**
     * <pre>
     * JSON encoded Huawei InAppPurchaseData.
     * </pre>
     *
     * <code>string purchase = 1 [json_name = "purchase"];</code>
     * @return The purchase.
     */
    public java.lang.String getPurchase() {
      java.lang.Object ref = purchase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        purchase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * JSON encoded Huawei InAppPurchaseData.
     * </pre>
     *
     * <code>string purchase = 1 [json_name = "purchase"];</code>
     * @return The bytes for purchase.
     */
    public com.google.protobuf.ByteString
        getPurchaseBytes() {
      java.lang.Object ref = purchase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        purchase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * JSON encoded Huawei InAppPurchaseData.
     * </pre>
     *
     * <code>string purchase = 1 [json_name = "purchase"];</code>
     * @param value The purchase to set.
     * @return This builder for chaining.
     */
    public Builder setPurchase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      purchase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON encoded Huawei InAppPurchaseData.
     * </pre>
     *
     * <code>string purchase = 1 [json_name = "purchase"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPurchase() {
      purchase_ = getDefaultInstance().getPurchase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON encoded Huawei InAppPurchaseData.
     * </pre>
     *
     * <code>string purchase = 1 [json_name = "purchase"];</code>
     * @param value The bytes for purchase to set.
     * @return This builder for chaining.
     */
    public Builder setPurchaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      purchase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object signature_ = "";
    /**
     * <pre>
     * InAppPurchaseData signature.
     * </pre>
     *
     * <code>string signature = 2 [json_name = "signature"];</code>
     * @return The signature.
     */
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * InAppPurchaseData signature.
     * </pre>
     *
     * <code>string signature = 2 [json_name = "signature"];</code>
     * @return The bytes for signature.
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * InAppPurchaseData signature.
     * </pre>
     *
     * <code>string signature = 2 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * InAppPurchaseData signature.
     * </pre>
     *
     * <code>string signature = 2 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      signature_ = getDefaultInstance().getSignature();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * InAppPurchaseData signature.
     * </pre>
     *
     * <code>string signature = 2 [json_name = "signature"];</code>
     * @param value The bytes for signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.BoolValue persist_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> persistBuilder_;
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     * @return Whether the persist field is set.
     */
    public boolean hasPersist() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     * @return The persist.
     */
    public com.google.protobuf.BoolValue getPersist() {
      if (persistBuilder_ == null) {
        return persist_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
      } else {
        return persistBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public Builder setPersist(com.google.protobuf.BoolValue value) {
      if (persistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        persist_ = value;
      } else {
        persistBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public Builder setPersist(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (persistBuilder_ == null) {
        persist_ = builderForValue.build();
      } else {
        persistBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public Builder mergePersist(com.google.protobuf.BoolValue value) {
      if (persistBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          persist_ != null &&
          persist_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getPersistBuilder().mergeFrom(value);
        } else {
          persist_ = value;
        }
      } else {
        persistBuilder_.mergeFrom(value);
      }
      if (persist_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public Builder clearPersist() {
      bitField0_ = (bitField0_ & ~0x00000004);
      persist_ = null;
      if (persistBuilder_ != null) {
        persistBuilder_.dispose();
        persistBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public com.google.protobuf.BoolValue.Builder getPersistBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPersistFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getPersistOrBuilder() {
      if (persistBuilder_ != null) {
        return persistBuilder_.getMessageOrBuilder();
      } else {
        return persist_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : persist_;
      }
    }
    /**
     * <pre>
     * Persist the purchase
     * </pre>
     *
     * <code>.google.protobuf.BoolValue persist = 3 [json_name = "persist"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getPersistFieldBuilder() {
      if (persistBuilder_ == null) {
        persistBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getPersist(),
                getParentForChildren(),
                isClean());
        persist_ = null;
      }
      return persistBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ValidatePurchaseHuaweiRequest)
  }

  // @@protoc_insertion_point(class_scope:nakama.api.ValidatePurchaseHuaweiRequest)
  private static final com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest();
  }

  public static com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatePurchaseHuaweiRequest>
      PARSER = new com.google.protobuf.AbstractParser<ValidatePurchaseHuaweiRequest>() {
    @java.lang.Override
    public ValidatePurchaseHuaweiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidatePurchaseHuaweiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatePurchaseHuaweiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

