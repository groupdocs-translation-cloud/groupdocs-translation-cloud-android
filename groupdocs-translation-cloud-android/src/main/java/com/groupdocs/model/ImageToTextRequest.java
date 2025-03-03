/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.2.0
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
 * ImageToTextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T17:00:54.628428+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class ImageToTextRequest {
  /**
   * Originnal file format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    UNKNOWN("Unknown"),
    
    BMP("Bmp"),
    
    JPG("Jpg"),
    
    PNG("Png"),
    
    SVG("Svg"),
    
    GIF("Gif"),
    
    PDF("Pdf");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nullable
  private FormatEnum format = FormatEnum.UNKNOWN;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private String source = "en";

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  @javax.annotation.Nullable
  private List<String> targets = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nullable
  private byte[] _file;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_ROTATE = "rotate";
  @SerializedName(SERIALIZED_NAME_ROTATE)
  @javax.annotation.Nullable
  private Integer rotate;

  public static final String SERIALIZED_NAME_ISHANDWRITTEN = "ishandwritten";
  @SerializedName(SERIALIZED_NAME_ISHANDWRITTEN)
  @javax.annotation.Nullable
  private Boolean ishandwritten;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  @javax.annotation.Nullable
  private String route;

  public ImageToTextRequest() {
  }

  public ImageToTextRequest format(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Originnal file format
   * @return format
   */
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
  }


  public ImageToTextRequest source(@javax.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * Language of original file
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable String source) {
    this.source = source;
  }


  public ImageToTextRequest targets(@javax.annotation.Nullable List<String> targets) {
    this.targets = targets;
    return this;
  }

  public ImageToTextRequest addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * List of target languages
   * @return targets
   */
  @javax.annotation.Nullable
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(@javax.annotation.Nullable List<String> targets) {
    this.targets = targets;
  }


  public ImageToTextRequest _file(@javax.annotation.Nullable byte[] _file) {
    this._file = _file;
    return this;
  }

  /**
   * File for translation
   * @return _file
   */
  @javax.annotation.Nullable
  public byte[] getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nullable byte[] _file) {
    this._file = _file;
  }


  public ImageToTextRequest url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Link to file for translation
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public ImageToTextRequest rotate(@javax.annotation.Nullable Integer rotate) {
    this.rotate = rotate;
    return this;
  }

  /**
   * Left to write angle to rotate scanned image / pdf
   * @return rotate
   */
  @javax.annotation.Nullable
  public Integer getRotate() {
    return rotate;
  }

  public void setRotate(@javax.annotation.Nullable Integer rotate) {
    this.rotate = rotate;
  }


  public ImageToTextRequest ishandwritten(@javax.annotation.Nullable Boolean ishandwritten) {
    this.ishandwritten = ishandwritten;
    return this;
  }

  /**
   * is handwritten text
   * @return ishandwritten
   */
  @javax.annotation.Nullable
  public Boolean getIshandwritten() {
    return ishandwritten;
  }

  public void setIshandwritten(@javax.annotation.Nullable Boolean ishandwritten) {
    this.ishandwritten = ishandwritten;
  }


  public ImageToTextRequest origin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * for analysis only
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
  }


  public ImageToTextRequest route(@javax.annotation.Nullable String route) {
    this.route = route;
    return this;
  }

  /**
   * endpoints route
   * @return route
   */
  @javax.annotation.Nullable
  public String getRoute() {
    return route;
  }

  public void setRoute(@javax.annotation.Nullable String route) {
    this.route = route;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToTextRequest imageToTextRequest = (ImageToTextRequest) o;
    return Objects.equals(this.format, imageToTextRequest.format) &&
        Objects.equals(this.source, imageToTextRequest.source) &&
        Objects.equals(this.targets, imageToTextRequest.targets) &&
        Arrays.equals(this._file, imageToTextRequest._file) &&
        Objects.equals(this.url, imageToTextRequest.url) &&
        Objects.equals(this.rotate, imageToTextRequest.rotate) &&
        Objects.equals(this.ishandwritten, imageToTextRequest.ishandwritten) &&
        Objects.equals(this.origin, imageToTextRequest.origin) &&
        Objects.equals(this.route, imageToTextRequest.route);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, source, targets, Arrays.hashCode(_file), url, rotate, ishandwritten, origin, route);
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
    sb.append("class ImageToTextRequest {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    ishandwritten: ").append(toIndentedString(ishandwritten)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("source");
    openapiFields.add("targets");
    openapiFields.add("file");
    openapiFields.add("url");
    openapiFields.add("rotate");
    openapiFields.add("ishandwritten");
    openapiFields.add("origin");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageToTextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageToTextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageToTextRequest is not found in the empty JSON string", ImageToTextRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageToTextRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageToTextRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targets") != null && !jsonObj.get("targets").isJsonNull() && !jsonObj.get("targets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("route") != null && !jsonObj.get("route").isJsonNull()) && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageToTextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageToTextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageToTextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageToTextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageToTextRequest>() {
           @Override
           public void write(JsonWriter out, ImageToTextRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageToTextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageToTextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageToTextRequest
   * @throws IOException if the JSON string is invalid with respect to ImageToTextRequest
   */
  public static ImageToTextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageToTextRequest.class);
  }

  /**
   * Convert an instance of ImageToTextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

