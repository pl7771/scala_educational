package exercises

object Functions extends App{

  //1. A greeting function
  def greet(name: String, age: Int): Unit = println(s"My name is $name and im $age years old")
  greet("Leonardo", 33)

  //2. Factorial 1 * 2 * 3 * 4 * ... * n
  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * (factorial(n-1))
  }
  println(factorial(5))

  //3. Fibonacci f1 = 1 , f2 = 1, f3 = f2 + f1, fn = f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    if (n == 1) 1
    else if (n == 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))

  //4. Test if number is prime
  def prime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n / 2)
  }
  println(prime(31))
  println(prime(30))
}
