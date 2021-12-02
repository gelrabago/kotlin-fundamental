fun main(){
    val givenName = "Angel"
    val surName = "Rabago"
    val middleName = "Tiongson"

//    println("My full name is $givenName ${middleName.get(0)}. $surName" )

    val myAge = 10
//    println("My age 10 years from now is ${myAge + 10}")

    val nickName = "gel"
    val product = 100
    val amount = 10

    println("Good day ${nickName.get(0).uppercase()}${nickName.drop(1)} your total purchase is ${product * amount}. Please pay immediately.")
}