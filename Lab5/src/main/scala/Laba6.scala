/**
  * Main Object
  *
  * @author Valevaty
  */
object Laba6 {

  /**
    * @param yourList - in which palindroms are searched.
    * @return new Palindrom list
    */
  def returnPalindroms(yourList: List[Any]): List[Any] = {

    /**
      * Function checks if the word is palindrom.
      *
      * @param word - word for checking
      * @return true, if word is palindrom
      */
    def isPalindrom(word: Any): Boolean = {
      val str = word.toString;
      val len = str.length;

      for {counter <- 0.to(len / 2)}
        if (str(counter) != str(len - counter - 1)) false
      true
    }

    return yourList.filter(isPalindrom _)
  }

  /**
    * Function finds the sum of the Int list.
    *
    * @param yourList - list for finding the sum.
    * @return summ of all elements of the list
    */
  def findSum(yourList: List[Int]): Int = {
    yourList.foldLeft(0)((m: Int, n: Int) => m + n)
  }

  /**
    * Function generates the list.
    * @param mp - input map
    * @return - output list
    */
  def toList(mp: Map[String, Int]): List[String] = {
    if (mp.isEmpty) List()
    else
      (for ((value, key) <- mp) yield (key, value)).filterKeys(_ % 2 == 0).values.toList
  }


}
