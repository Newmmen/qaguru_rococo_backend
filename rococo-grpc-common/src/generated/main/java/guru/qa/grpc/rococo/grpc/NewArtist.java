// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo.proto

package guru.qa.grpc.rococo.grpc;

/**
 * Protobuf type {@code guru.qa.grpc.rococo.grpc.NewArtist}
 */
public final class NewArtist extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:guru.qa.grpc.rococo.grpc.NewArtist)
    NewArtistOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NewArtist.newBuilder() to construct.
  private NewArtist(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewArtist() {
    biography_ = "";
    name_ = "";
    photo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NewArtist();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_NewArtist_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_NewArtist_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            guru.qa.grpc.rococo.grpc.NewArtist.class, guru.qa.grpc.rococo.grpc.NewArtist.Builder.class);
  }

  public static final int BIOGRAPHY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object biography_ = "";
  /**
   * <code>string biography = 1;</code>
   * @return The biography.
   */
  @java.lang.Override
  public java.lang.String getBiography() {
    java.lang.Object ref = biography_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      biography_ = s;
      return s;
    }
  }
  /**
   * <code>string biography = 1;</code>
   * @return The bytes for biography.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBiographyBytes() {
    java.lang.Object ref = biography_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      biography_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHOTO_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object photo_ = "";
  /**
   * <code>string photo = 3;</code>
   * @return The photo.
   */
  @java.lang.Override
  public java.lang.String getPhoto() {
    java.lang.Object ref = photo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      photo_ = s;
      return s;
    }
  }
  /**
   * <code>string photo = 3;</code>
   * @return The bytes for photo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhotoBytes() {
    java.lang.Object ref = photo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      photo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(biography_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, biography_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(photo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, photo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(biography_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, biography_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(photo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, photo_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof guru.qa.grpc.rococo.grpc.NewArtist)) {
      return super.equals(obj);
    }
    guru.qa.grpc.rococo.grpc.NewArtist other = (guru.qa.grpc.rococo.grpc.NewArtist) obj;

    if (!getBiography()
        .equals(other.getBiography())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPhoto()
        .equals(other.getPhoto())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BIOGRAPHY_FIELD_NUMBER;
    hash = (53 * hash) + getBiography().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PHOTO_FIELD_NUMBER;
    hash = (53 * hash) + getPhoto().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static guru.qa.grpc.rococo.grpc.NewArtist parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static guru.qa.grpc.rococo.grpc.NewArtist parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.NewArtist parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(guru.qa.grpc.rococo.grpc.NewArtist prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code guru.qa.grpc.rococo.grpc.NewArtist}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:guru.qa.grpc.rococo.grpc.NewArtist)
      guru.qa.grpc.rococo.grpc.NewArtistOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_NewArtist_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_NewArtist_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              guru.qa.grpc.rococo.grpc.NewArtist.class, guru.qa.grpc.rococo.grpc.NewArtist.Builder.class);
    }

    // Construct using guru.qa.grpc.rococo.grpc.NewArtist.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      biography_ = "";
      name_ = "";
      photo_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_NewArtist_descriptor;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.NewArtist getDefaultInstanceForType() {
      return guru.qa.grpc.rococo.grpc.NewArtist.getDefaultInstance();
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.NewArtist build() {
      guru.qa.grpc.rococo.grpc.NewArtist result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.NewArtist buildPartial() {
      guru.qa.grpc.rococo.grpc.NewArtist result = new guru.qa.grpc.rococo.grpc.NewArtist(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(guru.qa.grpc.rococo.grpc.NewArtist result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.biography_ = biography_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.photo_ = photo_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof guru.qa.grpc.rococo.grpc.NewArtist) {
        return mergeFrom((guru.qa.grpc.rococo.grpc.NewArtist)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(guru.qa.grpc.rococo.grpc.NewArtist other) {
      if (other == guru.qa.grpc.rococo.grpc.NewArtist.getDefaultInstance()) return this;
      if (!other.getBiography().isEmpty()) {
        biography_ = other.biography_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getPhoto().isEmpty()) {
        photo_ = other.photo_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              biography_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              photo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object biography_ = "";
    /**
     * <code>string biography = 1;</code>
     * @return The biography.
     */
    public java.lang.String getBiography() {
      java.lang.Object ref = biography_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        biography_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string biography = 1;</code>
     * @return The bytes for biography.
     */
    public com.google.protobuf.ByteString
        getBiographyBytes() {
      java.lang.Object ref = biography_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        biography_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string biography = 1;</code>
     * @param value The biography to set.
     * @return This builder for chaining.
     */
    public Builder setBiography(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      biography_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string biography = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiography() {
      biography_ = getDefaultInstance().getBiography();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string biography = 1;</code>
     * @param value The bytes for biography to set.
     * @return This builder for chaining.
     */
    public Builder setBiographyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      biography_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object photo_ = "";
    /**
     * <code>string photo = 3;</code>
     * @return The photo.
     */
    public java.lang.String getPhoto() {
      java.lang.Object ref = photo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        photo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string photo = 3;</code>
     * @return The bytes for photo.
     */
    public com.google.protobuf.ByteString
        getPhotoBytes() {
      java.lang.Object ref = photo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        photo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string photo = 3;</code>
     * @param value The photo to set.
     * @return This builder for chaining.
     */
    public Builder setPhoto(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      photo_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string photo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoto() {
      photo_ = getDefaultInstance().getPhoto();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string photo = 3;</code>
     * @param value The bytes for photo to set.
     * @return This builder for chaining.
     */
    public Builder setPhotoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      photo_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:guru.qa.grpc.rococo.grpc.NewArtist)
  }

  // @@protoc_insertion_point(class_scope:guru.qa.grpc.rococo.grpc.NewArtist)
  private static final guru.qa.grpc.rococo.grpc.NewArtist DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new guru.qa.grpc.rococo.grpc.NewArtist();
  }

  public static guru.qa.grpc.rococo.grpc.NewArtist getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewArtist>
      PARSER = new com.google.protobuf.AbstractParser<NewArtist>() {
    @java.lang.Override
    public NewArtist parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NewArtist> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewArtist> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.NewArtist getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

