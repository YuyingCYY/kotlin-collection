/**
 * reversed() 反轉集合元素順序
 */
val numbers = listOf(1, 5, 3, 2, 4)

// 反轉前不會預先排序過
numbers.reversed().also { println(it) }

// 反轉前先排序
numbers.sorted().reversed().also { println(it) }

// 上面結果也可以使用 sortedDescending()