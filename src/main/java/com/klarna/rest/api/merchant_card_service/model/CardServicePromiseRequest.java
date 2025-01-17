/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.merchant_card_service.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.merchant_card_service.model.CardServiceCardSpecification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CardServicePromiseRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:59:55.645Z")
public class CardServicePromiseRequest {
  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("cards")
  private List<CardServiceCardSpecification> cards = new ArrayList<CardServiceCardSpecification>();

  public CardServicePromiseRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * A valid order id
   * @return orderId
  **/
  @ApiModelProperty(example = "f3392f8b-6116-4073-ab96-e330819e2c07", required = true, value = "A valid order id")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CardServicePromiseRequest cards(List<CardServiceCardSpecification> cards) {
    this.cards = cards;
    return this;
  }

  public CardServicePromiseRequest addCardsItem(CardServiceCardSpecification cardsItem) {
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * The cards you would like to issue (max 1000)
   * @return cards
  **/
  @ApiModelProperty(required = true, value = "The cards you would like to issue (max 1000)")
  public List<CardServiceCardSpecification> getCards() {
    return cards;
  }

  public void setCards(List<CardServiceCardSpecification> cards) {
    this.cards = cards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardServicePromiseRequest promiseRequest = (CardServicePromiseRequest) o;
    return Objects.equals(this.orderId, promiseRequest.orderId) &&
        Objects.equals(this.cards, promiseRequest.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, cards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardServicePromiseRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

