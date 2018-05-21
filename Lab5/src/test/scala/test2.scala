import org.scalatest.FunSuite

class test2 extends FunSuite {
  test("Palindrom") {
    val testList = List(1021, "HerH", 4, 212, 505, 3, 3443, "bobbob")
    assert(Laba6.returnPalindroms(testList).equals(List(4, 212, 505, 3, 3443, "bobbob")))
  }

  test("CalculateSum") {
    val testIntList = List(10, 4, 212, 505, 3, 43)
    assert(Laba6.findSum(testIntList).equals(777))
  }

  test("MapToList") {
    val testMap = Map("A" -> 2, "B" -> 3, "C" -> 5, "D" -> 6)
    assert(Laba6.toList(testMap).equals(List("A", "D")))
  }
}