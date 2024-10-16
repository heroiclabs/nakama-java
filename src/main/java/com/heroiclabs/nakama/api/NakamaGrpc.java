package com.heroiclabs.nakama.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * The Nakama RPC protocol service built with GRPC.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: github.com/heroiclabs/nakama/api/apigrpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NakamaGrpc {

  private NakamaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "nakama.api.Nakama";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddFriendsRequest,
      com.google.protobuf.Empty> getAddFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFriends",
      requestType = com.heroiclabs.nakama.api.AddFriendsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddFriendsRequest,
      com.google.protobuf.Empty> getAddFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddFriendsRequest, com.google.protobuf.Empty> getAddFriendsMethod;
    if ((getAddFriendsMethod = NakamaGrpc.getAddFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAddFriendsMethod = NakamaGrpc.getAddFriendsMethod) == null) {
          NakamaGrpc.getAddFriendsMethod = getAddFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AddFriendsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AddFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AddFriends"))
              .build();
        }
      }
    }
    return getAddFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddGroupUsersRequest,
      com.google.protobuf.Empty> getAddGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGroupUsers",
      requestType = com.heroiclabs.nakama.api.AddGroupUsersRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddGroupUsersRequest,
      com.google.protobuf.Empty> getAddGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AddGroupUsersRequest, com.google.protobuf.Empty> getAddGroupUsersMethod;
    if ((getAddGroupUsersMethod = NakamaGrpc.getAddGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAddGroupUsersMethod = NakamaGrpc.getAddGroupUsersMethod) == null) {
          NakamaGrpc.getAddGroupUsersMethod = getAddGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AddGroupUsersRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AddGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AddGroupUsers"))
              .build();
        }
      }
    }
    return getAddGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionRefreshRequest,
      com.heroiclabs.nakama.api.Session> getSessionRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionRefresh",
      requestType = com.heroiclabs.nakama.api.SessionRefreshRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionRefreshRequest,
      com.heroiclabs.nakama.api.Session> getSessionRefreshMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionRefreshRequest, com.heroiclabs.nakama.api.Session> getSessionRefreshMethod;
    if ((getSessionRefreshMethod = NakamaGrpc.getSessionRefreshMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getSessionRefreshMethod = NakamaGrpc.getSessionRefreshMethod) == null) {
          NakamaGrpc.getSessionRefreshMethod = getSessionRefreshMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.SessionRefreshRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionRefresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.SessionRefreshRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("SessionRefresh"))
              .build();
        }
      }
    }
    return getSessionRefreshMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionLogoutRequest,
      com.google.protobuf.Empty> getSessionLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionLogout",
      requestType = com.heroiclabs.nakama.api.SessionLogoutRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionLogoutRequest,
      com.google.protobuf.Empty> getSessionLogoutMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.SessionLogoutRequest, com.google.protobuf.Empty> getSessionLogoutMethod;
    if ((getSessionLogoutMethod = NakamaGrpc.getSessionLogoutMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getSessionLogoutMethod = NakamaGrpc.getSessionLogoutMethod) == null) {
          NakamaGrpc.getSessionLogoutMethod = getSessionLogoutMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.SessionLogoutRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.SessionLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("SessionLogout"))
              .build();
        }
      }
    }
    return getSessionLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateAppleRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateApple",
      requestType = com.heroiclabs.nakama.api.AuthenticateAppleRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateAppleRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateAppleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateAppleRequest, com.heroiclabs.nakama.api.Session> getAuthenticateAppleMethod;
    if ((getAuthenticateAppleMethod = NakamaGrpc.getAuthenticateAppleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateAppleMethod = NakamaGrpc.getAuthenticateAppleMethod) == null) {
          NakamaGrpc.getAuthenticateAppleMethod = getAuthenticateAppleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateAppleRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateAppleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateApple"))
              .build();
        }
      }
    }
    return getAuthenticateAppleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateCustomRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateCustom",
      requestType = com.heroiclabs.nakama.api.AuthenticateCustomRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateCustomRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateCustomMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateCustomRequest, com.heroiclabs.nakama.api.Session> getAuthenticateCustomMethod;
    if ((getAuthenticateCustomMethod = NakamaGrpc.getAuthenticateCustomMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateCustomMethod = NakamaGrpc.getAuthenticateCustomMethod) == null) {
          NakamaGrpc.getAuthenticateCustomMethod = getAuthenticateCustomMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateCustomRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateCustom"))
              .build();
        }
      }
    }
    return getAuthenticateCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateDeviceRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateDevice",
      requestType = com.heroiclabs.nakama.api.AuthenticateDeviceRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateDeviceRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateDeviceMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateDeviceRequest, com.heroiclabs.nakama.api.Session> getAuthenticateDeviceMethod;
    if ((getAuthenticateDeviceMethod = NakamaGrpc.getAuthenticateDeviceMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateDeviceMethod = NakamaGrpc.getAuthenticateDeviceMethod) == null) {
          NakamaGrpc.getAuthenticateDeviceMethod = getAuthenticateDeviceMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateDeviceRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateDevice"))
              .build();
        }
      }
    }
    return getAuthenticateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateEmailRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateEmail",
      requestType = com.heroiclabs.nakama.api.AuthenticateEmailRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateEmailRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateEmailMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateEmailRequest, com.heroiclabs.nakama.api.Session> getAuthenticateEmailMethod;
    if ((getAuthenticateEmailMethod = NakamaGrpc.getAuthenticateEmailMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateEmailMethod = NakamaGrpc.getAuthenticateEmailMethod) == null) {
          NakamaGrpc.getAuthenticateEmailMethod = getAuthenticateEmailMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateEmailRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateEmail"))
              .build();
        }
      }
    }
    return getAuthenticateEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateFacebookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateFacebook",
      requestType = com.heroiclabs.nakama.api.AuthenticateFacebookRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateFacebookMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookRequest, com.heroiclabs.nakama.api.Session> getAuthenticateFacebookMethod;
    if ((getAuthenticateFacebookMethod = NakamaGrpc.getAuthenticateFacebookMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateFacebookMethod = NakamaGrpc.getAuthenticateFacebookMethod) == null) {
          NakamaGrpc.getAuthenticateFacebookMethod = getAuthenticateFacebookMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateFacebookRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateFacebookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateFacebook"))
              .build();
        }
      }
    }
    return getAuthenticateFacebookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateFacebookInstantGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateFacebookInstantGame",
      requestType = com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateFacebookInstantGameMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest, com.heroiclabs.nakama.api.Session> getAuthenticateFacebookInstantGameMethod;
    if ((getAuthenticateFacebookInstantGameMethod = NakamaGrpc.getAuthenticateFacebookInstantGameMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateFacebookInstantGameMethod = NakamaGrpc.getAuthenticateFacebookInstantGameMethod) == null) {
          NakamaGrpc.getAuthenticateFacebookInstantGameMethod = getAuthenticateFacebookInstantGameMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateFacebookInstantGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateFacebookInstantGame"))
              .build();
        }
      }
    }
    return getAuthenticateFacebookInstantGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGameCenterRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateGameCenterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateGameCenter",
      requestType = com.heroiclabs.nakama.api.AuthenticateGameCenterRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGameCenterRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateGameCenterMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGameCenterRequest, com.heroiclabs.nakama.api.Session> getAuthenticateGameCenterMethod;
    if ((getAuthenticateGameCenterMethod = NakamaGrpc.getAuthenticateGameCenterMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateGameCenterMethod = NakamaGrpc.getAuthenticateGameCenterMethod) == null) {
          NakamaGrpc.getAuthenticateGameCenterMethod = getAuthenticateGameCenterMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateGameCenterRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateGameCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateGameCenter"))
              .build();
        }
      }
    }
    return getAuthenticateGameCenterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGoogleRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateGoogleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateGoogle",
      requestType = com.heroiclabs.nakama.api.AuthenticateGoogleRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGoogleRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateGoogleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateGoogleRequest, com.heroiclabs.nakama.api.Session> getAuthenticateGoogleMethod;
    if ((getAuthenticateGoogleMethod = NakamaGrpc.getAuthenticateGoogleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateGoogleMethod = NakamaGrpc.getAuthenticateGoogleMethod) == null) {
          NakamaGrpc.getAuthenticateGoogleMethod = getAuthenticateGoogleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateGoogleRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateGoogleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateGoogle"))
              .build();
        }
      }
    }
    return getAuthenticateGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateSteamRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateSteamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateSteam",
      requestType = com.heroiclabs.nakama.api.AuthenticateSteamRequest.class,
      responseType = com.heroiclabs.nakama.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateSteamRequest,
      com.heroiclabs.nakama.api.Session> getAuthenticateSteamMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AuthenticateSteamRequest, com.heroiclabs.nakama.api.Session> getAuthenticateSteamMethod;
    if ((getAuthenticateSteamMethod = NakamaGrpc.getAuthenticateSteamMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getAuthenticateSteamMethod = NakamaGrpc.getAuthenticateSteamMethod) == null) {
          NakamaGrpc.getAuthenticateSteamMethod = getAuthenticateSteamMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AuthenticateSteamRequest, com.heroiclabs.nakama.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateSteamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("AuthenticateSteam"))
              .build();
        }
      }
    }
    return getAuthenticateSteamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BanGroupUsersRequest,
      com.google.protobuf.Empty> getBanGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BanGroupUsers",
      requestType = com.heroiclabs.nakama.api.BanGroupUsersRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BanGroupUsersRequest,
      com.google.protobuf.Empty> getBanGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BanGroupUsersRequest, com.google.protobuf.Empty> getBanGroupUsersMethod;
    if ((getBanGroupUsersMethod = NakamaGrpc.getBanGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getBanGroupUsersMethod = NakamaGrpc.getBanGroupUsersMethod) == null) {
          NakamaGrpc.getBanGroupUsersMethod = getBanGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.BanGroupUsersRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BanGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.BanGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("BanGroupUsers"))
              .build();
        }
      }
    }
    return getBanGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BlockFriendsRequest,
      com.google.protobuf.Empty> getBlockFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockFriends",
      requestType = com.heroiclabs.nakama.api.BlockFriendsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BlockFriendsRequest,
      com.google.protobuf.Empty> getBlockFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.BlockFriendsRequest, com.google.protobuf.Empty> getBlockFriendsMethod;
    if ((getBlockFriendsMethod = NakamaGrpc.getBlockFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getBlockFriendsMethod = NakamaGrpc.getBlockFriendsMethod) == null) {
          NakamaGrpc.getBlockFriendsMethod = getBlockFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.BlockFriendsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.BlockFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("BlockFriends"))
              .build();
        }
      }
    }
    return getBlockFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.CreateGroupRequest,
      com.heroiclabs.nakama.api.Group> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = com.heroiclabs.nakama.api.CreateGroupRequest.class,
      responseType = com.heroiclabs.nakama.api.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.CreateGroupRequest,
      com.heroiclabs.nakama.api.Group> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.CreateGroupRequest, com.heroiclabs.nakama.api.Group> getCreateGroupMethod;
    if ((getCreateGroupMethod = NakamaGrpc.getCreateGroupMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getCreateGroupMethod = NakamaGrpc.getCreateGroupMethod) == null) {
          NakamaGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.CreateGroupRequest, com.heroiclabs.nakama.api.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.CreateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Group.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = NakamaGrpc.getDeleteAccountMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteAccountMethod = NakamaGrpc.getDeleteAccountMethod) == null) {
          NakamaGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteFriendsRequest,
      com.google.protobuf.Empty> getDeleteFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFriends",
      requestType = com.heroiclabs.nakama.api.DeleteFriendsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteFriendsRequest,
      com.google.protobuf.Empty> getDeleteFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteFriendsRequest, com.google.protobuf.Empty> getDeleteFriendsMethod;
    if ((getDeleteFriendsMethod = NakamaGrpc.getDeleteFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteFriendsMethod = NakamaGrpc.getDeleteFriendsMethod) == null) {
          NakamaGrpc.getDeleteFriendsMethod = getDeleteFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteFriendsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteFriends"))
              .build();
        }
      }
    }
    return getDeleteFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteGroupRequest,
      com.google.protobuf.Empty> getDeleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroup",
      requestType = com.heroiclabs.nakama.api.DeleteGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteGroupRequest,
      com.google.protobuf.Empty> getDeleteGroupMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteGroupRequest, com.google.protobuf.Empty> getDeleteGroupMethod;
    if ((getDeleteGroupMethod = NakamaGrpc.getDeleteGroupMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteGroupMethod = NakamaGrpc.getDeleteGroupMethod) == null) {
          NakamaGrpc.getDeleteGroupMethod = getDeleteGroupMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteGroup"))
              .build();
        }
      }
    }
    return getDeleteGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest,
      com.google.protobuf.Empty> getDeleteLeaderboardRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLeaderboardRecord",
      requestType = com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest,
      com.google.protobuf.Empty> getDeleteLeaderboardRecordMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest, com.google.protobuf.Empty> getDeleteLeaderboardRecordMethod;
    if ((getDeleteLeaderboardRecordMethod = NakamaGrpc.getDeleteLeaderboardRecordMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteLeaderboardRecordMethod = NakamaGrpc.getDeleteLeaderboardRecordMethod) == null) {
          NakamaGrpc.getDeleteLeaderboardRecordMethod = getDeleteLeaderboardRecordMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLeaderboardRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteLeaderboardRecord"))
              .build();
        }
      }
    }
    return getDeleteLeaderboardRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteNotificationsRequest,
      com.google.protobuf.Empty> getDeleteNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotifications",
      requestType = com.heroiclabs.nakama.api.DeleteNotificationsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteNotificationsRequest,
      com.google.protobuf.Empty> getDeleteNotificationsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteNotificationsRequest, com.google.protobuf.Empty> getDeleteNotificationsMethod;
    if ((getDeleteNotificationsMethod = NakamaGrpc.getDeleteNotificationsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteNotificationsMethod = NakamaGrpc.getDeleteNotificationsMethod) == null) {
          NakamaGrpc.getDeleteNotificationsMethod = getDeleteNotificationsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteNotificationsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteNotifications"))
              .build();
        }
      }
    }
    return getDeleteNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteTournamentRecordRequest,
      com.google.protobuf.Empty> getDeleteTournamentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTournamentRecord",
      requestType = com.heroiclabs.nakama.api.DeleteTournamentRecordRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteTournamentRecordRequest,
      com.google.protobuf.Empty> getDeleteTournamentRecordMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteTournamentRecordRequest, com.google.protobuf.Empty> getDeleteTournamentRecordMethod;
    if ((getDeleteTournamentRecordMethod = NakamaGrpc.getDeleteTournamentRecordMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteTournamentRecordMethod = NakamaGrpc.getDeleteTournamentRecordMethod) == null) {
          NakamaGrpc.getDeleteTournamentRecordMethod = getDeleteTournamentRecordMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteTournamentRecordRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTournamentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteTournamentRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteTournamentRecord"))
              .build();
        }
      }
    }
    return getDeleteTournamentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteStorageObjectsRequest,
      com.google.protobuf.Empty> getDeleteStorageObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStorageObjects",
      requestType = com.heroiclabs.nakama.api.DeleteStorageObjectsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteStorageObjectsRequest,
      com.google.protobuf.Empty> getDeleteStorageObjectsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DeleteStorageObjectsRequest, com.google.protobuf.Empty> getDeleteStorageObjectsMethod;
    if ((getDeleteStorageObjectsMethod = NakamaGrpc.getDeleteStorageObjectsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDeleteStorageObjectsMethod = NakamaGrpc.getDeleteStorageObjectsMethod) == null) {
          NakamaGrpc.getDeleteStorageObjectsMethod = getDeleteStorageObjectsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DeleteStorageObjectsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DeleteStorageObjects"))
              .build();
        }
      }
    }
    return getDeleteStorageObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Event,
      com.google.protobuf.Empty> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = com.heroiclabs.nakama.api.Event.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Event,
      com.google.protobuf.Empty> getEventMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Event, com.google.protobuf.Empty> getEventMethod;
    if ((getEventMethod = NakamaGrpc.getEventMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getEventMethod = NakamaGrpc.getEventMethod) == null) {
          NakamaGrpc.getEventMethod = getEventMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.Event, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("Event"))
              .build();
        }
      }
    }
    return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.nakama.api.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.heroiclabs.nakama.api.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.nakama.api.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.heroiclabs.nakama.api.Account> getGetAccountMethod;
    if ((getGetAccountMethod = NakamaGrpc.getGetAccountMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getGetAccountMethod = NakamaGrpc.getGetAccountMethod) == null) {
          NakamaGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.heroiclabs.nakama.api.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Account.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetUsersRequest,
      com.heroiclabs.nakama.api.Users> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = com.heroiclabs.nakama.api.GetUsersRequest.class,
      responseType = com.heroiclabs.nakama.api.Users.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetUsersRequest,
      com.heroiclabs.nakama.api.Users> getGetUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetUsersRequest, com.heroiclabs.nakama.api.Users> getGetUsersMethod;
    if ((getGetUsersMethod = NakamaGrpc.getGetUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getGetUsersMethod = NakamaGrpc.getGetUsersMethod) == null) {
          NakamaGrpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.GetUsersRequest, com.heroiclabs.nakama.api.Users>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.GetUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Users.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("GetUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetSubscriptionRequest,
      com.heroiclabs.nakama.api.ValidatedSubscription> getGetSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubscription",
      requestType = com.heroiclabs.nakama.api.GetSubscriptionRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidatedSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetSubscriptionRequest,
      com.heroiclabs.nakama.api.ValidatedSubscription> getGetSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.GetSubscriptionRequest, com.heroiclabs.nakama.api.ValidatedSubscription> getGetSubscriptionMethod;
    if ((getGetSubscriptionMethod = NakamaGrpc.getGetSubscriptionMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getGetSubscriptionMethod = NakamaGrpc.getGetSubscriptionMethod) == null) {
          NakamaGrpc.getGetSubscriptionMethod = getGetSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.GetSubscriptionRequest, com.heroiclabs.nakama.api.ValidatedSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.GetSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatedSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("GetSubscription"))
              .build();
        }
      }
    }
    return getGetSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.nakama.api.MatchmakerStats> getGetMatchmakerStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMatchmakerStats",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.heroiclabs.nakama.api.MatchmakerStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.nakama.api.MatchmakerStats> getGetMatchmakerStatsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.heroiclabs.nakama.api.MatchmakerStats> getGetMatchmakerStatsMethod;
    if ((getGetMatchmakerStatsMethod = NakamaGrpc.getGetMatchmakerStatsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getGetMatchmakerStatsMethod = NakamaGrpc.getGetMatchmakerStatsMethod) == null) {
          NakamaGrpc.getGetMatchmakerStatsMethod = getGetMatchmakerStatsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.heroiclabs.nakama.api.MatchmakerStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMatchmakerStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.MatchmakerStats.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("GetMatchmakerStats"))
              .build();
        }
      }
    }
    return getGetMatchmakerStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getHealthcheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Healthcheck",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getHealthcheckMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getHealthcheckMethod;
    if ((getHealthcheckMethod = NakamaGrpc.getHealthcheckMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getHealthcheckMethod = NakamaGrpc.getHealthcheckMethod) == null) {
          NakamaGrpc.getHealthcheckMethod = getHealthcheckMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Healthcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("Healthcheck"))
              .build();
        }
      }
    }
    return getHealthcheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportFacebookFriendsRequest,
      com.google.protobuf.Empty> getImportFacebookFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportFacebookFriends",
      requestType = com.heroiclabs.nakama.api.ImportFacebookFriendsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportFacebookFriendsRequest,
      com.google.protobuf.Empty> getImportFacebookFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportFacebookFriendsRequest, com.google.protobuf.Empty> getImportFacebookFriendsMethod;
    if ((getImportFacebookFriendsMethod = NakamaGrpc.getImportFacebookFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getImportFacebookFriendsMethod = NakamaGrpc.getImportFacebookFriendsMethod) == null) {
          NakamaGrpc.getImportFacebookFriendsMethod = getImportFacebookFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ImportFacebookFriendsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFacebookFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ImportFacebookFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ImportFacebookFriends"))
              .build();
        }
      }
    }
    return getImportFacebookFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportSteamFriendsRequest,
      com.google.protobuf.Empty> getImportSteamFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportSteamFriends",
      requestType = com.heroiclabs.nakama.api.ImportSteamFriendsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportSteamFriendsRequest,
      com.google.protobuf.Empty> getImportSteamFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ImportSteamFriendsRequest, com.google.protobuf.Empty> getImportSteamFriendsMethod;
    if ((getImportSteamFriendsMethod = NakamaGrpc.getImportSteamFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getImportSteamFriendsMethod = NakamaGrpc.getImportSteamFriendsMethod) == null) {
          NakamaGrpc.getImportSteamFriendsMethod = getImportSteamFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ImportSteamFriendsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportSteamFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ImportSteamFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ImportSteamFriends"))
              .build();
        }
      }
    }
    return getImportSteamFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinGroupRequest,
      com.google.protobuf.Empty> getJoinGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGroup",
      requestType = com.heroiclabs.nakama.api.JoinGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinGroupRequest,
      com.google.protobuf.Empty> getJoinGroupMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinGroupRequest, com.google.protobuf.Empty> getJoinGroupMethod;
    if ((getJoinGroupMethod = NakamaGrpc.getJoinGroupMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getJoinGroupMethod = NakamaGrpc.getJoinGroupMethod) == null) {
          NakamaGrpc.getJoinGroupMethod = getJoinGroupMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.JoinGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.JoinGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("JoinGroup"))
              .build();
        }
      }
    }
    return getJoinGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinTournamentRequest,
      com.google.protobuf.Empty> getJoinTournamentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinTournament",
      requestType = com.heroiclabs.nakama.api.JoinTournamentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinTournamentRequest,
      com.google.protobuf.Empty> getJoinTournamentMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.JoinTournamentRequest, com.google.protobuf.Empty> getJoinTournamentMethod;
    if ((getJoinTournamentMethod = NakamaGrpc.getJoinTournamentMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getJoinTournamentMethod = NakamaGrpc.getJoinTournamentMethod) == null) {
          NakamaGrpc.getJoinTournamentMethod = getJoinTournamentMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.JoinTournamentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinTournament"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.JoinTournamentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("JoinTournament"))
              .build();
        }
      }
    }
    return getJoinTournamentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.KickGroupUsersRequest,
      com.google.protobuf.Empty> getKickGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KickGroupUsers",
      requestType = com.heroiclabs.nakama.api.KickGroupUsersRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.KickGroupUsersRequest,
      com.google.protobuf.Empty> getKickGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.KickGroupUsersRequest, com.google.protobuf.Empty> getKickGroupUsersMethod;
    if ((getKickGroupUsersMethod = NakamaGrpc.getKickGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getKickGroupUsersMethod = NakamaGrpc.getKickGroupUsersMethod) == null) {
          NakamaGrpc.getKickGroupUsersMethod = getKickGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.KickGroupUsersRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KickGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.KickGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("KickGroupUsers"))
              .build();
        }
      }
    }
    return getKickGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LeaveGroupRequest,
      com.google.protobuf.Empty> getLeaveGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaveGroup",
      requestType = com.heroiclabs.nakama.api.LeaveGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LeaveGroupRequest,
      com.google.protobuf.Empty> getLeaveGroupMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LeaveGroupRequest, com.google.protobuf.Empty> getLeaveGroupMethod;
    if ((getLeaveGroupMethod = NakamaGrpc.getLeaveGroupMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLeaveGroupMethod = NakamaGrpc.getLeaveGroupMethod) == null) {
          NakamaGrpc.getLeaveGroupMethod = getLeaveGroupMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.LeaveGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaveGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaveGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LeaveGroup"))
              .build();
        }
      }
    }
    return getLeaveGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple,
      com.google.protobuf.Empty> getLinkAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkApple",
      requestType = com.heroiclabs.nakama.api.AccountApple.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple,
      com.google.protobuf.Empty> getLinkAppleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple, com.google.protobuf.Empty> getLinkAppleMethod;
    if ((getLinkAppleMethod = NakamaGrpc.getLinkAppleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkAppleMethod = NakamaGrpc.getLinkAppleMethod) == null) {
          NakamaGrpc.getLinkAppleMethod = getLinkAppleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountApple, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountApple.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkApple"))
              .build();
        }
      }
    }
    return getLinkAppleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom,
      com.google.protobuf.Empty> getLinkCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkCustom",
      requestType = com.heroiclabs.nakama.api.AccountCustom.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom,
      com.google.protobuf.Empty> getLinkCustomMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom, com.google.protobuf.Empty> getLinkCustomMethod;
    if ((getLinkCustomMethod = NakamaGrpc.getLinkCustomMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkCustomMethod = NakamaGrpc.getLinkCustomMethod) == null) {
          NakamaGrpc.getLinkCustomMethod = getLinkCustomMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountCustom, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkCustom"))
              .build();
        }
      }
    }
    return getLinkCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice,
      com.google.protobuf.Empty> getLinkDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkDevice",
      requestType = com.heroiclabs.nakama.api.AccountDevice.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice,
      com.google.protobuf.Empty> getLinkDeviceMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice, com.google.protobuf.Empty> getLinkDeviceMethod;
    if ((getLinkDeviceMethod = NakamaGrpc.getLinkDeviceMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkDeviceMethod = NakamaGrpc.getLinkDeviceMethod) == null) {
          NakamaGrpc.getLinkDeviceMethod = getLinkDeviceMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountDevice, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountDevice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkDevice"))
              .build();
        }
      }
    }
    return getLinkDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail,
      com.google.protobuf.Empty> getLinkEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkEmail",
      requestType = com.heroiclabs.nakama.api.AccountEmail.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail,
      com.google.protobuf.Empty> getLinkEmailMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail, com.google.protobuf.Empty> getLinkEmailMethod;
    if ((getLinkEmailMethod = NakamaGrpc.getLinkEmailMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkEmailMethod = NakamaGrpc.getLinkEmailMethod) == null) {
          NakamaGrpc.getLinkEmailMethod = getLinkEmailMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountEmail, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkEmail"))
              .build();
        }
      }
    }
    return getLinkEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkFacebookRequest,
      com.google.protobuf.Empty> getLinkFacebookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkFacebook",
      requestType = com.heroiclabs.nakama.api.LinkFacebookRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkFacebookRequest,
      com.google.protobuf.Empty> getLinkFacebookMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkFacebookRequest, com.google.protobuf.Empty> getLinkFacebookMethod;
    if ((getLinkFacebookMethod = NakamaGrpc.getLinkFacebookMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkFacebookMethod = NakamaGrpc.getLinkFacebookMethod) == null) {
          NakamaGrpc.getLinkFacebookMethod = getLinkFacebookMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.LinkFacebookRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LinkFacebookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkFacebook"))
              .build();
        }
      }
    }
    return getLinkFacebookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame,
      com.google.protobuf.Empty> getLinkFacebookInstantGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkFacebookInstantGame",
      requestType = com.heroiclabs.nakama.api.AccountFacebookInstantGame.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame,
      com.google.protobuf.Empty> getLinkFacebookInstantGameMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame, com.google.protobuf.Empty> getLinkFacebookInstantGameMethod;
    if ((getLinkFacebookInstantGameMethod = NakamaGrpc.getLinkFacebookInstantGameMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkFacebookInstantGameMethod = NakamaGrpc.getLinkFacebookInstantGameMethod) == null) {
          NakamaGrpc.getLinkFacebookInstantGameMethod = getLinkFacebookInstantGameMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountFacebookInstantGame, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkFacebookInstantGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountFacebookInstantGame.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkFacebookInstantGame"))
              .build();
        }
      }
    }
    return getLinkFacebookInstantGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter,
      com.google.protobuf.Empty> getLinkGameCenterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkGameCenter",
      requestType = com.heroiclabs.nakama.api.AccountGameCenter.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter,
      com.google.protobuf.Empty> getLinkGameCenterMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter, com.google.protobuf.Empty> getLinkGameCenterMethod;
    if ((getLinkGameCenterMethod = NakamaGrpc.getLinkGameCenterMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkGameCenterMethod = NakamaGrpc.getLinkGameCenterMethod) == null) {
          NakamaGrpc.getLinkGameCenterMethod = getLinkGameCenterMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountGameCenter, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGameCenter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkGameCenter"))
              .build();
        }
      }
    }
    return getLinkGameCenterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle,
      com.google.protobuf.Empty> getLinkGoogleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkGoogle",
      requestType = com.heroiclabs.nakama.api.AccountGoogle.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle,
      com.google.protobuf.Empty> getLinkGoogleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle, com.google.protobuf.Empty> getLinkGoogleMethod;
    if ((getLinkGoogleMethod = NakamaGrpc.getLinkGoogleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkGoogleMethod = NakamaGrpc.getLinkGoogleMethod) == null) {
          NakamaGrpc.getLinkGoogleMethod = getLinkGoogleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountGoogle, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGoogle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkGoogle"))
              .build();
        }
      }
    }
    return getLinkGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkSteamRequest,
      com.google.protobuf.Empty> getLinkSteamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkSteam",
      requestType = com.heroiclabs.nakama.api.LinkSteamRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkSteamRequest,
      com.google.protobuf.Empty> getLinkSteamMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.LinkSteamRequest, com.google.protobuf.Empty> getLinkSteamMethod;
    if ((getLinkSteamMethod = NakamaGrpc.getLinkSteamMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkSteamMethod = NakamaGrpc.getLinkSteamMethod) == null) {
          NakamaGrpc.getLinkSteamMethod = getLinkSteamMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.LinkSteamRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinkSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LinkSteamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("LinkSteam"))
              .build();
        }
      }
    }
    return getLinkSteamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListChannelMessagesRequest,
      com.heroiclabs.nakama.api.ChannelMessageList> getListChannelMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListChannelMessages",
      requestType = com.heroiclabs.nakama.api.ListChannelMessagesRequest.class,
      responseType = com.heroiclabs.nakama.api.ChannelMessageList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListChannelMessagesRequest,
      com.heroiclabs.nakama.api.ChannelMessageList> getListChannelMessagesMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListChannelMessagesRequest, com.heroiclabs.nakama.api.ChannelMessageList> getListChannelMessagesMethod;
    if ((getListChannelMessagesMethod = NakamaGrpc.getListChannelMessagesMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListChannelMessagesMethod = NakamaGrpc.getListChannelMessagesMethod) == null) {
          NakamaGrpc.getListChannelMessagesMethod = getListChannelMessagesMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListChannelMessagesRequest, com.heroiclabs.nakama.api.ChannelMessageList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListChannelMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListChannelMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ChannelMessageList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListChannelMessages"))
              .build();
        }
      }
    }
    return getListChannelMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsRequest,
      com.heroiclabs.nakama.api.FriendList> getListFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFriends",
      requestType = com.heroiclabs.nakama.api.ListFriendsRequest.class,
      responseType = com.heroiclabs.nakama.api.FriendList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsRequest,
      com.heroiclabs.nakama.api.FriendList> getListFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsRequest, com.heroiclabs.nakama.api.FriendList> getListFriendsMethod;
    if ((getListFriendsMethod = NakamaGrpc.getListFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListFriendsMethod = NakamaGrpc.getListFriendsMethod) == null) {
          NakamaGrpc.getListFriendsMethod = getListFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListFriendsRequest, com.heroiclabs.nakama.api.FriendList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.FriendList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListFriends"))
              .build();
        }
      }
    }
    return getListFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest,
      com.heroiclabs.nakama.api.FriendsOfFriendsList> getListFriendsOfFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFriendsOfFriends",
      requestType = com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest.class,
      responseType = com.heroiclabs.nakama.api.FriendsOfFriendsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest,
      com.heroiclabs.nakama.api.FriendsOfFriendsList> getListFriendsOfFriendsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest, com.heroiclabs.nakama.api.FriendsOfFriendsList> getListFriendsOfFriendsMethod;
    if ((getListFriendsOfFriendsMethod = NakamaGrpc.getListFriendsOfFriendsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListFriendsOfFriendsMethod = NakamaGrpc.getListFriendsOfFriendsMethod) == null) {
          NakamaGrpc.getListFriendsOfFriendsMethod = getListFriendsOfFriendsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest, com.heroiclabs.nakama.api.FriendsOfFriendsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFriendsOfFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.FriendsOfFriendsList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListFriendsOfFriends"))
              .build();
        }
      }
    }
    return getListFriendsOfFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupsRequest,
      com.heroiclabs.nakama.api.GroupList> getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroups",
      requestType = com.heroiclabs.nakama.api.ListGroupsRequest.class,
      responseType = com.heroiclabs.nakama.api.GroupList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupsRequest,
      com.heroiclabs.nakama.api.GroupList> getListGroupsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupsRequest, com.heroiclabs.nakama.api.GroupList> getListGroupsMethod;
    if ((getListGroupsMethod = NakamaGrpc.getListGroupsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListGroupsMethod = NakamaGrpc.getListGroupsMethod) == null) {
          NakamaGrpc.getListGroupsMethod = getListGroupsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListGroupsRequest, com.heroiclabs.nakama.api.GroupList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.GroupList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListGroups"))
              .build();
        }
      }
    }
    return getListGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupUsersRequest,
      com.heroiclabs.nakama.api.GroupUserList> getListGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroupUsers",
      requestType = com.heroiclabs.nakama.api.ListGroupUsersRequest.class,
      responseType = com.heroiclabs.nakama.api.GroupUserList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupUsersRequest,
      com.heroiclabs.nakama.api.GroupUserList> getListGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListGroupUsersRequest, com.heroiclabs.nakama.api.GroupUserList> getListGroupUsersMethod;
    if ((getListGroupUsersMethod = NakamaGrpc.getListGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListGroupUsersMethod = NakamaGrpc.getListGroupUsersMethod) == null) {
          NakamaGrpc.getListGroupUsersMethod = getListGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListGroupUsersRequest, com.heroiclabs.nakama.api.GroupUserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.GroupUserList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListGroupUsers"))
              .build();
        }
      }
    }
    return getListGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest,
      com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLeaderboardRecords",
      requestType = com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest.class,
      responseType = com.heroiclabs.nakama.api.LeaderboardRecordList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest,
      com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest, com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsMethod;
    if ((getListLeaderboardRecordsMethod = NakamaGrpc.getListLeaderboardRecordsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListLeaderboardRecordsMethod = NakamaGrpc.getListLeaderboardRecordsMethod) == null) {
          NakamaGrpc.getListLeaderboardRecordsMethod = getListLeaderboardRecordsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest, com.heroiclabs.nakama.api.LeaderboardRecordList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLeaderboardRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecordList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListLeaderboardRecords"))
              .build();
        }
      }
    }
    return getListLeaderboardRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest,
      com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsAroundOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLeaderboardRecordsAroundOwner",
      requestType = com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest.class,
      responseType = com.heroiclabs.nakama.api.LeaderboardRecordList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest,
      com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsAroundOwnerMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest, com.heroiclabs.nakama.api.LeaderboardRecordList> getListLeaderboardRecordsAroundOwnerMethod;
    if ((getListLeaderboardRecordsAroundOwnerMethod = NakamaGrpc.getListLeaderboardRecordsAroundOwnerMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListLeaderboardRecordsAroundOwnerMethod = NakamaGrpc.getListLeaderboardRecordsAroundOwnerMethod) == null) {
          NakamaGrpc.getListLeaderboardRecordsAroundOwnerMethod = getListLeaderboardRecordsAroundOwnerMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest, com.heroiclabs.nakama.api.LeaderboardRecordList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLeaderboardRecordsAroundOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecordList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListLeaderboardRecordsAroundOwner"))
              .build();
        }
      }
    }
    return getListLeaderboardRecordsAroundOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListMatchesRequest,
      com.heroiclabs.nakama.api.MatchList> getListMatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMatches",
      requestType = com.heroiclabs.nakama.api.ListMatchesRequest.class,
      responseType = com.heroiclabs.nakama.api.MatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListMatchesRequest,
      com.heroiclabs.nakama.api.MatchList> getListMatchesMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListMatchesRequest, com.heroiclabs.nakama.api.MatchList> getListMatchesMethod;
    if ((getListMatchesMethod = NakamaGrpc.getListMatchesMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListMatchesMethod = NakamaGrpc.getListMatchesMethod) == null) {
          NakamaGrpc.getListMatchesMethod = getListMatchesMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListMatchesRequest, com.heroiclabs.nakama.api.MatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListMatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.MatchList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListMatches"))
              .build();
        }
      }
    }
    return getListMatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListNotificationsRequest,
      com.heroiclabs.nakama.api.NotificationList> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.heroiclabs.nakama.api.ListNotificationsRequest.class,
      responseType = com.heroiclabs.nakama.api.NotificationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListNotificationsRequest,
      com.heroiclabs.nakama.api.NotificationList> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListNotificationsRequest, com.heroiclabs.nakama.api.NotificationList> getListNotificationsMethod;
    if ((getListNotificationsMethod = NakamaGrpc.getListNotificationsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListNotificationsMethod = NakamaGrpc.getListNotificationsMethod) == null) {
          NakamaGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListNotificationsRequest, com.heroiclabs.nakama.api.NotificationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.NotificationList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjectList> getListStorageObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStorageObjects",
      requestType = com.heroiclabs.nakama.api.ListStorageObjectsRequest.class,
      responseType = com.heroiclabs.nakama.api.StorageObjectList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjectList> getListStorageObjectsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjectList> getListStorageObjectsMethod;
    if ((getListStorageObjectsMethod = NakamaGrpc.getListStorageObjectsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListStorageObjectsMethod = NakamaGrpc.getListStorageObjectsMethod) == null) {
          NakamaGrpc.getListStorageObjectsMethod = getListStorageObjectsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjectList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjectList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListStorageObjects"))
              .build();
        }
      }
    }
    return getListStorageObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListSubscriptionsRequest,
      com.heroiclabs.nakama.api.SubscriptionList> getListSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubscriptions",
      requestType = com.heroiclabs.nakama.api.ListSubscriptionsRequest.class,
      responseType = com.heroiclabs.nakama.api.SubscriptionList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListSubscriptionsRequest,
      com.heroiclabs.nakama.api.SubscriptionList> getListSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListSubscriptionsRequest, com.heroiclabs.nakama.api.SubscriptionList> getListSubscriptionsMethod;
    if ((getListSubscriptionsMethod = NakamaGrpc.getListSubscriptionsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListSubscriptionsMethod = NakamaGrpc.getListSubscriptionsMethod) == null) {
          NakamaGrpc.getListSubscriptionsMethod = getListSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListSubscriptionsRequest, com.heroiclabs.nakama.api.SubscriptionList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.SubscriptionList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListSubscriptions"))
              .build();
        }
      }
    }
    return getListSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentsRequest,
      com.heroiclabs.nakama.api.TournamentList> getListTournamentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTournaments",
      requestType = com.heroiclabs.nakama.api.ListTournamentsRequest.class,
      responseType = com.heroiclabs.nakama.api.TournamentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentsRequest,
      com.heroiclabs.nakama.api.TournamentList> getListTournamentsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentsRequest, com.heroiclabs.nakama.api.TournamentList> getListTournamentsMethod;
    if ((getListTournamentsMethod = NakamaGrpc.getListTournamentsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListTournamentsMethod = NakamaGrpc.getListTournamentsMethod) == null) {
          NakamaGrpc.getListTournamentsMethod = getListTournamentsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListTournamentsRequest, com.heroiclabs.nakama.api.TournamentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTournaments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListTournaments"))
              .build();
        }
      }
    }
    return getListTournamentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsRequest,
      com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTournamentRecords",
      requestType = com.heroiclabs.nakama.api.ListTournamentRecordsRequest.class,
      responseType = com.heroiclabs.nakama.api.TournamentRecordList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsRequest,
      com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsRequest, com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsMethod;
    if ((getListTournamentRecordsMethod = NakamaGrpc.getListTournamentRecordsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListTournamentRecordsMethod = NakamaGrpc.getListTournamentRecordsMethod) == null) {
          NakamaGrpc.getListTournamentRecordsMethod = getListTournamentRecordsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListTournamentRecordsRequest, com.heroiclabs.nakama.api.TournamentRecordList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTournamentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentRecordList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListTournamentRecords"))
              .build();
        }
      }
    }
    return getListTournamentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest,
      com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsAroundOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTournamentRecordsAroundOwner",
      requestType = com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest.class,
      responseType = com.heroiclabs.nakama.api.TournamentRecordList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest,
      com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsAroundOwnerMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest, com.heroiclabs.nakama.api.TournamentRecordList> getListTournamentRecordsAroundOwnerMethod;
    if ((getListTournamentRecordsAroundOwnerMethod = NakamaGrpc.getListTournamentRecordsAroundOwnerMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListTournamentRecordsAroundOwnerMethod = NakamaGrpc.getListTournamentRecordsAroundOwnerMethod) == null) {
          NakamaGrpc.getListTournamentRecordsAroundOwnerMethod = getListTournamentRecordsAroundOwnerMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest, com.heroiclabs.nakama.api.TournamentRecordList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTournamentRecordsAroundOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentRecordList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListTournamentRecordsAroundOwner"))
              .build();
        }
      }
    }
    return getListTournamentRecordsAroundOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListUserGroupsRequest,
      com.heroiclabs.nakama.api.UserGroupList> getListUserGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserGroups",
      requestType = com.heroiclabs.nakama.api.ListUserGroupsRequest.class,
      responseType = com.heroiclabs.nakama.api.UserGroupList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListUserGroupsRequest,
      com.heroiclabs.nakama.api.UserGroupList> getListUserGroupsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ListUserGroupsRequest, com.heroiclabs.nakama.api.UserGroupList> getListUserGroupsMethod;
    if ((getListUserGroupsMethod = NakamaGrpc.getListUserGroupsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getListUserGroupsMethod = NakamaGrpc.getListUserGroupsMethod) == null) {
          NakamaGrpc.getListUserGroupsMethod = getListUserGroupsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ListUserGroupsRequest, com.heroiclabs.nakama.api.UserGroupList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ListUserGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.UserGroupList.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ListUserGroups"))
              .build();
        }
      }
    }
    return getListUserGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.PromoteGroupUsersRequest,
      com.google.protobuf.Empty> getPromoteGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromoteGroupUsers",
      requestType = com.heroiclabs.nakama.api.PromoteGroupUsersRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.PromoteGroupUsersRequest,
      com.google.protobuf.Empty> getPromoteGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.PromoteGroupUsersRequest, com.google.protobuf.Empty> getPromoteGroupUsersMethod;
    if ((getPromoteGroupUsersMethod = NakamaGrpc.getPromoteGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getPromoteGroupUsersMethod = NakamaGrpc.getPromoteGroupUsersMethod) == null) {
          NakamaGrpc.getPromoteGroupUsersMethod = getPromoteGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.PromoteGroupUsersRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromoteGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.PromoteGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("PromoteGroupUsers"))
              .build();
        }
      }
    }
    return getPromoteGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DemoteGroupUsersRequest,
      com.google.protobuf.Empty> getDemoteGroupUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DemoteGroupUsers",
      requestType = com.heroiclabs.nakama.api.DemoteGroupUsersRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DemoteGroupUsersRequest,
      com.google.protobuf.Empty> getDemoteGroupUsersMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.DemoteGroupUsersRequest, com.google.protobuf.Empty> getDemoteGroupUsersMethod;
    if ((getDemoteGroupUsersMethod = NakamaGrpc.getDemoteGroupUsersMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getDemoteGroupUsersMethod = NakamaGrpc.getDemoteGroupUsersMethod) == null) {
          NakamaGrpc.getDemoteGroupUsersMethod = getDemoteGroupUsersMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.DemoteGroupUsersRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DemoteGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.DemoteGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("DemoteGroupUsers"))
              .build();
        }
      }
    }
    return getDemoteGroupUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ReadStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjects> getReadStorageObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadStorageObjects",
      requestType = com.heroiclabs.nakama.api.ReadStorageObjectsRequest.class,
      responseType = com.heroiclabs.nakama.api.StorageObjects.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ReadStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjects> getReadStorageObjectsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ReadStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjects> getReadStorageObjectsMethod;
    if ((getReadStorageObjectsMethod = NakamaGrpc.getReadStorageObjectsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getReadStorageObjectsMethod = NakamaGrpc.getReadStorageObjectsMethod) == null) {
          NakamaGrpc.getReadStorageObjectsMethod = getReadStorageObjectsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ReadStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjects>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ReadStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjects.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ReadStorageObjects"))
              .build();
        }
      }
    }
    return getReadStorageObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Rpc,
      com.heroiclabs.nakama.api.Rpc> getRpcFuncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RpcFunc",
      requestType = com.heroiclabs.nakama.api.Rpc.class,
      responseType = com.heroiclabs.nakama.api.Rpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Rpc,
      com.heroiclabs.nakama.api.Rpc> getRpcFuncMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.Rpc, com.heroiclabs.nakama.api.Rpc> getRpcFuncMethod;
    if ((getRpcFuncMethod = NakamaGrpc.getRpcFuncMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getRpcFuncMethod = NakamaGrpc.getRpcFuncMethod) == null) {
          NakamaGrpc.getRpcFuncMethod = getRpcFuncMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.Rpc, com.heroiclabs.nakama.api.Rpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RpcFunc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Rpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.Rpc.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("RpcFunc"))
              .build();
        }
      }
    }
    return getRpcFuncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple,
      com.google.protobuf.Empty> getUnlinkAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkApple",
      requestType = com.heroiclabs.nakama.api.AccountApple.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple,
      com.google.protobuf.Empty> getUnlinkAppleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountApple, com.google.protobuf.Empty> getUnlinkAppleMethod;
    if ((getUnlinkAppleMethod = NakamaGrpc.getUnlinkAppleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkAppleMethod = NakamaGrpc.getUnlinkAppleMethod) == null) {
          NakamaGrpc.getUnlinkAppleMethod = getUnlinkAppleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountApple, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountApple.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkApple"))
              .build();
        }
      }
    }
    return getUnlinkAppleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom,
      com.google.protobuf.Empty> getUnlinkCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkCustom",
      requestType = com.heroiclabs.nakama.api.AccountCustom.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom,
      com.google.protobuf.Empty> getUnlinkCustomMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountCustom, com.google.protobuf.Empty> getUnlinkCustomMethod;
    if ((getUnlinkCustomMethod = NakamaGrpc.getUnlinkCustomMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkCustomMethod = NakamaGrpc.getUnlinkCustomMethod) == null) {
          NakamaGrpc.getUnlinkCustomMethod = getUnlinkCustomMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountCustom, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkCustom"))
              .build();
        }
      }
    }
    return getUnlinkCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice,
      com.google.protobuf.Empty> getUnlinkDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkDevice",
      requestType = com.heroiclabs.nakama.api.AccountDevice.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice,
      com.google.protobuf.Empty> getUnlinkDeviceMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountDevice, com.google.protobuf.Empty> getUnlinkDeviceMethod;
    if ((getUnlinkDeviceMethod = NakamaGrpc.getUnlinkDeviceMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkDeviceMethod = NakamaGrpc.getUnlinkDeviceMethod) == null) {
          NakamaGrpc.getUnlinkDeviceMethod = getUnlinkDeviceMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountDevice, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountDevice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkDevice"))
              .build();
        }
      }
    }
    return getUnlinkDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail,
      com.google.protobuf.Empty> getUnlinkEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkEmail",
      requestType = com.heroiclabs.nakama.api.AccountEmail.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail,
      com.google.protobuf.Empty> getUnlinkEmailMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountEmail, com.google.protobuf.Empty> getUnlinkEmailMethod;
    if ((getUnlinkEmailMethod = NakamaGrpc.getUnlinkEmailMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkEmailMethod = NakamaGrpc.getUnlinkEmailMethod) == null) {
          NakamaGrpc.getUnlinkEmailMethod = getUnlinkEmailMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountEmail, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkEmail"))
              .build();
        }
      }
    }
    return getUnlinkEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebook,
      com.google.protobuf.Empty> getUnlinkFacebookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkFacebook",
      requestType = com.heroiclabs.nakama.api.AccountFacebook.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebook,
      com.google.protobuf.Empty> getUnlinkFacebookMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebook, com.google.protobuf.Empty> getUnlinkFacebookMethod;
    if ((getUnlinkFacebookMethod = NakamaGrpc.getUnlinkFacebookMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkFacebookMethod = NakamaGrpc.getUnlinkFacebookMethod) == null) {
          NakamaGrpc.getUnlinkFacebookMethod = getUnlinkFacebookMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountFacebook, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkFacebook"))
              .build();
        }
      }
    }
    return getUnlinkFacebookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame,
      com.google.protobuf.Empty> getUnlinkFacebookInstantGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkFacebookInstantGame",
      requestType = com.heroiclabs.nakama.api.AccountFacebookInstantGame.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame,
      com.google.protobuf.Empty> getUnlinkFacebookInstantGameMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountFacebookInstantGame, com.google.protobuf.Empty> getUnlinkFacebookInstantGameMethod;
    if ((getUnlinkFacebookInstantGameMethod = NakamaGrpc.getUnlinkFacebookInstantGameMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkFacebookInstantGameMethod = NakamaGrpc.getUnlinkFacebookInstantGameMethod) == null) {
          NakamaGrpc.getUnlinkFacebookInstantGameMethod = getUnlinkFacebookInstantGameMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountFacebookInstantGame, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkFacebookInstantGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountFacebookInstantGame.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkFacebookInstantGame"))
              .build();
        }
      }
    }
    return getUnlinkFacebookInstantGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter,
      com.google.protobuf.Empty> getUnlinkGameCenterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkGameCenter",
      requestType = com.heroiclabs.nakama.api.AccountGameCenter.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter,
      com.google.protobuf.Empty> getUnlinkGameCenterMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGameCenter, com.google.protobuf.Empty> getUnlinkGameCenterMethod;
    if ((getUnlinkGameCenterMethod = NakamaGrpc.getUnlinkGameCenterMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkGameCenterMethod = NakamaGrpc.getUnlinkGameCenterMethod) == null) {
          NakamaGrpc.getUnlinkGameCenterMethod = getUnlinkGameCenterMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountGameCenter, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGameCenter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkGameCenter"))
              .build();
        }
      }
    }
    return getUnlinkGameCenterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle,
      com.google.protobuf.Empty> getUnlinkGoogleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkGoogle",
      requestType = com.heroiclabs.nakama.api.AccountGoogle.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle,
      com.google.protobuf.Empty> getUnlinkGoogleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountGoogle, com.google.protobuf.Empty> getUnlinkGoogleMethod;
    if ((getUnlinkGoogleMethod = NakamaGrpc.getUnlinkGoogleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkGoogleMethod = NakamaGrpc.getUnlinkGoogleMethod) == null) {
          NakamaGrpc.getUnlinkGoogleMethod = getUnlinkGoogleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountGoogle, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGoogle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkGoogle"))
              .build();
        }
      }
    }
    return getUnlinkGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam,
      com.google.protobuf.Empty> getUnlinkSteamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlinkSteam",
      requestType = com.heroiclabs.nakama.api.AccountSteam.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam,
      com.google.protobuf.Empty> getUnlinkSteamMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam, com.google.protobuf.Empty> getUnlinkSteamMethod;
    if ((getUnlinkSteamMethod = NakamaGrpc.getUnlinkSteamMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUnlinkSteamMethod = NakamaGrpc.getUnlinkSteamMethod) == null) {
          NakamaGrpc.getUnlinkSteamMethod = getUnlinkSteamMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountSteam, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlinkSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountSteam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UnlinkSteam"))
              .build();
        }
      }
    }
    return getUnlinkSteamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateAccountRequest,
      com.google.protobuf.Empty> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = com.heroiclabs.nakama.api.UpdateAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateAccountRequest,
      com.google.protobuf.Empty> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateAccountRequest, com.google.protobuf.Empty> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = NakamaGrpc.getUpdateAccountMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUpdateAccountMethod = NakamaGrpc.getUpdateAccountMethod) == null) {
          NakamaGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.UpdateAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.UpdateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UpdateAccount"))
              .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateGroupRequest,
      com.google.protobuf.Empty> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroup",
      requestType = com.heroiclabs.nakama.api.UpdateGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateGroupRequest,
      com.google.protobuf.Empty> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.UpdateGroupRequest, com.google.protobuf.Empty> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = NakamaGrpc.getUpdateGroupMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getUpdateGroupMethod = NakamaGrpc.getUpdateGroupMethod) == null) {
          NakamaGrpc.getUpdateGroupMethod = getUpdateGroupMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.UpdateGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("UpdateGroup"))
              .build();
        }
      }
    }
    return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatePurchaseApple",
      requestType = com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidatePurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseAppleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseAppleMethod;
    if ((getValidatePurchaseAppleMethod = NakamaGrpc.getValidatePurchaseAppleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidatePurchaseAppleMethod = NakamaGrpc.getValidatePurchaseAppleMethod) == null) {
          NakamaGrpc.getValidatePurchaseAppleMethod = getValidatePurchaseAppleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatePurchaseApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidatePurchaseApple"))
              .build();
        }
      }
    }
    return getValidatePurchaseAppleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest,
      com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateSubscriptionApple",
      requestType = com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidateSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest,
      com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionAppleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest, com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionAppleMethod;
    if ((getValidateSubscriptionAppleMethod = NakamaGrpc.getValidateSubscriptionAppleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidateSubscriptionAppleMethod = NakamaGrpc.getValidateSubscriptionAppleMethod) == null) {
          NakamaGrpc.getValidateSubscriptionAppleMethod = getValidateSubscriptionAppleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest, com.heroiclabs.nakama.api.ValidateSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateSubscriptionApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidateSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidateSubscriptionApple"))
              .build();
        }
      }
    }
    return getValidateSubscriptionAppleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseGoogleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatePurchaseGoogle",
      requestType = com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidatePurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseGoogleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseGoogleMethod;
    if ((getValidatePurchaseGoogleMethod = NakamaGrpc.getValidatePurchaseGoogleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidatePurchaseGoogleMethod = NakamaGrpc.getValidatePurchaseGoogleMethod) == null) {
          NakamaGrpc.getValidatePurchaseGoogleMethod = getValidatePurchaseGoogleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatePurchaseGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidatePurchaseGoogle"))
              .build();
        }
      }
    }
    return getValidatePurchaseGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest,
      com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionGoogleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateSubscriptionGoogle",
      requestType = com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidateSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest,
      com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionGoogleMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest, com.heroiclabs.nakama.api.ValidateSubscriptionResponse> getValidateSubscriptionGoogleMethod;
    if ((getValidateSubscriptionGoogleMethod = NakamaGrpc.getValidateSubscriptionGoogleMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidateSubscriptionGoogleMethod = NakamaGrpc.getValidateSubscriptionGoogleMethod) == null) {
          NakamaGrpc.getValidateSubscriptionGoogleMethod = getValidateSubscriptionGoogleMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest, com.heroiclabs.nakama.api.ValidateSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateSubscriptionGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidateSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidateSubscriptionGoogle"))
              .build();
        }
      }
    }
    return getValidateSubscriptionGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseHuaweiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatePurchaseHuawei",
      requestType = com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidatePurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseHuaweiMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseHuaweiMethod;
    if ((getValidatePurchaseHuaweiMethod = NakamaGrpc.getValidatePurchaseHuaweiMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidatePurchaseHuaweiMethod = NakamaGrpc.getValidatePurchaseHuaweiMethod) == null) {
          NakamaGrpc.getValidatePurchaseHuaweiMethod = getValidatePurchaseHuaweiMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatePurchaseHuawei"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidatePurchaseHuawei"))
              .build();
        }
      }
    }
    return getValidatePurchaseHuaweiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseFacebookInstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatePurchaseFacebookInstant",
      requestType = com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.class,
      responseType = com.heroiclabs.nakama.api.ValidatePurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest,
      com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseFacebookInstantMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse> getValidatePurchaseFacebookInstantMethod;
    if ((getValidatePurchaseFacebookInstantMethod = NakamaGrpc.getValidatePurchaseFacebookInstantMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getValidatePurchaseFacebookInstantMethod = NakamaGrpc.getValidatePurchaseFacebookInstantMethod) == null) {
          NakamaGrpc.getValidatePurchaseFacebookInstantMethod = getValidatePurchaseFacebookInstantMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest, com.heroiclabs.nakama.api.ValidatePurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatePurchaseFacebookInstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.ValidatePurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("ValidatePurchaseFacebookInstant"))
              .build();
        }
      }
    }
    return getValidatePurchaseFacebookInstantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest,
      com.heroiclabs.nakama.api.LeaderboardRecord> getWriteLeaderboardRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteLeaderboardRecord",
      requestType = com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest.class,
      responseType = com.heroiclabs.nakama.api.LeaderboardRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest,
      com.heroiclabs.nakama.api.LeaderboardRecord> getWriteLeaderboardRecordMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest, com.heroiclabs.nakama.api.LeaderboardRecord> getWriteLeaderboardRecordMethod;
    if ((getWriteLeaderboardRecordMethod = NakamaGrpc.getWriteLeaderboardRecordMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getWriteLeaderboardRecordMethod = NakamaGrpc.getWriteLeaderboardRecordMethod) == null) {
          NakamaGrpc.getWriteLeaderboardRecordMethod = getWriteLeaderboardRecordMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest, com.heroiclabs.nakama.api.LeaderboardRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteLeaderboardRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecord.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("WriteLeaderboardRecord"))
              .build();
        }
      }
    }
    return getWriteLeaderboardRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjectAcks> getWriteStorageObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteStorageObjects",
      requestType = com.heroiclabs.nakama.api.WriteStorageObjectsRequest.class,
      responseType = com.heroiclabs.nakama.api.StorageObjectAcks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteStorageObjectsRequest,
      com.heroiclabs.nakama.api.StorageObjectAcks> getWriteStorageObjectsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjectAcks> getWriteStorageObjectsMethod;
    if ((getWriteStorageObjectsMethod = NakamaGrpc.getWriteStorageObjectsMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getWriteStorageObjectsMethod = NakamaGrpc.getWriteStorageObjectsMethod) == null) {
          NakamaGrpc.getWriteStorageObjectsMethod = getWriteStorageObjectsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.WriteStorageObjectsRequest, com.heroiclabs.nakama.api.StorageObjectAcks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjectAcks.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("WriteStorageObjects"))
              .build();
        }
      }
    }
    return getWriteStorageObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteTournamentRecordRequest,
      com.heroiclabs.nakama.api.LeaderboardRecord> getWriteTournamentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteTournamentRecord",
      requestType = com.heroiclabs.nakama.api.WriteTournamentRecordRequest.class,
      responseType = com.heroiclabs.nakama.api.LeaderboardRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteTournamentRecordRequest,
      com.heroiclabs.nakama.api.LeaderboardRecord> getWriteTournamentRecordMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.WriteTournamentRecordRequest, com.heroiclabs.nakama.api.LeaderboardRecord> getWriteTournamentRecordMethod;
    if ((getWriteTournamentRecordMethod = NakamaGrpc.getWriteTournamentRecordMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getWriteTournamentRecordMethod = NakamaGrpc.getWriteTournamentRecordMethod) == null) {
          NakamaGrpc.getWriteTournamentRecordMethod = getWriteTournamentRecordMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.WriteTournamentRecordRequest, com.heroiclabs.nakama.api.LeaderboardRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteTournamentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteTournamentRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecord.getDefaultInstance()))
              .setSchemaDescriptor(new NakamaMethodDescriptorSupplier("WriteTournamentRecord"))
              .build();
        }
      }
    }
    return getWriteTournamentRecordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NakamaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NakamaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NakamaStub>() {
        @java.lang.Override
        public NakamaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NakamaStub(channel, callOptions);
        }
      };
    return NakamaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NakamaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NakamaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NakamaBlockingStub>() {
        @java.lang.Override
        public NakamaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NakamaBlockingStub(channel, callOptions);
        }
      };
    return NakamaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NakamaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NakamaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NakamaFutureStub>() {
        @java.lang.Override
        public NakamaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NakamaFutureStub(channel, callOptions);
        }
      };
    return NakamaFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    default void addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    default void addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    default void sessionRefresh(com.heroiclabs.nakama.api.SessionRefreshRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionRefreshMethod(), responseObserver);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    default void sessionLogout(com.heroiclabs.nakama.api.SessionLogoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an Apple ID against the server.
     * </pre>
     */
    default void authenticateApple(com.heroiclabs.nakama.api.AuthenticateAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateAppleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    default void authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    default void authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    default void authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    default void authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook Instant Game token against the server.
     * </pre>
     */
    default void authenticateFacebookInstantGame(com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateFacebookInstantGameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    default void authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    default void authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    default void authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ban a set of users from a group.
     * </pre>
     */
    default void banGroupUsers(com.heroiclabs.nakama.api.BanGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBanGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    default void blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    default void createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the current user's account.
     * </pre>
     */
    default void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    default void deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    default void deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    default void deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLeaderboardRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    default void deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a tournament record.
     * </pre>
     */
    default void deleteTournamentRecord(com.heroiclabs.nakama.api.DeleteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTournamentRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    default void deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    default void event(com.heroiclabs.nakama.api.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    default void getAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    default void getUsers(com.heroiclabs.nakama.api.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Users> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get subscription by product id.
     * </pre>
     */
    default void getSubscription(com.heroiclabs.nakama.api.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatedSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get matchmaker stats.
     * </pre>
     */
    default void getMatchmakerStats(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchmakerStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchmakerStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    default void healthcheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthcheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    default void importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFacebookFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import Steam friends and add them to a user's account.
     * </pre>
     */
    default void importSteamFriends(com.heroiclabs.nakama.api.ImportSteamFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportSteamFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    default void joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    default void joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinTournamentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    default void kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKickGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    default void leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaveGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an Apple ID to the social profiles on the current user's account.
     * </pre>
     */
    default void linkApple(com.heroiclabs.nakama.api.AccountApple request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkAppleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    default void linkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    default void linkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    default void linkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    default void linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Facebook Instant Game to the social profiles on the current user's account.
     * </pre>
     */
    default void linkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkFacebookInstantGameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    default void linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    default void linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    default void linkSteam(com.heroiclabs.nakama.api.LinkSteamRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    default void listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ChannelMessageList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListChannelMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    default void listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List friends of friends for the current user.
     * </pre>
     */
    default void listFriendsOfFriends(com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendsOfFriendsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFriendsOfFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    default void listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    default void listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupUserList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    default void listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLeaderboardRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    default void listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLeaderboardRecordsAroundOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    default void listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    default void listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.NotificationList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    default void listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List user's subscriptions.
     * </pre>
     */
    default void listSubscriptions(com.heroiclabs.nakama.api.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.SubscriptionList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    default void listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTournamentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    default void listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTournamentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    default void listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTournamentRecordsAroundOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    default void listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.UserGroupList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    default void promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoteGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Demote a set of users in a group to the next role down.
     * </pre>
     */
    default void demoteGroupUsers(com.heroiclabs.nakama.api.DemoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDemoteGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    default void readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    default void rpcFunc(com.heroiclabs.nakama.api.Rpc request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRpcFuncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the Apple ID from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkApple(com.heroiclabs.nakama.api.AccountApple request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkAppleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook Instant Game profile from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkFacebookInstantGameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    default void unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlinkSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    default void updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    default void updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate Apple IAP Receipt
     * </pre>
     */
    default void validatePurchaseApple(com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatePurchaseAppleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate Apple Subscription Receipt
     * </pre>
     */
    default void validateSubscriptionApple(com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateSubscriptionAppleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate Google IAP Receipt
     * </pre>
     */
    default void validatePurchaseGoogle(com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatePurchaseGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate Google Subscription Receipt
     * </pre>
     */
    default void validateSubscriptionGoogle(com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateSubscriptionGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate Huawei IAP Receipt
     * </pre>
     */
    default void validatePurchaseHuawei(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatePurchaseHuaweiMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate FB Instant IAP Receipt
     * </pre>
     */
    default void validatePurchaseFacebookInstant(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatePurchaseFacebookInstantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    default void writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteLeaderboardRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    default void writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectAcks> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    default void writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteTournamentRecordMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Nakama.
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static abstract class NakamaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NakamaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Nakama.
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaStub
      extends io.grpc.stub.AbstractAsyncStub<NakamaStub> {
    private NakamaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NakamaStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public void addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public void addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public void sessionRefresh(com.heroiclabs.nakama.api.SessionRefreshRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionRefreshMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public void sessionLogout(com.heroiclabs.nakama.api.SessionLogoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an Apple ID against the server.
     * </pre>
     */
    public void authenticateApple(com.heroiclabs.nakama.api.AuthenticateAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateAppleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public void authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public void authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public void authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public void authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook Instant Game token against the server.
     * </pre>
     */
    public void authenticateFacebookInstantGame(com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateFacebookInstantGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public void authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public void authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public void authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ban a set of users from a group.
     * </pre>
     */
    public void banGroupUsers(com.heroiclabs.nakama.api.BanGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBanGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public void blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public void createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the current user's account.
     * </pre>
     */
    public void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public void deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public void deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public void deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLeaderboardRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public void deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a tournament record.
     * </pre>
     */
    public void deleteTournamentRecord(com.heroiclabs.nakama.api.DeleteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTournamentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public void deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public void event(com.heroiclabs.nakama.api.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public void getAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public void getUsers(com.heroiclabs.nakama.api.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Users> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get subscription by product id.
     * </pre>
     */
    public void getSubscription(com.heroiclabs.nakama.api.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatedSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get matchmaker stats.
     * </pre>
     */
    public void getMatchmakerStats(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchmakerStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchmakerStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public void healthcheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public void importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFacebookFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import Steam friends and add them to a user's account.
     * </pre>
     */
    public void importSteamFriends(com.heroiclabs.nakama.api.ImportSteamFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportSteamFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public void joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public void joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinTournamentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public void kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKickGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public void leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an Apple ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkApple(com.heroiclabs.nakama.api.AccountApple request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkAppleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public void linkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public void linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Facebook Instant Game to the social profiles on the current user's account.
     * </pre>
     */
    public void linkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkFacebookInstantGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public void linkSteam(com.heroiclabs.nakama.api.LinkSteamRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public void listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ChannelMessageList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListChannelMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public void listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List friends of friends for the current user.
     * </pre>
     */
    public void listFriendsOfFriends(com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendsOfFriendsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFriendsOfFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public void listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public void listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupUserList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public void listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public void listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public void listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public void listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.NotificationList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public void listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List user's subscriptions.
     * </pre>
     */
    public void listSubscriptions(com.heroiclabs.nakama.api.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.SubscriptionList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public void listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTournamentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public void listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTournamentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public void listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTournamentRecordsAroundOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public void listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.UserGroupList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public void promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromoteGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Demote a set of users in a group to the next role down.
     * </pre>
     */
    public void demoteGroupUsers(com.heroiclabs.nakama.api.DemoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDemoteGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public void readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public void rpcFunc(com.heroiclabs.nakama.api.Rpc request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRpcFuncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the Apple ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkApple(com.heroiclabs.nakama.api.AccountApple request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkAppleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook Instant Game profile from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkFacebookInstantGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlinkSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public void updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public void updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate Apple IAP Receipt
     * </pre>
     */
    public void validatePurchaseApple(com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatePurchaseAppleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate Apple Subscription Receipt
     * </pre>
     */
    public void validateSubscriptionApple(com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateSubscriptionAppleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate Google IAP Receipt
     * </pre>
     */
    public void validatePurchaseGoogle(com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatePurchaseGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate Google Subscription Receipt
     * </pre>
     */
    public void validateSubscriptionGoogle(com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateSubscriptionGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate Huawei IAP Receipt
     * </pre>
     */
    public void validatePurchaseHuawei(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatePurchaseHuaweiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate FB Instant IAP Receipt
     * </pre>
     */
    public void validatePurchaseFacebookInstant(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatePurchaseFacebookInstantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public void writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteLeaderboardRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public void writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectAcks> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public void writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteTournamentRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Nakama.
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NakamaBlockingStub> {
    private NakamaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NakamaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public com.google.protobuf.Empty addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public com.google.protobuf.Empty addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session sessionRefresh(com.heroiclabs.nakama.api.SessionRefreshRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionRefreshMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public com.google.protobuf.Empty sessionLogout(com.heroiclabs.nakama.api.SessionLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with an Apple ID against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateApple(com.heroiclabs.nakama.api.AuthenticateAppleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateAppleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook Instant Game token against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateFacebookInstantGame(com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateFacebookInstantGameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ban a set of users from a group.
     * </pre>
     */
    public com.google.protobuf.Empty banGroupUsers(com.heroiclabs.nakama.api.BanGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBanGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Group createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public com.google.protobuf.Empty deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLeaderboardRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public com.google.protobuf.Empty deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a tournament record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTournamentRecord(com.heroiclabs.nakama.api.DeleteTournamentRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTournamentRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public com.google.protobuf.Empty event(com.heroiclabs.nakama.api.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Account getAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Users getUsers(com.heroiclabs.nakama.api.GetUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get subscription by product id.
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidatedSubscription getSubscription(com.heroiclabs.nakama.api.GetSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get matchmaker stats.
     * </pre>
     */
    public com.heroiclabs.nakama.api.MatchmakerStats getMatchmakerStats(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchmakerStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.protobuf.Empty healthcheck(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthcheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public com.google.protobuf.Empty importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFacebookFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import Steam friends and add them to a user's account.
     * </pre>
     */
    public com.google.protobuf.Empty importSteamFriends(com.heroiclabs.nakama.api.ImportSteamFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportSteamFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public com.google.protobuf.Empty joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public com.google.protobuf.Empty joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinTournamentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public com.google.protobuf.Empty kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public com.google.protobuf.Empty leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaveGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an Apple ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkApple(com.heroiclabs.nakama.api.AccountApple request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkAppleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkCustom(com.heroiclabs.nakama.api.AccountCustom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkDevice(com.heroiclabs.nakama.api.AccountDevice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkEmail(com.heroiclabs.nakama.api.AccountEmail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Facebook Instant Game to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkFacebookInstantGameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkSteam(com.heroiclabs.nakama.api.LinkSteamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public com.heroiclabs.nakama.api.ChannelMessageList listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListChannelMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public com.heroiclabs.nakama.api.FriendList listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List friends of friends for the current user.
     * </pre>
     */
    public com.heroiclabs.nakama.api.FriendsOfFriendsList listFriendsOfFriends(com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFriendsOfFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public com.heroiclabs.nakama.api.GroupList listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public com.heroiclabs.nakama.api.GroupUserList listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecordList listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLeaderboardRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecordList listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public com.heroiclabs.nakama.api.MatchList listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public com.heroiclabs.nakama.api.NotificationList listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjectList listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List user's subscriptions.
     * </pre>
     */
    public com.heroiclabs.nakama.api.SubscriptionList listSubscriptions(com.heroiclabs.nakama.api.ListSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentList listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTournamentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentRecordList listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTournamentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentRecordList listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTournamentRecordsAroundOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public com.heroiclabs.nakama.api.UserGroupList listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public com.google.protobuf.Empty promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromoteGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Demote a set of users in a group to the next role down.
     * </pre>
     */
    public com.google.protobuf.Empty demoteGroupUsers(com.heroiclabs.nakama.api.DemoteGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDemoteGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjects readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Rpc rpcFunc(com.heroiclabs.nakama.api.Rpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRpcFuncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the Apple ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkApple(com.heroiclabs.nakama.api.AccountApple request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkAppleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Facebook Instant Game profile from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkFacebookInstantGame(com.heroiclabs.nakama.api.AccountFacebookInstantGame request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkFacebookInstantGameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlinkSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public com.google.protobuf.Empty updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate Apple IAP Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidatePurchaseResponse validatePurchaseApple(com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatePurchaseAppleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate Apple Subscription Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidateSubscriptionResponse validateSubscriptionApple(com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateSubscriptionAppleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate Google IAP Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidatePurchaseResponse validatePurchaseGoogle(com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatePurchaseGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate Google Subscription Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidateSubscriptionResponse validateSubscriptionGoogle(com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateSubscriptionGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate Huawei IAP Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidatePurchaseResponse validatePurchaseHuawei(com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatePurchaseHuaweiMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate FB Instant IAP Receipt
     * </pre>
     */
    public com.heroiclabs.nakama.api.ValidatePurchaseResponse validatePurchaseFacebookInstant(com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatePurchaseFacebookInstantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecord writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteLeaderboardRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjectAcks writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecord writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteTournamentRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Nakama.
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaFutureStub
      extends io.grpc.stub.AbstractFutureStub<NakamaFutureStub> {
    private NakamaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NakamaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addFriends(
        com.heroiclabs.nakama.api.AddFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addGroupUsers(
        com.heroiclabs.nakama.api.AddGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> sessionRefresh(
        com.heroiclabs.nakama.api.SessionRefreshRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionRefreshMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sessionLogout(
        com.heroiclabs.nakama.api.SessionLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with an Apple ID against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateApple(
        com.heroiclabs.nakama.api.AuthenticateAppleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateAppleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateCustom(
        com.heroiclabs.nakama.api.AuthenticateCustomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateDevice(
        com.heroiclabs.nakama.api.AuthenticateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateEmail(
        com.heroiclabs.nakama.api.AuthenticateEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateFacebook(
        com.heroiclabs.nakama.api.AuthenticateFacebookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook Instant Game token against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateFacebookInstantGame(
        com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateFacebookInstantGameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateGameCenter(
        com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateGoogle(
        com.heroiclabs.nakama.api.AuthenticateGoogleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateSteam(
        com.heroiclabs.nakama.api.AuthenticateSteamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ban a set of users from a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> banGroupUsers(
        com.heroiclabs.nakama.api.BanGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBanGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> blockFriends(
        com.heroiclabs.nakama.api.BlockFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Group> createGroup(
        com.heroiclabs.nakama.api.CreateGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteFriends(
        com.heroiclabs.nakama.api.DeleteFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGroup(
        com.heroiclabs.nakama.api.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLeaderboardRecord(
        com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLeaderboardRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNotifications(
        com.heroiclabs.nakama.api.DeleteNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a tournament record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTournamentRecord(
        com.heroiclabs.nakama.api.DeleteTournamentRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTournamentRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteStorageObjects(
        com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> event(
        com.heroiclabs.nakama.api.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Account> getAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Users> getUsers(
        com.heroiclabs.nakama.api.GetUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get subscription by product id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidatedSubscription> getSubscription(
        com.heroiclabs.nakama.api.GetSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get matchmaker stats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.MatchmakerStats> getMatchmakerStats(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchmakerStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> healthcheck(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> importFacebookFriends(
        com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFacebookFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import Steam friends and add them to a user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> importSteamFriends(
        com.heroiclabs.nakama.api.ImportSteamFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportSteamFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> joinGroup(
        com.heroiclabs.nakama.api.JoinGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> joinTournament(
        com.heroiclabs.nakama.api.JoinTournamentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinTournamentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> kickGroupUsers(
        com.heroiclabs.nakama.api.KickGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKickGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> leaveGroup(
        com.heroiclabs.nakama.api.LeaveGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an Apple ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkApple(
        com.heroiclabs.nakama.api.AccountApple request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkAppleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkCustom(
        com.heroiclabs.nakama.api.AccountCustom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkDevice(
        com.heroiclabs.nakama.api.AccountDevice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkEmail(
        com.heroiclabs.nakama.api.AccountEmail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkFacebook(
        com.heroiclabs.nakama.api.LinkFacebookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Facebook Instant Game to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkFacebookInstantGame(
        com.heroiclabs.nakama.api.AccountFacebookInstantGame request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkFacebookInstantGameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkGameCenter(
        com.heroiclabs.nakama.api.AccountGameCenter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkGoogle(
        com.heroiclabs.nakama.api.AccountGoogle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkSteam(
        com.heroiclabs.nakama.api.LinkSteamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ChannelMessageList> listChannelMessages(
        com.heroiclabs.nakama.api.ListChannelMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListChannelMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.FriendList> listFriends(
        com.heroiclabs.nakama.api.ListFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List friends of friends for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.FriendsOfFriendsList> listFriendsOfFriends(
        com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFriendsOfFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.GroupList> listGroups(
        com.heroiclabs.nakama.api.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.GroupUserList> listGroupUsers(
        com.heroiclabs.nakama.api.ListGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecordList> listLeaderboardRecords(
        com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecordList> listLeaderboardRecordsAroundOwner(
        com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.MatchList> listMatches(
        com.heroiclabs.nakama.api.ListMatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(
        com.heroiclabs.nakama.api.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjectList> listStorageObjects(
        com.heroiclabs.nakama.api.ListStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List user's subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.SubscriptionList> listSubscriptions(
        com.heroiclabs.nakama.api.ListSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentList> listTournaments(
        com.heroiclabs.nakama.api.ListTournamentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTournamentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentRecordList> listTournamentRecords(
        com.heroiclabs.nakama.api.ListTournamentRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTournamentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentRecordList> listTournamentRecordsAroundOwner(
        com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTournamentRecordsAroundOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.UserGroupList> listUserGroups(
        com.heroiclabs.nakama.api.ListUserGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> promoteGroupUsers(
        com.heroiclabs.nakama.api.PromoteGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromoteGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Demote a set of users in a group to the next role down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> demoteGroupUsers(
        com.heroiclabs.nakama.api.DemoteGroupUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDemoteGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjects> readStorageObjects(
        com.heroiclabs.nakama.api.ReadStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Rpc> rpcFunc(
        com.heroiclabs.nakama.api.Rpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRpcFuncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the Apple ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkApple(
        com.heroiclabs.nakama.api.AccountApple request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkAppleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkCustom(
        com.heroiclabs.nakama.api.AccountCustom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkDevice(
        com.heroiclabs.nakama.api.AccountDevice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkEmail(
        com.heroiclabs.nakama.api.AccountEmail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkFacebook(
        com.heroiclabs.nakama.api.AccountFacebook request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Facebook Instant Game profile from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkFacebookInstantGame(
        com.heroiclabs.nakama.api.AccountFacebookInstantGame request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkFacebookInstantGameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkGameCenter(
        com.heroiclabs.nakama.api.AccountGameCenter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkGoogle(
        com.heroiclabs.nakama.api.AccountGoogle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkSteam(
        com.heroiclabs.nakama.api.AccountSteam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlinkSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAccount(
        com.heroiclabs.nakama.api.UpdateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateGroup(
        com.heroiclabs.nakama.api.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate Apple IAP Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidatePurchaseResponse> validatePurchaseApple(
        com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatePurchaseAppleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate Apple Subscription Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> validateSubscriptionApple(
        com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateSubscriptionAppleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate Google IAP Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidatePurchaseResponse> validatePurchaseGoogle(
        com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatePurchaseGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate Google Subscription Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidateSubscriptionResponse> validateSubscriptionGoogle(
        com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateSubscriptionGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate Huawei IAP Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidatePurchaseResponse> validatePurchaseHuawei(
        com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatePurchaseHuaweiMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate FB Instant IAP Receipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ValidatePurchaseResponse> validatePurchaseFacebookInstant(
        com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatePurchaseFacebookInstantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecord> writeLeaderboardRecord(
        com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteLeaderboardRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjectAcks> writeStorageObjects(
        com.heroiclabs.nakama.api.WriteStorageObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecord> writeTournamentRecord(
        com.heroiclabs.nakama.api.WriteTournamentRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteTournamentRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_FRIENDS = 0;
  private static final int METHODID_ADD_GROUP_USERS = 1;
  private static final int METHODID_SESSION_REFRESH = 2;
  private static final int METHODID_SESSION_LOGOUT = 3;
  private static final int METHODID_AUTHENTICATE_APPLE = 4;
  private static final int METHODID_AUTHENTICATE_CUSTOM = 5;
  private static final int METHODID_AUTHENTICATE_DEVICE = 6;
  private static final int METHODID_AUTHENTICATE_EMAIL = 7;
  private static final int METHODID_AUTHENTICATE_FACEBOOK = 8;
  private static final int METHODID_AUTHENTICATE_FACEBOOK_INSTANT_GAME = 9;
  private static final int METHODID_AUTHENTICATE_GAME_CENTER = 10;
  private static final int METHODID_AUTHENTICATE_GOOGLE = 11;
  private static final int METHODID_AUTHENTICATE_STEAM = 12;
  private static final int METHODID_BAN_GROUP_USERS = 13;
  private static final int METHODID_BLOCK_FRIENDS = 14;
  private static final int METHODID_CREATE_GROUP = 15;
  private static final int METHODID_DELETE_ACCOUNT = 16;
  private static final int METHODID_DELETE_FRIENDS = 17;
  private static final int METHODID_DELETE_GROUP = 18;
  private static final int METHODID_DELETE_LEADERBOARD_RECORD = 19;
  private static final int METHODID_DELETE_NOTIFICATIONS = 20;
  private static final int METHODID_DELETE_TOURNAMENT_RECORD = 21;
  private static final int METHODID_DELETE_STORAGE_OBJECTS = 22;
  private static final int METHODID_EVENT = 23;
  private static final int METHODID_GET_ACCOUNT = 24;
  private static final int METHODID_GET_USERS = 25;
  private static final int METHODID_GET_SUBSCRIPTION = 26;
  private static final int METHODID_GET_MATCHMAKER_STATS = 27;
  private static final int METHODID_HEALTHCHECK = 28;
  private static final int METHODID_IMPORT_FACEBOOK_FRIENDS = 29;
  private static final int METHODID_IMPORT_STEAM_FRIENDS = 30;
  private static final int METHODID_JOIN_GROUP = 31;
  private static final int METHODID_JOIN_TOURNAMENT = 32;
  private static final int METHODID_KICK_GROUP_USERS = 33;
  private static final int METHODID_LEAVE_GROUP = 34;
  private static final int METHODID_LINK_APPLE = 35;
  private static final int METHODID_LINK_CUSTOM = 36;
  private static final int METHODID_LINK_DEVICE = 37;
  private static final int METHODID_LINK_EMAIL = 38;
  private static final int METHODID_LINK_FACEBOOK = 39;
  private static final int METHODID_LINK_FACEBOOK_INSTANT_GAME = 40;
  private static final int METHODID_LINK_GAME_CENTER = 41;
  private static final int METHODID_LINK_GOOGLE = 42;
  private static final int METHODID_LINK_STEAM = 43;
  private static final int METHODID_LIST_CHANNEL_MESSAGES = 44;
  private static final int METHODID_LIST_FRIENDS = 45;
  private static final int METHODID_LIST_FRIENDS_OF_FRIENDS = 46;
  private static final int METHODID_LIST_GROUPS = 47;
  private static final int METHODID_LIST_GROUP_USERS = 48;
  private static final int METHODID_LIST_LEADERBOARD_RECORDS = 49;
  private static final int METHODID_LIST_LEADERBOARD_RECORDS_AROUND_OWNER = 50;
  private static final int METHODID_LIST_MATCHES = 51;
  private static final int METHODID_LIST_NOTIFICATIONS = 52;
  private static final int METHODID_LIST_STORAGE_OBJECTS = 53;
  private static final int METHODID_LIST_SUBSCRIPTIONS = 54;
  private static final int METHODID_LIST_TOURNAMENTS = 55;
  private static final int METHODID_LIST_TOURNAMENT_RECORDS = 56;
  private static final int METHODID_LIST_TOURNAMENT_RECORDS_AROUND_OWNER = 57;
  private static final int METHODID_LIST_USER_GROUPS = 58;
  private static final int METHODID_PROMOTE_GROUP_USERS = 59;
  private static final int METHODID_DEMOTE_GROUP_USERS = 60;
  private static final int METHODID_READ_STORAGE_OBJECTS = 61;
  private static final int METHODID_RPC_FUNC = 62;
  private static final int METHODID_UNLINK_APPLE = 63;
  private static final int METHODID_UNLINK_CUSTOM = 64;
  private static final int METHODID_UNLINK_DEVICE = 65;
  private static final int METHODID_UNLINK_EMAIL = 66;
  private static final int METHODID_UNLINK_FACEBOOK = 67;
  private static final int METHODID_UNLINK_FACEBOOK_INSTANT_GAME = 68;
  private static final int METHODID_UNLINK_GAME_CENTER = 69;
  private static final int METHODID_UNLINK_GOOGLE = 70;
  private static final int METHODID_UNLINK_STEAM = 71;
  private static final int METHODID_UPDATE_ACCOUNT = 72;
  private static final int METHODID_UPDATE_GROUP = 73;
  private static final int METHODID_VALIDATE_PURCHASE_APPLE = 74;
  private static final int METHODID_VALIDATE_SUBSCRIPTION_APPLE = 75;
  private static final int METHODID_VALIDATE_PURCHASE_GOOGLE = 76;
  private static final int METHODID_VALIDATE_SUBSCRIPTION_GOOGLE = 77;
  private static final int METHODID_VALIDATE_PURCHASE_HUAWEI = 78;
  private static final int METHODID_VALIDATE_PURCHASE_FACEBOOK_INSTANT = 79;
  private static final int METHODID_WRITE_LEADERBOARD_RECORD = 80;
  private static final int METHODID_WRITE_STORAGE_OBJECTS = 81;
  private static final int METHODID_WRITE_TOURNAMENT_RECORD = 82;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_FRIENDS:
          serviceImpl.addFriends((com.heroiclabs.nakama.api.AddFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_GROUP_USERS:
          serviceImpl.addGroupUsers((com.heroiclabs.nakama.api.AddGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SESSION_REFRESH:
          serviceImpl.sessionRefresh((com.heroiclabs.nakama.api.SessionRefreshRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_SESSION_LOGOUT:
          serviceImpl.sessionLogout((com.heroiclabs.nakama.api.SessionLogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_APPLE:
          serviceImpl.authenticateApple((com.heroiclabs.nakama.api.AuthenticateAppleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_CUSTOM:
          serviceImpl.authenticateCustom((com.heroiclabs.nakama.api.AuthenticateCustomRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_DEVICE:
          serviceImpl.authenticateDevice((com.heroiclabs.nakama.api.AuthenticateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_EMAIL:
          serviceImpl.authenticateEmail((com.heroiclabs.nakama.api.AuthenticateEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_FACEBOOK:
          serviceImpl.authenticateFacebook((com.heroiclabs.nakama.api.AuthenticateFacebookRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_FACEBOOK_INSTANT_GAME:
          serviceImpl.authenticateFacebookInstantGame((com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_GAME_CENTER:
          serviceImpl.authenticateGameCenter((com.heroiclabs.nakama.api.AuthenticateGameCenterRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_GOOGLE:
          serviceImpl.authenticateGoogle((com.heroiclabs.nakama.api.AuthenticateGoogleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_STEAM:
          serviceImpl.authenticateSteam((com.heroiclabs.nakama.api.AuthenticateSteamRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session>) responseObserver);
          break;
        case METHODID_BAN_GROUP_USERS:
          serviceImpl.banGroupUsers((com.heroiclabs.nakama.api.BanGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BLOCK_FRIENDS:
          serviceImpl.blockFriends((com.heroiclabs.nakama.api.BlockFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.heroiclabs.nakama.api.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_FRIENDS:
          serviceImpl.deleteFriends((com.heroiclabs.nakama.api.DeleteFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((com.heroiclabs.nakama.api.DeleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_LEADERBOARD_RECORD:
          serviceImpl.deleteLeaderboardRecord((com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATIONS:
          serviceImpl.deleteNotifications((com.heroiclabs.nakama.api.DeleteNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TOURNAMENT_RECORD:
          serviceImpl.deleteTournamentRecord((com.heroiclabs.nakama.api.DeleteTournamentRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_STORAGE_OBJECTS:
          serviceImpl.deleteStorageObjects((com.heroiclabs.nakama.api.DeleteStorageObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((com.heroiclabs.nakama.api.Event) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Account>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((com.heroiclabs.nakama.api.GetUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Users>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIPTION:
          serviceImpl.getSubscription((com.heroiclabs.nakama.api.GetSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatedSubscription>) responseObserver);
          break;
        case METHODID_GET_MATCHMAKER_STATS:
          serviceImpl.getMatchmakerStats((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchmakerStats>) responseObserver);
          break;
        case METHODID_HEALTHCHECK:
          serviceImpl.healthcheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IMPORT_FACEBOOK_FRIENDS:
          serviceImpl.importFacebookFriends((com.heroiclabs.nakama.api.ImportFacebookFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IMPORT_STEAM_FRIENDS:
          serviceImpl.importSteamFriends((com.heroiclabs.nakama.api.ImportSteamFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_JOIN_GROUP:
          serviceImpl.joinGroup((com.heroiclabs.nakama.api.JoinGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_JOIN_TOURNAMENT:
          serviceImpl.joinTournament((com.heroiclabs.nakama.api.JoinTournamentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_KICK_GROUP_USERS:
          serviceImpl.kickGroupUsers((com.heroiclabs.nakama.api.KickGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LEAVE_GROUP:
          serviceImpl.leaveGroup((com.heroiclabs.nakama.api.LeaveGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_APPLE:
          serviceImpl.linkApple((com.heroiclabs.nakama.api.AccountApple) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_CUSTOM:
          serviceImpl.linkCustom((com.heroiclabs.nakama.api.AccountCustom) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_DEVICE:
          serviceImpl.linkDevice((com.heroiclabs.nakama.api.AccountDevice) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_EMAIL:
          serviceImpl.linkEmail((com.heroiclabs.nakama.api.AccountEmail) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_FACEBOOK:
          serviceImpl.linkFacebook((com.heroiclabs.nakama.api.LinkFacebookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_FACEBOOK_INSTANT_GAME:
          serviceImpl.linkFacebookInstantGame((com.heroiclabs.nakama.api.AccountFacebookInstantGame) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_GAME_CENTER:
          serviceImpl.linkGameCenter((com.heroiclabs.nakama.api.AccountGameCenter) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_GOOGLE:
          serviceImpl.linkGoogle((com.heroiclabs.nakama.api.AccountGoogle) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_STEAM:
          serviceImpl.linkSteam((com.heroiclabs.nakama.api.LinkSteamRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_CHANNEL_MESSAGES:
          serviceImpl.listChannelMessages((com.heroiclabs.nakama.api.ListChannelMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ChannelMessageList>) responseObserver);
          break;
        case METHODID_LIST_FRIENDS:
          serviceImpl.listFriends((com.heroiclabs.nakama.api.ListFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendList>) responseObserver);
          break;
        case METHODID_LIST_FRIENDS_OF_FRIENDS:
          serviceImpl.listFriendsOfFriends((com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendsOfFriendsList>) responseObserver);
          break;
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((com.heroiclabs.nakama.api.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupList>) responseObserver);
          break;
        case METHODID_LIST_GROUP_USERS:
          serviceImpl.listGroupUsers((com.heroiclabs.nakama.api.ListGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupUserList>) responseObserver);
          break;
        case METHODID_LIST_LEADERBOARD_RECORDS:
          serviceImpl.listLeaderboardRecords((com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList>) responseObserver);
          break;
        case METHODID_LIST_LEADERBOARD_RECORDS_AROUND_OWNER:
          serviceImpl.listLeaderboardRecordsAroundOwner((com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList>) responseObserver);
          break;
        case METHODID_LIST_MATCHES:
          serviceImpl.listMatches((com.heroiclabs.nakama.api.ListMatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchList>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.heroiclabs.nakama.api.ListNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.NotificationList>) responseObserver);
          break;
        case METHODID_LIST_STORAGE_OBJECTS:
          serviceImpl.listStorageObjects((com.heroiclabs.nakama.api.ListStorageObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectList>) responseObserver);
          break;
        case METHODID_LIST_SUBSCRIPTIONS:
          serviceImpl.listSubscriptions((com.heroiclabs.nakama.api.ListSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.SubscriptionList>) responseObserver);
          break;
        case METHODID_LIST_TOURNAMENTS:
          serviceImpl.listTournaments((com.heroiclabs.nakama.api.ListTournamentsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentList>) responseObserver);
          break;
        case METHODID_LIST_TOURNAMENT_RECORDS:
          serviceImpl.listTournamentRecords((com.heroiclabs.nakama.api.ListTournamentRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList>) responseObserver);
          break;
        case METHODID_LIST_TOURNAMENT_RECORDS_AROUND_OWNER:
          serviceImpl.listTournamentRecordsAroundOwner((com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList>) responseObserver);
          break;
        case METHODID_LIST_USER_GROUPS:
          serviceImpl.listUserGroups((com.heroiclabs.nakama.api.ListUserGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.UserGroupList>) responseObserver);
          break;
        case METHODID_PROMOTE_GROUP_USERS:
          serviceImpl.promoteGroupUsers((com.heroiclabs.nakama.api.PromoteGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEMOTE_GROUP_USERS:
          serviceImpl.demoteGroupUsers((com.heroiclabs.nakama.api.DemoteGroupUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_READ_STORAGE_OBJECTS:
          serviceImpl.readStorageObjects((com.heroiclabs.nakama.api.ReadStorageObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects>) responseObserver);
          break;
        case METHODID_RPC_FUNC:
          serviceImpl.rpcFunc((com.heroiclabs.nakama.api.Rpc) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc>) responseObserver);
          break;
        case METHODID_UNLINK_APPLE:
          serviceImpl.unlinkApple((com.heroiclabs.nakama.api.AccountApple) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_CUSTOM:
          serviceImpl.unlinkCustom((com.heroiclabs.nakama.api.AccountCustom) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_DEVICE:
          serviceImpl.unlinkDevice((com.heroiclabs.nakama.api.AccountDevice) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_EMAIL:
          serviceImpl.unlinkEmail((com.heroiclabs.nakama.api.AccountEmail) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_FACEBOOK:
          serviceImpl.unlinkFacebook((com.heroiclabs.nakama.api.AccountFacebook) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_FACEBOOK_INSTANT_GAME:
          serviceImpl.unlinkFacebookInstantGame((com.heroiclabs.nakama.api.AccountFacebookInstantGame) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_GAME_CENTER:
          serviceImpl.unlinkGameCenter((com.heroiclabs.nakama.api.AccountGameCenter) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_GOOGLE:
          serviceImpl.unlinkGoogle((com.heroiclabs.nakama.api.AccountGoogle) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLINK_STEAM:
          serviceImpl.unlinkSteam((com.heroiclabs.nakama.api.AccountSteam) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((com.heroiclabs.nakama.api.UpdateAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((com.heroiclabs.nakama.api.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VALIDATE_PURCHASE_APPLE:
          serviceImpl.validatePurchaseApple((com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_SUBSCRIPTION_APPLE:
          serviceImpl.validateSubscriptionApple((com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_PURCHASE_GOOGLE:
          serviceImpl.validatePurchaseGoogle((com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_SUBSCRIPTION_GOOGLE:
          serviceImpl.validateSubscriptionGoogle((com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidateSubscriptionResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_PURCHASE_HUAWEI:
          serviceImpl.validatePurchaseHuawei((com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_PURCHASE_FACEBOOK_INSTANT:
          serviceImpl.validatePurchaseFacebookInstant((com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ValidatePurchaseResponse>) responseObserver);
          break;
        case METHODID_WRITE_LEADERBOARD_RECORD:
          serviceImpl.writeLeaderboardRecord((com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord>) responseObserver);
          break;
        case METHODID_WRITE_STORAGE_OBJECTS:
          serviceImpl.writeStorageObjects((com.heroiclabs.nakama.api.WriteStorageObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectAcks>) responseObserver);
          break;
        case METHODID_WRITE_TOURNAMENT_RECORD:
          serviceImpl.writeTournamentRecord((com.heroiclabs.nakama.api.WriteTournamentRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AddFriendsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_FRIENDS)))
        .addMethod(
          getAddGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AddGroupUsersRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_GROUP_USERS)))
        .addMethod(
          getSessionRefreshMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.SessionRefreshRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_SESSION_REFRESH)))
        .addMethod(
          getSessionLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.SessionLogoutRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SESSION_LOGOUT)))
        .addMethod(
          getAuthenticateAppleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateAppleRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_APPLE)))
        .addMethod(
          getAuthenticateCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateCustomRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_CUSTOM)))
        .addMethod(
          getAuthenticateDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateDeviceRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_DEVICE)))
        .addMethod(
          getAuthenticateEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateEmailRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_EMAIL)))
        .addMethod(
          getAuthenticateFacebookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateFacebookRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_FACEBOOK)))
        .addMethod(
          getAuthenticateFacebookInstantGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateFacebookInstantGameRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_FACEBOOK_INSTANT_GAME)))
        .addMethod(
          getAuthenticateGameCenterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateGameCenterRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_GAME_CENTER)))
        .addMethod(
          getAuthenticateGoogleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateGoogleRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_GOOGLE)))
        .addMethod(
          getAuthenticateSteamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AuthenticateSteamRequest,
              com.heroiclabs.nakama.api.Session>(
                service, METHODID_AUTHENTICATE_STEAM)))
        .addMethod(
          getBanGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.BanGroupUsersRequest,
              com.google.protobuf.Empty>(
                service, METHODID_BAN_GROUP_USERS)))
        .addMethod(
          getBlockFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.BlockFriendsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_BLOCK_FRIENDS)))
        .addMethod(
          getCreateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.CreateGroupRequest,
              com.heroiclabs.nakama.api.Group>(
                service, METHODID_CREATE_GROUP)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getDeleteFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteFriendsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_FRIENDS)))
        .addMethod(
          getDeleteGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteGroupRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_GROUP)))
        .addMethod(
          getDeleteLeaderboardRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_LEADERBOARD_RECORD)))
        .addMethod(
          getDeleteNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteNotificationsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_NOTIFICATIONS)))
        .addMethod(
          getDeleteTournamentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteTournamentRecordRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TOURNAMENT_RECORD)))
        .addMethod(
          getDeleteStorageObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DeleteStorageObjectsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_STORAGE_OBJECTS)))
        .addMethod(
          getEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.Event,
              com.google.protobuf.Empty>(
                service, METHODID_EVENT)))
        .addMethod(
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.heroiclabs.nakama.api.Account>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getGetUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.GetUsersRequest,
              com.heroiclabs.nakama.api.Users>(
                service, METHODID_GET_USERS)))
        .addMethod(
          getGetSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.GetSubscriptionRequest,
              com.heroiclabs.nakama.api.ValidatedSubscription>(
                service, METHODID_GET_SUBSCRIPTION)))
        .addMethod(
          getGetMatchmakerStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.heroiclabs.nakama.api.MatchmakerStats>(
                service, METHODID_GET_MATCHMAKER_STATS)))
        .addMethod(
          getHealthcheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_HEALTHCHECK)))
        .addMethod(
          getImportFacebookFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ImportFacebookFriendsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_IMPORT_FACEBOOK_FRIENDS)))
        .addMethod(
          getImportSteamFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ImportSteamFriendsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_IMPORT_STEAM_FRIENDS)))
        .addMethod(
          getJoinGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.JoinGroupRequest,
              com.google.protobuf.Empty>(
                service, METHODID_JOIN_GROUP)))
        .addMethod(
          getJoinTournamentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.JoinTournamentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_JOIN_TOURNAMENT)))
        .addMethod(
          getKickGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.KickGroupUsersRequest,
              com.google.protobuf.Empty>(
                service, METHODID_KICK_GROUP_USERS)))
        .addMethod(
          getLeaveGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.LeaveGroupRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LEAVE_GROUP)))
        .addMethod(
          getLinkAppleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountApple,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_APPLE)))
        .addMethod(
          getLinkCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountCustom,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_CUSTOM)))
        .addMethod(
          getLinkDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountDevice,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_DEVICE)))
        .addMethod(
          getLinkEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountEmail,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_EMAIL)))
        .addMethod(
          getLinkFacebookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.LinkFacebookRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_FACEBOOK)))
        .addMethod(
          getLinkFacebookInstantGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountFacebookInstantGame,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_FACEBOOK_INSTANT_GAME)))
        .addMethod(
          getLinkGameCenterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountGameCenter,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_GAME_CENTER)))
        .addMethod(
          getLinkGoogleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountGoogle,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_GOOGLE)))
        .addMethod(
          getLinkSteamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.LinkSteamRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LINK_STEAM)))
        .addMethod(
          getListChannelMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListChannelMessagesRequest,
              com.heroiclabs.nakama.api.ChannelMessageList>(
                service, METHODID_LIST_CHANNEL_MESSAGES)))
        .addMethod(
          getListFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListFriendsRequest,
              com.heroiclabs.nakama.api.FriendList>(
                service, METHODID_LIST_FRIENDS)))
        .addMethod(
          getListFriendsOfFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListFriendsOfFriendsRequest,
              com.heroiclabs.nakama.api.FriendsOfFriendsList>(
                service, METHODID_LIST_FRIENDS_OF_FRIENDS)))
        .addMethod(
          getListGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListGroupsRequest,
              com.heroiclabs.nakama.api.GroupList>(
                service, METHODID_LIST_GROUPS)))
        .addMethod(
          getListGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListGroupUsersRequest,
              com.heroiclabs.nakama.api.GroupUserList>(
                service, METHODID_LIST_GROUP_USERS)))
        .addMethod(
          getListLeaderboardRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest,
              com.heroiclabs.nakama.api.LeaderboardRecordList>(
                service, METHODID_LIST_LEADERBOARD_RECORDS)))
        .addMethod(
          getListLeaderboardRecordsAroundOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest,
              com.heroiclabs.nakama.api.LeaderboardRecordList>(
                service, METHODID_LIST_LEADERBOARD_RECORDS_AROUND_OWNER)))
        .addMethod(
          getListMatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListMatchesRequest,
              com.heroiclabs.nakama.api.MatchList>(
                service, METHODID_LIST_MATCHES)))
        .addMethod(
          getListNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListNotificationsRequest,
              com.heroiclabs.nakama.api.NotificationList>(
                service, METHODID_LIST_NOTIFICATIONS)))
        .addMethod(
          getListStorageObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListStorageObjectsRequest,
              com.heroiclabs.nakama.api.StorageObjectList>(
                service, METHODID_LIST_STORAGE_OBJECTS)))
        .addMethod(
          getListSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListSubscriptionsRequest,
              com.heroiclabs.nakama.api.SubscriptionList>(
                service, METHODID_LIST_SUBSCRIPTIONS)))
        .addMethod(
          getListTournamentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListTournamentsRequest,
              com.heroiclabs.nakama.api.TournamentList>(
                service, METHODID_LIST_TOURNAMENTS)))
        .addMethod(
          getListTournamentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListTournamentRecordsRequest,
              com.heroiclabs.nakama.api.TournamentRecordList>(
                service, METHODID_LIST_TOURNAMENT_RECORDS)))
        .addMethod(
          getListTournamentRecordsAroundOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest,
              com.heroiclabs.nakama.api.TournamentRecordList>(
                service, METHODID_LIST_TOURNAMENT_RECORDS_AROUND_OWNER)))
        .addMethod(
          getListUserGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ListUserGroupsRequest,
              com.heroiclabs.nakama.api.UserGroupList>(
                service, METHODID_LIST_USER_GROUPS)))
        .addMethod(
          getPromoteGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.PromoteGroupUsersRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PROMOTE_GROUP_USERS)))
        .addMethod(
          getDemoteGroupUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.DemoteGroupUsersRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DEMOTE_GROUP_USERS)))
        .addMethod(
          getReadStorageObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ReadStorageObjectsRequest,
              com.heroiclabs.nakama.api.StorageObjects>(
                service, METHODID_READ_STORAGE_OBJECTS)))
        .addMethod(
          getRpcFuncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.Rpc,
              com.heroiclabs.nakama.api.Rpc>(
                service, METHODID_RPC_FUNC)))
        .addMethod(
          getUnlinkAppleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountApple,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_APPLE)))
        .addMethod(
          getUnlinkCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountCustom,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_CUSTOM)))
        .addMethod(
          getUnlinkDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountDevice,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_DEVICE)))
        .addMethod(
          getUnlinkEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountEmail,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_EMAIL)))
        .addMethod(
          getUnlinkFacebookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountFacebook,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_FACEBOOK)))
        .addMethod(
          getUnlinkFacebookInstantGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountFacebookInstantGame,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_FACEBOOK_INSTANT_GAME)))
        .addMethod(
          getUnlinkGameCenterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountGameCenter,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_GAME_CENTER)))
        .addMethod(
          getUnlinkGoogleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountGoogle,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_GOOGLE)))
        .addMethod(
          getUnlinkSteamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.AccountSteam,
              com.google.protobuf.Empty>(
                service, METHODID_UNLINK_STEAM)))
        .addMethod(
          getUpdateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.UpdateAccountRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_ACCOUNT)))
        .addMethod(
          getUpdateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.UpdateGroupRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_GROUP)))
        .addMethod(
          getValidatePurchaseAppleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidatePurchaseAppleRequest,
              com.heroiclabs.nakama.api.ValidatePurchaseResponse>(
                service, METHODID_VALIDATE_PURCHASE_APPLE)))
        .addMethod(
          getValidateSubscriptionAppleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidateSubscriptionAppleRequest,
              com.heroiclabs.nakama.api.ValidateSubscriptionResponse>(
                service, METHODID_VALIDATE_SUBSCRIPTION_APPLE)))
        .addMethod(
          getValidatePurchaseGoogleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidatePurchaseGoogleRequest,
              com.heroiclabs.nakama.api.ValidatePurchaseResponse>(
                service, METHODID_VALIDATE_PURCHASE_GOOGLE)))
        .addMethod(
          getValidateSubscriptionGoogleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidateSubscriptionGoogleRequest,
              com.heroiclabs.nakama.api.ValidateSubscriptionResponse>(
                service, METHODID_VALIDATE_SUBSCRIPTION_GOOGLE)))
        .addMethod(
          getValidatePurchaseHuaweiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidatePurchaseHuaweiRequest,
              com.heroiclabs.nakama.api.ValidatePurchaseResponse>(
                service, METHODID_VALIDATE_PURCHASE_HUAWEI)))
        .addMethod(
          getValidatePurchaseFacebookInstantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.ValidatePurchaseFacebookInstantRequest,
              com.heroiclabs.nakama.api.ValidatePurchaseResponse>(
                service, METHODID_VALIDATE_PURCHASE_FACEBOOK_INSTANT)))
        .addMethod(
          getWriteLeaderboardRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest,
              com.heroiclabs.nakama.api.LeaderboardRecord>(
                service, METHODID_WRITE_LEADERBOARD_RECORD)))
        .addMethod(
          getWriteStorageObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.WriteStorageObjectsRequest,
              com.heroiclabs.nakama.api.StorageObjectAcks>(
                service, METHODID_WRITE_STORAGE_OBJECTS)))
        .addMethod(
          getWriteTournamentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.nakama.api.WriteTournamentRecordRequest,
              com.heroiclabs.nakama.api.LeaderboardRecord>(
                service, METHODID_WRITE_TOURNAMENT_RECORD)))
        .build();
  }

  private static abstract class NakamaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NakamaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.heroiclabs.nakama.api.ApigrpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Nakama");
    }
  }

  private static final class NakamaFileDescriptorSupplier
      extends NakamaBaseDescriptorSupplier {
    NakamaFileDescriptorSupplier() {}
  }

  private static final class NakamaMethodDescriptorSupplier
      extends NakamaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NakamaMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NakamaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NakamaFileDescriptorSupplier())
              .addMethod(getAddFriendsMethod())
              .addMethod(getAddGroupUsersMethod())
              .addMethod(getSessionRefreshMethod())
              .addMethod(getSessionLogoutMethod())
              .addMethod(getAuthenticateAppleMethod())
              .addMethod(getAuthenticateCustomMethod())
              .addMethod(getAuthenticateDeviceMethod())
              .addMethod(getAuthenticateEmailMethod())
              .addMethod(getAuthenticateFacebookMethod())
              .addMethod(getAuthenticateFacebookInstantGameMethod())
              .addMethod(getAuthenticateGameCenterMethod())
              .addMethod(getAuthenticateGoogleMethod())
              .addMethod(getAuthenticateSteamMethod())
              .addMethod(getBanGroupUsersMethod())
              .addMethod(getBlockFriendsMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getDeleteFriendsMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getDeleteLeaderboardRecordMethod())
              .addMethod(getDeleteNotificationsMethod())
              .addMethod(getDeleteTournamentRecordMethod())
              .addMethod(getDeleteStorageObjectsMethod())
              .addMethod(getEventMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetSubscriptionMethod())
              .addMethod(getGetMatchmakerStatsMethod())
              .addMethod(getHealthcheckMethod())
              .addMethod(getImportFacebookFriendsMethod())
              .addMethod(getImportSteamFriendsMethod())
              .addMethod(getJoinGroupMethod())
              .addMethod(getJoinTournamentMethod())
              .addMethod(getKickGroupUsersMethod())
              .addMethod(getLeaveGroupMethod())
              .addMethod(getLinkAppleMethod())
              .addMethod(getLinkCustomMethod())
              .addMethod(getLinkDeviceMethod())
              .addMethod(getLinkEmailMethod())
              .addMethod(getLinkFacebookMethod())
              .addMethod(getLinkFacebookInstantGameMethod())
              .addMethod(getLinkGameCenterMethod())
              .addMethod(getLinkGoogleMethod())
              .addMethod(getLinkSteamMethod())
              .addMethod(getListChannelMessagesMethod())
              .addMethod(getListFriendsMethod())
              .addMethod(getListFriendsOfFriendsMethod())
              .addMethod(getListGroupsMethod())
              .addMethod(getListGroupUsersMethod())
              .addMethod(getListLeaderboardRecordsMethod())
              .addMethod(getListLeaderboardRecordsAroundOwnerMethod())
              .addMethod(getListMatchesMethod())
              .addMethod(getListNotificationsMethod())
              .addMethod(getListStorageObjectsMethod())
              .addMethod(getListSubscriptionsMethod())
              .addMethod(getListTournamentsMethod())
              .addMethod(getListTournamentRecordsMethod())
              .addMethod(getListTournamentRecordsAroundOwnerMethod())
              .addMethod(getListUserGroupsMethod())
              .addMethod(getPromoteGroupUsersMethod())
              .addMethod(getDemoteGroupUsersMethod())
              .addMethod(getReadStorageObjectsMethod())
              .addMethod(getRpcFuncMethod())
              .addMethod(getUnlinkAppleMethod())
              .addMethod(getUnlinkCustomMethod())
              .addMethod(getUnlinkDeviceMethod())
              .addMethod(getUnlinkEmailMethod())
              .addMethod(getUnlinkFacebookMethod())
              .addMethod(getUnlinkFacebookInstantGameMethod())
              .addMethod(getUnlinkGameCenterMethod())
              .addMethod(getUnlinkGoogleMethod())
              .addMethod(getUnlinkSteamMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getUpdateGroupMethod())
              .addMethod(getValidatePurchaseAppleMethod())
              .addMethod(getValidateSubscriptionAppleMethod())
              .addMethod(getValidatePurchaseGoogleMethod())
              .addMethod(getValidateSubscriptionGoogleMethod())
              .addMethod(getValidatePurchaseHuaweiMethod())
              .addMethod(getValidatePurchaseFacebookInstantMethod())
              .addMethod(getWriteLeaderboardRecordMethod())
              .addMethod(getWriteStorageObjectsMethod())
              .addMethod(getWriteTournamentRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
