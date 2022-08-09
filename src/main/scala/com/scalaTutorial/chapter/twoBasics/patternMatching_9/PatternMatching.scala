package com.scalaTutorial.chapter.twoBasics.patternMatching_9

object PatternMatching extends App {
    var name: String = "Luffy"
    name match {
        case "Luffy" => println("Captain");
        case "Zoro" => println("Vice-Captain");
    }

    // Return the result
    name = "Sanji"
    val position = name match {
        case "Luffy" => "Captain";
        case "Zoro" => "Vice-Captain";
        // Default case
        case _ => "Crew";
    }
    println(position)

    // Pattern matching with two or more items on the same condition
    val donutType = "Glazed Donut"
    val tasteLevel3 = donutType match {
      case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    print(s"Taste Level of $donutType: $tasteLevel3")

    // Pattern matching and using if expressions in the case clause
    val tasteLevel4 = donutType match {
        case donut if donut.contains("Glazed") || donut.contains("Strawberry") => "Very Tasty";
        case "Plain Donut" => "Tasty"
        case _ => "Just OK."
    }
    print(s"Taste Level of $donutType: $tasteLevel4")

    // Pattern matching by types
    val priceOfDonut: Any = 2.50
    val priceType = priceOfDonut match {
        case price: Int => "Int";
        case price: Double => "Double";
        case price: Float => "Float";
        case price: String => "String";
        case price: Boolean => "Boolean";
        case price: Char => "Char";
        case price: Long => "Long";
    }
    println(s"Donut price type: $priceType")
}
