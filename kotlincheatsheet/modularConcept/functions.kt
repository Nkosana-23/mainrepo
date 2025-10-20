fun main() {
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

}
