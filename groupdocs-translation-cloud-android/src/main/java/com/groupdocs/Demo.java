package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.TransportApi;

public class Demo {
    public static void main(String[] args) {
        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        TransportApi apiInstance = new TransportApi(defaultClient);


        TextRequest request = new TextRequest();
        request.setSourceLanguage("en");
        request.addTargetLanguagesItem("de");
        request.addTextsItem("Text to translate");


        try {
            String r = apiInstance.textPost(request).getId();
            CloudTextResponse cloudTextResponse = apiInstance.textRequestIdGet(r);
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


