package week3
import week3._


object nth {
  def nth[T](n: Int, xs: List[T]): T =
  	if ( xs.isEmpty) throw new IndexOutOfBoundsException("parametr poza zakresem listy")
  	else if (n==0) xs.head
  	else nth(n - 1, xs.tail)                  //> nth: [T](n: Int, xs: week3.List[T])T


	val list = new Const(1, new Const(2, new Const(3,new Nil)))
                                                  //> list  : week3.Const[Int] = week3.Const@3ac3fd8b
	
	nth(2, list)                              //> res0: Int = 3
	nth(4, list)                              //> java.lang.IndexOutOfBoundsException: parametr poza zakresem listy
                                                  //| 	at week3.nth$$anonfun$main$1.nth$1(week3.nth.scala:7)
                                                  //| 	at week3.nth$$anonfun$main$1.apply$mcV$sp(week3.nth.scala:15)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.nth$.main(week3.nth.scala:5)
                                                  //| 	at week3.nth.main(week3.nth.scala)
	nth(-1, list)
}