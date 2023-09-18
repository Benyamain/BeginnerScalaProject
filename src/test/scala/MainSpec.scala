package org.ben.beginner
import org.scalatest.{WordSpec, Matchers}

class MainSpec extends WordSpec with Matchers {
  "A Robot" should {
    "be instantiated with a serial number and name identifier" in {
      val gumpy = Robot(firstName = "Gumpy", lastName = "The Robot", "I-231")
      gumpy.firstName should be("Gumpy")
      gumpy.lastName should be ("The Robot")
      gumpy.serialNumber should be("I-231")
    }
  }
}
