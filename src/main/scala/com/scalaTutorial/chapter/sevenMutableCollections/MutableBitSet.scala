package com.scalaTutorial.chapter.sevenMutableCollections
import scala.collection.mutable

object MutableBitSet extends App {
    val bitset = mutable.BitSet(0, 2, 4, 6, 8)
    println(bitset)

    // Checking elements
    println(bitset(1))

    // Adding elements
    bitset += 2
    bitset ++= mutable.BitSet(4, 6, 8)
    println(bitset)

    // Removing elements
    bitset -= 2
    bitset --= Set(4, 6, 8)
    println(bitset)

    // Intersection
    println(bitset & mutable.BitSet(1, 2, 43, 4))
    // Union
    println(bitset | mutable.BitSet(1, 2, 43, 4))
    // Difference
    println(bitset &~ mutable.BitSet(1, 2, 43, 4))

    // Empty set
    val emptySet: mutable.BitSet = mutable.BitSet.empty
    println(emptySet)
}
