/**
 * drop()
 * 選定要丟棄的元素的數量後，回傳剩餘的元素。
 */
val number = listOf(1, 2, 3, 4, 5, 6)

println(number.drop(3))
// 超過集合尺寸，回傳 empty 集合
println(number.drop(100))


// dropLast()
println(number.dropLast(4))
println(number.dropLast(100))

// dropWhile()
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

fruits.dropWhile { it.length > 4 }.also { println(it) }

fruits.dropWhile { it.startsWith('A') }.also { println(it) }

// dropLastWhile()
fruits.dropLastWhile { it.length > 4 }.also { println(it) }

fruits.dropLastWhile { it.contains('a') or it.contains('e') }.also { println(it) }