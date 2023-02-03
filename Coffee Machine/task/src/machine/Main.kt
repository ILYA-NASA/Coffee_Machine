package machine

const val WATER = 400
const val MILK = 540
const val COFFEE_BEANS = 120
const val CUPS = 9
const val MONEY = 550

fun main() {

    println(
        "The coffee machine has:\n" +
                "$WATER ml of water\n" +
                "$MILK ml of milk\n" +
                "$COFFEE_BEANS g of coffee beans\n" +
                "$CUPS disposable cups\n" +
                "$$MONEY of money\n" +
                "\n" +
                "Write action (buy, fill, take): "
    )

    when (readln()) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            buy(readln().toInt())
        }

        "fill" -> {
            println("Write how many ml of water you want to add:")
            val water = readln().toInt()
            println("Write how many ml of milk you want to add:")
            val milk = readln().toInt()
            println("Write how many grams of coffee beans you want to add:")
            val coffeeBeans = readln().toInt()
            println("Write how many disposable cups you want to add:")
            val disposableCups = readln().toInt()
            fill(water, milk, coffeeBeans, disposableCups)
        }

        "take" -> take()
        else -> println(
            "incorrect choice"
        )
    }
}

fun buy(input: Int) {
    when (input) {
        1 -> println(
            "The coffee machine has:\n" +
                    "${WATER - 250} ml of water\n" +
                    "$MILK ml of milk\n" +
                    "${COFFEE_BEANS - 16} g of coffee beans\n" +
                    "${CUPS - 1} disposable cups\n" +
                    "$${MONEY + 4} of money"
        )

        2 -> println(
            "The coffee machine has:\n" +
                    "${WATER - 350} ml of water\n" +
                    "${MILK - 75} ml of milk\n" +
                    "${COFFEE_BEANS - 20} g of coffee beans\n" +
                    "${CUPS - 1} disposable cups\n" +
                    "$${MONEY + 7} of money"
        )

        3 -> println(
            "The coffee machine has:\n" +
                    "${WATER - 200} ml of water\n" +
                    "${MILK - 100} ml of milk\n" +
                    "${COFFEE_BEANS - 12} g of coffee beans\n" +
                    "${CUPS - 1} disposable cups\n" +
                    "$${MONEY + 6} of money"
        )
    }
}

fun fill(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int) {
    println(
        "The coffee machine has:\n" +
                "${WATER + water} ml of water\n" +
                "${MILK + milk} ml of milk\n" +
                "${COFFEE_BEANS + coffeeBeans} g of coffee beans\n" +
                "${CUPS + disposableCups} disposable cups\n" +
                "$$MONEY of money"
    )
}

fun take() {
    println(
        "I gave you $$MONEY\n" +
                "\n" +
                "The coffee machine has:\n" +
                "$WATER ml of water\n" +
                "$MILK ml of milk\n" +
                "$COFFEE_BEANS g of coffee beans\n" +
                "$CUPS disposable cups\n" +
                "$${MONEY - MONEY} of money\n"
    )
}