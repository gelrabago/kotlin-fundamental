fun main(){
    val myMessage = "Happy Birthday! Justin "
    val anotherMessage = "Maligayang Bati! Justin"
    println(myMessage)

//    println(myMessage.substring(16,22))

//    println(myMessage.compareTo(anotherMessage))

    println(myMessage.plus(anotherMessage))
    println(myMessage.drop(16))
    println(myMessage.dropLast(7))
    println(myMessage.count())
    println(myMessage.elementAt(16))
}