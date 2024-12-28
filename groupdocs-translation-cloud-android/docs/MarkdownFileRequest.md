

# MarkdownFileRequest

Request for markdown files or markdown files with Hugo syntax

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  [optional] |
|**origin** | **String** | Url or name of application using this SDK. Not required. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**outputFormat** | **String** | output file format |  |
|**shortCodeList** | **Map&lt;String, List&lt;String&gt;&gt;** | Dictionary of short code names and parameters names to translate |  [optional] |
|**frontMatterList** | **List&lt;List&lt;String&gt;&gt;** | List of lists of frontmatter paths |  [optional] |



## Enum: SavingModeEnum

| Name | Value |
|---- | -----|
| FILES | &quot;Files&quot; |
| ARCHIVE | &quot;Archive&quot; |
| BOTH | &quot;Both&quot; |



