package com.example.aftership.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomFields {

  @JsonProperty("product_name")
  private String productName;
  @JsonProperty("product_price")
  private String productPrice;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public CustomFields() {
  }

  /**
   *
   * @param productName
   * @param productPrice
   */
  public CustomFields(String productName, String productPrice) {
    super();
    this.productName = productName;
    this.productPrice = productPrice;
  }

  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  @JsonProperty("product_name")
  public void setProductName(String productName) {
    this.productName = productName;
  }

  public CustomFields withProductName(String productName) {
    this.productName = productName;
    return this;
  }

  @JsonProperty("product_price")
  public String getProductPrice() {
    return productPrice;
  }

  @JsonProperty("product_price")
  public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
  }

  public CustomFields withProductPrice(String productPrice) {
    this.productPrice = productPrice;
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

  public CustomFields withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

}