package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.ListSet


// A set is a collection which only contains unique items which are not
// repeatable and a list is a collection which contains immutable data.
// In scala, ListSet class implements immutable sets using a list-based
// data structure. Elements are stored in reversed insertion order, That
// means the newest element is at the head of the list. It maintains
// insertion order.

// ListSet is used only for a small number of elements. We can create empty
// ListSet either by calling the constructor or by applying the function
// ListSet.empty. It’s iterate and traversal methods visit elements in the
// same order in which they were first inserted.

object ImmutableListSets extends App{
    // Initialize
    val emptyList = ListSet()
    println(s"Empty List: $emptyList")
    val anotherEmptyList = ListSet.empty[String]
    println(s"Empty List: $anotherEmptyList")
    // Checking elements
    val crew: ListSet[String] = ListSet("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Is Luffy present: ${crew("Luffy")}")
    println(s"Is Zoro present: ${crew("Zoro")}")
    // Add elements
    val strawHats: ListSet[String] = crew + "Luffy"
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = ListSet("Kaido", "King", "Queen", "Jack")
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
    println(pirates & strawHats)
    println(pirates | strawHats)
    println(pirates.diff(strawHats))
    pirates.foreach(name => print(name.length))
}
