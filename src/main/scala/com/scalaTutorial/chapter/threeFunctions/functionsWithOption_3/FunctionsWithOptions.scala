package com.scalaTutorial.chapter.threeFunctions.functionsWithOption_3

object FunctionsWithOptions extends App {
    def calculateCost(mrp: Double, cashback: Double = 0.0, tax: Double = 0.18, couponCode: Option[String] = None): Double = {
        couponCode match {
            case Some(coupon) =>
                // Lets give a 10% discount if a coupon code is available
                if (cashback > 0) -1 else (1 + tax) * (mrp / 10)
            case None => (1 + tax) * (mrp) - cashback
        }
    }
    println(calculateCost(10_000))
    println(calculateCost(10_000, cashback = 1_000, tax = 5))
    println(calculateCost(10_000, couponCode = Some("10% OFF")))
    val cost: Double = calculateCost(10_000, cashback = 1000, couponCode = Some("10% OFF"))
    if (cost == -1) {
        println("Cannot apply both cashback and coupon.")
    } else {
        println(cost)
    }
}
