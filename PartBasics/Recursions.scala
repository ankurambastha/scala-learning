import scala.annotation.tailrec

object Recursions extends App{
  def aFactorialFunction(number: Int): Int = {
    if (number <= 1) 1
    else number * aFactorialFunction(number - 1)
  }
  println(aFactorialFunction(10))

  // a problem with the above code is, JVM keeps the intermediate code in the stack -> can lead to Stack overflow error.


  private def aBetterRecursionFunction(number: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x*accumulator)
    }
    factHelper(number,1)
  }

//  println(aBetterRecursionFunction(20000))

  // in aBetterRecursionFunction we do not need another stack frames to calculate intermediate results unlike in aFactorialFunction,
  // we needed to another stack frame to compute the result of " aFactorialFunction(number - 1) " to be then multiplied with ""number""
  // this is called tail recursions

  // 1. Concatenate a string using tail rec

  def aStringConcatFuncTailRec(s: String,n: Int, conc:String): String = {
    if (n <= 1) conc
    else aStringConcatFuncTailRec(s,n-1,s + conc)
  }
  private val sentence: String = aStringConcatFuncTailRec(" Dick ", 5, "")
  println(sentence)

  // 2. Is Prime with Tail Rec

  def isPrime(num: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime : Boolean): Boolean = {
      if(!isStillPrime) return false
      else if (t<=1) true
      else isPrimeTailRec(t-1, num%t !=0 && isStillPrime)
    }
    isPrimeTailRec(num/2, isStillPrime = true)
  }

  // 3. Fibonacci with Tail Rec

  def aFibonacciFunc(num: Int) : Int = {
    def aFibTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if(i>=num) last
      else aFibTailRec(i+1, last + nextToLast, last)
    }
    if (num<=2) 1
    else aFibTailRec(3,1,1)
  }

  println(aFibonacciFunc(8))


}





