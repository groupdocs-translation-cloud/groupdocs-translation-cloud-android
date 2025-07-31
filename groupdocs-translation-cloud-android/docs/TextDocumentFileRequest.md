

# TextDocumentFileRequest

Request for files with textual content (doc, docx, docm, rtf, odt, txt

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  |
|**isNeedAlignment** | **Boolean** | Do result formating like the source. This option needs more expensive requests. |  [optional] |
|**translationDictionary** | **Map&lt;String, String&gt;** | Set a specific translation between source and target words. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Input file format |  |
|**outputFormat** | **String** | output file format |  |
|**preserveFormatting** | **Boolean** | If document&#39;s formatting should be preserved, default true |  [optional] |
|**origin** | **String** | for analysis only |  [optional] |
|**pages** | **List&lt;Integer&gt;** | Choose pages for translation (1-based index). If not present, translate all pages |  [optional] |



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
| TXT | &quot;Txt&quot; |
| RTF | &quot;Rtf&quot; |
| ODT | &quot;Odt&quot; |



