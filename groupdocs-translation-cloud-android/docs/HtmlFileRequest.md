

# HtmlFileRequest

Request for HTML files

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  [optional] |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  [optional] |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  [optional] |
|**origin** | **String** | Url or name of the application using this SDK. Not required. |  [optional] |
|**isNeedAlignment** | **Boolean** | Do result formating like the source. This option needs more expensive requests. |  [optional] |
|**translationDictionary** | **Map&lt;String, String&gt;** | Set a specific translation between source and target words. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**outputFormat** | **String** | output file format |  [optional] |



## Enum: SavingModeEnum

| Name | Value |
|---- | -----|
| FILES | &quot;Files&quot; |
| ARCHIVE | &quot;Archive&quot; |
| BOTH | &quot;Both&quot; |



