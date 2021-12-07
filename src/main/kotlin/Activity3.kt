fun main(){
    //3. Write a program to check the validity of password
    println("Enter your password:")
    var password = readLine()!!
    var status = false
    val acceptable = ('a'..'z').plus('A'..'Z').plus("$#@".asIterable()).plus(0..9)
   for (item in password) {
       if (acceptable.contains(password) ) status = true
   }
    if (status) {println("Good")}
    else{println("Bad")}
}