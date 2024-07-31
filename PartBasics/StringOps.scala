object StringOps extends App {
  private val str: String = "Hello I am leaning scala."
  println(str.charAt(2))
  println(str.substring(2,10))
  println(str.split(" ").toList)
  println(str.startsWith("He"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)


  private val aNumberString: String = "45"
  val aNumber = aNumberString.toInt
  println( 'a' +: aNumberString :+ 'z')
  println('a'+aNumberString)

  // reverse string -> str.reverse

  //Scala specific string interpolator.

  val name = "Ankur"
  val age = 28
  // S interpolation

  val greetings = s"Hello $name, I $age , compute = ${age + 1}"
  println(greetings)
  // F Interpolation

  private val speed = 1.2f

  val myth = f"$name can eat $speed%2.2f"
  //val myth2 = f"$name can eat $speed%3d"
  println(myth)
  //println(myth2)

  // raw - interpolator

  println(raw"\n\t")

  // but

  val escaped = "this is \n newline"
  println(raw"$escaped")
}
