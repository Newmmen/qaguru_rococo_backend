// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo_artist.proto

package guru.qa.grpc.rococo.grpc;

public interface PaintingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.rococo.grpc.Painting)
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
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string content = 4;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>.guru.qa.grpc.rococo.grpc.Artist artist = 5;</code>
   * @return Whether the artist field is set.
   */
  boolean hasArtist();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Artist artist = 5;</code>
   * @return The artist.
   */
  guru.qa.grpc.rococo.grpc.Artist getArtist();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Artist artist = 5;</code>
   */
  guru.qa.grpc.rococo.grpc.ArtistOrBuilder getArtistOrBuilder();
}
