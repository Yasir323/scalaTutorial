package com.scalaTutorial.chapter.threeFunctions.symbols_9

class CostCalculator {
    val totalCost = 100

    def - (discount: Double): Double = {
        totalCost - discount
    }
}
