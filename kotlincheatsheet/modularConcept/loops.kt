fun main() {
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

}
