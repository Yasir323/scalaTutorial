package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.ListMap
import scala.util.control.NonFatal

// This class implements immutable maps using a list-based data structure.
// List map iterators and traversal methods visit key-value pairs in the
// order they were first inserted.

// Entries are stored internally in reversed insertion order, which means
// the newest key is at the head of the list. As such, methods such as head
// and tail are O(n), while last and init are O(1). Other operations, such
// as inserting or removing entries, are also O(n), which makes this
// collection suitable only for a small number of elements.

object ImmutableListMaps extends App {
    // Initialize
    val emptyList = ListMap()
    println(s"Empty List: $emptyList")
    val anotherEmptyList = ListMap.empty[String, String]
    println(s"Empty List: $anotherEmptyList")
    // Checking elements
    val crew: ListMap[String, String] = ListMap("Zoro" -> "Vice Captain", "Sanji" -> "Cook")
    println(s"Elements of list: $crew")
    println(s"Is Zoro present: ${crew("Zoro")}")
    try {
        println(s"Is Luffy present: ${crew("Luffy")}")
      } catch {
        case nsee: NoSuchElementException => println(s"NoSuchElementException found: ${nsee.getMessage}")
        case NonFatal(e) => println(s"NonFatal exception found: ${e.getMessage}")
      }
    // Add elements
    val strawHats: ListMap[String, String] = crew + ("Luffy" -> "Captain")
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = ListMap("Kaido" -> "Captain", "King" -> "Vice Captain", "Queen" -> "R&D", "Jack" -> "Loser")
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
