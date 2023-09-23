/**
 * zipWithNext()
 * 將前後相鄰的兩元素，以每次移動一格方式抓取
 */
val numbers = listOf(1, 2, 3, 4, 5)

numbers.zipWithNext().also { println(it) }

numbers.zipWithNext { a, b -> a * b }.also { println(it) }

