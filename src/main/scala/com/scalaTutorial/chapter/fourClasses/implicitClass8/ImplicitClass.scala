package com.scalaTutorial.chapter.fourClasses.implicitClass8
import DonutImplicits._

object ImplicitClass extends App {
    val vanillaDonut: Donut = Donut("Vanilla", 1.50)
    println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")
}
