/**
 * sorted() 自然排序 (Natural Ordering)
 */
val numbers = listOf(4, 1, 3, 5, 2)
val chars = setOf('b', 'y', 'p', 'x', 'h')
val strings = setOf("Grape", "Muskmelon", "Kumquat", "Pear")

numbers.sorted().also { println(it) }
chars.sorted().also { println(it) }
strings.sorted().also { println(it) }

// 反向 sortedDescending()
numbers.sortedDescending().also { println(it) }
chars.sortedDescending().also { println(it) }
strings.sortedDescending().also { println(it) }

// 自訂排序邏輯 sortedBy()
val fruits = listOf("Grape", "Muskmelon", "Kumquat", "Pear")

fruits.sortedBy { it.length }.also { println(it) }

// 反向 sortedByDescending()
fruits.sortedByDescending { it.length }.also { println(it) }

// 依照字串的最後一個字元做反向排序
fruits.sortedByDescending { it.last() }.also { println(it) }

// 自訂排序，宣告 Comparator 實例方式
val target = listOf("aaa", "bb", "c")
val lengthComparator = Comparator { str1: String, str2: String ->
    str1.length - str2.length
}

target.sortedWith(lengthComparator).also { println(it) }

// compareBy() 標準函式庫
target.sortedWith(compareBy { it.length }).also { println(it) }

// 反向 compareByDescending()
target.sortedWith(compareByDescending { it.length }).also { println(it) }

// compareBy() 可以須指定多重排序條件
val warehouse = listOf(
    "Apple" to 123,
    "Papaya" to 8,
    "Orange" to 72,
    "Grape" to 21,
    "Banana" to 205,
    "Pineapple" to 47
)

warehouse.sortedWith(
    compareBy({ it.first }, {it.second })
).also { println(it) }
