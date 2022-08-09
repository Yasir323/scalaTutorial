package com.scalaTutorial.chapter.threeFunctions.polymorphicFunction_7

object PolymorphicFunction extends App {
    def applyDiscount[T](discount: T): Seq[T] = {
        discount match {
            case d: String =>
                println(s"Lookup percentage discount in database for $d")
                Seq[T](discount)
            case d: Double =>
                println(s"$d discount will be applied")
                Seq[T](discount)
            case d: Int =>
                println(s"$d discount will be applied")
                Seq[T](discount)
            case d @ _ =>
                println(s"Unsupported type ${discount.getClass}")
                Seq[T](discount)
        }
    }
        applyDiscount[String]("COUPON123")
        applyDiscount[Double](10.5)
        applyDiscount[Int](10)
        applyDiscount[Character]('a')
}
