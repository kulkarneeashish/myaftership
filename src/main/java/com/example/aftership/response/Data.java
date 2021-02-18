
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
    "tracking"
})
public class Data {

  @JsonProperty("tracking")
  private Tracking tracking;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public Data() {
  }
  public Data(Tracking tracking) {
    super();
    this.tracking = tracking;
  }

  @JsonProperty("tracking")
  public Tracking getTracking() {
    return tracking;
  }

  @JsonProperty("tracking")
  public void setTracking(Tracking tracking) {
    this.tracking = tracking;
  }

  public Data withTracking(Tracking tracking) {
    this.tracking = tracking;
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

  public Data withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}




