package Immutable

// Define an immutable case class
case class Person(name: String, age: Int)


object Main extends App {
  // Create an instance of Person
  val person1 = Person("John", 30)
  val person2 = Person("Alice", 25)


  // Access fields of person1
  println(s"Name: ${person1.name}, Age: ${person1.age}\n")

  // Trying to modify 'person1' directly will result in a compilation error
  // person1.age = 31  // This will not compile

  // Instead, you create a new instance if you need to "modify" it
  val person3 = person1.copy(age = 31)

  // person1 remains unchanged
  println("Original person:")
  println(person1)

  // New person with modified age
  println("\nModified person:")
  println(person3)
}
