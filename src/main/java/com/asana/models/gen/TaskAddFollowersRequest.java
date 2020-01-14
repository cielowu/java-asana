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
import java.util.ArrayList;
import java.util.List;
/**
 * TaskAddFollowersRequest
 */


public class TaskAddFollowersRequest {
  @SerializedName("followers")
  private List<String> followers = new ArrayList<>();


  public TaskAddFollowersRequest(TaskAddFollowersResponse responseModel) {
    super();
    followers = responseModel.followers;
  }
  public TaskAddFollowersRequest followers(List<String> followers) {
    this.followers = followers;
    return this;
  }

  public TaskAddFollowersRequest addFollowersItem(String followersItem) {
    this.followers.add(followersItem);
    return this;
  }

   /**
   * The followers to add to the task.
   * @return followers
  **/
  @Schema(example = "[\"13579\",\"321654\"]", required = true, description = "The followers to add to the task.")
  public List<String> getFollowers() {
    return followers;
  }

  public void setFollowers(List<String> followers) {
    this.followers = followers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAddFollowersRequest taskAddFollowersRequest = (TaskAddFollowersRequest) o;
    return Objects.equals(this.followers, taskAddFollowersRequest.followers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAddFollowersRequest {\n");
    
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
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
