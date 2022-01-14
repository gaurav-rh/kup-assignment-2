package knoldus.assignment2

import org.scalatest.flatspec.AnyFlatSpec

class LoggerAssTest extends AnyFlatSpec {
  "a logger " should "be valid" in {
    val loggerAssignment = new LoggerAssignment()
    assert(loggerAssignment.printLog("knoldus","company") == "[company]:knoldus")
  }
  "a logger with no INFO" should "be valid" in {
    val loggerAssignment = new LoggerAssignment()
    assert(loggerAssignment.printLog("knoldus") == "[INFO]:knoldus")
  }
}
