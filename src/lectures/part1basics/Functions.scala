package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = a + " " + b
  println(aFunction("Hello", 100))

  def aFunction2(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction2("Hello", 100))

  def funcWithoutParameters(): Int = 42
  println(funcWithoutParameters())
  println(funcWithoutParameters)

  def aRepeatedFunctions(a: String, n: Int): String = {
    if (n == 1) a
    else a + aRepeatedFunctions(a, n-1)
  }
  println(aRepeatedFunctions("A ", 10))

  // WHEN YOU NEED LOOPS USE RECURSION

  def aFuncWithSideEffect(a: String): Unit = println(a)

  def aBigFunc(n: Int): Int = {
    def aSmallFunc(a: Int, b: Int): Int = a + b
    aSmallFunc(n, n-1)
  }



}
