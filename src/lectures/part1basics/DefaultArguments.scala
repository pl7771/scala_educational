package lectures.part1basics

object DefaultArguments extends App {

  def trFactorial(n: Int, acc: Int = 1): Int = {
    if (n == 1) acc
    else trFactorial(n-1, acc*n)
  }

  val fact10 = trFactorial(10)


  def savePictures(format: String = "jpg", width: Int = 200, height: Int = 200): Unit = {
    println("Picture saved")
  }

  //savePictures(800)
  // 1. Pass every leading argument
  // 2. Name the arguments
  savePictures(width = 800)
}
