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
    "slug",
    "city",
    "created_at",
    "location",
    "country_name",
    "message",
    "country_iso3",
    "tag",
    "subtag",
    "subtag_message",
    "checkpoint_time",
    "coordinates",
    "state",
    "zip",
    "raw_tag"
})
public class Checkpoint {

 @JsonProperty("slug")
 private String slug;
 @JsonProperty("city")
 private String city;
 @JsonProperty("created_at")
 private String createdAt;
 @JsonProperty("location")
 private String location;
 @JsonProperty("country_name")
 private Object countryName;
 @JsonProperty("message")
 private String message;
 @JsonProperty("country_iso3")
 private Object countryIso3;
 @JsonProperty("tag")
 private String tag;
 @JsonProperty("subtag")
 private String subtag;
 @JsonProperty("subtag_message")
 private String subtagMessage;
 @JsonProperty("checkpoint_time")
 private String checkpointTime;
 @JsonProperty("coordinates")
 private List<Object> coordinates = new ArrayList<Object>();
 @JsonProperty("state")
 private String state;
 @JsonProperty("zip")
 private Object zip;
 @JsonProperty("raw_tag")
 private String rawTag;
 @JsonIgnore
 private Map<String, Object> additionalProperties = new HashMap<String, Object>();

 /**
  * No args constructor for use in serialization
  *
  */
 public Checkpoint() {
 }

 /**
  *
  * @param zip
  * @param rawTag
  * @param city
  * @param subtag
  * @param subtagMessage
  * @param coordinates
  * @param message
  * @param checkpointTime
  * @param createdAt
  * @param location
  * @param countryName
  * @param tag
  * @param state
  * @param countryIso3
  * @param slug
  */
 public Checkpoint(String slug, String city, String createdAt, String location, Object countryName, String message, Object countryIso3, String tag, String subtag, String subtagMessage, String checkpointTime, List<Object> coordinates, String state, Object zip, String rawTag) {
  super();
  this.slug = slug;
  this.city = city;
  this.createdAt = createdAt;
  this.location = location;
  this.countryName = countryName;
  this.message = message;
  this.countryIso3 = countryIso3;
  this.tag = tag;
  this.subtag = subtag;
  this.subtagMessage = subtagMessage;
  this.checkpointTime = checkpointTime;
  this.coordinates = coordinates;
  this.state = state;
  this.zip = zip;
  this.rawTag = rawTag;
 }

 @JsonProperty("slug")
 public String getSlug() {
  return slug;
 }

 @JsonProperty("slug")
 public void setSlug(String slug) {
  this.slug = slug;
 }

 public Checkpoint withSlug(String slug) {
  this.slug = slug;
  return this;
 }

 @JsonProperty("city")
 public String getCity() {
  return city;
 }

 @JsonProperty("city")
 public void setCity(String city) {
  this.city = city;
 }

 public Checkpoint withCity(String city) {
  this.city = city;
  return this;
 }

 @JsonProperty("created_at")
 public String getCreatedAt() {
  return createdAt;
 }

 @JsonProperty("created_at")
 public void setCreatedAt(String createdAt) {
  this.createdAt = createdAt;
 }

 public Checkpoint withCreatedAt(String createdAt) {
  this.createdAt = createdAt;
  return this;
 }

 @JsonProperty("location")
 public String getLocation() {
  return location;
 }

 @JsonProperty("location")
 public void setLocation(String location) {
  this.location = location;
 }

 public Checkpoint withLocation(String location) {
  this.location = location;
  return this;
 }

 @JsonProperty("country_name")
 public Object getCountryName() {
  return countryName;
 }

 @JsonProperty("country_name")
 public void setCountryName(Object countryName) {
  this.countryName = countryName;
 }

 public Checkpoint withCountryName(Object countryName) {
  this.countryName = countryName;
  return this;
 }

 @JsonProperty("message")
 public String getMessage() {
  return message;
 }

 @JsonProperty("message")
 public void setMessage(String message) {
  this.message = message;
 }

 public Checkpoint withMessage(String message) {
  this.message = message;
  return this;
 }

 @JsonProperty("country_iso3")
 public Object getCountryIso3() {
  return countryIso3;
 }

 @JsonProperty("country_iso3")
 public void setCountryIso3(Object countryIso3) {
  this.countryIso3 = countryIso3;
 }

 public Checkpoint withCountryIso3(Object countryIso3) {
  this.countryIso3 = countryIso3;
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

 public Checkpoint withTag(String tag) {
  this.tag = tag;
  return this;
 }

 @JsonProperty("subtag")
 public String getSubtag() {
  return subtag;
 }

 @JsonProperty("subtag")
 public void setSubtag(String subtag) {
  this.subtag = subtag;
 }

 public Checkpoint withSubtag(String subtag) {
  this.subtag = subtag;
  return this;
 }

 @JsonProperty("subtag_message")
 public String getSubtagMessage() {
  return subtagMessage;
 }

 @JsonProperty("subtag_message")
 public void setSubtagMessage(String subtagMessage) {
  this.subtagMessage = subtagMessage;
 }

 public Checkpoint withSubtagMessage(String subtagMessage) {
  this.subtagMessage = subtagMessage;
  return this;
 }

 @JsonProperty("checkpoint_time")
 public String getCheckpointTime() {
  return checkpointTime;
 }

 @JsonProperty("checkpoint_time")
 public void setCheckpointTime(String checkpointTime) {
  this.checkpointTime = checkpointTime;
 }

 public Checkpoint withCheckpointTime(String checkpointTime) {
  this.checkpointTime = checkpointTime;
  return this;
 }

 @JsonProperty("coordinates")
 public List<Object> getCoordinates() {
  return coordinates;
 }

 @JsonProperty("coordinates")
 public void setCoordinates(List<Object> coordinates) {
  this.coordinates = coordinates;
 }

 public Checkpoint withCoordinates(List<Object> coordinates) {
  this.coordinates = coordinates;
  return this;
 }

 @JsonProperty("state")
 public String getState() {
  return state;
 }

 @JsonProperty("state")
 public void setState(String state) {
  this.state = state;
 }

 public Checkpoint withState(String state) {
  this.state = state;
  return this;
 }

 @JsonProperty("zip")
 public Object getZip() {
  return zip;
 }

 @JsonProperty("zip")
 public void setZip(Object zip) {
  this.zip = zip;
 }

 public Checkpoint withZip(Object zip) {
  this.zip = zip;
  return this;
 }

 @JsonProperty("raw_tag")
 public String getRawTag() {
  return rawTag;
 }

 @JsonProperty("raw_tag")
 public void setRawTag(String rawTag) {
  this.rawTag = rawTag;
 }

 public Checkpoint withRawTag(String rawTag) {
  this.rawTag = rawTag;
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

 public Checkpoint withAdditionalProperty(String name, Object value) {
  this.additionalProperties.put(name, value);
  return this;
 }

}