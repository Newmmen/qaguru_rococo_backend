// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo.proto

package guru.qa.grpc.rococo.grpc;

/**
 * Protobuf type {@code guru.qa.grpc.rococo.grpc.MuseumResponse}
 */
public final class MuseumResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:guru.qa.grpc.rococo.grpc.MuseumResponse)
    MuseumResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MuseumResponse.newBuilder() to construct.
  private MuseumResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MuseumResponse() {
    allMuseum_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MuseumResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_MuseumResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_MuseumResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            guru.qa.grpc.rococo.grpc.MuseumResponse.class, guru.qa.grpc.rococo.grpc.MuseumResponse.Builder.class);
  }

  public static final int ALLMUSEUM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<guru.qa.grpc.rococo.grpc.Museum> allMuseum_;
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
   */
  @java.lang.Override
  public java.util.List<guru.qa.grpc.rococo.grpc.Museum> getAllMuseumList() {
    return allMuseum_;
  }
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends guru.qa.grpc.rococo.grpc.MuseumOrBuilder> 
      getAllMuseumOrBuilderList() {
    return allMuseum_;
  }
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
   */
  @java.lang.Override
  public int getAllMuseumCount() {
    return allMuseum_.size();
  }
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
   */
  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.Museum getAllMuseum(int index) {
    return allMuseum_.get(index);
  }
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
   */
  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.MuseumOrBuilder getAllMuseumOrBuilder(
      int index) {
    return allMuseum_.get(index);
  }

  public static final int TOTAL_COUNT_FIELD_NUMBER = 2;
  private int totalCount_ = 0;
  /**
   * <code>int32 total_count = 2;</code>
   * @return The totalCount.
   */
  @java.lang.Override
  public int getTotalCount() {
    return totalCount_;
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
    for (int i = 0; i < allMuseum_.size(); i++) {
      output.writeMessage(1, allMuseum_.get(i));
    }
    if (totalCount_ != 0) {
      output.writeInt32(2, totalCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < allMuseum_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, allMuseum_.get(i));
    }
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalCount_);
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
    if (!(obj instanceof guru.qa.grpc.rococo.grpc.MuseumResponse)) {
      return super.equals(obj);
    }
    guru.qa.grpc.rococo.grpc.MuseumResponse other = (guru.qa.grpc.rococo.grpc.MuseumResponse) obj;

    if (!getAllMuseumList()
        .equals(other.getAllMuseumList())) return false;
    if (getTotalCount()
        != other.getTotalCount()) return false;
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
    if (getAllMuseumCount() > 0) {
      hash = (37 * hash) + ALLMUSEUM_FIELD_NUMBER;
      hash = (53 * hash) + getAllMuseumList().hashCode();
    }
    hash = (37 * hash) + TOTAL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.rococo.grpc.MuseumResponse parseFrom(
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
  public static Builder newBuilder(guru.qa.grpc.rococo.grpc.MuseumResponse prototype) {
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
   * Protobuf type {@code guru.qa.grpc.rococo.grpc.MuseumResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:guru.qa.grpc.rococo.grpc.MuseumResponse)
      guru.qa.grpc.rococo.grpc.MuseumResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_MuseumResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_MuseumResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              guru.qa.grpc.rococo.grpc.MuseumResponse.class, guru.qa.grpc.rococo.grpc.MuseumResponse.Builder.class);
    }

    // Construct using guru.qa.grpc.rococo.grpc.MuseumResponse.newBuilder()
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
      if (allMuseumBuilder_ == null) {
        allMuseum_ = java.util.Collections.emptyList();
      } else {
        allMuseum_ = null;
        allMuseumBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      totalCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return guru.qa.grpc.rococo.grpc.RococoServiceProto.internal_static_guru_qa_grpc_rococo_grpc_MuseumResponse_descriptor;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.MuseumResponse getDefaultInstanceForType() {
      return guru.qa.grpc.rococo.grpc.MuseumResponse.getDefaultInstance();
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.MuseumResponse build() {
      guru.qa.grpc.rococo.grpc.MuseumResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public guru.qa.grpc.rococo.grpc.MuseumResponse buildPartial() {
      guru.qa.grpc.rococo.grpc.MuseumResponse result = new guru.qa.grpc.rococo.grpc.MuseumResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(guru.qa.grpc.rococo.grpc.MuseumResponse result) {
      if (allMuseumBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          allMuseum_ = java.util.Collections.unmodifiableList(allMuseum_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.allMuseum_ = allMuseum_;
      } else {
        result.allMuseum_ = allMuseumBuilder_.build();
      }
    }

    private void buildPartial0(guru.qa.grpc.rococo.grpc.MuseumResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalCount_ = totalCount_;
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
      if (other instanceof guru.qa.grpc.rococo.grpc.MuseumResponse) {
        return mergeFrom((guru.qa.grpc.rococo.grpc.MuseumResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(guru.qa.grpc.rococo.grpc.MuseumResponse other) {
      if (other == guru.qa.grpc.rococo.grpc.MuseumResponse.getDefaultInstance()) return this;
      if (allMuseumBuilder_ == null) {
        if (!other.allMuseum_.isEmpty()) {
          if (allMuseum_.isEmpty()) {
            allMuseum_ = other.allMuseum_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAllMuseumIsMutable();
            allMuseum_.addAll(other.allMuseum_);
          }
          onChanged();
        }
      } else {
        if (!other.allMuseum_.isEmpty()) {
          if (allMuseumBuilder_.isEmpty()) {
            allMuseumBuilder_.dispose();
            allMuseumBuilder_ = null;
            allMuseum_ = other.allMuseum_;
            bitField0_ = (bitField0_ & ~0x00000001);
            allMuseumBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllMuseumFieldBuilder() : null;
          } else {
            allMuseumBuilder_.addAllMessages(other.allMuseum_);
          }
        }
      }
      if (other.getTotalCount() != 0) {
        setTotalCount(other.getTotalCount());
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
              guru.qa.grpc.rococo.grpc.Museum m =
                  input.readMessage(
                      guru.qa.grpc.rococo.grpc.Museum.parser(),
                      extensionRegistry);
              if (allMuseumBuilder_ == null) {
                ensureAllMuseumIsMutable();
                allMuseum_.add(m);
              } else {
                allMuseumBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              totalCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.util.List<guru.qa.grpc.rococo.grpc.Museum> allMuseum_ =
      java.util.Collections.emptyList();
    private void ensureAllMuseumIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allMuseum_ = new java.util.ArrayList<guru.qa.grpc.rococo.grpc.Museum>(allMuseum_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        guru.qa.grpc.rococo.grpc.Museum, guru.qa.grpc.rococo.grpc.Museum.Builder, guru.qa.grpc.rococo.grpc.MuseumOrBuilder> allMuseumBuilder_;

    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public java.util.List<guru.qa.grpc.rococo.grpc.Museum> getAllMuseumList() {
      if (allMuseumBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allMuseum_);
      } else {
        return allMuseumBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public int getAllMuseumCount() {
      if (allMuseumBuilder_ == null) {
        return allMuseum_.size();
      } else {
        return allMuseumBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public guru.qa.grpc.rococo.grpc.Museum getAllMuseum(int index) {
      if (allMuseumBuilder_ == null) {
        return allMuseum_.get(index);
      } else {
        return allMuseumBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder setAllMuseum(
        int index, guru.qa.grpc.rococo.grpc.Museum value) {
      if (allMuseumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllMuseumIsMutable();
        allMuseum_.set(index, value);
        onChanged();
      } else {
        allMuseumBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder setAllMuseum(
        int index, guru.qa.grpc.rococo.grpc.Museum.Builder builderForValue) {
      if (allMuseumBuilder_ == null) {
        ensureAllMuseumIsMutable();
        allMuseum_.set(index, builderForValue.build());
        onChanged();
      } else {
        allMuseumBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder addAllMuseum(guru.qa.grpc.rococo.grpc.Museum value) {
      if (allMuseumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllMuseumIsMutable();
        allMuseum_.add(value);
        onChanged();
      } else {
        allMuseumBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder addAllMuseum(
        int index, guru.qa.grpc.rococo.grpc.Museum value) {
      if (allMuseumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllMuseumIsMutable();
        allMuseum_.add(index, value);
        onChanged();
      } else {
        allMuseumBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder addAllMuseum(
        guru.qa.grpc.rococo.grpc.Museum.Builder builderForValue) {
      if (allMuseumBuilder_ == null) {
        ensureAllMuseumIsMutable();
        allMuseum_.add(builderForValue.build());
        onChanged();
      } else {
        allMuseumBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder addAllMuseum(
        int index, guru.qa.grpc.rococo.grpc.Museum.Builder builderForValue) {
      if (allMuseumBuilder_ == null) {
        ensureAllMuseumIsMutable();
        allMuseum_.add(index, builderForValue.build());
        onChanged();
      } else {
        allMuseumBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder addAllAllMuseum(
        java.lang.Iterable<? extends guru.qa.grpc.rococo.grpc.Museum> values) {
      if (allMuseumBuilder_ == null) {
        ensureAllMuseumIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allMuseum_);
        onChanged();
      } else {
        allMuseumBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder clearAllMuseum() {
      if (allMuseumBuilder_ == null) {
        allMuseum_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        allMuseumBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public Builder removeAllMuseum(int index) {
      if (allMuseumBuilder_ == null) {
        ensureAllMuseumIsMutable();
        allMuseum_.remove(index);
        onChanged();
      } else {
        allMuseumBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public guru.qa.grpc.rococo.grpc.Museum.Builder getAllMuseumBuilder(
        int index) {
      return getAllMuseumFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public guru.qa.grpc.rococo.grpc.MuseumOrBuilder getAllMuseumOrBuilder(
        int index) {
      if (allMuseumBuilder_ == null) {
        return allMuseum_.get(index);  } else {
        return allMuseumBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public java.util.List<? extends guru.qa.grpc.rococo.grpc.MuseumOrBuilder> 
         getAllMuseumOrBuilderList() {
      if (allMuseumBuilder_ != null) {
        return allMuseumBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allMuseum_);
      }
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public guru.qa.grpc.rococo.grpc.Museum.Builder addAllMuseumBuilder() {
      return getAllMuseumFieldBuilder().addBuilder(
          guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance());
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public guru.qa.grpc.rococo.grpc.Museum.Builder addAllMuseumBuilder(
        int index) {
      return getAllMuseumFieldBuilder().addBuilder(
          index, guru.qa.grpc.rococo.grpc.Museum.getDefaultInstance());
    }
    /**
     * <code>repeated .guru.qa.grpc.rococo.grpc.Museum allMuseum = 1;</code>
     */
    public java.util.List<guru.qa.grpc.rococo.grpc.Museum.Builder> 
         getAllMuseumBuilderList() {
      return getAllMuseumFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        guru.qa.grpc.rococo.grpc.Museum, guru.qa.grpc.rococo.grpc.Museum.Builder, guru.qa.grpc.rococo.grpc.MuseumOrBuilder> 
        getAllMuseumFieldBuilder() {
      if (allMuseumBuilder_ == null) {
        allMuseumBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            guru.qa.grpc.rococo.grpc.Museum, guru.qa.grpc.rococo.grpc.Museum.Builder, guru.qa.grpc.rococo.grpc.MuseumOrBuilder>(
                allMuseum_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        allMuseum_ = null;
      }
      return allMuseumBuilder_;
    }

    private int totalCount_ ;
    /**
     * <code>int32 total_count = 2;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }
    /**
     * <code>int32 total_count = 2;</code>
     * @param value The totalCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCount(int value) {

      totalCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:guru.qa.grpc.rococo.grpc.MuseumResponse)
  }

  // @@protoc_insertion_point(class_scope:guru.qa.grpc.rococo.grpc.MuseumResponse)
  private static final guru.qa.grpc.rococo.grpc.MuseumResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new guru.qa.grpc.rococo.grpc.MuseumResponse();
  }

  public static guru.qa.grpc.rococo.grpc.MuseumResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MuseumResponse>
      PARSER = new com.google.protobuf.AbstractParser<MuseumResponse>() {
    @java.lang.Override
    public MuseumResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MuseumResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MuseumResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public guru.qa.grpc.rococo.grpc.MuseumResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

