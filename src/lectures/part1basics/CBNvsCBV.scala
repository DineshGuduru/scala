package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = { // x is evaluated before function is called in by value
    println("By Value: " + x)
    println("By Value: " + x)
  }

  def calledByName(x: => Long): Unit = { // x is passed as an expression as is and evaluated every time it is used in function
    // Delays the evaluation of expression , used in lazy implementations
    println("By Name: " + x)
    println("By Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /**
   *  By Value: 528352471212945
      By Value: 528352471212945
      By Name: 528352538920571
      By Name: 528352538966756
   */

}
