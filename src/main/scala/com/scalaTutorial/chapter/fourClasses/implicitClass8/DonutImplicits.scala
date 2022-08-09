package com.scalaTutorial.chapter.fourClasses.implicitClass8


object DonutImplicits {
    case class Donut(name: String, price: Double, productCode: Option[Long] = None)

    implicit class AugmentedDonut(donut: Donut) {
        def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(1234)}"
    }
}
