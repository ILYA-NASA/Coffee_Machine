@Suppress("MagicNumber")
enum class DangerLevel(private val volume: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = volume
}