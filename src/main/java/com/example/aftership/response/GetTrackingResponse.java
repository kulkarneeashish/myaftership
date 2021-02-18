package com.example.aftership.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data"
})
public class GetTrackingResponse {

  @JsonProperty("meta")
  private GetTrackingMeta meta;
  @JsonProperty("data")
  private GetTrackingData data;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   */
  public GetTrackingResponse() {
  }

  /**
   * @param data
   * @param meta
   */
  public GetTrackingResponse(GetTrackingMeta meta, GetTrackingData data) {
    super();
    this.meta = meta;
    this.data = data;
  }

  @JsonProperty("meta")
  public GetTrackingMeta getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(GetTrackingMeta meta) {
    this.meta = meta;
  }

  public GetTrackingResponse withMeta(GetTrackingMeta meta) {
    this.meta = meta;
    return this;
  }

  @JsonProperty("data")
  public GetTrackingData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(GetTrackingData data) {
    this.data = data;
  }

  public GetTrackingResponse withData(GetTrackingData data) {
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

  public GetTrackingResponse withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}

