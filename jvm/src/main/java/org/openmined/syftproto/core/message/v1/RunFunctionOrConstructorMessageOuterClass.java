// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syft_proto/core/message/run_function_or_constructor_message.proto

package org.openmined.syftproto.core.message.v1;

public final class RunFunctionOrConstructorMessageOuterClass {
  private RunFunctionOrConstructorMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RunFunctionOrConstructorMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:syft_proto.core.message.v1.RunFunctionOrConstructorMessage)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code syft_proto.core.message.v1.RunFunctionOrConstructorMessage}
   */
  public  static final class RunFunctionOrConstructorMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:syft_proto.core.message.v1.RunFunctionOrConstructorMessage)
      RunFunctionOrConstructorMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RunFunctionOrConstructorMessage.newBuilder() to construct.
    private RunFunctionOrConstructorMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RunFunctionOrConstructorMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RunFunctionOrConstructorMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RunFunctionOrConstructorMessage(
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
      return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.class, org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage)) {
        return super.equals(obj);
      }
      org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage other = (org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parseFrom(
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
    public static Builder newBuilder(org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage prototype) {
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
     * Protobuf type {@code syft_proto.core.message.v1.RunFunctionOrConstructorMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:syft_proto.core.message.v1.RunFunctionOrConstructorMessage)
        org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.class, org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.Builder.class);
      }

      // Construct using org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor;
      }

      @java.lang.Override
      public org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage getDefaultInstanceForType() {
        return org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.getDefaultInstance();
      }

      @java.lang.Override
      public org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage build() {
        org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage buildPartial() {
        org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage result = new org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage(this);
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
        if (other instanceof org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage) {
          return mergeFrom((org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage other) {
        if (other == org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage.getDefaultInstance()) return this;
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
        org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:syft_proto.core.message.v1.RunFunctionOrConstructorMessage)
    }

    // @@protoc_insertion_point(class_scope:syft_proto.core.message.v1.RunFunctionOrConstructorMessage)
    private static final org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage();
    }

    public static org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RunFunctionOrConstructorMessage>
        PARSER = new com.google.protobuf.AbstractParser<RunFunctionOrConstructorMessage>() {
      @java.lang.Override
      public RunFunctionOrConstructorMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RunFunctionOrConstructorMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RunFunctionOrConstructorMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RunFunctionOrConstructorMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.openmined.syftproto.core.message.v1.RunFunctionOrConstructorMessageOuterClass.RunFunctionOrConstructorMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAsyft_proto/core/message/run_function_o" +
      "r_constructor_message.proto\022\032syft_proto." +
      "core.message.v1\"!\n\037RunFunctionOrConstruc" +
      "torMessageB)\n\'org.openmined.syftproto.co" +
      "re.message.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_syft_proto_core_message_v1_RunFunctionOrConstructorMessage_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}