package com.groupdocs.translation.cloud.sdk.android;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.model.CloudTextResponse;
import com.groupdocs.model.TextRequest;

import org.openapitools.client.api.TranslationApi;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static ApiClient defaultClient;
    private static TranslationApi apiInstance;

    private void setUpConfig() throws Exception {
        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        apiInstance = new TranslationApi(defaultClient);

    }

    Button mToTranslateBtn;
    TextView mTranslatedTextView;
    TextInputEditText mTextToTranslateInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        setContentView(R.layout.activity_main);

        try {
            setUpConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }

        mTextToTranslateInputText = findViewById(R.id.text_to_translate_text_input);
        mToTranslateBtn = findViewById(R.id.translate_button);
        mTranslatedTextView = findViewById(R.id.translated_text_view);

        mToTranslateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    translateText(mTextToTranslateInputText.getText().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void translateText(String text)  throws IOException {
        TextRequest request = new TextRequest();
        request.setSourceLanguage("en");
        request.addTargetLanguagesItem("de");
        request.addTextsItem("Text to translate");

        try {
            TranslationApi apiInstance = new TranslationApi(defaultClient);;
            CloudTextResponse cloudTextResponse = apiInstance.textRequestIdGet(apiInstance.textPost(request).getId());
            System.out.println(cloudTextResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranslationApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    }

}