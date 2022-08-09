package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable

case class Donut(name: String, price: Double)

object MutablePriorityQueue extends App {
    def donutOrder(d: Donut) = d.price

    val pq: mutable.PriorityQueue[Donut] = mutable.PriorityQueue(
        Donut("Plain Donut", 1.50),
        Donut("Strawberry Donut", 2.0),
        Donut("Chocolate Donut", 2.50)
    )(Ordering.by(donutOrder))
    println(pq)

    // Adding elements
    pq += Donut("Krispy Kreme Donut", 1.0)
    // Enqueue
    pq.enqueue(Donut("Vanilla Donut", 1.0))
    println(pq)

    // Dequeue element
    pq.enqueue(Donut("Vanilla Donut", 1.0))
    println(pq)

    // Initialize empty queue
    val emptyPriorityQueue: mutable.PriorityQueue[String] = mutable.PriorityQueue.empty[String]
    print(emptyPriorityQueue)
}
