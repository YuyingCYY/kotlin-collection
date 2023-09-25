/**
 * remove
 */
val numbers = mutableListOf(1, 3, 5, 7, 9)

numbers.remove(3).also { println(numbers) }

// removeAt() 依照索引位置刪除元素
numbers.removeAt(2).also { println(numbers) }

// removeAll() 依照傳入的集合刪除元素
numbers.removeAll(listOf(2, 3, 9)).also { println(numbers) }

val names = mutableListOf("John", "Tom", "Mary")
names.removeAll { it.contains('o') }.also { println(names) }
