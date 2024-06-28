package com.prodonik.genprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: arith.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ArithmeticsServiceGrpc {

  private ArithmeticsServiceGrpc() {}

  public static final String SERVICE_NAME = "ArithmeticsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = com.prodonik.genprotos.Arith.ArithmeticsRequest.class,
      responseType = com.prodonik.genprotos.Arith.ArithmeticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse> getAddMethod;
    if ((getAddMethod = ArithmeticsServiceGrpc.getAddMethod) == null) {
      synchronized (ArithmeticsServiceGrpc.class) {
        if ((getAddMethod = ArithmeticsServiceGrpc.getAddMethod) == null) {
          ArithmeticsServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArithmeticsServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtract",
      requestType = com.prodonik.genprotos.Arith.ArithmeticsRequest.class,
      responseType = com.prodonik.genprotos.Arith.ArithmeticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getSubtractMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse> getSubtractMethod;
    if ((getSubtractMethod = ArithmeticsServiceGrpc.getSubtractMethod) == null) {
      synchronized (ArithmeticsServiceGrpc.class) {
        if ((getSubtractMethod = ArithmeticsServiceGrpc.getSubtractMethod) == null) {
          ArithmeticsServiceGrpc.getSubtractMethod = getSubtractMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArithmeticsServiceMethodDescriptorSupplier("Subtract"))
              .build();
        }
      }
    }
    return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = com.prodonik.genprotos.Arith.ArithmeticsRequest.class,
      responseType = com.prodonik.genprotos.Arith.ArithmeticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse> getMultiplyMethod;
    if ((getMultiplyMethod = ArithmeticsServiceGrpc.getMultiplyMethod) == null) {
      synchronized (ArithmeticsServiceGrpc.class) {
        if ((getMultiplyMethod = ArithmeticsServiceGrpc.getMultiplyMethod) == null) {
          ArithmeticsServiceGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArithmeticsServiceMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = com.prodonik.genprotos.Arith.ArithmeticsRequest.class,
      responseType = com.prodonik.genprotos.Arith.ArithmeticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest,
      com.prodonik.genprotos.Arith.ArithmeticsResponse> getDivideMethod() {
    io.grpc.MethodDescriptor<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse> getDivideMethod;
    if ((getDivideMethod = ArithmeticsServiceGrpc.getDivideMethod) == null) {
      synchronized (ArithmeticsServiceGrpc.class) {
        if ((getDivideMethod = ArithmeticsServiceGrpc.getDivideMethod) == null) {
          ArithmeticsServiceGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<com.prodonik.genprotos.Arith.ArithmeticsRequest, com.prodonik.genprotos.Arith.ArithmeticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.prodonik.genprotos.Arith.ArithmeticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArithmeticsServiceMethodDescriptorSupplier("Divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArithmeticsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceStub>() {
        @java.lang.Override
        public ArithmeticsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithmeticsServiceStub(channel, callOptions);
        }
      };
    return ArithmeticsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArithmeticsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceBlockingStub>() {
        @java.lang.Override
        public ArithmeticsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithmeticsServiceBlockingStub(channel, callOptions);
        }
      };
    return ArithmeticsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArithmeticsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithmeticsServiceFutureStub>() {
        @java.lang.Override
        public ArithmeticsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithmeticsServiceFutureStub(channel, callOptions);
        }
      };
    return ArithmeticsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ArithmeticsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void subtract(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    public void multiply(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Arith.ArithmeticsRequest,
                com.prodonik.genprotos.Arith.ArithmeticsResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getSubtractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Arith.ArithmeticsRequest,
                com.prodonik.genprotos.Arith.ArithmeticsResponse>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getMultiplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Arith.ArithmeticsRequest,
                com.prodonik.genprotos.Arith.ArithmeticsResponse>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.prodonik.genprotos.Arith.ArithmeticsRequest,
                com.prodonik.genprotos.Arith.ArithmeticsResponse>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class ArithmeticsServiceStub extends io.grpc.stub.AbstractAsyncStub<ArithmeticsServiceStub> {
    private ArithmeticsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticsServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtract(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(com.prodonik.genprotos.Arith.ArithmeticsRequest request,
        io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArithmeticsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ArithmeticsServiceBlockingStub> {
    private ArithmeticsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.prodonik.genprotos.Arith.ArithmeticsResponse add(com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Arith.ArithmeticsResponse subtract(com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Arith.ArithmeticsResponse multiply(com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.prodonik.genprotos.Arith.ArithmeticsResponse divide(com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArithmeticsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ArithmeticsServiceFutureStub> {
    private ArithmeticsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Arith.ArithmeticsResponse> add(
        com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Arith.ArithmeticsResponse> subtract(
        com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Arith.ArithmeticsResponse> multiply(
        com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.prodonik.genprotos.Arith.ArithmeticsResponse> divide(
        com.prodonik.genprotos.Arith.ArithmeticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_SUBTRACT = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArithmeticsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArithmeticsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.prodonik.genprotos.Arith.ArithmeticsRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((com.prodonik.genprotos.Arith.ArithmeticsRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.prodonik.genprotos.Arith.ArithmeticsRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.prodonik.genprotos.Arith.ArithmeticsRequest) request,
              (io.grpc.stub.StreamObserver<com.prodonik.genprotos.Arith.ArithmeticsResponse>) responseObserver);
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

  private static abstract class ArithmeticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArithmeticsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.prodonik.genprotos.Arith.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArithmeticsService");
    }
  }

  private static final class ArithmeticsServiceFileDescriptorSupplier
      extends ArithmeticsServiceBaseDescriptorSupplier {
    ArithmeticsServiceFileDescriptorSupplier() {}
  }

  private static final class ArithmeticsServiceMethodDescriptorSupplier
      extends ArithmeticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArithmeticsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArithmeticsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArithmeticsServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
