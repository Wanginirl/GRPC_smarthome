package com.smarthome.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * security_system service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmarthomeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecuritySystemGrpc {

  private SecuritySystemGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.SecuritySystem";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.StatusReport,
      com.smarthome.service.SystemResponse> getReportStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportStatus",
      requestType = com.smarthome.service.StatusReport.class,
      responseType = com.smarthome.service.SystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.service.StatusReport,
      com.smarthome.service.SystemResponse> getReportStatusMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.StatusReport, com.smarthome.service.SystemResponse> getReportStatusMethod;
    if ((getReportStatusMethod = SecuritySystemGrpc.getReportStatusMethod) == null) {
      synchronized (SecuritySystemGrpc.class) {
        if ((getReportStatusMethod = SecuritySystemGrpc.getReportStatusMethod) == null) {
          SecuritySystemGrpc.getReportStatusMethod = getReportStatusMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.StatusReport, com.smarthome.service.SystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.StatusReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.SystemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecuritySystemMethodDescriptorSupplier("ReportStatus"))
              .build();
        }
      }
    }
    return getReportStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecuritySystemStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemStub>() {
        @java.lang.Override
        public SecuritySystemStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemStub(channel, callOptions);
        }
      };
    return SecuritySystemStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecuritySystemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemBlockingStub>() {
        @java.lang.Override
        public SecuritySystemBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemBlockingStub(channel, callOptions);
        }
      };
    return SecuritySystemBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecuritySystemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemFutureStub>() {
        @java.lang.Override
        public SecuritySystemFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemFutureStub(channel, callOptions);
        }
      };
    return SecuritySystemFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * security_system service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.smarthome.service.StatusReport> reportStatus(
        io.grpc.stub.StreamObserver<com.smarthome.service.SystemResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getReportStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecuritySystem.
   * <pre>
   * security_system service
   * </pre>
   */
  public static abstract class SecuritySystemImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecuritySystemGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecuritySystem.
   * <pre>
   * security_system service
   * </pre>
   */
  public static final class SecuritySystemStub
      extends io.grpc.stub.AbstractAsyncStub<SecuritySystemStub> {
    private SecuritySystemStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarthome.service.StatusReport> reportStatus(
        io.grpc.stub.StreamObserver<com.smarthome.service.SystemResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getReportStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecuritySystem.
   * <pre>
   * security_system service
   * </pre>
   */
  public static final class SecuritySystemBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecuritySystemBlockingStub> {
    private SecuritySystemBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecuritySystem.
   * <pre>
   * security_system service
   * </pre>
   */
  public static final class SecuritySystemFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecuritySystemFutureStub> {
    private SecuritySystemFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REPORT_STATUS = 0;

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
        case METHODID_REPORT_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reportStatus(
              (io.grpc.stub.StreamObserver<com.smarthome.service.SystemResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReportStatusMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.smarthome.service.StatusReport,
              com.smarthome.service.SystemResponse>(
                service, METHODID_REPORT_STATUS)))
        .build();
  }

  private static abstract class SecuritySystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecuritySystemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecuritySystem");
    }
  }

  private static final class SecuritySystemFileDescriptorSupplier
      extends SecuritySystemBaseDescriptorSupplier {
    SecuritySystemFileDescriptorSupplier() {}
  }

  private static final class SecuritySystemMethodDescriptorSupplier
      extends SecuritySystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SecuritySystemMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SecuritySystemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecuritySystemFileDescriptorSupplier())
              .addMethod(getReportStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
