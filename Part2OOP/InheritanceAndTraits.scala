package Part2OOP

object InheritanceAndTraits extends App {
class Animal {
  val creatureType = "Fog"
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


  class Person(name: String, age: Int)
//  class Adult(name: String, age: Int) extends Person
// here since person is the parent class with name and age as constructor value so above defination will not work
  class Adult(name: String, age: Int) extends Person(name, age)
  // we need to define name and age

  // but if you define an auxiliary constructor

  class NewPerson(name: String, age: Int){
    def this(name: String) = this(name,0)
    def this() = this("ankur",0)
  }

  class NewAdult(name: String, age: Int) extends NewPerson

  class Dog extends Animal{
    override vals creatureType = "Zog"
    override def eat(): Unit = {
      println("dic dic")
    }
  }

}

