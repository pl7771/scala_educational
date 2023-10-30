package exercises

abstract class MyList[+A] {

  //single linked list
  //integers
  //head = first element of this list
  //tail = remainder of the list
  //isEmpty: bool
  //add(int) ret new list with element added
  //override to string => string representation of the list

  def head(): A
  def tail(): MyList[A]
  def isEmpty(): Boolean
  def add[B >: A](element: B): MyList[B]

  def printElements: String
  override def toString: String = "[" + printElements +"]"
}

object Empty extends MyList[Nothing] {

  override def head(): Nothing = throw new NoSuchElementException
  override def tail(): MyList[Nothing] = throw new NoSuchElementException
  override def isEmpty(): Boolean = true
  override def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

  override def printElements: String = ""
}

class Cons[+A](head: A, tail: MyList[A]) extends MyList[A] {

  override def head(): A = head
  override def tail(): MyList[A] = tail
  override def isEmpty(): Boolean = false
  override def add[B >: A](element: B): MyList[B] = new Cons(element, this)

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