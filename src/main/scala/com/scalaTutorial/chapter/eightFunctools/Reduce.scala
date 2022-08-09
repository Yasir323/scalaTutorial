package com.scalaTutorial.chapter.eightFunctools

object Reduce extends App {

    def add(x: Int, y: Int): Int = {
        val theSum = x + y
        println(s"received $x and $y, their sum is $theSum")
        theSum
    }

    val nums = (1 to 10).toList

    nums.reduce(add)
}
