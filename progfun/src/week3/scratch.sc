package week3

import week2.Rational

object scratch {
  new Rational(1, 2)                              //> res0: week2.Rational = 1/2
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  //error("test")
  
  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null
	
	//val z: Int = null
	if (true) 1 else false                    //> res1: AnyVal = 1
}