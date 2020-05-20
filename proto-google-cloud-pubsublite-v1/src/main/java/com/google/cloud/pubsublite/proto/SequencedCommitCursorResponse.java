// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/cursor.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Response to a SequencedCommitCursorRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.SequencedCommitCursorResponse}
 */
public final class SequencedCommitCursorResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.SequencedCommitCursorResponse)
    SequencedCommitCursorResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SequencedCommitCursorResponse.newBuilder() to construct.
  private SequencedCommitCursorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SequencedCommitCursorResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SequencedCommitCursorResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SequencedCommitCursorResponse(
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
          case 8:
            {
              acknowledgedCommits_ = input.readInt64();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_SequencedCommitCursorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_SequencedCommitCursorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.class,
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder.class);
  }

  public static final int ACKNOWLEDGED_COMMITS_FIELD_NUMBER = 1;
  private long acknowledgedCommits_;
  /**
   *
   *
   * <pre>
   * The number of outstanding SequencedCommitCursorRequests acknowledged by
   * this response. Note that SequencedCommitCursorRequests are acknowledged in
   * the order that they are received.
   * </pre>
   *
   * <code>int64 acknowledged_commits = 1;</code>
   *
   * @return The acknowledgedCommits.
   */
  public long getAcknowledgedCommits() {
    return acknowledgedCommits_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (acknowledgedCommits_ != 0L) {
      output.writeInt64(1, acknowledgedCommits_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acknowledgedCommits_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, acknowledgedCommits_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse other =
        (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) obj;

    if (getAcknowledgedCommits() != other.getAcknowledgedCommits()) return false;
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
    hash = (37 * hash) + ACKNOWLEDGED_COMMITS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAcknowledgedCommits());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to a SequencedCommitCursorRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.SequencedCommitCursorResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.SequencedCommitCursorResponse)
      com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_SequencedCommitCursorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_SequencedCommitCursorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.class,
              com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      acknowledgedCommits_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_SequencedCommitCursorResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse
        getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse build() {
      com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse buildPartial() {
      com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse result =
          new com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse(this);
      result.acknowledgedCommits_ = acknowledgedCommits_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse other) {
      if (other
          == com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance())
        return this;
      if (other.getAcknowledgedCommits() != 0L) {
        setAcknowledgedCommits(other.getAcknowledgedCommits());
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
      com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long acknowledgedCommits_;
    /**
     *
     *
     * <pre>
     * The number of outstanding SequencedCommitCursorRequests acknowledged by
     * this response. Note that SequencedCommitCursorRequests are acknowledged in
     * the order that they are received.
     * </pre>
     *
     * <code>int64 acknowledged_commits = 1;</code>
     *
     * @return The acknowledgedCommits.
     */
    public long getAcknowledgedCommits() {
      return acknowledgedCommits_;
    }
    /**
     *
     *
     * <pre>
     * The number of outstanding SequencedCommitCursorRequests acknowledged by
     * this response. Note that SequencedCommitCursorRequests are acknowledged in
     * the order that they are received.
     * </pre>
     *
     * <code>int64 acknowledged_commits = 1;</code>
     *
     * @param value The acknowledgedCommits to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgedCommits(long value) {

      acknowledgedCommits_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of outstanding SequencedCommitCursorRequests acknowledged by
     * this response. Note that SequencedCommitCursorRequests are acknowledged in
     * the order that they are received.
     * </pre>
     *
     * <code>int64 acknowledged_commits = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcknowledgedCommits() {

      acknowledgedCommits_ = 0L;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.SequencedCommitCursorResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.SequencedCommitCursorResponse)
  private static final com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse();
  }

  public static com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SequencedCommitCursorResponse> PARSER =
      new com.google.protobuf.AbstractParser<SequencedCommitCursorResponse>() {
        @java.lang.Override
        public SequencedCommitCursorResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SequencedCommitCursorResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SequencedCommitCursorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SequencedCommitCursorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
