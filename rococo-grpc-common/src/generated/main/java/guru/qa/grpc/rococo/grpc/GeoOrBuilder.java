// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo_artist.proto

package guru.qa.grpc.rococo.grpc;

public interface GeoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.rococo.grpc.Geo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string city = 1;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 1;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   * @return Whether the country field is set.
   */
  boolean hasCountry();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   * @return The country.
   */
  guru.qa.grpc.rococo.grpc.Country getCountry();
  /**
   * <code>.guru.qa.grpc.rococo.grpc.Country country = 2;</code>
   */
  guru.qa.grpc.rococo.grpc.CountryOrBuilder getCountryOrBuilder();
}
