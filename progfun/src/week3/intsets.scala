package week3

object intsets {
  val t1 = new NonEmpty(3, new Empty, new Empty)          //> t1  : week3.NonEmpty = {.3.}
  val t2 = t1 incl 4                              //> t2  : week3.IntSet = {.3{.4.}}
  t2 incl 1                                       //> res0: week3.IntSet = {{.1.}3{.4.}}
  t1 incl 9                                       //> res1: week3.IntSet = {.3{.9.}}
  t2 union t1                                     //> res2: week3.IntSet = {.3{.4.}}
  
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union (other: IntSet): IntSet
}

//object Empty extends IntSet {
//  def contains(x: Int): Boolean = false
//  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
//  def union (other: IntSet): IntSet = other
//  override def toString = "."
//}
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union (other: IntSet): IntSet = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    
  def union (other: IntSet): IntSet =
  	((left union right) union other) incl elem

  override def toString = "{" + left + elem + right + "}"
}