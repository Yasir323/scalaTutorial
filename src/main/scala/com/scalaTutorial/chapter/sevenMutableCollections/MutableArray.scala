package com.scalaTutorial.chapter.sevenMutableCollections

object MutableArray extends App {
    // Initialize
    val emptyArray = Array()
    println(s"Empty Array: ${emptyArray.mkString(", ")}")
    val anotherEmptyArray = Array.empty[String]
    println(s"Empty Array: ${anotherEmptyArray.mkString(", ")}")
    // Accessing elements
    val crew: Array[String] = Array("Zoro", "Sanji")
    println(s"Elements of list: ${crew.mkString(", ")}")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Prepend
    val strawHats: Array[String] = "Luffy" +: crew
    println(s"Elements of list: ${strawHats.mkString(", ")}")
    // Concatenate
    val beastPirates = Array("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of list: ${pirates.mkString(", ")}")

    // 2D-Array
    val rows = 2
    val cols = 2
    val array2d: Array[Array[Int]] = Array.ofDim[Int](rows, cols)
    array2d(0)(0) = 3
    array2d(0)(1) = 4
    array2d(1)(0) = 5
    array2d(1)(1) = 6
    array2d.foreach({row => row.foreach(print); println()})
    println(array2d.map(_.mkString).mkString("\n"))

    // Create an Array using tabulate function
    val arrayUsingTabulate: Array[Int] = Array.tabulate(5)(_ + 1)
    println(arrayUsingTabulate.toList)

    val row1 = 1
    val column3 = 3
    val arrayOfOneRowAndThreeColumns = Array.tabulate(row1, column3)( (row, column) => row + column )
    println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.map(_.mkString).mkString("\n")}")

    val row2 = 2
    val arrayOfTowRowsAndThreeColumns = Array.tabulate(row2, column3)( (row, column) => row + column )
    println(s"Array with 2 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.map(_.mkString).mkString("\n")}")

    // Creating array using range
    val rangeArray: Array[Int] = (1 to 10).toArray[Int]
    println(s"Array using Range from 1 to 10 = ${rangeArray.mkString(", ")}")
    // Copy Array
    val copyOfRangeArray: Array[Int] = new Array(rangeArray.length)
    Array.copy(rangeArray, 0, copyOfRangeArray, 0, rangeArray.length)
    copyOfRangeArray(0) = 10
    println(s"Original Array: ${rangeArray.mkString(", ")}")
    println(s"Copied Array: ${copyOfRangeArray.mkString(", ")}")
    // CLone an Array
    val clonedArray = rangeArray.clone
    clonedArray(0) = 11
    println(s"Original Array: ${rangeArray.mkString(", ")}")
    println(s"Cloned Array: ${clonedArray.mkString(", ")}")

    // Check if 2 arrays are equal
    println(rangeArray.sameElements(clonedArray))

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
