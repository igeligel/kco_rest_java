/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.order_management.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrderManagementAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementAddress {
  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("street_address")
  private String streetAddress = null;

  @JsonProperty("street_address2")
  private String streetAddress2 = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  public OrderManagementAddress givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Given name. Maximum 100 characters.
   * @return givenName
  **/
  @ApiModelProperty(example = "Klara", value = "Given name. Maximum 100 characters.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public OrderManagementAddress familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Family name. Maximum 100 characters.
   * @return familyName
  **/
  @ApiModelProperty(example = "Joyce", value = "Family name. Maximum 100 characters.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public OrderManagementAddress title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title. Between 0 and 20 characters.
   * @return title
  **/
  @ApiModelProperty(example = "Mrs", value = "Title. Between 0 and 20 characters.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrderManagementAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * First line of street address. Maximum 100 characters.
   * @return streetAddress
  **/
  @ApiModelProperty(example = "Apartment 10", value = "First line of street address. Maximum 100 characters.")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public OrderManagementAddress streetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
    return this;
  }

   /**
   * Second line of street address. Maximum 100 characters.
   * @return streetAddress2
  **/
  @ApiModelProperty(example = "1 Safeway", value = "Second line of street address. Maximum 100 characters.")
  public String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public OrderManagementAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postcode. Maximum 10 characters.
   * @return postalCode
  **/
  @ApiModelProperty(example = "12345", value = "Postcode. Maximum 10 characters.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public OrderManagementAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City. Maximum 200 characters.
   * @return city
  **/
  @ApiModelProperty(example = "Knoxville", value = "City. Maximum 200 characters.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderManagementAddress region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State/Region. Required for some countries. Maximum 200 characters.
   * @return region
  **/
  @ApiModelProperty(example = "TN", value = "State/Region. Required for some countries. Maximum 200 characters.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public OrderManagementAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country. ISO 3166 alpha-2.
   * @return country
  **/
  @ApiModelProperty(example = "us", value = "Country. ISO 3166 alpha-2.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrderManagementAddress email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail address. Maximum 100 characters.
   * @return email
  **/
  @ApiModelProperty(example = "klara.joyce@klarna.com", value = "E-mail address. Maximum 100 characters.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrderManagementAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number. Maximum 100 characters.
   * @return phone
  **/
  @ApiModelProperty(example = "1-555-555-5555", value = "Phone number. Maximum 100 characters.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementAddress address = (OrderManagementAddress) o;
    return Objects.equals(this.givenName, address.givenName) &&
        Objects.equals(this.familyName, address.familyName) &&
        Objects.equals(this.title, address.title) &&
        Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.streetAddress2, address.streetAddress2) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.phone, address.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, title, streetAddress, streetAddress2, postalCode, city, region, country, email, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementAddress {\n");
    
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

