fun main(){
//    println("Hello. What is your name?")
//    var name = readLine()!!
//    println(name)

    //Ask for age
    println("What is your age?")
    try {
        var age = readLine()!!.toInt()
        if (age>=0){
            if (age < 17){
                println("You are not allowed to use the service")
            }
            else if( age == 17){
                println("You need a guardian.")
            }
            else{
                println("Welcome to the service")
                }
        }else{println("Please input valid age.")}
    }catch(it:NumberFormatException){
        println("Please input valid age.")
    }
    //if user is underage the user is not allowed to use the service

}