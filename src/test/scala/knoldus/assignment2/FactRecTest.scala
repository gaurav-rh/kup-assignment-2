package knoldus.assignment2

import org.scalatest.flatspec.AnyFlatSpec

class FactRecTest extends AnyFlatSpec {
  val factRec = new FactRec()
  "factorial of a number" should "be valid " in {
    assert(factRec.factUseRec(5) == 120)
  }

  "factorial of a number Zero" should "be valid if result is 1" in {
    assert(factRec.factUseRec(0) == 1)
  }

  "factorial of a number one" should "be valid if result is 1" in {
    assert(factRec.factUseRec(1) == 1)
  }

  "factorial of a negative number" should "valid " in {
    assert(factRec.factUseRec(-1) == 1)
  }

  "factorial of a number" should "be Invalid " in {
      assert(!(factRec.factUseRec(100) == 3628800))
  }
}
