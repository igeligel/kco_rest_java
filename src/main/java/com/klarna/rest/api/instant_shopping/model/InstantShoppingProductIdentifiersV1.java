/*
 * Klarna Instant Shopping
 * The Instant Shopping API is serving two purposes:  to manage the orders as they result from the Instant Shopping purchase flow  to generate Instant Shopping Button keys necessary for setting up the Instant Shopping flow both onsite and offsite    The 'authorizations' endpoint is relevant to authorize the orders. The 'buttons' endpoint is relevant to manage the button setup options.   Note that as soon as a purchase initiated through Instant Shopping is authorized with Klarna, the order should be read and handled using the Order Management API.    Button Setup Options is the library for creating and maintaining Instant Shopping Button Keys.  The API is accessible through a few different URLS. There are different URLs for testing and for making live purchases as well as different URLs for depending on if you are based in Europe or in the U.S.  All interaction with Klarna's APIs must be done over HTTPS. To authenticate with Klarna you use your API Credentials and HTTP Basic auth.  The credentials consist of two elements:  Username - Consists of your Merchant ID (eid) - a unique number that identifies your e-store, combined with a random string.  Password - a string which is associated with your Merchant ID and is used to authorize use of Klarna's APIs  Note: The API credentials are separate from your Merchant ID, and it is possible to have several API credentials associated with the same Merchant ID.  The credentials should be sent as an authorization header for every request with the username and password.  You receive both your live and test credentials by contacting Klarna sales for your country.  If the credentials are missing or wrong Klarna will respond with 401 Unauthorized. You can read more about HTTP Basic auth in the Wikipedia article. The username and password the username:password in base64. [https://gist.github.com/brandonmwest/a2632d0a65088a20c00a](Examples)   You can read more about Klarna Data types at https://developers.klarna.com/api/#data-types, e.g. the date format is ISO 8601
 *
 * OpenAPI spec version: 1.0.0
 * Contact: instant.shopping.e@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.instant_shopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstantShoppingProductIdentifiersV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T09:33:39.178Z")
public class InstantShoppingProductIdentifiersV1 {
  @JsonProperty("category_path")
  private String categoryPath = null;

  @JsonProperty("global_trade_item_number")
  private String globalTradeItemNumber = null;

  @JsonProperty("manufacturer_part_number")
  private String manufacturerPartNumber = null;

  @JsonProperty("brand")
  private String brand = null;

  public InstantShoppingProductIdentifiersV1 categoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * The product&#39;s category path as used in the merchant&#39;s webshop. Include the full and most detailed category and separate the segments with &#39; &gt; &#39;
   * @return categoryPath
  **/
  @ApiModelProperty(example = "Electronics Store > Computers & Tablets > Desktops", value = "The product's category path as used in the merchant's webshop. Include the full and most detailed category and separate the segments with ' > '")
  public String getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
  }

  public InstantShoppingProductIdentifiersV1 globalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
    return this;
  }

   /**
   * The product&#39;s Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible
   * @return globalTradeItemNumber
  **/
  @ApiModelProperty(example = "735858293167", value = "The product's Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible")
  public String getGlobalTradeItemNumber() {
    return globalTradeItemNumber;
  }

  public void setGlobalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
  }

  public InstantShoppingProductIdentifiersV1 manufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

   /**
   * The product&#39;s Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible
   * @return manufacturerPartNumber
  **/
  @ApiModelProperty(example = "BOXNUC5CPYH", value = "The product's Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible")
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }

  public InstantShoppingProductIdentifiersV1 brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The product&#39;s brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.
   * @return brand
  **/
  @ApiModelProperty(example = "Intel", value = "The product's brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingProductIdentifiersV1 productIdentifiersV1 = (InstantShoppingProductIdentifiersV1) o;
    return Objects.equals(this.categoryPath, productIdentifiersV1.categoryPath) &&
        Objects.equals(this.globalTradeItemNumber, productIdentifiersV1.globalTradeItemNumber) &&
        Objects.equals(this.manufacturerPartNumber, productIdentifiersV1.manufacturerPartNumber) &&
        Objects.equals(this.brand, productIdentifiersV1.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryPath, globalTradeItemNumber, manufacturerPartNumber, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingProductIdentifiersV1 {\n");
    
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
    sb.append("    globalTradeItemNumber: ").append(toIndentedString(globalTradeItemNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

