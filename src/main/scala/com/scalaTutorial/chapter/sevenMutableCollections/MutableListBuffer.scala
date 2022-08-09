package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable.ListBuffer
// A Buffer implementation backed by a list. It provides constant time
// prepend and append. Most other operations are linear. It uses a
// Linked List as its internal data structure.

object MutableListBuffer extends App {
    val listBuffer: ListBuffer[Int] = ListBuffer(23, 234, 43, 5356, 76, 76, 98)
    println(listBuffer)

    // Accessing elements
    println(listBuffer(4))
    println(listBuffer(3))
    println(listBuffer(2))

    // Append
    listBuffer += 42
    println(listBuffer)
    listBuffer ++= List[Int](9, 6, 1)
    println(listBuffer)

    // Remove
    listBuffer -= 42
    println(listBuffer)
    listBuffer --= List[Int](9, 6, 1)
    println(listBuffer)

    val emptyListBuffer: ListBuffer[String] = ListBuffer.empty[String]
    print(emptyListBuffer)
}
