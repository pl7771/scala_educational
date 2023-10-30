package lectures.pt2oop

import scala.collection.parallel.mutable.UnrolledParArrayCombiner.CopyUnrolledToArray

object Generics extends App {

  class MyList[+A] { //generic class //also works for TRAITS
    // use type A
    //def add(element: A): MyList[A] = ???
  }



  class MyMap[Key, Value]

  val listOfInt = new MyList[Int]
  var listOfStrings = new MyList[String]


  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emtptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal
  //LIst of cats axtends list of animal = COVARIANCE = OK
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //animalList.add(new Dog) ? HARD QUESTION

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantANimalList: InvariantList[Cat] = new InvariantList[Cat]

  //3. NO = CONTRAVARIAnCE
  class Trainer[-A]
  val contraVariantList: Trainer[Cat] = new Trainer[Animal]



  //BOUNDED TYPES
  class Cage[A <: Animal](animal: A) //Class Cage only accepts TypeParameters A which are subtypes of Animal
  val cage = new Cage(new Dog)

  class Cage2[A >: Animal](animal: A) //Class Cage only accepts TypeParameters A which are supertypes of Animal
  val cage2 = new Cage2(new Object)





}
