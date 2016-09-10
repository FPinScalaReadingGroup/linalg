import breeze.linalg._

object HelloWorld{
	def main(args: Array[String]): Unit = {
		println("hello, world! I'm going to do some linear algebra!")
		val vector = DenseVector.zeros[Double](5)
		println(vector)
	}
}
