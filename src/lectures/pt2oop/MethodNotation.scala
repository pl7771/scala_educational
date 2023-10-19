package lectures.pt2oop

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {


    def unary_! : String = s"${this.name} oke" // space is very important

    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} hangs out with ${person.name}"
    def +(person: Person): String = s"${this.name} hangs out with ${person.name}"

    //_____
    //exerc
    def +(nickname: String): Person = new Person(this.name+ s" ${nickname}", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def learns(name: String) = s"${this.name} learns $name"
    def learnsScala():String = this.learns("Scala")
    def apply(number: Int): String = s"${this.name} watched $favoriteMovie $number times"

    //______


    //post
    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name" //important this method name
  }

  val ilya = new Person("Ilya", "Inception")
  println(ilya.likes("Inception"))

  println(ilya likes "Inception") //equivalent = infix notation = operation notation

  // "operators" in scala
  val leo = new Person("Leonardo", "Avatar")
  println(ilya hangOutWith leo)
  println(ilya + leo)

  // ALL OPERATORS ARE METHODS


  //PREFIX notation
  val x = -1 //- is unary operator
  val y = 1.unary_- // works only with - + ~ ! operators

  println(leo.unary_!)
  println(!leo)


  //POSTFIX notation
  println(leo.isAlive) //oop basics
  println(leo isAlive) //postfix notation

  //APPLY
  println(leo.apply())
  println(leo()) //apply method actually called


  println("______________________________")
  println((leo + "the rockstar").apply())
  println((+leo).age)
  println(leo learnsScala)
  println(leo(10))


}
