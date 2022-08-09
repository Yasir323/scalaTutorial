package com.scalaTutorial.chapter.sevenMutableCollections

object MutableSets extends App {
    var set = Set(1, 3, 5)
    println(set)

    // Checking elements
    println(set(1))

    // Adding elements
    set += 2
    set ++= Set(4, 6, 8)
    println(set)

    // Removing elements
    set -= 2
    set --= Set(4, 6, 8)
    println(set)

    // Intersection
    println(set & Set(1, 2, 43, 4))
    // Union
    println(set | Set(1, 2, 43, 4))
    // Difference
    println(set &~ Set(1, 2, 43, 4))

    // Empty set
    val emptySet: Set[String] = Set.empty[String]
    println(emptySet)
}
