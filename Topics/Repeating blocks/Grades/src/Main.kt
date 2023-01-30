fun main() {
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(readln().toInt()) {
        val grade = readln().toInt()

        when (grade) {
            2 -> d++
            3 -> c++
            4 -> b++
            else -> a++
        }
    }

    println("$d $c $b $a")
}