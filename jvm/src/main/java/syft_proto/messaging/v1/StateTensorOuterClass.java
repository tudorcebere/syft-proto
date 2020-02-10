// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syft_proto/messaging/v1/state_tensor.proto

package syft_proto.messaging.v1;

public final class StateTensorOuterClass {
  private StateTensorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StateTensorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:syft_proto.messaging.v1.StateTensor)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    boolean hasTorchTensor();
    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    syft_proto.types.torch.v1.Tensor.TorchTensor getTorchTensor();
    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder getTorchTensorOrBuilder();

    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    boolean hasTorchParam();
    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    syft_proto.types.torch.v1.ParameterOuterClass.Parameter getTorchParam();
    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder getTorchParamOrBuilder();

    public syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.TensorCase getTensorCase();
  }
  /**
   * Protobuf type {@code syft_proto.messaging.v1.StateTensor}
   */
  public  static final class StateTensor extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:syft_proto.messaging.v1.StateTensor)
      StateTensorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StateTensor.newBuilder() to construct.
    private StateTensor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StateTensor() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StateTensor();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StateTensor(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              syft_proto.types.torch.v1.Tensor.TorchTensor.Builder subBuilder = null;
              if (tensorCase_ == 1) {
                subBuilder = ((syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_).toBuilder();
              }
              tensor_ =
                  input.readMessage(syft_proto.types.torch.v1.Tensor.TorchTensor.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_);
                tensor_ = subBuilder.buildPartial();
              }
              tensorCase_ = 1;
              break;
            }
            case 18: {
              syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder subBuilder = null;
              if (tensorCase_ == 2) {
                subBuilder = ((syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_).toBuilder();
              }
              tensor_ =
                  input.readMessage(syft_proto.types.torch.v1.ParameterOuterClass.Parameter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_);
                tensor_ = subBuilder.buildPartial();
              }
              tensorCase_ = 2;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return syft_proto.messaging.v1.StateTensorOuterClass.internal_static_syft_proto_messaging_v1_StateTensor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return syft_proto.messaging.v1.StateTensorOuterClass.internal_static_syft_proto_messaging_v1_StateTensor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.class, syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.Builder.class);
    }

    private int tensorCase_ = 0;
    private java.lang.Object tensor_;
    public enum TensorCase
        implements com.google.protobuf.Internal.EnumLite {
      TORCH_TENSOR(1),
      TORCH_PARAM(2),
      TENSOR_NOT_SET(0);
      private final int value;
      private TensorCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static TensorCase valueOf(int value) {
        return forNumber(value);
      }

      public static TensorCase forNumber(int value) {
        switch (value) {
          case 1: return TORCH_TENSOR;
          case 2: return TORCH_PARAM;
          case 0: return TENSOR_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public TensorCase
    getTensorCase() {
      return TensorCase.forNumber(
          tensorCase_);
    }

    public static final int TORCH_TENSOR_FIELD_NUMBER = 1;
    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    public boolean hasTorchTensor() {
      return tensorCase_ == 1;
    }
    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    public syft_proto.types.torch.v1.Tensor.TorchTensor getTorchTensor() {
      if (tensorCase_ == 1) {
         return (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_;
      }
      return syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
    }
    /**
     * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
     */
    public syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder getTorchTensorOrBuilder() {
      if (tensorCase_ == 1) {
         return (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_;
      }
      return syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
    }

    public static final int TORCH_PARAM_FIELD_NUMBER = 2;
    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    public boolean hasTorchParam() {
      return tensorCase_ == 2;
    }
    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    public syft_proto.types.torch.v1.ParameterOuterClass.Parameter getTorchParam() {
      if (tensorCase_ == 2) {
         return (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_;
      }
      return syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
    }
    /**
     * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
     */
    public syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder getTorchParamOrBuilder() {
      if (tensorCase_ == 2) {
         return (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_;
      }
      return syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
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
      if (tensorCase_ == 1) {
        output.writeMessage(1, (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_);
      }
      if (tensorCase_ == 2) {
        output.writeMessage(2, (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tensorCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_);
      }
      if (tensorCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof syft_proto.messaging.v1.StateTensorOuterClass.StateTensor)) {
        return super.equals(obj);
      }
      syft_proto.messaging.v1.StateTensorOuterClass.StateTensor other = (syft_proto.messaging.v1.StateTensorOuterClass.StateTensor) obj;

      if (!getTensorCase().equals(other.getTensorCase())) return false;
      switch (tensorCase_) {
        case 1:
          if (!getTorchTensor()
              .equals(other.getTorchTensor())) return false;
          break;
        case 2:
          if (!getTorchParam()
              .equals(other.getTorchParam())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      switch (tensorCase_) {
        case 1:
          hash = (37 * hash) + TORCH_TENSOR_FIELD_NUMBER;
          hash = (53 * hash) + getTorchTensor().hashCode();
          break;
        case 2:
          hash = (37 * hash) + TORCH_PARAM_FIELD_NUMBER;
          hash = (53 * hash) + getTorchParam().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parseFrom(
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
    public static Builder newBuilder(syft_proto.messaging.v1.StateTensorOuterClass.StateTensor prototype) {
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
     * Protobuf type {@code syft_proto.messaging.v1.StateTensor}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:syft_proto.messaging.v1.StateTensor)
        syft_proto.messaging.v1.StateTensorOuterClass.StateTensorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return syft_proto.messaging.v1.StateTensorOuterClass.internal_static_syft_proto_messaging_v1_StateTensor_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return syft_proto.messaging.v1.StateTensorOuterClass.internal_static_syft_proto_messaging_v1_StateTensor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.class, syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.Builder.class);
      }

      // Construct using syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tensorCase_ = 0;
        tensor_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return syft_proto.messaging.v1.StateTensorOuterClass.internal_static_syft_proto_messaging_v1_StateTensor_descriptor;
      }

      @java.lang.Override
      public syft_proto.messaging.v1.StateTensorOuterClass.StateTensor getDefaultInstanceForType() {
        return syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.getDefaultInstance();
      }

      @java.lang.Override
      public syft_proto.messaging.v1.StateTensorOuterClass.StateTensor build() {
        syft_proto.messaging.v1.StateTensorOuterClass.StateTensor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public syft_proto.messaging.v1.StateTensorOuterClass.StateTensor buildPartial() {
        syft_proto.messaging.v1.StateTensorOuterClass.StateTensor result = new syft_proto.messaging.v1.StateTensorOuterClass.StateTensor(this);
        if (tensorCase_ == 1) {
          if (torchTensorBuilder_ == null) {
            result.tensor_ = tensor_;
          } else {
            result.tensor_ = torchTensorBuilder_.build();
          }
        }
        if (tensorCase_ == 2) {
          if (torchParamBuilder_ == null) {
            result.tensor_ = tensor_;
          } else {
            result.tensor_ = torchParamBuilder_.build();
          }
        }
        result.tensorCase_ = tensorCase_;
        onBuilt();
        return result;
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
        if (other instanceof syft_proto.messaging.v1.StateTensorOuterClass.StateTensor) {
          return mergeFrom((syft_proto.messaging.v1.StateTensorOuterClass.StateTensor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(syft_proto.messaging.v1.StateTensorOuterClass.StateTensor other) {
        if (other == syft_proto.messaging.v1.StateTensorOuterClass.StateTensor.getDefaultInstance()) return this;
        switch (other.getTensorCase()) {
          case TORCH_TENSOR: {
            mergeTorchTensor(other.getTorchTensor());
            break;
          }
          case TORCH_PARAM: {
            mergeTorchParam(other.getTorchParam());
            break;
          }
          case TENSOR_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        syft_proto.messaging.v1.StateTensorOuterClass.StateTensor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (syft_proto.messaging.v1.StateTensorOuterClass.StateTensor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int tensorCase_ = 0;
      private java.lang.Object tensor_;
      public TensorCase
          getTensorCase() {
        return TensorCase.forNumber(
            tensorCase_);
      }

      public Builder clearTensor() {
        tensorCase_ = 0;
        tensor_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilderV3<
          syft_proto.types.torch.v1.Tensor.TorchTensor, syft_proto.types.torch.v1.Tensor.TorchTensor.Builder, syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder> torchTensorBuilder_;
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public boolean hasTorchTensor() {
        return tensorCase_ == 1;
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public syft_proto.types.torch.v1.Tensor.TorchTensor getTorchTensor() {
        if (torchTensorBuilder_ == null) {
          if (tensorCase_ == 1) {
            return (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_;
          }
          return syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
        } else {
          if (tensorCase_ == 1) {
            return torchTensorBuilder_.getMessage();
          }
          return syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
        }
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public Builder setTorchTensor(syft_proto.types.torch.v1.Tensor.TorchTensor value) {
        if (torchTensorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tensor_ = value;
          onChanged();
        } else {
          torchTensorBuilder_.setMessage(value);
        }
        tensorCase_ = 1;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public Builder setTorchTensor(
          syft_proto.types.torch.v1.Tensor.TorchTensor.Builder builderForValue) {
        if (torchTensorBuilder_ == null) {
          tensor_ = builderForValue.build();
          onChanged();
        } else {
          torchTensorBuilder_.setMessage(builderForValue.build());
        }
        tensorCase_ = 1;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public Builder mergeTorchTensor(syft_proto.types.torch.v1.Tensor.TorchTensor value) {
        if (torchTensorBuilder_ == null) {
          if (tensorCase_ == 1 &&
              tensor_ != syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance()) {
            tensor_ = syft_proto.types.torch.v1.Tensor.TorchTensor.newBuilder((syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_)
                .mergeFrom(value).buildPartial();
          } else {
            tensor_ = value;
          }
          onChanged();
        } else {
          if (tensorCase_ == 1) {
            torchTensorBuilder_.mergeFrom(value);
          }
          torchTensorBuilder_.setMessage(value);
        }
        tensorCase_ = 1;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public Builder clearTorchTensor() {
        if (torchTensorBuilder_ == null) {
          if (tensorCase_ == 1) {
            tensorCase_ = 0;
            tensor_ = null;
            onChanged();
          }
        } else {
          if (tensorCase_ == 1) {
            tensorCase_ = 0;
            tensor_ = null;
          }
          torchTensorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public syft_proto.types.torch.v1.Tensor.TorchTensor.Builder getTorchTensorBuilder() {
        return getTorchTensorFieldBuilder().getBuilder();
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      public syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder getTorchTensorOrBuilder() {
        if ((tensorCase_ == 1) && (torchTensorBuilder_ != null)) {
          return torchTensorBuilder_.getMessageOrBuilder();
        } else {
          if (tensorCase_ == 1) {
            return (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_;
          }
          return syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
        }
      }
      /**
       * <code>.syft_proto.types.torch.v1.TorchTensor torch_tensor = 1[json_name = "torchTensor"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          syft_proto.types.torch.v1.Tensor.TorchTensor, syft_proto.types.torch.v1.Tensor.TorchTensor.Builder, syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder> 
          getTorchTensorFieldBuilder() {
        if (torchTensorBuilder_ == null) {
          if (!(tensorCase_ == 1)) {
            tensor_ = syft_proto.types.torch.v1.Tensor.TorchTensor.getDefaultInstance();
          }
          torchTensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              syft_proto.types.torch.v1.Tensor.TorchTensor, syft_proto.types.torch.v1.Tensor.TorchTensor.Builder, syft_proto.types.torch.v1.Tensor.TorchTensorOrBuilder>(
                  (syft_proto.types.torch.v1.Tensor.TorchTensor) tensor_,
                  getParentForChildren(),
                  isClean());
          tensor_ = null;
        }
        tensorCase_ = 1;
        onChanged();;
        return torchTensorBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          syft_proto.types.torch.v1.ParameterOuterClass.Parameter, syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder, syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder> torchParamBuilder_;
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public boolean hasTorchParam() {
        return tensorCase_ == 2;
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public syft_proto.types.torch.v1.ParameterOuterClass.Parameter getTorchParam() {
        if (torchParamBuilder_ == null) {
          if (tensorCase_ == 2) {
            return (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_;
          }
          return syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
        } else {
          if (tensorCase_ == 2) {
            return torchParamBuilder_.getMessage();
          }
          return syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
        }
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public Builder setTorchParam(syft_proto.types.torch.v1.ParameterOuterClass.Parameter value) {
        if (torchParamBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tensor_ = value;
          onChanged();
        } else {
          torchParamBuilder_.setMessage(value);
        }
        tensorCase_ = 2;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public Builder setTorchParam(
          syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder builderForValue) {
        if (torchParamBuilder_ == null) {
          tensor_ = builderForValue.build();
          onChanged();
        } else {
          torchParamBuilder_.setMessage(builderForValue.build());
        }
        tensorCase_ = 2;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public Builder mergeTorchParam(syft_proto.types.torch.v1.ParameterOuterClass.Parameter value) {
        if (torchParamBuilder_ == null) {
          if (tensorCase_ == 2 &&
              tensor_ != syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance()) {
            tensor_ = syft_proto.types.torch.v1.ParameterOuterClass.Parameter.newBuilder((syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_)
                .mergeFrom(value).buildPartial();
          } else {
            tensor_ = value;
          }
          onChanged();
        } else {
          if (tensorCase_ == 2) {
            torchParamBuilder_.mergeFrom(value);
          }
          torchParamBuilder_.setMessage(value);
        }
        tensorCase_ = 2;
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public Builder clearTorchParam() {
        if (torchParamBuilder_ == null) {
          if (tensorCase_ == 2) {
            tensorCase_ = 0;
            tensor_ = null;
            onChanged();
          }
        } else {
          if (tensorCase_ == 2) {
            tensorCase_ = 0;
            tensor_ = null;
          }
          torchParamBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder getTorchParamBuilder() {
        return getTorchParamFieldBuilder().getBuilder();
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      public syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder getTorchParamOrBuilder() {
        if ((tensorCase_ == 2) && (torchParamBuilder_ != null)) {
          return torchParamBuilder_.getMessageOrBuilder();
        } else {
          if (tensorCase_ == 2) {
            return (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_;
          }
          return syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
        }
      }
      /**
       * <code>.syft_proto.types.torch.v1.Parameter torch_param = 2[json_name = "torchParam"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          syft_proto.types.torch.v1.ParameterOuterClass.Parameter, syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder, syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder> 
          getTorchParamFieldBuilder() {
        if (torchParamBuilder_ == null) {
          if (!(tensorCase_ == 2)) {
            tensor_ = syft_proto.types.torch.v1.ParameterOuterClass.Parameter.getDefaultInstance();
          }
          torchParamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              syft_proto.types.torch.v1.ParameterOuterClass.Parameter, syft_proto.types.torch.v1.ParameterOuterClass.Parameter.Builder, syft_proto.types.torch.v1.ParameterOuterClass.ParameterOrBuilder>(
                  (syft_proto.types.torch.v1.ParameterOuterClass.Parameter) tensor_,
                  getParentForChildren(),
                  isClean());
          tensor_ = null;
        }
        tensorCase_ = 2;
        onChanged();;
        return torchParamBuilder_;
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


      // @@protoc_insertion_point(builder_scope:syft_proto.messaging.v1.StateTensor)
    }

    // @@protoc_insertion_point(class_scope:syft_proto.messaging.v1.StateTensor)
    private static final syft_proto.messaging.v1.StateTensorOuterClass.StateTensor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new syft_proto.messaging.v1.StateTensorOuterClass.StateTensor();
    }

    public static syft_proto.messaging.v1.StateTensorOuterClass.StateTensor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StateTensor>
        PARSER = new com.google.protobuf.AbstractParser<StateTensor>() {
      @java.lang.Override
      public StateTensor parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StateTensor(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StateTensor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StateTensor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public syft_proto.messaging.v1.StateTensorOuterClass.StateTensor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_syft_proto_messaging_v1_StateTensor_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_syft_proto_messaging_v1_StateTensor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*syft_proto/messaging/v1/state_tensor.p" +
      "roto\022\027syft_proto.messaging.v1\032Esyft_prot" +
      "o/frameworks/torch/tensors/interpreters/" +
      "v1/placeholder.proto\032&syft_proto/types/t" +
      "orch/v1/tensor.proto\032)syft_proto/types/t" +
      "orch/v1/parameter.proto\"\255\001\n\013StateTensor\022" +
      "K\n\014torch_tensor\030\001 \001(\0132&.syft_proto.types" +
      ".torch.v1.TorchTensorH\000R\013torchTensor\022G\n\013" +
      "torch_param\030\002 \001(\0132$.syft_proto.types.tor" +
      "ch.v1.ParameterH\000R\ntorchParamB\010\n\006tensorb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          syft_proto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.getDescriptor(),
          syft_proto.types.torch.v1.Tensor.getDescriptor(),
          syft_proto.types.torch.v1.ParameterOuterClass.getDescriptor(),
        });
    internal_static_syft_proto_messaging_v1_StateTensor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_syft_proto_messaging_v1_StateTensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_syft_proto_messaging_v1_StateTensor_descriptor,
        new java.lang.String[] { "TorchTensor", "TorchParam", "Tensor", });
    syft_proto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.getDescriptor();
    syft_proto.types.torch.v1.Tensor.getDescriptor();
    syft_proto.types.torch.v1.ParameterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
