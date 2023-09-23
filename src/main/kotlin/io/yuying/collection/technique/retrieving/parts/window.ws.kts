/**
 * windowed()
 * 提供4個參數
 * 1. size 窗戶尺寸
 * 2. step 每次移動格數
 * 3. partialWindows 取值時，想保留不足一段的子集合傳True，反之不保留傳 false
 */
val number = listOf(1, 2, 3, 4 ,5)

number.windowed(3).also { println(it) }

number.windowed(size = 3, step = 2, partialWindows = true).also { println(it) }

number.windowed(size = 3, step = 2, partialWindows = false).also { println(it) }

number.windowed(size = 3, step = 2, partialWindows = false) { it.sum() }.also { println(it) }