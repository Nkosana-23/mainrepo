fun main() {
    
    print("Enter your name: ") // Prompt user for input on the same line
    val name = readln()

    println("Hello, $name!") // Prints greeting with the entered name

    // 🔤 Basic Info
    println("Length: ${name.length}") // ✅ Correct: Gets the number of characters in the string
    println("Is empty: ${name.isEmpty()}") // ✅ Correct: Checks if the string is empty
    println("Trimmed: '${name.trim()}'") // ✅ Correct: Removes leading and trailing whitespace

    // 🔠 Case transformations
    println("Uppercase: ${name.uppercase()}") // ✅ Correct: Converts all characters to uppercase
    println("Lowercase: ${name.lowercase()}") // ❌ Correction: Converts all characters to lowercase (not uppercase)
    println("Capitalized: ${name.replaceFirstChar { it.uppercase() }}") // ✅ Correct: Capitalizes the first character

    // 🔁 Reversing and repeating
    println("Reversed: ${name.reversed()}") // ✅ Correct: Reverses the string
    println("Repeated 3 times: ${name.repeat(3)}") // ✅ Correct: Repeats the string 3 times (can be useful for testing, patterns, or emphasis)

    // 🔍 Searching
    println("Contains 'a': ${name.contains("a")}") // ✅ Correct: Checks if the string contains the letter 'a'
    println("Starts with 'J': ${name.startsWith("J")}") // ✅ Correct: Checks if the string starts with 'J'
    println("Ends with 'k': ${name.endsWith("k")}") // ✅ Correct: Checks if the string ends with 'k'
    println("Index of 'a': ${name.indexOf("a")}") // ❌ Correction: Returns the index (position) of the first occurrence of 'a', or -1 if not found

    // ✂️ Slicing
    println("First 2 letters: ${name.take(2)}") // ✅ Correct: Takes the first 2 characters
    println("Drop first letter: ${name.drop(1)}") // ✅ Correct: Removes the first character and returns the rest
    println("Substring (1 to 3): ${name.substring(1, 4)}") // ❌ Correction: Returns characters from index 1 up to (but not including) index 4

    // 🔧 Replacing
    println("Replace 'a' with '@': ${name.replace("a", "@")}") // ✅ Correct: Replaces all 'a' characters with '@'

    // 🧪 Regex
    val regex = Regex("[A-Z]")
    println("Uppercase letters found: ${regex.findAll(name).map { it.value }.toList()}") 
    // ❌ Correction: Finds all uppercase letters in the string using regex and returns them as a list

    // 🧵 Advanced
    println("Char array: ${name.toCharArray().joinToString()}") 
    // ❌ Correction: Converts the string into a character array and joins them into a readable string

    println("Chunked (2): ${name.chunked(2)}") 
    // ❌ Correction: Splits the string into chunks of 2 characters each (useful for formatting or processing)

    println("Padded to 10 chars: '${name.padStart(10, '*')}'") 
    // ❌ Correction: Adds '*' characters to the beginning of the string until it reaches a total length of 10

}
