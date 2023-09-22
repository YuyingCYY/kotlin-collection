/**
 * 集合四大類除了 Set 以外，其他都有索引或Key，因為 Set 無順序且無索引
 * 因此函式庫提供 element 為首的方法，為了 Set 設計
 * 但是其他類也可以使用
 */
val setOfNames = setOf("Tom", "John", "Allen", "Sean")
println(setOfNames.elementAt(1))

// 不希望拋出例外也有 elementAtOrNull()
println(setOfNames.elementAtOrNull(10))

println(setOfNames.elementAtOrNull(10) ?: "Unknown Person")

// elementAtOrElse()
println(setOfNames.elementAtOrElse(100) { if (it > 50) "Out of range" else "Unknown Person" })