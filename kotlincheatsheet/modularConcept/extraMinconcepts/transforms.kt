fun main() {
  val raw = listOf("1", "2", "x", "3", "", "4")

  // mapNotNull to parse ints and drop parse failures
  val numbers = raw.mapNotNull { it.toIntOrNull() }
  println(numbers) // [1, 2, 3, 4]

  // mapIndexedNotNull to include index when value parse succeeds
  val indexed = raw.mapIndexedNotNull { index, s ->
    s.toIntOrNull()?.let { index to it }
  }
  println(indexed) // [(0,1), (1,2), (3,3), (5,4)]

  // flatMap example: split CSV fields and drop blanks
  val csvLines = listOf("a, ,b", "c,d", "")
  val fields = csvLines.flatMap { line ->
    line.split(",").map { it.trim() }.filter { it.isNotBlank() }
  }
  println(fields) // [a, b, c, d]
}
