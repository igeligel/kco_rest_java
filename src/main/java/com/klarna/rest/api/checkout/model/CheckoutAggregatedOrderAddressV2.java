/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutAggregatedOrderAddressV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:22:48.232Z")
public class CheckoutAggregatedOrderAddressV2 {
  @JsonProperty("organization_name")
  private String organizationName = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("attention")
  private String attention = null;

  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("street_address")
  private String streetAddress = null;

  @JsonProperty("street_address2")
  private String streetAddress2 = null;

  @JsonProperty("street_name")
  private String streetName = null;

  @JsonProperty("street_number")
  private String streetNumber = null;

  @JsonProperty("house_extension")
  private String houseExtension = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("care_of")
  private String careOf = null;

  public CheckoutAggregatedOrderAddressV2 organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public CheckoutAggregatedOrderAddressV2 reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CheckoutAggregatedOrderAddressV2 attention(String attention) {
    this.attention = attention;
    return this;
  }

   /**
   * Get attention
   * @return attention
  **/
  @ApiModelProperty(value = "")
  public String getAttention() {
    return attention;
  }

  public void setAttention(String attention) {
    this.attention = attention;
  }

  public CheckoutAggregatedOrderAddressV2 givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Given name.
   * @return givenName
  **/
  @ApiModelProperty(example = "John", value = "Given name.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public CheckoutAggregatedOrderAddressV2 familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Family name.
   * @return familyName
  **/
  @ApiModelProperty(example = "Doe", value = "Family name.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public CheckoutAggregatedOrderAddressV2 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail address.
   * @return email
  **/
  @ApiModelProperty(example = "john@doe.com", value = "E-mail address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CheckoutAggregatedOrderAddressV2 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title.&lt;p&gt;Valid values for UK:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;Mr&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Ms&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Mrs&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Miss&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;Valid values for DACH:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;Herr&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Frau&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;Valid values for NL:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;Dhr.&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Mevr.&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt;
   * @return title
  **/
  @ApiModelProperty(example = "Mr", value = "Title.<p>Valid values for UK:</p><ul><li><em>Mr</em></li><li><em>Ms</em></li><li><em>Mrs</em></li><li><em>Miss</em></li></ul><p>Valid values for DACH:</p><ul><li><em>Herr</em></li><li><em>Frau</em></li></ul><p>Valid values for NL:</p><ul><li><em>Dhr.</em></li><li><em>Mevr.</em></li></ul>")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CheckoutAggregatedOrderAddressV2 streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address, first line.
   * @return streetAddress
  **/
  @ApiModelProperty(example = "Lombard St 10", value = "Street address, first line.")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public CheckoutAggregatedOrderAddressV2 streetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
    return this;
  }

   /**
   * Street address, second line.
   * @return streetAddress2
  **/
  @ApiModelProperty(example = "Apt 214", value = "Street address, second line.")
  public String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public CheckoutAggregatedOrderAddressV2 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name. Only applicable in DE/AT/NL. Do not combine with street_address. See &lt;b&gt;streetNumber&lt;/b&gt;.
   * @return streetName
  **/
  @ApiModelProperty(example = "Lombard St", value = "Street name. Only applicable in DE/AT/NL. Do not combine with street_address. See <b>streetNumber</b>.")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public CheckoutAggregatedOrderAddressV2 streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Street number. Only applicable in DE/AT/NL. Do not combine with street_address. See &lt;b&gt;streetName&lt;/b&gt;.
   * @return streetNumber
  **/
  @ApiModelProperty(example = "10", value = "Street number. Only applicable in DE/AT/NL. Do not combine with street_address. See <b>streetName</b>.")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public CheckoutAggregatedOrderAddressV2 houseExtension(String houseExtension) {
    this.houseExtension = houseExtension;
    return this;
  }

   /**
   * House extension. Only applicable in NL
   * @return houseExtension
  **/
  @ApiModelProperty(example = "B", value = "House extension. Only applicable in NL")
  public String getHouseExtension() {
    return houseExtension;
  }

  public void setHouseExtension(String houseExtension) {
    this.houseExtension = houseExtension;
  }

  public CheckoutAggregatedOrderAddressV2 postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal/post code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "90210", value = "Postal/post code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public CheckoutAggregatedOrderAddressV2 city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  @ApiModelProperty(example = "Beverly Hills", value = "City.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CheckoutAggregatedOrderAddressV2 region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State or Region.
   * @return region
  **/
  @ApiModelProperty(example = "CA", value = "State or Region.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CheckoutAggregatedOrderAddressV2 phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number.
   * @return phone
  **/
  @ApiModelProperty(example = "333444555", value = "Phone number.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CheckoutAggregatedOrderAddressV2 country(String country) {
    this.country = country;
    return this;
  }

   /**
   * ISO 3166 alpha-2. Country.
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "ISO 3166 alpha-2. Country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CheckoutAggregatedOrderAddressV2 careOf(String careOf) {
    this.careOf = careOf;
    return this;
  }

   /**
   * Care of.
   * @return careOf
  **/
  @ApiModelProperty(example = "C/O", value = "Care of.")
  public String getCareOf() {
    return careOf;
  }

  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutAggregatedOrderAddressV2 aggregatedOrderAddressV2 = (CheckoutAggregatedOrderAddressV2) o;
    return Objects.equals(this.organizationName, aggregatedOrderAddressV2.organizationName) &&
        Objects.equals(this.reference, aggregatedOrderAddressV2.reference) &&
        Objects.equals(this.attention, aggregatedOrderAddressV2.attention) &&
        Objects.equals(this.givenName, aggregatedOrderAddressV2.givenName) &&
        Objects.equals(this.familyName, aggregatedOrderAddressV2.familyName) &&
        Objects.equals(this.email, aggregatedOrderAddressV2.email) &&
        Objects.equals(this.title, aggregatedOrderAddressV2.title) &&
        Objects.equals(this.streetAddress, aggregatedOrderAddressV2.streetAddress) &&
        Objects.equals(this.streetAddress2, aggregatedOrderAddressV2.streetAddress2) &&
        Objects.equals(this.streetName, aggregatedOrderAddressV2.streetName) &&
        Objects.equals(this.streetNumber, aggregatedOrderAddressV2.streetNumber) &&
        Objects.equals(this.houseExtension, aggregatedOrderAddressV2.houseExtension) &&
        Objects.equals(this.postalCode, aggregatedOrderAddressV2.postalCode) &&
        Objects.equals(this.city, aggregatedOrderAddressV2.city) &&
        Objects.equals(this.region, aggregatedOrderAddressV2.region) &&
        Objects.equals(this.phone, aggregatedOrderAddressV2.phone) &&
        Objects.equals(this.country, aggregatedOrderAddressV2.country) &&
        Objects.equals(this.careOf, aggregatedOrderAddressV2.careOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationName, reference, attention, givenName, familyName, email, title, streetAddress, streetAddress2, streetName, streetNumber, houseExtension, postalCode, city, region, phone, country, careOf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutAggregatedOrderAddressV2 {\n");
    
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    houseExtension: ").append(toIndentedString(houseExtension)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
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

