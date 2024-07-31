package PractiseProblems

object findNumberInList extends App{

  private def indexOfList(numbers: Array[Int], toFind: Int): Array[Int] = {
    val numMap = scala.collection.mutable.Map[Int,Int]()
    val result = numbers.zipWithIndex.iterator.find{
      case (num, i) =>
        if(num == toFind){
          println(s"here")
          true
        }
        else {
          numMap(num) = i
          println(s"not here")
          false
        }
    }
    result match {
      case Some((num,i)) => Array(num,i)
      case None => Array(-1, -1)
    }

  }

  println(indexOfList(Array(1, 2, 3, 4, 5, 6, 8), 6).mkString("Array(", ", ", ")"))

}
