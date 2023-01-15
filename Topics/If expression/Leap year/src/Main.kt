fun main() {
    val year = readln().toInt()
    println(if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) "Leap" else "Regular")
}