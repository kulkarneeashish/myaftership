
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
    "id",
    "created_at",
    "updated_at",
    "last_updated_at",
    "tracking_number",
    "slug",
    "active",
    "android",
    "custom_fields",
    "customer_name",
    "delivery_time",
    "destination_country_iso3",
    "courier_destination_country_iso3",
    "emails",
    "expected_delivery",
    "ios",
    "note",
    "order_id",
    "order_id_path",
    "order_date",
    "origin_country_iso3",
    "shipment_package_count",
    "shipment_pickup_date",
    "shipment_delivery_date",
    "shipment_type",
    "shipment_weight",
    "shipment_weight_unit",
    "signed_by",
    "smses",
    "source",
    "tag",
    "subtag",
    "subtag_message",
    "title",
    "tracked_count",
    "last_mile_tracking_supported",
    "language",
    "unique_token",
    "checkpoints",
    "subscribed_smses",
    "subscribed_emails",
    "return_to_sender",
    "tracking_account_number",
    "tracking_origin_country",
    "tracking_destination_country",
    "tracking_key",
    "tracking_postal_code",
    "tracking_ship_date",
    "tracking_state",
    "order_promised_delivery_date",
    "delivery_type",
    "pickup_location",
    "pickup_note",
    "courier_tracking_link",
    "courier_redirect_link",
    "first_attempted_at"
})
public class Tracking {

  @JsonProperty("id")
  private String id;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("updated_at")
  private String updatedAt;
  @JsonProperty("last_updated_at")
  private String lastUpdatedAt;
  @JsonProperty("tracking_number")
  private String trackingNumber;
  @JsonProperty("slug")
  private String slug;
  @JsonProperty("active")
  private boolean active;
  @JsonProperty("android")
  private List<Object> android = new ArrayList<Object>();
  @JsonProperty("custom_fields")
  private Object customFields;
  @JsonProperty("customer_name")
  private Object customerName;
  @JsonProperty("delivery_time")
  private int deliveryTime;
  @JsonProperty("destination_country_iso3")
  private Object destinationCountryIso3;
  @JsonProperty("courier_destination_country_iso3")
  private Object courierDestinationCountryIso3;
  @JsonProperty("emails")
  private List<String> emails = new ArrayList<String>();
  @JsonProperty("expected_delivery")
  private Object expectedDelivery;
  @JsonProperty("ios")
  private List<Object> ios = new ArrayList<Object>();
  @JsonProperty("note")
  private Object note;
  @JsonProperty("order_id")
  private Object orderId;
  @JsonProperty("order_id_path")
  private Object orderIdPath;
  @JsonProperty("order_date")
  private Object orderDate;
  @JsonProperty("origin_country_iso3")
  private String originCountryIso3;
  @JsonProperty("shipment_package_count")
  private int shipmentPackageCount;
  @JsonProperty("shipment_pickup_date")
  private Object shipmentPickupDate;
  @JsonProperty("shipment_delivery_date")
  private Object shipmentDeliveryDate;
  @JsonProperty("shipment_type")
  private Object shipmentType;
  @JsonProperty("shipment_weight")
  private Object shipmentWeight;
  @JsonProperty("shipment_weight_unit")
  private Object shipmentWeightUnit;
  @JsonProperty("signed_by")
  private Object signedBy;
  @JsonProperty("smses")
  private List<String> smses = new ArrayList<String>();
  @JsonProperty("source")
  private String source;
  @JsonProperty("tag")
  private String tag;
  @JsonProperty("subtag")
  private String subtag;
  @JsonProperty("subtag_message")
  private String subtagMessage;
  @JsonProperty("title")
  private String title;
  @JsonProperty("tracked_count")
  private int trackedCount;
  @JsonProperty("last_mile_tracking_supported")
  private Object lastMileTrackingSupported;
  @JsonProperty("language")
  private Object language;
  @JsonProperty("unique_token")
  private String uniqueToken;
  @JsonProperty("checkpoints")
  private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();
  @JsonProperty("subscribed_smses")
  private List<String> subscribedSmses = new ArrayList<String>();
  @JsonProperty("subscribed_emails")
  private List<String> subscribedEmails = new ArrayList<String>();
  @JsonProperty("return_to_sender")
  private boolean returnToSender;
  @JsonProperty("tracking_account_number")
  private Object trackingAccountNumber;
  @JsonProperty("tracking_origin_country")
  private Object trackingOriginCountry;
  @JsonProperty("tracking_destination_country")
  private Object trackingDestinationCountry;
  @JsonProperty("tracking_key")
  private Object trackingKey;
  @JsonProperty("tracking_postal_code")
  private Object trackingPostalCode;
  @JsonProperty("tracking_ship_date")
  private Object trackingShipDate;
  @JsonProperty("tracking_state")
  private Object trackingState;
  @JsonProperty("order_promised_delivery_date")
  private Object orderPromisedDeliveryDate;
  @JsonProperty("delivery_type")
  private Object deliveryType;
  @JsonProperty("pickup_location")
  private Object pickupLocation;
  @JsonProperty("pickup_note")
  private Object pickupNote;
  @JsonProperty("courier_tracking_link")
  private String courierTrackingLink;
  @JsonProperty("courier_redirect_link")
  private String courierRedirectLink;
  @JsonProperty("first_attempted_at")
  private Object firstAttemptedAt;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   *
   */
  public Tracking() {
  }

