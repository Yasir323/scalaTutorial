package com.scalaTutorial.chapter.twoBasics.usingOptions_14

object UsingOptions extends App {
    // How to use Option and Some
    val name: Option[String] = Some("Luffy")
    println(s"Name: ${name.get}")
    // Because we have wrapped our String into an Option, to retrieve its
    // value we call the get() function as shown above.
    //But calling get() in a production system is generally a code smell
    // as you may end up with the same NullPointerException.

    // How to use Option and None
    val name2: Option[String] = None
    println(s"Name: ${name2.getOrElse("Can't find name")}")

    // How to use Pattern Matching with Option
    name match {
        case Some(name) => println(s"Received name: $name")
        case None => println(s"No name received")
    }
}
