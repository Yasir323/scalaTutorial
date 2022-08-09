package com.scalaTutorial.chapter.sevenMutableCollections
import scala.collection.mutable

object MutableTreeSet extends App {
    var set = mutable.TreeSet(1, 3, 5)
    println(set)

    // Checking elements
    println(set(1))

    // Adding elements
    set += 2
    set ++= mutable.TreeSet(4, 6, 8)
    println(set)

    // Removing elements
    set -= 2
    set --= mutable.TreeSet(4, 6, 8)
    println(set)

    // Intersection
    println(set & mutable.TreeSet(1, 2, 43, 4))
    // Union
    println(set | mutable.TreeSet(1, 2, 43, 4))
    // Difference
    println(set &~ mutable.TreeSet(1, 2, 43, 4))

    // Empty set
    val emptyTreeSet: mutable.TreeSet[String] = mutable.TreeSet.empty[String]
    println(emptyTreeSet)
}
