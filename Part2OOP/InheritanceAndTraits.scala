package Part2OOP

object InheritanceAndTraits extends App {
class Animal {
  protected def eat(): Unit = println("nomnom")

}
  class Cat extends Animal{
    def crunch: Unit = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

}
