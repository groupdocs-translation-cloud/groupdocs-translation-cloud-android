/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TranslateApiInvoker.java">
 *   Copyright (c) 2021 GroupDocs.Translation for Cloud
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

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TranslateApiInvoker {

    /**
     * Translate document
     * @Body name, folder, pair, format, storage, saveFile, savePath, masters, elements, separator, codeList, frontLists
     * @return Call<ResponseBody>
     */
    @Headers({"Content-Type:application/json"})
    @POST("translate/document")
    Call<ResponseBody> TranslateFromDocument(
            @Body RequestBody userRequest
    );


    /**
     * Translate plane text
     * @Body pair and text
     * @return Call<ResponseBody>
     */
    @Headers({"Content-Type:application/json"})
    @POST("translate/text")
    Call<ResponseBody> TranslateText(
            @Body RequestBody userRequest
    );

    /**
     * Translate plane text
     * @return Call<ResponseBody>
     */
    @Headers({"Content-Type:application/json"})
    @GET("translate/hc")
    Call<ResponseBody> HealthCheck(
    );
}
