package com.example.aftership.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import org.springframework.lang.NonNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tracking {

  @JsonProperty("slug")
  private String slug;
  @JsonProperty("tracking_number")
  private String trackingNumber = UUID.randomUUID().toString();;
  @JsonProperty("title")
  private String title;
  @JsonProperty("smses")
  private List<String> smses = null;
  @JsonProperty("emails")
  private List<String> emails = null;
  @JsonProperty("order_id")
  private String orderId;
  @JsonProperty("order_id_path")
  private String orderIdPath;
  @JsonProperty("custom_fields")
  private CustomFields customFields;
  @JsonProperty("language")
  private String language;
  @JsonProperty("order_promised_delivery_date")
  private String orderPromisedDeliveryDate;
  @JsonProperty("delivery_type")
  private String deliveryType;
  @JsonProperty("pickup_location")
  private String pickupLocation;
  @JsonProperty("pickup_note")
  private String pickupNote;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   *
   */
  public Tracking() {
  }

  public Tracking(String slug, String trackingNumber, String title, List<String> smses, List<String> emails, String orderId, String orderIdPath, CustomFields customFields, String language, String orderPromisedDeliveryDate, String deliveryType, String pickupLocation, String pickupNote) {
    super();
    this.slug = slug;
    this.trackingNumber = trackingNumber;
    this.title = title;
    this.smses = smses;
    this.emails = emails;
    this.orderId = orderId;
    this.orderIdPath = orderIdPath;
    this.customFields = customFields;
    this.language = language;
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    this.deliveryType = deliveryType;
    this.pickupLocation = pickupLocation;
    this.pickupNote = pickupNote;
  }

  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  @JsonProperty("slug")
  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Tracking withSlug(String slug) {
    this.slug = slug;
    return this;
  }

  @JsonProperty("tracking_number")
  @NonNull
  public String getTrackingNumber() {
    return trackingNumber;
  }

  @JsonProperty("tracking_number")
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Tracking withTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  public Tracking withTitle(String title) {
    this.title = title;
    return this;
  }

  @JsonProperty("smses")
  public List<String> getSmses() {
    return smses;
  }

  @JsonProperty("smses")
  public void setSmses(List<String> smses) {
    this.smses = smses;
  }

  public Tracking withSmses(List<String> smses) {
    this.smses = smses;
    return this;
  }

  @JsonProperty("emails")
  public List<String> getEmails() {
    return emails;
  }

  @JsonProperty("emails")
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public Tracking withEmails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }

  @JsonProperty("order_id")
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Tracking withOrderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  @JsonProperty("order_id_path")
  public String getOrderIdPath() {
    return orderIdPath;
  }

  @JsonProperty("order_id_path")
  public void setOrderIdPath(String orderIdPath) {
    this.orderIdPath = orderIdPath;
  }

  public Tracking withOrderIdPath(String orderIdPath) {
    this.orderIdPath = orderIdPath;
    return this;
  }

  @JsonProperty("custom_fields")
  public CustomFields getCustomFields() {
    return customFields;
  }

  @JsonProperty("custom_fields")
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  public Tracking withCustomFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(String language) {
    this.language = language;
  }

  public Tracking withLanguage(String language) {
    this.language = language;
    return this;
  }

  @JsonProperty("order_promised_delivery_date")
  public String getOrderPromisedDeliveryDate() {
    return orderPromisedDeliveryDate;
  }

  @JsonProperty("order_promised_delivery_date")
  public void setOrderPromisedDeliveryDate(String orderPromisedDeliveryDate) {
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
  }

  public Tracking withOrderPromisedDeliveryDate(String orderPromisedDeliveryDate) {
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    return this;
  }

  @JsonProperty("delivery_type")
  public String getDeliveryType() {
    return deliveryType;
  }

  @JsonProperty("delivery_type")
  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public Tracking withDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  @JsonProperty("pickup_location")
  public String getPickupLocation() {
    return pickupLocation;
  }

  @JsonProperty("pickup_location")
  public void setPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Tracking withPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

  @JsonProperty("pickup_note")
  public String getPickupNote() {
    return pickupNote;
  }

  @JsonProperty("pickup_note")
  public void setPickupNote(String pickupNote) {
    this.pickupNote = pickupNote;
  }

  public Tracking withPickupNote(String pickupNote) {
    this.pickupNote = pickupNote;
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

  public Tracking withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}
