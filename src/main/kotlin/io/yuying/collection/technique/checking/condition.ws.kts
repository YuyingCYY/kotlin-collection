/**
 * any(): 集合至少有一個元素回傳 true 效果同 isNotEmpty()
 * none(): 語意跟 any 相反，集合沒有任何元素回傳 true 效果同 isEmpty()
 * all(): 空洞真理，意思是條件永遠為真
 */

// any()
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

fruits.any()
fruits.isNotEmpty()
emptyList.any()
emptyList.isNotEmpty()

fruits.any { it.endsWith("e") }
fruits.any { it.endsWith("z") }

// none()
fruits.none()
fruits.isEmpty()
emptyList.none()
emptyList.isEmpty()

fruits.none { it.endsWith("e") }
fruits.none { it.endsWith("z") }

// all()
emptyList.all { it == "anything" }