import scala.annotation.tailrec

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello",3))

  private def aParameterLessFunction():Int = 5
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  // recursive functions needs return type

  println(aRepeatedFunction(" Land Matchwood ", 4))

  // WHEN IN NEED OF LOOPS USE RECURSIONS

  def aFuncWithSideEffects(aString: String):Unit = {
    println(aString)
  }

  def aBigFunction(n:Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = {
      a + b
    }
    aSmallerFunction(n,n-1)
  }


  //1 : Greetings Function for Kids (name, age) Hi Name is $name and I am $age years old

  def aGreetingFunction(name:String, age:Int):Unit = {
    println(s"Hi my name is ${name} and i am ${age} years old")
  }
  //2 : Factorial function 1 * 2 * 3 * 4 ... * n

  private def aFactorialFunction(n:Int):Int = {
      if (n == 1) {
        return 1
      }
      else {
        n * aFactorialFunction(n - 1)
      }
  }
  println(aFactorialFunction(5))

  //3 : Fibonacci functions f(1) = 1, f(2) = 1, f(n) = f(n-1) + f(n - 2)

  private def aFibonacciFunction(p:Int): Int = {
  if(p<=2) 1
  else aFibonacciFunction(p-1) + aFibonacciFunction(p-2)
  }

  println(aFibonacciFunction(8))

  //4 : Test if a number is prime

  private def aPrimeNumber(n: Int) : Boolean = {
    @tailrec
    def isPrimeUntil(t: Int) : Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t -1)
    }
    isPrimeUntil(n/2)
  }

  println(aPrimeNumber(67))
}
