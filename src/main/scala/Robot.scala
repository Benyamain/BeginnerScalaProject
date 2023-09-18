package org.ben.beginner

case class Robot(firstName: String, lastName: String, serialNumber: Int) {
  def description = s"$firstName $lastName is $serialNumber ${if (serialNumber <= 1) "year"
  else "years"} old"
}
