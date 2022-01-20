package lectures.part2oop

object Objects {

  // SCALA DOESN'T HAVE CLASS LEVEL FUNCTIONALITY("static")
  object Person{ // type + it's only instance
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String){  // This is the only instance of this type
    // Instance level functionality

  }
    // Writing Objects and Classes with same name is called COMPANIONS

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object is a singleton instance
    val person1 = Person
    val person2 = Person

    println(person1 == person2) // prints true because mary are john are same instances of Person

    // Now look at the below , mary and john are not the same they are different instances of person

    val mary = new Person("Mary")
    val john = new Person("John")

    println(mary == john)

    val bobbie = Person.apply(mary, john)

  }

  // Scala Application = scala object with the mein method
  // def main(args: Array[String]): Unit - Scala apps has to be scala objects with this method

}
