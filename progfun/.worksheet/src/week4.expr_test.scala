package week4

import week4._
object expr_test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(173); 
  def show(e: Expr3): String = e match {
		case Number3(x) => x.toString
		case Sum3(l, r) => show (l) + " + " + show (r)
	};System.out.println("""show: (e: week4.Expr3)String""");$skip(39); val res$0 = 
	
	show(Sum3(Number3(1), Number3(44)));System.out.println("""res0: String = """ + $show(res$0));$skip(31); val res$1 = 
	Sum3(Number3(1), Number3(44));System.out.println("""res1: week4.Sum3 = """ + $show(res$1));$skip(87); val res$2 = 
	new Sum(new Number(1), new Number(2)) ==
	(new Sum2(new Number2(1), new Number2(2)) );System.out.println("""res2: Boolean = """ + $show(res$2))}
}
