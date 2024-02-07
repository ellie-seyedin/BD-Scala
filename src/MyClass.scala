class MyClass {

// Code block executed when an instance of MyClass is created
  {
    println("Executing code block in MyClass constructor")
  }

  def sayHello(): Unit = {
    println("Hello from MyClass")
  }
}

object Main1{
  def main(args: Array[String]): Unit = {
    val obj = new MyClass()
    obj.sayHello()
  }
}

