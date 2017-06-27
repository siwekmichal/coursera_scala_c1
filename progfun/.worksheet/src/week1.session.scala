package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(40); val res$0 = 
  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(44); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(314); 

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnought(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnought(guess: Double) =
      abs(guess * guess - x) / x < 0.01

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$1 = 
  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 
  sqrt(4);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e-6);System.out.println("""res3: Double = """ + $show(res$3));$skip(16); val res$4 = 

  sqrt(0.001);System.out.println("""res4: Double = """ + $show(res$4));$skip(16); val res$5 = 
  sqrt(0.1e-20);System.out.println("""res5: Double = """ + $show(res$5));$skip(15); val res$6 = 
  sqrt(1.0e20);System.out.println("""res6: Double = """ + $show(res$6));$skip(15); val res$7 = 
  sqrt(1.0e50);System.out.println("""res7: Double = """ + $show(res$7));$skip(107); 


	// gratest common divisor of two numbers
	def gcd(a: Int, b: Int): Int =
		if (b==0) a else gcd(b, a%b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(16); val res$8 = 

	gcd(120, 100);System.out.println("""res8: Int = """ + $show(res$8));$skip(96); 
	
	
	
	//factorial - silnia
	def factorial(n: Int): Int =
		if (n==0) 1 else n * factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$9 = 
	factorial(10);System.out.println("""res9: Int = """ + $show(res$9))}
	
	
}
