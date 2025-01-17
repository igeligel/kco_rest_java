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
import com.klarna.rest.api.order_management.model.OrderManagementAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrderManagementUpdateConsumer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementUpdateConsumer {
  @JsonProperty("shipping_address")
  private OrderManagementAddress shippingAddress = null;

  @JsonProperty("billing_address")
  private OrderManagementAddress billingAddress = null;

  public OrderManagementUpdateConsumer shippingAddress(OrderManagementAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Customer shipping address.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "Customer shipping address.")
  public OrderManagementAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(OrderManagementAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public OrderManagementUpdateConsumer billingAddress(OrderManagementAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Customer billing address.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "Customer billing address.")
  public OrderManagementAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(OrderManagementAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementUpdateConsumer updateConsumer = (OrderManagementUpdateConsumer) o;
    return Objects.equals(this.shippingAddress, updateConsumer.shippingAddress) &&
        Objects.equals(this.billingAddress, updateConsumer.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, billingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementUpdateConsumer {\n");
    
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

