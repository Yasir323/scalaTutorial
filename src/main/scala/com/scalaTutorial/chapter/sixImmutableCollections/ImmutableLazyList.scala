package com.scalaTutorial.chapter.sixImmutableCollections

// This class implements an immutable linked list. We call it "lazy"
// because it computes its elements only when they are needed.
// Elements are memoized; that is, the value of each element is
// computed at most once.
// Elements are computed in-order and are never skipped. In other words,
// accessing the tail causes the head to be computed first.
//How lazy is a LazyList? When you have a value of type LazyList, you
// don't know yet whether the list is empty or not. If you learn that
// it is non-empty, then you also know that the head has been computed.
// But the tail is itself a LazyList, whose emptiness-or-not might
// remain undetermined.

object ImmutableLazyList extends App {
    val stream1: LazyList[Int] = 1 #:: 3 #:: 9 #:: LazyList.empty
    println(s"Elements of stream1 = ${stream1(0)}")
    println(s"Elements of stream1 = ${stream1(1)}")
    println(s"Elements of stream1 = ${stream1(2)}")

    // Another way
    val xs = LazyList.cons(1, LazyList.cons(2, LazyList.empty))

    // LazyList supports all the methods that a list does.

    def llRange(lo: Int, hi: Int): LazyList[Int] = {
        if (lo >= hi) LazyList.empty
        else LazyList.cons(lo, llRange(lo + 1, hi))
    }
    val ll: LazyList[Int] = llRange(1, 10)
    println(ll.head)

    // Infinite stream
    def infStream(start: Int, step: Int): LazyList[Int] = {
        LazyList.cons(start, infStream(start + step, step))
    }
    val infLL: LazyList[Int] = infStream(3, 2)
    println(infLL(0))
    println(infLL(1))
    println(infLL(22))

    // Infinite stream using from
    val stream: LazyList[Int] = LazyList.from(34)
    println(stream(0))
    println(stream(1))
    println(stream(22))
}