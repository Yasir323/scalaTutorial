package com.scalaTutorial.chapter.eightFunctools

object DropAndDropWhile extends App {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")
    // drop and dropWhile are essentially the opposite of take and takeWhile.
    println(nums.drop(1))
    println(nums.drop(2))
    println(nums.drop(5))

    println(nums.dropWhile(_ < 5))
    println(names.dropWhile(_.length < 5))
}
