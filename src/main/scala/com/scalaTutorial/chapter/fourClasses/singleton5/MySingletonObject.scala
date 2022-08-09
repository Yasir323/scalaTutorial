package com.scalaTutorial.chapter.fourClasses.singleton5

object MySingletonObject {
    // If you have used another programming language such as Java or
    // .NET, you would perhaps expect that Scala also has the keyword
    // static which would allow you to declare global fields and constants.

    //But, Scala does not have a static keyword! Instead, you can simply
    // encapsulate a global field using the val keyword inside a
    // Singleton Object.
    val discount: Double = 0.01

    // Scala does not exposed a static keyword. But you can encapsulate
    // functions and methods inside a Singleton Object if you would like
    // to expose some globally accessible utility function or method.
    def calculateTotalCost(donuts: List[String]): Double = {
        // calculate the cost of donuts
        return 1
    }
}
