package com.scalaTutorial.chapter.eightFunctools

object Filter extends App {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")

    val lessThanFive = nums.filter(_ < 5)
    println(s"Less than 5: $lessThanFive")

    val evens = nums.filter(_ % 2 == 0)
    println(s"Evens: $evens")

    val shortNames = names.filter(_.length <= 4)
    println(s"Short Names: $shortNames")
}
