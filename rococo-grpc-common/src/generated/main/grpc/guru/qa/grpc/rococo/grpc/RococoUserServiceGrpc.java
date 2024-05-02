package guru.qa.grpc.rococo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: rococo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RococoUserServiceGrpc {

  private RococoUserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "guru.qa.grpc.rococo.grpc.RococoUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.UserIdRequest,
      guru.qa.grpc.rococo.grpc.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = guru.qa.grpc.rococo.grpc.UserIdRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.UserIdRequest,
      guru.qa.grpc.rococo.grpc.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.UserIdRequest, guru.qa.grpc.rococo.grpc.User> getGetUserMethod;
    if ((getGetUserMethod = RococoUserServiceGrpc.getGetUserMethod) == null) {
      synchronized (RococoUserServiceGrpc.class) {
        if ((getGetUserMethod = RococoUserServiceGrpc.getGetUserMethod) == null) {
          RococoUserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.UserIdRequest, guru.qa.grpc.rococo.grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new RococoUserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.User,
      guru.qa.grpc.rococo.grpc.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = guru.qa.grpc.rococo.grpc.User.class,
      responseType = guru.qa.grpc.rococo.grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.User,
      guru.qa.grpc.rococo.grpc.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.User, guru.qa.grpc.rococo.grpc.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = RococoUserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (RococoUserServiceGrpc.class) {
        if ((getUpdateUserMethod = RococoUserServiceGrpc.getUpdateUserMethod) == null) {
          RococoUserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.User, guru.qa.grpc.rococo.grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new RococoUserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RococoUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceStub>() {
        @java.lang.Override
        public RococoUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoUserServiceStub(channel, callOptions);
        }
      };
    return RococoUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RococoUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceBlockingStub>() {
        @java.lang.Override
        public RococoUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoUserServiceBlockingStub(channel, callOptions);
        }
      };
    return RococoUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RococoUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoUserServiceFutureStub>() {
        @java.lang.Override
        public RococoUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoUserServiceFutureStub(channel, callOptions);
        }
      };
    return RococoUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUser(guru.qa.grpc.rococo.grpc.UserIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(guru.qa.grpc.rococo.grpc.User request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RococoUserService.
   */
  public static abstract class RococoUserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RococoUserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RococoUserService.
   */
  public static final class RococoUserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RococoUserServiceStub> {
    private RococoUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(guru.qa.grpc.rococo.grpc.UserIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(guru.qa.grpc.rococo.grpc.User request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RococoUserService.
   */
  public static final class RococoUserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RococoUserServiceBlockingStub> {
    private RococoUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.User getUser(guru.qa.grpc.rococo.grpc.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.User updateUser(guru.qa.grpc.rococo.grpc.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RococoUserService.
   */
  public static final class RococoUserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RococoUserServiceFutureStub> {
    private RococoUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.User> getUser(
        guru.qa.grpc.rococo.grpc.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.User> updateUser(
        guru.qa.grpc.rococo.grpc.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((guru.qa.grpc.rococo.grpc.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((guru.qa.grpc.rococo.grpc.User) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.User>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.UserIdRequest,
              guru.qa.grpc.rococo.grpc.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.User,
              guru.qa.grpc.rococo.grpc.User>(
                service, METHODID_UPDATE_USER)))
        .build();
  }

  private static abstract class RococoUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RococoUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RococoUserService");
    }
  }

  private static final class RococoUserServiceFileDescriptorSupplier
      extends RococoUserServiceBaseDescriptorSupplier {
    RococoUserServiceFileDescriptorSupplier() {}
  }

  private static final class RococoUserServiceMethodDescriptorSupplier
      extends RococoUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RococoUserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RococoUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RococoUserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
