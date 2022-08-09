package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.TreeSet

// This class implements immutable sorted sets using a tree.

object ImmutableTreeSets extends App {
    // Initialize
    val anotherEmptyTreeSet = TreeSet.empty[String]
    println(s"Empty TreeSet: $anotherEmptyTreeSet")
    // Check whether element exists
    val crew: TreeSet[String] = TreeSet("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew("Zoro")}")
    println(s"Element at index 1: ${crew("Luffy")}")
    // Append
    val strawHats: TreeSet[String] = crew + "Luffy"
    println(s"Elements of list: $strawHats")
    // Remove
    val strawHats2: TreeSet[String] = crew - "Sanji"
    println(s"Elements of list: $strawHats2")
    // Concatenate
    val beastPirates = TreeSet("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of list: $pirates")
    // Intersection
    println(s"Intersection: ${pirates & strawHats}")
    // Union
    println(s"Union: ${pirates | strawHats}")
    // Difference
    println(s"Difference: ${pirates &~ strawHats}")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(s"${pirates.+("Queen")}")
    println(pirates.size)
    println(pirates.contains("Luffy"))
    println(pirates.slice(0, 2))
    pirates.foreach(name => print(name.length))
}
