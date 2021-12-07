fun main() {
    val isNotChristmas = false
    val isChristmas = true

    println(!isChristmas && !isChristmas)
    println(isChristmas && isChristmas)
    println(isChristmas && !isChristmas)

    println(!isChristmas || !isChristmas)
    println(isChristmas || isChristmas)
    println(isChristmas || !isChristmas)

    println(isChristmas.xor(false))
}