package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 50 // vals are IMMUTABLE const in Java
  println(x)

  val y = 50 // compiler figures out the type
  println(y)

  val s1 = "Type is string"
  println(s1)

  val boo: Boolean = true
  println(boo)

  val aChar: Char = 'a'
  val aShort: Short = 4387 //same with Long, Double 2.44, Float 2.11f

  //variables var, used less in Functional programming
  var aVar: Int = 100
  aVar = 1000
  println(aVar)
}
