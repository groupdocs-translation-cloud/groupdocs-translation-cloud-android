/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.11.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupdocs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.model.CloudFileRequest;
import com.groupdocs.model.HttpStatusCode;
import com.groupdocs.model.UrlFileInfo;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * CloudFileResponseWithAdditionalInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:29:12.172040+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class CloudFileResponseWithAdditionalInfo {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  @javax.annotation.Nullable
  private Map<String, UrlFileInfo> urls;

  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  @javax.annotation.Nullable
  private Map<String, Float> scores;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  @javax.annotation.Nullable
  private CloudFileRequest request;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  @javax.annotation.Nullable
  private Map<String, String> details;

  public CloudFileResponseWithAdditionalInfo() {
  }

  public CloudFileResponseWithAdditionalInfo status(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public HttpStatusCode getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
  }


  public CloudFileResponseWithAdditionalInfo message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public CloudFileResponseWithAdditionalInfo urls(@javax.annotation.Nullable Map<String, UrlFileInfo> urls) {
    this.urls = urls;
    return this;
  }

  public CloudFileResponseWithAdditionalInfo putUrlsItem(String key, UrlFileInfo urlsItem) {
    if (this.urls == null) {
      this.urls = new HashMap<>();
    }
    this.urls.put(key, urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
   */
  @javax.annotation.Nullable
  public Map<String, UrlFileInfo> getUrls() {
    return urls;
  }

  public void setUrls(@javax.annotation.Nullable Map<String, UrlFileInfo> urls) {
    this.urls = urls;
  }


  public CloudFileResponseWithAdditionalInfo scores(@javax.annotation.Nullable Map<String, Float> scores) {
    this.scores = scores;
    return this;
  }

  public CloudFileResponseWithAdditionalInfo putScoresItem(String key, Float scoresItem) {
    if (this.scores == null) {
      this.scores = new HashMap<>();
    }
    this.scores.put(key, scoresItem);
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @javax.annotation.Nullable
  public Map<String, Float> getScores() {
    return scores;
  }

  public void setScores(@javax.annotation.Nullable Map<String, Float> scores) {
    this.scores = scores;
  }


  public CloudFileResponseWithAdditionalInfo request(@javax.annotation.Nullable CloudFileRequest request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @javax.annotation.Nullable
  public CloudFileRequest getRequest() {
    return request;
  }

  public void setRequest(@javax.annotation.Nullable CloudFileRequest request) {
    this.request = request;
  }


  public CloudFileResponseWithAdditionalInfo details(@javax.annotation.Nullable Map<String, String> details) {
    this.details = details;
    return this;
  }

  public CloudFileResponseWithAdditionalInfo putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(@javax.annotation.Nullable Map<String, String> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFileResponseWithAdditionalInfo cloudFileResponseWithAdditionalInfo = (CloudFileResponseWithAdditionalInfo) o;
    return Objects.equals(this.status, cloudFileResponseWithAdditionalInfo.status) &&
        Objects.equals(this.message, cloudFileResponseWithAdditionalInfo.message) &&
        Objects.equals(this.urls, cloudFileResponseWithAdditionalInfo.urls) &&
        Objects.equals(this.scores, cloudFileResponseWithAdditionalInfo.scores) &&
        Objects.equals(this.request, cloudFileResponseWithAdditionalInfo.request) &&
        Objects.equals(this.details, cloudFileResponseWithAdditionalInfo.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, urls, scores, request, details);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudFileResponseWithAdditionalInfo {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("urls");
    openapiFields.add("scores");
    openapiFields.add("request");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudFileResponseWithAdditionalInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudFileResponseWithAdditionalInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudFileResponseWithAdditionalInfo is not found in the empty JSON string", CloudFileResponseWithAdditionalInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudFileResponseWithAdditionalInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudFileResponseWithAdditionalInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        HttpStatusCode.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `request`
      if (jsonObj.get("request") != null && !jsonObj.get("request").isJsonNull()) {
        CloudFileRequest.validateJsonElement(jsonObj.get("request"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudFileResponseWithAdditionalInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudFileResponseWithAdditionalInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudFileResponseWithAdditionalInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudFileResponseWithAdditionalInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudFileResponseWithAdditionalInfo>() {
           @Override
           public void write(JsonWriter out, CloudFileResponseWithAdditionalInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudFileResponseWithAdditionalInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudFileResponseWithAdditionalInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudFileResponseWithAdditionalInfo
   * @throws IOException if the JSON string is invalid with respect to CloudFileResponseWithAdditionalInfo
   */
  public static CloudFileResponseWithAdditionalInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudFileResponseWithAdditionalInfo.class);
  }

  /**
   * Convert an instance of CloudFileResponseWithAdditionalInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

