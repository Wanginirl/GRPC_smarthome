package com.smarthome.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * light_control service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmarthomeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightControlGrpc {

  private LightControlGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.LightControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.ToggleRequest,
      com.smarthome.service.ToggleResponse> getToggleLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleLight",
      requestType = com.smarthome.service.ToggleRequest.class,
      responseType = com.smarthome.service.ToggleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smarthome.service.ToggleRequest,
      com.smarthome.service.ToggleResponse> getToggleLightMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.ToggleRequest, com.smarthome.service.ToggleResponse> getToggleLightMethod;
    if ((getToggleLightMethod = LightControlGrpc.getToggleLightMethod) == null) {
      synchronized (LightControlGrpc.class) {
        if ((getToggleLightMethod = LightControlGrpc.getToggleLightMethod) == null) {
          LightControlGrpc.getToggleLightMethod = getToggleLightMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.ToggleRequest, com.smarthome.service.ToggleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.ToggleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.ToggleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightControlMethodDescriptorSupplier("ToggleLight"))
              .build();
        }
      }
    }
    return getToggleLightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightControlStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightControlStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightControlStub>() {
        @java.lang.Override
        public LightControlStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightControlStub(channel, callOptions);
        }
      };
    return LightControlStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightControlBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightControlBlockingStub>() {
        @java.lang.Override
        public LightControlBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightControlBlockingStub(channel, callOptions);
        }
      };
    return LightControlBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightControlFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightControlFutureStub>() {
        @java.lang.Override
        public LightControlFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightControlFutureStub(channel, callOptions);
        }
      };
    return LightControlFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * light_control service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void toggleLight(com.smarthome.service.ToggleRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.service.ToggleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleLightMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightControl.
   * <pre>
   * light_control service
   * </pre>
   */
  public static abstract class LightControlImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightControlGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightControl.
   * <pre>
   * light_control service
   * </pre>
   */
  public static final class LightControlStub
      extends io.grpc.stub.AbstractAsyncStub<LightControlStub> {
    private LightControlStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightControlStub(channel, callOptions);
    }

    /**
     */
    public void toggleLight(com.smarthome.service.ToggleRequest request,
        io.grpc.stub.StreamObserver<com.smarthome.service.ToggleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleLightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightControl.
   * <pre>
   * light_control service
   * </pre>
   */
  public static final class LightControlBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightControlBlockingStub> {
    private LightControlBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smarthome.service.ToggleResponse toggleLight(com.smarthome.service.ToggleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleLightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightControl.
   * <pre>
   * light_control service
   * </pre>
   */
  public static final class LightControlFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightControlFutureStub> {
    private LightControlFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smarthome.service.ToggleResponse> toggleLight(
        com.smarthome.service.ToggleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOGGLE_LIGHT = 0;

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
        case METHODID_TOGGLE_LIGHT:
          serviceImpl.toggleLight((com.smarthome.service.ToggleRequest) request,
              (io.grpc.stub.StreamObserver<com.smarthome.service.ToggleResponse>) responseObserver);
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
          getToggleLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smarthome.service.ToggleRequest,
              com.smarthome.service.ToggleResponse>(
                service, METHODID_TOGGLE_LIGHT)))
        .build();
  }

  private static abstract class LightControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightControl");
    }
  }

  private static final class LightControlFileDescriptorSupplier
      extends LightControlBaseDescriptorSupplier {
    LightControlFileDescriptorSupplier() {}
  }

  private static final class LightControlMethodDescriptorSupplier
      extends LightControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LightControlMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LightControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightControlFileDescriptorSupplier())
              .addMethod(getToggleLightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
