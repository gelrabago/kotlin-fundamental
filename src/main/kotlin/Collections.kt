fun main () {
    // Collections - group of related data
    // Immutable vs. Mutable
    // Immutable -> Airlines = ["Cebu Pacific, "PAL", "Air Asia"]
    // Mutable -> Users = []

    // List, Set, Map

    //List -> ordered collections that can accessed by indices
    // Immutable
//    val airlines = listOf("Cebu Pacific", "PAL", "Air Asia")
//    println(airlines)
//    println(airlines[1])
    // Mutable
//    val terminals = mutableListOf<Int>(1,2,3,4)
//    println(terminals)
//    terminals.add(5)
//    println(terminals)
//    println(terminals.contains(2))

    //YAGNI - You ain't gonna need it
//Activity for list
//    val fruits = mutableListOf<String>("apple", "lemon", "grapes")
//    println(fruits)
//    println(fruits.last())// prints the last element
//    fruits.removeLast()// removes the last element
//    println(fruits)
//    fruits.add("berry")// adds an element
//    println(fruits)
//    println(fruits.reversed())// reverses the order of the elements in the list
//
//    val veggies = listOf("onion", "bean", "garlic")
//    println(veggies)
//    println(veggies.subList(0,2))// prints the sublist identified from and to
//    println(veggies.first())// prints the first element
//    println(veggies.shuffled())//prints in shuffled order

    //Set -> it contains unique set of elements
    //Immutable
//    val username: Set<String> = setOf("brandon", "amelia", "charlie")
//    println(username)
//    println(username.size) //Count of username
//
//    val student: MutableSet<String> = mutableSetOf("Brandon", "Amelia", "Charlie")
//    println(student)
//    student.add("Alex")
//    println(student)
//    student.add("Brandon")// If this is a list Brandon would still be added
//    println(student)
//
//    val studNum: MutableList<Int> = mutableListOf(1,2,3,4,5)
//    studNum.add(3)
    //Activity for set
//    val countingNum: MutableSet<Int> = mutableSetOf(5,6,7,8,9)
//
//    println(countingNum.drop(3))//Returns a list containing all elements except first n elements.
//    println(countingNum)
//    println(countingNum.elementAt(2))//Returns an element at the given index
//    println(countingNum.minus(7))//Returns a set containing all elements of the original set except the given element.
//    println(countingNum.take(3))//Returns a list containing first n elements.

    //Map -> a collection of key-value pairs
    //Student details: firstName, lastName, yrLevel, section
    // "Brandon", "Diaz", "first", "A"

//    val studDetails: Map<String, String> = mapOf(
//        "firsName" to "Brandon",
//        "lastName" to "Diaz",
//        "yrLevel" to "first",
//        "section" to "A"
//    )
//    println(studDetails)
//    println(studDetails.keys)
//    println(studDetails.values)

//    val studentDetails: MutableMap<String, String> = mutableMapOf(
//        "firsName" to "Brandon",
//        "lastName" to "Diaz",
//        "yrLevel" to "first",
//        "section" to "A"
//    )
//    println(studentDetails)
//    studentDetails.remove("section")
//    println(studentDetails)

    val customer: MutableMap<String, String> = mutableMapOf(
        "CustomerName" to "Gel",
        "Place" to "Philippines",
        "OrderQuantity" to "100",
        "Payable" to "3000Php"
    )
    println(customer.containsKey("Place"))//Returns true if the map contains the specified key.
    println(customer.containsValue("100"))//Returns true if the map contains the specified value.
    println(customer.none())//Returns true if the map has no entries.
    println(customer.toList())//Returns a List containing all key-value pairs.

    val person: Map<String, String> = mapOf(
        "Complexion" to "White",
        "BloodType" to "O",
        "Height" to "170cm",
        "Weight" to "70kg"
    )
    println(person.toProperties())//Converts this Map to a Properties object.
    println(person.isEmpty())//Returns true if the map is empty (contains no elements), false otherwise.
    println(person.count())//Returns true if the map is empty (contains no elements), false otherwise.
    println(person.filter { (key) -> key.endsWith("t") })
    //Returns a list containing only elements matching the given predicate.
}