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
import com.asana.models.gen.TagBase;
import com.asana.models.gen.UserCompact;
import com.asana.models.gen.WorkspaceCompact;
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
 * TagResponse
 */


public class TagResponse extends TagBase {
  @SerializedName("followers")
  private List<UserCompact> followers = null;

  @SerializedName("workspace")
  private WorkspaceCompact workspace = null;


   /**
   * Array of users following this tag.
   * @return followers
  **/
  @Schema(description = "Array of users following this tag.")
  public List<UserCompact> getFollowers() {
    return followers;
  }

  public TagResponse workspace(WorkspaceCompact workspace) {
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @Schema(description = "")
  public WorkspaceCompact getWorkspace() {
    return workspace;
  }

  public void setWorkspace(WorkspaceCompact workspace) {
    this.workspace = workspace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResponse tagResponse = (TagResponse) o;
    return Objects.equals(this.followers, tagResponse.followers) &&
        Objects.equals(this.workspace, tagResponse.workspace) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers, workspace, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