  /**
   *
   * @param subscribedSmses
   * @param courierDestinationCountryIso3
   * @param lastUpdatedAt
   * @param orderId
   * @param signedBy
   * @param subtag
   * @param language
   * @param firstAttemptedAt
   * @param source
   * @param ios
   * @param courierTrackingLink
   * @param createdAt
   * @param destinationCountryIso3
   * @param trackedCount
   * @param id
   * @param tag
   * @param trackingNumber
   * @param slug
   * @param orderPromisedDeliveryDate
   * @param updatedAt
   * @param trackingOriginCountry
   * @param active
   * @param customerName
   * @param shipmentDeliveryDate
   * @param originCountryIso3
   * @param trackingPostalCode
   * @param orderDate
   * @param shipmentPickupDate
   * @param shipmentWeightUnit
   * @param smses
   * @param note
   * @param deliveryTime
   * @param customFields
   * @param android
   * @param subtagMessage
   * @param trackingShipDate
   * @param courierRedirectLink
   * @param title
   * @param subscribedEmails
   * @param shipmentType
   * @param emails
   * @param returnToSender
   * @param expectedDelivery
   * @param trackingAccountNumber
   * @param lastMileTrackingSupported
   * @param trackingKey
   * @param uniqueToken
   * @param orderIdPath
   * @param shipmentWeight
   * @param deliveryType
   * @param checkpoints
   * @param shipmentPackageCount
   * @param pickupLocation
   * @param trackingState
   * @param pickupNote
   * @param trackingDestinationCountry
   */
  public Tracking(String id, String createdAt, String updatedAt, String lastUpdatedAt, String trackingNumber, String slug, boolean active, List<Object> android, Object customFields, Object customerName, int deliveryTime, Object destinationCountryIso3, Object courierDestinationCountryIso3, List<String> emails, Object expectedDelivery, List<Object> ios, Object note, Object orderId, Object orderIdPath, Object orderDate, String originCountryIso3, int shipmentPackageCount, Object shipmentPickupDate, Object shipmentDeliveryDate, Object shipmentType, Object shipmentWeight, Object shipmentWeightUnit, Object signedBy, List<String> smses, String source, String tag, String subtag, String subtagMessage, String title, int trackedCount, Object lastMileTrackingSupported, Object language, String uniqueToken, List<Checkpoint> checkpoints, List<String> subscribedSmses, List<String> subscribedEmails, boolean returnToSender, Object trackingAccountNumber, Object trackingOriginCountry, Object trackingDestinationCountry, Object trackingKey, Object trackingPostalCode, Object trackingShipDate, Object trackingState, Object orderPromisedDeliveryDate, Object deliveryType, Object pickupLocation, Object pickupNote, String courierTrackingLink, String courierRedirectLink, Object firstAttemptedAt) {
    super();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.lastUpdatedAt = lastUpdatedAt;
    this.trackingNumber = trackingNumber;
    this.slug = slug;
    this.active = active;
    this.android = android;
    this.customFields = customFields;
    this.customerName = customerName;
    this.deliveryTime = deliveryTime;
    this.destinationCountryIso3 = destinationCountryIso3;
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
    this.emails = emails;
    this.expectedDelivery = expectedDelivery;
    this.ios = ios;
    this.note = note;
    this.orderId = orderId;
    this.orderIdPath = orderIdPath;
    this.orderDate = orderDate;
    this.originCountryIso3 = originCountryIso3;
    this.shipmentPackageCount = shipmentPackageCount;
    this.shipmentPickupDate = shipmentPickupDate;
    this.shipmentDeliveryDate = shipmentDeliveryDate;
    this.shipmentType = shipmentType;
    this.shipmentWeight = shipmentWeight;
    this.shipmentWeightUnit = shipmentWeightUnit;
    this.signedBy = signedBy;
    this.smses = smses;
    this.source = source;
    this.tag = tag;
    this.subtag = subtag;
    this.subtagMessage = subtagMessage;
    this.title = title;
    this.trackedCount = trackedCount;
    this.lastMileTrackingSupported = lastMileTrackingSupported;
    this.language = language;
    this.uniqueToken = uniqueToken;
    this.checkpoints = checkpoints;
    this.subscribedSmses = subscribedSmses;
    this.subscribedEmails = subscribedEmails;
    this.returnToSender = returnToSender;
    this.trackingAccountNumber = trackingAccountNumber;
    this.trackingOriginCountry = trackingOriginCountry;
    this.trackingDestinationCountry = trackingDestinationCountry;
    this.trackingKey = trackingKey;
    this.trackingPostalCode = trackingPostalCode;
    this.trackingShipDate = trackingShipDate;
    this.trackingState = trackingState;
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    this.deliveryType = deliveryType;
    this.pickupLocation = pickupLocation;
    this.pickupNote = pickupNote;
    this.courierTrackingLink = courierTrackingLink;
    this.courierRedirectLink = courierRedirectLink;
    this.firstAttemptedAt = firstAttemptedAt;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public Tracking withId(String id) {
    this.id = id;
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

  public Tracking withCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Tracking withUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  @JsonProperty("last_updated_at")
  public String getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  @JsonProperty("last_updated_at")
  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public Tracking withLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  @JsonProperty("tracking_number")
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

  @JsonProperty("active")
  public boolean isActive() {
    return active;
  }

  @JsonProperty("active")
  public void setActive(boolean active) {
    this.active = active;
  }

  public Tracking withActive(boolean active) {
    this.active = active;
    return this;
  }

  @JsonProperty("android")
  public List<Object> getAndroid() {
    return android;
  }

  @JsonProperty("android")
  public void setAndroid(List<Object> android) {
    this.android = android;
  }

  public Tracking withAndroid(List<Object> android) {
    this.android = android;
    return this;
  }

  @JsonProperty("custom_fields")
  public Object getCustomFields() {
    return customFields;
  }

  @JsonProperty("custom_fields")
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }

  public Tracking withCustomFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

  @JsonProperty("customer_name")
  public Object getCustomerName() {
    return customerName;
  }

  @JsonProperty("customer_name")
  public void setCustomerName(Object customerName) {
    this.customerName = customerName;
  }

  public Tracking withCustomerName(Object customerName) {
    this.customerName = customerName;
    return this;
  }

  @JsonProperty("delivery_time")
  public int getDeliveryTime() {
    return deliveryTime;
  }

  @JsonProperty("delivery_time")
  public void setDeliveryTime(int deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Tracking withDeliveryTime(int deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  @JsonProperty("destination_country_iso3")
  public Object getDestinationCountryIso3() {
    return destinationCountryIso3;
  }

  @JsonProperty("destination_country_iso3")
  public void setDestinationCountryIso3(Object destinationCountryIso3) {
    this.destinationCountryIso3 = destinationCountryIso3;
  }

  public Tracking withDestinationCountryIso3(Object destinationCountryIso3) {
    this.destinationCountryIso3 = destinationCountryIso3;
    return this;
  }

  @JsonProperty("courier_destination_country_iso3")
  public Object getCourierDestinationCountryIso3() {
    return courierDestinationCountryIso3;
  }

  @JsonProperty("courier_destination_country_iso3")
  public void setCourierDestinationCountryIso3(Object courierDestinationCountryIso3) {
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
  }

  public Tracking withCourierDestinationCountryIso3(Object courierDestinationCountryIso3) {
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
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

  @JsonProperty("expected_delivery")
  public Object getExpectedDelivery() {
    return expectedDelivery;
  }

  @JsonProperty("expected_delivery")
  public void setExpectedDelivery(Object expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public Tracking withExpectedDelivery(Object expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

  @JsonProperty("ios")
  public List<Object> getIos() {
    return ios;
  }

  @JsonProperty("ios")
  public void setIos(List<Object> ios) {
    this.ios = ios;
  }

  public Tracking withIos(List<Object> ios) {
    this.ios = ios;
    return this;
  }

  @JsonProperty("note")
  public Object getNote() {
    return note;
  }

  @JsonProperty("note")
  public void setNote(Object note) {
    this.note = note;
  }

  public Tracking withNote(Object note) {
    this.note = note;
    return this;
  }

  @JsonProperty("order_id")
  public Object getOrderId() {
    return orderId;
  }

  @JsonProperty("order_id")
  public void setOrderId(Object orderId) {
    this.orderId = orderId;
  }

  public Tracking withOrderId(Object orderId) {
    this.orderId = orderId;
    return this;
  }

  @JsonProperty("order_id_path")
  public Object getOrderIdPath() {
    return orderIdPath;
  }

  @JsonProperty("order_id_path")
  public void setOrderIdPath(Object orderIdPath) {
    this.orderIdPath = orderIdPath;
  }

  public Tracking withOrderIdPath(Object orderIdPath) {
    this.orderIdPath = orderIdPath;
    return this;
  }

  @JsonProperty("order_date")
  public Object getOrderDate() {
    return orderDate;
  }

  @JsonProperty("order_date")
  public void setOrderDate(Object orderDate) {
    this.orderDate = orderDate;
  }

  public Tracking withOrderDate(Object orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  @JsonProperty("origin_country_iso3")
  public String getOriginCountryIso3() {
    return originCountryIso3;
  }

  @JsonProperty("origin_country_iso3")
  public void setOriginCountryIso3(String originCountryIso3) {
    this.originCountryIso3 = originCountryIso3;
  }

  public Tracking withOriginCountryIso3(String originCountryIso3) {
    this.originCountryIso3 = originCountryIso3;
    return this;
  }

  @JsonProperty("shipment_package_count")
  public int getShipmentPackageCount() {
    return shipmentPackageCount;
  }

  @JsonProperty("shipment_package_count")
  public void setShipmentPackageCount(int shipmentPackageCount) {
    this.shipmentPackageCount = shipmentPackageCount;
  }

  public Tracking withShipmentPackageCount(int shipmentPackageCount) {
    this.shipmentPackageCount = shipmentPackageCount;
    return this;
  }

  @JsonProperty("shipment_pickup_date")
  public Object getShipmentPickupDate() {
    return shipmentPickupDate;
  }

  @JsonProperty("shipment_pickup_date")
  public void setShipmentPickupDate(Object shipmentPickupDate) {
    this.shipmentPickupDate = shipmentPickupDate;
  }

  public Tracking withShipmentPickupDate(Object shipmentPickupDate) {
    this.shipmentPickupDate = shipmentPickupDate;
    return this;
  }

  @JsonProperty("shipment_delivery_date")
  public Object getShipmentDeliveryDate() {
    return shipmentDeliveryDate;
  }

  @JsonProperty("shipment_delivery_date")
  public void setShipmentDeliveryDate(Object shipmentDeliveryDate) {
    this.shipmentDeliveryDate = shipmentDeliveryDate;
  }

  public Tracking withShipmentDeliveryDate(Object shipmentDeliveryDate) {
    this.shipmentDeliveryDate = shipmentDeliveryDate;
    return this;
  }

  @JsonProperty("shipment_type")
  public Object getShipmentType() {
    return shipmentType;
  }

  @JsonProperty("shipment_type")
  public void setShipmentType(Object shipmentType) {
    this.shipmentType = shipmentType;
  }

  public Tracking withShipmentType(Object shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

  @JsonProperty("shipment_weight")
  public Object getShipmentWeight() {
    return shipmentWeight;
  }

  @JsonProperty("shipment_weight")
  public void setShipmentWeight(Object shipmentWeight) {
    this.shipmentWeight = shipmentWeight;
  }

  public Tracking withShipmentWeight(Object shipmentWeight) {
    this.shipmentWeight = shipmentWeight;
    return this;
  }

  @JsonProperty("shipment_weight_unit")
  public Object getShipmentWeightUnit() {
    return shipmentWeightUnit;
  }

  @JsonProperty("shipment_weight_unit")
  public void setShipmentWeightUnit(Object shipmentWeightUnit) {
    this.shipmentWeightUnit = shipmentWeightUnit;
  }

  public Tracking withShipmentWeightUnit(Object shipmentWeightUnit) {
    this.shipmentWeightUnit = shipmentWeightUnit;
    return this;
  }

  @JsonProperty("signed_by")
  public Object getSignedBy() {
    return signedBy;
  }

  @JsonProperty("signed_by")
  public void setSignedBy(Object signedBy) {
    this.signedBy = signedBy;
  }

  public Tracking withSignedBy(Object signedBy) {
    this.signedBy = signedBy;
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

  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(String source) {
    this.source = source;
  }

  public Tracking withSource(String source) {
    this.source = source;
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

  public Tracking withTag(String tag) {
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

  public Tracking withSubtag(String subtag) {
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

  public Tracking withSubtagMessage(String subtagMessage) {
    this.subtagMessage = subtagMessage;
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

  @JsonProperty("tracked_count")
  public int getTrackedCount() {
    return trackedCount;
  }

  @JsonProperty("tracked_count")
  public void setTrackedCount(int trackedCount) {
    this.trackedCount = trackedCount;
  }

  public Tracking withTrackedCount(int trackedCount) {
    this.trackedCount = trackedCount;
    return this;
  }

  @JsonProperty("last_mile_tracking_supported")
  public Object getLastMileTrackingSupported() {
    return lastMileTrackingSupported;
  }

  @JsonProperty("last_mile_tracking_supported")
  public void setLastMileTrackingSupported(Object lastMileTrackingSupported) {
    this.lastMileTrackingSupported = lastMileTrackingSupported;
  }

  public Tracking withLastMileTrackingSupported(Object lastMileTrackingSupported) {
    this.lastMileTrackingSupported = lastMileTrackingSupported;
    return this;
  }

  @JsonProperty("language")
  public Object getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(Object language) {
    this.language = language;
  }

  public Tracking withLanguage(Object language) {
    this.language = language;
    return this;
  }

  @JsonProperty("unique_token")
  public String getUniqueToken() {
    return uniqueToken;
  }

  @JsonProperty("unique_token")
  public void setUniqueToken(String uniqueToken) {
    this.uniqueToken = uniqueToken;
  }

  public Tracking withUniqueToken(String uniqueToken) {
    this.uniqueToken = uniqueToken;
    return this;
  }

  @JsonProperty("checkpoints")
  public List<Checkpoint> getCheckpoints() {
    return checkpoints;
  }

  @JsonProperty("checkpoints")
  public void setCheckpoints(List<Checkpoint> checkpoints) {
    this.checkpoints = checkpoints;
  }

  public Tracking withCheckpoints(List<Checkpoint> checkpoints) {
    this.checkpoints = checkpoints;
    return this;
  }

  @JsonProperty("subscribed_smses")
  public List<String> getSubscribedSmses() {
    return subscribedSmses;
  }

  @JsonProperty("subscribed_smses")
  public void setSubscribedSmses(List<String> subscribedSmses) {
    this.subscribedSmses = subscribedSmses;
  }

  public Tracking withSubscribedSmses(List<String> subscribedSmses) {
    this.subscribedSmses = subscribedSmses;
    return this;
  }

  @JsonProperty("subscribed_emails")
  public List<String> getSubscribedEmails() {
    return subscribedEmails;
  }

  @JsonProperty("subscribed_emails")
  public void setSubscribedEmails(List<String> subscribedEmails) {
    this.subscribedEmails = subscribedEmails;
  }

  public Tracking withSubscribedEmails(List<String> subscribedEmails) {
    this.subscribedEmails = subscribedEmails;
    return this;
  }

  @JsonProperty("return_to_sender")
  public boolean isReturnToSender() {
    return returnToSender;
  }

  @JsonProperty("return_to_sender")
  public void setReturnToSender(boolean returnToSender) {
    this.returnToSender = returnToSender;
  }

  public Tracking withReturnToSender(boolean returnToSender) {
    this.returnToSender = returnToSender;
    return this;
  }

  @JsonProperty("tracking_account_number")
  public Object getTrackingAccountNumber() {
    return trackingAccountNumber;
  }

  @JsonProperty("tracking_account_number")
  public void setTrackingAccountNumber(Object trackingAccountNumber) {
    this.trackingAccountNumber = trackingAccountNumber;
  }

  public Tracking withTrackingAccountNumber(Object trackingAccountNumber) {
    this.trackingAccountNumber = trackingAccountNumber;
    return this;
  }

  @JsonProperty("tracking_origin_country")
  public Object getTrackingOriginCountry() {
    return trackingOriginCountry;
  }

  @JsonProperty("tracking_origin_country")
  public void setTrackingOriginCountry(Object trackingOriginCountry) {
    this.trackingOriginCountry = trackingOriginCountry;
  }

  public Tracking withTrackingOriginCountry(Object trackingOriginCountry) {
    this.trackingOriginCountry = trackingOriginCountry;
    return this;
  }

  @JsonProperty("tracking_destination_country")
  public Object getTrackingDestinationCountry() {
    return trackingDestinationCountry;
  }

  @JsonProperty("tracking_destination_country")
  public void setTrackingDestinationCountry(Object trackingDestinationCountry) {
    this.trackingDestinationCountry = trackingDestinationCountry;
  }

  public Tracking withTrackingDestinationCountry(Object trackingDestinationCountry) {
    this.trackingDestinationCountry = trackingDestinationCountry;
    return this;
  }

  @JsonProperty("tracking_key")
  public Object getTrackingKey() {
    return trackingKey;
  }

  @JsonProperty("tracking_key")
  public void setTrackingKey(Object trackingKey) {
    this.trackingKey = trackingKey;
  }

  public Tracking withTrackingKey(Object trackingKey) {
    this.trackingKey = trackingKey;
    return this;
  }

  @JsonProperty("tracking_postal_code")
  public Object getTrackingPostalCode() {
    return trackingPostalCode;
  }

  @JsonProperty("tracking_postal_code")
  public void setTrackingPostalCode(Object trackingPostalCode) {
    this.trackingPostalCode = trackingPostalCode;
  }

  public Tracking withTrackingPostalCode(Object trackingPostalCode) {
    this.trackingPostalCode = trackingPostalCode;
    return this;
  }

  @JsonProperty("tracking_ship_date")
  public Object getTrackingShipDate() {
    return trackingShipDate;
  }

  @JsonProperty("tracking_ship_date")
  public void setTrackingShipDate(Object trackingShipDate) {
    this.trackingShipDate = trackingShipDate;
  }

  public Tracking withTrackingShipDate(Object trackingShipDate) {
    this.trackingShipDate = trackingShipDate;
    return this;
  }

  @JsonProperty("tracking_state")
  public Object getTrackingState() {
    return trackingState;
  }

  @JsonProperty("tracking_state")
  public void setTrackingState(Object trackingState) {
    this.trackingState = trackingState;
  }

  public Tracking withTrackingState(Object trackingState) {
    this.trackingState = trackingState;
    return this;
  }

  @JsonProperty("order_promised_delivery_date")
  public Object getOrderPromisedDeliveryDate() {
    return orderPromisedDeliveryDate;
  }

  @JsonProperty("order_promised_delivery_date")
  public void setOrderPromisedDeliveryDate(Object orderPromisedDeliveryDate) {
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
  }

  public Tracking withOrderPromisedDeliveryDate(Object orderPromisedDeliveryDate) {
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    return this;
  }

  @JsonProperty("delivery_type")
  public Object getDeliveryType() {
    return deliveryType;
  }

  @JsonProperty("delivery_type")
  public void setDeliveryType(Object deliveryType) {
    this.deliveryType = deliveryType;
  }

  public Tracking withDeliveryType(Object deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  @JsonProperty("pickup_location")
  public Object getPickupLocation() {
    return pickupLocation;
  }

  @JsonProperty("pickup_location")
  public void setPickupLocation(Object pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Tracking withPickupLocation(Object pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

  @JsonProperty("pickup_note")
  public Object getPickupNote() {
    return pickupNote;
  }

  @JsonProperty("pickup_note")
  public void setPickupNote(Object pickupNote) {
    this.pickupNote = pickupNote;
  }

  public Tracking withPickupNote(Object pickupNote) {
    this.pickupNote = pickupNote;
    return this;
  }

  @JsonProperty("courier_tracking_link")
  public String getCourierTrackingLink() {
    return courierTrackingLink;
  }

  @JsonProperty("courier_tracking_link")
  public void setCourierTrackingLink(String courierTrackingLink) {
    this.courierTrackingLink = courierTrackingLink;
  }

  public Tracking withCourierTrackingLink(String courierTrackingLink) {
    this.courierTrackingLink = courierTrackingLink;
    return this;
  }

  @JsonProperty("courier_redirect_link")
  public String getCourierRedirectLink() {
    return courierRedirectLink;
  }

  @JsonProperty("courier_redirect_link")
  public void setCourierRedirectLink(String courierRedirectLink) {
    this.courierRedirectLink = courierRedirectLink;
  }

  public Tracking withCourierRedirectLink(String courierRedirectLink) {
    this.courierRedirectLink = courierRedirectLink;
    return this;
  }

  @JsonProperty("first_attempted_at")
  public Object getFirstAttemptedAt() {
    return firstAttemptedAt;
  }

  @JsonProperty("first_attempted_at")
  public void setFirstAttemptedAt(Object firstAttemptedAt) {
    this.firstAttemptedAt = firstAttemptedAt;
  }

  public Tracking withFirstAttemptedAt(Object firstAttemptedAt) {
    this.firstAttemptedAt = firstAttemptedAt;
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