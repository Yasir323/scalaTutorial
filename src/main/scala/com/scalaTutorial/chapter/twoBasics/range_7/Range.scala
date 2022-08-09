package com.scalaTutorial.chapter.twoBasics.range_7

object Range extends App {
    val nums = 1 to 5
    for (num <- nums) print(s"$num\t")
    println()

    // Excluding last
    val nums2 = 1 until 5
    for (num <- nums2) print(s"$num\t")
    println()

    // With steps
    val nums3 = 1 to 5 by 2
    for (num <- nums3) print(s"$num\t")
    println()

    // Alphabetical range
    val chars = 'a' to 'z' by 2
    for (char <- chars) print(s"$char ")
    println()

    // Convert range to collection
    val charsList = ('a' to 'q').toList
    val charsSet = ('a' to 'q').toSet
    val charsSequence = 'a' to 'q'
    val charsArray = ('a' to 'q').toArray
    println(charsList)
    println(charsSet)
    println(charsSequence)
    println(charsArray.mkString("Array(", ", ", ")"))
    charsArray.foreach(print(_))
}
