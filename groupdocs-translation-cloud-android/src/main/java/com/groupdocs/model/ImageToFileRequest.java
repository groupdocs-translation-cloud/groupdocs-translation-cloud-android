/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 23.9.4
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * ImageToFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T03:38:55.560817+03:00[Europe/Moscow]")
public class ImageToFileRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  private String sourceLanguage = "en";

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "targetLanguages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  private List<String> targetLanguages = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private byte[] _file;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE_NAME = "originalFileName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE_NAME)
  private String originalFileName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
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
  private SavingModeEnum savingMode;

  /**
   * Original file format
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
  private FormatEnum format = FormatEnum.UNKNOWN;

  /**
   * File format after recognition
   */
  @JsonAdapter(OcrformatEnum.Adapter.class)
  public enum OcrformatEnum {
    PDF("Pdf"),
    
    XLSX("Xlsx"),
    
    CSV("Csv");

    private String value;

    OcrformatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OcrformatEnum fromValue(String value) {
      for (OcrformatEnum b : OcrformatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OcrformatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OcrformatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OcrformatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OcrformatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OcrformatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OCRFORMAT = "ocrformat";
  @SerializedName(SERIALIZED_NAME_OCRFORMAT)
  private OcrformatEnum ocrformat = OcrformatEnum.PDF;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "outputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private String outputFormat;

  public static final String SERIALIZED_NAME_ROTATION_ANGLE = "rotationAngle";
  @SerializedName(SERIALIZED_NAME_ROTATION_ANGLE)
  private Integer rotationAngle;

  public static final String SERIALIZED_NAME_FORMATTING = "formatting";
  @SerializedName(SERIALIZED_NAME_FORMATTING)
  private Boolean formatting = true;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private List<Integer> pages;

  public ImageToFileRequest() {
  }

  public ImageToFileRequest sourceLanguage(String sourceLanguage) {
    
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Language of original file
   * @return sourceLanguage
  **/
  @javax.annotation.Nonnull
  public String getSourceLanguage() {
    return sourceLanguage;
  }


  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public ImageToFileRequest targetLanguages(List<String> targetLanguages) {
    
    this.targetLanguages = targetLanguages;
    return this;
  }

  public ImageToFileRequest addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

   /**
   * List of target languages
   * @return targetLanguages
  **/
  @javax.annotation.Nonnull
  public List<String> getTargetLanguages() {
    return targetLanguages;
  }


  public void setTargetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public ImageToFileRequest _file(byte[] _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * File as byte array
   * @return _file
  **/
  @javax.annotation.Nullable
  public byte[] getFile() {
    return _file;
  }


  public void setFile(byte[] _file) {
    this._file = _file;
  }


  public ImageToFileRequest originalFileName(String originalFileName) {
    
    this.originalFileName = originalFileName;
    return this;
  }

   /**
   * Type in the file name. If null will be as request ID.
   * @return originalFileName
  **/
  @javax.annotation.Nullable
  public String getOriginalFileName() {
    return originalFileName;
  }


  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }


  public ImageToFileRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Link to file for translation. Ignore, if \&quot;file\&quot; property not null
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ImageToFileRequest origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Url or name of application using this SDK. Not required.
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public ImageToFileRequest savingMode(SavingModeEnum savingMode) {
    
    this.savingMode = savingMode;
    return this;
  }

   /**
   * Toggle file saving mode for storage.  Is Files by default.
   * @return savingMode
  **/
  @javax.annotation.Nullable
  public SavingModeEnum getSavingMode() {
    return savingMode;
  }


  public void setSavingMode(SavingModeEnum savingMode) {
    this.savingMode = savingMode;
  }


  public ImageToFileRequest format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Original file format
   * @return format
  **/
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public ImageToFileRequest ocrformat(OcrformatEnum ocrformat) {
    
    this.ocrformat = ocrformat;
    return this;
  }

   /**
   * File format after recognition
   * @return ocrformat
  **/
  @javax.annotation.Nonnull
  public OcrformatEnum getOcrformat() {
    return ocrformat;
  }


  public void setOcrformat(OcrformatEnum ocrformat) {
    this.ocrformat = ocrformat;
  }


  public ImageToFileRequest outputFormat(String outputFormat) {
    
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * output file format
   * @return outputFormat
  **/
  @javax.annotation.Nonnull
  public String getOutputFormat() {
    return outputFormat;
  }


  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public ImageToFileRequest rotationAngle(Integer rotationAngle) {
    
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Left to write angle to rotate scanned image / pdf
   * @return rotationAngle
  **/
  @javax.annotation.Nullable
  public Integer getRotationAngle() {
    return rotationAngle;
  }


  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }


  public ImageToFileRequest formatting(Boolean formatting) {
    
    this.formatting = formatting;
    return this;
  }

   /**
   * If document&#39;s formatting should be preserved, default true
   * @return formatting
  **/
  @javax.annotation.Nullable
  public Boolean getFormatting() {
    return formatting;
  }


  public void setFormatting(Boolean formatting) {
    this.formatting = formatting;
  }


  public ImageToFileRequest route(String route) {
    
    this.route = route;
    return this;
  }

   /**
   * endpoints route
   * @return route
  **/
  @javax.annotation.Nullable
  public String getRoute() {
    return route;
  }


  public void setRoute(String route) {
    this.route = route;
  }


  public ImageToFileRequest pages(List<Integer> pages) {
    
    this.pages = pages;
    return this;
  }

  public ImageToFileRequest addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * List of pages to translate for scanned pdf
   * @return pages
  **/
  @javax.annotation.Nullable
  public List<Integer> getPages() {
    return pages;
  }


  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToFileRequest imageToFileRequest = (ImageToFileRequest) o;
    return Objects.equals(this.sourceLanguage, imageToFileRequest.sourceLanguage) &&
        Objects.equals(this.targetLanguages, imageToFileRequest.targetLanguages) &&
        Arrays.equals(this._file, imageToFileRequest._file) &&
        Objects.equals(this.originalFileName, imageToFileRequest.originalFileName) &&
        Objects.equals(this.url, imageToFileRequest.url) &&
        Objects.equals(this.origin, imageToFileRequest.origin) &&
        Objects.equals(this.savingMode, imageToFileRequest.savingMode) &&
        Objects.equals(this.format, imageToFileRequest.format) &&
        Objects.equals(this.ocrformat, imageToFileRequest.ocrformat) &&
        Objects.equals(this.outputFormat, imageToFileRequest.outputFormat) &&
        Objects.equals(this.rotationAngle, imageToFileRequest.rotationAngle) &&
        Objects.equals(this.formatting, imageToFileRequest.formatting) &&
        Objects.equals(this.route, imageToFileRequest.route) &&
        Objects.equals(this.pages, imageToFileRequest.pages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLanguage, targetLanguages, Arrays.hashCode(_file), originalFileName, url, origin, savingMode, format, ocrformat, outputFormat, rotationAngle, formatting, route, pages);
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
    sb.append("class ImageToFileRequest {\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    ocrformat: ").append(toIndentedString(ocrformat)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("ocrformat");
    openapiFields.add("outputFormat");
    openapiFields.add("rotationAngle");
    openapiFields.add("formatting");
    openapiFields.add("route");
    openapiFields.add("pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sourceLanguage");
    openapiRequiredFields.add("targetLanguages");
    openapiRequiredFields.add("ocrformat");
    openapiRequiredFields.add("outputFormat");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ImageToFileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageToFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageToFileRequest is not found in the empty JSON string", ImageToFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageToFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageToFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImageToFileRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      if (!jsonObj.get("ocrformat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocrformat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ocrformat").toString()));
      }
      // validate the required field `ocrformat`
      OcrformatEnum.validateJsonElement(jsonObj.get("ocrformat"));
      if (!jsonObj.get("outputFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputFormat").toString()));
      }
      if ((jsonObj.get("route") != null && !jsonObj.get("route").isJsonNull()) && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pages") != null && !jsonObj.get("pages").isJsonNull() && !jsonObj.get("pages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pages` to be an array in the JSON string but got `%s`", jsonObj.get("pages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageToFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageToFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageToFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageToFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageToFileRequest>() {
           @Override
           public void write(JsonWriter out, ImageToFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageToFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImageToFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImageToFileRequest
  * @throws IOException if the JSON string is invalid with respect to ImageToFileRequest
  */
  public static ImageToFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageToFileRequest.class);
  }

 /**
  * Convert an instance of ImageToFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

