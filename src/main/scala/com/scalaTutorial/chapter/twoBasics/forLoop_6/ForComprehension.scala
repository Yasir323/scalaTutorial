package com.scalaTutorial.chapter.twoBasics.forLoop_6

object ForComprehension extends App {
    for (num <- 1 to 5) {
        print(s"$num\t");
    }
    println();
    // Excluding the last one
    for (num <- 1 until 5) {
        print(s"$num\t");
    }
    println();
    // Conditions in for
    for (num <- 1 to 10 if num % 2 == 0)
        print(s"$num\t");
    println();
    // Iterating Lists
    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    for(ingredient <- donutIngredients if ingredient == "sugar"){
      println(s"Found sweetening ingredient = $ingredient");
    }
    // Yield
    val multipleOfSeven = for {
        num <- 10 to 30
        if ( num % 7 == 0)
    } yield num;
    println(multipleOfSeven);
    // 2D Array
    val twoDimensionalArray = Array.ofDim[String](2, 2)
    twoDimensionalArray(0)(0) = "flour"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"
    for { x <- 0 until 2
           y <- 0 until 2
    } println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")
}
