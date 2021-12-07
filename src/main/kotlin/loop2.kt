fun main(){
    val numbers = listOf(1,2,3,4,5)
    //forEach -> will go through each of the value
    numbers.forEach{ number ->
        val newNumber = number*5
        println(newNumber)
    }
    //map -> will return a new collection performing the transformation
    val newNum = numbers.map{
        it*4
        it*3
        it*2
    }
    println(newNum)
    //filter -> will return a new collection, filtering the values based on conditions made
    val evenNumber = numbers.filter{
        it % 2 == 0
    }
    println(evenNumber)
}