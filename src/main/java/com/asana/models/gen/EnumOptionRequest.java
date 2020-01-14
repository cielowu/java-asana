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
import com.asana.models.gen.EnumOptionCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EnumOptionRequest
 */


public class EnumOptionRequest extends EnumOptionCompact {
  @SerializedName("insert_before")
  private String insertBefore = null;

  @SerializedName("insert_after")
  private String insertAfter = null;


  public EnumOptionRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

   /**
   * An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
   * @return insertBefore
  **/
  @Schema(example = "12345", description = "An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public EnumOptionRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

   /**
   * An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
   * @return insertAfter
  **/
  @Schema(example = "12345", description = "An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumOptionRequest enumOptionRequest = (EnumOptionRequest) o;
    return Objects.equals(this.insertBefore, enumOptionRequest.insertBefore) &&
        Objects.equals(this.insertAfter, enumOptionRequest.insertAfter) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertBefore, insertAfter, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumOptionRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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
