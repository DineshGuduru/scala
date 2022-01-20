package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // THis is an expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  var aVariable = 3
  aVariable += 4 // Also works with *= -= /=

  println(aVariable)

  // Instructions(DO)  Vs Expressions (VALUE)

  // IF expression

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION - If in scala is an expression
  println(aConditionedValue)

  var i = 0
//  while(i < 10) {
//    println(i)
//    i += 1
//  }

  // Never write above loop again instead use below

  // EVERYTHING in Scala is an Expression

  val aWierdValue = (aVariable = 3)
  println(aWierdValue)

  // Side Effects -> Above is a sideeffect in scala, Because it is an expression resulting void or Unit
  // println(), while, reassigning are some example side effects

  // Code Blocks

  val aCodeBlock = {
    val x = 4
    val y = x + 1

    if (y > 2) "hello" else "goodbye"
  }



}
