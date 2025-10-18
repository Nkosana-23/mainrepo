// ================================
// Kotlin Beginner to Intermediate Script
// ================================

/*
 * Concept 1: Entry Point - The 'main' function
 * -----------------------------------------------------
 * In Kotlin, the `main()` function is the entry point of any Kotlin program.
 * This is where the program starts executing.
 */
fun main() {

    // ---------------------------------------------
    // Concept 2: Variables (val and var)
    // ---------------------------------------------
    /*
     * Kotlin uses `val` for immutable variables (like final in Java),
     * and `var` for mutable (changeable) variables.
     */
    val userName: String = "Alice"
    var userAge: Int = 30

    println("User name is $userName and age is $userAge")

    // Mutable variable can be updated
    userAge += 1
    println("User had a birthday! New age is $userAge")

    // ---------------------------------------------
    // Concept 3: Functions
    // ---------------------------------------------
    /*
     * Functions are reusable blocks of code.
     * They are declared using the `fun` keyword.
     * Functions can take parameters and return values.
     */
    fun greetUser(name: String): String {
        return "Hello, $name! Welcome to Kotlin."
    }

    val greetingMessage = greetUser(userName)
    println(greetingMessage)

    // ---------------------------------------------
    // Concept 4: Conditional Statements (if/else)
    // ---------------------------------------------
    /*
     * Kotlin uses if-else expressions for conditional logic.
     * It can also be used as an expression to return a value.
     */
    fun checkVotingEligibility(age: Int): String {
        return if (age >= 18) {
            "You are eligible to vote."
        } else {
            "You are not eligible to vote yet."
        }
    }

    println(checkVotingEligibility(userAge))

    // ---------------------------------------------
    // Concept 5: Loops (for, while)
    // ---------------------------------------------
    /*
     * Loops let you repeat code.
     * `for` loops iterate over ranges, arrays, collections.
     * `while` loops continue while a condition is true.
     */

    println("\n-- Countdown using while loop --")
    var countdownValue = 5
    while (countdownValue > 0) {
        println("Countdown: $countdownValue")
        countdownValue--
    }

    println("\n-- Print numbers using for loop --")
    for (number in 1..5) {
        println("Number: $number")
    }

    // ---------------------------------------------
    // Concept 6: Classes and Objects
    // ---------------------------------------------
    /*
     * A class is a blueprint for objects.
     * An object is an instance of a class.
     * Classes can have properties (variables) and methods (functions).
     */
    class Person(val name: String, var age: Int) {
        fun introduce() {
            println("Hi, I'm $name and I'm $age years old.")
        }

        fun celebrateBirthday() {
            age++
            println("Happy Birthday! I am now $age.")
        }
    }

    val personInstance = Person("Bob", 25)
    personInstance.introduce()
    personInstance.celebrateBirthday()

    // ---------------------------------------------
    // Concept 7: Data Classes
    // ---------------------------------------------
    /*
     * Data classes are used to hold data.
     * Kotlin automatically provides useful methods like toString(), equals(), and copy().
     */
    data class Book(val title: String, val author: String, val year: Int)

    val kotlinBook = Book("Kotlin Essentials", "Jane Doe", 2022)
    println("Book info: $kotlinBook")

    val updatedBook = kotlinBook.copy(year = 2025)
    println("Updated edition: $updatedBook")

    // ---------------------------------------------
    // Concept 8: Null Safety
    // ---------------------------------------------
    /*
     * Kotlin helps avoid null pointer exceptions.
     * Use `?` to allow a variable to hold null.
     * Use `?.` to safely access nullable variables.
     * Use `?:` for the Elvis operator to provide a default value.
     */
    var optionalNickname: String? = null

    // Safe call
    println("Nickname length: ${optionalNickname?.length}")

    // Elvis operator
    val nicknameLength = optionalNickname?.length ?: 0
    println("Nickname length (with default): $nicknameLength")

    // Assigning a non-null value
    optionalNickname = "Koty"
    println("Updated nickname: ${optionalNickname?.uppercase()}")

    // ---------------------------------------------
    // Concept 9: Collections (Lists and Maps)
    // ---------------------------------------------
    /*
     * Kotlin provides powerful collection types.
     * Lists are ordered collections.
     * Maps are key-value pairs.
     */
    val fruitsList = listOf("Apple", "Banana", "Cherry")
    val mutableFruitList = mutableListOf("Mango", "Orange")
    mutableFruitList.add("Grapes")

    println("Fruit List:")
    for (fruit in fruitsList + mutableFruitList) {
        println("- $fruit")
    }

    val countryCapitals = mapOf("USA" to "Washington", "France" to "Paris", "Japan" to "Tokyo")
    println("Capital of France is ${countryCapitals["France"]}")

    // ---------------------------------------------
    // Concept 10: When Expression (Switch alternative)
    // ---------------------------------------------
    /*
     * The `when` expression replaces the switch statement.
     * It allows multiple branches based on a value.
     */
    fun getWeatherAdvice(weatherCondition: String): String {
        return when (weatherCondition.lowercase()) {
            "sunny" -> "Wear sunglasses and sunscreen."
            "rainy" -> "Take an umbrella."
            "snowy" -> "Wear a coat and boots."
            else -> "Check the weather forecast!"
        }
    }

    val todayWeather = "Rainy"
    println("Weather advice: ${getWeatherAdvice(todayWeather)}")

    // Done!
    println("\nProgram complete. You’ve learned key Kotlin concepts!")
}
