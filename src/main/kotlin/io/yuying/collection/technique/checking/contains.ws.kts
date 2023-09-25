/**
 * contains(): 檢查集合裡是否包含指定元素
 */

val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

fruits.contains("Papaya")
fruits.contains("Banana")

// 跟 in() 關鍵字效果相同
"Papaya" in fruits
"Banana" in fruits

// 檢查多個元素用 containsAll()
fruits.containsAll(listOf("Grape"))
fruits.containsAll(listOf("Banana"))

fruits.containsAll(listOf("Grape", "Pineapple"))
fruits.containsAll(listOf("Payaya", "Banana"))


// 若用在 Map，預設檢查是 Map 的 Key
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

warehouse.contains("Apple")

// containsKey()，指定檢查的是 Key
warehouse.containsKey("Apple")
warehouse.containsKey("Grapes")

// containsValue()，指定檢查的是 Value
warehouse.containsValue(10)
warehouse.containsValue(200)