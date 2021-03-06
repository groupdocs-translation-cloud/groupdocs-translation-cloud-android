/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageUnitTest.java">
*   Copyright (c) 2022 Aspose.OCR for Cloud
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

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;
import org.junit.Test;
import static org.junit.Assert.*;

import com.groupdocs.storage.android.api.StorageApi;
import com.groupdocs.storage.android.model.DiscUsage;
import com.groupdocs.storage.android.model.FileVersions;
import com.groupdocs.storage.android.model.FilesList;
import com.groupdocs.storage.android.model.FilesUploadResult;
import com.groupdocs.storage.android.model.ObjectExist;
import com.groupdocs.storage.android.model.StorageExist;
import retrofit2.Call;
import retrofit2.Response;
import java.io.File;
import static java.lang.System.out;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class StorageUnitTest {

    public static StorageApi storageApi;

    public StorageUnitTest() throws Exception {
        //Todo: Setup App_SID & App_Key; You can get them in your Aspose Dashboard https://dashboard.aspose.cloud
        Configuration.setAPP_SID("");
        Configuration.setAPI_KEY("");
        Configuration.setDebug(true);
        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");
        storageApi = new ApiClient().createService(StorageApi.class);

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }

    //File API
    @Test
    public void uploadFile(){

        try {
            File f = new File(StorageApi.class.getResource("/test.txt").toURI());
            RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);
            Call<FilesUploadResult> call = storageApi.uploadFile("OcrTest/test.txt",fileToUpload, null);

            Response<FilesUploadResult> res = call.execute();

            assertTrue(res.isSuccessful());

            FilesUploadResult result = res.body();

            assertTrue(result.getUploaded().size() == 1);
            assertTrue(result.getErrors().size() == 0);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void downloadFile(){

        try {
            // Upload test file
            File f = new File(StorageApi.class.getResource("/testDownload.jpg").toURI());
            RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

            Call<FilesUploadResult> call_create = storageApi.uploadFile("OcrTest/testDownload.jpg",fileToUpload, null);

            Response<FilesUploadResult> res = call_create.execute();
            assertTrue(res.isSuccessful());

            FilesUploadResult result = res.body();
            assertTrue(result.getUploaded().size() == 1);
            assertTrue(result.getErrors().size() == 0);

            Call<ResponseBody> call_download = storageApi.downloadFile("OcrTest/testDownload.jpg", null, null);

            Response<ResponseBody> res1 = call_download.execute();
            assertTrue(res1.isSuccessful());

            ResponseBody res_download = res1.body();
            assertTrue(TestHelper.saveToDisc(res_download,"TestDownloadResult.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void moveFile(){

        try {
            //Upload file
            File f = new File(StorageApi.class.getResource("/test.txt").toURI());
            RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

            Call<FilesUploadResult> call_create = storageApi.uploadFile("OcrTest/test_moving_file.txt", fileToUpload, null);
            Response<FilesUploadResult> res_create = call_create.execute();
            assertTrue(res_create.isSuccessful());

            FilesUploadResult result = res_create.body();
            assertTrue(result.getUploaded().size() == 1);
            assertTrue(result.getErrors().size() == 0);

            // Move file
            Call<Void> call_move = storageApi.moveFile("OcrTest/test_moving_file.txt",
                    "OcrTest/test_moved_file.txt", null, null, null);
            Response<Void> res_move = call_move.execute();
            assertTrue(res_move.isSuccessful());

            // Check if the new file exists
            Call<ObjectExist> call = storageApi.objectExists("OcrTest/test_moved_file.txt", null, null);

            Response<ObjectExist> res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, moved new file not exis",res_exist_body.isExists());
            assertFalse("Error, must be file, not folder", res_exist_body.isFolder());

            // Check if the old file not exists
            call = storageApi.objectExists("OcrTest/test_moving_file.txt",
                    null, null);

            res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, moving old file exist",res_exist_body.isExists());
            assertFalse("Error, must be file, not folder", res_exist_body.isFolder());

        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void deleteFile(){

        try {
            //Create test file
            File f = new File(StorageApi.class.getResource("/test.txt").toURI());
            RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

            Call<FilesUploadResult> call_create = storageApi.uploadFile("OcrTest/test_delete_file.txt",fileToUpload, null);

            Response<FilesUploadResult> res = call_create.execute();
            assertTrue(res.isSuccessful());

            FilesUploadResult result = res.body();
            assertTrue(result.getUploaded().size() == 1);
            assertTrue(result.getErrors().size() == 0);

            // Check if the file exists
            Call<ObjectExist> call = storageApi.objectExists("OcrTest/test_delete_file.txt",
                    null, null);

            Response<ObjectExist> res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, must be exist, not exist",res_exist_body.isExists());
            assertFalse("Error, must be file, not folder", res_exist_body.isFolder());

            //Delete file
            Call<Void> call_response = storageApi.deleteFile("OcrTest/test_delete_file.txt", null,null);

            Response<Void> res2 = call_response.execute();
            assertTrue(res2.isSuccessful());

            // Check if the file not exists
            call = storageApi.objectExists("OcrTest/test_delete_file.txt",
                    null, null);

            res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, file exist after delete",res_exist_body.isExists());
            assertFalse("Error, must be false, file not exist", res_exist_body.isFolder());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    //Folder API
    @Test
    public void getFilesList(){

        try {
            Call<FilesList> call = storageApi.getFilesList("OcrTest", null);
            Response<FilesList> res = call.execute();
            assertTrue(res.isSuccessful());

            FilesList response = res.body();
            assertTrue(TestHelper.saveToDisc(response.toString(),"FileList.json"));

        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void createFolder(){

        try {
            String folderName = "CreateTestFolder";
            Call<Void> call = storageApi.createFolder(folderName,null);

            Response<Void> res = call.execute();
            assertTrue(res.isSuccessful());

            // Check is folder exist
            Call<ObjectExist> call_exist = storageApi.objectExists(folderName,
                    null, null);

            Response<ObjectExist> res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, must be exist folder after creating",res_exist_body.isExists());
            assertTrue("Error, must be folder, not folder", res_exist_body.isFolder());

            //Delete test folder
            Call<Void> call_response = storageApi.deleteFolder(folderName, null, false);
            Response<Void> res1 = call_response.execute();
            assertTrue(res1.isSuccessful());

            //Check deleted folder
            call_exist = storageApi.objectExists(folderName,null, null);

            res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be  not exist folder after deleting", res_exist_body.isExists());
            assertFalse("Error, must be false after deleting folder", res_exist_body.isFolder());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void moveFolder(){

        String movingFolder = "TestMovingFolder";
        String movedFolder = "TestMovedFolder";

        try {
            //Create folder
            Call<Void> call_create = storageApi.createFolder(movingFolder, null);
            Response<Void> res_create = call_create.execute();
            assertTrue(res_create.isSuccessful());

            // Move folder
            Call<Void> call_move = storageApi.moveFolder(movingFolder, movedFolder, "", "");
            Response<Void> res_move = call_move.execute();
            assertTrue(res_move.isSuccessful());

            //Checking is new folder exists.
            Call<ObjectExist> call_exist = storageApi.objectExists(movedFolder,
                    null, null);

            Response<ObjectExist> res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, must be exist new folder after moved",res_exist_body.isExists());
            assertTrue("Error, must be folder after moved", res_exist_body.isFolder());

            //Checking is old folder deleted.
            call_exist = storageApi.objectExists(movingFolder,null, null);

            res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be not exist old folder after moved",res_exist_body.isExists());
            assertFalse("Error, must be false after moved", res_exist_body.isFolder());

            //Delete moved folder
            Call<Void> call_delete = storageApi.deleteFolder(movedFolder, null, true);
            Response<Void> res_delete = call_delete.execute();
            assertTrue(res_delete.isSuccessful());

            //Ensure moved folder is deleted
            call_exist = storageApi.objectExists(movedFolder,null, null);

            res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be not exist new folder after delete",res_exist_body.isExists());
            assertFalse("Error, must be false after delete", res_exist_body.isFolder());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void deleteFolder(){

        try {

            String folderName = "TestDeleteFolder";

            //Create remote folder
            Call<Void> call_create = storageApi.createFolder(folderName,null);

            Response<Void> res = call_create.execute();
            assertTrue(res.isSuccessful());

            //Ensure is folder exist
            Call<ObjectExist> call_exist = storageApi.objectExists(folderName,
                    null, null);

            Response<ObjectExist> res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, must be exist new folder after create",res_exist_body.isExists());
            assertTrue("Error, must be folder after create", res_exist_body.isFolder());

            Call<Void> call_response = storageApi.deleteFolder(folderName, null, true);

            Response<Void> res1 = call_response.execute();
            assertTrue(res.isSuccessful());

            //Ensure is folder deleted
            call_exist = storageApi.objectExists(folderName,null, null);

            res_exist = call_exist.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be not exist new folder after delete",res_exist_body.isExists());
            assertFalse("Error, must be false after delete", res_exist_body.isFolder());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    //Storage API    
    @Test
    public void storageExists(){

        String storageNotExist = "NotExistStorage";
        String storageExist = "/";

        try {
            Call<StorageExist> call = storageApi.storageExists(storageNotExist);
            Response<StorageExist> res = call.execute();
            assertTrue(res.isSuccessful());

            StorageExist result = res.body();
            assertFalse("Stotage not exist, but result is exist", result.isExists());

            //ToDo: Storage not defined
//            call = storageApi.storageExists(storageExist);
//            res = call.execute();
//            assertTrue(res.isSuccessful());

//            result = res.body();
//            assertTrue("Stotage exist, but result is not exist", result.isExists());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void objectExists(){

        String existFile = "OcrTest/test.txt";
        String notExistFile = "OcrTest/fake.txt";
        String existFolder = "OcrTest";
        String notExistFolder = "FakeFolder";

        try {
            // Upload file
            File f = new File(StorageApi.class.getResource("/test.txt").toURI());
            RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);
            Call<FilesUploadResult> call_upload = storageApi.uploadFile("OcrTest/test.txt",fileToUpload, null);

            Response<FilesUploadResult> res = call_upload.execute();

            assertTrue(res.isSuccessful());

            FilesUploadResult result = res.body();

            assertTrue(result.getUploaded().size() == 1);
            assertTrue(result.getErrors().size() == 0);


            // Exist file
            Call<ObjectExist> call = storageApi.objectExists(existFile, null, null);

            Response<ObjectExist> res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            ObjectExist res_exist_body = res_exist.body();
            assertTrue("Error, must be exist ",res_exist_body.isExists());
            assertFalse("Error, must be file, not folder", res_exist_body.isFolder());

            // Not exist file
            call = storageApi.objectExists(notExistFile, null, null);

            res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be not exist ",res_exist_body.isExists());
            assertFalse("Error, must be false for not exist file", res_exist_body.isFolder());

            // Exist folder
            call = storageApi.objectExists(existFolder, null, null);

            res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertTrue("Error, must be exist ",res_exist_body.isExists());
            assertTrue("Error, must be folder", res_exist_body.isFolder());

            // Not exist folder
            call = storageApi.objectExists(notExistFolder, null, null);

            res_exist = call.execute();
            assertTrue(res_exist.isSuccessful());

            res_exist_body = res_exist.body();
            assertFalse("Error, must be not exist ",res_exist_body.isExists());
            assertFalse("Error, must be false for not exist folder", res_exist_body.isFolder());

            // Delete test file
            Call<Void> call_response = storageApi.deleteFile("OcrTest/test.txt", null,null);

            Response<Void> res2 = call_response.execute();
            assertTrue(res2.isSuccessful());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void getDiscUsage(){

        try {
            Call<DiscUsage> call = storageApi.getDiscUsage(null);

            Response<DiscUsage> res = call.execute();
            assertTrue(res.isSuccessful());

            DiscUsage result = res.body();

            assertTrue(result.getUsedSize() > 0);
            assertTrue(result.getTotalSize() > 0);

        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void getFileVersions(){

        try {
            Call<FileVersions> call = storageApi.getFileVersions("OcrTest/test.txt", null);
            Response<FileVersions> res = call.execute();
            assertTrue(res.isSuccessful());

            FileVersions result = res.body();

            assertTrue(TestHelper.saveToDisc(result.toString(),"FileVersions.json"));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }
}
