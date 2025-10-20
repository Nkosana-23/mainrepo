fun main() {
    // Read a simple string
    println("Enter your name:")
    val name = readln()
    println("Hello, $name!")

    // Read and convert to Int
    println("Enter your age:")
    val age = readln().toIntOrNull()
    if (age != null) {
        println("You are $age years old.")
    } else {
        println("Invalid age entered.")
    }

    // Read and convert to Double
    println("Enter the price of an item:")
    val price = readln().toDoubleOrNull()
    if (price != null) {
        println("Price entered: $price")
    } else {
        println("Invalid price.")
    }

    // Read multiple integers on one line
    println("Enter two numbers separated by space:")
    val (x, y) = readln().split(" ").map { it.toIntOrNull() ?: 0 }
    println("Sum: ${x + y}")

    // Read a list of numbers
    println("Enter a list of numbers separated by space:")
    val numbers = readln().split(" ").mapNotNull { it.toIntOrNull() }
    println("You entered: $numbers")
}
