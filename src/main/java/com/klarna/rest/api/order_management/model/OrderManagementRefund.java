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
import org.threeten.bp.OffsetDateTime;

/**
 * OrderManagementRefund
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementRefund {
  @JsonProperty("refund_id")
  private String refundId = null;

  @JsonProperty("refunded_amount")
  private Long refundedAmount = null;

  @JsonProperty("refunded_at")
  private OffsetDateTime refundedAt = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("order_lines")
  private List<OrderManagementOrderLine> orderLines = null;

  public OrderManagementRefund refundId(String refundId) {
    this.refundId = refundId;
    return this;
  }

   /**
   * The refund id. Generated when the refund is created.
   * @return refundId
  **/
  @ApiModelProperty(example = "b2cb4f2e-2781-4359-80ad-555735ebb8d8", value = "The refund id. Generated when the refund is created.")
  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public OrderManagementRefund refundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * Refunded amount in minor units.
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "Refunded amount in minor units.")
  public Long getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public OrderManagementRefund refundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = refundedAt;
    return this;
  }

   /**
   * The time of the refund. ISO 8601.
   * @return refundedAt
  **/
  @ApiModelProperty(example = "2015-12-04T15:17:40.000Z", value = "The time of the refund. ISO 8601.")
  public OffsetDateTime getRefundedAt() {
    return refundedAt;
  }

  public void setRefundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = refundedAt;
  }

  public OrderManagementRefund description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the refund shown to the customer. Max length is 255 characters.
   * @return description
  **/
  @ApiModelProperty(example = "The item was returned and the order refunded.", value = "Description of the refund shown to the customer. Max length is 255 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderManagementRefund orderLines(List<OrderManagementOrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public OrderManagementRefund addOrderLinesItem(OrderManagementOrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderManagementOrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * Order lines for the refund shown to the customer. Optional but increases the customer experience. Maximum 1000 order lines.
   * @return orderLines
  **/
  @ApiModelProperty(value = "Order lines for the refund shown to the customer. Optional but increases the customer experience. Maximum 1000 order lines.")
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
    OrderManagementRefund refund = (OrderManagementRefund) o;
    return Objects.equals(this.refundId, refund.refundId) &&
        Objects.equals(this.refundedAmount, refund.refundedAmount) &&
        Objects.equals(this.refundedAt, refund.refundedAt) &&
        Objects.equals(this.description, refund.description) &&
        Objects.equals(this.orderLines, refund.orderLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundId, refundedAmount, refundedAt, description, orderLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementRefund {\n");
    
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    refundedAt: ").append(toIndentedString(refundedAt)).append("\n");
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

