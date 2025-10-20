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
}
