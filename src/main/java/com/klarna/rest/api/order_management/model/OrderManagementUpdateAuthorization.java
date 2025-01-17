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
import com.klarna.rest.api.order_management.model.OrderManagementOrderLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderManagementUpdateAuthorization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementUpdateAuthorization {
  @JsonProperty("order_amount")
  private Long orderAmount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("order_lines")
  private List<OrderManagementOrderLine> orderLines = null;

  public OrderManagementUpdateAuthorization orderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * The new total order amount. Minor units.
   * minimum: 1
   * maximum: 100000000
   * @return orderAmount
  **/
  @ApiModelProperty(required = true, value = "The new total order amount. Minor units.")
  public Long getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
  }

  public OrderManagementUpdateAuthorization description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the change.
   * @return description
  **/
  @ApiModelProperty(example = "Added charger", value = "Description of the change.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderManagementUpdateAuthorization orderLines(List<OrderManagementOrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public OrderManagementUpdateAuthorization addOrderLinesItem(OrderManagementOrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderManagementOrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * New set of order lines for the order.
   * @return orderLines
  **/
  @ApiModelProperty(value = "New set of order lines for the order.")
  public List<OrderManagementOrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderManagementOrderLine> orderLines) {
    this.orderLines = orderLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementUpdateAuthorization updateAuthorization = (OrderManagementUpdateAuthorization) o;
    return Objects.equals(this.orderAmount, updateAuthorization.orderAmount) &&
        Objects.equals(this.description, updateAuthorization.description) &&
        Objects.equals(this.orderLines, updateAuthorization.orderLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAmount, description, orderLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementUpdateAuthorization {\n");
    
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
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

