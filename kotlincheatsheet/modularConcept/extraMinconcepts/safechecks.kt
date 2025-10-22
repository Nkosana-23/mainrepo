fun main() {
  val inputs = listOf("  ", "kotlin", "", "123", "42", null)

  // null-safe blank filtering
  val nonBlank = inputs.filterNotNull().filter { it.isNotBlank() }
  println(nonBlank) // [kotlin, 123, 42]

  // find first numeric-looking string and parse safely
  val firstNumber = inputs.filterNotNull().firstOrNull { it.matches(Regex("\\d+")) }?.toIntOrNull()
  println(firstNumber) // 123

  // any / all / none examples
  println(inputs.filterNotNull().any { it.isDigitsOnly() }) // true if at least one is numeric
  println(inputs.filterNotNull().all { it.length <= 5 }) // checks max length
  println(inputs.filterNotNull().none { it == "forbidden" }) // ensure no banned value
}

// small helper extension
fun String.isDigitsOnly() = this.all { it.isDigit() }
