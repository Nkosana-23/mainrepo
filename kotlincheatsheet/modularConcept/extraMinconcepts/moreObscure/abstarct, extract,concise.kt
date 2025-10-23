//Abstract functions
//An abstract function is declared without a body inside an abstract class or interface and must be implemented by concrete subclasses.
//External functions
//An external function is declared with the external modifier to indicate its implementation is provided outside Kotlin (for example by native code or a JVM/JS library), so it has no Kotlin body.
//Single-expression functions using =
//A single-expression function uses = followed by an expression; the compiler infers the return type and the function body is that expression.








// Abstract class example showing abstract function usage
abstract class Greeter {                          // declare an abstract class named Greeter
  abstract fun greet(name: String): String       // declare an abstract function greet with no body to be implemented by subclasses
  fun info(): String = "Greeter base class"      // provide a concrete helper method using single-expression form
}

class FriendlyGreeter : Greeter() {               // concrete subclass that must implement abstract members
  override fun greet(name: String): String {     // implement the abstract greet function with a full-block body
    return "Hello, $name!"                       // return a greeting string
  }
}

class ShortGreeter : Greeter() {                  // another concrete subclass
  override fun greet(name: String) = "Hi $name"   // implement abstract greet using single-expression form and inferred return type
}

// External function example for interop (JVM/Native/JS)
// Note: This is a declaration only; actual implementation must be provided by native/interop setup.
external fun nativeGreet(name: String): String    // declare an external function whose body is supplied outside Kotlin

// Single-expression function examples
fun add(a: Int, b: Int): Int = a + b              // define add as a single-expression function with explicit return type
fun welcome(name: String) = "Welcome, $name"      // single-expression function with inferred return type String
