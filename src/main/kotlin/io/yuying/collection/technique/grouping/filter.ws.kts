import io.yuying.collection.data.Student
import io.yuying.collection.data.Teacher

/**
 * filter() 過濾 接受一個可自訂過濾條件
 */
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

fruits.filter { it.startsWith('P') }.also { println(it) }

// filterNot() 過濾條件相反
fruits.filterNot { it.startsWith('P') }.also { println(it) }

// filterNotNull() 去除為null的值，回傳 non-nullable的值
val fruits2 = listOf("Grape", null, "Muskmelon", null, "Kumquat", "Pear")

fruits2.filterNotNull().also { println(it) }

// filterIndexed()
fruits.filterIndexed { index, element ->
    (index != 0) && (element.length < 5)
}.also { println(it) }

// filterIsInstance<T>()
val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)

people.filterIsInstance<Teacher>().also { println(it) }
people.filterIsInstance<Student>().also { println(it) }

/**
 * 以上皆為回傳不可變集合，若要回傳可變集合，標準函式庫提供一系列包含 To 的方法
 * filterTo()、filterNotTo()、filterIndexedTo()、filterIsInstanceTo()
 * 這些方法與上面完全相同，差別在增加方法的第一個參數 destination，參數須傳入一個可變集合做為目的第
 */
val shoppingList = mutableListOf("Apple")

fruits.filterTo(shoppingList) { it.length > 5 }.also { println(it) }
shoppingList.add("Banana")
println(shoppingList)

val emptyList = mutableListOf<String>()
fruits.filterTo(emptyList) { it.length > 5 }.also { println(it) }

val returnList = fruits.filterTo(mutableListOf()) { it.length > 5 }
println(returnList)

// 搭配 Map
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

warehouse.filter {
    it.key.contains("n") && it.value >= 10
}.also { println(it) }

// 解構
warehouse.filter { (key, value) ->
    key.contains("n") && value >= 10
}.also { println(it) }

// filterKeys()、filterValues()
val languages = mapOf(
    "Java" to 1995,
    "Kotlin" to 2011,
    "Swift" to 2014,
    "Go" to 2009,
    "C#" to 2000,
    "JavaScript" to 1995,
)

languages.filterKeys { it != "C#" }.also { println(it) }

languages.filterValues { it <= 2000 }.also { println(it) }