package com.scalaTutorial.chapter.sevenMutableCollections
import scala.collection.mutable

object MutableSortedSet extends App {
    var set = mutable.SortedSet(1, 3, 5)
    println(set)

    // Checking elements
    println(set(1))

    // Adding elements
    set += 2
    set ++= mutable.SortedSet(4, 6, 8)
    println(set)

    // Removing elements
    set -= 2
    set --= mutable.SortedSet(4, 6, 8)
    println(set)

    // Intersection
    println(set & mutable.SortedSet(1, 2, 43, 4))
    // Union
    println(set | mutable.SortedSet(1, 2, 43, 4))
    // Difference
    println(set &~ mutable.SortedSet(1, 2, 43, 4))

    // Empty set
    val emptySortedSet: mutable.SortedSet[String] = mutable.SortedSet.empty[String]
    println(emptySortedSet)
}
