import org.scalatest.FunSuite

class test extends FunSuite {
  test("ChangeToUpper") {
    val testString = "FfhKDSg GDS gshksSGhHgGHgHGhKghKg G gh khg s Hk fg K"
    assert(Main.stringToUpperCaseTailRec(testString).equals(Main.stringToUpperCase(testString)))
  }

  test("SecondTask"){
    assert(Main.sumFunction((x: Int) => 4 * x * x + 2 * x + 33, (x: Int) => 5 * x + 6 * x, 3, 15).equals(
      Main.sumFunTail((x: Int) => 4 * x * x + 2 * x + 33, (x: Int) => 5 * x + 6 * x, 3, 15
      )
    ))
  }
}
