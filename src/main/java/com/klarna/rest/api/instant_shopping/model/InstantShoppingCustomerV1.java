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
 * InstantShoppingCustomerV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T09:33:39.178Z")
public class InstantShoppingCustomerV1 {
  @JsonProperty("date_of_birth")
  private String dateOfBirth = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("last_four_ssn")
  private String lastFourSsn = null;

  @JsonProperty("national_identification_number")
  private String nationalIdentificationNumber = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("vat_id")
  private String vatId = null;

  @JsonProperty("organization_registration_id")
  private String organizationRegistrationId = null;

  @JsonProperty("organization_entity_type")
  private String organizationEntityType = null;

  public InstantShoppingCustomerV1 dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * ISO 8601 date. The customer date of birth.
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "1995-10-20", value = "ISO 8601 date. The customer date of birth.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public InstantShoppingCustomerV1 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The customer&#39;s title
   * @return title
  **/
  @ApiModelProperty(example = "Mr", value = "The customer's title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InstantShoppingCustomerV1 gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The customer gender
   * @return gender
  **/
  @ApiModelProperty(example = "male", value = "The customer gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public InstantShoppingCustomerV1 lastFourSsn(String lastFourSsn) {
    this.lastFourSsn = lastFourSsn;
    return this;
  }

   /**
   * Last four digits for customer social security number
   * @return lastFourSsn
  **/
  @ApiModelProperty(example = "0512", value = "Last four digits for customer social security number")
  public String getLastFourSsn() {
    return lastFourSsn;
  }

  public void setLastFourSsn(String lastFourSsn) {
    this.lastFourSsn = lastFourSsn;
  }

  public InstantShoppingCustomerV1 nationalIdentificationNumber(String nationalIdentificationNumber) {
    this.nationalIdentificationNumber = nationalIdentificationNumber;
    return this;
  }

   /**
   * The customer&#39;s national identification number
   * @return nationalIdentificationNumber
  **/
  @ApiModelProperty(example = "3108971100", value = "The customer's national identification number")
  public String getNationalIdentificationNumber() {
    return nationalIdentificationNumber;
  }

  public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
    this.nationalIdentificationNumber = nationalIdentificationNumber;
  }

  public InstantShoppingCustomerV1 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(example = "person", value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstantShoppingCustomerV1 vatId(String vatId) {
    this.vatId = vatId;
    return this;
  }

   /**
   * VAT id
   * @return vatId
  **/
  @ApiModelProperty(value = "VAT id")
  public String getVatId() {
    return vatId;
  }

  public void setVatId(String vatId) {
    this.vatId = vatId;
  }

  public InstantShoppingCustomerV1 organizationRegistrationId(String organizationRegistrationId) {
    this.organizationRegistrationId = organizationRegistrationId;
    return this;
  }

   /**
   * Organization registration id
   * @return organizationRegistrationId
  **/
  @ApiModelProperty(example = "556737-0431", value = "Organization registration id")
  public String getOrganizationRegistrationId() {
    return organizationRegistrationId;
  }

  public void setOrganizationRegistrationId(String organizationRegistrationId) {
    this.organizationRegistrationId = organizationRegistrationId;
  }

  public InstantShoppingCustomerV1 organizationEntityType(String organizationEntityType) {
    this.organizationEntityType = organizationEntityType;
    return this;
  }

   /**
   * Organization entity type
   * @return organizationEntityType
  **/
  @ApiModelProperty(example = "LIMITED_COMPANY", value = "Organization entity type")
  public String getOrganizationEntityType() {
    return organizationEntityType;
  }

  public void setOrganizationEntityType(String organizationEntityType) {
    this.organizationEntityType = organizationEntityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingCustomerV1 customerV1 = (InstantShoppingCustomerV1) o;
    return Objects.equals(this.dateOfBirth, customerV1.dateOfBirth) &&
        Objects.equals(this.title, customerV1.title) &&
        Objects.equals(this.gender, customerV1.gender) &&
        Objects.equals(this.lastFourSsn, customerV1.lastFourSsn) &&
        Objects.equals(this.nationalIdentificationNumber, customerV1.nationalIdentificationNumber) &&
        Objects.equals(this.type, customerV1.type) &&
        Objects.equals(this.vatId, customerV1.vatId) &&
        Objects.equals(this.organizationRegistrationId, customerV1.organizationRegistrationId) &&
        Objects.equals(this.organizationEntityType, customerV1.organizationEntityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, title, gender, lastFourSsn, nationalIdentificationNumber, type, vatId, organizationRegistrationId, organizationEntityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingCustomerV1 {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastFourSsn: ").append(toIndentedString(lastFourSsn)).append("\n");
    sb.append("    nationalIdentificationNumber: ").append(toIndentedString(nationalIdentificationNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    organizationRegistrationId: ").append(toIndentedString(organizationRegistrationId)).append("\n");
    sb.append("    organizationEntityType: ").append(toIndentedString(organizationEntityType)).append("\n");
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

