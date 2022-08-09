package com.scalaTutorial.chapter.threeFunctions.implicitParameters_4

/*
Implicit parameters are the parameters that are passed to a function
with implicit keyword in Scala, which means the values will be taken
from the context in which they are called. In simpler terms, if no
value or parameter is passed to a method or function, then the
compiler will look for implicit value and pass it further as the
parameter. For example, changing an integer variable to a string
variable can be done by a Scala compiler rather than calling it
explicitly. When implicit keyword used in the parameter scope of
the function, all the parameters are marked as implicit.
Note: A method can only contain one implicit keyword.

def func1(implicit x : Int) // x is implicit
def func2(implicit x : Int, y : Int) // x and y both are implicit
def func3 (x : Int)(implicit y : Int) // only y is implicit
 */

object ImplicitParameters extends App {

    def totalCost(price: Double, quantity: Short)(implicit discount: Double, tax: Double): Double = {
        val totalCost = price * quantity * (1 - discount) * (1 + tax)
        return totalCost
    }
    implicit val discount: Double = 0.1
    val cost: Double = totalCost(99.99, 10)
    println(s"Total cost: $cost")
    print(s"Total cost: ${totalCost(99.99, 10)(0.4, 0.18)}")
}
