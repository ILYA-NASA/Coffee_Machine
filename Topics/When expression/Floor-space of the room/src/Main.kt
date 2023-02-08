import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    println(
        when (readln()) {
            "triangle" -> triangleArea(readln().toDouble(), readln().toDouble(), readln().toDouble())
            "rectangle" -> rectangleArea(readln().toDouble(), readln().toDouble())
            "circle" -> circleArea(readln().toDouble())
            else -> "incorrect choose"
        }
    )
}

fun triangleArea(a: Double, b: Double, c: Double): Double {
    val p = halfPerimeter(a, b, c) // полупериметр
    return sqrt(p * (p - a) * (p - b) * (p - c)) // формула Герона
}

fun halfPerimeter(a: Double, b: Double, c: Double) = (a + b + c) / 2.0

fun rectangleArea(a: Double, b: Double) = a * b

fun circleArea(r: Double) = PI * (r * r)