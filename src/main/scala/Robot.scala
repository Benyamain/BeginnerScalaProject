package org.ben.beginner

case class Robot(firstName: String, lastName: String, serialNumber: Int) {
  def description = s"$firstName $lastName is $serialNumber ${if (serialNumber <= 1) "year"
  else "years"} old"
}

object Robot {
  def filterRobot(robots: List[Robot]) : List[Robot] = {
    for {
      robot <- robots
      if (robot.serialNumber >= 234)
    } yield (robot)
  }
}