/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TranslationTextResponse.java">
 *   Copyright (c) 2020 GroupDocs.Translation for Cloud
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Serializable;
import okhttp3.ResponseBody;

public class TranslateTextResponse implements Serializable {
    public String status;
    public String message;
    public  String translation;

    public TranslateTextResponse(String status, String message, String translation) {
        this.status = status;
        this.message = message;
        this.translation = translation;
    }

    public TranslateTextResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static TranslateTextResponse Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static TranslateTextResponse Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, TranslateTextResponse.class);
    }

    @Override
    public String toString() {
        return "TranslationTextResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
