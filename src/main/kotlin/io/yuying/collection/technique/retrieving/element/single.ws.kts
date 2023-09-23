/**
 * single() 方法適用於集合裡只有一個元素
 *
 * 1. 若集合只有一個元素，回傳該元素
 * 2. 若集合沒有元素，拋出 NoSuchElementException
 * 3. 若集合有多個元素，拋出 IllegalArgumentException
 */

val onlyOneNumber = listOf(2)
println(onlyOneNumber.single())

val numbers = listOf(2, 2, 3, 2, 2, 2)
val emptyList = emptyList<Int>()
val nothingList = listOf<Int>()
println(numbers.single { it != 2 })

println(numbers.singleOrNull())
println(emptyList.singleOrNull())
println(nothingList.singleOrNull())

println(numbers.singleOrNull { it > 5 })
println(emptyList.singleOrNull { it > 5 })
println(nothingList.singleOrNull { it > 5 })