fun main() {
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

}
