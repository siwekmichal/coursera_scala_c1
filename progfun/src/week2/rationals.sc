package week2
import week2.Rational

object rationals {
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

	val x = new Rational(1,3)                 //> x  : week2.Rational = 1/3
	val y = new Rational(5,7)                 //> y  : week2.Rational = 5/7
	val z = new Rational(3,2)                 //> z  : week2.Rational = 3/2
	
	x + y                                     //> res0: week2.Rational = 22/21
	-x                                        //> res1: week2.Rational = 1/-3
	x - y - z                                 //> res2: week2.Rational = -79/42
	y + y                                     //> res3: week2.Rational = 10/7
	
	x < (y)                                   //> res4: Boolean = true
	x max y                                   //> res5: week2.Rational = 5/7
	
	//val strange = new Rational(1,0)
	
	//wykorzystanie
	new Rational(2)                           //> res6: week2.Rational = 2/1
	
	new Rational(1,2).numer                   //> res7: Int = 1
	
	x * x + y * y                             //> res8: week2.Rational = 274/441
   
}