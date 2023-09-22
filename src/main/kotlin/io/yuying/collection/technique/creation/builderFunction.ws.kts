package io.yuying.collection.technique.creation

/**
 * Builder
 * 以 build 為函式名稱前綴
 */
val listByBuilder = buildList {
    add('a')
    addAll(listOf('b', 'c'))
    add('d')
}
println(listByBuilder)

val setByBuilder = buildSet {
    add(1)
    addAll(listOf(2, 3))
    addAll(listOf(3, 4, 5))
    add(4)
}
println(setByBuilder)

val mapByBuilder = buildMap {
    put("Apple", 100)
    putAll(mapOf("Banana" to 12, "Orange" to 60))
}
println(mapByBuilder)