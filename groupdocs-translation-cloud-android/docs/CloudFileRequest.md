

# CloudFileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | **String** | \&quot;doc(x|m)\&quot; if Word document, \&quot;xls(x|m)\&quot; if Excel workbook |  [optional] |
|**outFormat** | **String** | output file format |  [optional] |
|**requestId** | **String** | id of request |  [optional] |
|**ids** | **List&lt;Integer&gt;** | Language pairs to translate |  [optional] |
|**summarized** | **Boolean** | If summarization required |  [optional] |
|**url** | **String** | Link to file for translation |  [optional] |
|**size** | **Long** | File size |  [optional] |
|**masters** | **Boolean** | If translate master slides |  [optional] |
|**formatting** | **Boolean** | If document&#39;s formatting should be preserved, default true |  [optional] |
|**origin** | **String** | for analysis only |  [optional] |
|**elements** | **List&lt;Integer&gt;** | List of slides to translate |  [optional] |
|**ranges** | [**Map&lt;String, WorksheetData&gt;**](WorksheetData.md) | Dictionary of ranges in Excel workbooks |  [optional] |
|**shortCodeDict** | **Map&lt;String, List&lt;String&gt;&gt;** | Dictiory of short code names and parameters names to translate |  [optional] |
|**frontMatterList** | **List&lt;List&lt;String&gt;&gt;** | Dictionary where key is zero-based front matter index and value is list of lists of front matter paths |  [optional] |
|**originalFileName** | **String** | Original name of file |  [optional] |
|**separator** | **String** | Separator in files |  [optional] |
|**isPaid** | **Boolean** | Set true if paid user |  [optional] |
|**savingMode** | [**SavingModeEnum**](#SavingModeEnum) | Toggle files saving mode |  [optional] |
|**details** | **Map&lt;String, String&gt;** | Details of the requests. Using for e2e tracking |  [optional] |



## Enum: SavingModeEnum

| Name | Value |
|---- | -----|
| FILES | &quot;Files&quot; |
| ARCHIVE | &quot;Archive&quot; |
| BOTH | &quot;Both&quot; |



