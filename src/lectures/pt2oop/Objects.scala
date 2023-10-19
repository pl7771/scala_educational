package lectures.pt2oop

object Objects{ //declared main but can be started with extends App

  // SCALA does not have class level functionality (like STATIC in java)
  object Person { // its only instance //static class
    val N_EYES = 2

    def canFly: Boolean = false


    //factory method
    def apply(mother: Person, father: Person): Person = new Person("bob")
  }

  class Person(val name: String) {
    // isntance level functionality

  }
  //THIS 2 ABOVE ARE COMPANIONS



  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // scala object is a singleton instance

    val mary = new Person("mary") //instance of person type
    val john = new Person("john") //same instance and refernce to same memory slot
    print(mary == john)

    val bob = Person(mary, john) //call to apply


    // Scala applications = scala object with important method
    // def main(args: Array[String]): Unit
  }
}
