import io.yuying.collection.data.Product

val products = listOf(
    Product("FT-0851", "Banana", 10.0),
    Product("FT-0422", "Watermelon", 150.0),
    Product("FT-0342", "Apple", 80.0),
    Product("FT-0982", "Grapes", 200.0),
    Product("FT-0952", "Orange", 60.0),
)

/**
 * binarySearch() 最多接收四個參數
 * 1. 要搜尋的元素實體
 * 2. 傳入一個 Comparator 做為搜尋比較的邏輯
 * 3. 要搜尋的元素的起始索引，預設 0
 * 4. 要搜尋的元素的結束索引，預設為集合尺寸
 */
products.sortedBy { it.price }
    .binarySearch(Product("FT-0422", "Watermelon", 150.0), compareBy { it.name })

/**
 * binarySearchBy() 最多接收四個參數
 * 1. 搜尋比較時的基準key
 * 2. 要搜尋的元素的起始索引，預設 0
 * 3. 要搜尋的元素的結束索引，預設為集合尺寸
 * 4. 選出Key值得選擇器
 *
 * 先看第四個參數回傳的類別屬性為何，再由第一個參數學定搜尋時的屬性值
 */
products.sortedBy { it.price }
    .binarySearchBy(80.0) { it.price }