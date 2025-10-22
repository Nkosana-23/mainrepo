fun main() {
  val raw = "  Alice   Bob\tCharlie\nDavid  "
  // split on any whitespace sequence and remove blank tokens
  val parts = raw.split(Regex("\\s+")).filter { it.isNotBlank() }
  println(parts) // [Alice, Bob, Charlie, David]

  // safe destructuring when you expect at least 3 parts
  val safe = raw.split(Regex("\\s+")).filter { it.isNotBlank() }
  val first = safe.getOrNull(0) ?: "Unknown"
  val second = safe.getOrNull(1) ?: "Unknown"
  val third = safe.getOrNull(2) ?: "Unknown"
  println("$first, $second, $third") // Alice, Bob, Charlie

  // lazy splitting for large input
  val seq = raw.splitToSequence(Regex("\\s+")).map { it.trim() }.filter { it.isNotBlank() }
  println(seq.toList()) // [Alice, Bob, Charlie, David]
}
