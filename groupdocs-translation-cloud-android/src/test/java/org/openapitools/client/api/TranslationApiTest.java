/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.2.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.groupdocs.ApiException;
import com.groupdocs.model.CloudFileResponse;
import com.groupdocs.model.CloudFileResponseWithAdditionalInfo;
import com.groupdocs.model.CloudHugoResponse;
import com.groupdocs.model.CloudTextResponse;
import com.groupdocs.model.CsvFileRequest;
import com.groupdocs.model.FileRequest;
import com.groupdocs.model.HealthCheckStatus;
import com.groupdocs.model.HtmlFileRequest;
import com.groupdocs.model.HugoRequest;
import com.groupdocs.model.ImageToFileRequest;
import com.groupdocs.model.ImageToTextRequest;
import com.groupdocs.model.LanguagePairData;
import com.groupdocs.model.MarkdownFileRequest;
import com.groupdocs.model.MediaToFileRequest;
import com.groupdocs.model.MediaToTextRequest;
import com.groupdocs.model.PdfFileRequest;
import com.groupdocs.model.PresentationFileRequest;
import com.groupdocs.model.SpreadsheetFileRequest;
import com.groupdocs.model.SrtFileRequest;
import com.groupdocs.model.StatusResponse;
import com.groupdocs.model.TextDocumentFileRequest;
import com.groupdocs.model.TextRequest;
import com.groupdocs.model.XmlFileRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranslationApi
 */
@Disabled
public class TranslationApiTest {

    private final TranslationApi api = new TranslationApi();

