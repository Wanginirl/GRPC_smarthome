package com.smarthome.curtain.curtainservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: CurtainService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CurtainServiceGrpc {

  private CurtainServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.curtain.CurtainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.curtain.curtainservice.ClientInformation,
      com.smarthome.curtain.curtainservice.ServerResponse> getHeaterInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heaterInformation",
      requestType = com.smarthome.curtain.curtainservice.ClientInformation.class,
      responseType = com.smarthome.curtain.curtainservice.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.curtain.curtainservice.ClientInformation,
      com.smarthome.curtain.curtainservice.ServerResponse> getHeaterInformationMethod() {
    io.grpc.MethodDescriptor<com.smarthome.curtain.curtainservice.ClientInformation, com.smarthome.curtain.curtainservice.ServerResponse> getHeaterInformationMethod;
    if ((getHeaterInformationMethod = CurtainServiceGrpc.getHeaterInformationMethod) == null) {
      synchronized (CurtainServiceGrpc.class) {
        if ((getHeaterInformationMethod = CurtainServiceGrpc.getHeaterInformationMethod) == null) {
          CurtainServiceGrpc.getHeaterInformationMethod = getHeaterInformationMethod =
              io.grpc.MethodDescriptor.<com.smarthome.curtain.curtainservice.ClientInformation, com.smarthome.curtain.curtainservice.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heaterInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.curtain.curtainservice.ClientInformation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.curtain.curtainservice.ServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CurtainServiceMethodDescriptorSupplier("heaterInformation"))
              .build();
        }
      }
    }
    return getHeaterInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurtainServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurtainServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurtainServiceStub>() {
        @java.lang.Override
        public CurtainServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurtainServiceStub(channel, callOptions);
        }
      };
    return CurtainServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurtainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurtainServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurtainServiceBlockingStub>() {
        @java.lang.Override
        public CurtainServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurtainServiceBlockingStub(channel, callOptions);
        }
      };
    return CurtainServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurtainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurtainServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurtainServiceFutureStub>() {
        @java.lang.Override
        public CurtainServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurtainServiceFutureStub(channel, callOptions);
        }
      };
    return CurtainServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    default void heaterInformation(com.smarthome.curtain.curtainservice.ClientInformation request,
        io.grpc.stub.StreamObserver<com.smarthome.curtain.curtainservice.ServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeaterInformationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CurtainService.
   */
  public static abstract class CurtainServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CurtainServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CurtainService.
   */
  public static final class CurtainServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CurtainServiceStub> {
    private CurtainServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurtainServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurtainServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void heaterInformation(com.smarthome.curtain.curtainservice.ClientInformation request,
        io.grpc.stub.StreamObserver<com.smarthome.curtain.curtainservice.ServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHeaterInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CurtainService.
   */
  public static final class CurtainServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CurtainServiceBlockingStub> {
    private CurtainServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurtainServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurtainServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public java.util.Iterator<com.smarthome.curtain.curtainservice.ServerResponse> heaterInformation(
        com.smarthome.curtain.curtainservice.ClientInformation request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHeaterInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CurtainService.
   */
  public static final class CurtainServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CurtainServiceFutureStub> {
    private CurtainServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurtainServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurtainServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HEATER_INFORMATION = 0;

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
        case METHODID_HEATER_INFORMATION:
          serviceImpl.heaterInformation((com.smarthome.curtain.curtainservice.ClientInformation) request,
              (io.grpc.stub.StreamObserver<com.smarthome.curtain.curtainservice.ServerResponse>) responseObserver);
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
          getHeaterInformationMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.smarthome.curtain.curtainservice.ClientInformation,
              com.smarthome.curtain.curtainservice.ServerResponse>(
                service, METHODID_HEATER_INFORMATION)))
        .build();
  }

  private static abstract class CurtainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurtainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.curtain.curtainservice.CurtainServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurtainService");
    }
  }

  private static final class CurtainServiceFileDescriptorSupplier
      extends CurtainServiceBaseDescriptorSupplier {
    CurtainServiceFileDescriptorSupplier() {}
  }

  private static final class CurtainServiceMethodDescriptorSupplier
      extends CurtainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CurtainServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CurtainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurtainServiceFileDescriptorSupplier())
              .addMethod(getHeaterInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
