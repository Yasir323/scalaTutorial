package com.scalaTutorial.chapter.sixImmutableCollections

// Vector is a general-purpose, immutable data structure. It provides
// random access and updates in O(log n) time, as well as very fast
// append/prepend/tail/init (amortized O(1), worst case O(log n)).
// Because vectors strike a good balance between fast random selections
// and fast random functional updates, they are currently the default
// implementation of immutable indexed sequences.

//Vectors are implemented by radix-balanced finger trees of width 32.

object ImmutableVectors extends App {
    // Initialize
    val emptyVector = Vector()
    println(s"Empty Vector: $emptyVector")
    val anotherEmptyVector = Vector.empty[String]
    println(s"Empty Vector: $anotherEmptyVector")
    // Accessing elements
    val crew: Vector[String] = Vector("Zoro", "Sanji")
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Prepend
    val strawHats: Vector[String] = "Luffy" +: crew
    println(s"Elements of list: $strawHats")
    // Concatenate
    val beastPirates = Vector("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of list: $pirates")

    // Methods
    println(s"Head: ${pirates.head}")
    println(s"Tail: ${pirates.tail}")
    println(pirates.last)
    println(s"isEmpty: ${pirates.isEmpty}")
    println(s"${pirates.++("Queen")}")
    println(pirates.appended("Yamato"))
    println(pirates.length)
    println(pirates.contains("Luffy"))
    println(pirates.prepended("Shanks"))
    println(pirates.reverse)
    println(pirates.slice(0, 2))
    pirates.foreach(name => print(name.length))

}
