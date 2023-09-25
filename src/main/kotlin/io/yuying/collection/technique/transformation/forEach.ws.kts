val numbers = listOf(1, 3, 5, 7, 9)

// 一般 for 迴圈
for (number in numbers) {
    print("$number  ")
}

/**
 * 希望拿到集合裡的索引
 * 1. indices
 * 2. withIndex()
 */
for (index in numbers.indices) {
    println("$index: ${numbers[index]}")
}

for ((index, value) in numbers.withIndex()) {
    println("$index: $value")
}

/**
 * forEach()
 * 無法直接使用 break、 continue
 */
numbers.forEach { print("$it ") }

// 預設 it 不好理解可自訂
numbers.forEach { numbers -> print("$numbers ") }

// forEachIndexed()
numbers.forEachIndexed { index, element ->
    println("index=$index, element=$element")
}

/**
 * 適用於 Map，it 會是 Map.Entry，其有 key 及 value
 * 因為 key 就是索引，所以沒有 forEachIndexed()方法
 * 所以不喜歡 it.key的寫法，可以解構成 (key, value)
 * 甚至 Key 和 Value 變數名稱可以依照開發語敬宣告成合適名稱
 */
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

warehouse.forEach {
    println("key=${it.key}, value=${it.value}")
}

// 解構
warehouse.forEach { (key, value) ->
    println("key=$key, value=$value")
}

// 使用自己想用的語意
warehouse.forEach { (fruit, amount) ->
    println("fruit=$fruit, amount=$amount")
}


















