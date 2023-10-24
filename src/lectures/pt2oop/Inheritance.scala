package lectures.pt2oop

object Inheritance extends App {

  sealed class Animal {
    val creature = "Wild"
    def eat = println("I am eating")
  }

  class Cat extends Animal {
    def crunch = {
      eat //only in subclass if protected modifier
      println("Omnomnom")
    }
  }

  val cat = new Cat
  cat.crunch

  // single inheritance only



  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, age = 0)
  }
  class Adult(name: String, age: Int, id: String) extends Person(name)


  //overridong
  /*class Dog(override val creature: String) extends Animal {
    //override val creature = "domestic"
    override def eat = println("Crack crack")
  }*/
  class Dog(dogType: String) extends Animal {
    override val creature = dogType
    override def eat = {
      super.eat
      println("DOG eating")
    }
  }


  val dog = new Dog("EATTOOMUCH")
  dog.eat
  println(dog.creature)


  //type substitution
  val unknownAnimal: Animal = new Dog("Hungry") //polymorphism
  unknownAnimal.eat

  //super
  // ref the parent class


  //preventing overrides
  // 1 - final - is final and connt be overriden
  // 2 - final in class
  // 3 - SEAL the class  - extends only THIS file, but not the others: KEYWORD "sealed"
}
