const val TASK_NUM = 20
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(a + b == TASK_NUM || a + c == TASK_NUM || b + c == TASK_NUM)
}