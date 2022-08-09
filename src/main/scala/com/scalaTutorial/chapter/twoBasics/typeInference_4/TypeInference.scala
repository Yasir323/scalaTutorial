package com.scalaTutorial.chapter.twoBasics.typeInference_4

object TypeInference {
    // Through type inference, Scala complier is smart enough to figure
    // out that the literal 5 is actually  an Integer.
    val donutsBoughtToday = 5
    val bigNumberOfDonuts = 100000000L
    val smallNumberOfDonuts = 1
    val priceOfDonut = 2.50
    val donutPrice = 2.50f
    val donutStoreName = "Allaboutscala Donut Store"
    val donutByte = 0xa
    val donutFirstLetter = 'D'
    val nothing: Unit = () // Type annotation is required for Unit

    // Type conversion
    // The Scala compiler is also smart enough to convert from one data
    // type into another. However, you should bear in mind that this
    // conversion is fine so long as your resulting type is not lossy.
    val numberOfDonuts: Short = 1
    val minimumDonutsToBuy: Int = numberOfDonuts
    // TO convert int to string we need to use a method
    val minimumDonutsToSell: String = numberOfDonuts.toString
}
