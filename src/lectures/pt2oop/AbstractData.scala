package lectures.pt2oop

object AbstractData extends App{

  // abstract class
  abstract class Animal { //cannot be instant-d
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {

    override val creatureType: String = "Canine" //override key is not abligatory
    override def eat: Unit = println("Canine is eating")

  }


  //traits // interfaces in java
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Crocodile"

    override def eat: Unit = println("Crocodile eating")

    override def eat(animal: Animal): Unit = println(s"Crocodile eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)


  //diff traits and abs classes
  // 1 - traits can not have constructor parameters
  // 2 - traits inherited by the same classes
  // 3 - traits = behavior
}
