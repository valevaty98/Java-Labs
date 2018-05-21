import scala.annotation.tailrec

/**
  * Main Object
  *
  * @author Valevaty
  */
object Main {

  /**
    * The Function to transformation string to Upper Case
    *
    * @param string Your string for changing
    * @return string in Upper Case
    */
  def stringToUpperCase(string: String): String = {
    string.toUpperCase();
  }

  /**
    * The Function to transformation string to Upper Case (tail recursion)
    *
    * @param string Your string for changing
    * @return string in Upper Case
    */
  def stringToUpperCaseTailRec(string: String): String = {
    @tailrec
    def stringToUpper(inp: String, outp: String, i: Int): String = {
      if (i < inp.length) stringToUpper(inp, outp + inp(i).toUpper, i + 1)
      else outp
    }

    stringToUpper(string, "", 0);
  }

  /**
    * The Function will multiply and sum two functions
    *
    * @param f   first function
    * @param g   second function
    * @param min low border of limit
    * @param max high border of limit
    * @return sum of each mult on the interval
    */
  def sumFunction(f: Int => Int, g: Int => Int, min: Int, max: Int): Int = {
    def mult(f1: Int, g1: Int): Int = {
      f1 * g1
    }

    def sum(f: Int => Int, g: Int => Int, current: Int, max: Int): Int = {
      if (current > max)
        0
      else
        mult(f(current), g(current)) + sum(f, g, current + 1, max)
    }

    sum(f, g, min, max)
  }

  /**
    * The Function will multiply and sum two functions(tail recurtion)
    *
    * @param f   first function
    * @param g   second function
    * @param min low border of limit
    * @param max high border of limit
    * @return sum of each mult on the interval
    */
  def sumFunTail(f: Int => Int, g: Int => Int, min: Int, max: Int): Int = {
    def mult(f1: Int, g1: Int): Int = {
      f1 * g1
    }

    @tailrec
    def sum(f: Int => Int, g: Int => Int, current: Int, max: Int, acc: Int): Int = {
      if (current > max)
        acc
      else
        sum(f, g, current + 1, max, acc + mult(f(current), g(current)))
    }

    sum(f, g, min, max, 0)
  }
}
