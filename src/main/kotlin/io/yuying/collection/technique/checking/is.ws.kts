/**
 * is
 */
val numbers = mutableListOf(1, 2, 3, 4, 5)

if (numbers.isEmpty()) println("Empty") else println("Not Empty")

numbers.isNotEmpty()

numbers.clear()

if (numbers.isEmpty()) println("Empty") else println("Not Empty")

numbers.isNotEmpty()

var list: List<Int>? = null

list.isNullOrEmpty()
list = listOf(1, 2, 3)
list.isNullOrEmpty()

