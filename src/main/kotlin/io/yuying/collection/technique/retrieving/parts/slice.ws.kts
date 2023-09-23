/**
 * slice 可以從中間切一段元素出來
 * 只有 List可以使用，若正在操作物件不是List 可以用轉型方法 toList()轉成 List後再操作
 * 若正在操作的是 Array的話，有sliceArray() 可以使用
 */
val fruits = listOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

// 第一種方式，以 Range 物件產生要抓取的元素索引序列
fruits.slice(1..3).also { println(it) }

fruits.slice(0..4 step 2).also { println(it) }


/**
 * 第二種方式，依照傳入參數集合裡的索引值去抓取指定的元素
 * 不想重複的話就改用 Set (天生去除重複)
 */
fruits.slice(listOf(3, 0, 0)).also { println(it) }

fruits.slice(setOf(3, 0, 0)).also { println(it) }

fruits.slice(setOf(3, 5, 0)).also { println(it) }

// Array
val fruits2 = arrayOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

fruits2.sliceArray(1..3).toList().also { println(it) }

fruits2.sliceArray((0..4 step 2).toList().also { println(it) })

fruits2.sliceArray(listOf(3, 0, 0)).toList().also { println(it) }

fruits2.sliceArray(setOf(3, 0, 0)).toList().also { println(it) }