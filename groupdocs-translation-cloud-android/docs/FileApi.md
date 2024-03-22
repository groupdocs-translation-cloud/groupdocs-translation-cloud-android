# FileApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/translation*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileUploadPost**](FileApi.md#fileUploadPost) | **POST** /file/upload |  |


<a id="fileUploadPost"></a>
# **fileUploadPost**
> String fileUploadPost(format, _file)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/translation");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FileApi apiInstance = new FileApi(defaultClient);
    String format = "Unknown"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.fileUploadPost(format, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#fileUploadPost");
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
| **format** | **String**|  | [optional] [enum: Unknown, Doc, Docx, Docm, Xls, Xlsx, Xlsm, Ppt, Pptx, Pptm, Txt, Pdf, Md, Resx, Html, Rtf, Odt, Ods, Odp, Csv, Tsv, Srt] |
| **_file** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

