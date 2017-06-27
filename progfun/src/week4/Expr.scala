package week4


trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr

  //  def eval(e: Expr): Int = {
  //    if (e.isNumber) e.numValue
  //    else if (e.isSum) eval(e.leftOp) + eval(e.rigthOp)
  //    else throw new Error("Unknown epression " + e)
  //  }

  // eval using type tests and casts
  def eval(e: Expr): Int =
    if (e.isInstanceOf[Number])
      e.asInstanceOf[Number].numValue
    else if (e.isInstanceOf[Sum])
      eval(e.asInstanceOf[Sum].leftOp) +
        eval(e.asInstanceOf[Sum].rightOp)
      else throw new Error("Unknown expression " + e)
  
  
}

class Number(n: Int) extends Expr {
  def isNumber: Boolean = true
  def isSum: Boolean = false
  def numValue: Int = n
  def leftOp: Expr = throw new Error("Number.leftOp")
  def rightOp: Expr = throw new Error("Number.righOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = true
  def numValue: Int = throw new Error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}


trait Expr2 {
  def eval: Int
  override def toString = eval.toString()
}

class Number2 (n: Int) extends Expr2 {
  def eval: Int = n
  override def toString = eval.toString()
}

class Sum2 (e1: Expr2, e2: Expr2) extends Expr2 {
  def eval: Int = e1.eval + e2.eval
  override def toString = eval.toString()
}
 

// PATTERN MATCHING

trait Expr3{
  def eval: Int = this match {
    case Number3 (n) => n
    case Sum3(e1, e2) =>  e1.eval + e2.eval //eval(e1) + eval(e2)
  }
  
}
case class Number3(n: Int) extends Expr3
case class Sum3(e1: Expr3, e2: Expr3) extends Expr3

/*trait Expr3 {
  def eval: Int = this match {
    case Number3 (n) => n
    case Sum3(e1, e2) =>  e1.eval + e2.eval //eval(e1) + eval(e2)
  }
  //override def toString = eval.toString()
}

class Number3 (n: Int) extends Expr3 {
  def eval: Int = n
  override def toString = eval.toString()
}

class Sum3 (e1: Expr3, e2: Expr3) extends Expr3 {
  def eval: Int = e1.eval + e2.eval
  override def toString = eval.toString()
}
*/ 
