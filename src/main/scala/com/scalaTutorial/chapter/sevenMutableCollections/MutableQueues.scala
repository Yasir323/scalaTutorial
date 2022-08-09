package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable

object MutableQueues extends App {
    val queue = mutable.Queue(12, 12, 45, 76, 6754, 324, 32, 34, 6565, 21)
    println(queue)

    // Accessing elements
    println(queue(3))
    println(queue(5))

    // Adding elements
    queue += 42
    // Enqueue
    queue.enqueue(43)
    println(queue)

    // Dequeue
    queue.dequeue()
    println(queue)

    // Empty queue
    val emptyQueue: mutable.Queue[String] = mutable.Queue.empty[String]
    println(emptyQueue)
}
