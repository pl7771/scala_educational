package lacures.pt2oop

object OOBasics extends App{

  val person = new Person("John", 30)
  println(person.age)
  println(person.x)
  person.greet("Lore")
  person.greet()
}


class Person(name: String, val age: Int = 0) {//constructor
  //class parameters are not fields
  //impl of the class
  //field

  val x = 100

  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
  //overloading
  def greet(): Unit = println(s"Hi I'm ${this.name}")

  //multiple or overloaded constuctors
  // def this(name: String) = this(name, 0)
  // def this() = this("Valerie")
}
