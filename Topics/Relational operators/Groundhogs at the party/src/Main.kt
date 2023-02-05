@Suppress("MagicNumber")
fun main() {
    val cups = readln().toInt()
    val weekend = readln().toBoolean()

    if (weekend) {
        println(cups in 15..25)
    } else println(cups in 10..20)
}