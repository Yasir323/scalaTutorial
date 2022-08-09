package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable

object MutableHashSet extends App {
    var set = mutable.HashSet(1, 3, 5)
    println(set)

    // Checking elements
    println(set(1))

    // Adding elements
    set += 2
    set ++= mutable.HashSet(4, 6, 8)
    println(set)

    // Removing elements
    set -= 2
    set --= mutable.HashSet(4, 6, 8)
    println(set)

    // Intersection
    println(set & mutable.HashSet(1, 2, 43, 4))
    // Union
    println(set | mutable.HashSet(1, 2, 43, 4))
    // Difference
    println(set &~ mutable.HashSet(1, 2, 43, 4))

    // Empty set
    val emptyHashSet: mutable.HashSet[String] = mutable.HashSet.empty[String]
    println(emptyHashSet)
}
