package TransformOnCollection

object Transformation extends App {
  val numbers = List(1, 2, 3, 4, 5)
  //Transform each element of a collection
  val doubledNumbers = numbers.map(_ * 2)
  println(s"Double of numbers: $doubledNumbers")
}

object Filter extends App {
  val names = List("Uttam", "Elaheh", "Anu", "Keith", "Sebastian", "Sanket", "Pravith", "Asad", "Solomon", "Hocine", "Nazir")
  //Filter elements based on a predicate
  val withS = names.filter(_.startsWith("S"))
  println(s"Start with S: $withS")
}

object FlatMap extends App {
  val nestedNumbers = List(List(1, 2), List(3, 4), List(5, 6))
  //Transform and flatten nested collections
  val flattenedNumbers = nestedNumbers.flatMap(identity) //identity is a predefined function that returns its input argument unchanged.
  println(s"Flattened Numbers: $flattenedNumbers")
}

object FlatMap2 extends App {
  val nestedWords = List(List("Big  ,  Data"), List("Team,   is"), List("a Dream Team ;)"))
  val words = nestedWords.flatMap(_.flatMap(_.split(','))).map(_.trim)
  val result = words.mkString(" ")
  println(s"Full Sentence is: $result")
}

object FoldLeft extends App {
  val numbers = List(1, 2, 3, 4, 5)
  //Aggregate elements from left to right
  val sum = numbers.foldLeft(0)(_ + _)
  println(s"Sum of all is: $sum")
}

object GroupBy extends App {
  val words = List("apple", "banana", "orange", "peach", "pear")
  // Group elements based on a key
  val groupedByLength = words.groupBy(_.length)
  println(s"Group by based on length: $groupedByLength")
}

object ForEach extends App {
  val numbers = List(1, 2, 3, 4, 5)
  // Apply a function to each element without returning a new collection.
  numbers.foreach(println)
}

object ChainingOperation extends App {
  val numbers = List(1, 2, 3, 4, 5)
  //Chaining operations with using filter, map, sum
  val result = numbers.filter(_ % 2 == 0).map(_ * 2).sum
  println(s"Result is: $result")
}