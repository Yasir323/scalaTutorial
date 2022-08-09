package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable.ArrayBuffer
// An implementation of the Buffer class using an array to represent the
// assembled sequence internally. Append, update and random access take
// constant time (amortized time). Prepends and removes are linear in
// the buffer size.

object MutableArrayBuffer extends App {
    // Initialize
    val emptyArrayBuffer = ArrayBuffer()
    println(s"Empty ArrayBuffer: ${emptyArrayBuffer.mkString(", ")}")
    val anotherEmptyArrayBuffer = ArrayBuffer.empty[String]
    println(s"Empty ArrayBuffer: ${anotherEmptyArrayBuffer.mkString(", ")}")
    // Accessing elements
    val crew: ArrayBuffer[String] = ArrayBuffer("Zoro", "Sanji")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Append
    crew += "Nami"
    println(s"Elements of list: ${crew.mkString(", ")}")
    crew ++= List[String]("Ussop", "Chopper", "Robin")
    println(s"Elements of list: ${crew.mkString(", ")}")
    // Remove
    crew -= "Nami"
    println(s"Elements of list: ${crew.mkString(", ")}")
    crew --= List[String]("Ussop", "Chopper", "Robin")
    println(s"Elements of list: ${crew.mkString(", ")}")
    // Prepend
    val strawHats: ArrayBuffer[String] = "Luffy" +: crew
    println(s"Elements of list: ${strawHats.mkString(", ")}")
    // Concatenate
    val beastPirates = ArrayBuffer("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of list: ${pirates.mkString(", ")}")

    // Create an ArrayBuffer using tabulate function
    val arrayUsingTabulate: ArrayBuffer[Int] = ArrayBuffer.tabulate(5)(_ + 1)
    println(arrayUsingTabulate.toList)

    val row1 = 1
    val column3 = 3
    val arrayOfOneRowAndThreeColumns = ArrayBuffer.tabulate(row1, column3)( (row, column) => row + column )
    println(s"ArrayBuffer with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.map(_.mkString).mkString("\n")}")

    val row2 = 2
    val arrayOfTowRowsAndThreeColumns = ArrayBuffer.tabulate(row2, column3)( (row, column) => row + column )
    println(s"ArrayBuffer with 2 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.map(_.mkString).mkString("\n")}")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail.mkString(", ")}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(pirates.appended("Yamato").mkString(", "))
    println(pirates.length)
    println(pirates.contains("Luffy"))
    println(pirates.prepended("Shanks").mkString(", "))
    println(pirates.reverse.mkString(", "))
    println(pirates.slice(0, 2).mkString(", "))
    pirates.foreach(name => print(name.length))
}
