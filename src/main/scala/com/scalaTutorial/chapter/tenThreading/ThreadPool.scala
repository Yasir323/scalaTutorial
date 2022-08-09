package com.scalaTutorial.chapter.tenThreading
import java.util.concurrent.Executors
import java.util.concurrent.ExecutorService

object ThreadPool extends App {
    // val executor: ExecutorService = Executors.newFixedThreadPool(4)
    val executor: ExecutorService = Executors.newCachedThreadPool()
    for (i <- 0 until 10) {
        val thread = new ThreadPooling(i * 100)
        executor.execute(thread)
    }
    executor.shutdown()
    // Initiates an orderly shutdown in which previously submitted tasks
    // are executed, but no new tasks will be accepted.
    while (!executor.isTerminated) {   }
    println("Main: Done")
}
