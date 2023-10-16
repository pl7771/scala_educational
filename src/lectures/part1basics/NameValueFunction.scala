package lectures.part1basics

object NameValueFunction extends App{

  def calledByValue(x: Long): Unit = {
    println(s"by value= ${x}") //println(s"by value= 252753524831200L")
    println(s"by value= ${x}")
  }

  def calledByName(x: => Long): Unit = {
    println(s"by name= ${x}") //println(s"by name= ${System.nanoTime()}")
    println(s"by name= ${x}")
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infiniteRecursion(): Int = 1 + infiniteRecursion()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infiniteRecursion(), 10)
  printFirst(10, infiniteRecursion())
}
