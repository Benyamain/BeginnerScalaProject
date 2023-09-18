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
}
