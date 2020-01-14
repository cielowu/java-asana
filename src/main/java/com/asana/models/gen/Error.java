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
 * Error
 */


public class Error {
  @SerializedName("message")
  private String message = null;

  @SerializedName("help")
  private String help = null;

  @SerializedName("phrase")
  private String phrase = null;


   /**
   * Message providing more detail about the error that occurred, if available.
   * @return message
  **/
  @Schema(example = "project: Missing input", description = "Message providing more detail about the error that occurred, if available.")
  public String getMessage() {
    return message;
  }

   /**
   * Additional information directing developers to resources on how to address and fix the problem, if available.
   * @return help
  **/
  @Schema(example = "For more information on API status codes and how to handle them, read the docs on errors: https://asana.github.io/developer-docs/#errors'", description = "Additional information directing developers to resources on how to address and fix the problem, if available.")
  public String getHelp() {
    return help;
  }

   /**
   * *500 errors only*. A unique error phrase which can be used when contacting developer support to help identify the exact occurrence of the problem in Asana’s logs.
   * @return phrase
  **/
  @Schema(example = "6 sad squid snuggle softly", description = "*500 errors only*. A unique error phrase which can be used when contacting developer support to help identify the exact occurrence of the problem in Asana’s logs.")
  public String getPhrase() {
    return phrase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.message, error.message) &&
        Objects.equals(this.help, error.help) &&
        Objects.equals(this.phrase, error.phrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, help, phrase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
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
