import java.time.LocalDate
import java.time.Period
import java.util.Scanner

fun getAge(year: Int, month: Int, dayOfMonth: Int): Int {
    return Period.between(
        LocalDate.of(year, month, dayOfMonth),
        LocalDate.now()
    ).years
}

fun main() {
    println("Who you?")
    val yourName = readLine()

    println("Birthyear?")
    val yr = Scanner(System.`in`)
    var intyr:Int = yr.nextInt()
    println("Birthmonth?")
    val mo = Scanner(System.`in`)
    var intmo:Int = mo.nextInt()
    println("Birthday?")
    val d = Scanner(System.`in`)
    var intd:Int = d.nextInt()

    println("Hi $yourName you are ${getAge(intyr,intmo,intd)}")

}