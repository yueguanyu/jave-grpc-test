// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleServices.proto

package com.example.grpc;

public final class ExampleServices {
  private ExampleServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ExampleServices.proto\022\020com.example.grp" +
      "c\"\344\001\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030" +
      "\002 \001(\005\022\017\n\007hobbies\030\003 \003(\t\022D\n\013bagOfTricks\030\004 " +
      "\003(\0132/.com.example.grpc.HelloRequest.BagO" +
      "fTricksEntry\022.\n\tsentiment\030\005 \001(\0162\033.com.ex" +
      "ample.grpc.Sentiment\0322\n\020BagOfTricksEntry" +
      "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"!\n\rHell" +
      "oResponse\022\020\n\010greeting\030\001 \001(\t*-\n\tSentiment" +
      "\022\t\n\005HAPPY\020\000\022\n\n\006SLEEPY\020\001\022\t\n\005ANGRY\020\0022^\n\017Gr" +
      "eetingService\022K\n\010greeting\022\036.com.example." +
      "grpc.HelloRequest\032\037.com.example.grpc.Hel" +
      "loResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Age", "Hobbies", "BagOfTricks", "Sentiment", });
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor =
      internal_static_com_example_grpc_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloRequest_BagOfTricksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_example_grpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
