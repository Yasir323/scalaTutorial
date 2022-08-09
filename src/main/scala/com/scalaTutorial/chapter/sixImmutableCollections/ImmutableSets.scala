package com.scalaTutorial.chapter.sixImmutableCollections

object ImmutableSets extends App {
    // Initialize
    val emptySet = Set()
    println(s"Empty Set: $emptySet")
    val anotherEmptySet = Set.empty[String]
    println(s"Empty Set: $anotherEmptySet")
    // Check whether element exists
    val crew: Set[String] = Set("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew("Zoro")}")
    println(s"Element at index 1: ${crew("Luffy")}")
    // Append
    val strawHats: Set[String] = crew + "Luffy"
    println(s"Elements of list: $strawHats")
    // Remove
    val strawHats2: Set[String] = crew - "Sanji"
    println(s"Elements of list: $strawHats2")
    // Concatenate
    val beastPirates = Set("Kaido", "King", "Queen", "Jack")
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
