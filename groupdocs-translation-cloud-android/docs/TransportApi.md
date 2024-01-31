# TransportApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/translation*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoPost**](TransportApi.md#autoPost) | **POST** /auto | Translate any supported file |
| [**csvPost**](TransportApi.md#csvPost) | **POST** /csv | Translate CSV and TSV files |
| [**documentPost**](TransportApi.md#documentPost) | **POST** /document | Translate Microsoft Word documents, rtf, txt, odt |
| [**documentRequestIdGet**](TransportApi.md#documentRequestIdGet) | **GET** /document/{requestId} | Return document translation status.  Also return URLs for downloading of translated document if translation was successful |
| [**hcGet**](TransportApi.md#hcGet) | **GET** /hc | Health check for all services. |
| [**htmlPost**](TransportApi.md#htmlPost) | **POST** /html | Translate HTML files |
| [**hugoGet**](TransportApi.md#hugoGet) | **GET** /hugo | Get hugo syntax structure from markdown file |
| [**hugoPost**](TransportApi.md#hugoPost) | **POST** /hugo | Run hugo syntax structure analyzing from markdown file |
| [**imageToFilePost**](TransportApi.md#imageToFilePost) | **POST** /image-to-file | Translate image or scanned pdf and return file |
| [**imageToTextPost**](TransportApi.md#imageToTextPost) | **POST** /image-to-text | Translate text on image or scanned pdf |
| [**languagesGet**](TransportApi.md#languagesGet) | **GET** /languages | Return list of available language pairs |
| [**markdownPost**](TransportApi.md#markdownPost) | **POST** /markdown | Translate Markdown files |
| [**pdfPost**](TransportApi.md#pdfPost) | **POST** /pdf | Translate pdf files |
| [**presentationPost**](TransportApi.md#presentationPost) | **POST** /presentation | Translate Microsoft PowerPoint presentations, odp |
| [**resxPost**](TransportApi.md#resxPost) | **POST** /resx | Translate RESX files |
| [**spreadsheetsPost**](TransportApi.md#spreadsheetsPost) | **POST** /spreadsheets | Translate Microsoft Excel workbooks, ods |
| [**textPost**](TransportApi.md#textPost) | **POST** /text | Translate text |
| [**textRequestIdGet**](TransportApi.md#textRequestIdGet) | **GET** /text/{requestId} | Return text translation status.  Also return translated text if translation was successful |


<a id="autoPost"></a>
# **autoPost**
> StatusResponse autoPost(autoPostRequest)

Translate any supported file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    AutoPostRequest autoPostRequest = new AutoPostRequest(); // AutoPostRequest | 
    try {
      StatusResponse result = apiInstance.autoPost(autoPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#autoPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoPostRequest** | [**AutoPostRequest**](AutoPostRequest.md)|  | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="csvPost"></a>
# **csvPost**
> StatusResponse csvPost(csvFileRequest)

Translate CSV and TSV files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    CsvFileRequest csvFileRequest = new CsvFileRequest(); // CsvFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.csvPost(csvFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#csvPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **csvFileRequest** | [**CsvFileRequest**](CsvFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="documentPost"></a>
# **documentPost**
> StatusResponse documentPost(textDocumentFileRequest)

Translate Microsoft Word documents, rtf, txt, odt

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    TextDocumentFileRequest textDocumentFileRequest = new TextDocumentFileRequest(); // TextDocumentFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.documentPost(textDocumentFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#documentPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textDocumentFileRequest** | [**TextDocumentFileRequest**](TextDocumentFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="documentRequestIdGet"></a>
# **documentRequestIdGet**
> CloudFileResponse documentRequestIdGet(requestId)

Return document translation status.  Also return URLs for downloading of translated document if translation was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/translation/document response
    try {
      CloudFileResponse result = apiInstance.documentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#documentRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| GUID which got from /v3/translation/document response | |

### Return type

[**CloudFileResponse**](CloudFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="hcGet"></a>
# **hcGet**
> HealthCheckStatus hcGet()

Health check for all services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    try {
      HealthCheckStatus result = apiInstance.hcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#hcGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheckStatus**](HealthCheckStatus.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="htmlPost"></a>
# **htmlPost**
> StatusResponse htmlPost(sourceLanguage, targetLanguages, _file, originalFileName, url, origin, savingMode, outputFormat)

Translate HTML files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String sourceLanguage = "en"; // String | Language of original file
    List<String> targetLanguages = Arrays.asList(); // List<String> | List of target languages
    byte[] _file = null; // byte[] | File as byte array
    String originalFileName = "originalFileName_example"; // String | Type in the file name. If null will be as request ID.
    String url = "url_example"; // String | Link to file for translation. Ignore, if \\\"file\\\" property not null
    String origin = "origin_example"; // String | Url or name of application using this SDK. Not required.
    String savingMode = "Files"; // String | Toggle file saving mode for storage.  Is Files by default.
    String outputFormat = "outputFormat_example"; // String | output file format
    try {
      StatusResponse result = apiInstance.htmlPost(sourceLanguage, targetLanguages, _file, originalFileName, url, origin, savingMode, outputFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#htmlPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| Language of original file | [optional] [default to en] |
| **targetLanguages** | [**List&lt;String&gt;**](String.md)| List of target languages | [optional] |
| **_file** | **byte[]**| File as byte array | [optional] |
| **originalFileName** | **String**| Type in the file name. If null will be as request ID. | [optional] |
| **url** | **String**| Link to file for translation. Ignore, if \\\&quot;file\\\&quot; property not null | [optional] |
| **origin** | **String**| Url or name of application using this SDK. Not required. | [optional] |
| **savingMode** | **String**| Toggle file saving mode for storage.  Is Files by default. | [optional] [enum: Files, Archive, Both] |
| **outputFormat** | **String**| output file format | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="hugoGet"></a>
# **hugoGet**
> CloudHugoResponse hugoGet(id)

Get hugo syntax structure from markdown file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String id = "id_example"; // String | id from PostHugo>
    try {
      CloudHugoResponse result = apiInstance.hugoGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#hugoGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id from PostHugo&gt; | [optional] |

### Return type

[**CloudHugoResponse**](CloudHugoResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="hugoPost"></a>
# **hugoPost**
> StatusResponse hugoPost(_file, url)

Run hugo syntax structure analyzing from markdown file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File as byte array
    String url = "url_example"; // String | Link to file for translation
    try {
      StatusResponse result = apiInstance.hugoPost(_file, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#hugoPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| File as byte array | |
| **url** | **String**| Link to file for translation | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="imageToFilePost"></a>
# **imageToFilePost**
> StatusResponse imageToFilePost(ocrFileRequest)

Translate image or scanned pdf and return file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    OcrFileRequest ocrFileRequest = new OcrFileRequest(); // OcrFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.imageToFilePost(ocrFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#imageToFilePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ocrFileRequest** | [**OcrFileRequest**](OcrFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="imageToTextPost"></a>
# **imageToTextPost**
> StatusResponse imageToTextPost(source, targets, format, url, rotate, isHandwritten, origin, route, _file)

Translate text on image or scanned pdf

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String source = "en"; // String | Language of original file
    List<String> targets = Arrays.asList(); // List<String> | List of target languages
    String format = "Unknown"; // String | Originnal file format
    String url = "url_example"; // String | Link to file for translation
    Integer rotate = 56; // Integer | Left to write angle to rotate scanned image / pdf
    Boolean isHandwritten = true; // Boolean | is handwritten text
    String origin = "origin_example"; // String | for analysis only
    String route = "route_example"; // String | endpoints route
    File _file = new File("/path/to/file"); // File | 
    try {
      StatusResponse result = apiInstance.imageToTextPost(source, targets, format, url, rotate, isHandwritten, origin, route, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#imageToTextPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **source** | **String**| Language of original file | [default to en] |
| **targets** | [**List&lt;String&gt;**](String.md)| List of target languages | |
| **format** | **String**| Originnal file format | [optional] [default to Unknown] [enum: Unknown, Bmp, Jpg, Png, Svg, Gif, Pdf] |
| **url** | **String**| Link to file for translation | [optional] |
| **rotate** | **Integer**| Left to write angle to rotate scanned image / pdf | [optional] |
| **isHandwritten** | **Boolean**| is handwritten text | [optional] |
| **origin** | **String**| for analysis only | [optional] |
| **route** | **String**| endpoints route | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="languagesGet"></a>
# **languagesGet**
> List&lt;LanguagePairData&gt; languagesGet()

Return list of available language pairs

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    try {
      List<LanguagePairData> result = apiInstance.languagesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#languagesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LanguagePairData&gt;**](LanguagePairData.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="markdownPost"></a>
# **markdownPost**
> StatusResponse markdownPost(sourceLanguage, targetLanguages, outputFormat, _file, originalFileName, url, origin, savingMode, shortCodeList, frontMatterList)

Translate Markdown files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String sourceLanguage = "en"; // String | Language of original file
    List<String> targetLanguages = Arrays.asList(); // List<String> | List of target languages
    String outputFormat = "outputFormat_example"; // String | output file format
    byte[] _file = null; // byte[] | File as byte array
    String originalFileName = "originalFileName_example"; // String | Type in the file name. If null will be as request ID.
    String url = "url_example"; // String | Link to file for translation. Ignore, if \\\"file\\\" property not null
    String origin = "origin_example"; // String | Url or name of application using this SDK. Not required.
    String savingMode = "Files"; // String | Toggle file saving mode for storage.  Is Files by default.
    Map<String, List<List<String>>> shortCodeList = new HashMap(); // Map<String, List<List<String>>> | Dictionary of short code names and parameters names to translate
    List<List<String>> frontMatterList = Arrays.asList(); // List<List<String>> | List of lists of frontmatter paths
    try {
      StatusResponse result = apiInstance.markdownPost(sourceLanguage, targetLanguages, outputFormat, _file, originalFileName, url, origin, savingMode, shortCodeList, frontMatterList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#markdownPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| Language of original file | [default to en] |
| **targetLanguages** | [**List&lt;String&gt;**](String.md)| List of target languages | |
| **outputFormat** | **String**| output file format | |
| **_file** | **byte[]**| File as byte array | [optional] |
| **originalFileName** | **String**| Type in the file name. If null will be as request ID. | [optional] |
| **url** | **String**| Link to file for translation. Ignore, if \\\&quot;file\\\&quot; property not null | [optional] |
| **origin** | **String**| Url or name of application using this SDK. Not required. | [optional] |
| **savingMode** | **String**| Toggle file saving mode for storage.  Is Files by default. | [optional] [enum: Files, Archive, Both] |
| **shortCodeList** | [**Map&lt;String, List&lt;List&lt;String&gt;&gt;&gt;**](Map.md)| Dictionary of short code names and parameters names to translate | [optional] |
| **frontMatterList** | [**List&lt;List&lt;String&gt;&gt;**](List&lt;String&gt;.md)| List of lists of frontmatter paths | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="pdfPost"></a>
# **pdfPost**
> StatusResponse pdfPost(pdfFileRequest)

Translate pdf files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    PdfFileRequest pdfFileRequest = new PdfFileRequest(); // PdfFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.pdfPost(pdfFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#pdfPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pdfFileRequest** | [**PdfFileRequest**](PdfFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="presentationPost"></a>
# **presentationPost**
> StatusResponse presentationPost(presentationFileRequest)

Translate Microsoft PowerPoint presentations, odp

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    PresentationFileRequest presentationFileRequest = new PresentationFileRequest(); // PresentationFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.presentationPost(presentationFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#presentationPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **presentationFileRequest** | [**PresentationFileRequest**](PresentationFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="resxPost"></a>
# **resxPost**
> StatusResponse resxPost(resxFileRequest)

Translate RESX files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    ResxFileRequest resxFileRequest = new ResxFileRequest(); // ResxFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.resxPost(resxFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#resxPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resxFileRequest** | [**ResxFileRequest**](ResxFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="spreadsheetsPost"></a>
# **spreadsheetsPost**
> StatusResponse spreadsheetsPost(spreadsheetFileRequest)

Translate Microsoft Excel workbooks, ods

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    SpreadsheetFileRequest spreadsheetFileRequest = new SpreadsheetFileRequest(); // SpreadsheetFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.spreadsheetsPost(spreadsheetFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#spreadsheetsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **spreadsheetFileRequest** | [**SpreadsheetFileRequest**](SpreadsheetFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="textPost"></a>
# **textPost**
> StatusResponse textPost(textRequest)

Translate text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.textPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#textPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textRequest** | [**TextRequest**](TextRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="textRequestIdGet"></a>
# **textRequestIdGet**
> CloudTextResponse textRequestIdGet(requestId)

Return text translation status.  Also return translated text if translation was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TransportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TransportApi apiInstance = new TransportApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/translation/text response
    try {
      CloudTextResponse result = apiInstance.textRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransportApi#textRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| GUID which got from /v3/translation/text response | |

### Return type

[**CloudTextResponse**](CloudTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

