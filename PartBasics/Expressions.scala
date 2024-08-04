package PartBasics

object Expressions extends App{
  val x: Int = 1+2; // expressions
  println(x)
  println(2+3*4) //math expressions
  // + - * / << >> >>> right shift with zero expression
  println(1 == 2) // equality check expressions
  // != not equals >= <= < > // other expressions
  // logical and, logical or operations !() & |
  // side effects


  // instructions (DO) vs expressions (value)
  // instructions are doing somethings

  // if expressions ->
  private val aConditions = true
  val aConditionValue = if(aConditions) 5 else 3 // if expressions gives back a value not an instruction
  println(aConditions)

  private var i : Int = 0

  while (i < 10) {
    println(i)
    i+=1
  }

  // NEVER USE LOOPS YOU DUMB FUCK
  // EVERYTHING IN SCALA IS AN EXPRESSIONS EXCEPT DEFINITIONS OF CLASS PACKAGE


  private val aWeirdValue : Unit = {
    val aVariable = 3
  }
  println(aWeirdValue)

  // side effects : println, while, reassigning -> all returns Units

  // Code Blocks

  val aCodeBlock: String = {
    val y = 2;
    val z = y + 1;
    if (z > 2) "hello" else "bye"
  }

  // val anotherValue = z + 1; // since z is inside a code block we cannot use it





}
