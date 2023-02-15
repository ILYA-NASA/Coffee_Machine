const val MAX_POPULATION = 50_000_000

data class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = when {
                value < 0 -> population
                value > MAX_POPULATION -> MAX_POPULATION
                else -> value
            }
        }

//        set(value) {
//            field = value.coerceIn(0, 50_000_000)
//        }

}
