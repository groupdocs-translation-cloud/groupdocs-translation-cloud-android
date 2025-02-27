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
        TranslationApi translationApi = new TranslationApi(defaultClient);

        TextRequest request = new TextRequest();

        request.setSourceLanguage("en");
        request.addTargetLanguagesItem("nl");
        request.addTextsItem("Text to translate");
        request.setOrigin("");

        try {
            String r = translationApi.textPost(request).getId();
            CloudTextResponse response = translationApi.textRequestIdGet(r);
            if (!response.getStatus().toString().equals("500")) {
                while (true) {
                    response = translationApi.textRequestIdGet(r);
                    if (response.getStatus().toString().equals("200")) {
                        System.out.println(response);
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
        catch(ApiException e){
            System.err.println("Exception when calling TranslationApi#textPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}










