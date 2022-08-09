package com.scalaTutorial.chapter.fourClasses.caseClass6

// A case class is similar to any other classes except that it also
// creates the Companion Object. In addition, a case class will
// automatically create the apply(), toString(), hashCode and
// equals() methods for you.
case class Donut(name: String, price: Double, productCode: Option[Long] = None)

object CaseClass {
    val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50)
    val glazedDonut: Donut = Donut("Glazed Donut", 2.0)
    println(s"Vanilla Donut = $vanillaDonut")
    println(s"Glazed Donut = $glazedDonut")

    // Accessing fields
    println(s"Vanilla Donut name field = ${vanillaDonut.name}")
    println(s"Vanilla Donut price field = ${vanillaDonut.price}")
    println(s"Vanilla Donut productCode field = ${vanillaDonut.productCode}")

    // Scala favours the use of immutability. As a results, fields
    // defined on case class are immutable by default and as such you
    // cannot modify them.
}
