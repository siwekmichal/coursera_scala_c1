package week3

object overrides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); val res$0 = 
  new Sub;System.out.println("""res0: week3.Sub = """ + $show(res$0))}
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
