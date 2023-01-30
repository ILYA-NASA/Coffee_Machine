@Suppress("MagicNumber")

fun main() {
    var result = 0
    repeat(readln().toInt()) {
        val input = readln().toInt()
        if (input % 4 == 0 && input > result) result = input
    }
    println(result)
}