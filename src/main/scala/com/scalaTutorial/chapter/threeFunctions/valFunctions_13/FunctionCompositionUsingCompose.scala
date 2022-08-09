package com.scalaTutorial.chapter.threeFunctions.valFunctions_13

object FunctionCompositionUsingCompose extends App {
    // Mathematically speaking, (f compose g)(x) = f(g(x)).
    // The second function g(x) is ran first and its result is passed
    // along to the function f(x).
    val totalCost: Double = 10
    val applyDiscountValFunction = (amount: Double) => {
        println("Apply discount function")
        val discount = 2 // fetch discount from database
        amount - discount
    }

    val applyTaxValFunction = (amount: Double) => {
        println("Apply tax function")
        val tax = 1 // fetch tax from database
        amount + tax
    }
    println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction compose applyTaxValFunction)(totalCost) }")
}
