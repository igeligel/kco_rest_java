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
 * CheckoutMerchantRequestedCheckbox
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:22:48.232Z")
public class CheckoutMerchantRequestedCheckbox {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("checked")
  private Boolean checked = false;

  public CheckoutMerchantRequestedCheckbox id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutMerchantRequestedCheckbox checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Get checked
   * @return checked
  **/
  @ApiModelProperty(value = "")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutMerchantRequestedCheckbox merchantRequestedCheckbox = (CheckoutMerchantRequestedCheckbox) o;
    return Objects.equals(this.id, merchantRequestedCheckbox.id) &&
        Objects.equals(this.checked, merchantRequestedCheckbox.checked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutMerchantRequestedCheckbox {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
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

