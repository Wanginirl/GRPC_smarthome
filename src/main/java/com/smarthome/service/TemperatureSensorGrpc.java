package com.smarthome.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * temperature_stream service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmarthomeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemperatureSensorGrpc {

  private TemperatureSensorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.TemperatureSensor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.TempRequest,
      com.smarthome.service.TempResponse> getStreamTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTemperature",
      requestType = com.smarthome.service.TempRequest.class,
      responseType = com.smarthome.service.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.service.TempRequest,
      com.smarthome.service.TempResponse> getStreamTemperatureMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.TempRequest, com.smarthome.service.TempResponse> getStreamTemperatureMethod;
    if ((getStreamTemperatureMethod = TemperatureSensorGrpc.getStreamTemperatureMethod) == null) {
      synchronized (TemperatureSensorGrpc.class) {
        if ((getStreamTemperatureMethod = TemperatureSensorGrpc.getStreamTemperatureMethod) == null) {
          TemperatureSensorGrpc.getStreamTemperatureMethod = getStreamTemperatureMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.TempRequest, com.smarthome.service.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.TempResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureSensorMethodDescriptorSupplier("StreamTemperature"))
              .build();
        }
      }
    }
    return getStreamTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureSensorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorStub>() {
        @java.lang.Override
        public TemperatureSensorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorStub(channel, callOptions);
        }
      };
    return TemperatureSensorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureSensorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorBlockingStub>() {
        @java.lang.Override
        public TemperatureSensorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorBlockingStub(channel, callOptions);
        }
      };
    return TemperatureSensorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureSensorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureSensorFutureStub>() {
        @java.lang.Override
        public TemperatureSensorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureSensorFutureStub(channel, callOptions);
        }
      };
    return TemperatureSensorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * temperature_stream service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.smarthome.service.TempRequest> streamTemperature(
        io.grpc.stub.StreamObserver<com.smarthome.service.TempResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TemperatureSensor.
   * <pre>
   * temperature_stream service
   * </pre>
   */
  public static abstract class TemperatureSensorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemperatureSensorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TemperatureSensor.
   * <pre>
   * temperature_stream service
   * </pre>
   */
  public static final class TemperatureSensorStub
      extends io.grpc.stub.AbstractAsyncStub<TemperatureSensorStub> {
    private TemperatureSensorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarthome.service.TempRequest> streamTemperature(
        io.grpc.stub.StreamObserver<com.smarthome.service.TempResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TemperatureSensor.
   * <pre>
   * temperature_stream service
   * </pre>
   */
  public static final class TemperatureSensorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TemperatureSensorBlockingStub> {
    private TemperatureSensorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TemperatureSensor.
   * <pre>
   * temperature_stream service
   * </pre>
   */
  public static final class TemperatureSensorFutureStub
      extends io.grpc.stub.AbstractFutureStub<TemperatureSensorFutureStub> {
    private TemperatureSensorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureSensorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureSensorFutureStub(channel, callOptions);
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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamTemperature(
              (io.grpc.stub.StreamObserver<com.smarthome.service.TempResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStreamTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.smarthome.service.TempRequest,
              com.smarthome.service.TempResponse>(
                service, METHODID_STREAM_TEMPERATURE)))
        .build();
  }

  private static abstract class TemperatureSensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureSensorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureSensor");
    }
  }

  private static final class TemperatureSensorFileDescriptorSupplier
      extends TemperatureSensorBaseDescriptorSupplier {
    TemperatureSensorFileDescriptorSupplier() {}
  }

  private static final class TemperatureSensorMethodDescriptorSupplier
      extends TemperatureSensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TemperatureSensorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TemperatureSensorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureSensorFileDescriptorSupplier())
              .addMethod(getStreamTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
