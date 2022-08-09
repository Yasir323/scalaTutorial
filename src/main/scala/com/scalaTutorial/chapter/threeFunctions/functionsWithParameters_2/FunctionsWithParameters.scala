package com.scalaTutorial.chapter.threeFunctions.functionsWithParameters_2

object FunctionsWithParameters extends App {
    def calculateCost(mrp: Int): Double = {
        val tax: Double = 0.18
        (1 + tax) * mrp
    }
    println(calculateCost(50_000))

    // Default parameters
    def calculateCost2(mrp: Double, discount: Double = 0.0, tax: Double = 0.18): Double = {
        (1 + tax) * (mrp - discount)
    }
    println(calculateCost2(10_000))
    println(calculateCost2(10_000, discount = 1_000, tax = 5))
    println(calculateCost2(10_000, discount = 500))
}
