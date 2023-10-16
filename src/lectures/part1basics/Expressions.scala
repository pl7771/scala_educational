package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 //Expression
  println(x)

  println(x == 1) //false
  // like in java || && ! <= < == => > // /= +=


  // Instructions (DO) vs expressions (Compute a VALUE)
  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 //java ? 5 : 3
  println(aConditionedValue)

  var i = 0 //NEVER USE THIS ITERATIONS like WHILE or FOR
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }
  //EVERYTHING IS AN EXPRESSION

  val aValue = (i = 3) //unit = void = () <- id printed out
  println(aValue) // ()

  //code block
  val aCodeBLock = {
    val a = 2
    val b = a + 2
    if (a > b) "hi" else "bye"
  }
  println(aCodeBLock)

 // Expressions are EVALUATED, instructions are EXECUTED





}
