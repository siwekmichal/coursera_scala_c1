package week3

import week2.Rational

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); val res$0 = 
  new Rational(1, 2);System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(51); 
  
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(39); 
  
  //error("test")
  
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(47); val res$1 = 
	
	//val z: Int = null
	if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1))}
}
