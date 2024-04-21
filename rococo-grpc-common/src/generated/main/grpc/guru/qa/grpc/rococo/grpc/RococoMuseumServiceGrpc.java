package guru.qa.grpc.rococo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: rococo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RococoMuseumServiceGrpc {

  private RococoMuseumServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "guru.qa.grpc.rococo.grpc.RococoMuseumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllMuseumRequest,
      guru.qa.grpc.rococo.grpc.MuseumResponse> getGetAllMuseumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMuseums",
      requestType = guru.qa.grpc.rococo.grpc.AllMuseumRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.MuseumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllMuseumRequest,
      guru.qa.grpc.rococo.grpc.MuseumResponse> getGetAllMuseumsMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllMuseumRequest, guru.qa.grpc.rococo.grpc.MuseumResponse> getGetAllMuseumsMethod;
    if ((getGetAllMuseumsMethod = RococoMuseumServiceGrpc.getGetAllMuseumsMethod) == null) {
      synchronized (RococoMuseumServiceGrpc.class) {
        if ((getGetAllMuseumsMethod = RococoMuseumServiceGrpc.getGetAllMuseumsMethod) == null) {
          RococoMuseumServiceGrpc.getGetAllMuseumsMethod = getGetAllMuseumsMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllMuseumRequest, guru.qa.grpc.rococo.grpc.MuseumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMuseums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllMuseumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.MuseumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoMuseumServiceMethodDescriptorSupplier("GetAllMuseums"))
              .build();
        }
      }
    }
    return getGetAllMuseumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.MuseumIdRequest,
      guru.qa.grpc.rococo.grpc.Museum> getGetMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseum",
      requestType = guru.qa.grpc.rococo.grpc.MuseumIdRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.Museum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.MuseumIdRequest,
      guru.qa.grpc.rococo.grpc.Museum> getGetMuseumMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.MuseumIdRequest, guru.qa.grpc.rococo.grpc.Museum> getGetMuseumMethod;
    if ((getGetMuseumMethod = RococoMuseumServiceGrpc.getGetMuseumMethod) == null) {
      synchronized (RococoMuseumServiceGrpc.class) {
        if ((getGetMuseumMethod = RococoMuseumServiceGrpc.getGetMuseumMethod) == null) {
          RococoMuseumServiceGrpc.getGetMuseumMethod = getGetMuseumMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.MuseumIdRequest, guru.qa.grpc.rococo.grpc.Museum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.MuseumIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance()))
              .setSchemaDescriptor(new RococoMuseumServiceMethodDescriptorSupplier("GetMuseum"))
              .build();
        }
      }
    }
    return getGetMuseumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RococoMuseumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceStub>() {
        @java.lang.Override
        public RococoMuseumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoMuseumServiceStub(channel, callOptions);
        }
      };
    return RococoMuseumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RococoMuseumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceBlockingStub>() {
        @java.lang.Override
        public RococoMuseumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoMuseumServiceBlockingStub(channel, callOptions);
        }
      };
    return RococoMuseumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RococoMuseumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoMuseumServiceFutureStub>() {
        @java.lang.Override
        public RococoMuseumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoMuseumServiceFutureStub(channel, callOptions);
        }
      };
    return RococoMuseumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllMuseums(guru.qa.grpc.rococo.grpc.AllMuseumRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.MuseumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMuseumsMethod(), responseObserver);
    }

    /**
     */
    default void getMuseum(guru.qa.grpc.rococo.grpc.MuseumIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RococoMuseumService.
   */
  public static abstract class RococoMuseumServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RococoMuseumServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RococoMuseumService.
   */
  public static final class RococoMuseumServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RococoMuseumServiceStub> {
    private RococoMuseumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoMuseumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoMuseumServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllMuseums(guru.qa.grpc.rococo.grpc.AllMuseumRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.MuseumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMuseumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseum(guru.qa.grpc.rococo.grpc.MuseumIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RococoMuseumService.
   */
  public static final class RococoMuseumServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RococoMuseumServiceBlockingStub> {
    private RococoMuseumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoMuseumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoMuseumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.MuseumResponse getAllMuseums(guru.qa.grpc.rococo.grpc.AllMuseumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMuseumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.Museum getMuseum(guru.qa.grpc.rococo.grpc.MuseumIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RococoMuseumService.
   */
  public static final class RococoMuseumServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RococoMuseumServiceFutureStub> {
    private RococoMuseumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoMuseumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoMuseumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.MuseumResponse> getAllMuseums(
        guru.qa.grpc.rococo.grpc.AllMuseumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMuseumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.Museum> getMuseum(
        guru.qa.grpc.rococo.grpc.MuseumIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_MUSEUMS = 0;
  private static final int METHODID_GET_MUSEUM = 1;

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
        case METHODID_GET_ALL_MUSEUMS:
          serviceImpl.getAllMuseums((guru.qa.grpc.rococo.grpc.AllMuseumRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.MuseumResponse>) responseObserver);
          break;
        case METHODID_GET_MUSEUM:
          serviceImpl.getMuseum((guru.qa.grpc.rococo.grpc.MuseumIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum>) responseObserver);
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
          getGetAllMuseumsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.AllMuseumRequest,
              guru.qa.grpc.rococo.grpc.MuseumResponse>(
                service, METHODID_GET_ALL_MUSEUMS)))
        .addMethod(
          getGetMuseumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.MuseumIdRequest,
              guru.qa.grpc.rococo.grpc.Museum>(
                service, METHODID_GET_MUSEUM)))
        .build();
  }

  private static abstract class RococoMuseumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RococoMuseumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RococoMuseumService");
    }
  }

  private static final class RococoMuseumServiceFileDescriptorSupplier
      extends RococoMuseumServiceBaseDescriptorSupplier {
    RococoMuseumServiceFileDescriptorSupplier() {}
  }

  private static final class RococoMuseumServiceMethodDescriptorSupplier
      extends RococoMuseumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RococoMuseumServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RococoMuseumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RococoMuseumServiceFileDescriptorSupplier())
              .addMethod(getGetAllMuseumsMethod())
              .addMethod(getGetMuseumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
