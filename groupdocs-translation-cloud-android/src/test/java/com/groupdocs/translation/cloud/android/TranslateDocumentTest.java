/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TranslateTextTest.java">
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


package com.groupdocs.translation.cloud.android;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import retrofit2.Call;
import retrofit2.Response;
import com.google.gson.Gson;
import com.groupdocs.translation.cloud.android.api.TranslateApiInvoker;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.System.out;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TranslateDocumentTest extends BaseTest {

    private String request;
    private TranslateApiInvoker api;
    private static final Gson gson = new Gson();

    //Constructor that takes test data.
    public TranslateDocumentTest(
            String request
    ) throws Exception {
        super();
        this.request = request;
    }

    @Before
    public void initialize() {
        api = new ApiClient().createService(TranslateApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]
                {
                        {"'pair': 'en-ru', 'text': 'Test for model and SDK'"}
                });
    }

    @Test
    public void TranslateText() {
        out.println("Test request: " + request);
        try {
            String translationRequestJson = gson.toJson(request);
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), translationRequestJson);
            Call<ResponseBody> call = api.TranslateText(requestBody);
            Response<ResponseBody> res = call.execute();
            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);

            String text = answer.string();
            assertNotNull("Text is empty" + res.toString(), text);

            out.println(text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
