import org.scalatest._
import flatspec._
import matchers._
import LetterSum._


class LetterSumSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An LetterSum.count()"

  it should "return sum of letters values" in {
    count("") shouldBe 0
    count("a") shouldBe 1
    count("z") shouldBe 26
    count("cab") shouldBe 6
    count("excellent") shouldBe 100
    count("microspectrophotometries") shouldBe 317
  }

}

