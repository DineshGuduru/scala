package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11)) // 7 inclusive and 11 exclusive
  println(str.split(" ").toList) // returns an array of words separated by " "
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)
  println(str.reverse)
  println(str.take(2))

  val aNumberString = "1234"
  val aNumber = aNumberString.toInt
  println("a" +: aNumberString :+ "b")  // prepending and appending
  println('a' +: aNumberString :+ 'b')

  // Scala-specific; String interpolators

  // S-interpolator

  val name: String = "Dinesh"
  val age: Int = 27
  println(s"Hello, I am $name, I am $age years old")
  println(s"Hello, I am $name, I will be turning ${age + 1} yeard old")

  // F-Interpolator

  val speed = 19.2f
  val myth = f"$name can eat $speed%2.2f burger per minute" // float - 2 chars minimum and 2 decimals

  println(myth)


  // raw-Interpolator

  println(raw"This is a \n newline") // Cannot escape

  val escaped = "This is a \n newline"

  println(raw"$escaped") // Escapes escape characters

}
