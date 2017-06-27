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


object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(533); val res$0 = 
  sumInts(3,6);System.out.println("""res0: Int = """ + $show(res$0));$skip(34); val res$1 = 
  sum_recursive(x => x*x*x , 3,6);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
  sumCubes(3,6);System.out.println("""res2: Int = """ + $show(res$2));$skip(17); val res$3 = 
  sumFacts(3, 6);System.out.println("""res3: Int = """ + $show(res$3));$skip(20); val res$4 = 
  
  sumCubes3(3,6);System.out.println("""res4: Int = """ + $show(res$4));$skip(19); val res$5 = 
	sum (cube) (1,10);System.out.println("""res5: Int = """ + $show(res$5));$skip(20); val res$6 = 
	sum2 (cube) (1,10);System.out.println("""res6: Int = """ + $show(res$6));$skip(19); val res$7 = 
	product(id)(1, 3);System.out.println("""res7: Int = """ + $show(res$7));$skip(19); val res$8 = 
	product2(id)(1,3);System.out.println("""res8: Int = """ + $show(res$8));$skip(11); val res$9 = 
	fact2(10);System.out.println("""res9: Int = """ + $show(res$9))}
	
	
}
