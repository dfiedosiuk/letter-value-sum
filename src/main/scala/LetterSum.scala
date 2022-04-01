object LetterSum extends App {

  def count(text: String): Int = {
    text
      .toLowerCase
      .toList
      .filter(('a' to 'z').contains(_))
      .map {
        case c if c != ' ' => c.toInt - 96
        case c => 0
      }.sum
  }

}
