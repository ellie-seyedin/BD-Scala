object DataType {
  def main(args: Array[String]): Unit = {
    val a: Byte = 2
    val b: Int = 444
    val c: Long = 324324
    val d: Short = 5
    val e: Double = 2.0
    //compiler automatically detect data type
    //This feature is called variable type inference.
    val j = 24 // defaults to Int

    val str = "hello"
    val index = str.indexOf('h')
    println(index)
  }
}
