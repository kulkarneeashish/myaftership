package com.example.aftership.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentTrackingResponse {

  @JsonProperty("id")
  private String id;
  @JsonProperty("origin")
  private String origin;
  @JsonProperty("destination")
  private String destination;
  @JsonProperty("currentStatus")
  private String currentStatus;
  @JsonProperty("trackingNumber")
  private String trackingNumber;
  @JsonProperty("courierCode")
  private String courierCode;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public ShipmentTrackingResponse() {
  }

  public ShipmentTrackingResponse(String id, String origin, String destination, String currentStatus, String trackingNumber, String courierCode) {
    super();
    this.id = id;
    this.origin = origin;
    this.destination = destination;
    this.currentStatus = currentStatus;
    this.trackingNumber = trackingNumber;
    this.courierCode = courierCode;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public ShipmentTrackingResponse withId(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }

  @JsonProperty("origin")
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ShipmentTrackingResponse withOrigin(String origin) {
    this.origin = origin;
    return this;
  }

  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  @JsonProperty("destination")
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public ShipmentTrackingResponse withDestination(String destination) {
    this.destination = destination;
    return this;
  }

  @JsonProperty("currentStatus")
  public String getCurrentStatus() {
    return currentStatus;
  }

  @JsonProperty("currentStatus")
  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ShipmentTrackingResponse withCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  @JsonProperty("trackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  @JsonProperty("trackingNumber")
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ShipmentTrackingResponse withTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  @JsonProperty("courierCode")
  public String getCourierCode() {
    return courierCode;
  }

  @JsonProperty("courierCode")
  public void setCourierCode(String courierCode) {
    this.courierCode = courierCode;
  }

  public ShipmentTrackingResponse withCourierCode(String courierCode) {
    this.courierCode = courierCode;
    return this;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public ShipmentTrackingResponse withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}
