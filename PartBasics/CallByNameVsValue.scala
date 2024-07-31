object CallByNameVsValue extends App{

  def calledByValue(x: Long): Unit = {
    println("by Value " + x)
    println("by Value " + x)
  }

  def callByName(x: => Long): Unit = {
    println("by Name " + x)
    println("by Name " + x)
  }

  calledByValue(System.nanoTime())
  callByName(System.nanoTime())



  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) = will crash as it will try to evaluate the infinite func.

  printFirst(24, infinite()) // will not crash because of scala's lazy evaluation function since the second parameter is call by name and it
  // is not referenced, its value is not computed





}
