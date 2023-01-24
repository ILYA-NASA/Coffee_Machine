package machine

import kotlin.math.min

fun main() {

    println("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beans = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val userCups = readln().toInt()

    val caps = minOf(water / 200, milk / 50, beans / 15)

    when {
        userCups < caps -> println("Yes, I can make that amount of coffee (and even " + (caps - userCups) + " more than that)")
        userCups > caps -> println("No, I can make only $caps cups of coffee")
        else -> println("Yes, I can make that amount of coffee")
    }

}
