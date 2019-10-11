package com.heroiclabs.nakama.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 * The Nakama RPC protocol service built with GRPC.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: apigrpc.proto")
public final class NakamaGrpc {

  private NakamaGrpc() {}

  public static final String SERVICE_NAME = "nakama.api.Nakama";

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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AddFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AddFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AddGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AddGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getAddGroupUsersMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateFacebookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getAuthenticateFacebookMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateGameCenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateGoogleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "AuthenticateSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AuthenticateSteamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Session.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getAuthenticateSteamMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "BlockFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.BlockFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.CreateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Group.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateGroupMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "DeleteFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "DeleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "DeleteLeaderboardRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "DeleteNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getDeleteNotificationsMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "DeleteStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.DeleteStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Account.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.GetUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Users.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetUsersMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "Healthcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ImportFacebookFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ImportFacebookFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getImportFacebookFriendsMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "JoinGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.JoinGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "JoinTournament"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.JoinTournamentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "KickGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.KickGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LeaveGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaveGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getLeaveGroupMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountDevice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LinkFacebookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getLinkFacebookMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGameCenter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGoogle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getLinkGoogleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam,
      com.google.protobuf.Empty> getLinkSteamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinkSteam",
      requestType = com.heroiclabs.nakama.api.AccountSteam.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam,
      com.google.protobuf.Empty> getLinkSteamMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.nakama.api.AccountSteam, com.google.protobuf.Empty> getLinkSteamMethod;
    if ((getLinkSteamMethod = NakamaGrpc.getLinkSteamMethod) == null) {
      synchronized (NakamaGrpc.class) {
        if ((getLinkSteamMethod = NakamaGrpc.getLinkSteamMethod) == null) {
          NakamaGrpc.getLinkSteamMethod = getLinkSteamMethod = 
              io.grpc.MethodDescriptor.<com.heroiclabs.nakama.api.AccountSteam, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "LinkSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountSteam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListChannelMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListChannelMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ChannelMessageList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.FriendList.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getListFriendsMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.GroupList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.GroupUserList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListLeaderboardRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecordList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListLeaderboardRecordsAroundOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecordList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListMatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListMatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.MatchList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.NotificationList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjectList.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getListStorageObjectsMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListTournaments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListTournamentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentRecordList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListTournamentRecordsAroundOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.TournamentRecordList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ListUserGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ListUserGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.UserGroupList.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "PromoteGroupUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.PromoteGroupUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getPromoteGroupUsersMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "ReadStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.ReadStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjects.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "RpcFunc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Rpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.Rpc.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getRpcFuncMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountCustom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountDevice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkFacebook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountFacebook.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUnlinkFacebookMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkGameCenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGameCenter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkGoogle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountGoogle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UnlinkSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.AccountSteam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.UpdateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateGroupMethod;
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "WriteLeaderboardRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecord.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "WriteStorageObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteStorageObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.StorageObjectAcks.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(
                  "nakama.api.Nakama", "WriteTournamentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.WriteTournamentRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.heroiclabs.nakama.api.LeaderboardRecord.getDefaultInstance()))
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
    return new NakamaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NakamaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NakamaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NakamaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NakamaFutureStub(channel);
  }

  /**
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static abstract class NakamaImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public void addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public void addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public void authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public void authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public void authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public void authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public void authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public void authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public void authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public void blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public void createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public void deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public void deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public void deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLeaderboardRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public void deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public void deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public void event(com.heroiclabs.nakama.api.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public void getAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public void getUsers(com.heroiclabs.nakama.api.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Users> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public void healthcheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthcheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public void importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getImportFacebookFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public void joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public void joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinTournamentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public void kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getKickGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public void leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaveGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public void linkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public void linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public void linkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLinkSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public void listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ChannelMessageList> responseObserver) {
      asyncUnimplementedUnaryCall(getListChannelMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public void listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendList> responseObserver) {
      asyncUnimplementedUnaryCall(getListFriendsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public void listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupList> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public void listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupUserList> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public void listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      asyncUnimplementedUnaryCall(getListLeaderboardRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public void listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      asyncUnimplementedUnaryCall(getListLeaderboardRecordsAroundOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public void listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchList> responseObserver) {
      asyncUnimplementedUnaryCall(getListMatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public void listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.NotificationList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public void listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectList> responseObserver) {
      asyncUnimplementedUnaryCall(getListStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public void listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentList> responseObserver) {
      asyncUnimplementedUnaryCall(getListTournamentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public void listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      asyncUnimplementedUnaryCall(getListTournamentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public void listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      asyncUnimplementedUnaryCall(getListTournamentRecordsAroundOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public void listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.UserGroupList> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public void promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPromoteGroupUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public void readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects> responseObserver) {
      asyncUnimplementedUnaryCall(getReadStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public void rpcFunc(com.heroiclabs.nakama.api.Rpc request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc> responseObserver) {
      asyncUnimplementedUnaryCall(getRpcFuncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkFacebookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkGameCenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkGoogleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public void updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public void updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public void writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteLeaderboardRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public void writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectAcks> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteStorageObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public void writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteTournamentRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddFriendsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AddFriendsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_FRIENDS)))
          .addMethod(
            getAddGroupUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AddGroupUsersRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_GROUP_USERS)))
          .addMethod(
            getAuthenticateCustomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateCustomRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_CUSTOM)))
          .addMethod(
            getAuthenticateDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateDeviceRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_DEVICE)))
          .addMethod(
            getAuthenticateEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateEmailRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_EMAIL)))
          .addMethod(
            getAuthenticateFacebookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateFacebookRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_FACEBOOK)))
          .addMethod(
            getAuthenticateGameCenterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateGameCenterRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_GAME_CENTER)))
          .addMethod(
            getAuthenticateGoogleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateGoogleRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_GOOGLE)))
          .addMethod(
            getAuthenticateSteamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AuthenticateSteamRequest,
                com.heroiclabs.nakama.api.Session>(
                  this, METHODID_AUTHENTICATE_STEAM)))
          .addMethod(
            getBlockFriendsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.BlockFriendsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_BLOCK_FRIENDS)))
          .addMethod(
            getCreateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.CreateGroupRequest,
                com.heroiclabs.nakama.api.Group>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getDeleteFriendsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.DeleteFriendsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_FRIENDS)))
          .addMethod(
            getDeleteGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.DeleteGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_GROUP)))
          .addMethod(
            getDeleteLeaderboardRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_LEADERBOARD_RECORD)))
          .addMethod(
            getDeleteNotificationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.DeleteNotificationsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NOTIFICATIONS)))
          .addMethod(
            getDeleteStorageObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.DeleteStorageObjectsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_STORAGE_OBJECTS)))
          .addMethod(
            getEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.Event,
                com.google.protobuf.Empty>(
                  this, METHODID_EVENT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.heroiclabs.nakama.api.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.GetUsersRequest,
                com.heroiclabs.nakama.api.Users>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getHealthcheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_HEALTHCHECK)))
          .addMethod(
            getImportFacebookFriendsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ImportFacebookFriendsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_IMPORT_FACEBOOK_FRIENDS)))
          .addMethod(
            getJoinGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.JoinGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_JOIN_GROUP)))
          .addMethod(
            getJoinTournamentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.JoinTournamentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_JOIN_TOURNAMENT)))
          .addMethod(
            getKickGroupUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.KickGroupUsersRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_KICK_GROUP_USERS)))
          .addMethod(
            getLeaveGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.LeaveGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_LEAVE_GROUP)))
          .addMethod(
            getLinkCustomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountCustom,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_CUSTOM)))
          .addMethod(
            getLinkDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountDevice,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_DEVICE)))
          .addMethod(
            getLinkEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountEmail,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_EMAIL)))
          .addMethod(
            getLinkFacebookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.LinkFacebookRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_FACEBOOK)))
          .addMethod(
            getLinkGameCenterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountGameCenter,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_GAME_CENTER)))
          .addMethod(
            getLinkGoogleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountGoogle,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_GOOGLE)))
          .addMethod(
            getLinkSteamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountSteam,
                com.google.protobuf.Empty>(
                  this, METHODID_LINK_STEAM)))
          .addMethod(
            getListChannelMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListChannelMessagesRequest,
                com.heroiclabs.nakama.api.ChannelMessageList>(
                  this, METHODID_LIST_CHANNEL_MESSAGES)))
          .addMethod(
            getListFriendsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListFriendsRequest,
                com.heroiclabs.nakama.api.FriendList>(
                  this, METHODID_LIST_FRIENDS)))
          .addMethod(
            getListGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListGroupsRequest,
                com.heroiclabs.nakama.api.GroupList>(
                  this, METHODID_LIST_GROUPS)))
          .addMethod(
            getListGroupUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListGroupUsersRequest,
                com.heroiclabs.nakama.api.GroupUserList>(
                  this, METHODID_LIST_GROUP_USERS)))
          .addMethod(
            getListLeaderboardRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest,
                com.heroiclabs.nakama.api.LeaderboardRecordList>(
                  this, METHODID_LIST_LEADERBOARD_RECORDS)))
          .addMethod(
            getListLeaderboardRecordsAroundOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest,
                com.heroiclabs.nakama.api.LeaderboardRecordList>(
                  this, METHODID_LIST_LEADERBOARD_RECORDS_AROUND_OWNER)))
          .addMethod(
            getListMatchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListMatchesRequest,
                com.heroiclabs.nakama.api.MatchList>(
                  this, METHODID_LIST_MATCHES)))
          .addMethod(
            getListNotificationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListNotificationsRequest,
                com.heroiclabs.nakama.api.NotificationList>(
                  this, METHODID_LIST_NOTIFICATIONS)))
          .addMethod(
            getListStorageObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListStorageObjectsRequest,
                com.heroiclabs.nakama.api.StorageObjectList>(
                  this, METHODID_LIST_STORAGE_OBJECTS)))
          .addMethod(
            getListTournamentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListTournamentsRequest,
                com.heroiclabs.nakama.api.TournamentList>(
                  this, METHODID_LIST_TOURNAMENTS)))
          .addMethod(
            getListTournamentRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListTournamentRecordsRequest,
                com.heroiclabs.nakama.api.TournamentRecordList>(
                  this, METHODID_LIST_TOURNAMENT_RECORDS)))
          .addMethod(
            getListTournamentRecordsAroundOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest,
                com.heroiclabs.nakama.api.TournamentRecordList>(
                  this, METHODID_LIST_TOURNAMENT_RECORDS_AROUND_OWNER)))
          .addMethod(
            getListUserGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ListUserGroupsRequest,
                com.heroiclabs.nakama.api.UserGroupList>(
                  this, METHODID_LIST_USER_GROUPS)))
          .addMethod(
            getPromoteGroupUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.PromoteGroupUsersRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PROMOTE_GROUP_USERS)))
          .addMethod(
            getReadStorageObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.ReadStorageObjectsRequest,
                com.heroiclabs.nakama.api.StorageObjects>(
                  this, METHODID_READ_STORAGE_OBJECTS)))
          .addMethod(
            getRpcFuncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.Rpc,
                com.heroiclabs.nakama.api.Rpc>(
                  this, METHODID_RPC_FUNC)))
          .addMethod(
            getUnlinkCustomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountCustom,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_CUSTOM)))
          .addMethod(
            getUnlinkDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountDevice,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_DEVICE)))
          .addMethod(
            getUnlinkEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountEmail,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_EMAIL)))
          .addMethod(
            getUnlinkFacebookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountFacebook,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_FACEBOOK)))
          .addMethod(
            getUnlinkGameCenterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountGameCenter,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_GAME_CENTER)))
          .addMethod(
            getUnlinkGoogleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountGoogle,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_GOOGLE)))
          .addMethod(
            getUnlinkSteamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.AccountSteam,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK_STEAM)))
          .addMethod(
            getUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.UpdateAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getUpdateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.UpdateGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getWriteLeaderboardRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest,
                com.heroiclabs.nakama.api.LeaderboardRecord>(
                  this, METHODID_WRITE_LEADERBOARD_RECORD)))
          .addMethod(
            getWriteStorageObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.WriteStorageObjectsRequest,
                com.heroiclabs.nakama.api.StorageObjectAcks>(
                  this, METHODID_WRITE_STORAGE_OBJECTS)))
          .addMethod(
            getWriteTournamentRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.heroiclabs.nakama.api.WriteTournamentRecordRequest,
                com.heroiclabs.nakama.api.LeaderboardRecord>(
                  this, METHODID_WRITE_TOURNAMENT_RECORD)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaStub extends io.grpc.stub.AbstractStub<NakamaStub> {
    private NakamaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NakamaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NakamaStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public void addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public void addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public void authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public void authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public void authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public void authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public void authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public void authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public void authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public void blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public void createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public void deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public void deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public void deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLeaderboardRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public void deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public void deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public void event(com.heroiclabs.nakama.api.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public void getAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public void getUsers(com.heroiclabs.nakama.api.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Users> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public void healthcheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public void importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportFacebookFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public void joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public void joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinTournamentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public void kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKickGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public void leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public void linkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public void linkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public void linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public void linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public void linkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinkSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public void listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.ChannelMessageList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListChannelMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public void listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.FriendList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public void listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public void listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.GroupUserList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public void listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public void listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecordList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public void listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.MatchList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public void listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.NotificationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public void listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public void listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTournamentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public void listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTournamentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public void listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.TournamentRecordList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTournamentRecordsAroundOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public void listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.UserGroupList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public void promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPromoteGroupUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public void readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public void rpcFunc(com.heroiclabs.nakama.api.Rpc request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRpcFuncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkFacebookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkGameCenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkGoogleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public void unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkSteamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public void updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public void updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public void writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteLeaderboardRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public void writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjectAcks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteStorageObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public void writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.LeaderboardRecord> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteTournamentRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaBlockingStub extends io.grpc.stub.AbstractStub<NakamaBlockingStub> {
    private NakamaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NakamaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NakamaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public com.google.protobuf.Empty addFriends(com.heroiclabs.nakama.api.AddFriendsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public com.google.protobuf.Empty addGroupUsers(com.heroiclabs.nakama.api.AddGroupUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateCustom(com.heroiclabs.nakama.api.AuthenticateCustomRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateDevice(com.heroiclabs.nakama.api.AuthenticateDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateEmail(com.heroiclabs.nakama.api.AuthenticateEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateFacebook(com.heroiclabs.nakama.api.AuthenticateFacebookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateGameCenter(com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateGoogle(com.heroiclabs.nakama.api.AuthenticateGoogleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Session authenticateSteam(com.heroiclabs.nakama.api.AuthenticateSteamRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty blockFriends(com.heroiclabs.nakama.api.BlockFriendsRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Group createGroup(com.heroiclabs.nakama.api.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty deleteFriends(com.heroiclabs.nakama.api.DeleteFriendsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public com.google.protobuf.Empty deleteGroup(com.heroiclabs.nakama.api.DeleteGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteLeaderboardRecord(com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLeaderboardRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public com.google.protobuf.Empty deleteNotifications(com.heroiclabs.nakama.api.DeleteNotificationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public com.google.protobuf.Empty deleteStorageObjects(com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public com.google.protobuf.Empty event(com.heroiclabs.nakama.api.Event request) {
      return blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Account getAccount(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Users getUsers(com.heroiclabs.nakama.api.GetUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.protobuf.Empty healthcheck(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHealthcheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public com.google.protobuf.Empty importFacebookFriends(com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportFacebookFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public com.google.protobuf.Empty joinGroup(com.heroiclabs.nakama.api.JoinGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public com.google.protobuf.Empty joinTournament(com.heroiclabs.nakama.api.JoinTournamentRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinTournamentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public com.google.protobuf.Empty kickGroupUsers(com.heroiclabs.nakama.api.KickGroupUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getKickGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public com.google.protobuf.Empty leaveGroup(com.heroiclabs.nakama.api.LeaveGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getLeaveGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkCustom(com.heroiclabs.nakama.api.AccountCustom request) {
      return blockingUnaryCall(
          getChannel(), getLinkCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkDevice(com.heroiclabs.nakama.api.AccountDevice request) {
      return blockingUnaryCall(
          getChannel(), getLinkDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkEmail(com.heroiclabs.nakama.api.AccountEmail request) {
      return blockingUnaryCall(
          getChannel(), getLinkEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkFacebook(com.heroiclabs.nakama.api.LinkFacebookRequest request) {
      return blockingUnaryCall(
          getChannel(), getLinkFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request) {
      return blockingUnaryCall(
          getChannel(), getLinkGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkGoogle(com.heroiclabs.nakama.api.AccountGoogle request) {
      return blockingUnaryCall(
          getChannel(), getLinkGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty linkSteam(com.heroiclabs.nakama.api.AccountSteam request) {
      return blockingUnaryCall(
          getChannel(), getLinkSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public com.heroiclabs.nakama.api.ChannelMessageList listChannelMessages(com.heroiclabs.nakama.api.ListChannelMessagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListChannelMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public com.heroiclabs.nakama.api.FriendList listFriends(com.heroiclabs.nakama.api.ListFriendsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFriendsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public com.heroiclabs.nakama.api.GroupList listGroups(com.heroiclabs.nakama.api.ListGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public com.heroiclabs.nakama.api.GroupUserList listGroupUsers(com.heroiclabs.nakama.api.ListGroupUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecordList listLeaderboardRecords(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLeaderboardRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecordList listLeaderboardRecordsAroundOwner(com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public com.heroiclabs.nakama.api.MatchList listMatches(com.heroiclabs.nakama.api.ListMatchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public com.heroiclabs.nakama.api.NotificationList listNotifications(com.heroiclabs.nakama.api.ListNotificationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjectList listStorageObjects(com.heroiclabs.nakama.api.ListStorageObjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentList listTournaments(com.heroiclabs.nakama.api.ListTournamentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTournamentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentRecordList listTournamentRecords(com.heroiclabs.nakama.api.ListTournamentRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTournamentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public com.heroiclabs.nakama.api.TournamentRecordList listTournamentRecordsAroundOwner(com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTournamentRecordsAroundOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public com.heroiclabs.nakama.api.UserGroupList listUserGroups(com.heroiclabs.nakama.api.ListUserGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public com.google.protobuf.Empty promoteGroupUsers(com.heroiclabs.nakama.api.PromoteGroupUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getPromoteGroupUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjects readStorageObjects(com.heroiclabs.nakama.api.ReadStorageObjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public com.heroiclabs.nakama.api.Rpc rpcFunc(com.heroiclabs.nakama.api.Rpc request) {
      return blockingUnaryCall(
          getChannel(), getRpcFuncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkCustom(com.heroiclabs.nakama.api.AccountCustom request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkDevice(com.heroiclabs.nakama.api.AccountDevice request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkEmail(com.heroiclabs.nakama.api.AccountEmail request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkFacebook(com.heroiclabs.nakama.api.AccountFacebook request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkFacebookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkGameCenter(com.heroiclabs.nakama.api.AccountGameCenter request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkGameCenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkGoogle(com.heroiclabs.nakama.api.AccountGoogle request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkGoogleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty unlinkSteam(com.heroiclabs.nakama.api.AccountSteam request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkSteamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public com.google.protobuf.Empty updateAccount(com.heroiclabs.nakama.api.UpdateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public com.google.protobuf.Empty updateGroup(com.heroiclabs.nakama.api.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecord writeLeaderboardRecord(com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteLeaderboardRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public com.heroiclabs.nakama.api.StorageObjectAcks writeStorageObjects(com.heroiclabs.nakama.api.WriteStorageObjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteStorageObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public com.heroiclabs.nakama.api.LeaderboardRecord writeTournamentRecord(com.heroiclabs.nakama.api.WriteTournamentRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteTournamentRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * The Nakama RPC protocol service built with GRPC.
   * </pre>
   */
  public static final class NakamaFutureStub extends io.grpc.stub.AbstractStub<NakamaFutureStub> {
    private NakamaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NakamaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NakamaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NakamaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add friends by ID or username to a user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addFriends(
        com.heroiclabs.nakama.api.AddFriendsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add users to a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addGroupUsers(
        com.heroiclabs.nakama.api.AddGroupUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a custom id against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateCustom(
        com.heroiclabs.nakama.api.AuthenticateCustomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a device id against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateDevice(
        com.heroiclabs.nakama.api.AuthenticateDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with an email+password against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateEmail(
        com.heroiclabs.nakama.api.AuthenticateEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with a Facebook OAuth token against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateFacebook(
        com.heroiclabs.nakama.api.AuthenticateFacebookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Apple's GameCenter against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateGameCenter(
        com.heroiclabs.nakama.api.AuthenticateGameCenterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Google against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateGoogle(
        com.heroiclabs.nakama.api.AuthenticateGoogleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate a user with Steam against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Session> authenticateSteam(
        com.heroiclabs.nakama.api.AuthenticateSteamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block one or more users by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> blockFriends(
        com.heroiclabs.nakama.api.BlockFriendsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new group with the current user as the owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Group> createGroup(
        com.heroiclabs.nakama.api.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more users by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteFriends(
        com.heroiclabs.nakama.api.DeleteFriendsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a group by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGroup(
        com.heroiclabs.nakama.api.DeleteGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a leaderboard record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLeaderboardRecord(
        com.heroiclabs.nakama.api.DeleteLeaderboardRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLeaderboardRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more notifications for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNotifications(
        com.heroiclabs.nakama.api.DeleteNotificationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more objects by ID or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteStorageObjects(
        com.heroiclabs.nakama.api.DeleteStorageObjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit an event for processing in the server's registered runtime custom events handler.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> event(
        com.heroiclabs.nakama.api.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Account> getAccount(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch zero or more users by ID and/or username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Users> getUsers(
        com.heroiclabs.nakama.api.GetUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A healthcheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> healthcheck(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import Facebook friends and add them to a user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> importFacebookFriends(
        com.heroiclabs.nakama.api.ImportFacebookFriendsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportFacebookFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Immediately join an open group, or request to join a closed one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> joinGroup(
        com.heroiclabs.nakama.api.JoinGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attempt to join an open and running tournament.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> joinTournament(
        com.heroiclabs.nakama.api.JoinTournamentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinTournamentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kick a set of users from a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> kickGroupUsers(
        com.heroiclabs.nakama.api.KickGroupUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKickGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Leave a group the user is a member of.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> leaveGroup(
        com.heroiclabs.nakama.api.LeaveGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a custom ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkCustom(
        com.heroiclabs.nakama.api.AccountCustom request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a device ID to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkDevice(
        com.heroiclabs.nakama.api.AccountDevice request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an email+password to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkEmail(
        com.heroiclabs.nakama.api.AccountEmail request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Facebook to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkFacebook(
        com.heroiclabs.nakama.api.LinkFacebookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Apple's GameCenter to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkGameCenter(
        com.heroiclabs.nakama.api.AccountGameCenter request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Google to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkGoogle(
        com.heroiclabs.nakama.api.AccountGoogle request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Steam to the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> linkSteam(
        com.heroiclabs.nakama.api.AccountSteam request) {
      return futureUnaryCall(
          getChannel().newCall(getLinkSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List a channel's message history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.ChannelMessageList> listChannelMessages(
        com.heroiclabs.nakama.api.ListChannelMessagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListChannelMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all friends for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.FriendList> listFriends(
        com.heroiclabs.nakama.api.ListFriendsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFriendsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List groups based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.GroupList> listGroups(
        com.heroiclabs.nakama.api.ListGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all users that are part of a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.GroupUserList> listGroupUsers(
        com.heroiclabs.nakama.api.ListGroupUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List leaderboard records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecordList> listLeaderboardRecords(
        com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List leaderboard records that belong to a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecordList> listLeaderboardRecordsAroundOwner(
        com.heroiclabs.nakama.api.ListLeaderboardRecordsAroundOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLeaderboardRecordsAroundOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch list of running matches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.MatchList> listMatches(
        com.heroiclabs.nakama.api.ListMatchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch list of notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.NotificationList> listNotifications(
        com.heroiclabs.nakama.api.ListNotificationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List publicly readable storage objects in a given collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjectList> listStorageObjects(
        com.heroiclabs.nakama.api.ListStorageObjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List current or upcoming tournaments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentList> listTournaments(
        com.heroiclabs.nakama.api.ListTournamentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTournamentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tournament records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentRecordList> listTournamentRecords(
        com.heroiclabs.nakama.api.ListTournamentRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTournamentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tournament records for a given owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.TournamentRecordList> listTournamentRecordsAroundOwner(
        com.heroiclabs.nakama.api.ListTournamentRecordsAroundOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTournamentRecordsAroundOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List groups the current user belongs to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.UserGroupList> listUserGroups(
        com.heroiclabs.nakama.api.ListUserGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote a set of users in a group to the next role up.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> promoteGroupUsers(
        com.heroiclabs.nakama.api.PromoteGroupUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPromoteGroupUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get storage objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjects> readStorageObjects(
        com.heroiclabs.nakama.api.ReadStorageObjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a Lua function on the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.Rpc> rpcFunc(
        com.heroiclabs.nakama.api.Rpc request) {
      return futureUnaryCall(
          getChannel().newCall(getRpcFuncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the custom ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkCustom(
        com.heroiclabs.nakama.api.AccountCustom request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the device ID from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkDevice(
        com.heroiclabs.nakama.api.AccountDevice request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove the email+password from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkEmail(
        com.heroiclabs.nakama.api.AccountEmail request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Facebook from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkFacebook(
        com.heroiclabs.nakama.api.AccountFacebook request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkFacebookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Apple's GameCenter from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkGameCenter(
        com.heroiclabs.nakama.api.AccountGameCenter request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkGameCenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Google from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkGoogle(
        com.heroiclabs.nakama.api.AccountGoogle request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkGoogleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove Steam from the social profiles on the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlinkSteam(
        com.heroiclabs.nakama.api.AccountSteam request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkSteamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update fields in the current user's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAccount(
        com.heroiclabs.nakama.api.UpdateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update fields in a given group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateGroup(
        com.heroiclabs.nakama.api.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write a record to a leaderboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecord> writeLeaderboardRecord(
        com.heroiclabs.nakama.api.WriteLeaderboardRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteLeaderboardRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write objects into the storage engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.StorageObjectAcks> writeStorageObjects(
        com.heroiclabs.nakama.api.WriteStorageObjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteStorageObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write a record to a tournament.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.nakama.api.LeaderboardRecord> writeTournamentRecord(
        com.heroiclabs.nakama.api.WriteTournamentRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteTournamentRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_FRIENDS = 0;
  private static final int METHODID_ADD_GROUP_USERS = 1;
  private static final int METHODID_AUTHENTICATE_CUSTOM = 2;
  private static final int METHODID_AUTHENTICATE_DEVICE = 3;
  private static final int METHODID_AUTHENTICATE_EMAIL = 4;
  private static final int METHODID_AUTHENTICATE_FACEBOOK = 5;
  private static final int METHODID_AUTHENTICATE_GAME_CENTER = 6;
  private static final int METHODID_AUTHENTICATE_GOOGLE = 7;
  private static final int METHODID_AUTHENTICATE_STEAM = 8;
  private static final int METHODID_BLOCK_FRIENDS = 9;
  private static final int METHODID_CREATE_GROUP = 10;
  private static final int METHODID_DELETE_FRIENDS = 11;
  private static final int METHODID_DELETE_GROUP = 12;
  private static final int METHODID_DELETE_LEADERBOARD_RECORD = 13;
  private static final int METHODID_DELETE_NOTIFICATIONS = 14;
  private static final int METHODID_DELETE_STORAGE_OBJECTS = 15;
  private static final int METHODID_EVENT = 16;
  private static final int METHODID_GET_ACCOUNT = 17;
  private static final int METHODID_GET_USERS = 18;
  private static final int METHODID_HEALTHCHECK = 19;
  private static final int METHODID_IMPORT_FACEBOOK_FRIENDS = 20;
  private static final int METHODID_JOIN_GROUP = 21;
  private static final int METHODID_JOIN_TOURNAMENT = 22;
  private static final int METHODID_KICK_GROUP_USERS = 23;
  private static final int METHODID_LEAVE_GROUP = 24;
  private static final int METHODID_LINK_CUSTOM = 25;
  private static final int METHODID_LINK_DEVICE = 26;
  private static final int METHODID_LINK_EMAIL = 27;
  private static final int METHODID_LINK_FACEBOOK = 28;
  private static final int METHODID_LINK_GAME_CENTER = 29;
  private static final int METHODID_LINK_GOOGLE = 30;
  private static final int METHODID_LINK_STEAM = 31;
  private static final int METHODID_LIST_CHANNEL_MESSAGES = 32;
  private static final int METHODID_LIST_FRIENDS = 33;
  private static final int METHODID_LIST_GROUPS = 34;
  private static final int METHODID_LIST_GROUP_USERS = 35;
  private static final int METHODID_LIST_LEADERBOARD_RECORDS = 36;
  private static final int METHODID_LIST_LEADERBOARD_RECORDS_AROUND_OWNER = 37;
  private static final int METHODID_LIST_MATCHES = 38;
  private static final int METHODID_LIST_NOTIFICATIONS = 39;
  private static final int METHODID_LIST_STORAGE_OBJECTS = 40;
  private static final int METHODID_LIST_TOURNAMENTS = 41;
  private static final int METHODID_LIST_TOURNAMENT_RECORDS = 42;
  private static final int METHODID_LIST_TOURNAMENT_RECORDS_AROUND_OWNER = 43;
  private static final int METHODID_LIST_USER_GROUPS = 44;
  private static final int METHODID_PROMOTE_GROUP_USERS = 45;
  private static final int METHODID_READ_STORAGE_OBJECTS = 46;
  private static final int METHODID_RPC_FUNC = 47;
  private static final int METHODID_UNLINK_CUSTOM = 48;
  private static final int METHODID_UNLINK_DEVICE = 49;
  private static final int METHODID_UNLINK_EMAIL = 50;
  private static final int METHODID_UNLINK_FACEBOOK = 51;
  private static final int METHODID_UNLINK_GAME_CENTER = 52;
  private static final int METHODID_UNLINK_GOOGLE = 53;
  private static final int METHODID_UNLINK_STEAM = 54;
  private static final int METHODID_UPDATE_ACCOUNT = 55;
  private static final int METHODID_UPDATE_GROUP = 56;
  private static final int METHODID_WRITE_LEADERBOARD_RECORD = 57;
  private static final int METHODID_WRITE_STORAGE_OBJECTS = 58;
  private static final int METHODID_WRITE_TOURNAMENT_RECORD = 59;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NakamaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NakamaImplBase serviceImpl, int methodId) {
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
        case METHODID_BLOCK_FRIENDS:
          serviceImpl.blockFriends((com.heroiclabs.nakama.api.BlockFriendsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.heroiclabs.nakama.api.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Group>) responseObserver);
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
        case METHODID_HEALTHCHECK:
          serviceImpl.healthcheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IMPORT_FACEBOOK_FRIENDS:
          serviceImpl.importFacebookFriends((com.heroiclabs.nakama.api.ImportFacebookFriendsRequest) request,
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
        case METHODID_LINK_GAME_CENTER:
          serviceImpl.linkGameCenter((com.heroiclabs.nakama.api.AccountGameCenter) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_GOOGLE:
          serviceImpl.linkGoogle((com.heroiclabs.nakama.api.AccountGoogle) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LINK_STEAM:
          serviceImpl.linkSteam((com.heroiclabs.nakama.api.AccountSteam) request,
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
        case METHODID_READ_STORAGE_OBJECTS:
          serviceImpl.readStorageObjects((com.heroiclabs.nakama.api.ReadStorageObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.StorageObjects>) responseObserver);
          break;
        case METHODID_RPC_FUNC:
          serviceImpl.rpcFunc((com.heroiclabs.nakama.api.Rpc) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.nakama.api.Rpc>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NakamaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddFriendsMethod())
              .addMethod(getAddGroupUsersMethod())
              .addMethod(getAuthenticateCustomMethod())
              .addMethod(getAuthenticateDeviceMethod())
              .addMethod(getAuthenticateEmailMethod())
              .addMethod(getAuthenticateFacebookMethod())
              .addMethod(getAuthenticateGameCenterMethod())
              .addMethod(getAuthenticateGoogleMethod())
              .addMethod(getAuthenticateSteamMethod())
              .addMethod(getBlockFriendsMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getDeleteFriendsMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getDeleteLeaderboardRecordMethod())
              .addMethod(getDeleteNotificationsMethod())
              .addMethod(getDeleteStorageObjectsMethod())
              .addMethod(getEventMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getHealthcheckMethod())
              .addMethod(getImportFacebookFriendsMethod())
              .addMethod(getJoinGroupMethod())
              .addMethod(getJoinTournamentMethod())
              .addMethod(getKickGroupUsersMethod())
              .addMethod(getLeaveGroupMethod())
              .addMethod(getLinkCustomMethod())
              .addMethod(getLinkDeviceMethod())
              .addMethod(getLinkEmailMethod())
              .addMethod(getLinkFacebookMethod())
              .addMethod(getLinkGameCenterMethod())
              .addMethod(getLinkGoogleMethod())
              .addMethod(getLinkSteamMethod())
              .addMethod(getListChannelMessagesMethod())
              .addMethod(getListFriendsMethod())
              .addMethod(getListGroupsMethod())
              .addMethod(getListGroupUsersMethod())
              .addMethod(getListLeaderboardRecordsMethod())
              .addMethod(getListLeaderboardRecordsAroundOwnerMethod())
              .addMethod(getListMatchesMethod())
              .addMethod(getListNotificationsMethod())
              .addMethod(getListStorageObjectsMethod())
              .addMethod(getListTournamentsMethod())
              .addMethod(getListTournamentRecordsMethod())
              .addMethod(getListTournamentRecordsAroundOwnerMethod())
              .addMethod(getListUserGroupsMethod())
              .addMethod(getPromoteGroupUsersMethod())
              .addMethod(getReadStorageObjectsMethod())
              .addMethod(getRpcFuncMethod())
              .addMethod(getUnlinkCustomMethod())
              .addMethod(getUnlinkDeviceMethod())
              .addMethod(getUnlinkEmailMethod())
              .addMethod(getUnlinkFacebookMethod())
              .addMethod(getUnlinkGameCenterMethod())
              .addMethod(getUnlinkGoogleMethod())
              .addMethod(getUnlinkSteamMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getUpdateGroupMethod())
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
