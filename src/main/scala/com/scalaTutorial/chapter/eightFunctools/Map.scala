package com.scalaTutorial.chapter.eightFunctools

object Map extends App {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")
    val doubles = nums.map(_ * 2)
    println(s"Doubles: ${doubles}")
    val doublesUsingLambdaFunction = nums.map((i) => i * 2)
    println(s"Doubles using Lambda function: ${doublesUsingLambdaFunction}")
    val capNames = names.map(_.capitalize)
    println(s"Capital Names: ${capNames}")
    val lessThanFive = nums.map(_ < 5)
    println(s"Less than 5: ${lessThanFive}")
}
