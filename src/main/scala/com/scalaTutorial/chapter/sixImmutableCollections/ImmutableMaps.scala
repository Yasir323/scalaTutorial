package com.scalaTutorial.chapter.sixImmutableCollections

import scala.util.control.NonFatal

// Map is a collection of key-value pairs. In other words, it is similar
// to dictionary. Keys are always unique while values need not be unique.
// Key-value pairs can have any data type. However, data type once used
// for any key and value must be consistent throughout. Maps are classified
// into two types: mutable and immutable. By default Scala uses immutable
// Map. In order to use mutable Map, we must import
// scala.collection.mutable.Map class explicitly.

// Map vs ListMap
// Main difference: ListMap maintains the order of elements while
// HashMap doesn't.
// In case of ListMap: Entries are stored internally in reversed
// insertion order, which means the newest key is at the head of
// the list. Iteration order is always guaranteed.

// Map vs HashMap
// scala.collection.immutable.Map is the interface for immutable maps
// while scala.collection.immutable.HashMap is a concrete implementation.

// Creating with Map() or Map.empty gives a special empty singleton map,
// with Map(a -> b) with up to 4 pairs yields specialized classes for
// such small maps, and 5 and upwards gives you
// scala.collection.immutable.HashMap

// HashMap
// This class implements immutable maps using a Compressed Hash-Array
// Mapped Prefix-tree.

object ImmutableMaps extends App {
    // Initialize
    val emptyList = Map()
    println(s"Empty List: $emptyList")
    val anotherEmptyList = Map.empty[String, String]
    println(s"Empty List: $anotherEmptyList")
    // Checking elements
    val crew: Map[String, String] = Map("Zoro" -> "Vice Captain", "Sanji" -> "Cook")
    println(s"Elements of list: $crew")
    println(s"Is Zoro present: ${crew("Zoro")}")
    try {
        println(s"Is Luffy present: ${crew("Luffy")}")
      } catch {
        case nsee: NoSuchElementException => println(s"NoSuchElementException found: ${nsee.getMessage}")
        case NonFatal(e) => println(s"NonFatal exception found: ${e.getMessage}")
      }
    // Add elements
    val strawHats: Map[String, String] = crew + ("Luffy" -> "Captain")
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = Map(("Kaido", "Captain"), ("King", "Vice Captain"), ("Queen", "R&D"), ("Jack", "Loser"))
    val pirates = strawHats ++ beastPirates  // Becomes a HashMap here!!!
    println(s"Elements of list: $pirates")
    // Remove element
    println(pirates - "Queen")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(pirates.size)
    println(pirates.contains("Luffy"))
    println(pirates.slice(0, 2))
    println(pirates.keys)
    println(pirates.removed("Queen"))
    println(pirates.updated("Law", "Captain/Doctor/Navigator/Swordsman"))
}
