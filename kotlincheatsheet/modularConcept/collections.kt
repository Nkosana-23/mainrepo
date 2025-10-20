fun main() {
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
}
