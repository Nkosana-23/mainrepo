fun main() {
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

}
