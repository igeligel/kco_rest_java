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
 * InstantShoppingMerchantUrlsV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T09:33:39.178Z")
public class InstantShoppingMerchantUrlsV1 {
  @JsonProperty("terms")
  private String terms = null;

  @JsonProperty("notification")
  private String notification = null;

  @JsonProperty("confirmation")
  private String confirmation = null;

  @JsonProperty("push")
  private String push = null;

  @JsonProperty("place_order")
  private String placeOrder = null;

  public InstantShoppingMerchantUrlsV1 terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * URL of a page on the merchant side describing the terms and conditions. (max 2000 characters)
   * @return terms
  **/
  @ApiModelProperty(example = "https://theestore.se/terms", required = true, value = "URL of a page on the merchant side describing the terms and conditions. (max 2000 characters)")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public InstantShoppingMerchantUrlsV1 notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * URL of an endpoint at the merchant side, which will receive notifications on pending orders. (must be https, max 2000 characters)
   * @return notification
  **/
  @ApiModelProperty(example = "https://theestore.se/notify", value = "URL of an endpoint at the merchant side, which will receive notifications on pending orders. (must be https, max 2000 characters)")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public InstantShoppingMerchantUrlsV1 confirmation(String confirmation) {
    this.confirmation = confirmation;
    return this;
  }

   /**
   * URL of a page that the consumers will be redirected to after completing a purchase with Instant Shopping. (max 2000 characters)
   * @return confirmation
  **/
  @ApiModelProperty(example = "https://theestore.se/", required = true, value = "URL of a page that the consumers will be redirected to after completing a purchase with Instant Shopping. (max 2000 characters)")
  public String getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  public InstantShoppingMerchantUrlsV1 push(String push) {
    this.push = push;
    return this;
  }

   /**
   * URL of an endpoint at the merchant side, which will receive a ping when an order is completed within Klarna&#39;s order management. (must be https, max 2000 characters)
   * @return push
  **/
  @ApiModelProperty(example = "https://theestore.se/push", value = "URL of an endpoint at the merchant side, which will receive a ping when an order is completed within Klarna's order management. (must be https, max 2000 characters)")
  public String getPush() {
    return push;
  }

  public void setPush(String push) {
    this.push = push;
  }

  public InstantShoppingMerchantUrlsV1 placeOrder(String placeOrder) {
    this.placeOrder = placeOrder;
    return this;
  }

   /**
   * URL of an endpoint at the merchant side, which will receive a ping to place an order. (must be https, max 2000 characters)
   * @return placeOrder
  **/
  @ApiModelProperty(example = "https://theestore.se/place-order", required = true, value = "URL of an endpoint at the merchant side, which will receive a ping to place an order. (must be https, max 2000 characters)")
  public String getPlaceOrder() {
    return placeOrder;
  }

  public void setPlaceOrder(String placeOrder) {
    this.placeOrder = placeOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingMerchantUrlsV1 merchantUrlsV1 = (InstantShoppingMerchantUrlsV1) o;
    return Objects.equals(this.terms, merchantUrlsV1.terms) &&
        Objects.equals(this.notification, merchantUrlsV1.notification) &&
        Objects.equals(this.confirmation, merchantUrlsV1.confirmation) &&
        Objects.equals(this.push, merchantUrlsV1.push) &&
        Objects.equals(this.placeOrder, merchantUrlsV1.placeOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, notification, confirmation, push, placeOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingMerchantUrlsV1 {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    placeOrder: ").append(toIndentedString(placeOrder)).append("\n");
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

