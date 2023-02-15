fun main() {
    // write your code here
    val (a, b, c) = readLine()!!.split(' ')
    // or since Kotlin 1.6
    val (d, e, f) = readln().split(' ')

    print("$a:$b:$c $d/$e/$f")
}