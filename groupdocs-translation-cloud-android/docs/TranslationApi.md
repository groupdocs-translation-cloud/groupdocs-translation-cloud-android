# TranslationApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/translation*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoPost**](TranslationApi.md#autoPost) | **POST** /auto | Translate any supported file |
| [**csvPost**](TranslationApi.md#csvPost) | **POST** /csv | Translate CSV and TSV files |
| [**documentPost**](TranslationApi.md#documentPost) | **POST** /document | Translate Microsoft Word documents, rtf, txt, odt |
| [**documentRequestIdGet**](TranslationApi.md#documentRequestIdGet) | **GET** /document/{requestId} | Return document translation status.  Also return URLs for downloading of translated document if translation was successful |
| [**documentTrialGet**](TranslationApi.md#documentTrialGet) | **GET** /document/trial | Return document translation status for trial request.  Also return URLs for downloading of translated document if translation was successful |
| [**documentTrialPost**](TranslationApi.md#documentTrialPost) | **POST** /document/trial | Trial translate Microsoft Word documents, rtf, txt, odt without conversation. Translate only first page or 1000 symbols. |
| [**hcGet**](TranslationApi.md#hcGet) | **GET** /hc | Health check for all services. |
| [**htmlPost**](TranslationApi.md#htmlPost) | **POST** /html | Translate HTML files |
| [**hugoGet**](TranslationApi.md#hugoGet) | **GET** /hugo | Get hugo syntax structure from markdown file |
| [**hugoPost**](TranslationApi.md#hugoPost) | **POST** /hugo | Run hugo syntax structure analyzing from markdown file |
| [**imageToFilePost**](TranslationApi.md#imageToFilePost) | **POST** /image-to-file | Translate image or scanned pdf and return file |
| [**imageToTextPost**](TranslationApi.md#imageToTextPost) | **POST** /image-to-text | Translate text on image or scanned pdf |
| [**languagesGet**](TranslationApi.md#languagesGet) | **GET** /languages | Return list of available language pairs |
| [**markdownPost**](TranslationApi.md#markdownPost) | **POST** /markdown | Translate Markdown files |
| [**mediaToFilePost**](TranslationApi.md#mediaToFilePost) | **POST** /media-to-file | Translate audio or video and return file as a result |
| [**mediaToTextPost**](TranslationApi.md#mediaToTextPost) | **POST** /media-to-text | Translate audio or video and return text as a result |
| [**pdfPost**](TranslationApi.md#pdfPost) | **POST** /pdf | Translate pdf files |
| [**pdfTrialPost**](TranslationApi.md#pdfTrialPost) | **POST** /pdf/trial | Trial pdf translation. Translate only first page without conversion to another format. |
| [**presentationPost**](TranslationApi.md#presentationPost) | **POST** /presentation | Translate Microsoft PowerPoint presentations, odp |
| [**resxPost**](TranslationApi.md#resxPost) | **POST** /resx | Translate Resx files |
| [**spreadsheetPost**](TranslationApi.md#spreadsheetPost) | **POST** /spreadsheet | Translate Microsoft Excel workbooks, ods |
| [**srtPost**](TranslationApi.md#srtPost) | **POST** /srt | Translate Srt files |
| [**summarizeDocumentPost**](TranslationApi.md#summarizeDocumentPost) | **POST** /summarize-document | Summarize and translate document file |
| [**summarizeImagePost**](TranslationApi.md#summarizeImagePost) | **POST** /summarize-image | Summarize and translate image or scanned pdf and return file |
| [**summarizeMediaPost**](TranslationApi.md#summarizeMediaPost) | **POST** /summarize-media | Summarize audio or video, translate it  and return file as a result |
| [**summarizeTextPost**](TranslationApi.md#summarizeTextPost) | **POST** /summarize-text | Summarize and translate text |
| [**textMedicalPost**](TranslationApi.md#textMedicalPost) | **POST** /text/medical | Translate medical |
| [**textPost**](TranslationApi.md#textPost) | **POST** /text | Translate text |
| [**textRequestIdGet**](TranslationApi.md#textRequestIdGet) | **GET** /text/{requestId} | Return text translation status.  Also return translated text if translation was successful |
| [**textSlangPost**](TranslationApi.md#textSlangPost) | **POST** /text/slang | Translate slang |
| [**textTrialGet**](TranslationApi.md#textTrialGet) | **GET** /text/trial | Return text translation status for trial requests.  Also return translated text if translation was successful |
| [**textTrialPost**](TranslationApi.md#textTrialPost) | **POST** /text/trial | Trial translate text. Translate only 1000 symbols. |
| [**xmlPost**](TranslationApi.md#xmlPost) | **POST** /xml | Translate XML files |


<a id="autoPost"></a>
# **autoPost**
> StatusResponse autoPost(fileRequest)

Translate any supported file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    FileRequest fileRequest = new FileRequest(); // FileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.autoPost(fileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#autoPost");
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
| **fileRequest** | [**FileRequest**](FileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    CsvFileRequest csvFileRequest = new CsvFileRequest(); // CsvFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.csvPost(csvFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#csvPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextDocumentFileRequest textDocumentFileRequest = new TextDocumentFileRequest(); // TextDocumentFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.documentPost(textDocumentFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#documentPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /translation/document response
    try {
      CloudFileResponse result = apiInstance.documentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#documentRequestIdGet");
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
| **requestId** | **String**| GUID which got from /translation/document response | |

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
| **102** | Information |  -  |
| **202** | Accepted |  -  |
| **404** | Not Found |  -  |
| **206** | Success |  -  |

<a id="documentTrialGet"></a>
# **documentTrialGet**
> CloudFileResponse documentTrialGet(requestId)

Return document translation status for trial request.  Also return URLs for downloading of translated document if translation was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/translation/document response
    try {
      CloudFileResponse result = apiInstance.documentTrialGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#documentTrialGet");
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
| **requestId** | **String**| GUID which got from /v3/translation/document response | [optional] |

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

<a id="documentTrialPost"></a>
# **documentTrialPost**
> StatusResponse documentTrialPost(textDocumentFileRequest)

Trial translate Microsoft Word documents, rtf, txt, odt without conversation. Translate only first page or 1000 symbols.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextDocumentFileRequest textDocumentFileRequest = new TextDocumentFileRequest(); // TextDocumentFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.documentTrialPost(textDocumentFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#documentTrialPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    try {
      HealthCheckStatus result = apiInstance.hcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#hcGet");
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
> StatusResponse htmlPost(htmlFileRequest)

Translate HTML files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    HtmlFileRequest htmlFileRequest = new HtmlFileRequest(); // HtmlFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.htmlPost(htmlFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#htmlPost");
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
| **htmlFileRequest** | [**HtmlFileRequest**](HtmlFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    String id = "id_example"; // String | id from PostHugo>
    try {
      CloudHugoResponse result = apiInstance.hugoGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#hugoGet");
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
> StatusResponse hugoPost(hugoRequest)

Run hugo syntax structure analyzing from markdown file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    HugoRequest hugoRequest = new HugoRequest(); // HugoRequest | 
    try {
      StatusResponse result = apiInstance.hugoPost(hugoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#hugoPost");
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
| **hugoRequest** | [**HugoRequest**](HugoRequest.md)|  | [optional] |

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
| **202** | Accepted |  -  |

<a id="imageToFilePost"></a>
# **imageToFilePost**
> StatusResponse imageToFilePost(imageToFileRequest)

Translate image or scanned pdf and return file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    ImageToFileRequest imageToFileRequest = new ImageToFileRequest(); // ImageToFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.imageToFilePost(imageToFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#imageToFilePost");
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
| **imageToFileRequest** | [**ImageToFileRequest**](ImageToFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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
> StatusResponse imageToTextPost(imageToTextRequest)

Translate text on image or scanned pdf

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    ImageToTextRequest imageToTextRequest = new ImageToTextRequest(); // ImageToTextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.imageToTextPost(imageToTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#imageToTextPost");
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
| **imageToTextRequest** | [**ImageToTextRequest**](ImageToTextRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    try {
      List<LanguagePairData> result = apiInstance.languagesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#languagesGet");
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
> StatusResponse markdownPost(markdownFileRequest)

Translate Markdown files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    MarkdownFileRequest markdownFileRequest = new MarkdownFileRequest(); // MarkdownFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.markdownPost(markdownFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#markdownPost");
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
| **markdownFileRequest** | [**MarkdownFileRequest**](MarkdownFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="mediaToFilePost"></a>
# **mediaToFilePost**
> StatusResponse mediaToFilePost(mediaToFileRequest)

Translate audio or video and return file as a result

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    MediaToFileRequest mediaToFileRequest = new MediaToFileRequest(); // MediaToFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.mediaToFilePost(mediaToFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#mediaToFilePost");
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
| **mediaToFileRequest** | [**MediaToFileRequest**](MediaToFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="mediaToTextPost"></a>
# **mediaToTextPost**
> StatusResponse mediaToTextPost(mediaToTextRequest)

Translate audio or video and return text as a result

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    MediaToTextRequest mediaToTextRequest = new MediaToTextRequest(); // MediaToTextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.mediaToTextPost(mediaToTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#mediaToTextPost");
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
| **mediaToTextRequest** | [**MediaToTextRequest**](MediaToTextRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    PdfFileRequest pdfFileRequest = new PdfFileRequest(); // PdfFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.pdfPost(pdfFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#pdfPost");
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

<a id="pdfTrialPost"></a>
# **pdfTrialPost**
> StatusResponse pdfTrialPost(pdfFileRequest)

Trial pdf translation. Translate only first page without conversion to another format.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    PdfFileRequest pdfFileRequest = new PdfFileRequest(); // PdfFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.pdfTrialPost(pdfFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#pdfTrialPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    PresentationFileRequest presentationFileRequest = new PresentationFileRequest(); // PresentationFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.presentationPost(presentationFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#presentationPost");
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
> StatusResponse resxPost(srtFileRequest)

Translate Resx files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    SrtFileRequest srtFileRequest = new SrtFileRequest(); // SrtFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.resxPost(srtFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#resxPost");
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
| **srtFileRequest** | [**SrtFileRequest**](SrtFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="spreadsheetPost"></a>
# **spreadsheetPost**
> StatusResponse spreadsheetPost(spreadsheetFileRequest)

Translate Microsoft Excel workbooks, ods

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    SpreadsheetFileRequest spreadsheetFileRequest = new SpreadsheetFileRequest(); // SpreadsheetFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.spreadsheetPost(spreadsheetFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#spreadsheetPost");
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

<a id="srtPost"></a>
# **srtPost**
> StatusResponse srtPost(srtFileRequest)

Translate Srt files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    SrtFileRequest srtFileRequest = new SrtFileRequest(); // SrtFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.srtPost(srtFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#srtPost");
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
| **srtFileRequest** | [**SrtFileRequest**](SrtFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="summarizeDocumentPost"></a>
# **summarizeDocumentPost**
> StatusResponse summarizeDocumentPost(fileRequest)

Summarize and translate document file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    FileRequest fileRequest = new FileRequest(); // FileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.summarizeDocumentPost(fileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#summarizeDocumentPost");
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
| **fileRequest** | [**FileRequest**](FileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="summarizeImagePost"></a>
# **summarizeImagePost**
> StatusResponse summarizeImagePost(imageToFileRequest)

Summarize and translate image or scanned pdf and return file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    ImageToFileRequest imageToFileRequest = new ImageToFileRequest(); // ImageToFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.summarizeImagePost(imageToFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#summarizeImagePost");
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
| **imageToFileRequest** | [**ImageToFileRequest**](ImageToFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="summarizeMediaPost"></a>
# **summarizeMediaPost**
> StatusResponse summarizeMediaPost(mediaToFileRequest)

Summarize audio or video, translate it  and return file as a result

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    MediaToFileRequest mediaToFileRequest = new MediaToFileRequest(); // MediaToFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.summarizeMediaPost(mediaToFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#summarizeMediaPost");
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
| **mediaToFileRequest** | [**MediaToFileRequest**](MediaToFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

<a id="summarizeTextPost"></a>
# **summarizeTextPost**
> StatusResponse summarizeTextPost(textRequest)

Summarize and translate text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.summarizeTextPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#summarizeTextPost");
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

<a id="textMedicalPost"></a>
# **textMedicalPost**
> StatusResponse textMedicalPost(textRequest)

Translate medical

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.textMedicalPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textMedicalPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.textPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textPost");
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
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/translation/text response
    try {
      CloudTextResponse result = apiInstance.textRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textRequestIdGet");
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
| **202** | Accepted |  -  |

<a id="textSlangPost"></a>
# **textSlangPost**
> StatusResponse textSlangPost(textRequest)

Translate slang

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.textSlangPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textSlangPost");
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

<a id="textTrialGet"></a>
# **textTrialGet**
> CloudTextResponse textTrialGet(requestId)

Return text translation status for trial requests.  Also return translated text if translation was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/translation/text response
    try {
      CloudTextResponse result = apiInstance.textTrialGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textTrialGet");
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
| **requestId** | **String**| GUID which got from /v3/translation/text response | [optional] |

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

<a id="textTrialPost"></a>
# **textTrialPost**
> StatusResponse textTrialPost(textRequest)

Trial translate text. Translate only 1000 symbols.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TextRequest textRequest = new TextRequest(); // TextRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.textTrialPost(textRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#textTrialPost");
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

<a id="xmlPost"></a>
# **xmlPost**
> StatusResponse xmlPost(xmlFileRequest)

Translate XML files

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    XmlFileRequest xmlFileRequest = new XmlFileRequest(); // XmlFileRequest | String in body of request, containing JSON with parameters for translation.
    try {
      StatusResponse result = apiInstance.xmlPost(xmlFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#xmlPost");
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
| **xmlFileRequest** | [**XmlFileRequest**](XmlFileRequest.md)| String in body of request, containing JSON with parameters for translation. | [optional] |

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

