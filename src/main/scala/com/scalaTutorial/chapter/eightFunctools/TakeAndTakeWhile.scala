package com.scalaTutorial.chapter.eightFunctools

object TakeAndTakeWhile extends App {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")
    // The take and takeWhile methods give you a nice way of taking the
    // elements out of a list that you want to create a new list.
    println(nums.take(1))
    println(nums.take(2))
    println(nums.take(5))

    println(nums.takeWhile(_ < 5))
    println(names.takeWhile(_.length < 5))
}
