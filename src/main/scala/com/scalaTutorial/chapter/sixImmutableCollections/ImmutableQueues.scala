package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.Queue

// Queue is implemented as a pair of Queues, one containing the in elements
// and the other the out elements. Elements are added to the in list and
// removed from the out list. When the out list runs dry, the queue is
// pivoted by replacing the out list by in.reverse, and in by Nil.

//Adding items to the queue always has cost O(1). Removing items has cost
// O(1), except in the case where a pivot is required, in which case, a
// cost of O(n) is incurred, where n is the number of elements in the queue.
// When this happens, n remove operations with O(1) cost are guaranteed.
// Removing an item is on average O(1).

object ImmutableQueues extends App {
    // Initialize
    val emptyQueue = Queue()
    println(s"Empty Queue: $emptyQueue")
    val anotherEmptyQueue = Queue.empty[String]
    println(s"Empty Queue: $anotherEmptyQueue")
    // Accessing elements
    val crew: Queue[String] = Queue("Zoro", "Sanji")
    println(s"Elements of queue: $crew")
    println(s"Element at index 0: ${crew(0)}")
    println(s"Element at index 1: ${crew(1)}")
    // Prepend
    val strawHats: Queue[String] = "Luffy" +: crew
    println(s"Elements of queue: $strawHats")
    // Enqueue
    println(s"Elements of queue: ${strawHats.enqueue("Nami")}")
    // Dequeue
    println(s"Elements of queue: ${strawHats.dequeue}")
    // Concatenate
    val beastPirates = Queue("Kaido", "King", "Queen", "Jack")
    val pirates = strawHats ++ beastPirates
    println(s"Elements of queue: $pirates")

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
