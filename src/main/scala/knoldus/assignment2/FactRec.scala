package knoldus.assignment2

class FactRec {
  def factUseRec(number:Int):BigInt = {
    if(number<=1)  1
    else {
      val result= number*factUseRec(number-1)
      result
    }
  }
}
