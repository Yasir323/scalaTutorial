package com.scalaTutorial.chapter.threeFunctions.higherOrderFunctions_11

import scala.util.Random

object CallByName extends App {
    val randomExchangeRate = new Random(10)
    def exchangeRate: Long = {
        val rate = randomExchangeRate.nextDouble() * 10 + 75
        println(s"Fetching Belli to Rupees exchange rate = ${rate.toLong}")
        rate.toLong
    }
    val crew: List[(String, Long, String)] = List(("Luffy", 3_000_000_000L, "Captain"), ("Zoro", 320_000_000L, "Vice-captain"))
    def totalBounty(crew: List[(String, Long, String)])(exchangeRate: => Long): Long = {
        var totalBounty: Long = 0
        crew.foreach { member =>
            val bounty = member._2 * exchangeRate
            println(s"Bounty of ${member._1}: $bounty")
            totalBounty += bounty
        }
        totalBounty
    }
    // The call-by-name function parameter exchangeRate: => Double will evaluate any exchangeRate function each time it is called.
    println(s"Total Bounty: Rs. ${totalBounty(crew)(exchangeRate)}")
}
