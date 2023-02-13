// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    println(findByRgb("#FF0000"))
}

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}

fun findByRgb(rgb: String): Rainbow {
    for (rainbow in Rainbow.values()) {
        if (rgb == rainbow.rgb) return rainbow
    }
    return Rainbow.NULL
}