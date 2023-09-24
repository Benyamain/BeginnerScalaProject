package org.ben.beginner

object Main extends App {
  val robots = List(
    Robot(firstName = "Dolph", lastName = "The Robot", 553),
    Robot(firstName = "Sylvester", lastName = "The Robot", 554),
    Robot(firstName = "Arnold", lastName = "The Terminator", 555),
  )

  val filterRobot = Robot.filterRobot(robots)
  private val descriptions = filterRobot.map(p => p.description).mkString("\n\t")
  println(s"The robots are \n\t$descriptions")
}