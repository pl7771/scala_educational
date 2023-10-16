package exercises

object OOPbasics1 extends App{
  val author = new Writer("Leonardo", "Davinci", 1972)
  val impostor = new Writer("Leonardo", "Davinci", 1972)
  val novel = new Novel("Die Hard", 1992, author )
  println(novel.isWrittenby(author))
  println(novel.isWrittenby(impostor))


  println(s"In the author age: ${novel.authorAge()}")

  val counter = new Counter(0)
  counter.increment.increment.increment(10).decrement.decrement(2).print

}


class Novel(name: String, year: Int, author: Writer){
  def authorAge(): Int = this.year - author.year
  def isWrittenby(author: Writer): Boolean = author == this.author
  def copy(newYearRelease: Int): Novel = new Novel(this.name, newYearRelease, this.author)
}

class Writer(firstName: String, surname: String, val year: Int){
  def fullname(): String = s"$firstName $surname"
}

class Counter(counter: Int = 0) {
  def currentCount() = this.counter
  def increment(): Counter = new Counter(this.counter + 1)
  def decrement(): Counter = new Counter(this.counter - 1)
  // def increment(by: Int): Counter = new Counter(this.counter + by)
  // def decrement(by: Int): Counter = new Counter(this.counter - by)
  def increment(by: Int): Counter = {
    if (by == 0) this
    else this.increment().decrement(by-1)
  }

  def decrement(by: Int): Counter = {
    if (by == 0) this
    else decrement().decrement(by-1)
  }

  def print() = println(currentCount())
}