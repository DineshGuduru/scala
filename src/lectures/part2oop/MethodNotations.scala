package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person) = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, I am $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie, $n times"

    def learns(thing: String): String = s"$name is learning $thing"
    def learnsScala(): String = this learns "scala"



  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception" ) // infix notation or operator notation -> works on objects with methods having one parameter

  // "operators" in scala
  val tom = new Person("Tom", "Bahubali")
  println(mary + tom)

  // We can rename hangOutWith to + or any other operator

  // ALL OPERATORS ARE METHODS


  //prefix notation
  val x = -1 // - here is unary operator
  val y = 1.unary_- // This is equivalent to -1
// unary_prefix works only with fewer operators - + ! ~
  println(!mary)
  println(mary.unary_!) // Both of these are same

  //postfix notation -> Only available to methods without parameters
  println(mary.isAlive)
  println(mary isAlive)


  // apply
  println(mary.apply())
  println(mary())  // Equivalent


  /**
   * overload + operator
   * add age to person class
   * add unary + operator
   * add learns method
   * overload apply method
   *
   */

  println((mary + "The Rockstar")())

  println((mary + "The Rockstar").apply())

  println((+mary).age)

  println(mary learnsScala)

  println(mary(2))
}
