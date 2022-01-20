package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String) {

    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person) = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, I am $name and I like $favouriteMovie"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception" ) // infix notation or operator notation -> works on objects with methods having one parameter

  // "operators" in scala
  val tom = new Person("Tom", "Bahubali")
  println(mary hangOutWith tom)

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








}
