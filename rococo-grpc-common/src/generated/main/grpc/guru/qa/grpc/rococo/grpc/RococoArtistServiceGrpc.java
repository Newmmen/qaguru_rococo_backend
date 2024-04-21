package guru.qa.grpc.rococo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: rococo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RococoArtistServiceGrpc {

  private RococoArtistServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "guru.qa.grpc.rococo.grpc.RococoArtistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllArtistRequest,
      guru.qa.grpc.rococo.grpc.ArtistResponse> getGetAllArtistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllArtists",
      requestType = guru.qa.grpc.rococo.grpc.AllArtistRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.ArtistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllArtistRequest,
      guru.qa.grpc.rococo.grpc.ArtistResponse> getGetAllArtistsMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllArtistRequest, guru.qa.grpc.rococo.grpc.ArtistResponse> getGetAllArtistsMethod;
    if ((getGetAllArtistsMethod = RococoArtistServiceGrpc.getGetAllArtistsMethod) == null) {
      synchronized (RococoArtistServiceGrpc.class) {
        if ((getGetAllArtistsMethod = RococoArtistServiceGrpc.getGetAllArtistsMethod) == null) {
          RococoArtistServiceGrpc.getGetAllArtistsMethod = getGetAllArtistsMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllArtistRequest, guru.qa.grpc.rococo.grpc.ArtistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllArtists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllArtistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.ArtistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoArtistServiceMethodDescriptorSupplier("GetAllArtists"))
              .build();
        }
      }
    }
    return getGetAllArtistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.ArtistIdRequest,
      guru.qa.grpc.rococo.grpc.Artist> getGetArtistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArtist",
      requestType = guru.qa.grpc.rococo.grpc.ArtistIdRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.Artist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.ArtistIdRequest,
      guru.qa.grpc.rococo.grpc.Artist> getGetArtistMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.ArtistIdRequest, guru.qa.grpc.rococo.grpc.Artist> getGetArtistMethod;
    if ((getGetArtistMethod = RococoArtistServiceGrpc.getGetArtistMethod) == null) {
      synchronized (RococoArtistServiceGrpc.class) {
        if ((getGetArtistMethod = RococoArtistServiceGrpc.getGetArtistMethod) == null) {
          RococoArtistServiceGrpc.getGetArtistMethod = getGetArtistMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.ArtistIdRequest, guru.qa.grpc.rococo.grpc.Artist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetArtist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.ArtistIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Artist.getDefaultInstance()))
              .setSchemaDescriptor(new RococoArtistServiceMethodDescriptorSupplier("GetArtist"))
              .build();
        }
      }
    }
    return getGetArtistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RococoArtistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceStub>() {
        @java.lang.Override
        public RococoArtistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoArtistServiceStub(channel, callOptions);
        }
      };
    return RococoArtistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RococoArtistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceBlockingStub>() {
        @java.lang.Override
        public RococoArtistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoArtistServiceBlockingStub(channel, callOptions);
        }
      };
    return RococoArtistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RococoArtistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoArtistServiceFutureStub>() {
        @java.lang.Override
        public RococoArtistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoArtistServiceFutureStub(channel, callOptions);
        }
      };
    return RococoArtistServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllArtists(guru.qa.grpc.rococo.grpc.AllArtistRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.ArtistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllArtistsMethod(), responseObserver);
    }

    /**
     */
    default void getArtist(guru.qa.grpc.rococo.grpc.ArtistIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Artist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetArtistMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RococoArtistService.
   */
  public static abstract class RococoArtistServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RococoArtistServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RococoArtistService.
   */
  public static final class RococoArtistServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RococoArtistServiceStub> {
    private RococoArtistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoArtistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoArtistServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllArtists(guru.qa.grpc.rococo.grpc.AllArtistRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.ArtistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllArtistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArtist(guru.qa.grpc.rococo.grpc.ArtistIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Artist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetArtistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RococoArtistService.
   */
  public static final class RococoArtistServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RococoArtistServiceBlockingStub> {
    private RococoArtistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoArtistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoArtistServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.ArtistResponse getAllArtists(guru.qa.grpc.rococo.grpc.AllArtistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllArtistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.Artist getArtist(guru.qa.grpc.rococo.grpc.ArtistIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetArtistMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RococoArtistService.
   */
  public static final class RococoArtistServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RococoArtistServiceFutureStub> {
    private RococoArtistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoArtistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoArtistServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.ArtistResponse> getAllArtists(
        guru.qa.grpc.rococo.grpc.AllArtistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllArtistsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.Artist> getArtist(
        guru.qa.grpc.rococo.grpc.ArtistIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetArtistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ARTISTS = 0;
  private static final int METHODID_GET_ARTIST = 1;

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
        case METHODID_GET_ALL_ARTISTS:
          serviceImpl.getAllArtists((guru.qa.grpc.rococo.grpc.AllArtistRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.ArtistResponse>) responseObserver);
          break;
        case METHODID_GET_ARTIST:
          serviceImpl.getArtist((guru.qa.grpc.rococo.grpc.ArtistIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Artist>) responseObserver);
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
          getGetAllArtistsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.AllArtistRequest,
              guru.qa.grpc.rococo.grpc.ArtistResponse>(
                service, METHODID_GET_ALL_ARTISTS)))
        .addMethod(
          getGetArtistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.ArtistIdRequest,
              guru.qa.grpc.rococo.grpc.Artist>(
                service, METHODID_GET_ARTIST)))
        .build();
  }

  private static abstract class RococoArtistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RococoArtistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RococoArtistService");
    }
  }

  private static final class RococoArtistServiceFileDescriptorSupplier
      extends RococoArtistServiceBaseDescriptorSupplier {
    RococoArtistServiceFileDescriptorSupplier() {}
  }

  private static final class RococoArtistServiceMethodDescriptorSupplier
      extends RococoArtistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RococoArtistServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RococoArtistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RococoArtistServiceFileDescriptorSupplier())
              .addMethod(getGetAllArtistsMethod())
              .addMethod(getGetArtistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
