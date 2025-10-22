// package declaration optional; omitted for brevity
// A simple open base class with a primary constructor and a property
open class Person(val name: String, var age: Int) { // declare a class Person with read-only name and mutable age
  init { // init block runs after primary constructor to perform initialization logic
    println("Created Person: $name, age $age") // print when a Person is created
  }

  // a method that can be overridden by subclasses
  open fun describe(): String { // define a function that returns a string describing the person
    return "Person(name=$name, age=$age)" // return a formatted description
  }

  // protected method accessible to subclasses but not to external callers
  protected fun protectedInfo(): String { // define a protected helper method
    return "protected info for $name" // return a short protected string
  }
}

// An Employee class that inherits from Person and adds properties
open class Employee( // declare class Employee that extends Person
  name: String, // pass name to base class constructor
  age: Int, // pass age to base class constructor
  val employeeId: String // add an employeeId property
) : Person(name, age) { // call Person constructor
  // override the describe method to include employee-specific info
  override fun describe(): String { // override base implementation
    return "Employee(id=$employeeId, name=$name, age=$age)" // include employeeId in description
  }

  // a function demonstrating protected access to base class method
  fun showProtected(): String { // public function to expose protectedInfo for demonstration
    return protectedInfo() // call the protected method from base class
  }
}

// An abstract class that forces subclasses to implement a function
abstract class Shape { // declare an abstract Shape class
  abstract fun area(): Double // abstract method that must be implemented by subclasses
  open fun info(): String { // non-abstract method with a default implementation
    return "Generic Shape" // default info string
  }
}

// A concrete subclass implementing Shape; demonstrates properties and overriding
class Rectangle(val width: Double, val height: Double) : Shape() { // Rectangle with width and height
  override fun area(): Double { // implement area computation
    return width * height // return width times height
  }

  override fun info(): String { // override info to provide rectangle-specific text
    return "Rectangle(width=$width, height=$height)" // return formatted info
  }
}

// Interface example with a default implementation
interface Drivable { // declare a Drivable interface
  fun drive(): String // abstract function to be implemented
  fun start(): String { // default implementation in interface
    return "Engine started" // return default start string
  }
}

// A class implementing multiple behaviors: inheritance and an interface
class Car(name: String, age: Int, val model: String) : Employee(name, age, employeeId = "CAR-${model}"), Drivable { // Car extends Employee and implements Drivable
  override fun describe(): String { // override describe to include model
    return "Car(model=$model, owner=$name)" // return car-specific description
  }

  override fun drive(): String { // implement drive from Drivable
    return "Driving $model" // simulate driving string
  }
}

// Data class example for concise value objects
data class Point(val x: Int, val y: Int) // data class automatically provides equals, hashCode, toString, copy

// Sealed class hierarchy for restricted types
sealed class Result { // sealed class limits subclasses to the same file
  data class Success(val value: String) : Result() // success subtype with data
  data class Error(val message: String) : Result() // error subtype with message
}

// Enum class example with property and function
enum class Direction(val degrees: Int) { // enum with an associated property
  NORTH(0), // enum constant NORTH with degrees 0
  EAST(90), // EAST with degrees 90
  SOUTH(180), // SOUTH with degrees 180
  WEST(270); // WEST with degrees 270

  fun rotate(turns: Int): Direction { // method on enum to rotate by number of 90-degree turns
    val all = values() // get all enum constants
    val index = (ordinal + turns).floorMod(all.size) // compute new index using floorMod extension below
    return all[index] // return the new Direction
  }
}

// Extension function to provide floorMod (safe positive modulus) for integers
fun Int.floorMod(mod: Int): Int = ((this % mod) + mod) % mod // compute positive modulus

// Companion object and factory method example
class User private constructor(val username: String) { // private constructor prevents direct instantiation outside the class
  companion object { // companion object holds static-like members
    fun create(username: String): User { // factory function to create User
      val sanitized = username.trim() // trim whitespace from username
      return User(sanitized) // return a new User using the private constructor
    }
  }
}

// Object singleton example
object Logger { // single-instance Logger
  fun log(msg: String) { // logging function
    println("[LOG] $msg") // print log message to console
  }
}

