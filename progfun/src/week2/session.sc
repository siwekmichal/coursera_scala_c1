package week2
import week2.higherOrderFunction.sumInts
import week2.higherOrderFunction.sumCubes
import week2.higherOrderFunction.sumFacts
import week2.higherOrderFunction.sum_recursive
import week2.higherOrderFunction.sumCubes3
import week2.higherOrderFunction.sum
import week2.higherOrderFunction.sum2
import week2.higherOrderFunction.cube
import week2.higherOrderFunction.id
import week2.higherOrderFunction.product
import week2.higherOrderFunction.fact2
import week2.higherOrderFunction.product2


object session {
  sumInts(3,6)                                    //> res0: Int = 18
  sum_recursive(x => x*x*x , 3,6)                 //> res1: Int = 432
  sumCubes(3,6)                                   //> res2: Int = 432
  sumFacts(3, 6)                                  //> res3: Int = 4
  
  sumCubes3(3,6)                                  //> res4: Int = 432
	sum (cube) (1,10)                         //> res5: Int = 3025
	sum2 (cube) (1,10)                        //> res6: Int = 3025
	product(id)(1, 3)                         //> res7: Int = 6
	product2(id)(1,3)                         //> res8: Int = 6
	fact2(10)                                 //> res9: Int = 3628800
	
	
}