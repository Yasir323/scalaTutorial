package com.scalaTutorial.chapter.sixImmutableCollections

import scala.collection.immutable.BitSet

// A class for immutable bitsets.
//Bitsets are sets of non-negative integers which are represented as
// variable-size arrays of bits packed into 64-bit words. The lower bound
// of memory footprint of a bitset is determined by the largest number
// stored in it.
object ImmutableBitSets extends App {
    // Initialize
    val emptyBitSet = BitSet()
    println(s"Empty BitSet: $emptyBitSet")
    val anotherEmptyBitSet = BitSet.empty
    println(s"Empty BitSet: $anotherEmptyBitSet")
    // Check whether element exists
    val crew: BitSet = BitSet(0, 2, 4)
    println(s"Elements of list: $crew")
    println(s"Element at index 0: ${crew(1)}")
    println(s"Element at index 1: ${crew(4)}")
    // Append
    val strawHats: BitSet = crew + 3
    println(s"Elements of list: $strawHats")
    // Remove
    val strawHats2: BitSet = crew - 2
    println(s"Elements of list: $strawHats2")
    // Concatenate
    val beastPirates = BitSet(7, 81, 43, 29)
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
    println(pirates.contains(43))
    println(pirates.slice(0, 2))
}
