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
import com.asana.models.gen.AsanaResource;
import com.asana.models.gen.CustomFieldResponse;
import com.asana.models.gen.TaskBase;
import com.asana.models.gen.TaskBaseExternal;
import com.asana.models.gen.TaskBaseMemberships;
import com.asana.models.gen.UserCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskRequest
 */


public class TaskRequest extends TaskBase {
  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("followers")
  private List<String> followers = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("projects")
  private List<String> projects = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("workspace")
  private String workspace = null;


  public TaskRequest assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Gid of a user.
   * @return assignee
  **/
  @Schema(example = "12345", description = "Gid of a user.")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public TaskRequest followers(List<String> followers) {
    this.followers = followers;
    return this;
  }

  public TaskRequest addFollowersItem(String followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

   /**
   * *Create-Only* Array of user gids. In order to change followers on an existing task use &#x60;addFollowers&#x60; and &#x60;removeFollowers&#x60;.
   * @return followers
  **/
  @Schema(example = "[\"12345\"]", description = "*Create-Only* Array of user gids. In order to change followers on an existing task use `addFollowers` and `removeFollowers`.")
  public List<String> getFollowers() {
    return followers;
  }

  public void setFollowers(List<String> followers) {
    this.followers = followers;
  }

  public TaskRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Gid of a task.
   * @return parent
  **/
  @Schema(example = "12345", description = "Gid of a task.")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public TaskRequest projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public TaskRequest addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * *Create-Only* Array of project gids. In order to change projects on an existing task use &#x60;addProject&#x60; and &#x60;removeProject&#x60;.
   * @return projects
  **/
  @Schema(example = "[\"12345\"]", description = "*Create-Only* Array of project gids. In order to change projects on an existing task use `addProject` and `removeProject`.")
  public List<String> getProjects() {
    return projects;
  }

  public void setProjects(List<String> projects) {
    this.projects = projects;
  }

  public TaskRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TaskRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * *Create-Only* Array of tag gids. In order to change tags on an existing task use &#x60;addTag&#x60; and &#x60;removeTag&#x60;.
   * @return tags
  **/
  @Schema(example = "[\"12345\"]", description = "*Create-Only* Array of tag gids. In order to change tags on an existing task use `addTag` and `removeTag`.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public TaskRequest workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

   /**
   * Gid of a workspace.
   * @return workspace
  **/
  @Schema(example = "12345", description = "Gid of a workspace.")
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
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
    TaskRequest taskRequest = (TaskRequest) o;
    return Objects.equals(this.assignee, taskRequest.assignee) &&
        Objects.equals(this.followers, taskRequest.followers) &&
        Objects.equals(this.parent, taskRequest.parent) &&
        Objects.equals(this.projects, taskRequest.projects) &&
        Objects.equals(this.tags, taskRequest.tags) &&
        Objects.equals(this.workspace, taskRequest.workspace) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, followers, parent, projects, tags, workspace, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
