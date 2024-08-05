val s:String ="ICV"
s.head
s.tail.head
s.tail.tails.toList


val aList: List[Int] = List(2,3,4,5,6,7,7)

val aMapList = aList.map(_ * 2)
val aFlatMap = aList.flatMap(_a => List(_a*2))

