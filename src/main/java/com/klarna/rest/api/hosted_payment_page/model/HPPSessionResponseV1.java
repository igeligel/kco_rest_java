/*
 * HPP
 * Hosted Payment Page
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.hosted_payment_page.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * HPPSessionResponseV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T14:49:10.959Z")
public class HPPSessionResponseV1 {
  @JsonProperty("authorization_token")
  private String authorizationToken = null;

  @JsonProperty("session_id")
  private String sessionId = null;

  /**
   * Current HPP Session status
   */
  public enum StatusEnum {
    WAITING("WAITING"),
    
    BACK("BACK"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    DISABLED("DISABLED"),
    
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = null;

  public HPPSessionResponseV1 authorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
    return this;
  }

   /**
   * Authorization token (only for KP Sessions)
   * @return authorizationToken
  **/
  @ApiModelProperty(example = "70850a20-a2a0-5c70-810c-096fa6f850bb", value = "Authorization token (only for KP Sessions)")
  public String getAuthorizationToken() {
    return authorizationToken;
  }

  public void setAuthorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }

  public HPPSessionResponseV1 sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The id of the HPP Session
   * @return sessionId
  **/
  @ApiModelProperty(example = "a15b228c-02ad-11e9-8eb2-f2801f1b9fd1", value = "The id of the HPP Session")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public HPPSessionResponseV1 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current HPP Session status
   * @return status
  **/
  @ApiModelProperty(example = "COMPLETED", value = "Current HPP Session status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HPPSessionResponseV1 updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Latest status update time
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2038-01-19T03:14:07.000Z", value = "Latest status update time")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPPSessionResponseV1 sessionResponseV1 = (HPPSessionResponseV1) o;
    return Objects.equals(this.authorizationToken, sessionResponseV1.authorizationToken) &&
        Objects.equals(this.sessionId, sessionResponseV1.sessionId) &&
        Objects.equals(this.status, sessionResponseV1.status) &&
        Objects.equals(this.updatedAt, sessionResponseV1.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationToken, sessionId, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPPSessionResponseV1 {\n");
    
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

