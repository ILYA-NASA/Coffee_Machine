fun main() {
    val first = readln().toString()
    val operator = readln().toString()
    val second = readln().toString()

    println(
        when (operator) {
            "equals" -> first == second
            "plus" -> first + second
            "endsWith" -> first.endsWith(second)
            else -> "Unknown operation"
        }
    )
}
