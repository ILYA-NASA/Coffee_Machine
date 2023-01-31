fun getLastDigit(a: Int) = a.toString().last().digitToInt()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}