package com.scalaTutorial.chapter.sixImmutableCollections

// Sequence is an iterable collection of class Iterable. It is used to
// represent indexed sequences that are having a defined order of element
// i.e. guaranteed immutable.

object ImmutableSequence extends App {
    // Initialize
    val emptySeq = Seq()
    println(s"Empty Seq: $emptySeq")
    val anotherEmptySeq = Seq.empty[String]
    println(s"Empty Seq: $anotherEmptySeq")
    // Accessing elements
    val crew: Seq[String] = Seq("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Prepend
    val strawHats: Seq[String] = "Luffy" +: crew
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = Seq("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of list: $pirates")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(s"${pirates.:+("Queen")}")
    println(pirates.appended("Yamato"))
    println(pirates.length)
    println(pirates.contains("Luffy"))
    println(pirates.prepended("Shanks"))
    println(pirates.reverse)
    println(pirates.slice(0, 2))
    pirates.foreach(name => print(name.length))
}
