fun main() {

    // ---------------------------------------------
    // Variables (val and var)
    // ---------------------------------------------
    val userName: String = "Alice"
    var userAge: Int = 30

    println("User name is $userName and age is $userAge")

    // Mutable variable updated
    userAge += 1
    println("User had a birthday! New age is $userAge")

    // ---------------------------------------------
    // Function using expression body
    // ---------------------------------------------
    /*
     * Kotlin supports expression body syntax for simple functions.
     * Instead of return + block, you can write the function as a single expression.
     */
    fun greetUser(name: String): String = "Hello, $name! Welcome to Kotlin."

    println(greetUser(userName))

    // ---------------------------------------------
    // Simplified voting eligibility using 'if' expression
    // ---------------------------------------------
    val votingStatus = if (userAge >= 18) "Eligible to vote" else "Not eligible yet"
    println(votingStatus)

    // ---------------------------------------------
    // Loops
    // ---------------------------------------------
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
    // Classes and Objects
    // ---------------------------------------------
    class Person(val name: String, var age: Int) {
        fun introduce() = println("Hi, I'm $name and I'm $age years old.")
        fun celebrateBirthday() {
            age++
            println("Happy Birthday! I am now $age.")
        }
    }

    val personInstance = Person("Bob", 25)
    personInstance.introduce()
    personInstance.celebrateBirthday()

    // ---------------------------------------------
    // Data Class
    // ---------------------------------------------
    data class Book(val title: String, val author: String, val year: Int)

    val kotlinBook = Book("Kotlin Essentials", "Jane Doe", 2022)
    println("Book info: $kotlinBook")

    val updatedBook = kotlinBook.copy(year = 2025)
    println("Updated edition: $updatedBook")

    // ---------------------------------------------
    // Null Safety - Cleaner with Elvis and Safe Call
    // ---------------------------------------------
    var optionalNickname: String? = null

    // Using safe call and Elvis operator
    val nicknameLength = optionalNickname?.length ?: 0
    println("Nickname length (with default): $nicknameLength")

    optionalNickname = "Koty"
    println("Updated nickname: ${optionalNickname?.uppercase() ?: "Unknown"}")

    // ---------------------------------------------
    // Collections
    // ---------------------------------------------
    val fruitsList = listOf("Apple", "Banana", "Cherry")
    val mutableFruitList = mutableListOf("Mango", "Orange").apply {
        add("Grapes")
    }

    println("Fruit List:")
    for (fruit in fruitsList + mutableFruitList) {
        println("- $fruit")
    }

    val countryCapitals = mapOf("USA" to "Washington", "France" to "Paris", "Japan" to "Tokyo")
    println("Capital of France is ${countryCapitals["France"]}")

    // ---------------------------------------------
    // Cleaner 'when' Expression
    // ---------------------------------------------
    fun getWeatherAdvice(weatherCondition: String): String = when (weatherCondition.lowercase()) {
        "sunny" -> "Wear sunglasses and sunscreen."
        "rainy" -> "Take an umbrella."
        "snowy" -> "Wear a coat and boots."
        else -> "Check the weather forecast!"
    }

    val todayWeather = "Rainy"
    println("Weather advice: ${getWeatherAdvice(todayWeather)}")

    // ---------------------------------------------
    // Done!
    // ---------------------------------------------
    println("\nProgram complete. Kotlin is expressive and efficient!")
}
