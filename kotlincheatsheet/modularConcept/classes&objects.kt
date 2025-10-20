fun main() {
   // ---------------------------------------------
    // Concept 6: Classes and Objects
    // ---------------------------------------------
    /*
     * A class is a blueprint for objects.
     * An object is an instance of a class.
     * Classes can have properties (variables) and methods (functions).
     */
    class Person(val name: String, var age: Int) {
        fun introduce() {
            println("Hi, I'm $name and I'm $age years old.")
        }

        fun celebrateBirthday() {
            age++
            println("Happy Birthday! I am now $age.")
        }
    }

    val personInstance = Person("Bob", 25)
    personInstance.introduce()
    personInstance.celebrateBirthday()

}
