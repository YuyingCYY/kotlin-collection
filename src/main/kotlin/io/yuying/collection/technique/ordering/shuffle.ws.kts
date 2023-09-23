import io.yuying.collection.data.LotteryDrawer

/**
 * shuffled() 元素隨機排列
 */
val raffle = listOf(
    LotteryDrawer("John"),
    LotteryDrawer("Tom"),
    LotteryDrawer("Mary"),
    LotteryDrawer("Sean"),
    LotteryDrawer("Paul"),
)

val newRaffle = raffle.shuffled()
println(newRaffle)

// 假設回得到得獎者，可搭配 first
newRaffle.first().name.also { println(it) }
