package io.yuying.collection.technique.creation

// of
val arrayOfNumbers = arrayOf(1, 2, 3, 4, 5)
println(arrayOfNumbers)

val listOfNumbers = listOf(1, 2, 3, 4, 5)
println(listOfNumbers)

val mutableListOfNumbers = mutableListOf(1, 2, 3, 4, 5)
println(mutableListOfNumbers)

val mapOfFruit = mapOf(
    "Apple" to 100,
    "Banana" to 12,
    "Orange" to 60)
println(mapOfFruit)

val linkedSetOfNumbers = linkedSetOf(1, 2, 3, 4, 5)
println(linkedSetOfNumbers)

val intArray = intArrayOf(1, 2, 3, 4, 5)
println(intArray.contentToString())

val notNullList = listOfNotNull(1, null, 2, null, 3, null)
println(notNullList)

val notNullSet = setOfNotNull(1, null, 2, null, 3, null)
println(notNullSet)

val arrayOfNulls = arrayOfNulls<Int?>(5)
println(arrayOfNulls.contentToString())