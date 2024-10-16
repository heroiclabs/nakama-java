package com.heroiclabs.satori.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * The GRPC protocol service for Satori built with GRPC.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: github.com/heroiclabs/satori/api/satori.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SatoriGrpc {

  private SatoriGrpc() {}

  public static final java.lang.String SERVICE_NAME = "satori.api.Satori";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRequest,
      com.heroiclabs.satori.api.Session> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = com.heroiclabs.satori.api.AuthenticateRequest.class,
      responseType = com.heroiclabs.satori.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRequest,
      com.heroiclabs.satori.api.Session> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRequest, com.heroiclabs.satori.api.Session> getAuthenticateMethod;
    if ((getAuthenticateMethod = SatoriGrpc.getAuthenticateMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getAuthenticateMethod = SatoriGrpc.getAuthenticateMethod) == null) {
          SatoriGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.AuthenticateRequest, com.heroiclabs.satori.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateLogoutRequest,
      com.google.protobuf.Empty> getAuthenticateLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateLogout",
      requestType = com.heroiclabs.satori.api.AuthenticateLogoutRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateLogoutRequest,
      com.google.protobuf.Empty> getAuthenticateLogoutMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateLogoutRequest, com.google.protobuf.Empty> getAuthenticateLogoutMethod;
    if ((getAuthenticateLogoutMethod = SatoriGrpc.getAuthenticateLogoutMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getAuthenticateLogoutMethod = SatoriGrpc.getAuthenticateLogoutMethod) == null) {
          SatoriGrpc.getAuthenticateLogoutMethod = getAuthenticateLogoutMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.AuthenticateLogoutRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.AuthenticateLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("AuthenticateLogout"))
              .build();
        }
      }
    }
    return getAuthenticateLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRefreshRequest,
      com.heroiclabs.satori.api.Session> getAuthenticateRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateRefresh",
      requestType = com.heroiclabs.satori.api.AuthenticateRefreshRequest.class,
      responseType = com.heroiclabs.satori.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRefreshRequest,
      com.heroiclabs.satori.api.Session> getAuthenticateRefreshMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.AuthenticateRefreshRequest, com.heroiclabs.satori.api.Session> getAuthenticateRefreshMethod;
    if ((getAuthenticateRefreshMethod = SatoriGrpc.getAuthenticateRefreshMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getAuthenticateRefreshMethod = SatoriGrpc.getAuthenticateRefreshMethod) == null) {
          SatoriGrpc.getAuthenticateRefreshMethod = getAuthenticateRefreshMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.AuthenticateRefreshRequest, com.heroiclabs.satori.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateRefresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.AuthenticateRefreshRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("AuthenticateRefresh"))
              .build();
        }
      }
    }
    return getAuthenticateRefreshMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIdentity",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteIdentityMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeleteIdentityMethod;
    if ((getDeleteIdentityMethod = SatoriGrpc.getDeleteIdentityMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getDeleteIdentityMethod = SatoriGrpc.getDeleteIdentityMethod) == null) {
          SatoriGrpc.getDeleteIdentityMethod = getDeleteIdentityMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("DeleteIdentity"))
              .build();
        }
      }
    }
    return getDeleteIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.EventRequest,
      com.google.protobuf.Empty> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = com.heroiclabs.satori.api.EventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.EventRequest,
      com.google.protobuf.Empty> getEventMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.EventRequest, com.google.protobuf.Empty> getEventMethod;
    if ((getEventMethod = SatoriGrpc.getEventMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getEventMethod = SatoriGrpc.getEventMethod) == null) {
          SatoriGrpc.getEventMethod = getEventMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.EventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("Event"))
              .build();
        }
      }
    }
    return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetExperimentsRequest,
      com.heroiclabs.satori.api.ExperimentList> getGetExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExperiments",
      requestType = com.heroiclabs.satori.api.GetExperimentsRequest.class,
      responseType = com.heroiclabs.satori.api.ExperimentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetExperimentsRequest,
      com.heroiclabs.satori.api.ExperimentList> getGetExperimentsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetExperimentsRequest, com.heroiclabs.satori.api.ExperimentList> getGetExperimentsMethod;
    if ((getGetExperimentsMethod = SatoriGrpc.getGetExperimentsMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getGetExperimentsMethod = SatoriGrpc.getGetExperimentsMethod) == null) {
          SatoriGrpc.getGetExperimentsMethod = getGetExperimentsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.GetExperimentsRequest, com.heroiclabs.satori.api.ExperimentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.GetExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.ExperimentList.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("GetExperiments"))
              .build();
        }
      }
    }
    return getGetExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetFlagsRequest,
      com.heroiclabs.satori.api.FlagList> getGetFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlags",
      requestType = com.heroiclabs.satori.api.GetFlagsRequest.class,
      responseType = com.heroiclabs.satori.api.FlagList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetFlagsRequest,
      com.heroiclabs.satori.api.FlagList> getGetFlagsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetFlagsRequest, com.heroiclabs.satori.api.FlagList> getGetFlagsMethod;
    if ((getGetFlagsMethod = SatoriGrpc.getGetFlagsMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getGetFlagsMethod = SatoriGrpc.getGetFlagsMethod) == null) {
          SatoriGrpc.getGetFlagsMethod = getGetFlagsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.GetFlagsRequest, com.heroiclabs.satori.api.FlagList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.GetFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.FlagList.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("GetFlags"))
              .build();
        }
      }
    }
    return getGetFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetLiveEventsRequest,
      com.heroiclabs.satori.api.LiveEventList> getGetLiveEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLiveEvents",
      requestType = com.heroiclabs.satori.api.GetLiveEventsRequest.class,
      responseType = com.heroiclabs.satori.api.LiveEventList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetLiveEventsRequest,
      com.heroiclabs.satori.api.LiveEventList> getGetLiveEventsMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetLiveEventsRequest, com.heroiclabs.satori.api.LiveEventList> getGetLiveEventsMethod;
    if ((getGetLiveEventsMethod = SatoriGrpc.getGetLiveEventsMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getGetLiveEventsMethod = SatoriGrpc.getGetLiveEventsMethod) == null) {
          SatoriGrpc.getGetLiveEventsMethod = getGetLiveEventsMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.GetLiveEventsRequest, com.heroiclabs.satori.api.LiveEventList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLiveEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.GetLiveEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.LiveEventList.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("GetLiveEvents"))
              .build();
        }
      }
    }
    return getGetLiveEventsMethod;
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
    if ((getHealthcheckMethod = SatoriGrpc.getHealthcheckMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getHealthcheckMethod = SatoriGrpc.getHealthcheckMethod) == null) {
          SatoriGrpc.getHealthcheckMethod = getHealthcheckMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Healthcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("Healthcheck"))
              .build();
        }
      }
    }
    return getHealthcheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.IdentifyRequest,
      com.heroiclabs.satori.api.Session> getIdentifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Identify",
      requestType = com.heroiclabs.satori.api.IdentifyRequest.class,
      responseType = com.heroiclabs.satori.api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.IdentifyRequest,
      com.heroiclabs.satori.api.Session> getIdentifyMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.IdentifyRequest, com.heroiclabs.satori.api.Session> getIdentifyMethod;
    if ((getIdentifyMethod = SatoriGrpc.getIdentifyMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getIdentifyMethod = SatoriGrpc.getIdentifyMethod) == null) {
          SatoriGrpc.getIdentifyMethod = getIdentifyMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.IdentifyRequest, com.heroiclabs.satori.api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Identify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.IdentifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("Identify"))
              .build();
        }
      }
    }
    return getIdentifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.satori.api.Properties> getListPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProperties",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.heroiclabs.satori.api.Properties.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.heroiclabs.satori.api.Properties> getListPropertiesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.heroiclabs.satori.api.Properties> getListPropertiesMethod;
    if ((getListPropertiesMethod = SatoriGrpc.getListPropertiesMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getListPropertiesMethod = SatoriGrpc.getListPropertiesMethod) == null) {
          SatoriGrpc.getListPropertiesMethod = getListPropertiesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.heroiclabs.satori.api.Properties>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.Properties.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("ListProperties"))
              .build();
        }
      }
    }
    return getListPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getReadycheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Readycheck",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getReadycheckMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getReadycheckMethod;
    if ((getReadycheckMethod = SatoriGrpc.getReadycheckMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getReadycheckMethod = SatoriGrpc.getReadycheckMethod) == null) {
          SatoriGrpc.getReadycheckMethod = getReadycheckMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Readycheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("Readycheck"))
              .build();
        }
      }
    }
    return getReadycheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdatePropertiesRequest,
      com.google.protobuf.Empty> getUpdatePropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProperties",
      requestType = com.heroiclabs.satori.api.UpdatePropertiesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdatePropertiesRequest,
      com.google.protobuf.Empty> getUpdatePropertiesMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdatePropertiesRequest, com.google.protobuf.Empty> getUpdatePropertiesMethod;
    if ((getUpdatePropertiesMethod = SatoriGrpc.getUpdatePropertiesMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getUpdatePropertiesMethod = SatoriGrpc.getUpdatePropertiesMethod) == null) {
          SatoriGrpc.getUpdatePropertiesMethod = getUpdatePropertiesMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.UpdatePropertiesRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.UpdatePropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("UpdateProperties"))
              .build();
        }
      }
    }
    return getUpdatePropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetMessageListRequest,
      com.heroiclabs.satori.api.GetMessageListResponse> getGetMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessageList",
      requestType = com.heroiclabs.satori.api.GetMessageListRequest.class,
      responseType = com.heroiclabs.satori.api.GetMessageListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetMessageListRequest,
      com.heroiclabs.satori.api.GetMessageListResponse> getGetMessageListMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.GetMessageListRequest, com.heroiclabs.satori.api.GetMessageListResponse> getGetMessageListMethod;
    if ((getGetMessageListMethod = SatoriGrpc.getGetMessageListMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getGetMessageListMethod = SatoriGrpc.getGetMessageListMethod) == null) {
          SatoriGrpc.getGetMessageListMethod = getGetMessageListMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.GetMessageListRequest, com.heroiclabs.satori.api.GetMessageListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.GetMessageListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.GetMessageListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("GetMessageList"))
              .build();
        }
      }
    }
    return getGetMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdateMessageRequest,
      com.google.protobuf.Empty> getUpdateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMessage",
      requestType = com.heroiclabs.satori.api.UpdateMessageRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdateMessageRequest,
      com.google.protobuf.Empty> getUpdateMessageMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.UpdateMessageRequest, com.google.protobuf.Empty> getUpdateMessageMethod;
    if ((getUpdateMessageMethod = SatoriGrpc.getUpdateMessageMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getUpdateMessageMethod = SatoriGrpc.getUpdateMessageMethod) == null) {
          SatoriGrpc.getUpdateMessageMethod = getUpdateMessageMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.UpdateMessageRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.UpdateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("UpdateMessage"))
              .build();
        }
      }
    }
    return getUpdateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.heroiclabs.satori.api.DeleteMessageRequest,
      com.google.protobuf.Empty> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMessage",
      requestType = com.heroiclabs.satori.api.DeleteMessageRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.heroiclabs.satori.api.DeleteMessageRequest,
      com.google.protobuf.Empty> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<com.heroiclabs.satori.api.DeleteMessageRequest, com.google.protobuf.Empty> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = SatoriGrpc.getDeleteMessageMethod) == null) {
      synchronized (SatoriGrpc.class) {
        if ((getDeleteMessageMethod = SatoriGrpc.getDeleteMessageMethod) == null) {
          SatoriGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.heroiclabs.satori.api.DeleteMessageRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.heroiclabs.satori.api.DeleteMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SatoriMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SatoriStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatoriStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatoriStub>() {
        @java.lang.Override
        public SatoriStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatoriStub(channel, callOptions);
        }
      };
    return SatoriStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SatoriBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatoriBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatoriBlockingStub>() {
        @java.lang.Override
        public SatoriBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatoriBlockingStub(channel, callOptions);
        }
      };
    return SatoriBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SatoriFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatoriFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatoriFutureStub>() {
        @java.lang.Override
        public SatoriFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatoriFutureStub(channel, callOptions);
        }
      };
    return SatoriFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * The GRPC protocol service for Satori built with GRPC.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Authenticate against the server.
     * </pre>
     */
    default void authenticate(com.heroiclabs.satori.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    default void authenticateLogout(com.heroiclabs.satori.api.AuthenticateLogoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    default void authenticateRefresh(com.heroiclabs.satori.api.AuthenticateRefreshRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateRefreshMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the caller's identity and associated data.
     * </pre>
     */
    default void deleteIdentity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIdentityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish an event for this session.
     * </pre>
     */
    default void event(com.heroiclabs.satori.api.EventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get or list all available experiments for this identity.
     * </pre>
     */
    default void getExperiments(com.heroiclabs.satori.api.GetExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.ExperimentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all available flags for this identity.
     * </pre>
     */
    default void getFlags(com.heroiclabs.satori.api.GetFlagsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.FlagList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available live events.
     * </pre>
     */
    default void getLiveEvents(com.heroiclabs.satori.api.GetLiveEventsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.LiveEventList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLiveEventsMethod(), responseObserver);
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
     * Enrich/replace the current session with new identifier.
     * </pre>
     */
    default void identify(com.heroiclabs.satori.api.IdentifyRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIdentifyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List properties associated with this identity.
     * </pre>
     */
    default void listProperties(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Properties> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * A readycheck which load balancers can use to check the service.
     * </pre>
     */
    default void readycheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadycheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update identity properties.
     * </pre>
     */
    default void updateProperties(com.heroiclabs.satori.api.UpdatePropertiesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of messages for the identity.
     * </pre>
     */
    default void getMessageList(com.heroiclabs.satori.api.GetMessageListRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.GetMessageListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a message for an identity.
     * </pre>
     */
    default void updateMessage(com.heroiclabs.satori.api.UpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a message for an identity.
     * </pre>
     */
    default void deleteMessage(com.heroiclabs.satori.api.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Satori.
   * <pre>
   **
   * The GRPC protocol service for Satori built with GRPC.
   * </pre>
   */
  public static abstract class SatoriImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SatoriGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Satori.
   * <pre>
   **
   * The GRPC protocol service for Satori built with GRPC.
   * </pre>
   */
  public static final class SatoriStub
      extends io.grpc.stub.AbstractAsyncStub<SatoriStub> {
    private SatoriStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatoriStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatoriStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate against the server.
     * </pre>
     */
    public void authenticate(com.heroiclabs.satori.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public void authenticateLogout(com.heroiclabs.satori.api.AuthenticateLogoutRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public void authenticateRefresh(com.heroiclabs.satori.api.AuthenticateRefreshRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateRefreshMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the caller's identity and associated data.
     * </pre>
     */
    public void deleteIdentity(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish an event for this session.
     * </pre>
     */
    public void event(com.heroiclabs.satori.api.EventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get or list all available experiments for this identity.
     * </pre>
     */
    public void getExperiments(com.heroiclabs.satori.api.GetExperimentsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.ExperimentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all available flags for this identity.
     * </pre>
     */
    public void getFlags(com.heroiclabs.satori.api.GetFlagsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.FlagList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available live events.
     * </pre>
     */
    public void getLiveEvents(com.heroiclabs.satori.api.GetLiveEventsRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.LiveEventList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLiveEventsMethod(), getCallOptions()), request, responseObserver);
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
     * Enrich/replace the current session with new identifier.
     * </pre>
     */
    public void identify(com.heroiclabs.satori.api.IdentifyRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIdentifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List properties associated with this identity.
     * </pre>
     */
    public void listProperties(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Properties> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A readycheck which load balancers can use to check the service.
     * </pre>
     */
    public void readycheck(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadycheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update identity properties.
     * </pre>
     */
    public void updateProperties(com.heroiclabs.satori.api.UpdatePropertiesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of messages for the identity.
     * </pre>
     */
    public void getMessageList(com.heroiclabs.satori.api.GetMessageListRequest request,
        io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.GetMessageListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a message for an identity.
     * </pre>
     */
    public void updateMessage(com.heroiclabs.satori.api.UpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a message for an identity.
     * </pre>
     */
    public void deleteMessage(com.heroiclabs.satori.api.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Satori.
   * <pre>
   **
   * The GRPC protocol service for Satori built with GRPC.
   * </pre>
   */
  public static final class SatoriBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SatoriBlockingStub> {
    private SatoriBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatoriBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatoriBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate against the server.
     * </pre>
     */
    public com.heroiclabs.satori.api.Session authenticate(com.heroiclabs.satori.api.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public com.google.protobuf.Empty authenticateLogout(com.heroiclabs.satori.api.AuthenticateLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public com.heroiclabs.satori.api.Session authenticateRefresh(com.heroiclabs.satori.api.AuthenticateRefreshRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateRefreshMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the caller's identity and associated data.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIdentity(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish an event for this session.
     * </pre>
     */
    public com.google.protobuf.Empty event(com.heroiclabs.satori.api.EventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get or list all available experiments for this identity.
     * </pre>
     */
    public com.heroiclabs.satori.api.ExperimentList getExperiments(com.heroiclabs.satori.api.GetExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all available flags for this identity.
     * </pre>
     */
    public com.heroiclabs.satori.api.FlagList getFlags(com.heroiclabs.satori.api.GetFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available live events.
     * </pre>
     */
    public com.heroiclabs.satori.api.LiveEventList getLiveEvents(com.heroiclabs.satori.api.GetLiveEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLiveEventsMethod(), getCallOptions(), request);
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
     * Enrich/replace the current session with new identifier.
     * </pre>
     */
    public com.heroiclabs.satori.api.Session identify(com.heroiclabs.satori.api.IdentifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIdentifyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List properties associated with this identity.
     * </pre>
     */
    public com.heroiclabs.satori.api.Properties listProperties(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A readycheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.protobuf.Empty readycheck(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadycheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update identity properties.
     * </pre>
     */
    public com.google.protobuf.Empty updateProperties(com.heroiclabs.satori.api.UpdatePropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of messages for the identity.
     * </pre>
     */
    public com.heroiclabs.satori.api.GetMessageListResponse getMessageList(com.heroiclabs.satori.api.GetMessageListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a message for an identity.
     * </pre>
     */
    public com.google.protobuf.Empty updateMessage(com.heroiclabs.satori.api.UpdateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a message for an identity.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMessage(com.heroiclabs.satori.api.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Satori.
   * <pre>
   **
   * The GRPC protocol service for Satori built with GRPC.
   * </pre>
   */
  public static final class SatoriFutureStub
      extends io.grpc.stub.AbstractFutureStub<SatoriFutureStub> {
    private SatoriFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatoriFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatoriFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate against the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.Session> authenticate(
        com.heroiclabs.satori.api.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Log out a session, invalidate a refresh token, or log out all sessions/refresh tokens for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> authenticateLogout(
        com.heroiclabs.satori.api.AuthenticateLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Refresh a user's session using a refresh token retrieved from a previous authentication request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.Session> authenticateRefresh(
        com.heroiclabs.satori.api.AuthenticateRefreshRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateRefreshMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the caller's identity and associated data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIdentity(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIdentityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish an event for this session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> event(
        com.heroiclabs.satori.api.EventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get or list all available experiments for this identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.ExperimentList> getExperiments(
        com.heroiclabs.satori.api.GetExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all available flags for this identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.FlagList> getFlags(
        com.heroiclabs.satori.api.GetFlagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available live events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.LiveEventList> getLiveEvents(
        com.heroiclabs.satori.api.GetLiveEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLiveEventsMethod(), getCallOptions()), request);
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
     * Enrich/replace the current session with new identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.Session> identify(
        com.heroiclabs.satori.api.IdentifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIdentifyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List properties associated with this identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.Properties> listProperties(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A readycheck which load balancers can use to check the service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> readycheck(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadycheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update identity properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateProperties(
        com.heroiclabs.satori.api.UpdatePropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the list of messages for the identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heroiclabs.satori.api.GetMessageListResponse> getMessageList(
        com.heroiclabs.satori.api.GetMessageListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a message for an identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateMessage(
        com.heroiclabs.satori.api.UpdateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a message for an identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMessage(
        com.heroiclabs.satori.api.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;
  private static final int METHODID_AUTHENTICATE_LOGOUT = 1;
  private static final int METHODID_AUTHENTICATE_REFRESH = 2;
  private static final int METHODID_DELETE_IDENTITY = 3;
  private static final int METHODID_EVENT = 4;
  private static final int METHODID_GET_EXPERIMENTS = 5;
  private static final int METHODID_GET_FLAGS = 6;
  private static final int METHODID_GET_LIVE_EVENTS = 7;
  private static final int METHODID_HEALTHCHECK = 8;
  private static final int METHODID_IDENTIFY = 9;
  private static final int METHODID_LIST_PROPERTIES = 10;
  private static final int METHODID_READYCHECK = 11;
  private static final int METHODID_UPDATE_PROPERTIES = 12;
  private static final int METHODID_GET_MESSAGE_LIST = 13;
  private static final int METHODID_UPDATE_MESSAGE = 14;
  private static final int METHODID_DELETE_MESSAGE = 15;

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
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.heroiclabs.satori.api.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_LOGOUT:
          serviceImpl.authenticateLogout((com.heroiclabs.satori.api.AuthenticateLogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_REFRESH:
          serviceImpl.authenticateRefresh((com.heroiclabs.satori.api.AuthenticateRefreshRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session>) responseObserver);
          break;
        case METHODID_DELETE_IDENTITY:
          serviceImpl.deleteIdentity((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((com.heroiclabs.satori.api.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_EXPERIMENTS:
          serviceImpl.getExperiments((com.heroiclabs.satori.api.GetExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.ExperimentList>) responseObserver);
          break;
        case METHODID_GET_FLAGS:
          serviceImpl.getFlags((com.heroiclabs.satori.api.GetFlagsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.FlagList>) responseObserver);
          break;
        case METHODID_GET_LIVE_EVENTS:
          serviceImpl.getLiveEvents((com.heroiclabs.satori.api.GetLiveEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.LiveEventList>) responseObserver);
          break;
        case METHODID_HEALTHCHECK:
          serviceImpl.healthcheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IDENTIFY:
          serviceImpl.identify((com.heroiclabs.satori.api.IdentifyRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Session>) responseObserver);
          break;
        case METHODID_LIST_PROPERTIES:
          serviceImpl.listProperties((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.Properties>) responseObserver);
          break;
        case METHODID_READYCHECK:
          serviceImpl.readycheck((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTIES:
          serviceImpl.updateProperties((com.heroiclabs.satori.api.UpdatePropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_LIST:
          serviceImpl.getMessageList((com.heroiclabs.satori.api.GetMessageListRequest) request,
              (io.grpc.stub.StreamObserver<com.heroiclabs.satori.api.GetMessageListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MESSAGE:
          serviceImpl.updateMessage((com.heroiclabs.satori.api.UpdateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((com.heroiclabs.satori.api.DeleteMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getAuthenticateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.AuthenticateRequest,
              com.heroiclabs.satori.api.Session>(
                service, METHODID_AUTHENTICATE)))
        .addMethod(
          getAuthenticateLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.AuthenticateLogoutRequest,
              com.google.protobuf.Empty>(
                service, METHODID_AUTHENTICATE_LOGOUT)))
        .addMethod(
          getAuthenticateRefreshMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.AuthenticateRefreshRequest,
              com.heroiclabs.satori.api.Session>(
                service, METHODID_AUTHENTICATE_REFRESH)))
        .addMethod(
          getDeleteIdentityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_IDENTITY)))
        .addMethod(
          getEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.EventRequest,
              com.google.protobuf.Empty>(
                service, METHODID_EVENT)))
        .addMethod(
          getGetExperimentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.GetExperimentsRequest,
              com.heroiclabs.satori.api.ExperimentList>(
                service, METHODID_GET_EXPERIMENTS)))
        .addMethod(
          getGetFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.GetFlagsRequest,
              com.heroiclabs.satori.api.FlagList>(
                service, METHODID_GET_FLAGS)))
        .addMethod(
          getGetLiveEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.GetLiveEventsRequest,
              com.heroiclabs.satori.api.LiveEventList>(
                service, METHODID_GET_LIVE_EVENTS)))
        .addMethod(
          getHealthcheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_HEALTHCHECK)))
        .addMethod(
          getIdentifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.IdentifyRequest,
              com.heroiclabs.satori.api.Session>(
                service, METHODID_IDENTIFY)))
        .addMethod(
          getListPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.heroiclabs.satori.api.Properties>(
                service, METHODID_LIST_PROPERTIES)))
        .addMethod(
          getReadycheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_READYCHECK)))
        .addMethod(
          getUpdatePropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.UpdatePropertiesRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_PROPERTIES)))
        .addMethod(
          getGetMessageListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.GetMessageListRequest,
              com.heroiclabs.satori.api.GetMessageListResponse>(
                service, METHODID_GET_MESSAGE_LIST)))
        .addMethod(
          getUpdateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.UpdateMessageRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_MESSAGE)))
        .addMethod(
          getDeleteMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.heroiclabs.satori.api.DeleteMessageRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MESSAGE)))
        .build();
  }

  private static abstract class SatoriBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SatoriBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.heroiclabs.satori.api.SatoriProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Satori");
    }
  }

  private static final class SatoriFileDescriptorSupplier
      extends SatoriBaseDescriptorSupplier {
    SatoriFileDescriptorSupplier() {}
  }

  private static final class SatoriMethodDescriptorSupplier
      extends SatoriBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SatoriMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SatoriGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SatoriFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .addMethod(getAuthenticateLogoutMethod())
              .addMethod(getAuthenticateRefreshMethod())
              .addMethod(getDeleteIdentityMethod())
              .addMethod(getEventMethod())
              .addMethod(getGetExperimentsMethod())
              .addMethod(getGetFlagsMethod())
              .addMethod(getGetLiveEventsMethod())
              .addMethod(getHealthcheckMethod())
              .addMethod(getIdentifyMethod())
              .addMethod(getListPropertiesMethod())
              .addMethod(getReadycheckMethod())
              .addMethod(getUpdatePropertiesMethod())
              .addMethod(getGetMessageListMethod())
              .addMethod(getUpdateMessageMethod())
              .addMethod(getDeleteMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
