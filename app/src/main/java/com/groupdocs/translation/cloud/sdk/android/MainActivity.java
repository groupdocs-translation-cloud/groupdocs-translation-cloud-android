package com.groupdocs.translation.cloud.sdk.android;

import static java.lang.System.out;

import androidx.appcompat.app.AppCompatActivity;

import com.groupdocs.translation.cloud.android.Configuration;
import com.groupdocs.translation.cloud.android.api.TextInfo;
import com.groupdocs.translation.cloud.android.api.TranslateApi;
import com.google.android.material.textfield.TextInputEditText;
import com.groupdocs.translation.cloud.android.api.TranslateTextRequest;
import com.groupdocs.translation.cloud.android.api.TranslateTextResponse;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private void setUpConfig() throws Exception {
        Configuration.setAPP_SID("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX");
        Configuration.setAPI_KEY("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        Configuration.setAuthPath("https://api.groupdocs.cloud/connect/token");
        Configuration.setBasePath("https://api.groupdocs.cloud/v1.0");

        Configuration.setUserAgent("WebKit");

        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }

    private static TranslateApi api;

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
        String pair = "en-fr";
        TextInfo textInfo = new TextInfo(pair, text);
        TranslateTextRequest translationRequest = new TranslateTextRequest(textInfo.toString());
        TranslateTextResponse translateResponse = null;
        try {
            translateResponse = TranslateApi.TranslateText(translationRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mTranslatedTextView.setText(translateResponse.translation);

    }

}