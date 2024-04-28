package com.smarthome.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * temperature sensor service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartHomeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemperatureSensorServiceGrpc {

  private TemperatureSensorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.TemperatureSensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.TemperatureRequest,
      com.smarthome.service.TemperatureResponse> getStreamTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamTemperature",
      requestType = com.smarthome.service.TemperatureRequest.class,
      responseType = com.smarthome.service.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.service.TemperatureRequest,
      com.smarthome.service.TemperatureResponse> getStreamTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.TemperatureRequest, com.smarthome.service.TemperatureResponse> getStreamTemperatureMethod;
    if ((getStreamTemperatureMethod = TemperatureSensorServiceGrpc.getStreamTemperatureMethod) == null) {
      synchronized (TemperatureSensorServiceGrpc.class) {
        if ((getStreamTemperatureMethod = TemperatureSensorServiceGrpc.getStreamTemperatureMethod) == null) {
          TemperatureSensorServiceGrpc.getStreamTemperatureMethod = getStreamTemperatureMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.TemperatureRequest, com.smarthome.service.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureSensorServiceMethodDescriptorSupplier("streamTemperature"))
              .build();
        }
      }
    }
    return getStreamTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureSensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceStub>() {
        @java.lang.Override
        public TemperatureSensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorServiceStub(channel, callOptions);
        }
      };
    return TemperatureSensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureSensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceBlockingStub>() {
        @java.lang.Override
        public TemperatureSensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorServiceBlockingStub(channel, callOptions);
        }
      };
    return TemperatureSensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureSensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorServiceFutureStub>() {
        @java.lang.Override
        public TemperatureSensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorServiceFutureStub(channel, callOptions);
        }
      };
    return TemperatureSensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * temperature sensor service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void streamTemperature(com.smarthome.service.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.service.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TemperatureSensorService.
   * <pre>
   * temperature sensor service
   * </pre>
   */
  public static abstract class TemperatureSensorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemperatureSensorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TemperatureSensorService.
   * <pre>
   * temperature sensor service
   * </pre>
   */
  public static final class TemperatureSensorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TemperatureSensorServiceStub> {
    private TemperatureSensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamTemperature(com.smarthome.service.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.service.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TemperatureSensorService.
   * <pre>
   * temperature sensor service
   * </pre>
   */
  public static final class TemperatureSensorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TemperatureSensorServiceBlockingStub> {
    private TemperatureSensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.smarthome.service.TemperatureResponse> streamTemperature(
        com.smarthome.service.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TemperatureSensorService.
   * <pre>
   * temperature sensor service
   * </pre>
   */
  public static final class TemperatureSensorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TemperatureSensorServiceFutureStub> {
    private TemperatureSensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_TEMPERATURE = 0;

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
        case METHODID_STREAM_TEMPERATURE:
          serviceImpl.streamTemperature((com.smarthome.service.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.smarthome.service.TemperatureResponse>) responseObserver);
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
          getStreamTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.smarthome.service.TemperatureRequest,
              com.smarthome.service.TemperatureResponse>(
                service, METHODID_STREAM_TEMPERATURE)))
        .build();
  }

  private static abstract class TemperatureSensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureSensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureSensorService");
    }
  }

  private static final class TemperatureSensorServiceFileDescriptorSupplier
      extends TemperatureSensorServiceBaseDescriptorSupplier {
    TemperatureSensorServiceFileDescriptorSupplier() {}
  }

  private static final class TemperatureSensorServiceMethodDescriptorSupplier
      extends TemperatureSensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TemperatureSensorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TemperatureSensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureSensorServiceFileDescriptorSupplier())
              .addMethod(getStreamTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
