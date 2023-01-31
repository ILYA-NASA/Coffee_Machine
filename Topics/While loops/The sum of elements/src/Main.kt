fun main() {
    var result = 0
    do {
        val input = readln().toInt()
        result += input
    } while (input != 0)
    println(result)
}