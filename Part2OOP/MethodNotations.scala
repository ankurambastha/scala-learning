package Part2OOP

import java.awt.print.Printable
import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favMovie :String){
    def likes(movie:String): Boolean = movie == favMovie
    def +(person: Person): String = s"${this.name} hangs with " +
      s"${person.name}"

    def unary_! : String = s"$name , dafuq?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and this is apply"
    // apply serves the purpose of closing the gap between Object-Oriented and Functional paradigms in Scala

  }

  val randi = new Person("Mary", "Inception")
  println(randi.likes("Inception"))
  println(randi likes "Inception") // infix notation = operator notation
  // syntactic sugars
  // "operators" in scala

  val tom = new Person("Tom", "Fight Club")

  println(randi + tom)
  println(randi.+(tom))

  println(randi.unary_!)
  println(!randi)

  println(1.+(2))
  // all operators are methods

  // prefix notations

  val x = -1
  val y = 1.unary_-
  val z = 1.unary_+
  val w = 1.unary_~

  // postfix operations
  // does not receive any parameter

  println(randi isAlive)

  // apply

  println(randi.apply())
  println(randi())











}
