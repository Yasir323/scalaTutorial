package com.scalaTutorial.chapter.nineExceptionHandling

object CalculatorExceptions {
    class IntOverflowException extends RuntimeException
    class NegativeNUmberException extends RuntimeException
}

object Calculator extends App {
    import CalculatorExceptions._

    def sum(a: Int, b: Int): Int = {
        if (a < 0 || b < 0) throw new NegativeNUmberException
        val result = a + b
        if (result < 0) throw new IntOverflowException
        result
    }

    def tryCatch(a: Int, b: Int): Int = {
        try {
            Calculator.sum(a, b)
        } catch {
            case e: IntOverflowException => -1
            case e: NegativeNUmberException => -2
        } finally {
            println("Done")
        }
    }

    println(tryCatch(2, 3))
}
