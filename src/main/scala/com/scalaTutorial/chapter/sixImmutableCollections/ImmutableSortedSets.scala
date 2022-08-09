package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.SortedSet

// SortedSet is a trait. Its concrete class implementation is a TreeSet.

object ImmutableSortedSets extends App {
    // Initialize
    val anotherEmptySortedSet = SortedSet.empty[String]
    println(s"Empty SortedSet: $anotherEmptySortedSet")
    // Check whether element exists
    val crew: SortedSet[String] = SortedSet("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew("Zoro")}")
    println(s"Element at index 1: ${crew("Luffy")}")
    // Append
    val strawHats: SortedSet[String] = crew + "Luffy"
    println(s"Elements of list: $strawHats")
    // Remove
    val strawHats2: SortedSet[String] = crew - "Sanji"
    println(s"Elements of list: $strawHats2")
    // Concatenate
    val beastPirates = SortedSet("Kaido", "King", "Queen", "Jack")
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

    // Change ordering to descending
    object AlphabetOrdering extends Ordering[String] {
        def compare(element1: String, element2: String): Int = element2.compareTo(element1)
    }
    val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
    println(s"Elements of sortedSet6 = $sortedSet6")
}

