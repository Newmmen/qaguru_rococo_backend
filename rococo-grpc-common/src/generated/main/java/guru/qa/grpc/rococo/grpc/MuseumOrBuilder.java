// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo.proto

package guru.qa.grpc.rococo.grpc;

public interface MuseumOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.rococo.grpc.Museum)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>bytes photo = 2;</code>
   * @return The photo.
   */
  com.google.protobuf.ByteString getPhoto();

  /**
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.guru.qa.grpc.rococo.grpc.Geo geo = 5;</code>
   * @return Whether the geo field is set.
   */
  boolean hasGeo();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Geo geo = 5;</code>
   * @return The geo.
   */
  guru.qa.grpc.rococo.grpc.Geo getGeo();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Geo geo = 5;</code>
   */
  guru.qa.grpc.rococo.grpc.GeoOrBuilder getGeoOrBuilder();
}
