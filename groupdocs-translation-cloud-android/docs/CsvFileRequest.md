

# CsvFileRequest

Request for comma / tab separated files like csv, tsv

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
|**format** | [**FormatEnum**](#FormatEnum) | Input file format |  [optional] |
|**outputFormat** | **String** | output file format |  |
|**separator** | **String** | Separator in files |  [optional] |



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
| CSV | &quot;Csv&quot; |
| TSV | &quot;Tsv&quot; |



