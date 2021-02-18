package com.example.aftership.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AfterShipShipmentTrackingResponse {

  @JsonProperty("meta")
  private Meta meta;
  @JsonProperty("data")
  private Data data;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   *
   */
  public AfterShipShipmentTrackingResponse() {
  }

  /**
   *
   * @param data
   * @param meta
   */
  public AfterShipShipmentTrackingResponse(Meta meta, Data data) {
    super();
    this.meta = meta;
    this.data = data;
  }

  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public AfterShipShipmentTrackingResponse withMeta(Meta meta) {
    this.meta = meta;
    return this;
  }

  @JsonProperty("data")
  public Data getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(Data data) {
    this.data = data;
  }

  public AfterShipShipmentTrackingResponse withData(Data data) {
    this.data = data;
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

  public AfterShipShipmentTrackingResponse withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}
