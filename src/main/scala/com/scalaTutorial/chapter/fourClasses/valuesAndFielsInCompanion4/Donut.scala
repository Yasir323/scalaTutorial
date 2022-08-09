package com.scalaTutorial.chapter.fourClasses.valuesAndFielsInCompanion4

class Donut (name: String, prodCode: Option[Long] = None){
    def print(): Unit = println(s"Donut name = $name, productCode = ${prodCode.getOrElse(0)}, uuid = ${Donut.uuid}")
}

object Donut {
    private val uuid = 1

    def apply(name: String, prodCode: Option[Long]): Donut = {
        new Donut(name, prodCode)
    }

    def apply(name: String): Donut = {
        new Donut(name)
    }
}
