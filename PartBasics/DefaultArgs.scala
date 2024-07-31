import scala.annotation.tailrec

object DefaultArgs extends App {


  @tailrec
  private def tailRecFactorial(num: Int, accum : Int): Int = {
    if(num<1) accum
    else tailRecFactorial(num-1, num*accum)
  }

  tailRecFactorial(10,1)
  // using default argument =>

  @tailrec
  private def tailRecFactorialDefArg(num: Int, accum: Int = 1): Int = {
    if(num<=1) accum
    else tailRecFactorialDefArg( num - 1, accum * num )
  }

  tailRecFactorialDefArg(10)







}