// Property delegation example using built-in lazy delegate
class Config { // class demonstrating delegated property
  val heavyResource: String by lazy { // lazy delegate initializes once on first access
    Logger.log("Initializing heavy resource") // log initialization
    "HeavyResourceData" // return resource data
  }
}

// Custom delegate example delegating getter/setter to a backing map
import kotlin.reflect.KProperty // import for property delegation API

class MapBackedProps(private val map: MutableMap<String, Any?>) { // holds a mutable map as storage
  var name: String by map as MutableMap<String, String?> // delegate property 'name' to map entry "name"
  var age: Int? by map as MutableMap<String, Int?> // delegate property 'age' to map entry "age"
}

// Note: above cast usage is illustrative; in real code use explicit map accessors or TypedDelegates

// Generic class with variance example (producer-consumer)
open class Box<out T>(private val value: T) { // 'out' makes Box covariant (producer) so Box<Derived> is subtype of Box<Base>
  fun get(): T = value // return the contained value
}

// Example of delegation pattern using 'by' to delegate interface implementation
class Engine : Drivable { // Engine implements Drivable
  override fun drive(): String = "Engine driving" // engine drive implementation
  override fun start(): String = "Engine starting" // engine start implementation
}

class Vehicle(drivable: Drivable) : Drivable by drivable { // Vehicle delegates Drivable implementation to the provided drivable
  // Vehicle inherits drive() and start() implementations from the delegated object
}

// Secondary constructor and backing field with custom getter/setter
class Counter { // simple counter class
  private var _count: Int = 0 // backing field for count
  var count: Int // public property with custom getter/setter
    get() = _count // return backing field
    private set(value) { // private setter to restrict modification
      _count = value // update backing field
    }

  constructor(start: Int) { // secondary constructor to initialize counter
    this._count = start // set backing field
  }

  fun increment() { // method to mutate count via allowed API
    count = count + 1 // increment using the setter
  }
}

// Demonstration main function exercising the above concepts
fun main() { // program entry point
  val p = Person("Alice", 30) // create a Person instance
  println(p.describe()) // print description of person

  val emp = Employee("Bob", 40, "E-123") // create an Employee
  println(emp.describe()) // print employee description
  println(emp.showProtected()) // demonstrate protected access via a public wrapper

  val rect = Rectangle(3.0, 4.0) // create a Rectangle
  println(rect.info()) // print rectangle info
  println("Area: ${rect.area()}") // print computed area

  val car = Car("Carol", 28, "Model-X") // create a Car which is Employee + Drivable
  println(car.describe()) // print car description
  println(car.start()) // call default interface implementation
  println(car.drive()) // call implemented drive

  val pt = Point(2, 5) // create a Point data instance
  val pt2 = pt.copy(y = 6) // copy with modification using generated copy()
  println(pt) // print auto-generated toString
  println(pt2) // print copied point

  val ok: Result = Result.Success("It worked") // create a sealed subclass instance
  val out = when (ok) { // exhaustive when on sealed class
    is Result.Success -> "Success: ${ok.value}" // handle success
    is Result.Error -> "Error: ${ok.message}" // handle error
  }
  println(out) // print result outcome

  println(Direction.NORTH.rotate(1)) // rotate NORTH by one quarter turn to EAST

  val user = User.create("  dave  ") // create a User via companion factory
  println("User: ${user.username}") // print sanitized username

  Logger.log("App started") // call singleton logger

  val cfg = Config() // create Config demonstrating lazy delegated property
  println(cfg.heavyResource) // access heavyResource to trigger initialization
  println(cfg.heavyResource) // subsequent access uses cached value

  val engine = Engine() // create Engine instance
  val vehicle = Vehicle(engine) // Vehicle delegates Drivable to engine
  println(vehicle.drive()) // calls engine.drive via delegation

  val box: Box<Number> = Box<Int>(42) // Box is covariant so Box<Int> can be assigned to Box<Number>
  println("Box contains: ${box.get()}") // get value from box

  val counter = Counter(5) // create counter with secondary constructor start value
  counter.increment() // increment counter
  // cannot directly set counter.count because setter is private
  println("Counter: ${counter.count}") // print counter value
}
