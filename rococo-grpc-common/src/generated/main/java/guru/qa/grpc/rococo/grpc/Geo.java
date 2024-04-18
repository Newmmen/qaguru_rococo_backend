// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo_artist.proto

package guru.qa.grpc.rococo.grpc;

/**
 * Protobuf type {@code guru.qa.grpc.rococo.grpc.Geo}
 */
public final class Geo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:guru.qa.grpc.rococo.grpc.Geo)
    GeoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Geo.newBuilder() to construct.
  private Geo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Geo() {
    city_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Geo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_Geo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_Geo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            guru.qa.grpc.rococo.grpc.Geo.class, guru.qa.grpc.rococo.grpc.Geo.Builder.class);
  }

  private int bitField0_;
  public static final int CITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object city_ = "";
  /**
   * <code>string city = 1;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 1;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_FIELD_NUMBER = 2;
  private guru.qa.grpc.rococo.grpc.Country country_;
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   * @return Whether the country field is set.
   */
  @java.lang.Override
  public boolean hasCountry() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   * @return The country.
   */
  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.Country getCountry() {
    return country_ == null ? guru.qa.grpc.rococo.grpc.Country.getDefaultInstance() : country_;
  }
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   */
  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.CountryOrBuilder getCountryOrBuilder() {
    return country_ == null ? guru.qa.grpc.rococo.grpc.Country.getDefaultInstance() : country_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, city_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCountry());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, city_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCountry());
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
    if (!(obj instanceof guru.qa.grpc.rococo.grpc.Geo)) {
      return super.equals(obj);
    }
    guru.qa.grpc.rococo.grpc.Geo other = (guru.qa.grpc.rococo.grpc.Geo) obj;

    if (!getCity()
        .equals(other.getCity())) return false;
    if (hasCountry() != other.hasCountry()) return false;
    if (hasCountry()) {
      if (!getCountry()
          .equals(other.getCountry())) return false;
    }
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
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    if (hasCountry()) {
      hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCountry().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static guru.qa.grpc.rococo.grpc.Geo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static guru.qa.grpc.rococo.grpc.Geo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.Geo parseFrom(
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
  public static Builder newBuilder(guru.qa.grpc.rococo.grpc.Geo prototype) {
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
   * Protobuf type {@code guru.qa.grpc.rococo.grpc.Geo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:guru.qa.grpc.rococo.grpc.Geo)
      guru.qa.grpc.rococo.grpc.GeoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_Geo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_Geo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              guru.qa.grpc.rococo.grpc.Geo.class, guru.qa.grpc.rococo.grpc.Geo.Builder.class);
    }

    // Construct using guru.qa.grpc.rococo.grpc.Geo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCountryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      city_ = "";
      country_ = null;
      if (countryBuilder_ != null) {
        countryBuilder_.dispose();
        countryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_Geo_descriptor;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.Geo getDefaultInstanceForType() {
      return guru.qa.grpc.rococo.grpc.Geo.getDefaultInstance();
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.Geo build() {
      guru.qa.grpc.rococo.grpc.Geo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.Geo buildPartial() {
      guru.qa.grpc.rococo.grpc.Geo result = new guru.qa.grpc.rococo.grpc.Geo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(guru.qa.grpc.rococo.grpc.Geo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.city_ = city_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.country_ = countryBuilder_ == null
            ? country_
            : countryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof guru.qa.grpc.rococo.grpc.Geo) {
        return mergeFrom((guru.qa.grpc.rococo.grpc.Geo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(guru.qa.grpc.rococo.grpc.Geo other) {
      if (other == guru.qa.grpc.rococo.grpc.Geo.getDefaultInstance()) return this;
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCountry()) {
        mergeCountry(other.getCountry());
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
              city_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCountryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 1;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      city_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      city_ = getDefaultInstance().getCity();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      city_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private guru.qa.grpc.rococo.grpc.Country country_;
    private com.google.protobuf.SingleFieldBuilderV3<
        guru.qa.grpc.rococo.grpc.Country, guru.qa.grpc.rococo.grpc.Country.Builder, guru.qa.grpc.rococo.grpc.CountryOrBuilder> countryBuilder_;
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     * @return Whether the country field is set.
     */
    public boolean hasCountry() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     * @return The country.
     */
    public guru.qa.grpc.rococo.grpc.Country getCountry() {
      if (countryBuilder_ == null) {
        return country_ == null ? guru.qa.grpc.rococo.grpc.Country.getDefaultInstance() : country_;
      } else {
        return countryBuilder_.getMessage();
      }
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public Builder setCountry(guru.qa.grpc.rococo.grpc.Country value) {
      if (countryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        country_ = value;
      } else {
        countryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public Builder setCountry(
        guru.qa.grpc.rococo.grpc.Country.Builder builderForValue) {
      if (countryBuilder_ == null) {
        country_ = builderForValue.build();
      } else {
        countryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public Builder mergeCountry(guru.qa.grpc.rococo.grpc.Country value) {
      if (countryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          country_ != null &&
          country_ != guru.qa.grpc.rococo.grpc.Country.getDefaultInstance()) {
          getCountryBuilder().mergeFrom(value);
        } else {
          country_ = value;
        }
      } else {
        countryBuilder_.mergeFrom(value);
      }
      if (country_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public Builder clearCountry() {
      bitField0_ = (bitField0_ & ~0x00000002);
      country_ = null;
      if (countryBuilder_ != null) {
        countryBuilder_.dispose();
        countryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public guru.qa.grpc.rococo.grpc.Country.Builder getCountryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCountryFieldBuilder().getBuilder();
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    public guru.qa.grpc.rococo.grpc.CountryOrBuilder getCountryOrBuilder() {
      if (countryBuilder_ != null) {
        return countryBuilder_.getMessageOrBuilder();
      } else {
        return country_ == null ?
            guru.qa.grpc.rococo.grpc.Country.getDefaultInstance() : country_;
      }
    }
    /**
     * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        guru.qa.grpc.rococo.grpc.Country, guru.qa.grpc.rococo.grpc.Country.Builder, guru.qa.grpc.rococo.grpc.CountryOrBuilder> 
        getCountryFieldBuilder() {
      if (countryBuilder_ == null) {
        countryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            guru.qa.grpc.rococo.grpc.Country, guru.qa.grpc.rococo.grpc.Country.Builder, guru.qa.grpc.rococo.grpc.CountryOrBuilder>(
                getCountry(),
                getParentForChildren(),
                isClean());
        country_ = null;
      }
      return countryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:guru.qa.grpc.rococo.grpc.Geo)
  }

  // @@protoc_insertion_point(class_scope:guru.qa.grpc.rococo.grpc.Geo)
  private static final guru.qa.grpc.rococo.grpc.Geo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new guru.qa.grpc.rococo.grpc.Geo();
  }

  public static guru.qa.grpc.rococo.grpc.Geo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Geo>
      PARSER = new com.google.protobuf.AbstractParser<Geo>() {
    @java.lang.Override
    public Geo parsePartialFrom(
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

  public static com.google.protobuf.Parser<Geo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Geo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.Geo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

