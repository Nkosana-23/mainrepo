inline fun <reified T> List<Any>.filterIsInstanceReified(): List<T> {
  return this.filterIsInstance<T>()
}

fun main() {
  val items: List<Any> = listOf(1, "two", 3.0, 4, "five")
  val ints: List<Int> = items.filterIsInstanceReified()
  println(ints) // [1, 4]
}
