import kotlin.text.toInt as textToInt

fun main(){
    println("Who you?")
    val yourName = readLine()

    println("Birth year?")
    val yourBirthday = readLine()?.textToInt()
    val yourAge = yourBirthday

    println("What's up $yourName. You are ${2021 - yourBirthday!!} this year.")

}