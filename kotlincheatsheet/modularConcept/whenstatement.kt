fun main() {
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
