// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List realtime matches.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListMatchesRequest}
 */
public  final class ListMatchesRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListMatchesRequest, ListMatchesRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListMatchesRequest)
    ListMatchesRequestOrBuilder {
  private ListMatchesRequest() {
  }
  public static final int LIMIT_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void setLimit(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void setLimit(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void mergeLimit(com.google.protobuf.Int32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.Int32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Limit the number of returned matches.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int AUTHORITATIVE_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue authoritative_;
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  public boolean hasAuthoritative() {
    return authoritative_ != null;
  }
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  public com.google.protobuf.BoolValue getAuthoritative() {
    return authoritative_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : authoritative_;
  }
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  private void setAuthoritative(com.google.protobuf.BoolValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    authoritative_ = value;
    
    }
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  private void setAuthoritative(
      com.google.protobuf.BoolValue.Builder builderForValue) {
    authoritative_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  private void mergeAuthoritative(com.google.protobuf.BoolValue value) {
    if (authoritative_ != null &&
        authoritative_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
      authoritative_ =
        com.google.protobuf.BoolValue.newBuilder(authoritative_).mergeFrom(value).buildPartial();
    } else {
      authoritative_ = value;
    }
    
  }
  /**
   * <pre>
   * Authoritative or relayed matches.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
   */
  private void clearAuthoritative() {  authoritative_ = null;
    
  }

  public static final int LABEL_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue label_;
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  public com.google.protobuf.StringValue getLabel() {
    return label_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void setLabel(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    label_ = value;
    
    }
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void setLabel(
      com.google.protobuf.StringValue.Builder builderForValue) {
    label_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void mergeLabel(com.google.protobuf.StringValue value) {
    if (label_ != null &&
        label_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      label_ =
        com.google.protobuf.StringValue.newBuilder(label_).mergeFrom(value).buildPartial();
    } else {
      label_ = value;
    }
    
  }
  /**
   * <pre>
   * Label filter.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue label = 3;</code>
   */
  private void clearLabel() {  label_ = null;
    
  }

  public static final int MIN_SIZE_FIELD_NUMBER = 4;
  private com.google.protobuf.Int32Value minSize_;
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  public boolean hasMinSize() {
    return minSize_ != null;
  }
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  public com.google.protobuf.Int32Value getMinSize() {
    return minSize_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : minSize_;
  }
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  private void setMinSize(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    minSize_ = value;
    
    }
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  private void setMinSize(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    minSize_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  private void mergeMinSize(com.google.protobuf.Int32Value value) {
    if (minSize_ != null &&
        minSize_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      minSize_ =
        com.google.protobuf.Int32Value.newBuilder(minSize_).mergeFrom(value).buildPartial();
    } else {
      minSize_ = value;
    }
    
  }
  /**
   * <pre>
   * Minimum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
   */
  private void clearMinSize() {  minSize_ = null;
    
  }

  public static final int MAX_SIZE_FIELD_NUMBER = 5;
  private com.google.protobuf.Int32Value maxSize_;
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  public boolean hasMaxSize() {
    return maxSize_ != null;
  }
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  public com.google.protobuf.Int32Value getMaxSize() {
    return maxSize_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : maxSize_;
  }
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  private void setMaxSize(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    maxSize_ = value;
    
    }
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  private void setMaxSize(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    maxSize_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  private void mergeMaxSize(com.google.protobuf.Int32Value value) {
    if (maxSize_ != null &&
        maxSize_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      maxSize_ =
        com.google.protobuf.Int32Value.newBuilder(maxSize_).mergeFrom(value).buildPartial();
    } else {
      maxSize_ = value;
    }
    
  }
  /**
   * <pre>
   * Maximum user count.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
   */
  private void clearMaxSize() {  maxSize_ = null;
    
  }

  public static final int QUERY_FIELD_NUMBER = 6;
  private com.google.protobuf.StringValue query_;
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  public boolean hasQuery() {
    return query_ != null;
  }
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  public com.google.protobuf.StringValue getQuery() {
    return query_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : query_;
  }
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  private void setQuery(com.google.protobuf.StringValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    query_ = value;
    
    }
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  private void setQuery(
      com.google.protobuf.StringValue.Builder builderForValue) {
    query_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  private void mergeQuery(com.google.protobuf.StringValue value) {
    if (query_ != null &&
        query_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      query_ =
        com.google.protobuf.StringValue.newBuilder(query_).mergeFrom(value).buildPartial();
    } else {
      query_ = value;
    }
    
  }
  /**
   * <pre>
   * Arbitrary label query.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue query = 6;</code>
   */
  private void clearQuery() {  query_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (limit_ != null) {
      output.writeMessage(1, getLimit());
    }
    if (authoritative_ != null) {
      output.writeMessage(2, getAuthoritative());
    }
    if (label_ != null) {
      output.writeMessage(3, getLabel());
    }
    if (minSize_ != null) {
      output.writeMessage(4, getMinSize());
    }
    if (maxSize_ != null) {
      output.writeMessage(5, getMaxSize());
    }
    if (query_ != null) {
      output.writeMessage(6, getQuery());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLimit());
    }
    if (authoritative_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthoritative());
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLabel());
    }
    if (minSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMinSize());
    }
    if (maxSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMaxSize());
    }
    if (query_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getQuery());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListMatchesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListMatchesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List realtime matches.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListMatchesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListMatchesRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListMatchesRequest)
      com.heroiclabs.nakama.api.ListMatchesRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListMatchesRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public com.google.protobuf.Int32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Limit the number of returned matches.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public boolean hasAuthoritative() {
      return instance.hasAuthoritative();
    }
    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public com.google.protobuf.BoolValue getAuthoritative() {
      return instance.getAuthoritative();
    }
    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public Builder setAuthoritative(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.setAuthoritative(value);
      return this;
      }
    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public Builder setAuthoritative(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      copyOnWrite();
      instance.setAuthoritative(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public Builder mergeAuthoritative(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.mergeAuthoritative(value);
      return this;
    }
    /**
     * <pre>
     * Authoritative or relayed matches.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue authoritative = 2;</code>
     */
    public Builder clearAuthoritative() {  copyOnWrite();
      instance.clearAuthoritative();
      return this;
    }

    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public boolean hasLabel() {
      return instance.hasLabel();
    }
    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public com.google.protobuf.StringValue getLabel() {
      return instance.getLabel();
    }
    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setLabel(value);
      return this;
      }
    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder setLabel(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setLabel(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder mergeLabel(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeLabel(value);
      return this;
    }
    /**
     * <pre>
     * Label filter.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue label = 3;</code>
     */
    public Builder clearLabel() {  copyOnWrite();
      instance.clearLabel();
      return this;
    }

    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public boolean hasMinSize() {
      return instance.hasMinSize();
    }
    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public com.google.protobuf.Int32Value getMinSize() {
      return instance.getMinSize();
    }
    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public Builder setMinSize(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setMinSize(value);
      return this;
      }
    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public Builder setMinSize(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setMinSize(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public Builder mergeMinSize(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeMinSize(value);
      return this;
    }
    /**
     * <pre>
     * Minimum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value min_size = 4;</code>
     */
    public Builder clearMinSize() {  copyOnWrite();
      instance.clearMinSize();
      return this;
    }

    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public boolean hasMaxSize() {
      return instance.hasMaxSize();
    }
    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public com.google.protobuf.Int32Value getMaxSize() {
      return instance.getMaxSize();
    }
    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public Builder setMaxSize(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setMaxSize(value);
      return this;
      }
    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public Builder setMaxSize(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setMaxSize(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public Builder mergeMaxSize(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeMaxSize(value);
      return this;
    }
    /**
     * <pre>
     * Maximum user count.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value max_size = 5;</code>
     */
    public Builder clearMaxSize() {  copyOnWrite();
      instance.clearMaxSize();
      return this;
    }

    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public boolean hasQuery() {
      return instance.hasQuery();
    }
    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public com.google.protobuf.StringValue getQuery() {
      return instance.getQuery();
    }
    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public Builder setQuery(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setQuery(value);
      return this;
      }
    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public Builder setQuery(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setQuery(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public Builder mergeQuery(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeQuery(value);
      return this;
    }
    /**
     * <pre>
     * Arbitrary label query.
     * </pre>
     *
     * <code>optional .google.protobuf.StringValue query = 6;</code>
     */
    public Builder clearQuery() {  copyOnWrite();
      instance.clearQuery();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListMatchesRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListMatchesRequest();
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
        com.heroiclabs.nakama.api.ListMatchesRequest other = (com.heroiclabs.nakama.api.ListMatchesRequest) arg1;
        limit_ = visitor.visitMessage(limit_, other.limit_);
        authoritative_ = visitor.visitMessage(authoritative_, other.authoritative_);
        label_ = visitor.visitMessage(label_, other.label_);
        minSize_ = visitor.visitMessage(minSize_, other.minSize_);
        maxSize_ = visitor.visitMessage(maxSize_, other.maxSize_);
        query_ = visitor.visitMessage(query_, other.query_);
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
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.protobuf.BoolValue.Builder subBuilder = null;
                if (authoritative_ != null) {
                  subBuilder = authoritative_.toBuilder();
                }
                authoritative_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(authoritative_);
                  authoritative_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (label_ != null) {
                  subBuilder = label_.toBuilder();
                }
                label_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(label_);
                  label_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (minSize_ != null) {
                  subBuilder = minSize_.toBuilder();
                }
                minSize_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(minSize_);
                  minSize_ = subBuilder.buildPartial();
                }

                break;
              }
              case 42: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (maxSize_ != null) {
                  subBuilder = maxSize_.toBuilder();
                }
                maxSize_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(maxSize_);
                  maxSize_ = subBuilder.buildPartial();
                }

                break;
              }
              case 50: {
                com.google.protobuf.StringValue.Builder subBuilder = null;
                if (query_ != null) {
                  subBuilder = query_.toBuilder();
                }
                query_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(query_);
                  query_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListMatchesRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ListMatchesRequest)
  private static final com.heroiclabs.nakama.api.ListMatchesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListMatchesRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListMatchesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListMatchesRequest> PARSER;

  public static com.google.protobuf.Parser<ListMatchesRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

