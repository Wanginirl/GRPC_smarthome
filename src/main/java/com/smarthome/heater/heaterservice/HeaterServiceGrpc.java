package com.smarthome.heater.heaterservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: HeaterService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.heater.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.UnaryRequest,
      com.smarthome.heater.heaterservice.UnaryResponse> getSendUnaryRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendUnaryRequest",
      requestType = com.smarthome.heater.heaterservice.UnaryRequest.class,
      responseType = com.smarthome.heater.heaterservice.UnaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.UnaryRequest,
      com.smarthome.heater.heaterservice.UnaryResponse> getSendUnaryRequestMethod() {
    io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.UnaryRequest, com.smarthome.heater.heaterservice.UnaryResponse> getSendUnaryRequestMethod;
    if ((getSendUnaryRequestMethod = HeaterServiceGrpc.getSendUnaryRequestMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSendUnaryRequestMethod = HeaterServiceGrpc.getSendUnaryRequestMethod) == null) {
          HeaterServiceGrpc.getSendUnaryRequestMethod = getSendUnaryRequestMethod =
              io.grpc.MethodDescriptor.<com.smarthome.heater.heaterservice.UnaryRequest, com.smarthome.heater.heaterservice.UnaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendUnaryRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.heaterservice.UnaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.heaterservice.UnaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("sendUnaryRequest"))
              .build();
        }
      }
    }
    return getSendUnaryRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.ClientInformation,
      com.smarthome.heater.heaterservice.ServerResponse> getHeaterInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heaterInformation",
      requestType = com.smarthome.heater.heaterservice.ClientInformation.class,
      responseType = com.smarthome.heater.heaterservice.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.ClientInformation,
      com.smarthome.heater.heaterservice.ServerResponse> getHeaterInformationMethod() {
    io.grpc.MethodDescriptor<com.smarthome.heater.heaterservice.ClientInformation, com.smarthome.heater.heaterservice.ServerResponse> getHeaterInformationMethod;
    if ((getHeaterInformationMethod = HeaterServiceGrpc.getHeaterInformationMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getHeaterInformationMethod = HeaterServiceGrpc.getHeaterInformationMethod) == null) {
          HeaterServiceGrpc.getHeaterInformationMethod = getHeaterInformationMethod =
              io.grpc.MethodDescriptor.<com.smarthome.heater.heaterservice.ClientInformation, com.smarthome.heater.heaterservice.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heaterInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.heaterservice.ClientInformation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.heaterservice.ServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("heaterInformation"))
              .build();
        }
      }
    }
    return getHeaterInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeaterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeaterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeaterServiceStub>() {
        @java.lang.Override
        public HeaterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeaterServiceStub(channel, callOptions);
        }
      };
    return HeaterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeaterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeaterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeaterServiceBlockingStub>() {
        @java.lang.Override
        public HeaterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeaterServiceBlockingStub(channel, callOptions);
        }
      };
    return HeaterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeaterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeaterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeaterServiceFutureStub>() {
        @java.lang.Override
        public HeaterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeaterServiceFutureStub(channel, callOptions);
        }
      };
    return HeaterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    default void sendUnaryRequest(com.smarthome.heater.heaterservice.UnaryRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.UnaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUnaryRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.ClientInformation> heaterInformation(
        io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.ServerResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHeaterInformationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HeaterService.
   */
  public static abstract class HeaterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HeaterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HeaterService.
   */
  public static final class HeaterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HeaterServiceStub> {
    private HeaterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeaterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void sendUnaryRequest(com.smarthome.heater.heaterservice.UnaryRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.UnaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUnaryRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.ClientInformation> heaterInformation(
        io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.ServerResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHeaterInformationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HeaterService.
   */
  public static final class HeaterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HeaterServiceBlockingStub> {
    private HeaterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeaterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.smarthome.heater.heaterservice.UnaryResponse sendUnaryRequest(com.smarthome.heater.heaterservice.UnaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUnaryRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HeaterService.
   */
  public static final class HeaterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HeaterServiceFutureStub> {
    private HeaterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeaterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smarthome.heater.heaterservice.UnaryResponse> sendUnaryRequest(
        com.smarthome.heater.heaterservice.UnaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUnaryRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_UNARY_REQUEST = 0;
  private static final int METHODID_HEATER_INFORMATION = 1;

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
        case METHODID_SEND_UNARY_REQUEST:
          serviceImpl.sendUnaryRequest((com.smarthome.heater.heaterservice.UnaryRequest) request,
              (io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.UnaryResponse>) responseObserver);
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
        case METHODID_HEATER_INFORMATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heaterInformation(
              (io.grpc.stub.StreamObserver<com.smarthome.heater.heaterservice.ServerResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendUnaryRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smarthome.heater.heaterservice.UnaryRequest,
              com.smarthome.heater.heaterservice.UnaryResponse>(
                service, METHODID_SEND_UNARY_REQUEST)))
        .addMethod(
          getHeaterInformationMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.smarthome.heater.heaterservice.ClientInformation,
              com.smarthome.heater.heaterservice.ServerResponse>(
                service, METHODID_HEATER_INFORMATION)))
        .build();
  }

  private static abstract class HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.heater.heaterservice.HeaterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeaterService");
    }
  }

  private static final class HeaterServiceFileDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier {
    HeaterServiceFileDescriptorSupplier() {}
  }

  private static final class HeaterServiceMethodDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HeaterServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HeaterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeaterServiceFileDescriptorSupplier())
              .addMethod(getSendUnaryRequestMethod())
              .addMethod(getHeaterInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
