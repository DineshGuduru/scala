package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def tailFact(n: Int, acc: Int = 1): Int = { // Here acc = 1 is the default value
    if ( n <= 1) acc
    else tailFact(n-1, n * acc)
  }

  val fact10 = tailFact(10)

  println(fact10)

  def savePicture(format: String = "jpeg", width: Int, height: Int): Unit = println("Saving Picture")

  /** In the above def, format is a leading parameter cannot be ignored while calling the function, Tjrows compilation error
      1. The solution to the above problem is
            a. to name the arguments while passing them like shown below
            b. Always pass leading parameters

            savePicture(width = 100, height = 100)

      2. But if all the arguments has default value, THe function can be called with none of the parameters included


 */

}
