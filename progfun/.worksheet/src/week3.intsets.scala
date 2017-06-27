package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(21); 
  val t2 = t1 incl 4;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(12); val res$0 = 
  t2 incl 1;System.out.println("""res0: week3.IntSet = """ + $show(res$0));$skip(12); val res$1 = 
  t1 incl 9;System.out.println("""res1: week3.IntSet = """ + $show(res$1));$skip(14); val res$2 = 
  t2 union t1;System.out.println("""res2: week3.IntSet = """ + $show(res$2))}
  
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union (other: IntSet): IntSet
}

object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
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
