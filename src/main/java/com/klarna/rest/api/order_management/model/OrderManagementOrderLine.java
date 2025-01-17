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
import com.klarna.rest.api.order_management.model.OrderManagementProductIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrderManagementOrderLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementOrderLine {
  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("quantity_unit")
  private String quantityUnit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("total_amount")
  private Long totalAmount = null;

  @JsonProperty("unit_price")
  private Long unitPrice = null;

  @JsonProperty("total_discount_amount")
  private Long totalDiscountAmount = null;

  @JsonProperty("tax_rate")
  private Integer taxRate = null;

  @JsonProperty("total_tax_amount")
  private Long totalTaxAmount = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("product_url")
  private String productUrl = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("product_identifiers")
  private OrderManagementProductIdentifiers productIdentifiers = null;

  public OrderManagementOrderLine reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Article number, SKU or similar.
   * @return reference
  **/
  @ApiModelProperty(example = "75001", value = "Article number, SKU or similar.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OrderManagementOrderLine type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Order line type. Matches: physical|discount|shipping_fee|sales_tax|store_credit|gift_card|digital|surcharge
   * @return type
  **/
  @ApiModelProperty(example = "physical", required = true, value = "Order line type. Matches: physical|discount|shipping_fee|sales_tax|store_credit|gift_card|digital|surcharge")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderManagementOrderLine quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Item quantity. Non-negative. Between 0 and 100000
   * minimum: 0
   * maximum: 100000
   * @return quantity
  **/
  @ApiModelProperty(example = "1", required = true, value = "Item quantity. Non-negative. Between 0 and 100000")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public OrderManagementOrderLine quantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
    return this;
  }

   /**
   * Unit used to describe the quantity. Maximum 10 characters.
   * @return quantityUnit
  **/
  @ApiModelProperty(example = "pcs.", value = "Unit used to describe the quantity. Maximum 10 characters.")
  public String getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  public OrderManagementOrderLine name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive item name. Maximum 255 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Descriptive item name. Maximum 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderManagementOrderLine totalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount including tax and discounts (&#x60;quantity * unit_price - total_discount_amount&#x60;).
   * maximum: 100000000
   * @return totalAmount
  **/
  @ApiModelProperty(required = true, value = "Total amount including tax and discounts (`quantity * unit_price - total_discount_amount`).")
  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public OrderManagementOrderLine unitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit price including tax without applying discounts in minor units.
   * maximum: 100000000
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Unit price including tax without applying discounts in minor units.")
  public Long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OrderManagementOrderLine totalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * The discount amount in minor units. Includes tax. Example: 1200 &#x3D; $12. Max value: 100000000
   * minimum: 0
   * maximum: 100000000
   * @return totalDiscountAmount
  **/
  @ApiModelProperty(example = "0", value = "The discount amount in minor units. Includes tax. Example: 1200 = $12. Max value: 100000000")
  public Long getTotalDiscountAmount() {
    return totalDiscountAmount;
  }

  public void setTotalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }

  public OrderManagementOrderLine taxRate(Integer taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The tax rate in percent with two implicit decimals. Non-negative. Example: 2500 &#x3D; 25%.
   * minimum: 0
   * maximum: 10000
   * @return taxRate
  **/
  @ApiModelProperty(required = true, value = "The tax rate in percent with two implicit decimals. Non-negative. Example: 2500 = 25%.")
  public Integer getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Integer taxRate) {
    this.taxRate = taxRate;
  }

  public OrderManagementOrderLine totalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * The total tax amount in minor units. Negative if the order line type is discount. Example: 500 &#x3D; $5.
   * maximum: 100000000
   * @return totalTaxAmount
  **/
  @ApiModelProperty(required = true, value = "The total tax amount in minor units. Negative if the order line type is discount. Example: 500 = $5.")
  public Long getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public OrderManagementOrderLine merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Data about the order line. Set at creation or update and returned when fetching the order through the API. Maximum 255 characters.
   * @return merchantData
  **/
  @ApiModelProperty(example = "Some metadata", value = "Data about the order line. Set at creation or update and returned when fetching the order through the API. Maximum 255 characters.")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public OrderManagementOrderLine productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

   /**
   * URL to the product that can be used in communications between Klarna and the customer. Maximum 1024 characters.
   * @return productUrl
  **/
  @ApiModelProperty(example = "https://yourstore.example/product/headphones", value = "URL to the product that can be used in communications between Klarna and the customer. Maximum 1024 characters.")
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public OrderManagementOrderLine imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL to an image that can be embedded in communications between Klarna and the customer. Maximum 1024 characters.
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://yourstore.example/product/headphones.png", value = "URL to an image that can be embedded in communications between Klarna and the customer. Maximum 1024 characters.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public OrderManagementOrderLine productIdentifiers(OrderManagementProductIdentifiers productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
    return this;
  }

   /**
   * Identifiers to better describe the product for improved risk assessment, support, presentation to consumers and promotional functionality.
   * @return productIdentifiers
  **/
  @ApiModelProperty(value = "Identifiers to better describe the product for improved risk assessment, support, presentation to consumers and promotional functionality.")
  public OrderManagementProductIdentifiers getProductIdentifiers() {
    return productIdentifiers;
  }

  public void setProductIdentifiers(OrderManagementProductIdentifiers productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementOrderLine orderLine = (OrderManagementOrderLine) o;
    return Objects.equals(this.reference, orderLine.reference) &&
        Objects.equals(this.type, orderLine.type) &&
        Objects.equals(this.quantity, orderLine.quantity) &&
        Objects.equals(this.quantityUnit, orderLine.quantityUnit) &&
        Objects.equals(this.name, orderLine.name) &&
        Objects.equals(this.totalAmount, orderLine.totalAmount) &&
        Objects.equals(this.unitPrice, orderLine.unitPrice) &&
        Objects.equals(this.totalDiscountAmount, orderLine.totalDiscountAmount) &&
        Objects.equals(this.taxRate, orderLine.taxRate) &&
        Objects.equals(this.totalTaxAmount, orderLine.totalTaxAmount) &&
        Objects.equals(this.merchantData, orderLine.merchantData) &&
        Objects.equals(this.productUrl, orderLine.productUrl) &&
        Objects.equals(this.imageUrl, orderLine.imageUrl) &&
        Objects.equals(this.productIdentifiers, orderLine.productIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, type, quantity, quantityUnit, name, totalAmount, unitPrice, totalDiscountAmount, taxRate, totalTaxAmount, merchantData, productUrl, imageUrl, productIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementOrderLine {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    productIdentifiers: ").append(toIndentedString(productIdentifiers)).append("\n");
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

