package week2

object higherOrderFunction {
    def sum( f: Int => Int, a: Int, b : Int ): Int = ( 
      if (a > b) 0 
      else f(a) + sum(f, a+1, b)
    )
    
    def sumInts(a: Int, b: Int)   =   sum(id, a, b)
    def sumInts2(a: Int, b: Int)   =   sum(x => x, a, b)
    
    def sumCubes(a: Int, b: Int) =   sum(cube, a, b)
    def sumCubes2(a: Int, b: Int) =   sum(x => x * x * x, a, b)
    
    def sumFacts(a: Int, b: Int)  =   sum(fact, a, b)
    
    
    
    def id (x: Int): Int   = x
    def cube (x: Int): Int  = x * x * x
    def fact (x: Int): Int = if (x == 0 ) 1 else fact (x -1)
    
    
    def sum_recursive( f: Int => Int, a: Int, b : Int ): Int = {
      
        def loop (a: Int, acc: Int): Int = {
          if (a > b) acc
          else loop (a+1, f(a) + acc)
        }
        loop (a, 0)
  }
    
    
   def sum (f: Int => Int): (Int, Int) => Int = {
     def sumF (a: Int, b: Int): Int = 
       if (a > b) 0
       else f(a) + sumF(a + 1, b)
       sumF
   }
   def sum2 (f: Int => Int)(a: Int, b: Int): Int = 
     if (a > b) 0 else f(a) + sum (f) (a + 1, b)
    
     
     def sumInts3   =   sum(x => x)
    
    def sumCubes3  =   sum(x => x * x * x)
    
    def sumFacts3  =   sum(fact)
    
    
    
    def product (f: Int => Int) (a: Int, b: Int): Int = 
      if (a>b) 1
      else f(a) * product(f)(a+1, b)
    
   def product2 (f: Int => Int) (a: Int, b: Int): Int = 
      mapReduce(f,(x,y) => x* y, 1)(a, b)
    
      
   def fact2(a: Int): Int = 
      product (id)( 1, a)
      
      def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b: Int): Int = 
        if (a  > b ) zero
        else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  
}