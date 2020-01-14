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
import com.asana.models.gen.WorkspaceCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * OrganizationExportResponse
 */


public class OrganizationExportResponse extends AsanaResource {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  /**
   * The current state of the export.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("pending"),
    STARTED("started"),
    FINISHED("finished"),
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("organization")
  private WorkspaceCompact organization = null;


   /**
   * The time at which this resource was created.
   * @return createdAt
  **/
  @Schema(description = "The time at which this resource was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Download this URL to retreive the full export of the organization in JSON format. It will be compressed in a gzip (.gz) container.  *Note: May be null if the export is still in progress or failed.  If present, this URL may only be valid for 1 hour from the time of retrieval. You should avoid persisting this URL somewhere and rather refresh on demand to ensure you do not keep stale URLs.*
   * @return downloadUrl
  **/
  @Schema(example = "https://asana-export.s3.amazonaws.com/export-4632784536274-20170127-43246.json.gz?AWSAccessKeyId=xxxxxxxx", description = "Download this URL to retreive the full export of the organization in JSON format. It will be compressed in a gzip (.gz) container.  *Note: May be null if the export is still in progress or failed.  If present, this URL may only be valid for 1 hour from the time of retrieval. You should avoid persisting this URL somewhere and rather refresh on demand to ensure you do not keep stale URLs.*")
  public String getDownloadUrl() {
    return downloadUrl;
  }

   /**
   * The current state of the export.
   * @return state
  **/
  @Schema(example = "started", description = "The current state of the export.")
  public StateEnum getState() {
    return state;
  }

  public OrganizationExportResponse organization(WorkspaceCompact organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Schema(description = "")
  public WorkspaceCompact getOrganization() {
    return organization;
  }

  public void setOrganization(WorkspaceCompact organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportResponse organizationExportResponse = (OrganizationExportResponse) o;
    return Objects.equals(this.createdAt, organizationExportResponse.createdAt) &&
        Objects.equals(this.downloadUrl, organizationExportResponse.downloadUrl) &&
        Objects.equals(this.state, organizationExportResponse.state) &&
        Objects.equals(this.organization, organizationExportResponse.organization) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, downloadUrl, state, organization, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
