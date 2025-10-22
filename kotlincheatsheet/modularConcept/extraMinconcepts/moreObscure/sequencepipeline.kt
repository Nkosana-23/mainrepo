fun main() {
  val numbers = (1..1_000_000).asSequence()
    .map { it * 2 }
    .filter { it % 3 == 0 }
    .take(5)
    .toList()
  println(numbers) // [6, 12, 18, 24, 30]
}
