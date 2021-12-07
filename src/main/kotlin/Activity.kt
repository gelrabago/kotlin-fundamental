fun main(){
    //1. Take three numbers from the user and print the greatest number
    println("First number:")
    val num1: Int = readLine()!!.toInt()
    println("Second number:")
    val num2: Int = readLine()!!.toInt()
    println("Third number:")
    val num3: Int = readLine()!!.toInt()

    if (num1 >= num2 && num1 >= num3) {
        println("The greatest number is $num1")
    }else if (num2 >= num1 && num2 >= num3){
        println("The greatest number is $num2")
    }else{
        println("The greatest number is $num3")
    }
}