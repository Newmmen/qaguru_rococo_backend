package guru.qa.grpc.rococo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: rococo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RococoPaintingServiceGrpc {

  private RococoPaintingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "guru.qa.grpc.rococo.grpc.RococoPaintingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingRequest,
      guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllPaintingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPainting",
      requestType = guru.qa.grpc.rococo.grpc.AllPaintingRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.PaintingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingRequest,
      guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllPaintingMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingRequest, guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllPaintingMethod;
    if ((getGetAllPaintingMethod = RococoPaintingServiceGrpc.getGetAllPaintingMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetAllPaintingMethod = RococoPaintingServiceGrpc.getGetAllPaintingMethod) == null) {
          RococoPaintingServiceGrpc.getGetAllPaintingMethod = getGetAllPaintingMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllPaintingRequest, guru.qa.grpc.rococo.grpc.PaintingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPainting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllPaintingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.PaintingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetAllPainting"))
              .build();
        }
      }
    }
    return getGetAllPaintingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest,
      guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllByAuthorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllByAuthor",
      requestType = guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.PaintingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest,
      guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllByAuthorMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest, guru.qa.grpc.rococo.grpc.PaintingResponse> getGetAllByAuthorMethod;
    if ((getGetAllByAuthorMethod = RococoPaintingServiceGrpc.getGetAllByAuthorMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetAllByAuthorMethod = RococoPaintingServiceGrpc.getGetAllByAuthorMethod) == null) {
          RococoPaintingServiceGrpc.getGetAllByAuthorMethod = getGetAllByAuthorMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest, guru.qa.grpc.rococo.grpc.PaintingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllByAuthor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.PaintingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetAllByAuthor"))
              .build();
        }
      }
    }
    return getGetAllByAuthorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewPainting,
      guru.qa.grpc.rococo.grpc.CreatedPainting> getCreatePaintingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePainting",
      requestType = guru.qa.grpc.rococo.grpc.NewPainting.class,
      responseType = guru.qa.grpc.rococo.grpc.CreatedPainting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewPainting,
      guru.qa.grpc.rococo.grpc.CreatedPainting> getCreatePaintingMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewPainting, guru.qa.grpc.rococo.grpc.CreatedPainting> getCreatePaintingMethod;
    if ((getCreatePaintingMethod = RococoPaintingServiceGrpc.getCreatePaintingMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getCreatePaintingMethod = RococoPaintingServiceGrpc.getCreatePaintingMethod) == null) {
          RococoPaintingServiceGrpc.getCreatePaintingMethod = getCreatePaintingMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.NewPainting, guru.qa.grpc.rococo.grpc.CreatedPainting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePainting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.NewPainting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.CreatedPainting.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("CreatePainting"))
              .build();
        }
      }
    }
    return getCreatePaintingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.PaintingIdRequest,
      guru.qa.grpc.rococo.grpc.Painting> getGetPaintingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPainting",
      requestType = guru.qa.grpc.rococo.grpc.PaintingIdRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.Painting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.PaintingIdRequest,
      guru.qa.grpc.rococo.grpc.Painting> getGetPaintingMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.PaintingIdRequest, guru.qa.grpc.rococo.grpc.Painting> getGetPaintingMethod;
    if ((getGetPaintingMethod = RococoPaintingServiceGrpc.getGetPaintingMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetPaintingMethod = RococoPaintingServiceGrpc.getGetPaintingMethod) == null) {
          RococoPaintingServiceGrpc.getGetPaintingMethod = getGetPaintingMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.PaintingIdRequest, guru.qa.grpc.rococo.grpc.Painting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPainting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.PaintingIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Painting.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetPainting"))
              .build();
        }
      }
    }
    return getGetPaintingMethod;
  }

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
    if ((getGetAllMuseumsMethod = RococoPaintingServiceGrpc.getGetAllMuseumsMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetAllMuseumsMethod = RococoPaintingServiceGrpc.getGetAllMuseumsMethod) == null) {
          RococoPaintingServiceGrpc.getGetAllMuseumsMethod = getGetAllMuseumsMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllMuseumRequest, guru.qa.grpc.rococo.grpc.MuseumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMuseums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllMuseumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.MuseumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetAllMuseums"))
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
    if ((getGetMuseumMethod = RococoPaintingServiceGrpc.getGetMuseumMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetMuseumMethod = RococoPaintingServiceGrpc.getGetMuseumMethod) == null) {
          RococoPaintingServiceGrpc.getGetMuseumMethod = getGetMuseumMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.MuseumIdRequest, guru.qa.grpc.rococo.grpc.Museum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.MuseumIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetMuseum"))
              .build();
        }
      }
    }
    return getGetMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllCountryIdRequest,
      guru.qa.grpc.rococo.grpc.CountryResponse> getGetAllCountryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCountry",
      requestType = guru.qa.grpc.rococo.grpc.AllCountryIdRequest.class,
      responseType = guru.qa.grpc.rococo.grpc.CountryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllCountryIdRequest,
      guru.qa.grpc.rococo.grpc.CountryResponse> getGetAllCountryMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.AllCountryIdRequest, guru.qa.grpc.rococo.grpc.CountryResponse> getGetAllCountryMethod;
    if ((getGetAllCountryMethod = RococoPaintingServiceGrpc.getGetAllCountryMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getGetAllCountryMethod = RococoPaintingServiceGrpc.getGetAllCountryMethod) == null) {
          RococoPaintingServiceGrpc.getGetAllCountryMethod = getGetAllCountryMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.AllCountryIdRequest, guru.qa.grpc.rococo.grpc.CountryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCountry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.AllCountryIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.CountryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("GetAllCountry"))
              .build();
        }
      }
    }
    return getGetAllCountryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewMuseum,
      guru.qa.grpc.rococo.grpc.CreatedMuseum> getCreateMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMuseum",
      requestType = guru.qa.grpc.rococo.grpc.NewMuseum.class,
      responseType = guru.qa.grpc.rococo.grpc.CreatedMuseum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewMuseum,
      guru.qa.grpc.rococo.grpc.CreatedMuseum> getCreateMuseumMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.NewMuseum, guru.qa.grpc.rococo.grpc.CreatedMuseum> getCreateMuseumMethod;
    if ((getCreateMuseumMethod = RococoPaintingServiceGrpc.getCreateMuseumMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getCreateMuseumMethod = RococoPaintingServiceGrpc.getCreateMuseumMethod) == null) {
          RococoPaintingServiceGrpc.getCreateMuseumMethod = getCreateMuseumMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.NewMuseum, guru.qa.grpc.rococo.grpc.CreatedMuseum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.NewMuseum.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.CreatedMuseum.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("CreateMuseum"))
              .build();
        }
      }
    }
    return getCreateMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.Museum,
      guru.qa.grpc.rococo.grpc.Museum> getUpdateMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseum",
      requestType = guru.qa.grpc.rococo.grpc.Museum.class,
      responseType = guru.qa.grpc.rococo.grpc.Museum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.Museum,
      guru.qa.grpc.rococo.grpc.Museum> getUpdateMuseumMethod() {
    io.grpc.MethodDescriptor<guru.qa.grpc.rococo.grpc.Museum, guru.qa.grpc.rococo.grpc.Museum> getUpdateMuseumMethod;
    if ((getUpdateMuseumMethod = RococoPaintingServiceGrpc.getUpdateMuseumMethod) == null) {
      synchronized (RococoPaintingServiceGrpc.class) {
        if ((getUpdateMuseumMethod = RococoPaintingServiceGrpc.getUpdateMuseumMethod) == null) {
          RococoPaintingServiceGrpc.getUpdateMuseumMethod = getUpdateMuseumMethod =
              io.grpc.MethodDescriptor.<guru.qa.grpc.rococo.grpc.Museum, guru.qa.grpc.rococo.grpc.Museum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance()))
              .setSchemaDescriptor(new RococoPaintingServiceMethodDescriptorSupplier("UpdateMuseum"))
              .build();
        }
      }
    }
    return getUpdateMuseumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RococoPaintingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceStub>() {
        @java.lang.Override
        public RococoPaintingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoPaintingServiceStub(channel, callOptions);
        }
      };
    return RococoPaintingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RococoPaintingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceBlockingStub>() {
        @java.lang.Override
        public RococoPaintingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoPaintingServiceBlockingStub(channel, callOptions);
        }
      };
    return RococoPaintingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RococoPaintingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RococoPaintingServiceFutureStub>() {
        @java.lang.Override
        public RococoPaintingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RococoPaintingServiceFutureStub(channel, callOptions);
        }
      };
    return RococoPaintingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllPainting(guru.qa.grpc.rococo.grpc.AllPaintingRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPaintingMethod(), responseObserver);
    }

    /**
     */
    default void getAllByAuthor(guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllByAuthorMethod(), responseObserver);
    }

    /**
     */
    default void createPainting(guru.qa.grpc.rococo.grpc.NewPainting request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedPainting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePaintingMethod(), responseObserver);
    }

    /**
     */
    default void getPainting(guru.qa.grpc.rococo.grpc.PaintingIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Painting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaintingMethod(), responseObserver);
    }

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

    /**
     */
    default void getAllCountry(guru.qa.grpc.rococo.grpc.AllCountryIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CountryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCountryMethod(), responseObserver);
    }

    /**
     */
    default void createMuseum(guru.qa.grpc.rococo.grpc.NewMuseum request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedMuseum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMuseumMethod(), responseObserver);
    }

    /**
     */
    default void updateMuseum(guru.qa.grpc.rococo.grpc.Museum request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RococoPaintingService.
   */
  public static abstract class RococoPaintingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RococoPaintingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RococoPaintingService.
   */
  public static final class RococoPaintingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RococoPaintingServiceStub> {
    private RococoPaintingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoPaintingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoPaintingServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllPainting(guru.qa.grpc.rococo.grpc.AllPaintingRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPaintingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllByAuthor(guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllByAuthorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPainting(guru.qa.grpc.rococo.grpc.NewPainting request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedPainting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePaintingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPainting(guru.qa.grpc.rococo.grpc.PaintingIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Painting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaintingMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void getAllCountry(guru.qa.grpc.rococo.grpc.AllCountryIdRequest request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CountryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCountryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMuseum(guru.qa.grpc.rococo.grpc.NewMuseum request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedMuseum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseum(guru.qa.grpc.rococo.grpc.Museum request,
        io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RococoPaintingService.
   */
  public static final class RococoPaintingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RococoPaintingServiceBlockingStub> {
    private RococoPaintingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoPaintingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoPaintingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.PaintingResponse getAllPainting(guru.qa.grpc.rococo.grpc.AllPaintingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPaintingMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.PaintingResponse getAllByAuthor(guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllByAuthorMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.CreatedPainting createPainting(guru.qa.grpc.rococo.grpc.NewPainting request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePaintingMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.Painting getPainting(guru.qa.grpc.rococo.grpc.PaintingIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaintingMethod(), getCallOptions(), request);
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

    /**
     */
    public guru.qa.grpc.rococo.grpc.CountryResponse getAllCountry(guru.qa.grpc.rococo.grpc.AllCountryIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCountryMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.CreatedMuseum createMuseum(guru.qa.grpc.rococo.grpc.NewMuseum request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMuseumMethod(), getCallOptions(), request);
    }

    /**
     */
    public guru.qa.grpc.rococo.grpc.Museum updateMuseum(guru.qa.grpc.rococo.grpc.Museum request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RococoPaintingService.
   */
  public static final class RococoPaintingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RococoPaintingServiceFutureStub> {
    private RococoPaintingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RococoPaintingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RococoPaintingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.PaintingResponse> getAllPainting(
        guru.qa.grpc.rococo.grpc.AllPaintingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPaintingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.PaintingResponse> getAllByAuthor(
        guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllByAuthorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.CreatedPainting> createPainting(
        guru.qa.grpc.rococo.grpc.NewPainting request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePaintingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.Painting> getPainting(
        guru.qa.grpc.rococo.grpc.PaintingIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaintingMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.CountryResponse> getAllCountry(
        guru.qa.grpc.rococo.grpc.AllCountryIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCountryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.CreatedMuseum> createMuseum(
        guru.qa.grpc.rococo.grpc.NewMuseum request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<guru.qa.grpc.rococo.grpc.Museum> updateMuseum(
        guru.qa.grpc.rococo.grpc.Museum request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PAINTING = 0;
  private static final int METHODID_GET_ALL_BY_AUTHOR = 1;
  private static final int METHODID_CREATE_PAINTING = 2;
  private static final int METHODID_GET_PAINTING = 3;
  private static final int METHODID_GET_ALL_MUSEUMS = 4;
  private static final int METHODID_GET_MUSEUM = 5;
  private static final int METHODID_GET_ALL_COUNTRY = 6;
  private static final int METHODID_CREATE_MUSEUM = 7;
  private static final int METHODID_UPDATE_MUSEUM = 8;

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
        case METHODID_GET_ALL_PAINTING:
          serviceImpl.getAllPainting((guru.qa.grpc.rococo.grpc.AllPaintingRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_BY_AUTHOR:
          serviceImpl.getAllByAuthor((guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.PaintingResponse>) responseObserver);
          break;
        case METHODID_CREATE_PAINTING:
          serviceImpl.createPainting((guru.qa.grpc.rococo.grpc.NewPainting) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedPainting>) responseObserver);
          break;
        case METHODID_GET_PAINTING:
          serviceImpl.getPainting((guru.qa.grpc.rococo.grpc.PaintingIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Painting>) responseObserver);
          break;
        case METHODID_GET_ALL_MUSEUMS:
          serviceImpl.getAllMuseums((guru.qa.grpc.rococo.grpc.AllMuseumRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.MuseumResponse>) responseObserver);
          break;
        case METHODID_GET_MUSEUM:
          serviceImpl.getMuseum((guru.qa.grpc.rococo.grpc.MuseumIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.Museum>) responseObserver);
          break;
        case METHODID_GET_ALL_COUNTRY:
          serviceImpl.getAllCountry((guru.qa.grpc.rococo.grpc.AllCountryIdRequest) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CountryResponse>) responseObserver);
          break;
        case METHODID_CREATE_MUSEUM:
          serviceImpl.createMuseum((guru.qa.grpc.rococo.grpc.NewMuseum) request,
              (io.grpc.stub.StreamObserver<guru.qa.grpc.rococo.grpc.CreatedMuseum>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUM:
          serviceImpl.updateMuseum((guru.qa.grpc.rococo.grpc.Museum) request,
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
          getGetAllPaintingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.AllPaintingRequest,
              guru.qa.grpc.rococo.grpc.PaintingResponse>(
                service, METHODID_GET_ALL_PAINTING)))
        .addMethod(
          getGetAllByAuthorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest,
              guru.qa.grpc.rococo.grpc.PaintingResponse>(
                service, METHODID_GET_ALL_BY_AUTHOR)))
        .addMethod(
          getCreatePaintingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.NewPainting,
              guru.qa.grpc.rococo.grpc.CreatedPainting>(
                service, METHODID_CREATE_PAINTING)))
        .addMethod(
          getGetPaintingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.PaintingIdRequest,
              guru.qa.grpc.rococo.grpc.Painting>(
                service, METHODID_GET_PAINTING)))
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
        .addMethod(
          getGetAllCountryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.AllCountryIdRequest,
              guru.qa.grpc.rococo.grpc.CountryResponse>(
                service, METHODID_GET_ALL_COUNTRY)))
        .addMethod(
          getCreateMuseumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.NewMuseum,
              guru.qa.grpc.rococo.grpc.CreatedMuseum>(
                service, METHODID_CREATE_MUSEUM)))
        .addMethod(
          getUpdateMuseumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              guru.qa.grpc.rococo.grpc.Museum,
              guru.qa.grpc.rococo.grpc.Museum>(
                service, METHODID_UPDATE_MUSEUM)))
        .build();
  }

  private static abstract class RococoPaintingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RococoPaintingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RococoPaintingService");
    }
  }

  private static final class RococoPaintingServiceFileDescriptorSupplier
      extends RococoPaintingServiceBaseDescriptorSupplier {
    RococoPaintingServiceFileDescriptorSupplier() {}
  }

  private static final class RococoPaintingServiceMethodDescriptorSupplier
      extends RococoPaintingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RococoPaintingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RococoPaintingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RococoPaintingServiceFileDescriptorSupplier())
              .addMethod(getGetAllPaintingMethod())
              .addMethod(getGetAllByAuthorMethod())
              .addMethod(getCreatePaintingMethod())
              .addMethod(getGetPaintingMethod())
              .addMethod(getGetAllMuseumsMethod())
              .addMethod(getGetMuseumMethod())
              .addMethod(getGetAllCountryMethod())
              .addMethod(getCreateMuseumMethod())
              .addMethod(getUpdateMuseumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
