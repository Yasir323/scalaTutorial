package com.scalaTutorial.chapter.sixImmutableCollections

// A list is a collection which contains immutable data. List represents
// linked list in Scala. The Scala List class holds a sequenced, linear
// list of items.

// Lists are immutable whereas arrays are mutable in Scala.
// Lists represents a linked list whereas arrays are flat.

object ImmutableLists extends App {
    // Initialize
    val emptyList = List()
    println(s"Empty List: $emptyList")
    val anotherEmptyList = List.empty[String]
    println(s"Empty List: $anotherEmptyList")
    // Accessing elements
    val crew: List[String] = List("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Prepend
    val strawHats: List[String] = "Luffy" +: crew
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = List("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ::: beastPirates
    println(s"Elements of list: $pirates")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(s"${pirates.::("Queen")}")
    println(pirates.appended("Yamato"))
    println(pirates.length)
    println(pirates.contains("Luffy"))
    println(pirates.prepended("Shanks"))
    println(pirates.reverse)
    println(pirates.slice(0, 2))
    pirates.foreach(name => print(name.length))
}
