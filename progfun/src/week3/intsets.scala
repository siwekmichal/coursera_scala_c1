package week3



abstract class IntSet2 {
  def incl(x: Int): IntSet2
  def contains(x: Int): Boolean
  def union (other: IntSet2): IntSet2
}

//object Empty extends IntSet {
//  def contains(x: Int): Boolean = false
//  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
//  def union (other: IntSet): IntSet = other
//  override def toString = "."
//}
class Empty extends IntSet2 {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet2 = new NonEmpty(x, new Empty, new Empty)
  def union (other: IntSet2): IntSet2 = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet2, right: IntSet2) extends IntSet2 {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet2 =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    
  def union (other: IntSet2): IntSet2 =
  	((left union right) union other) incl elem

  override def toString = "{" + left + elem + right + "}"
}

object intsetstest {
  val t1 = new NonEmpty(3, new Empty, new Empty)          //> t1  : week3.NonEmpty = {.3.}
  val t2 = t1 incl 4                              //> t2  : week3.IntSet = {.3{.4.}}
  t2 incl 1                                       //> res0: week3.IntSet = {{.1.}3{.4.}}
  t1 incl 9                                       //> res1: week3.IntSet = {.3{.9.}}
  t2 union t1                                     //> res2: week3.IntSet = {.3{.4.}}
  
}