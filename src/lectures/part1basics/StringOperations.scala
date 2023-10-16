package lectures.part1basics

object StringOperations extends App {

  val str: String = "Learning scala for the first time"

  println(str.charAt(2))
  println(str.subSequence(0, 9))
  println(str.split(" ").toList)
  println(str.startsWith("scala"))
  println(str.replace('a', 'A'))
  println(str.toLowerCase())
  println(str.length)

  val aNumber = "100"
  val aNumberString = "100".toInt

  println('a' +: aNumber :+ 'z')

  println(aNumber.reverse)
  println(aNumber.take(3))

  // String interpolators
  


}
