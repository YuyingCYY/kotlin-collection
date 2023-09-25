import io.yuying.collection.data.employees

/**
 * groupBy()
 * 分群後回傳新建立的 Map, 這個 Map 的 Key 是分群時的條件
 * 注意：回傳為不可變集合，如需要可變集合，可使用 groupByTo()
 *
 * 支援傳入兩個參數
 * 1. KeySelector，以什麼為基準做條件
 * 2. ValueTransform，對元素執行的轉換操作
 *
 * groupByTo()
 * 1. destination: 方法回傳時，要把結果寫入的目的地
 * 其餘兩參數同 groupBy()
 */

val fruits = listOf(
    "cOcoNut", "PaPaYa", "CRanBerry", "pINEApple", "BaNaNa", "PeaR"
)

// 會區分大小寫
fruits.groupBy { it.first() }.also { println(it) }

/**
 * 第一個先把 Key統一轉大寫
 * 第二個把value全轉換成小寫後，把開頭轉大寫
 */
fruits.groupBy(
    { it.first().uppercase() },
    { it.lowercase().replaceFirstChar(Char::uppercaseChar) }
).also { println(it) }

employees.groupBy(
    { it.department },
    { it.name }
).also { println(it) }

// groupByTo()
val phoneToYear = listOf(
    "Nexus One" to 2010,
    "Pixel 2" to 2017,
    "Pixel 3" to 2018,
    "iPhone 4" to 2010,
    "iPhone X" to 2017,
    "Galaxy Note 8" to 2017,
    "Galaxy S11" to 2020,
)

val phonesByYear = mutableMapOf<Int, MutableList<String>>()

phoneToYear.groupByTo(
    phonesByYear,   // 目的地
    { it.second },  // Key 選擇器
    { it.first }    // Value 轉換器
).also { println(it) }

// 因為是可變集合，可以修改內容
phonesByYear[2020] = mutableListOf("iPhone 12")
println(phonesByYear)

// 對回傳群組做二次操作 groupingBy()
val languages = listOf(
    "java",
    "scala",
    "kotlin",
    "javascript",
    "groovy",
    "ruby",
    "react",
    "swift"
)
languages.groupingBy {
    // 先以字首分群後轉大寫
    it.first().uppercase()
}.eachCount() // 在計算子裙組裡的數量
    .also { println(it) }














