package com.smarthome.heater;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The heater service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: heater.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartHome.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.heater.GetTemperatureRequest,
      com.smarthome.heater.GetTemperatureResponse> getGetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemperature",
      requestType = com.smarthome.heater.GetTemperatureRequest.class,
      responseType = com.smarthome.heater.GetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.heater.GetTemperatureRequest,
      com.smarthome.heater.GetTemperatureResponse> getGetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smarthome.heater.GetTemperatureRequest, com.smarthome.heater.GetTemperatureResponse> getGetTemperatureMethod;
    if ((getGetTemperatureMethod = HeaterServiceGrpc.getGetTemperatureMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getGetTemperatureMethod = HeaterServiceGrpc.getGetTemperatureMethod) == null) {
          HeaterServiceGrpc.getGetTemperatureMethod = getGetTemperatureMethod =
              io.grpc.MethodDescriptor.<com.smarthome.heater.GetTemperatureRequest, com.smarthome.heater.GetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.GetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.heater.GetTemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("GetTemperature"))
              .build();
        }
      }
    }
    return getGetTemperatureMethod;
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
   * <pre>
   * The heater service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * To get the temperature
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.smarthome.heater.GetTemperatureRequest> getTemperature(
        io.grpc.stub.StreamObserver<com.smarthome.heater.GetTemperatureResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HeaterService.
   * <pre>
   * The heater service definition.
   * </pre>
   */
  public static abstract class HeaterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HeaterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HeaterService.
   * <pre>
   * The heater service definition.
   * </pre>
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
     * To get the temperature
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smarthome.heater.GetTemperatureRequest> getTemperature(
        io.grpc.stub.StreamObserver<com.smarthome.heater.GetTemperatureResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HeaterService.
   * <pre>
   * The heater service definition.
   * </pre>
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
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HeaterService.
   * <pre>
   * The heater service definition.
   * </pre>
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
  }

  private static final int METHODID_GET_TEMPERATURE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTemperature(
              (io.grpc.stub.StreamObserver<com.smarthome.heater.GetTemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.smarthome.heater.GetTemperatureRequest,
              com.smarthome.heater.GetTemperatureResponse>(
                service, METHODID_GET_TEMPERATURE)))
        .build();
  }

  private static abstract class HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.heater.heaterServiceImpl.getDescriptor();
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
              .addMethod(getGetTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
