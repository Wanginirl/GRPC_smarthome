// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heater.proto

package com.smarthome.heater;

public interface GetTemperatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SmartHome.GetTemperatureRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double temperature = 1;</code>
   */
  double getTemperature();

  /**
   * <code>.google.protobuf.Timestamp current_time = 2;</code>
   */
  boolean hasCurrentTime();
  /**
   * <code>.google.protobuf.Timestamp current_time = 2;</code>
   */
  com.google.protobuf.Timestamp getCurrentTime();
  /**
   * <code>.google.protobuf.Timestamp current_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentTimeOrBuilder();

  /**
   * <code>string status = 3;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 3;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
