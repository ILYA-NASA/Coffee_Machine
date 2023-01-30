@Suppress("MagicNumber")
fun main() {
    val first = readln().toInt() * 60 * 60 + readln().toInt() * 60 + readln().toInt()
    val second = readln().toInt() * 60 * 60 + readln().toInt() * 60 + readln().toInt()
    println(second - first)
}