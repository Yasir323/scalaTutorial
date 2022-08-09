package com.scalaTutorial.chapter.fourClasses.inheritance10

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

// What if you had to define a class which expects a particular type
// parameter? As an example, let us define a Mobiles class which
// expects a sequence of Android types.
class Mobiles[A <: Android] (mobiles: Seq[A]) {
    // With the notation [A <: Android], we are restricting only
    // Android types to be passed-through to the Mobiles class.
    def printMobiles(): Unit = mobiles.foreach(_.printName())
}
