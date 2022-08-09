package com.scalaTutorial.chapter.threeFunctions.variableArguments_8

object VariableArguments extends App {
    def addNumbers (numbers: Int*): Int = {
        numbers.sum
    }
    println(addNumbers(1, 2, 43))
    println(addNumbers(1))
    println(addNumbers(1, 2, 23 , 23, 3232, 32, 32))

    def printNames(names: String*): Unit = {
        println(s"""Donut Report = ${names.mkString(" - ")}""")
    }
    printNames("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
    val listOfDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
    val seqOfDonuts: Seq[String] = Seq("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
    val arrOfDonuts: Array[String] = Array("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
    printNames(listOfDonuts: _*)
    printNames(seqOfDonuts: _*)
    printNames(arrOfDonuts: _*)
}
