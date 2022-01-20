package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Dinesh", 27)
  val anotherPerson = new anotherPerson("Varma", 27)
  println(person)
  println(anotherPerson.age)
  anotherPerson.greet("Dinesh")
  anotherPerson.greet()

  //-------------

  val author = new Writer("Dinesh", "Varma", 1994)
  val imposter = new Writer("Dinesh", "Varma", 1994)
  val novel = new Novel("Secret", 2021, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter(0)

  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print



}

// Class organizes data and behavior, Basically the blueprint that describe the way things look like

class Person(name: String, age: Int) // Constructor which tells us that every person should have a name and age

// Class parameters name and age are NOT FIELDS cannot be accessed as class.age
// To convert class parameter to field, we need to add var or val before it

class anotherPerson(name: String, val age: Int) { // In this case age can be accessed as anotherPerson.age

  //body

  // method
  def greet(name: String): Unit = {
    println(s"${this.name} says: Hi, $name") // this will be implied when there is no other field with name
  }

  // method overloading
  def greet(): Unit = println(s"Hi, I am ${this.name}")

  //Overloading Constructors

  def this(name: String) = this(name, 0)

}

/**
 * Novel and Writer Class
 *
 * Writer, Firstname, surname, year
 *    - method fullName
 *
 *  Novel - name, year of release, author
 *    - methods,
 *    authorAge at year of release ,
 *    isWrittenBy(author),
 *    copy(new year of release) = new instance of Novel
 */

class Writer(firstname: String, surname: String, val year: Int){
  def fullName: String = firstname + " " + surname
}

class Novel(name: String, year: Int, author: Writer){
  def authorAge: Int = year - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/**
 * Counter class
 * - receive an int
 * - method current count
 * - method increment/ decrement => new Counter
 * - overload inc/dec to receive an amount
 */

class Counter(n: Int){
  def count = n

  def inc = {
    println("incrementing")
    new Counter(count + 1)
  } // Immutability => if we need to modify an instance we need to create new instance

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)




}




