package com.scalaTutorial.chapter.fourClasses.companionAsFactory3

object CallingDonutCompanion extends App {
    val glazedDonut = Donut("Glazed Donut")
    println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
    glazedDonut.print()

    val vanillaDonut = Donut("Vanilla Donut")
    println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
    vanillaDonut.print()
}

