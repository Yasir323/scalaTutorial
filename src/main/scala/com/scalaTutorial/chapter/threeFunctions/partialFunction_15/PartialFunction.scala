package com.scalaTutorial.chapter.threeFunctions.partialFunction_15

object PartialFunction extends App {
    val isVeryTasty: PartialFunction[String, String] = {
        case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
    }
    val isTasty: PartialFunction[String, String] = {
        case "Plain Donut" => "Tasty"
    }
    val unknownTaste: PartialFunction[String, String] = {
        case donut @ _ => s"Unknown taste for donut = $donut"
    }
    // Compose PartialFunction using orElse
    val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
    println(donutTaste("Glazed Donut"))
    println(donutTaste("Plain Donut"))
    println(donutTaste("Chocolate Donut"))
}
