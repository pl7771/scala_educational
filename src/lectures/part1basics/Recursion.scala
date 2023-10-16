package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else
    {
      println(s"Computing factorial of $n but first i need factorial of "+(n-1))
      var result = n * factorial(n-1)
      println(s"Computed factorial of $n")
      result
    }

  }


  def anotherFactorial(n: Int): BigInt = {
    @tailrec //use tail recursion
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1, x*accumulator)
    }
    factorialHelper(n, 1)
  }
  println(anotherFactorial(5000))


}
