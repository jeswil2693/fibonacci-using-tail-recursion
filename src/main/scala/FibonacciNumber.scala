import scala.annotation.tailrec
object FibonacciNumber {

  def fibonacci(x:Int):Int = {

    @tailrec
    def iter(x:Int,y:Int,n:Int,N:Int):Int = {
      if(n==1) x
      else if(n==2) y
      else if(n==N) (x+y)
      else iter(y,x+y,n+1,N)
    }
    iter(0,1,3,x);
  }

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(readInt()))

  }
}