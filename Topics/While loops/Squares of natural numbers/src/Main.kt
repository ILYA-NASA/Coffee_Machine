fun main() {
    val input = readln().toInt()
    var count = 1
    while (count * count <= input) {
        println(count * count)
        count++
    }
}
