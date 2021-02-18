package com.example.aftership.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AfterShipTracking {

  @JsonProperty
  public String id;
  @JsonProperty
  public Date createdAt;
  @JsonProperty
  public Date updatedAt;
  @JsonProperty
  public Date lastUpdatedAt;
  @JsonProperty
  public String trackingNumber;
  @JsonProperty
  public String slug;
  @JsonProperty
  public boolean active;
  @JsonProperty
  public List<Object> android;
  @JsonProperty
  public Object customFields;
  @JsonProperty
  public Object customerName;
  @JsonProperty
  public int deliveryTime;
  @JsonProperty
  public Object destinationCountryIso3;
  @JsonProperty
  public Object courierDestinationCountryIso3;
  @JsonProperty
  public List<String> emails;
  @JsonProperty
  public Object expectedDelivery;
  @JsonProperty
  public List<Object> ios;
  @JsonProperty
  public Object note;
  @JsonProperty
  public Object orderId;
  @JsonProperty
  public Object orderIdPath;
  @JsonProperty
  public Object orderDate;
  @JsonProperty
  public String originCountryIso3;
  @JsonProperty
  public int shipmentPackageCount;
  @JsonProperty
  public Date shipmentPickupDate;
  @JsonProperty
  public Date shipmentDeliveryDate;
  @JsonProperty
  public String shipmentType;
  @JsonProperty
  public Object shipmentWeight;
  @JsonProperty
  public String shipmentWeightUnit;
  @JsonProperty
  public String signedBy;
  @JsonProperty
  public List<String> smses;
  @JsonProperty
  public String source;
  @JsonProperty
  public String tag;
  @JsonProperty
  public String subtag;
  @JsonProperty
  public String subtagMessage;
  @JsonProperty
  public String title;
  @JsonProperty
  public int trackedCount;
  @JsonProperty
  public Object lastMileTrackingSupported;
  @JsonProperty
  public Object language;
  @JsonProperty
  public String uniqueToken;
  @JsonProperty
  public List<Checkpoint> checkpoints;
  @JsonProperty
  public List<String> subscribedSmses;
  @JsonProperty
  public List<String> subscribedEmails;
  @JsonProperty
  public boolean returnToSender;
  @JsonProperty
  public Object trackingAccountNumber;
  @JsonProperty
  public Object trackingOriginCountry;
  @JsonProperty
  public Object trackingDestinationCountry;
  @JsonProperty
  public Object trackingKey;
  @JsonProperty
  public Object trackingPostalCode;
  @JsonProperty
  public Object trackingShipDate;
  @JsonProperty
  public Object trackingState;
  @JsonProperty
  public Object orderPromisedDeliveryDate;
  @JsonProperty
  public Object deliveryType;
  @JsonProperty
  public Object pickupLocation;
  @JsonProperty
  public Object pickupNote;
  @JsonProperty
  public String courierTrackingLink;
  @JsonProperty
  public String courierRedirectLink;
  @JsonProperty
  public Date firstAttemptedAt;

  @JsonCreator
  public AfterShipTracking(@JsonProperty("id") String id, @JsonProperty("createdAt") Date createdAt,
      @JsonProperty("updatedAt") Date updatedAt, @JsonProperty("lastUpdatedAt") Date lastUpdatedAt,
      @JsonProperty("trackingNumber") String trackingNumber, @JsonProperty("slug") String slug,
      @JsonProperty("active") boolean active,
      @JsonProperty("android") List<Object> android,
      @JsonProperty("customFields") Object customFields,
      @JsonProperty("customerName") Object customerName,
      @JsonProperty("deliveryTime") int deliveryTime,
      @JsonProperty("destinationCountryIso3") Object destinationCountryIso3,
      @JsonProperty("courierDestinationCountryIso3") Object courierDestinationCountryIso3,
      @JsonProperty("emails") List<String> emails,
      @JsonProperty("expectedDelivery") Object expectedDelivery,
      @JsonProperty("ios") List<Object> ios, @JsonProperty("note") Object note,
      @JsonProperty("orderId") Object orderId, @JsonProperty("orderIdPath") Object orderIdPath,
      @JsonProperty("orderDate") Object orderDate,
      @JsonProperty("originCountryIso3") String originCountryIso3,
      @JsonProperty("shipmentPackageCount") int shipmentPackageCount,
      @JsonProperty("shipmentPickupDate") Date shipmentPickupDate,
      @JsonProperty("shipmentDeliveryDate") Date shipmentDeliveryDate,
      @JsonProperty("shipmentType") String shipmentType,
      @JsonProperty("shipmentWeight") Object shipmentWeight,
      @JsonProperty("shipmentWeightUnit") String shipmentWeightUnit,
      @JsonProperty("signedBy") String signedBy, @JsonProperty("smses") List<String> smses,
      @JsonProperty("source") String source, @JsonProperty("tag") String tag,
      @JsonProperty("subtag") String subtag,
      @JsonProperty("subtagMessage") String subtagMessage, @JsonProperty("title") String title,
      @JsonProperty("trackedCount") int trackedCount,
      @JsonProperty("lastMileTrackingSupported") Object lastMileTrackingSupported,
      @JsonProperty("language") Object language, @JsonProperty("uniqueToken") String uniqueToken,
      @JsonProperty("checkpoints") List<Checkpoint> checkpoints,
      @JsonProperty("subscribedSmses") List<String> subscribedSmses,
      @JsonProperty("subscribedEmails") List<String> subscribedEmails,
      @JsonProperty("returnToSender") boolean returnToSender,
      @JsonProperty("trackingAccountNumber") Object trackingAccountNumber,
      @JsonProperty("trackingOriginCountry") Object trackingOriginCountry,
      @JsonProperty("trackingDestinationCountry") Object trackingDestinationCountry,
      @JsonProperty("trackingKey") Object trackingKey,
      @JsonProperty("trackingPostalCode") Object trackingPostalCode,
      @JsonProperty("trackingShipDate") Object trackingShipDate,
      @JsonProperty("trackingState") Object trackingState,
      @JsonProperty("orderPromisedDeliveryDate") Object orderPromisedDeliveryDate,
      @JsonProperty("deliveryType") Object deliveryType,
      @JsonProperty("pickupLocation") Object pickupLocation,
      @JsonProperty("pickupNote") Object pickupNote,
      @JsonProperty("courierTrackingLink") String courierTrackingLink,
      @JsonProperty("courierRedirectLink") String courierRedirectLink,

      @JsonProperty("firstAttemptedAt") Date firstAttemptedAt) {
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public List<Object> getAndroid() {
    return android;
  }

  public void setAndroid(List<Object> android) {
    this.android = android;
  }

  public Object getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }

  public Object getCustomerName() {
    return customerName;
  }

  public void setCustomerName(Object customerName) {
    this.customerName = customerName;
  }

  public int getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(int deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Object getDestinationCountryIso3() {
    return destinationCountryIso3;
  }

  public void setDestinationCountryIso3(Object destinationCountryIso3) {
    this.destinationCountryIso3 = destinationCountryIso3;
  }

  public Object getCourierDestinationCountryIso3() {
    return courierDestinationCountryIso3;
  }

  public void setCourierDestinationCountryIso3(Object courierDestinationCountryIso3) {
    this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
  }

  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public Object getExpectedDelivery() {
    return expectedDelivery;
  }

  public void setExpectedDelivery(Object expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public List<Object> getIos() {
    return ios;
  }

  public void setIos(List<Object> ios) {
    this.ios = ios;
  }

  public Object getNote() {
    return note;
  }

  public void setNote(Object note) {
    this.note = note;
  }

  public Object getOrderId() {
    return orderId;
  }

  public void setOrderId(Object orderId) {
    this.orderId = orderId;
  }

  public Object getOrderIdPath() {
    return orderIdPath;
  }

  public void setOrderIdPath(Object orderIdPath) {
    this.orderIdPath = orderIdPath;
  }

  public Object getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Object orderDate) {
    this.orderDate = orderDate;
  }

  public String getOriginCountryIso3() {
    return originCountryIso3;
  }

  public void setOriginCountryIso3(String originCountryIso3) {
    this.originCountryIso3 = originCountryIso3;
  }

  public int getShipmentPackageCount() {
    return shipmentPackageCount;
  }

  public void setShipmentPackageCount(int shipmentPackageCount) {
    this.shipmentPackageCount = shipmentPackageCount;
  }

  public Date getShipmentPickupDate() {
    return shipmentPickupDate;
  }

  public void setShipmentPickupDate(Date shipmentPickupDate) {
    this.shipmentPickupDate = shipmentPickupDate;
  }

  public Date getShipmentDeliveryDate() {
    return shipmentDeliveryDate;
  }

  public void setShipmentDeliveryDate(Date shipmentDeliveryDate) {
    this.shipmentDeliveryDate = shipmentDeliveryDate;
  }

  public String getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }

  public Object getShipmentWeight() {
    return shipmentWeight;
  }

  public void setShipmentWeight(Object shipmentWeight) {
    this.shipmentWeight = shipmentWeight;
  }

  public String getShipmentWeightUnit() {
    return shipmentWeightUnit;
  }

  public void setShipmentWeightUnit(String shipmentWeightUnit) {
    this.shipmentWeightUnit = shipmentWeightUnit;
  }

  public String getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }

  public List<String> getSmses() {
    return smses;
  }

  public void setSmses(List<String> smses) {
    this.smses = smses;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getSubtag() {
    return subtag;
  }

  public void setSubtag(String subtag) {
    this.subtag = subtag;
  }

  public String getSubtagMessage() {
    return subtagMessage;
  }

  public void setSubtagMessage(String subtagMessage) {
    this.subtagMessage = subtagMessage;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getTrackedCount() {
    return trackedCount;
  }

  public void setTrackedCount(int trackedCount) {
    this.trackedCount = trackedCount;
  }

  public Object getLastMileTrackingSupported() {
    return lastMileTrackingSupported;
  }

  public void setLastMileTrackingSupported(Object lastMileTrackingSupported) {
    this.lastMileTrackingSupported = lastMileTrackingSupported;
  }

  public Object getLanguage() {
    return language;
  }

  public void setLanguage(Object language) {
    this.language = language;
  }

  public String getUniqueToken() {
    return uniqueToken;
  }

  public void setUniqueToken(String uniqueToken) {
    this.uniqueToken = uniqueToken;
  }

  public List<Checkpoint> getCheckpoints() {
    return checkpoints;
  }

  public void setCheckpoints(List<Checkpoint> checkpoints) {
    this.checkpoints = checkpoints;
  }

  public List<String> getSubscribedSmses() {
    return subscribedSmses;
  }

  public void setSubscribedSmses(List<String> subscribedSmses) {
    this.subscribedSmses = subscribedSmses;
  }

  public List<String> getSubscribedEmails() {
    return subscribedEmails;
  }

  public void setSubscribedEmails(List<String> subscribedEmails) {
    this.subscribedEmails = subscribedEmails;
  }

  public boolean isReturnToSender() {
    return returnToSender;
  }

  public void setReturnToSender(boolean returnToSender) {
    this.returnToSender = returnToSender;
  }

  public Object getTrackingAccountNumber() {
    return trackingAccountNumber;
  }

  public void setTrackingAccountNumber(Object trackingAccountNumber) {
    this.trackingAccountNumber = trackingAccountNumber;
  }

  public Object getTrackingOriginCountry() {
    return trackingOriginCountry;
  }

  public void setTrackingOriginCountry(Object trackingOriginCountry) {
    this.trackingOriginCountry = trackingOriginCountry;
  }

  public Object getTrackingDestinationCountry() {
    return trackingDestinationCountry;
  }

  public void setTrackingDestinationCountry(Object trackingDestinationCountry) {
    this.trackingDestinationCountry = trackingDestinationCountry;
  }

  public Object getTrackingKey() {
    return trackingKey;
  }

  public void setTrackingKey(Object trackingKey) {
    this.trackingKey = trackingKey;
  }

  public Object getTrackingPostalCode() {
    return trackingPostalCode;
  }

  public void setTrackingPostalCode(Object trackingPostalCode) {
    this.trackingPostalCode = trackingPostalCode;
  }

  public Object getTrackingShipDate() {
    return trackingShipDate;
  }

  public void setTrackingShipDate(Object trackingShipDate) {
    this.trackingShipDate = trackingShipDate;
  }

  public Object getTrackingState() {
    return trackingState;
  }

  public void setTrackingState(Object trackingState) {
    this.trackingState = trackingState;
  }

  public Object getOrderPromisedDeliveryDate() {
    return orderPromisedDeliveryDate;
  }

  public void setOrderPromisedDeliveryDate(Object orderPromisedDeliveryDate) {
    this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
  }

  public Object getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(Object deliveryType) {
    this.deliveryType = deliveryType;
  }

  public Object getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(Object pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Object getPickupNote() {
    return pickupNote;
  }

  public void setPickupNote(Object pickupNote) {
    this.pickupNote = pickupNote;
  }

  public String getCourierTrackingLink() {
    return courierTrackingLink;
  }

  public void setCourierTrackingLink(String courierTrackingLink) {
    this.courierTrackingLink = courierTrackingLink;
  }

  public String getCourierRedirectLink() {
    return courierRedirectLink;
  }

  public void setCourierRedirectLink(String courierRedirectLink) {
    this.courierRedirectLink = courierRedirectLink;
  }

  public Date getFirstAttemptedAt() {
    return firstAttemptedAt;
  }

  public void setFirstAttemptedAt(Date firstAttemptedAt) {
    this.firstAttemptedAt = firstAttemptedAt;
  }
}
