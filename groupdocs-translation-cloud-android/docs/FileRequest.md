

# FileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  [optional] |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  [optional] |
|**_file** | **byte[]** | File as byte array |  [optional] |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  [optional] |
|**origin** | **String** | Url or name of application using this SDK. Not required. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Input file format |  [optional] |
|**outputFormat** | **String** | output file format |  [optional] |
|**masters** | **Boolean** | If translate master slides |  [optional] |
|**formatting** | **Boolean** | If document&#39;s formatting should be preserved, default true |  [optional] |
|**route** | **String** | Endpoint route |  [optional] |
|**separator** | **String** | Separator in files |  [optional] |
|**elements** | **List&lt;Integer&gt;** | List of slides to translate (1-based index). If not present, translate all elements (page, slide, worksheet) |  [optional] |
|**ranges** | [**Map&lt;String, WorksheetData&gt;**](WorksheetData.md) | Dictionary of ranges in Excel workbooks |  [optional] |
|**shortcodedict** | **Map&lt;String, List&lt;String&gt;&gt;** | Dictionary of short code names and parameters names to translate |  [optional] |
|**frontMatterList** | **List&lt;List&lt;String&gt;&gt;** | Dictionary where key is zero-based front matter index and value is list of lists of front matter paths |  [optional] |
|**ignoreList** | **List&lt;String&gt;** | List of elements for Xml, Json and Yaml formats. Determines which items should be blacklisted or whitelisted for processing depending on GroupDocs.Translation.ApiGateway.DTO.FileRequest.IsWhiteList. |  [optional] |
|**isWhiteList** | **Boolean** | Determines to which list the items in GroupDocs.Translation.ApiGateway.DTO.FileRequest.IgnoreList should be allocated. The default is the black list. |  [optional] |



## Enum: SavingModeEnum

| Name | Value |
|---- | -----|
| FILES | &quot;Files&quot; |
| ARCHIVE | &quot;Archive&quot; |
| BOTH | &quot;Both&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DOC | &quot;Doc&quot; |
| DOCX | &quot;Docx&quot; |
| DOCM | &quot;Docm&quot; |
| XLS | &quot;Xls&quot; |
| XLSX | &quot;Xlsx&quot; |
| XLSM | &quot;Xlsm&quot; |
| PPT | &quot;Ppt&quot; |
| PPTX | &quot;Pptx&quot; |
| PPTM | &quot;Pptm&quot; |
| TXT | &quot;Txt&quot; |
| PDF | &quot;Pdf&quot; |
| MD | &quot;Md&quot; |
| RESX | &quot;Resx&quot; |
| HTML | &quot;Html&quot; |
| RTF | &quot;Rtf&quot; |
| ODT | &quot;Odt&quot; |
| ODS | &quot;Ods&quot; |
| ODP | &quot;Odp&quot; |
| CSV | &quot;Csv&quot; |
| TSV | &quot;Tsv&quot; |
| SRT | &quot;Srt&quot; |
| PDFX | &quot;Pdfx&quot; |
| MP3 | &quot;Mp3&quot; |
| WAV | &quot;Wav&quot; |
| FLAC | &quot;Flac&quot; |
| M4A | &quot;M4a&quot; |
| AAC | &quot;Aac&quot; |
| WMA | &quot;Wma&quot; |
| FLV | &quot;Flv&quot; |
| MKV | &quot;Mkv&quot; |
| WEBM | &quot;Webm&quot; |
| AVI | &quot;Avi&quot; |
| MOV | &quot;Mov&quot; |
| WMV | &quot;Wmv&quot; |
| RM | &quot;Rm&quot; |
| MPG | &quot;Mpg&quot; |



