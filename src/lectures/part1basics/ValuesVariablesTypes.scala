package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 9
  println(x)

//  x = 3 Vals are immutable, Cannot be re assigned

  val aString: String = "hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'C'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 876546676766L
  println(aLong)
  val aDouble: Double = 3.4
  val aFloat: Float = 2.3f


  // Variables in Scala

  var aVariable: Int = 5
  aVariable = 8

  // Variables are mutable | These are side effects to our program,
  // as these can be changed and we can print one in the console and see other in the program



}