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
 *  
 */
@ApiModel(description = " ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T09:33:39.178Z")
public class InstantShoppingErrorResponseV1 {
  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("error_message")
  private String errorMessage = null;

  @JsonProperty("correlation_id")
  private String correlationId = null;

  public InstantShoppingErrorResponseV1 errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   *  
   * @return errorCode
  **/
  @ApiModelProperty(value = " ")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public InstantShoppingErrorResponseV1 errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   *  
   * @return errorMessage
  **/
  @ApiModelProperty(value = " ")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public InstantShoppingErrorResponseV1 correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   *  
   * @return correlationId
  **/
  @ApiModelProperty(value = " ")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingErrorResponseV1 errorResponseV1 = (InstantShoppingErrorResponseV1) o;
    return Objects.equals(this.errorCode, errorResponseV1.errorCode) &&
        Objects.equals(this.errorMessage, errorResponseV1.errorMessage) &&
        Objects.equals(this.correlationId, errorResponseV1.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingErrorResponseV1 {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

