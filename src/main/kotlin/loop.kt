fun main(){
//    for (x in 1..5){
//        println(x)
//    }
//    val fruits = mapOf<Int, String>(1 to "banana", 2 to "apple",3 to "orange")
//    for ((key, value) in fruits){
//        println(value)
//    }
//    val users = arrayListOf<String>("Ferdie","Lisa","Mary")
//    val age = arrayListOf<Int>(45,13,23)
//
//    for (count in 0..users.lastIndex){
//        val username = users[count]
//        val age = age[count]
//        println("$username is $age years old")
//    }
    var exitCode: Int = 999
    //to perform human counter
    //println("How many people entered?")
    //var userInput = readLine()!!.toInt()
    var totalHumans = 0
    do{
        println("How many people have entered? Total:${totalHumans}")
        var userInput = readLine()!!.toInt()
        totalHumans += userInput
        if (userInput == 999) totalHumans -= 999

    }while(userInput != exitCode)
    println("The total human entered the premise is $totalHumans")
}