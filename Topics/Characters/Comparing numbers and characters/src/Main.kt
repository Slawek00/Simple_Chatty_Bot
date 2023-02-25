fun main() {
    val numberUnicode = readln().toInt()
    val character = readln().first().hashCode() == numberUnicode
    println(character)
}