package com.scalaTutorial.chapter.threeFunctions.tailRecursiveFunction_14

object TailRecursiveFunction extends App {
    val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    @annotation.tailrec
    def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
        // The @annotation.tailrec instructs the compiler to add any
        // optimisations with regards to stack frame management as this
        // function is recursive.
        if(donuts.length == index) {
            None
        } else if(donuts(index) == donutName) {
            Some(true)
        } else {
            val nextIndex = index + 1
            search(donutName, donuts, nextIndex)
        }
    }

    val found = search("Glazed Donut", arrayDonuts, 0)
    println(s"Find Glazed Donut = $found")

    val notFound = search("Chocolate Donut", arrayDonuts, 0)
    println(s"Find Chocolate Donut = $notFound")
}
