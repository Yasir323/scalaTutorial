package com.scalaTutorial.chapter.sevenMutableCollections
import scala.collection.mutable
object MutableLinkedHashSet extends App {
    var set = mutable.LinkedHashSet(1, 3, 5)
    println(set)

    // Checking elements
    println(set(1))

    // Adding elements
    set += 2
    set ++= mutable.LinkedHashSet(4, 6, 8)
    println(set)

    // Removing elements
    set -= 2
    set --= mutable.LinkedHashSet(4, 6, 8)
    println(set)

    // Intersection
    println(set & mutable.LinkedHashSet(1, 2, 43, 4))
    // Union
    println(set | mutable.LinkedHashSet(1, 2, 43, 4))
    // Difference
    println(set &~ mutable.LinkedHashSet(1, 2, 43, 4))

    // Empty set
    val emptyLinkedHashSet: mutable.LinkedHashSet[String] = mutable.LinkedHashSet.empty[String]
    println(emptyLinkedHashSet)
}
