package com.example.aftership.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentRequest {
  @JsonProperty("tracking")
  public Tracking getTracking() {
    return this.tracking; }
  public void setTracking(Tracking tracking) {
    this.tracking = tracking; }
  public Tracking tracking;
}
