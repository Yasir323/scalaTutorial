package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.TreeMap
import scala.util.control.NonFatal

// An immutable SortedMap whose values are stored in a red-black tree.

// This class is optimal when range queries will be performed, or when
// traversal in order of an ordering is desired. If you only need key
// lookups, and don't care in which order key-values are traversed in,
// consider using * scala.collection.immutable.HashMap, which will
// generally have better performance. If you need insertion order,
// consider a * scala.collection.immutable.SeqMap, which does not need
// to have an ordering supplied.

// The TreeMap is sorted by default using the natural order of its key.

object ImmutableTreeMaps extends App {
    // Initialize
    val emptyList = TreeMap.empty[String, String]
    println(s"Empty List: $emptyList")
    // Checking elements
    val crew: TreeMap[String, String] = TreeMap("Zoro" -> "Vice Captain", "Sanji" -> "Cook")
    println(s"Elements of list: $crew")
    println(s"Is Zoro present: ${crew("Zoro")}")
    try {
        println(s"Is Luffy present: ${crew("Luffy")}")
    } catch {
        case nsee: NoSuchElementException => println(s"NoSuchElementException found: ${nsee.getMessage}")
        case NonFatal(e) => println(s"NonFatal exception found: ${e.getMessage}")
    }
    // Add elements
    val strawHats: TreeMap[String, String] = crew + ("Luffy" -> "Captain")
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = TreeMap("Kaido" -> "Captain", "King" -> "Vice Captain", "Queen" -> "R&D", "Jack" -> "Loser")
    val pirates = strawHats ++ beastPirates
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
