package com.scalaTutorial.chapter.threeFunctions.tailRecursiveFunction_14
import scala.util.control.TailCalls._

object TrampolineTRF extends App {

    val donutList: List[String] = List("Plain Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
    val foundVerySweetDonut = tailcall(verySweetDonut(donutList)).result
    println(s"Found very sweet donut = $foundVerySweetDonut")

    def notSweetDonut(donutList: List[String]): TailRec[Boolean] = {
        println(s"notSweetDonut function: with donut list = $donutList")
        if (donutList.isEmpty) {
            println("notSweetDonut function: donut list isEmpty, returning false")
            done(false)
        } else {
            println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet,   forwarding donut list's tail to verySweetDonut function")
            tailcall(verySweetDonut(donutList.tail))
        }
    }

    def verySweetDonut(donutList: List[String]): TailRec[Boolean] = {
        {
            println(s"verySweetDonut function: donut list = $donutList")
            if (donutList.isEmpty) {
                println("verySweetDonut function: donut list isEmpty, returning false")
                done(false)
            } else {
                if (Set(donutList.head).subsetOf(Set("Vanilla Donut", "Strawberry Donut", "Glazed Donut"))) {
                    println(s"verySweetDonut function: found donut list's head = ${donutList.head} to be VERY sweet, returning true")
                    done(true)
                } else {
                    println(s"verySweetDonut function: donut list's head = ${donutList.head} is NOT VERY sweet, forwarding donut list's to notSweetDonut function")
                    tailcall(notSweetDonut(donutList))
                }
            }
        }
    }
    println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet, forwarding donut list's tail to verySweetDonut function")
}
