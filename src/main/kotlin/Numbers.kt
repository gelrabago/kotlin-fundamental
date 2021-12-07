fun main() {
    val number: Byte = 8
    println(number::class.simpleName)

    val numberTwo = 80000000000000000
    println(numberTwo::class.simpleName)

    val numberThree = 8.12
    println(numberThree::class.simpleName)

    val numberFour = 8.12F
    println(numberFour::class.simpleName)

    val numberFive: Short = 83
    println(numberFive::class.simpleName)

    println(numberTwo.toInt())
}