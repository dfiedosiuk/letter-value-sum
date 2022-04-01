import org.scalatest._
import flatspec._
import matchers._
import LetterSum._


class LetterSumSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An LetterSum.count()"

  it should "return sum of letters values" in {
    count("a") shouldBe 1
  }

}

