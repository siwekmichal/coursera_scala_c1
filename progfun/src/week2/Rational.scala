package week2

class Rational(x: Int, y: Int){
	require(y != 0, "denominator must by nonzero")


	private def gcd(a: Int, b: Int): Int = if (b == 0 ) a else gcd(b, a % b )
	//private val g = gcd(x,y)
	//def numer = x / g
	//def denom = y / g
	
	def numer = x
	def denom = y
	
	//konstruktor
	def this(x: Int) = this(x,1)
	
	
	def < (that: Rational) =
		this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) =
		if (this < (that)) that else this
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom
		)
	
	def * (that: Rational) =
		new Rational(
			numer * that.numer ,
			denom * that.denom
		)
	
	def unary_- : Rational =
		new Rational(-numer, denom)
	
	def - (that: Rational) =
		this + -that
	
	override def toString = {
		val g = gcd(numer, denom)
		numer/g + "/" + denom/g
	}
	
	
}