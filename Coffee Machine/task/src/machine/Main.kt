package machine

var allWater = 400
var allMilk = 540
var allCoffeeBeans = 120
var allCups = 9
var allMoney = 550

fun main() {
    println("\nWrite action (buy, fill, take, remaining, exit):")
    val userInput = readln()
    if (userInput == "exit") return
    else CoffeeMachine(userInput).controller()
}

class CoffeeMachine(val input: String) {

    fun controller() = when (input) {
        "buy" -> {
            println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
            buy(readln())
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
        "remaining" -> remaining()
        else -> main()
    }


    fun remaining() {
        println(
            "\nThe coffee machine has:\n" +
                    "$allWater ml of water\n" +
                    "$allMilk ml of milk\n" +
                    "$allCoffeeBeans g of coffee beans\n" +
                    "$allCups disposable cups\n" +
                    "$$allMoney of money\n"
        )
        main()
    }

    fun buy(input: String) {
        when (input) {
            "1" -> {
                if (checkingStockLevels(input)) {
                    allWater -= 250
                    allCoffeeBeans -= 16
                    allCups -= 1
                    allMoney += 4
                    println("I have enough resources, making you a coffee!")
                    main()
                } else {
                    println("Sorry, not enough water!")
                    main()
                }
            }

            "2" -> {
                if (checkingStockLevels(input)) {
                    allWater -= 350
                    allMilk -= 75
                    allCoffeeBeans -= 20
                    allCups -= 1
                    allMoney += 7
                    println("I have enough resources, making you a coffee!")
                    main()
                } else {
                    println("Sorry, not enough water!")
                    main()
                }
            }

            "3" -> {
                if (checkingStockLevels(input)) {
                    allWater -= 200
                    allMilk -= 100
                    allCoffeeBeans -= 12
                    allCups -= 1
                    allMoney += 6
                    println("I have enough resources, making you a coffee!")
                    main()
                } else {
                    println("Sorry, not enough water!")
                    main()
                }
            }

            "back" -> main()
        }
    }

    fun checkingStockLevels(input: String): Boolean {
        return (when (input) {
            "1" -> (allWater - 250) >= 0 &&
                    (allCoffeeBeans - 16) >= 0 &&
                    (allCups - 1) >= 0

            "2" -> (allWater - 350) >= 0 &&
                    (allMilk - 75) >= 0 &&
                    (allCoffeeBeans - 20) >= 0 &&
                    (allCups - 1) >= 0

            else -> (allWater - 200) >= 0 &&
                    (allMilk - 100) >= 0 &&
                    (allCoffeeBeans - 12) >= 0 &&
                    (allCups - 1) >= 0
        }
                )
    }

    fun fill(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int) {
        allWater += water
        allMilk += milk
        allCoffeeBeans += coffeeBeans
        allCups += disposableCups
        main()
    }

    fun take() {
        println("I gave you $$allMoney")
        allMoney = 0
        main()
    }

}