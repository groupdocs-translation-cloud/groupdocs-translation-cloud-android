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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * XmlFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T16:18:20.975621+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class XmlFileRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  @javax.annotation.Nonnull
  private String sourceLanguage = "en";

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "targetLanguages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  @javax.annotation.Nonnull
  private List<String> targetLanguages = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private byte[] _file;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE_NAME = "originalFileName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE_NAME)
  @javax.annotation.Nullable
  private String originalFileName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  /**
   * Toggle file saving mode for storage.  Is Files by default.
   */
  @JsonAdapter(SavingModeEnum.Adapter.class)
  public enum SavingModeEnum {
    FILES("Files"),
    
    ARCHIVE("Archive"),
    
    BOTH("Both");

    private String value;

    SavingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SavingModeEnum fromValue(String value) {
      for (SavingModeEnum b : SavingModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SavingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SavingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SavingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SavingModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SavingModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SAVING_MODE = "savingMode";
  @SerializedName(SERIALIZED_NAME_SAVING_MODE)
  @javax.annotation.Nullable
  private SavingModeEnum savingMode;

  public static final String SERIALIZED_NAME_IGNORE_LIST = "ignoreList";
  @SerializedName(SERIALIZED_NAME_IGNORE_LIST)
  @javax.annotation.Nullable
  private List<String> ignoreList;

  public static final String SERIALIZED_NAME_IS_WHITE_LIST = "isWhiteList";
  @SerializedName(SERIALIZED_NAME_IS_WHITE_LIST)
  @javax.annotation.Nullable
  private Boolean isWhiteList;

  public XmlFileRequest() {
  }

  public XmlFileRequest sourceLanguage(@javax.annotation.Nonnull String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

  /**
   * Language of original file
   * @return sourceLanguage
   */
  @javax.annotation.Nonnull
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(@javax.annotation.Nonnull String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public XmlFileRequest targetLanguages(@javax.annotation.Nonnull List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
    return this;
  }

  public XmlFileRequest addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

  /**
   * List of target languages
   * @return targetLanguages
   */
  @javax.annotation.Nonnull
  public List<String> getTargetLanguages() {
    return targetLanguages;
  }

  public void setTargetLanguages(@javax.annotation.Nonnull List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public XmlFileRequest _file(@javax.annotation.Nullable byte[] _file) {
    this._file = _file;
    return this;
  }

  /**
   * File as byte array
   * @return _file
   */
  @javax.annotation.Nullable
  public byte[] getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable byte[] _file) {
    this._file = _file;
  }


  public XmlFileRequest originalFileName(@javax.annotation.Nullable String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Type in the file name. If null will be as request ID.
   * @return originalFileName
   */
  @javax.annotation.Nullable
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(@javax.annotation.Nullable String originalFileName) {
    this.originalFileName = originalFileName;
  }


  public XmlFileRequest url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Link to file for translation. Ignore, if \&quot;file\&quot; property not null
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public XmlFileRequest origin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Url or name of application using this SDK. Not required.
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
  }


  public XmlFileRequest savingMode(@javax.annotation.Nullable SavingModeEnum savingMode) {
    this.savingMode = savingMode;
    return this;
  }

  /**
   * Toggle file saving mode for storage.  Is Files by default.
   * @return savingMode
   */
  @javax.annotation.Nullable
  public SavingModeEnum getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(@javax.annotation.Nullable SavingModeEnum savingMode) {
    this.savingMode = savingMode;
  }


  public XmlFileRequest ignoreList(@javax.annotation.Nullable List<String> ignoreList) {
    this.ignoreList = ignoreList;
    return this;
  }

  public XmlFileRequest addIgnoreListItem(String ignoreListItem) {
    if (this.ignoreList == null) {
      this.ignoreList = new ArrayList<>();
    }
    this.ignoreList.add(ignoreListItem);
    return this;
  }

  /**
   * List of elements for Xml, Json and Yaml formats. Determines which items should be blacklisted or whitelisted for processing depending on GroupDocs.Translation.ApiGateway.DTO.XmlFileRequest.IsWhiteList.
   * @return ignoreList
   */
  @javax.annotation.Nullable
  public List<String> getIgnoreList() {
    return ignoreList;
  }

  public void setIgnoreList(@javax.annotation.Nullable List<String> ignoreList) {
    this.ignoreList = ignoreList;
  }


  public XmlFileRequest isWhiteList(@javax.annotation.Nullable Boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
    return this;
  }

  /**
   * Determines to which list the items in GroupDocs.Translation.ApiGateway.DTO.XmlFileRequest.IgnoreList should be allocated. The default is the black list.
   * @return isWhiteList
   */
  @javax.annotation.Nullable
  public Boolean getIsWhiteList() {
    return isWhiteList;
  }

  public void setIsWhiteList(@javax.annotation.Nullable Boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlFileRequest xmlFileRequest = (XmlFileRequest) o;
    return Objects.equals(this.sourceLanguage, xmlFileRequest.sourceLanguage) &&
        Objects.equals(this.targetLanguages, xmlFileRequest.targetLanguages) &&
        Arrays.equals(this._file, xmlFileRequest._file) &&
        Objects.equals(this.originalFileName, xmlFileRequest.originalFileName) &&
        Objects.equals(this.url, xmlFileRequest.url) &&
        Objects.equals(this.origin, xmlFileRequest.origin) &&
        Objects.equals(this.savingMode, xmlFileRequest.savingMode) &&
        Objects.equals(this.ignoreList, xmlFileRequest.ignoreList) &&
        Objects.equals(this.isWhiteList, xmlFileRequest.isWhiteList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLanguage, targetLanguages, Arrays.hashCode(_file), originalFileName, url, origin, savingMode, ignoreList, isWhiteList);
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
    sb.append("class XmlFileRequest {\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    ignoreList: ").append(toIndentedString(ignoreList)).append("\n");
    sb.append("    isWhiteList: ").append(toIndentedString(isWhiteList)).append("\n");
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
    openapiFields.add("sourceLanguage");
    openapiFields.add("targetLanguages");
    openapiFields.add("file");
    openapiFields.add("originalFileName");
    openapiFields.add("url");
    openapiFields.add("origin");
    openapiFields.add("savingMode");
    openapiFields.add("ignoreList");
    openapiFields.add("isWhiteList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sourceLanguage");
    openapiRequiredFields.add("targetLanguages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to XmlFileRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!XmlFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in XmlFileRequest is not found in the empty JSON string", XmlFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!XmlFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `XmlFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : XmlFileRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sourceLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceLanguage").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("targetLanguages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("targetLanguages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLanguages` to be an array in the JSON string but got `%s`", jsonObj.get("targetLanguages").toString()));
      }
      if ((jsonObj.get("originalFileName") != null && !jsonObj.get("originalFileName").isJsonNull()) && !jsonObj.get("originalFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFileName").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) && !jsonObj.get("savingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `savingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("savingMode").toString()));
      }
      // validate the optional field `savingMode`
      if (jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) {
        SavingModeEnum.validateJsonElement(jsonObj.get("savingMode"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ignoreList") != null && !jsonObj.get("ignoreList").isJsonNull() && !jsonObj.get("ignoreList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignoreList` to be an array in the JSON string but got `%s`", jsonObj.get("ignoreList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!XmlFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'XmlFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<XmlFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(XmlFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<XmlFileRequest>() {
           @Override
           public void write(JsonWriter out, XmlFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public XmlFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of XmlFileRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of XmlFileRequest
   * @throws IOException if the JSON string is invalid with respect to XmlFileRequest
   */
  public static XmlFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, XmlFileRequest.class);
  }

  /**
   * Convert an instance of XmlFileRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
