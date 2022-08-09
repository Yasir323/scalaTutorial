package com.scalaTutorial.chapter.threeFunctions.implicitFunctions_5
import scala.language.implicitConversions

object FindRank extends App {
    // Implicit functions
    // the use of implicit as one of the features which Scala provides
    // to allow you to easily add extension methods or functions to any
    // type or class.
    implicit def casing(name: String): Caps = new Caps(name)
    val name1 = "Luffy"
    val name2 = "ZORO"
    println(name1.allCaps)
    println(name2.allCaps)

    // Another example
    implicit def doubleToInt(d: Double): Int = d.toInt
    val num: Int = 43.5
    print(num)

    //
}
