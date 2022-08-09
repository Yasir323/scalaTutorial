package com.scalaTutorial.chapter.fourClasses.covariance11

abstract class Android (name: String) {
    def printName(): Unit
}

class Pixel (name: String) extends Android (name) {
    override def printName(): Unit = println(name)
}

object Pixel {
    def apply(name: String): Android = {
        new Pixel(name)
    }
}

class Samsung (name: String) extends Android (name) {
    override def printName(): Unit = println(name)
}

object Samsung {
    def apply(name: String): Android = {
        new Pixel(name)
    }
}

case class OnePlus(name: String) extends Android(name) {
    override def printName(): Unit = println(name)
    // We do not have to create a Companion Object for the OnePlus
    // case class because the case class will automatically provide a
    // companion object.
}

case class Xiaomi(name: String) extends Android(name) {
    override def printName(): Unit = println(name)
}

// Enabling covariance
// In other words, you can now create instances of Mobile of type
// Android or sub-types of Android such as Samsung.
class Mobiles[+A <: Android] (mobiles: Seq[A]) {
    def printMobiles(): Unit = mobiles.foreach(_.printName())
}
