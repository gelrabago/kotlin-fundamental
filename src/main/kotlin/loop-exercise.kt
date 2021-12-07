fun main(){

    val grades = listOf(
        listOf(94,82,85),
        listOf(83,99,97),
        listOf(76,89,90)
    )
    val highest = grades.map{
       it.maxOf { it }
    }
    println(highest)

//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
//    numbers.forEach{
//        if (it % 3 == 0 && it % 5 == 0) println("PingPong")
//        else if (it % 3 == 0) println("Ping")
//        else if (it % 5 == 0) println("Pong")
//        else println ("x")
//    }
}