fun main() {
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//
//    println(a != b && b != c && a != c)

    val numbs = List(3) { readLine()!!.toInt() }.toSet()
    print(numbs.size == 3)

}