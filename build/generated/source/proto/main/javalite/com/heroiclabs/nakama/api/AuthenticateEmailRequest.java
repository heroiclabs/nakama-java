// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Authenticate against the server with email+password.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AuthenticateEmailRequest}
 */
public  final class AuthenticateEmailRequest extends
    com.google.protobuf.GeneratedMessageLite<
        AuthenticateEmailRequest, AuthenticateEmailRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.AuthenticateEmailRequest)
    AuthenticateEmailRequestOrBuilder {
  private AuthenticateEmailRequest() {
    username_ = "";
  }
  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.heroiclabs.nakama.api.AccountEmail account_;
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  public com.heroiclabs.nakama.api.AccountEmail getAccount() {
    return account_ == null ? com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  private void setAccount(com.heroiclabs.nakama.api.AccountEmail value) {
    if (value == null) {
      throw new NullPointerException();
    }
    account_ = value;
    
    }
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  private void setAccount(
      com.heroiclabs.nakama.api.AccountEmail.Builder builderForValue) {
    account_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  private void mergeAccount(com.heroiclabs.nakama.api.AccountEmail value) {
    if (account_ != null &&
        account_ != com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance()) {
      account_ =
        com.heroiclabs.nakama.api.AccountEmail.newBuilder(account_).mergeFrom(value).buildPartial();
    } else {
      account_ = value;
    }
    
  }
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  private void clearAccount() {  account_ = null;
    
  }

  public static final int CREATE_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue create_;
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  public boolean hasCreate() {
    return create_ != null;
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  public com.google.protobuf.BoolValue getCreate() {
    return create_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : create_;
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  private void setCreate(com.google.protobuf.BoolValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    create_ = value;
    
    }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  private void setCreate(
      com.google.protobuf.BoolValue.Builder builderForValue) {
    create_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  private void mergeCreate(com.google.protobuf.BoolValue value) {
    if (create_ != null &&
        create_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
      create_ =
        com.google.protobuf.BoolValue.newBuilder(create_).mergeFrom(value).buildPartial();
    } else {
      create_ = value;
    }
    
  }
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  private void clearCreate() {  create_ = null;
    
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  private java.lang.String username_;
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  public java.lang.String getUsername() {
    return username_;
  }
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(username_);
  }
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  private void setUsername(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    username_ = value;
  }
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  private void clearUsername() {
    
    username_ = getDefaultInstance().getUsername();
  }
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  private void setUsernameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    username_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (account_ != null) {
      output.writeMessage(1, getAccount());
    }
    if (create_ != null) {
      output.writeMessage(2, getCreate());
    }
    if (!username_.isEmpty()) {
      output.writeString(3, getUsername());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccount());
    }
    if (create_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreate());
    }
    if (!username_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUsername());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.AuthenticateEmailRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Authenticate against the server with email+password.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AuthenticateEmailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.AuthenticateEmailRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AuthenticateEmailRequest)
      com.heroiclabs.nakama.api.AuthenticateEmailRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.AuthenticateEmailRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public boolean hasAccount() {
      return instance.hasAccount();
    }
    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public com.heroiclabs.nakama.api.AccountEmail getAccount() {
      return instance.getAccount();
    }
    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public Builder setAccount(com.heroiclabs.nakama.api.AccountEmail value) {
      copyOnWrite();
      instance.setAccount(value);
      return this;
      }
    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public Builder setAccount(
        com.heroiclabs.nakama.api.AccountEmail.Builder builderForValue) {
      copyOnWrite();
      instance.setAccount(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public Builder mergeAccount(com.heroiclabs.nakama.api.AccountEmail value) {
      copyOnWrite();
      instance.mergeAccount(value);
      return this;
    }
    /**
     * <pre>
     * The email account details.
     * </pre>
     *
     * <code>optional .nakama.api.AccountEmail account = 1;</code>
     */
    public Builder clearAccount() {  copyOnWrite();
      instance.clearAccount();
      return this;
    }

    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public boolean hasCreate() {
      return instance.hasCreate();
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public com.google.protobuf.BoolValue getCreate() {
      return instance.getCreate();
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public Builder setCreate(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.setCreate(value);
      return this;
      }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public Builder setCreate(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      copyOnWrite();
      instance.setCreate(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public Builder mergeCreate(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.mergeCreate(value);
      return this;
    }
    /**
     * <pre>
     * Register the account if the user does not already exist.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue create = 2;</code>
     */
    public Builder clearCreate() {  copyOnWrite();
      instance.clearCreate();
      return this;
    }

    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>optional string username = 3;</code>
     */
    public java.lang.String getUsername() {
      return instance.getUsername();
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>optional string username = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return instance.getUsernameBytes();
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>optional string username = 3;</code>
     */
    public Builder setUsername(
        java.lang.String value) {
      copyOnWrite();
      instance.setUsername(value);
      return this;
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>optional string username = 3;</code>
     */
    public Builder clearUsername() {
      copyOnWrite();
      instance.clearUsername();
      return this;
    }
    /**
     * <pre>
     * Set the username on the account at register. Must be unique.
     * </pre>
     *
     * <code>optional string username = 3;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUsernameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AuthenticateEmailRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.AuthenticateEmailRequest();
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
        com.heroiclabs.nakama.api.AuthenticateEmailRequest other = (com.heroiclabs.nakama.api.AuthenticateEmailRequest) arg1;
        account_ = visitor.visitMessage(account_, other.account_);
        create_ = visitor.visitMessage(create_, other.create_);
        username_ = visitor.visitString(!username_.isEmpty(), username_,
            !other.username_.isEmpty(), other.username_);
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
                com.heroiclabs.nakama.api.AccountEmail.Builder subBuilder = null;
                if (account_ != null) {
                  subBuilder = account_.toBuilder();
                }
                account_ = input.readMessage(com.heroiclabs.nakama.api.AccountEmail.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(account_);
                  account_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.protobuf.BoolValue.Builder subBuilder = null;
                if (create_ != null) {
                  subBuilder = create_.toBuilder();
                }
                create_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(create_);
                  create_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                username_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.AuthenticateEmailRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.AuthenticateEmailRequest)
  private static final com.heroiclabs.nakama.api.AuthenticateEmailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthenticateEmailRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.AuthenticateEmailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AuthenticateEmailRequest> PARSER;

  public static com.google.protobuf.Parser<AuthenticateEmailRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

