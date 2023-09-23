
val numbers = listOf(1, 2, 3, 4, 5, 6)
println(numbers.take(3))
// 超過集合尺寸，回傳整個集合
println(numbers.takeLast(100))

/**
 * 反向取值
 * 那後面 n 個，不是從後面開始拿 n 個
 * 所以集合會維持原本順序
 */
println(numbers.takeLast(3))
println(numbers.takeLast(100))

/**
 * takeWhile()
 * 會從頭開始拿，直到條件不符合
 */
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")
println(fruits.takeWhile { it.length > 4 })

println(fruits.takeWhile { it.startsWith('M') })