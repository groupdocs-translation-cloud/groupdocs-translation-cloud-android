/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TestHelper.java">
*   Copyright (c) 2020 Aspose.OCR for Cloud
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


package com.groupdocs.storage.android;

import okhttp3.ResponseBody;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestHelper {

    public static boolean saveToDisc(String data, String fileName) {
        try {
            Files.write(Paths.get(Configuration.getTestDstDir()+ "/" + fileName), data.getBytes());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean saveToDisc(ResponseBody body, String fileName){

        File f = null;
        try {
            f = new File(Configuration.getTestDstDir(), fileName);
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }

        try (InputStream inputStream = body.byteStream();
             OutputStream outputStream = new FileOutputStream(f)
        )
        {

            byte[] fileReader = new byte[4096];

            while (true) {
                int read = inputStream.read(fileReader);
                if (read == -1) {
                    break;
                }

                outputStream.write(fileReader, 0, read);
            }

            outputStream.flush();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
