package com.scalaTutorial.chapter.fourClasses.classesAndObjects1

object Phone extends App {
    val phone1 = new Mobile("Apple", "13 Pro")
    val phone2 = new Mobile("Google", "Pixel 6 Pro")
    phone1.print()
    phone2.print()
}
