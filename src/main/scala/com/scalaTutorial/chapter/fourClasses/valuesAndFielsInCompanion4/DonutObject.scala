package com.scalaTutorial.chapter.fourClasses.valuesAndFielsInCompanion4

object DonutObject extends App {
    val glazedDonut = Donut("Glazed Donut", Some(1111))
    val vanillaDonut = Donut("Vanilla Donut")
    glazedDonut.print()
    vanillaDonut.print()
}
