package com.smarthome.bulb.bulbservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: BulbService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BulbServiceGrpc {

  private BulbServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.bulb.BulbService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.bulb.bulbservice.BidirectionalRequest,
      com.smarthome.bulb.bulbservice.BidirectionalResponse> getBidirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStream",
      requestType = com.smarthome.bulb.bulbservice.BidirectionalRequest.class,
      responseType = com.smarthome.bulb.bulbservice.BidirectionalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.bulb.bulbservice.BidirectionalRequest,
      com.smarthome.bulb.bulbservice.BidirectionalResponse> getBidirectionalStreamMethod() {
    io.grpc.MethodDescriptor<com.smarthome.bulb.bulbservice.BidirectionalRequest, com.smarthome.bulb.bulbservice.BidirectionalResponse> getBidirectionalStreamMethod;
    if ((getBidirectionalStreamMethod = BulbServiceGrpc.getBidirectionalStreamMethod) == null) {
      synchronized (BulbServiceGrpc.class) {
        if ((getBidirectionalStreamMethod = BulbServiceGrpc.getBidirectionalStreamMethod) == null) {
          BulbServiceGrpc.getBidirectionalStreamMethod = getBidirectionalStreamMethod =
              io.grpc.MethodDescriptor.<com.smarthome.bulb.bulbservice.BidirectionalRequest, com.smarthome.bulb.bulbservice.BidirectionalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.bulb.bulbservice.BidirectionalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.bulb.bulbservice.BidirectionalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BulbServiceMethodDescriptorSupplier("bidirectionalStream"))
              .build();
        }
      }
    }
    return getBidirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BulbServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulbServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulbServiceStub>() {
        @java.lang.Override
        public BulbServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulbServiceStub(channel, callOptions);
        }
      };
    return BulbServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BulbServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulbServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulbServiceBlockingStub>() {
        @java.lang.Override
        public BulbServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulbServiceBlockingStub(channel, callOptions);
        }
      };
    return BulbServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BulbServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulbServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulbServiceFutureStub>() {
        @java.lang.Override
        public BulbServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulbServiceFutureStub(channel, callOptions);
        }
      };
    return BulbServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.smarthome.bulb.bulbservice.BidirectionalRequest> bidirectionalStream(
        io.grpc.stub.StreamObserver<com.smarthome.bulb.bulbservice.BidirectionalResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BulbService.
   */
  public static abstract class BulbServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BulbServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BulbService.
   */
  public static final class BulbServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BulbServiceStub> {
    private BulbServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulbServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulbServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.smarthome.bulb.bulbservice.BidirectionalRequest> bidirectionalStream(
        io.grpc.stub.StreamObserver<com.smarthome.bulb.bulbservice.BidirectionalResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BulbService.
   */
  public static final class BulbServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BulbServiceBlockingStub> {
    private BulbServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulbServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulbServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BulbService.
   */
  public static final class BulbServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BulbServiceFutureStub> {
    private BulbServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulbServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulbServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BIDIRECTIONAL_STREAM = 0;

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
        case METHODID_BIDIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStream(
              (io.grpc.stub.StreamObserver<com.smarthome.bulb.bulbservice.BidirectionalResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBidirectionalStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.smarthome.bulb.bulbservice.BidirectionalRequest,
              com.smarthome.bulb.bulbservice.BidirectionalResponse>(
                service, METHODID_BIDIRECTIONAL_STREAM)))
        .build();
  }

  private static abstract class BulbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BulbServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.bulb.bulbservice.BUlbServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BulbService");
    }
  }

  private static final class BulbServiceFileDescriptorSupplier
      extends BulbServiceBaseDescriptorSupplier {
    BulbServiceFileDescriptorSupplier() {}
  }

  private static final class BulbServiceMethodDescriptorSupplier
      extends BulbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BulbServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BulbServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BulbServiceFileDescriptorSupplier())
              .addMethod(getBidirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
