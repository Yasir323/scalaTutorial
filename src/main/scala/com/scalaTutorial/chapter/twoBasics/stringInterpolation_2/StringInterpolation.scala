package com.scalaTutorial.chapter.twoBasics.stringInterpolation_2

object StringInterpolation extends App {
  println("Using String interpolation on object properties");
  case class Donut(name: String, tasteLevel: String);
  val myDonut: Donut = Donut("Glazed Donut", "Delicious");
  println(s"My favourite donut name is ${myDonut.name} and it is ${myDonut.tasteLevel}");

  // String formatting
  val donutName: String = "Vanilla Donut";
  val donutTasteLevel: String = "Tasty";
  println(f"$donutName%20s $donutTasteLevel");
  val donutPrice: Double = 2.50;
  println(s"Donut price = $donutPrice");
  println(f"Formatted donut price = $donutPrice%.2f");

  // Raw string
  println(raw"Favorite donut\t$donutName");
}
