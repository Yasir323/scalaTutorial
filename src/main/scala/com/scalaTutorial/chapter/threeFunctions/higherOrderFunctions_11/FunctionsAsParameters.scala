package com.scalaTutorial.chapter.threeFunctions.higherOrderFunctions_11

object FunctionsAsParameters extends App {
    def applyDiscount(totalCost: Double): Double = {
        val discount = 2 // assume you fetch discount from database
        totalCost - discount
    }
    // Define the Higher Order Function
    def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(func: Double => Double): Double = {
        println(s"Calculating total cost for $quantity $donutType")
        val totalCost = 2.50 * quantity
        func(totalCost)
    }

    // Call the higher order function
    println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount)}")
}
