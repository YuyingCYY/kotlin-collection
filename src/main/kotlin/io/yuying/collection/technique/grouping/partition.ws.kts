import io.yuying.collection.data.Student
import io.yuying.collection.data.Teacher

/**
 * partition() 傳入一個條件判斷式
 * 回傳一個 Pair，第一個元素為符合條件的元素集合，第二個元素為不符合條件的元素集合
 */
val staff = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Teacher(5, "Sean", "Lin", 6),
)

val dividedStaff = staff.partition { it.level <= 3 }
println(dividedStaff)

// 以 first, second 分別取出
dividedStaff.first.also { println(it) }
dividedStaff.second.also { println(it) }

/**
 * 解構
 * 回傳變數時，以小括號包兩個變數(junior、senior）
 */
val (junior, senior) = staff.partition { it.level <= 3 }
println(junior)
println(senior)

// 分離不同的類別
val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)
val (teachers, students) = people.partition { it is Teacher}
println(teachers)
println(students)