package week3

import week3._

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  
  def prepend[U >: T] (elem: U): List[U] = new Cons(elem, this)
}

class Cons[T]( val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
  
}

/*
 	-- old version - week 3
class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}


//def singelton[T](elem: T) = new Const[T](elem, Nil[T])

object List {
  //List (1,2) = List.apply(1,2)
  
  def apply[T](x1: T, x2: T): List[T] = new Const(x2, new Const(x2, new Nil))
  def apply[T] = new Nil
}

*/

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x: List[String] = Nil
  def f(xs: List[NonEmpty], x: Empty ) = xs prepend x  // result type is List[IntSet] because IntSet is supertype of Empty and NonEmpty
}