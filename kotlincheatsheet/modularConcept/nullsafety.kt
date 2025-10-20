fun main() {
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
}
