//package com.scalaTutorial.chapter.exceptionHandling
//
//import scala.util.Try
//
//object CalculatorExceptions {
//    class IntOverflowException extends RuntimeException
//    class NegativeNUmberException extends RuntimeException
//}
//
//object TrySuccessFailure extends App {
//    import CalculatorExceptions._
//
//    def sum(a: Int, b: Int): Int = {
//        if (a < 0 || b < 0) throw new NegativeNUmberException
//        val result = a + b
//        if (result < 0) throw new IntOverflowException
//        result
//    }
//
//    // Try[T] is an Algebraic Data Type, whose instances are Success[T]
//    // and Failure[T].
//    def trySuccessFailure(a: Int, b: Int): Try[Int] = Try {
//        Calculator.sum(a, b)
//    }
//}
