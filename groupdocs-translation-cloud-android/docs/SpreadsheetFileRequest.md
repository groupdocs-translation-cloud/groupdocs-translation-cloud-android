

# SpreadsheetFileRequest

Request for spreadsheet files, like xls, xlsx, xlsm, ods

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  |
|**origin** | **String** | Url or name of the application using this SDK. Not required. |  [optional] |
|**isNeedAlignment** | **Boolean** | Do result formating like the source. This option needs more expensive requests. |  [optional] |
|**translationDictionary** | **Map&lt;String, String&gt;** | Set a specific translation between source and target words. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Input file format |  |
|**outputFormat** | [**OutputFormatEnum**](#OutputFormatEnum) | output file format |  |
|**worksheets** | **List&lt;Integer&gt;** | List of Worksheets to translate by sequence number (1-based index). If not present, translate all worksheets |  [optional] |
|**ranges** | [**Map&lt;String, WorksheetData&gt;**](WorksheetData.md) | Dictionary of ranges in Excel workbooks |  [optional] |



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
| XLS | &quot;Xls&quot; |
| XLSX | &quot;Xlsx&quot; |
| XLSM | &quot;Xlsm&quot; |
| ODS | &quot;Ods&quot; |



## Enum: OutputFormatEnum

| Name | Value |
|---- | -----|
| XLS | &quot;Xls&quot; |
| XLSX | &quot;Xlsx&quot; |
| XLSM | &quot;Xlsm&quot; |
| XLSB | &quot;Xlsb&quot; |
| HTML | &quot;Html&quot; |
| PDF | &quot;Pdf&quot; |
| XPS | &quot;Xps&quot; |
| ODS | &quot;Ods&quot; |
| MD | &quot;Md&quot; |
| DOCX | &quot;Docx&quot; |
| PPTX | &quot;Pptx&quot; |
| TIFF | &quot;Tiff&quot; |



