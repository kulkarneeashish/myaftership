package com.example.aftership.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrackingRequest {

  @JsonProperty("page")
  private int page;
  @JsonProperty("limit")
  private int limit;
  @JsonProperty("keyword")
  private String keyword;
  @JsonProperty("slug")
  private String slug;
  @JsonProperty("delivery_time")
  private String deliveryTime;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public TrackingRequest() {
    page = 1;
    limit = 100;
  }

  public TrackingRequest(int page, int limit, String keyword, String slug, String deliveryTime) {
    super();
    this.page = page;
    this.limit = limit;
    this.keyword = keyword;
    this.slug = slug;
    this.deliveryTime = deliveryTime;
  }

  @JsonProperty("page")
  public int getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(int page) {
    this.page = page;
  }

  public TrackingRequest withPage(int page) {
    this.page = page;
    return this;
  }

  @JsonProperty("limit")
  public int getLimit() {
    return limit;
  }

  @JsonProperty("limit")
  public void setLimit(int limit) {
    this.limit = limit;
  }

  public TrackingRequest withLimit(int limit) {
    this.limit = limit;
    return this;
  }

  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }

  @JsonProperty("keyword")
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public TrackingRequest withKeyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  @JsonProperty("slug")
  public void setSlug(String slug) {
    this.slug = slug;
  }

  public TrackingRequest withSlug(String slug) {
    this.slug = slug;
    return this;
  }

  @JsonProperty("delivery_time")
  public String getDeliveryTime() {
    return deliveryTime;
  }

  @JsonProperty("delivery_time")
  public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public TrackingRequest withDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
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

  public TrackingRequest withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}