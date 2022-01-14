package knoldus.assignment2
import org.slf4j.{Logger, LoggerFactory}

class LoggerAssignment{
  val logger:Logger = LoggerFactory.getLogger(classOf[LoggerAssignment])
  def printLog(message:String, level:String = "INFO"):String ={
    logger.info("["+level+"]:"+message)
    "["+level+"]:"+message
  }
}

