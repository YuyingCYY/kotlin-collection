package io.yuying.collection.technique.creation

/**
 * Instantiation
 */
val arrayOfA = Array(5) { 'a' }
// [a, a, a, a, a]

val listOfA = List(3) { it * 2 }
println(listOfA)

val mutableListOfA = MutableList(3) { index -> "A$index" }
println(mutableListOfA)

val iterableOfNumbers = Iterable {
    iterator {
        yield(2)
        yield(4)
        yieldAll(1..5 step 2)
    }
}
println(iterableOfNumbers.toList())
// [2, 4, 1, 3, 5]