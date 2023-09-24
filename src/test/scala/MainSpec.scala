package org.ben.beginner
import org.scalatest.{WordSpec, Matchers}

class MainSpec extends WordSpec with Matchers {
  "A Robot" should {
    "be instantiated with a serial number and name identifier" in {
      val gumpy = Robot(firstName = "Gumpy", lastName = "The Robot", 231)
      gumpy.firstName should be("Gumpy")
      gumpy.lastName should be ("The Robot")
      gumpy.serialNumber should be(231)
    }
  }

  "Get a robotic readable identifier of the robot" in {
    val rusty = Robot(firstName = "Rusty", lastName = "The Robot", 232)
    rusty.description should be("Rusty The Robot is 232 years old")
  }

  "The Robot companion object" should {
    val (gumpy, rusty, chumpy) = (
      Robot(firstName = "Gumpy", lastName = "The Robot", 233),
      Robot(firstName = "Rusty", lastName = "The Robot", 234),
      Robot(firstName = "Chumpy", lastName = "The Robot", 235)
    )
    "return a list of robots" in {
      val ref = List(gumpy, rusty, chumpy)
      Robot.filterRobot(ref) should be(List(rusty, chumpy))
    }
    "return an empty list if no robot in the list" in {
      val ref = List(gumpy)
      Robot.filterRobot(ref) should be(List.empty[Robot])
    }
  }
}
