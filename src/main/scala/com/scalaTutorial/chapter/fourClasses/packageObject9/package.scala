package com.scalaTutorial.chapter.fourClasses

package object packageObject9 {
     case class Donut(name: String, price: Double, productCode: Option[Long] = None)

    implicit class AugmentedDonut(donut: Donut) {
        def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }

    type DateTime = org.joda.time.DateTime

}
