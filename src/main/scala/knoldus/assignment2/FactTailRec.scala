package knoldus.assignment2

import scala.annotation.tailrec

class FactTailRec {
  def factUseTailRec(number:Int):BigInt = {
    @tailrec
    def helper(number:Int, accumulator:BigInt):BigInt= {
      if(number<=1)  accumulator
      else helper(number-1,number*accumulator)
    }
    helper(number,1)
  }

}
