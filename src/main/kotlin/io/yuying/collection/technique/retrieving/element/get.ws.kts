package io.yuying.collection.technique.retrieving.element

import io.yuying.collection.data.Address

val listOfNames = listOf("Tom", "John", "Allen", "Sean")
listOfNames.get(1)

// getOrNull() 可搭配貓王運算子 ?: (Elvis Operator)
println(listOfNames.getOrNull(1))
println(listOfNames.getOrNull(10))
println(listOfNames.getOrNull(10) ?: "Unknown Person")

// 搭配運算子可指定預設值，若預設值需較複雜的邏輯判斷，可改用 getOrElse()
println(listOfNames.getOrElse(1) { "Unknown Person" })

println(listOfNames.getOrElse(100) { if (it > 50) "Out of range" else "Unknown Person" })

// 針對 Map 操作，還有三個方法
// getValue() 傳入要搜尋的 Key 值，方法會回傳對應的 value 值，若找不到則拋出 NoSuchElementException
val orders = mapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelung", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703"),
)

println(orders.getValue("Sue"))
println(orders["Peter"])

// getOrDefault() 與 getOrElse()類似，可以Key值不存在時指定預設值
println(orders.getOrDefault("Sue", Address("Taitung", "950")))
println(orders.getOrDefault("Simon", Address("Taitung", "950")))


// 如果 Key值不存在，我們不只想要拿到預設值，希望一併把預設值寫進 Map 可以使用 getOrPut()，但要是可變得 MutableMap
val mutableOrders = mutableMapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelung", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703"),
)

println(mutableOrders.getOrPut("Sue") { Address("Taitung", "950") })

mutableOrders.getOrPut("Simon") { Address("Taitung", "950") }
println(mutableOrders)