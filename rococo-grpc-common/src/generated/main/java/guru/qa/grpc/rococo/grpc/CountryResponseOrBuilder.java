// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rococo.proto

package guru.qa.grpc.rococo.grpc;

public interface CountryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.rococo.grpc.CountryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Country allCountry = 1;</code>
   */
  java.util.List<guru.qa.grpc.rococo.grpc.Country> 
      getAllCountryList();
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Country allCountry = 1;</code>
   */
  guru.qa.grpc.rococo.grpc.Country getAllCountry(int index);
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Country allCountry = 1;</code>
   */
  int getAllCountryCount();
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Country allCountry = 1;</code>
   */
  java.util.List<? extends guru.qa.grpc.rococo.grpc.CountryOrBuilder> 
      getAllCountryOrBuilderList();
  /**
   * <code>repeated .guru.qa.grpc.rococo.grpc.Country allCountry = 1;</code>
   */
  guru.qa.grpc.rococo.grpc.CountryOrBuilder getAllCountryOrBuilder(
      int index);

  /**
   * <code>int32 total_count = 2;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}
