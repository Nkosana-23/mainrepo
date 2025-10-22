import kotlin.properties.Delegates

class Config {
  val heavy by lazy {
    println("initializing heavy")
    "expensive resource"
  }

  var status: String by Delegates.observable("idle") { _, old, new ->
    println("status changed from $old to $new")
  }
}

fun main() {
  val c = Config()
  println("before access")
  println(c.heavy)       // triggers initialization once
  println(c.heavy)       // cached
  c.status = "running"   // prints change
  c.status = "done"      // prints change
}
