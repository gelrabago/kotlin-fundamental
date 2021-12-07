fun main(){
    //2.Write a program to check whether a letter is a vowel or constant
    println("Please enter a letter:")
    val letter = readLine()!!.lowercase()
    val consonants = setOf<String>("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z")
    val vowels = setOf<String>("a","e","i","o","u")
    if (consonants.contains(letter)) {
        println("You've entered a consonant")
    }else if(vowels.contains(letter)){
        println("You've entered a vowel")
    }else println ("Invalid letter")
}