    /**
     * Translate any supported file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void autoPostTest() throws ApiException {
        FileRequest fileRequest = null;
        StatusResponse response = api.autoPost(fileRequest);
        // TODO: test validations
    }

    /**
     * Translate CSV and TSV files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void csvPostTest() throws ApiException {
        CsvFileRequest csvFileRequest = null;
        StatusResponse response = api.csvPost(csvFileRequest);
        // TODO: test validations
    }

    /**
     * Translate Microsoft Word documents, rtf, txt, odt
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentPostTest() throws ApiException {
        TextDocumentFileRequest textDocumentFileRequest = null;
        StatusResponse response = api.documentPost(textDocumentFileRequest);
        // TODO: test validations
    }

    /**
     * Return document translation status.  Also return URLs for downloading of translated document if translation was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentRequestIdGetTest() throws ApiException {
        String requestId = null;
        CloudFileResponse response = api.documentRequestIdGet(requestId);
        // TODO: test validations
    }

    /**
     * Return document translation status for trial request.  Also return URLs for downloading of translated document if translation was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentTrialGetTest() throws ApiException {
        String requestId = null;
        CloudFileResponse response = api.documentTrialGet(requestId);
        // TODO: test validations
    }

    /**
     * Trial translate Microsoft Word documents, rtf, txt, odt without conversation. Translate only first page or 1000 symbols.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentTrialPostTest() throws ApiException {
        TextDocumentFileRequest textDocumentFileRequest = null;
        StatusResponse response = api.documentTrialPost(textDocumentFileRequest);
        // TODO: test validations
    }

    /**
     * Health check for all services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hcGetTest() throws ApiException {
        HealthCheckStatus response = api.hcGet();
        // TODO: test validations
    }

    /**
     * Translate HTML files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void htmlPostTest() throws ApiException {
        HtmlFileRequest htmlFileRequest = null;
        StatusResponse response = api.htmlPost(htmlFileRequest);
        // TODO: test validations
    }

    /**
     * Get hugo syntax structure from markdown file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hugoGetTest() throws ApiException {
        String id = null;
        CloudHugoResponse response = api.hugoGet(id);
        // TODO: test validations
    }

    /**
     * Run hugo syntax structure analyzing from markdown file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hugoPostTest() throws ApiException {
        HugoRequest hugoRequest = null;
        StatusResponse response = api.hugoPost(hugoRequest);
        // TODO: test validations
    }

    /**
     * Translate image or scanned pdf and return file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageToFilePostTest() throws ApiException {
        ImageToFileRequest imageToFileRequest = null;
        StatusResponse response = api.imageToFilePost(imageToFileRequest);
        // TODO: test validations
    }

    /**
     * Translate text on image or scanned pdf
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void imageToTextPostTest() throws ApiException {
        ImageToTextRequest imageToTextRequest = null;
        StatusResponse response = api.imageToTextPost(imageToTextRequest);
        // TODO: test validations
    }

    /**
     * Return list of available language pairs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void languagesGetTest() throws ApiException {
        List<LanguagePairData> response = api.languagesGet();
        // TODO: test validations
    }

    /**
     * Translate Markdown files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markdownPostTest() throws ApiException {
        MarkdownFileRequest markdownFileRequest = null;
        StatusResponse response = api.markdownPost(markdownFileRequest);
        // TODO: test validations
    }

    /**
     * Translate audio or video and return file as a result
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mediaToFilePostTest() throws ApiException {
        MediaToFileRequest mediaToFileRequest = null;
        StatusResponse response = api.mediaToFilePost(mediaToFileRequest);
        // TODO: test validations
    }

    /**
     * Translate audio or video and return text as a result
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mediaToTextPostTest() throws ApiException {
        MediaToTextRequest mediaToTextRequest = null;
        StatusResponse response = api.mediaToTextPost(mediaToTextRequest);
        // TODO: test validations
    }

    /**
     * Translate pdf files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pdfPostTest() throws ApiException {
        PdfFileRequest pdfFileRequest = null;
        StatusResponse response = api.pdfPost(pdfFileRequest);
        // TODO: test validations
    }

    /**
     * Trial pdf translation. Translate only first page without conversion to another format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pdfTrialPostTest() throws ApiException {
        PdfFileRequest pdfFileRequest = null;
        StatusResponse response = api.pdfTrialPost(pdfFileRequest);
        // TODO: test validations
    }

    /**
     * Translate Microsoft PowerPoint presentations, odp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void presentationPostTest() throws ApiException {
        PresentationFileRequest presentationFileRequest = null;
        StatusResponse response = api.presentationPost(presentationFileRequest);
        // TODO: test validations
    }

    /**
     * Translate Resx files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resxPostTest() throws ApiException {
        SrtFileRequest srtFileRequest = null;
        StatusResponse response = api.resxPost(srtFileRequest);
        // TODO: test validations
    }

    /**
     * Translate Microsoft Excel workbooks, ods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spreadsheetPostTest() throws ApiException {
        SpreadsheetFileRequest spreadsheetFileRequest = null;
        StatusResponse response = api.spreadsheetPost(spreadsheetFileRequest);
        // TODO: test validations
    }

    /**
     * Translate Srt files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void srtPostTest() throws ApiException {
        SrtFileRequest srtFileRequest = null;
        StatusResponse response = api.srtPost(srtFileRequest);
        // TODO: test validations
    }

    /**
     * Summarize and translate document file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeDocumentPostTest() throws ApiException {
        FileRequest fileRequest = null;
        StatusResponse response = api.summarizeDocumentPost(fileRequest);
        // TODO: test validations
    }

    /**
     * Summarize and translate image or scanned pdf and return file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeImagePostTest() throws ApiException {
        ImageToFileRequest imageToFileRequest = null;
        StatusResponse response = api.summarizeImagePost(imageToFileRequest);
        // TODO: test validations
    }

    /**
     * Summarize audio or video, translate it  and return file as a result
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeMediaPostTest() throws ApiException {
        MediaToFileRequest mediaToFileRequest = null;
        StatusResponse response = api.summarizeMediaPost(mediaToFileRequest);
        // TODO: test validations
    }

    /**
     * Summarize and translate text
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeTextPostTest() throws ApiException {
        TextRequest textRequest = null;
        StatusResponse response = api.summarizeTextPost(textRequest);
        // TODO: test validations
    }

    /**
     * Translate medical
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textMedicalPostTest() throws ApiException {
        TextRequest textRequest = null;
        StatusResponse response = api.textMedicalPost(textRequest);
        // TODO: test validations
    }

    /**
     * Translate text
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textPostTest() throws ApiException {
        TextRequest textRequest = null;
        StatusResponse response = api.textPost(textRequest);
        // TODO: test validations
    }

    /**
     * Return text translation status.  Also return translated text if translation was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textRequestIdGetTest() throws ApiException {
        String requestId = null;
        CloudTextResponse response = api.textRequestIdGet(requestId);
        // TODO: test validations
    }

    /**
     * Translate slang
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textSlangPostTest() throws ApiException {
        TextRequest textRequest = null;
        StatusResponse response = api.textSlangPost(textRequest);
        // TODO: test validations
    }

    /**
     * Return text translation status for trial requests.  Also return translated text if translation was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textTrialGetTest() throws ApiException {
        String requestId = null;
        CloudTextResponse response = api.textTrialGet(requestId);
        // TODO: test validations
    }

    /**
     * Trial translate text. Translate only 1000 symbols.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void textTrialPostTest() throws ApiException {
        TextRequest textRequest = null;
        StatusResponse response = api.textTrialPost(textRequest);
        // TODO: test validations
    }

    /**
     * Translate XML files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void xmlPostTest() throws ApiException {
        XmlFileRequest xmlFileRequest = null;
        StatusResponse response = api.xmlPost(xmlFileRequest);
        // TODO: test validations
    }

}
