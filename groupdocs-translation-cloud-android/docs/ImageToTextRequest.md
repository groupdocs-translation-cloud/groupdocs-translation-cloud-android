

# ImageToTextRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | [**FormatEnum**](#FormatEnum) | Originnal file format |  [optional] |
|**source** | **String** | Language of original file |  [optional] |
|**targets** | **List&lt;String&gt;** | List of target languages |  [optional] |
|**_file** | **byte[]** | File for translation |  [optional] |
|**url** | **String** | Link to file for translation |  [optional] |
|**rotate** | **Integer** | Left to write angle to rotate scanned image / pdf |  [optional] |
|**ishandwritten** | **Boolean** | is handwritten text |  [optional] |
|**origin** | **String** | for analysis only |  [optional] |
|**route** | **String** | endpoints route |  [optional] |



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



