package io.yuying.collection.technique.retrieving.element

/**
 * index 取單值
 */

// 以中括號加上索引位置取值
val numbers = listOf(5, 2, 2, 6, 2, 3, 7)
println(numbers[3])

// indexOf()
// 回傳 1，第一個 2 的索引位置
println(numbers.indexOf(2))
// 回傳 -1，集合裡沒有 1 這個元素
println(numbers.indexOf(1))

// lastIndexOf() 搜尋最後一個元素
println(numbers.lastIndexOf(2))
println(numbers.lastIndexOf(10))

// indexOfFirst() indexOfLast()
println(numbers.indexOfLast { it < 3 })
println(numbers.indexOfLast { it > 100 })