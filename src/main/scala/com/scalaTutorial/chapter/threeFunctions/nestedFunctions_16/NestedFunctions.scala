package com.scalaTutorial.chapter.threeFunctions.nestedFunctions_16

object NestedFunctions extends App {
    def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {
        // retrieve donut list that is currently in stock
        val listDonutsFromStock = List[String]("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

        // validate the donutName parameter by some business logic
        val validate = (name: String) => {
            name.nonEmpty && name.length > 0
        }

        // first run validate and then check if we have a matching donut from our list
        val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)

        isDonutInStock
    }

    println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")
}
