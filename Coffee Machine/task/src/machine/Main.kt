package machine

fun main() {

//    println(
//        "Starting to make a coffee\n" +
//                "Grinding coffee beans\n" +
//                "Boiling water\n" +
//                "Mixing boiled water with crushed coffee beans\n" +
//                "Pouring coffee into the cup\n" +
//                "Pouring some milk into the cup\n" +
//                "Coffee is ready!"
//    )

    println("Write how many cups of coffee you will need:")
    val input = readln().toInt()
    println(
        "For $input cups of coffee you will need:\n" +
                input * 200 + " ml of water\n" +
                input * 50 + " ml of milk\n" +
                input * 15 + " g of coffee beans"
    )

}
