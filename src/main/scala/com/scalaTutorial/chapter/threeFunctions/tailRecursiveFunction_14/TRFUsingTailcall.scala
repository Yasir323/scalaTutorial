package com.scalaTutorial.chapter.threeFunctions.tailRecursiveFunction_14
import scala.util.control.TailCalls._

object TRFUsingTailcall extends App {
    def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
        if (donuts.length == index) {
            done(None) // NOTE: done is imported from scala.util.control.TailCalls._
        } else if (donuts(index) == donutName) {
            done(Some(true))
        } else {
            val nextIndex = index + 1
            tailcall(tailSearch(donutName, donuts, nextIndex))  // Wrap the function in tailcall
        }
    }

    val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
    val tailFound = tailcall(tailSearch("Glazed Donut", arrayDonuts, 0))
    println(s"Find Glazed Donut using TailCall = ${tailFound.result}")
    // NOTE: our returned value is wrapped so we need to get it by calling result

    val tailNotFound = tailcall(tailSearch("Chocolate Donut", arrayDonuts, 0))
    println(s"Find Chocolate Donut using TailCall = ${tailNotFound.result}")
}
