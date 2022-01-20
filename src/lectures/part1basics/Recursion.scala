package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Long): Long = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  println("Factorial")
  println(factorial(50))

  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, acc: BigInt): BigInt = {
      if (x < 1) acc
      else factHelper(x - 1, x * acc)  // TAIL RECURSION, Use recursive call as the last expression
    }
    factHelper(n, 1)
  }

  println("Another Factorial")
  println(anotherFactorial(50))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  @tailrec
  def concatenateTailrec(aString: String, n: Int, acc: String): String = {
    if (n < 1) acc
    else concatenateTailrec(aString, n - 1, acc + aString)
  }

  println(concatenateTailrec("dinesh", 3, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTail(t: Int, isPrime: Boolean): Boolean =
      if (!isPrime) false
      else if (t <= 1) true
      else isPrimeTail(t - 1, n % t != 0 && isPrime)
    isPrimeTail(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(694))
}
