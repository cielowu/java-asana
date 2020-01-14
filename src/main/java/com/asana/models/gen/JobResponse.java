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
import com.asana.models.gen.ProjectCompact;
import com.asana.models.gen.TaskCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * JobResponse
 */


public class JobResponse extends AsanaResource {
  @SerializedName("resource_subtype")
  private String resourceSubtype = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_STARTED("not_started"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("new_project")
  private ProjectCompact newProject = null;

  @SerializedName("new_task")
  private TaskCompact newTask = null;


   /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  **/
  @Schema(example = "duplicate_task", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "in_progress", description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public JobResponse newProject(ProjectCompact newProject) {
    this.newProject = newProject;
    return this;
  }

   /**
   * Get newProject
   * @return newProject
  **/
  @Schema(description = "")
  public ProjectCompact getNewProject() {
    return newProject;
  }

  public void setNewProject(ProjectCompact newProject) {
    this.newProject = newProject;
  }

  public JobResponse newTask(TaskCompact newTask) {
    this.newTask = newTask;
    return this;
  }

   /**
   * Get newTask
   * @return newTask
  **/
  @Schema(description = "")
  public TaskCompact getNewTask() {
    return newTask;
  }

  public void setNewTask(TaskCompact newTask) {
    this.newTask = newTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.resourceSubtype, jobResponse.resourceSubtype) &&
        Objects.equals(this.status, jobResponse.status) &&
        Objects.equals(this.newProject, jobResponse.newProject) &&
        Objects.equals(this.newTask, jobResponse.newTask) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceSubtype, status, newProject, newTask, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    newProject: ").append(toIndentedString(newProject)).append("\n");
    sb.append("    newTask: ").append(toIndentedString(newTask)).append("\n");
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
