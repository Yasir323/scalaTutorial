package com.scalaTutorial.chapter.twoBasics.enumAndADT_11

object AlgebraicDataType extends App {
    sealed trait BakingEvents
    final case object BakeDonut extends BakingEvents
    final case object AddTopping extends BakingEvents
    final case object StopBaking extends BakingEvents


    def prettyPrintBakingEvent(bakingEvent: BakingEvents):
        Unit = bakingEvent match {
            case BakeDonut => println("BakeDonut event was used in Pattern Matching")
            case AddTopping => println("AddTopping event was used in Pattern Matching")
            case StopBaking => println("StopBaking event was used in Pattern Matching")
        }

    prettyPrintBakingEvent(BakeDonut)
}

