package week2
import week2.Rational

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(484); 
  //val x  =new Rational(1,2)
  //x.numer
  //x.denom
 
 /* def addRational(r: Rational, s: Rational): Rational =
		new Rational (
			r.numer * s.denom + s.numer * r.denom,
			r.denom* s.denom
		)
		
	def makeString(r: Rational) =
		r.numer + "/" + r.denom
		
	println(makeString(x))
	
	makeString(addRational(new Rational(1,2), new Rational(2,3)))
   */
  
 // val y = new Rational(2,3)
 // x.add(y)

	val x = new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(27); 
	val y = new Rational(5,7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(9); val res$0 = 
	
	x + y;System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(4); val res$1 = 
	-x;System.out.println("""res1: week2.Rational = """ + $show(res$1));$skip(11); val res$2 = 
	x - y - z;System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(7); val res$3 = 
	y + y;System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(11); val res$4 = 
	
	x < (y);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(9); val res$5 = 
	x max y;System.out.println("""res5: week2.Rational = """ + $show(res$5));$skip(73); val res$6 = 
	
	//val strange = new Rational(1,0)
	
	//wykorzystanie
	new Rational(2);System.out.println("""res6: week2.Rational = """ + $show(res$6));$skip(27); val res$7 = 
	
	new Rational(1,2).numer;System.out.println("""res7: Int = """ + $show(res$7));$skip(17); val res$8 = 
	
	x * x + y * y;System.out.println("""res8: week2.Rational = """ + $show(res$8))}
   
}
