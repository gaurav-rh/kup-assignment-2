package knoldus.assignment2

class FactRec {
  def factUseRec(number:Int):BigInt = {
    if(number<=1)  1   //if number is less than or equal to 1 then it will return 1
    else {
      val result= number*factUseRec(number-1)
      result
    }
  }
}
