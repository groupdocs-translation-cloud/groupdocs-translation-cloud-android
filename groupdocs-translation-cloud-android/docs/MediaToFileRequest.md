

# MediaToFileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceLanguage** | **String** | Language of original file |  |
|**targetLanguages** | **List&lt;String&gt;** | List of target languages |  |
|**_file** | **byte[]** | File as byte array |  [optional] |
|**originalFileName** | **String** | Type in the file name. If null will be as request ID. |  [optional] |
|**url** | **String** | Link to file for translation. Ignore, if \&quot;file\&quot; property not null |  [optional] |
|**origin** | **String** | Url or name of application using this SDK. Not required. |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle file saving mode for storage.  Is Files by default. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Input file format |  |
|**outputFormat** | **String** | output file format |  |
|**fragments** | **List&lt;String&gt;** | Time fragments that require translation |  [optional] |
|**interval** | **Integer** | Define intervals of timestampts in the resulting file |  [optional] |
|**route** | **String** | endpoints route |  [optional] |



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



