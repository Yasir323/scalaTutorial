package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.HashSet

// This class implements immutable sets using a Compressed Hash-Array Mapped Prefix-tree.

object ImmutableHashSets extends App {
    // Initialize
    val emptyHashSet = HashSet()
    println(s"Empty HashSet: $emptyHashSet")
    val anotherEmptyHashSet = HashSet.empty[String]
    println(s"Empty HashSet: $anotherEmptyHashSet")
    // Check whether element exists
    val crew: HashSet[String] = HashSet("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew("Zoro")}")
    println(s"Element at index 1: ${crew("Luffy")}")
    // Append
    val strawHats: HashSet[String] = crew + "Luffy"
    println(s"Elements of list: $strawHats")
    // Remove
    val strawHats2: HashSet[String] = crew - "Sanji"
    println(s"Elements of list: $strawHats2")
    // Concatenate
    val beastPirates = HashSet("Kaido", "King", "Queen", "Jack")
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
