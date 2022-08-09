package com.scalaTutorial.chapter.threeFunctions.functionCurrying_10
// Functions whose parameters are organized into parameter groups - also known as Function Currying
object functionCurrying extends App {
    def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
      println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
      val totalCost = 2.50 * quantity
      totalCost - (totalCost * discount)
    }
    println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

    // Partial functions
    val totalCostForGlazedDonuts = totalCost("Glazed Donut") _
    println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.1)}")
}
