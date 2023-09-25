/**
 * add()
 * 預設將傳入的元素放到集合最後一個位置
 * 若要指定元素放置的位置，則在呼叫add()傳入兩參數
 * 1. 索引位置
 * 2. 元素
 * 若設定超出索引範圍，則會拋出IndexOutOfBoundsException
 */
val numbers = mutableListOf(1, 3, 5, 7, 9)

numbers.add(8).also { println(numbers) }

numbers.add(2, 4).also { println(numbers) }

// 新增多個元素 addAll()
val numbers2 = mutableListOf(1, 3, 5, 7, 9)

numbers2.addAll(listOf(4, 6, 8)).also { println(numbers2) }

numbers2.addAll(2, listOf(2, 4)).also { println(numbers2) }


// plus() 會回傳相加的結果，而不是布林值，但同樣也不會動到原始集合內容
val names = mutableListOf("John", "Tom", "Mary")

names.plus("Simon").also { println(it) }
println(names) // 不改變原始內容

names.plus(listOf("Sue", "Peter")).also { println(it) }

// 標準函式庫實做 plus()，使用運算子多載(Operator Overloading)的方式, 可以使用 + 號
names + "Simon" // 同 names.plus("Simon")

// plusAssign()，方法本身不回傳，且會變更原本集合裡面的元素，如同 +=
val names2 = mutableListOf("John", "Tom", "Mary")

names2.plusAssign("Simon").also { println(names2) }

// plusElement()
val names3 = mutableListOf(
    listOf("John", "Tom"),
    listOf("Mary")
)

names3.plusElement(listOf("Simon", "Bruce")).also { println(it) } // 回傳型別為 List<List<String>>

names3.plus(listOf("Simon", "Bruce")).also { println(it) } // 回傳型別為 List<Any>

