package com.scalaTutorial.chapter.twoBasics.variablesAndTypes_1

object variablesAndTypes extends App {
  // Syntax
  // val <Name of our variable>: <Scala type> = <Some literal>

  // Immutable variables
  val num: Int = 5; // Immutable object here, can't change value.
  println(num);

  // Mutable variables
  var num2: Int = 3;
  println(s"Old Number: ${num2}");
  num2 = 4;
  println(s"New Number: ${num2}");

  var name: String = "Luffy";
  println(s"Old name: ${name}");
  name = "Sanji";
  println(s"New name: ${name}");

  // Lazy Initialization
  lazy val whatever = "Lazy variable.";

  // Supported types
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  // Declare variable
  var onlyDeclared: String = _
  onlyDeclared = "Plain Donut"
}
