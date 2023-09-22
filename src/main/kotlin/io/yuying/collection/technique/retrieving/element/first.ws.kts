import io.yuying.collection.data.employees

/**
 * first
 * 若沒有任何元素，則拋出 NoSuchElementException
 */
val numbers = listOf(2, 3, 5, 6, 7)
println(numbers.first())

// 不想拋出例外，可用 firstOrNull()
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

println(emptyList.firstOrNull())
println(nothingInList.firstOrNull())

println(numbers.first { it > 3 })
println(emptyList.firstOrNull { it > 3 })
println(nothingInList.firstOrNull { it > 3 })

/**
 * Kotlin 1.5
 * firstNotNullOf()、firstNotNullOfOrNull()
 */
println(employees.first { it.skills != null }.skills)

// 方法一
println(employees.firstOrNull { it.skills != null }?.skills)

// 方法二
println(employees.mapNotNull { it.skills }.first())

println(employees.firstNotNullOf { it.skills })

//emptyList.firstNotNullOf { it.skills } // NoSuchElementException
//nothingInList.firstNotNullOf { it.skills } // NoSuchElementException

// 而firstNotNullOfOrNull() 則不會拋出例外
//println(emptyList.firstNotNullOfOrNull { it.skills })