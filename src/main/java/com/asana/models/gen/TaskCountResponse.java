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
/**
 * A response object returned from the task count endpoint.
 */
@Schema(description = "A response object returned from the task count endpoint.")

public class TaskCountResponse {
  @SerializedName("num_tasks")
  private Integer numTasks = null;

  @SerializedName("num_incomplete_tasks")
  private Integer numIncompleteTasks = null;

  @SerializedName("num_completed_tasks")
  private Integer numCompletedTasks = null;

  @SerializedName("num_milestones")
  private Integer numMilestones = null;

  @SerializedName("num_incomplete_milestones")
  private Integer numIncompleteMilestones = null;

  @SerializedName("num_completed_milestones")
  private Integer numCompletedMilestones = null;


  public TaskCountResponse numTasks(Integer numTasks) {
    this.numTasks = numTasks;
    return this;
  }

   /**
   * The number of tasks in a project.
   * @return numTasks
  **/
  @Schema(example = "200", description = "The number of tasks in a project.")
  public Integer getNumTasks() {
    return numTasks;
  }

  public void setNumTasks(Integer numTasks) {
    this.numTasks = numTasks;
  }

  public TaskCountResponse numIncompleteTasks(Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
    return this;
  }

   /**
   * The number of incomplete tasks in a project.
   * @return numIncompleteTasks
  **/
  @Schema(example = "50", description = "The number of incomplete tasks in a project.")
  public Integer getNumIncompleteTasks() {
    return numIncompleteTasks;
  }

  public void setNumIncompleteTasks(Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
  }

  public TaskCountResponse numCompletedTasks(Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
    return this;
  }

   /**
   * The number of completed tasks in a project.
   * @return numCompletedTasks
  **/
  @Schema(example = "150", description = "The number of completed tasks in a project.")
  public Integer getNumCompletedTasks() {
    return numCompletedTasks;
  }

  public void setNumCompletedTasks(Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
  }

  public TaskCountResponse numMilestones(Integer numMilestones) {
    this.numMilestones = numMilestones;
    return this;
  }

   /**
   * The number of milestones in a project.
   * @return numMilestones
  **/
  @Schema(example = "10", description = "The number of milestones in a project.")
  public Integer getNumMilestones() {
    return numMilestones;
  }

  public void setNumMilestones(Integer numMilestones) {
    this.numMilestones = numMilestones;
  }

  public TaskCountResponse numIncompleteMilestones(Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
    return this;
  }

   /**
   * The number of incomplete milestones in a project.
   * @return numIncompleteMilestones
  **/
  @Schema(example = "7", description = "The number of incomplete milestones in a project.")
  public Integer getNumIncompleteMilestones() {
    return numIncompleteMilestones;
  }

  public void setNumIncompleteMilestones(Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
  }

  public TaskCountResponse numCompletedMilestones(Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
    return this;
  }

   /**
   * The number of completed milestones in a project.
   * @return numCompletedMilestones
  **/
  @Schema(example = "3", description = "The number of completed milestones in a project.")
  public Integer getNumCompletedMilestones() {
    return numCompletedMilestones;
  }

  public void setNumCompletedMilestones(Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCountResponse taskCountResponse = (TaskCountResponse) o;
    return Objects.equals(this.numTasks, taskCountResponse.numTasks) &&
        Objects.equals(this.numIncompleteTasks, taskCountResponse.numIncompleteTasks) &&
        Objects.equals(this.numCompletedTasks, taskCountResponse.numCompletedTasks) &&
        Objects.equals(this.numMilestones, taskCountResponse.numMilestones) &&
        Objects.equals(this.numIncompleteMilestones, taskCountResponse.numIncompleteMilestones) &&
        Objects.equals(this.numCompletedMilestones, taskCountResponse.numCompletedMilestones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTasks, numIncompleteTasks, numCompletedTasks, numMilestones, numIncompleteMilestones, numCompletedMilestones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCountResponse {\n");
    
    sb.append("    numTasks: ").append(toIndentedString(numTasks)).append("\n");
    sb.append("    numIncompleteTasks: ").append(toIndentedString(numIncompleteTasks)).append("\n");
    sb.append("    numCompletedTasks: ").append(toIndentedString(numCompletedTasks)).append("\n");
    sb.append("    numMilestones: ").append(toIndentedString(numMilestones)).append("\n");
    sb.append("    numIncompleteMilestones: ").append(toIndentedString(numIncompleteMilestones)).append("\n");
    sb.append("    numCompletedMilestones: ").append(toIndentedString(numCompletedMilestones)).append("\n");
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
