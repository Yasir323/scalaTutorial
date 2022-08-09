package com.scalaTutorial.chapter.eightFunctools

object ForEach extends App {
    // The foreach method is used to loop over all elements in a
    // collection. As we mentioned in a previous lesson, foreach is used
    // for side-effects, such as printing information. Foreach can have a
    // null return type whereas map can't.
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")
    nums.foreach(println)
    nums.filter(_ < 4).foreach(println)
    // In JS, map returns a new sequence whereas foreach mutates the original one.
}
