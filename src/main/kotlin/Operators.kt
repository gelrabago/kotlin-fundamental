fun main() {
    // arithmetic
    val numByte = 1
    val numShort = 2
    val numInt = 3
    val numFloat = 4.12f
    val numDouble = 7
    var numLong = 9

    var result = numLong * numShort
    println(result)

    result = numLong - numShort
    println(result)

    result = numLong / numShort
    println("$numLong / $numShort = $result")

    result = numLong % numShort
    println("$numLong % $numShort = $result")

    println(numLong + numShort * numFloat)
   //println(numLong++)

    result += numLong
    println(result)

    result -= numByte
    println(result)

    result %= numDouble
    println(result)

}