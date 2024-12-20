```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Int = x + 1
}

object Main extends App {
  val obj = new MyClass()
  val obj2 = new MyClass(5)
  println(obj.myMethod()) // Output: 1
  println(obj2.myMethod()) // Output: 6
}
```