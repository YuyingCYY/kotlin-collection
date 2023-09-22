import kotlin.random.Random

/**
 * random 隨機
 */
val numbers = mutableListOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 自行計算集合長度在搭配索引取值
println(numbers[Random.nextInt(numbers.size)])

// 函式庫提供的 random()
println(numbers.random())

// 不拋出例外
numbers.clear()
println(numbers.randomOrNull())

println(emptyList.randomOrNull())
println(nothingInList.randomOrNull())