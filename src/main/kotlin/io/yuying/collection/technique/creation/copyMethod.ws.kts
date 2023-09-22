package io.yuying.collection.technique.creation

/**
 * copy
 */
val arrayOfNumbers = intArrayOf(1, 2, 3, 4, 5)
val smallerArrayOfNumbers = arrayOfNumbers.copyOf()
println(smallerArrayOfNumbers.contentToString())
val biggerArrayOfNumbers = arrayOfNumbers.copyOf(6)
println(biggerArrayOfNumbers.contentToString())

val arrayOfStrings = arrayOf("Apple", "Banana", "Orange")
val smallerArrayOfStrings = arrayOfStrings.copyOf(3)
println(smallerArrayOfStrings.contentToString())
val biggerArrayOfStrings = arrayOfStrings.copyOf(5)
println(biggerArrayOfStrings.contentToString())

// copyOfRange
val copiedArrayOfNumbers = arrayOfNumbers.copyOfRange(2, 4)
println(copiedArrayOfNumbers.contentToString())
val copiedArrayOfStrings = arrayOfStrings.copyOfRange(1, 3)
println(copiedArrayOfStrings.contentToString())

/**
 * copyInto
 * 參數一：目標 Array，要寫入的目的地
 * 參數二：目標 Array 的偏移值，從 Array 的第幾個位置開始寫入
 * 參數三：來源 Array 的哪一個索引開始複製
 * 參數四：來源 Array 的哪一個索引前停下
 */
val arrayOfFruits = arrayOf("Apple", "Banana", "Orange")
val destinationArray = arrayOf("Blackberry", "Blueberry", "Strawberry", "Watermelon", "Pineapple")
arrayOfFruits.copyInto(destinationArray, 1, 1, 3)
println(destinationArray.contentToString())

/**
 * copy方法只有 Array 才有
 * 其他集合方法要做類似的方法
 * 要做到 copyOf() 的效果，可以使用集合轉型的 to 開頭方法
 * 要做到 copyOfRange() 的效果，可以使用集合取值的 slice() 方法
 */
val cities = listOf("Taipei", "Tokyo", "New York", "Hong Kong", "Singapore")

val copiedCities = cities.toList()
println(copiedCities)

val partialCities = copiedCities.slice(1..3)
println(partialCities)