package io.yuying.collection.technique.creation

/**
 * empty 建立不包含任何元素的集合
 * 1. 使用 of 結尾函式，但不傳入任何參數
 * 2. 用 empty 為首的函式，並指定泛型參數
 */
val emptyArrayUsingArrayOf = arrayOf<Int>()
val emptyArrayUsingEmptyArray = emptyArray<Int>()

val emptyList = listOf<Int>()
val emptyMutableList = mutableListOf<Int>()
val emptyListByEmptyList = emptyList<Int>()

val emptySet = setOf<Int>()
val emptyMutableSet = mutableSetOf<Int>()
val emptySetByEmptySet = emptySet<Int>()

val emptyMap = mapOf<String, Int>()
val emptyMutableMap = mutableMapOf<String, Int>()
val emptyMapByEmptyMap = emptyMap<String, Int>()