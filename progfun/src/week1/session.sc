package week1

object session {
  1 + 2                                           //> res0: Int(3) = 3
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnought(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnought(guess: Double) =
      abs(guess * guess - x) / x < 0.01

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res1: Double = 1.4166666666666665
  sqrt(4)                                         //> res2: Double = 2.000609756097561
  sqrt(1e-6)                                      //> res3: Double = 0.0010005538710539446

  sqrt(0.001)                                     //> res4: Double = 0.031642015868650786
  sqrt(0.1e-20)                                   //> res5: Double = 3.1633394544890125E-11
  sqrt(1.0e20)                                    //> res6: Double = 1.002075063550277E10
  sqrt(1.0e50)                                    //> res7: Double = 1.000873029120681E25


	// gratest common divisor of two numbers
	def gcd(a: Int, b: Int): Int =
		if (b==0) a else gcd(b, a%b)      //> gcd: (a: Int, b: Int)Int

	gcd(120, 100)                             //> res8: Int = 20
	
	
	
	//factorial - silnia
	def factorial(n: Int): Int =
		if (n==0) 1 else n * factorial(n-1)
                                                  //> factorial: (n: Int)Int
	factorial(10)                             //> res9: Int = 3628800
	
	
}