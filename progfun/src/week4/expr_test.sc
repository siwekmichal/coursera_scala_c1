package week4

import week4._
object expr_test {
  def show(e: Expr3): String = e match {
		case Number3(x) => x.toString
		case Sum3(l, r) => show (l) + " + " + show (r)
	}                                         //> show: (e: week4.Expr3)String
	
	show(Sum3(Number3(1), Number3(44)))       //> res0: String = 1 + 44
	Sum3(Number3(1), Number3(44))             //> res1: week4.Sum3 = Sum3(Number3(1),Number3(44))
	new Sum(new Number(1), new Number(2)) ==
	(new Sum2(new Number2(1), new Number2(2)) )
                                                  //> res2: Boolean = false
}