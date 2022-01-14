package knoldus.assignment2

import scala.annotation.tailrec

class FactTailRec {
  def factUseTailRec(number:Int):BigInt = {
    @tailrec
    def helper(number:Int, accumulator:BigInt):BigInt= {
      if(number<=1)  accumulator    //if number is 0 then it will return result that is store in accumalator
      else helper(number-1,number*accumulator) //in default case we are recursively calling our factorial function until we found our expected result
    }
    helper(number,1)
  }

}
