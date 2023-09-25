import io.yuying.collection.data.employees

/**
 * distinct() 可去除集合裡重複的元素，並以一個新的List物件回傳
 */

val numbers = listOf(1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9)
val strings = listOf("Tommy", "John", "John", "Sean", "John", "Sean")

numbers.distinct().also { println(it) }
strings.distinct().also { println(it) }

// distinctBy()
val chars = listOf('A', 'a', 'b', 'B', 'A', 'a')
chars.distinctBy { it.uppercaseChar() }.also { println(it) }

val fruits = listOf("apple", "banana", "mango", "berry")

fruits.distinctBy { it.first() }.also { println(it) }

employees.distinctBy { it.department }.also { println(it) }





