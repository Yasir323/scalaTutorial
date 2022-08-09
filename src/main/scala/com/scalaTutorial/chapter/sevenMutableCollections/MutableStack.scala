package com.scalaTutorial.chapter.sevenMutableCollections

import scala.collection.mutable

object MutableStack extends App {
    val stack: mutable.Stack[String] = mutable.Stack("Luffy", "Zoro", "Sanji")
    println(s"Elements of stack = $stack")
    // Accessing elements
    println(stack(0))
    println(stack(1))
    // Append
    stack += "Ussop"
    stack ++= List[String]("Nami", "Chopper")
    println(stack)
    // Remove
    stack -= "Ussop"
    stack --= List[String]("Nami", "Chopper")
    println(stack)
    // Pop
    println(stack.pop())
    // Push
    println(stack.push("Vivi"))
    // Empty stack
    val emptyStack: mutable.Stack[String] = mutable.Stack()
    println(emptyStack)
}
