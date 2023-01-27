/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TranslateApi.java">
 *   Copyright (c) 2022 GroupDocs.Translation for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */


package com.groupdocs.translation.cloud.android.api;

import com.groupdocs.translation.cloud.android.ApiClient;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * GroupDocs.Translate for Cloud API
 */
public class TranslateApi {
    private static TranslateApiInvoker api = new ApiClient().createService(TranslateApiInvoker.class);
    private static final Gson gson = new Gson();

    public static TranslateDocumentResponse TranslateDocument(TranslateDocumentRequest translationDocumentRequest) throws IOException
    {
        String translationDocumentRequestJson = gson.toJson(translationDocumentRequest.getUserRequest());
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), translationDocumentRequestJson);
        Call<ResponseBody> call = api.TranslateFromDocument(requestBody);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();
        assert answer != null;
        return TranslateDocumentResponse.Deserialize(answer);
    }

    public static TranslateTextResponse TranslateText(TranslateTextRequest translationRequest) throws IOException
    {
        String translationTextRequestJson = gson.toJson(translationRequest.getUserRequest());
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), translationTextRequestJson);
        Call<ResponseBody> call = api.TranslateText(requestBody);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();
        assert answer != null;
        return TranslateTextResponse.Deserialize(answer);
    }

    public static TranslateTextResponse RunHealthCheck() throws IOException {
        Call<ResponseBody> call = api.HealthCheck();
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();
        assert answer != null;
        return TranslateTextResponse.Deserialize(answer);
    }

    public static ParseHugoResponse ParseHugo(ParseHugoRequest hugoRequest) throws IOException
    {
        String parseHugoRequestJson = gson.toJson(hugoRequest.getUserRequest());
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), parseHugoRequestJson);
        Call<ResponseBody> call = api.ParseHugoDocument(requestBody);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();
        assert answer != null;
        return ParseHugoResponse.Deserialize(answer);
    }

}
