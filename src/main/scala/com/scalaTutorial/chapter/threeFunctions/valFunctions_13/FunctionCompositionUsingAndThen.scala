package com.scalaTutorial.chapter.threeFunctions.valFunctions_13

object FunctionCompositionUsingAndThen extends App {
    // Mathematically speaking, (f andThen g)(x) = g(f(x)).
    // The results of the first function f(x) is ran first and will be
    // passed as input to the second function g(x).
    val totalCost: Double = 10
    val applyDiscountValFunction = (amount: Double) => {
        println("Apply discount function")
        val discount = 2 // fetch discount from database
        amount - discount
    }
    println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")
    val applyTaxValFunction = (amount: Double) => {
        println("Apply tax function")
        val tax = 1 // fetch tax from database
        amount + tax
    }
    println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction andThen applyTaxValFunction)(totalCost) }")

}
