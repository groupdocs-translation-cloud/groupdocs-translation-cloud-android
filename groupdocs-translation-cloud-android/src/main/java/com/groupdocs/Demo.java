package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.TranslationApi;

public class Demo {
    public static void main(String[] args) {
        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);


        TranslationApi apiInstance = new TranslationApi(defaultClient);
//        FileRequest fileRequest = new FileRequest(); // FileRequest | String in body of request, containing JSON with parameters for translation.

        TextRequest request = new TextRequest();
        request.setSourceLanguage("en");
        request.addTargetLanguagesItem("de");
        request.addTextsItem("Text to translate");

        try {
            CloudTextResponse cloudTextResponse = apiInstance.textRequestIdGet(apiInstance.textPost(request).getId());
            System.out.println(cloudTextResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranslationApi#autoPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}


