

# ImageToFileRequest


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
|**format** | [**FormatEnum**](#FormatEnum) | Original file format |  [optional] |
|**ocrformat** | [**OcrformatEnum**](#OcrformatEnum) | File format after recognition |  |
|**outputFormat** | **String** | output file format |  |
|**rotationAngle** | **Integer** | Left to write angle to rotate scanned image / pdf |  [optional] |
|**formatting** | **Boolean** | If document&#39;s formatting should be preserved, default true |  [optional] |
|**route** | **String** | endpoints route |  [optional] |
|**pages** | **List&lt;Integer&gt;** | List of pages to translate for scanned pdf |  [optional] |



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
| BMP | &quot;Bmp&quot; |
| JPG | &quot;Jpg&quot; |
| PNG | &quot;Png&quot; |
| SVG | &quot;Svg&quot; |
| GIF | &quot;Gif&quot; |
| PDF | &quot;Pdf&quot; |



## Enum: OcrformatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;Pdf&quot; |
| XLSX | &quot;Xlsx&quot; |
| CSV | &quot;Csv&quot; |



