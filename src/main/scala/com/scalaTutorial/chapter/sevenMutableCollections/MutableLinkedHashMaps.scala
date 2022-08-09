package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable
// This class implements mutable maps using a hashtable. The iterator
// and all traversal methods of this class visit elements in the order
// they were inserted.

object MutableLinkedHashMaps extends App {
    val map: mutable.LinkedHashMap[Int, String] = mutable.LinkedHashMap((1, "Zoro"), (2, "Nami"))
    println(map)
    // Accessing elements
    println(map(1))

    // Adding key value pair
    map(3) = "Ussop"
    map += (4 -> "Sanji")
    println(map)

    // Concatenation
    val map2 = mutable.LinkedHashMap(5 -> "Chopper", 6 -> "Robin", 7 -> "Franky", 8 -> "Brook")
    map ++= map2
    println(map)

    // Removing a key
    map -= 3
    println(map)

    // Empty LinkedHashMap
    val emptyMap = mutable.LinkedHashMap[Int, String]()
    print(emptyMap)
}
