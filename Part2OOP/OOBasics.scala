package Part2OOP

object OOBasics extends App{
  private val person = new Person("John",24)
  println(person.age)

  person.greet("Dick")
  person.greet()


}

// constructor
// class parameters are not fields
// we convert parameter to field by adding val keyword
// age is class field, where as name is parameter
// we cannot call person.name

class Person(name: String, val age: Int = 0)
{
  // class body
  println(name)
  val x : Int = 2 // this x is also a class field we can call it using
  // person.x

  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  def greet(): Unit = println(s"Hi says $name")

  //multiple constructors

  def this(name: String) = this(name,0)
  def this() = this("John Doe")

  // auxiliary constructors can only be used to define another constructor

}


class Novel(name: String, YoR: Int, author: Writer) {
  def authorAge(): Int = author.year
  def isWrittenBy(author: Writer): Unit = author == this.author
  def copy(newYear : Int): Novel = new Novel(name, newYear, author)


}

class Writer(firstname: String, surname: String,val year: Int){
  def fullname():Unit = println(firstname +" " + surname)
}


class Counter(n: Int) {
  def currentCount(): Int = n
  def incrementCounter: Counter = new Counter(n  + 1)
  def decrementCounter: Counter = new Counter(n - 1)

}