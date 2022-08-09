package com.scalaTutorial.chapter.sevenMutableCollections
import scala.collection.mutable

object MutableMaps extends App {
    val map: mutable.Map[Int, String] = mutable.Map((1, "Zoro"), (2, "Nami"))
    println(map)
    // Accessing elements
    println(map(1))

    // Adding key value pair
    map(3) = "Ussop"
    map += (4 -> "Sanji")
    println(map)

    // Concatenation
    val map2 = mutable.Map(5 -> "Chopper", 6 -> "Robin", 7 -> "Franky", 8 -> "Brook")
    map ++= map2
    println(map)

    // Removing a key
    map -= 3
    println(map)

    // Empty Map
    val emptyMap = mutable.Map[Int, String]()
    print(emptyMap)

}
