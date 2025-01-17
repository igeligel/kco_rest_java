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
 * InstantShoppingButtonSetupOptionsV1StylingTheme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T09:33:39.178Z")
public class InstantShoppingButtonSetupOptionsV1StylingTheme {
  /**
   * Gets or Sets variation
   */
  public enum VariationEnum {
    KLARNA("klarna"),
    
    DARK("dark"),
    
    LIGHT("light");

    private String value;

    VariationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VariationEnum fromValue(String text) {
      for (VariationEnum b : VariationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("variation")
  private VariationEnum variation = null;

  /**
   * Gets or Sets tagline
   */
  public enum TaglineEnum {
    DARK("dark"),
    
    LIGHT("light");

    private String value;

    TaglineEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaglineEnum fromValue(String text) {
      for (TaglineEnum b : TaglineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tagline")
  private TaglineEnum tagline = null;

  public InstantShoppingButtonSetupOptionsV1StylingTheme variation(VariationEnum variation) {
    this.variation = variation;
    return this;
  }

   /**
   * Get variation
   * @return variation
  **/
  @ApiModelProperty(value = "")
  public VariationEnum getVariation() {
    return variation;
  }

  public void setVariation(VariationEnum variation) {
    this.variation = variation;
  }

  public InstantShoppingButtonSetupOptionsV1StylingTheme tagline(TaglineEnum tagline) {
    this.tagline = tagline;
    return this;
  }

   /**
   * Get tagline
   * @return tagline
  **/
  @ApiModelProperty(value = "")
  public TaglineEnum getTagline() {
    return tagline;
  }

  public void setTagline(TaglineEnum tagline) {
    this.tagline = tagline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingButtonSetupOptionsV1StylingTheme buttonSetupOptionsV1StylingTheme = (InstantShoppingButtonSetupOptionsV1StylingTheme) o;
    return Objects.equals(this.variation, buttonSetupOptionsV1StylingTheme.variation) &&
        Objects.equals(this.tagline, buttonSetupOptionsV1StylingTheme.tagline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variation, tagline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingButtonSetupOptionsV1StylingTheme {\n");
    
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
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

