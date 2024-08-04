package Part2OOP

object objects extends App {
object Person { // type (Person) and its only instance
  val N_EYES=2
  // factory methods
  def from(mother: Person, father: Person): Person = new Person()
}
  // scala Objects are singleton instance

  val mary = Person
  val john = Person

  if(mary == john){
    println("both objects are of same instance ")
  }

  // we use objects for class level functionality whereas we use classes for instance level functionality
class Person{

  }
  // COMPANIONS - having both class and object present in same place..
val marry = new Person // here we are instantiating class Person and not Object we used new keyword

  println(Person.N_EYES)


  // Scala Applications is a scala object with def main (args: Array[String]): Unit


}
