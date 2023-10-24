package exercises

abstract class MyList {

  //single linked list
  //integers
  //head = first element of this list
  //tail = remainder of the list
  //isEmpty: bool
  //add(int) ret new list with element added
  //override to string => string representation of the list

  def head(): Int
  def tail(): MyList
  def isEmpty(): Boolean
  def add(element: Integer): MyList

  def printElements: String
  override def toString: String = "[" + printElements +"]"
}

object Empty extends MyList {

  override def head(): Int = throw new NoSuchElementException
  override def tail(): MyList = throw new NoSuchElementException
  override def isEmpty(): Boolean = true
  override def add(element: Integer): MyList = new Cons(element, Empty)

  override def printElements: String = ""
}

class Cons(head: Int, tail: MyList) extends MyList {

  override def head(): Int = head
  override def tail(): MyList = tail
  override def isEmpty(): Boolean = false
  override def add(element: Integer): MyList = new Cons(element, this)

  override def printElements: String = {
    if(tail.isEmpty()) "" + head
    else head + " " + tail.printElements
  }
}


object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, new Cons(4, Empty))))
  println(list.tail.head())
  println(list.add(5).head)
  println(list.isEmpty())
  //pomymorphic call
  println(list.toString)
}