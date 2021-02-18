package com.example.aftership.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "limit",
    "count",
    "keyword",
    "slug",
    "origin",
    "destination",
    "tag",
    "fields",
    "created_at_min",
    "created_at_max",
    "last_updated_at",
    "return_to_sender",
    "courier_destination_country_iso3",
    "trackings"
})
public class GetTrackingData {

  @JsonProperty("page")
  private int page;
  @JsonProperty("limit")
  private int limit;
  @JsonProperty("count")
  private int count;
  @JsonProperty("keyword")
  private String keyword;
  @JsonProperty("slug")
  private String slug;
  @JsonProperty("origin")
  private List<Object> origin = new ArrayList<Object>();
  @JsonProperty("destination")
  private List<Object> destination = new ArrayList<Object>();
  @JsonProperty("tag")
  private String tag;
  @JsonProperty("fields")
  private String fields;
  @JsonProperty("created_at_min")
  private String createdAtMin;
  @JsonProperty("created_at_max")
  private String createdAtMax;
  @JsonProperty("last_updated_at")
  private Object lastUpdatedAt;
  @JsonProperty("return_to_sender")
  private List<Object> returnToSender = new ArrayList<Object>();
  @JsonProperty("courier_destination_country_iso3")
  private List<Object> courierDestinationCountryIso3 = new ArrayList<Object>();
  @JsonProperty("trackings")
  private List<Tracking> trackings = new ArrayList<Tracking>();
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   *
   */
  public GetTrackingData() {
  }

  /**
   *
   * @param courierDestinationCountryIso3
   * @param lastUpdatedAt
   * @param origin
   * @param count
   * @param destination
   * @param createdAtMin
   * @param returnToSender
   * @param trackings
   * @param createdAtMax
   * @param limit
   * @param page
   * @param tag
   * @param keyword
   * @param fields
   * @param slug
   */
  public GetTrackingData(int page, int limit, int count, String keyword, String slug, List<Object> origin, List<Object> destination, String tag, String fields, String createdAtMin, String createdAtMax, Object lastUpdatedAt, List<Object> returnToSender, List<Object> courierDestinationCountryIso3, List<Tracking> trackings) {
    super();
    this.page = page;
    this.limit = limit;
    this.count = count;
    this.keyword = keyword;
    this.slug = slug;
    this.origin = origin;
    this.destination = destination;
    this.tag = tag;
    this.fields = fields;
    this.createdAtMin = createdAtMin;
    this.createdAtMax = createdAtMax;
    this.lastUpdatedAt = lastUpdatedAt;
    this.returnToSender = returnToSender;
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
    this.trackings = trackings;
  }

  @JsonProperty("page")
  public int getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(int page) {
    this.page = page;
  }

  public GetTrackingData withPage(int page) {
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

  public GetTrackingData withLimit(int limit) {
    this.limit = limit;
    return this;
  }

  @JsonProperty("count")
  public int getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(int count) {
    this.count = count;
  }

  public GetTrackingData withCount(int count) {
    this.count = count;
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

  public GetTrackingData withKeyword(String keyword) {
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

  public GetTrackingData withSlug(String slug) {
    this.slug = slug;
    return this;
  }

  @JsonProperty("origin")
  public List<Object> getOrigin() {
    return origin;
  }

  @JsonProperty("origin")
  public void setOrigin(List<Object> origin) {
    this.origin = origin;
  }

  public GetTrackingData withOrigin(List<Object> origin) {
    this.origin = origin;
    return this;
  }

  @JsonProperty("destination")
  public List<Object> getDestination() {
    return destination;
  }

  @JsonProperty("destination")
  public void setDestination(List<Object> destination) {
    this.destination = destination;
  }

  public GetTrackingData withDestination(List<Object> destination) {
    this.destination = destination;
    return this;
  }

  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  @JsonProperty("tag")
  public void setTag(String tag) {
    this.tag = tag;
  }

  public GetTrackingData withTag(String tag) {
    this.tag = tag;
    return this;
  }

  @JsonProperty("fields")
  public String getFields() {
    return fields;
  }

  @JsonProperty("fields")
  public void setFields(String fields) {
    this.fields = fields;
  }

  public GetTrackingData withFields(String fields) {
    this.fields = fields;
    return this;
  }

  @JsonProperty("created_at_min")
  public String getCreatedAtMin() {
    return createdAtMin;
  }

  @JsonProperty("created_at_min")
  public void setCreatedAtMin(String createdAtMin) {
    this.createdAtMin = createdAtMin;
  }

  public GetTrackingData withCreatedAtMin(String createdAtMin) {
    this.createdAtMin = createdAtMin;
    return this;
  }

  @JsonProperty("created_at_max")
  public String getCreatedAtMax() {
    return createdAtMax;
  }

  @JsonProperty("created_at_max")
  public void setCreatedAtMax(String createdAtMax) {
    this.createdAtMax = createdAtMax;
  }

  public GetTrackingData withCreatedAtMax(String createdAtMax) {
    this.createdAtMax = createdAtMax;
    return this;
  }

  @JsonProperty("last_updated_at")
  public Object getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  @JsonProperty("last_updated_at")
  public void setLastUpdatedAt(Object lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public GetTrackingData withLastUpdatedAt(Object lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  @JsonProperty("return_to_sender")
  public List<Object> getReturnToSender() {
    return returnToSender;
  }

  @JsonProperty("return_to_sender")
  public void setReturnToSender(List<Object> returnToSender) {
    this.returnToSender = returnToSender;
  }

  public GetTrackingData withReturnToSender(List<Object> returnToSender) {
    this.returnToSender = returnToSender;
    return this;
  }

  @JsonProperty("courier_destination_country_iso3")
  public List<Object> getCourierDestinationCountryIso3() {
    return courierDestinationCountryIso3;
  }

  @JsonProperty("courier_destination_country_iso3")
  public void setCourierDestinationCountryIso3(List<Object> courierDestinationCountryIso3) {
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
  }

  public GetTrackingData withCourierDestinationCountryIso3(List<Object> courierDestinationCountryIso3) {
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
    return this;
  }

  @JsonProperty("trackings")
  public List<Tracking> getTrackings() {
    return trackings;
  }

  @JsonProperty("trackings")
  public void setTrackings(List<Tracking> trackings) {
    this.trackings = trackings;
  }

  public GetTrackingData withTrackings(List<Tracking> trackings) {
    this.trackings = trackings;
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

  public GetTrackingData withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}
