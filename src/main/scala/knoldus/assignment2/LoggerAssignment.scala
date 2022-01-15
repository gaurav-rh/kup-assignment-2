package knoldus.assignment2


class LoggerAssignment{
  def printLog(message:String, level:String = "INFO"):String ={
    "["+level+"]:"+message
  }
}

