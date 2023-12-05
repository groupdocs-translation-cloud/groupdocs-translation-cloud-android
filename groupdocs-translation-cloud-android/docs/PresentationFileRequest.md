

# PresentationFileRequest

Request for presentation files like ppt, pptx, pptm, odp

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
|**outputFormat** | **String** | Output file format |  [optional] |
|**masters** | **Boolean** | If translate master slides |  [optional] |
|**slides** | **List&lt;Integer&gt;** | List of slides to translate |  [optional] |



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
| PPT | &quot;Ppt&quot; |
| PPTX | &quot;Pptx&quot; |
| PPTM | &quot;Pptm&quot; |
| ODP | &quot;Odp&quot; |



