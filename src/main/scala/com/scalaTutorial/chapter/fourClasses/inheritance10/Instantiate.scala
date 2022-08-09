package com.scalaTutorial.chapter.fourClasses.inheritance10

object Instantiate extends App {
    val pixel: Android = Pixel("6 Pro")
    val samsung: Android = Samsung("Galaxy Ultra 22s")
    pixel.printName()
    samsung.printName()

    val onePlus: Android = Pixel("9 Pro")
    val xiaomi: Android = Samsung("Mi 11x")
    onePlus.printName()
    xiaomi.printName()

    // Typed Class
    // You will get compiler error if you try to instantiate a Mobiles
    // class with a different type other than the Android type.
    val mobiles: Mobiles[Android] = new Mobiles[Android](Seq(samsung, onePlus))
    mobiles.printMobiles()
}
