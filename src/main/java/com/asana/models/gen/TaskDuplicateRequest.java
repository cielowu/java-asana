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
 * TaskDuplicateRequest
 */


public class TaskDuplicateRequest {
  @SerializedName("name")
  private String name = null;

  /**
   * The fields that will be duplicated to the new task.
   */
  @JsonAdapter(IncludeEnum.Adapter.class)
  public enum IncludeEnum {
    NOTES("notes"),
    ASSIGNEE("assignee"),
    SUBTASKS("subtasks"),
    ATTACHMENTS("attachments"),
    TAGS("tags"),
    FOLLOWERS("followers"),
    PROJECTS("projects"),
    DATES("dates"),
    DEPENDENCIES("dependencies"),
    PARENT("parent");

    private String value;

    IncludeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IncludeEnum fromValue(String text) {
      for (IncludeEnum b : IncludeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IncludeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IncludeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IncludeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IncludeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("include")
  private IncludeEnum include = null;


  public TaskDuplicateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new task.
   * @return name
  **/
  @Schema(example = "New Task Name", description = "The name of the new task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskDuplicateRequest include(IncludeEnum include) {
    this.include = include;
    return this;
  }

   /**
   * The fields that will be duplicated to the new task.
   * @return include
  **/
  @Schema(example = "[\"notes\",\"assignee\"]", description = "The fields that will be duplicated to the new task.")
  public IncludeEnum getInclude() {
    return include;
  }

  public void setInclude(IncludeEnum include) {
    this.include = include;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDuplicateRequest taskDuplicateRequest = (TaskDuplicateRequest) o;
    return Objects.equals(this.name, taskDuplicateRequest.name) &&
        Objects.equals(this.include, taskDuplicateRequest.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, include);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDuplicateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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
