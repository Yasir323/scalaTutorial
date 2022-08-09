package com.scalaTutorial.chapter.twoBasics.conditions_5

object Conditions extends  App {
    val numberOfPeople: Int = 5;
    val donutsPerPerson: Int = 2;
    val defaultDonutsToBuy: Int = 1;

    if(numberOfPeople > 10) {
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    } else if (numberOfPeople == 0) {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    } else {
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    };

    // Using if and else clause as expression
    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy;
    println(s"Number of donuts to buy = $numberOfDonutsToBuy");
}
