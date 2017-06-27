package week3

object overrides {
  new Sub                                         //> res0: week3.Sub = 2 3
}

abstract class Base {
	def foo = 1
	def bar: Int
}

class Sub extends Base {
	override def foo = 2
	def bar = 3
	
	override def toString = foo + " " + bar
}