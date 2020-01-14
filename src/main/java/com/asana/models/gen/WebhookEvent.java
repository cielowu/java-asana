/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.asana.models.gen;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * WebhookEvent
 */


public class WebhookEvent {
  @SerializedName("action")
  private String action = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user")
  private String user = null;


   /**
   * The type of action taken that triggered the event.
   * @return action
  **/
  @Schema(example = "changed", description = "The type of action taken that triggered the event.")
  public String getAction() {
    return action;
  }

   /**
   * The timestamp when the event occurred.
   * @return createdAt
  **/
  @Schema(description = "The timestamp when the event occurred.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * For added/removed events, the parent gid that resource was added to or removed from. The parent will be &#x60;null&#x60; for other event types.
   * @return parent
  **/
  @Schema(example = "12345", description = "For added/removed events, the parent gid that resource was added to or removed from. The parent will be `null` for other event types.")
  public String getParent() {
    return parent;
  }

   /**
   * The resource gid the event occurred on.  *Note: The resource that triggered the event may be different from the one that the events were requested for. For example, a subscription to a project will contain events for tasks contained within the project.*
   * @return resource
  **/
  @Schema(example = "32154", description = "The resource gid the event occurred on.  *Note: The resource that triggered the event may be different from the one that the events were requested for. For example, a subscription to a project will contain events for tasks contained within the project.*")
  public String getResource() {
    return resource;
  }

   /**
   * The type of the resource that generated the event.  *Note: Currently, only tasks, projects and stories generate events.*
   * @return type
  **/
  @Schema(example = "task", description = "The type of the resource that generated the event.  *Note: Currently, only tasks, projects and stories generate events.*")
  public String getType() {
    return type;
  }

   /**
   * The gid of the user who triggered the event.  *Note: The event may be triggered by a different user than the subscriber. For example, if user A subscribes to a task and user B modified it, the event’s user will be user B. Note: Some events are generated by the system, and will have &#x60;null&#x60; as the user. API consumers should make sure to handle this case.*
   * @return user
  **/
  @Schema(example = "321654987", description = "The gid of the user who triggered the event.  *Note: The event may be triggered by a different user than the subscriber. For example, if user A subscribes to a task and user B modified it, the event’s user will be user B. Note: Some events are generated by the system, and will have `null` as the user. API consumers should make sure to handle this case.*")
  public String getUser() {
    return user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEvent webhookEvent = (WebhookEvent) o;
    return Objects.equals(this.action, webhookEvent.action) &&
        Objects.equals(this.createdAt, webhookEvent.createdAt) &&
        Objects.equals(this.parent, webhookEvent.parent) &&
        Objects.equals(this.resource, webhookEvent.resource) &&
        Objects.equals(this.type, webhookEvent.type) &&
        Objects.equals(this.user, webhookEvent.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, createdAt, parent, resource, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEvent {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
