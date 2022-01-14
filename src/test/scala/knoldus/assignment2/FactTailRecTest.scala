package knoldus.assignment2

import org.scalatest.flatspec.AnyFlatSpec

class FactTailRecTest extends AnyFlatSpec {
  "factorial of a number" should "be valid " in {
    val factTailRec = new FactTailRec()
    assert(factTailRec.factUseTailRec(5) == 120)
  }

  "factorial of a number Zero" should "be valid if result is 1" in {
    val factTailRec = new FactTailRec()
    assert(factTailRec.factUseTailRec(0) == 1)
  }

  "factorial of a number one" should "be valid if result is 1" in {
    val factTailRec = new FactTailRec()
    assert(factTailRec.factUseTailRec(1) == 1)
  }

  "factorial of a number" should "be Invalid " in {
    val factTailRec = new FactTailRec()
    assert(!(factTailRec.factUseTailRec(10) == 362880))
  }
}
