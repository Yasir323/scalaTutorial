package com.scalaTutorial.chapter.fourClasses.packageObject9

object PackageObjectTutorial extends App {
    val vanillaDonut: Donut = Donut("Vanilla", 1.50)
    println(s"Vanilla donut name = ${vanillaDonut.name}")
    println(s"Vanilla donut price = ${vanillaDonut.price}")
    println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")
    println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

    val today = new DateTime()
    println(s"today = $today, datetime class = ${today.getClass}")
}
