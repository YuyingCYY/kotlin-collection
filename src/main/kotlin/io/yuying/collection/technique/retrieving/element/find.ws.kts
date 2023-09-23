/**
 * 可以依條件找出集合裡第一個符合條件元素，沒有回傳null
 *
 * 回傳型別 T?
 */

val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

println(words.find { it.startsWith("some") })
println(words.find { it.startsWith("any") })