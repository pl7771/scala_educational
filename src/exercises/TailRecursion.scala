package exercises

import scala.annotation.tailrec

object TailRecursion extends App{

  // 1. concatenate string n times
  def concatTailRec(name: String, times: Int): String = {
    def helper(name: String, times: Int, acc: String): String = {
      if (times == 0) acc
      else helper(name, times-1, name+acc)
    }
    helper(name, times, "")
  }
  println(concatTailRec("A", 5))


  // 2. Is prime - tail recursive
  def prime(n: Int): Boolean = {
    def helper(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t == 1) true
      else helper(t-1, n % t != 0 && isStillPrime)
    }
    helper(n/2, true)
  }
  println(prime(2003))
  println(prime(2000))


  // 3. fibonacci tail recursive
  def fibonacci(n: Int): Int = {
    def helper(i: Int, firstAcc: Int, secondAcc: Int): Int = {
      if(i >= n) firstAcc
      else helper(i+1, firstAcc + secondAcc, firstAcc)
    }
    if(n<=2)1
    else helper(2,1, 1)
  }
}
