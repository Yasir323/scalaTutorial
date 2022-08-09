package com.scalaTutorial.chapter.threeFunctions.typedFunctions_6

object TypedFunctions extends App {
    def applyDiscount(couponCode: String): Unit = {
        println(s"Lookup percentage discount in database for $couponCode")
    }

    def applyDiscount(percentageDiscount: Double): Unit = {
        println(s"$percentageDiscount discount will be applied")
    }
    applyDiscount("COUPON_1234")
    applyDiscount(10)

    def applyDiscountTyped[T](discount: T): Unit = {
        discount match {
            case d: String =>
                println(s"Lookup percentage discount in database for $d")
            case d: Double =>
                println(s"$d discount will be applied")
            case d: Int =>
                println(s"$d discount will be applied")
            case _ =>
                println(s"Unsupported type ${discount.getClass}")
        }
    }
    applyDiscountTyped[String]("COUPON123")
    applyDiscountTyped[Double](10.5)
    applyDiscountTyped[Int](10)
    applyDiscountTyped[Character]('a')
}
