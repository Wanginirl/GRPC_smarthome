package com.smarthome.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * security system service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartHomeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecuritySystemServiceGrpc {

  private SecuritySystemServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.smarthome.SecuritySystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.SecurityStatus,
      com.smarthome.service.SystemResponse> getReportStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reportStatus",
      requestType = com.smarthome.service.SecurityStatus.class,
      responseType = com.smarthome.service.SystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.service.SecurityStatus,
      com.smarthome.service.SystemResponse> getReportStatusMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.SecurityStatus, com.smarthome.service.SystemResponse> getReportStatusMethod;
    if ((getReportStatusMethod = SecuritySystemServiceGrpc.getReportStatusMethod) == null) {
      synchronized (SecuritySystemServiceGrpc.class) {
        if ((getReportStatusMethod = SecuritySystemServiceGrpc.getReportStatusMethod) == null) {
          SecuritySystemServiceGrpc.getReportStatusMethod = getReportStatusMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.SecurityStatus, com.smarthome.service.SystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reportStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.SecurityStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.SystemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecuritySystemServiceMethodDescriptorSupplier("reportStatus"))
              .build();
        }
      }
    }
    return getReportStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smarthome.service.SecurityCommand,
      com.smarthome.service.SecurityEvent> getMonitorSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "monitorSystem",
      requestType = com.smarthome.service.SecurityCommand.class,
      responseType = com.smarthome.service.SecurityEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smarthome.service.SecurityCommand,
      com.smarthome.service.SecurityEvent> getMonitorSystemMethod() {
    io.grpc.MethodDescriptor<com.smarthome.service.SecurityCommand, com.smarthome.service.SecurityEvent> getMonitorSystemMethod;
    if ((getMonitorSystemMethod = SecuritySystemServiceGrpc.getMonitorSystemMethod) == null) {
      synchronized (SecuritySystemServiceGrpc.class) {
        if ((getMonitorSystemMethod = SecuritySystemServiceGrpc.getMonitorSystemMethod) == null) {
          SecuritySystemServiceGrpc.getMonitorSystemMethod = getMonitorSystemMethod =
              io.grpc.MethodDescriptor.<com.smarthome.service.SecurityCommand, com.smarthome.service.SecurityEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "monitorSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.SecurityCommand.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smarthome.service.SecurityEvent.getDefaultInstance()))
              .setSchemaDescriptor(new SecuritySystemServiceMethodDescriptorSupplier("monitorSystem"))
              .build();
        }
      }
    }
    return getMonitorSystemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecuritySystemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceStub>() {
        @java.lang.Override
        public SecuritySystemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemServiceStub(channel, callOptions);
        }
      };
    return SecuritySystemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecuritySystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceBlockingStub>() {
        @java.lang.Override
        public SecuritySystemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemServiceBlockingStub(channel, callOptions);
        }
      };
    return SecuritySystemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecuritySystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecuritySystemServiceFutureStub>() {
        @java.lang.Override
        public SecuritySystemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecuritySystemServiceFutureStub(channel, callOptions);
        }
      };
    return SecuritySystemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * security system service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.smarthome.service.SecurityStatus> reportStatus(
        io.grpc.stub.StreamObserver<com.smarthome.service.SystemResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getReportStatusMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.smarthome.service.SecurityCommand> monitorSystem(
        io.grpc.stub.StreamObserver<com.smarthome.service.SecurityEvent> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorSystemMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecuritySystemService.
   * <pre>
   * security system service
   * </pre>
   */
  public static abstract class SecuritySystemServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecuritySystemServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecuritySystemService.
   * <pre>
   * security system service
   * </pre>
   */
  public static final class SecuritySystemServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecuritySystemServiceStub> {
    private SecuritySystemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarthome.service.SecurityStatus> reportStatus(
        io.grpc.stub.StreamObserver<com.smarthome.service.SystemResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getReportStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarthome.service.SecurityCommand> monitorSystem(
        io.grpc.stub.StreamObserver<com.smarthome.service.SecurityEvent> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorSystemMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecuritySystemService.
   * <pre>
   * security system service
   * </pre>
   */
  public static final class SecuritySystemServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecuritySystemServiceBlockingStub> {
    private SecuritySystemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecuritySystemService.
   * <pre>
   * security system service
   * </pre>
   */
  public static final class SecuritySystemServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecuritySystemServiceFutureStub> {
    private SecuritySystemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritySystemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecuritySystemServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REPORT_STATUS = 0;
  private static final int METHODID_MONITOR_SYSTEM = 1;

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
        case METHODID_MONITOR_SYSTEM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorSystem(
              (io.grpc.stub.StreamObserver<com.smarthome.service.SecurityEvent>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReportStatusMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.smarthome.service.SecurityStatus,
              com.smarthome.service.SystemResponse>(
                service, METHODID_REPORT_STATUS)))
        .addMethod(
          getMonitorSystemMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.smarthome.service.SecurityCommand,
              com.smarthome.service.SecurityEvent>(
                service, METHODID_MONITOR_SYSTEM)))
        .build();
  }

  private static abstract class SecuritySystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecuritySystemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smarthome.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecuritySystemService");
    }
  }

  private static final class SecuritySystemServiceFileDescriptorSupplier
      extends SecuritySystemServiceBaseDescriptorSupplier {
    SecuritySystemServiceFileDescriptorSupplier() {}
  }

  private static final class SecuritySystemServiceMethodDescriptorSupplier
      extends SecuritySystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SecuritySystemServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SecuritySystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecuritySystemServiceFileDescriptorSupplier())
              .addMethod(getReportStatusMethod())
              .addMethod(getMonitorSystemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
