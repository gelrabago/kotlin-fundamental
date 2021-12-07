fun main(){
//    println("Day today?")
//    val dayOfWeek = readLine()!!.lowercase()
//    when (dayOfWeek){
//        "monday" -> println("Hey it's Monday! let's be productive.")
//        "tuesday" -> println("Hey it's Tuesday! Choose to be happy.")
//        "wednesday" -> println("Hey it's Wednesday! My dudes!")
//        "thursday" -> println("Hey it's Thursday! You're almost there!")
//        "friday" -> println("Thank God it's Friday!")
//        "saturday" -> println("Happy weekends!!")
//        "sunday" -> println("Happy weekends!!")
//        else -> println("It's not me. It's you!!!")
//    }
    //Greet the user based on the day today
    println("First number:")
    val firstNumber = readLine()!!.toDouble()
    println("Second number:")
    val secondNumber = readLine()!!.toDouble()
    println("Operation (+,-,*,/):")
    val operation = readLine()!!
    when (operation){
        "+" -> println(firstNumber+secondNumber)
        "-" -> println(firstNumber-secondNumber)
        "*" -> println(firstNumber*secondNumber)
        "/" -> println(firstNumber/secondNumber)
        else -> println("Operator is not supported")

    }
    //Calculator

}