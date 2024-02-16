package HOF

object HigherOrderFunction extends App {
  // Higher-order function that takes a function 'f' and an integer 'x', and applies 'f' to 'x'
  def applyFunction(f: Int => Int, x: Int): Int = f(x)

  // Function to be passed to 'applyFunction', which doubles its input
  def double(x: Int): Int = x * 2

  // Using 'applyFunction' with the 'double' function and a number
  val result = applyFunction(double, 5)

  println(s"Result of doubling 5: $result")
}


object FunctionReturningFunction extends App {
  // Higher-order function that returns a new function
  // The returned function adds a specific number to its input
  def createAdder(addend: Int): Int => Int = {
    x => x + addend // Lambda expression returning a function that adds 'addend' to its input
  }

  // Create an 'adder' function that adds 5 to its input
  val addFive: Int => Int = createAdder(5)

  // Use the 'addFive' function
  println(addFive(26))

  // Create another 'adder' function that adds 10 to its input
  val addTen: Int => Int = createAdder(10)

  // Use the 'addTen' function
  println(addTen(35))
}


