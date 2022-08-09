package com.scalaTutorial.chapter.tenThreading

object ThreadsWithPriority extends App {
    val thread1 =  new ThreadWithPriority(2000)
    val thread2 =  new ThreadWithPriority(2000)
    val thread3 =  new ThreadWithPriority(2000)
    thread1.setPriority(8)
    thread2.setPriority(9)
    thread3.setPriority(10)
    println("Main: Running...")
    println(s"Main: Starting ${thread1.getName}")
    thread1.start()
    println(s"Main: Starting ${thread2.getName}")
    thread2.start()
    println(s"Main: Starting ${thread3.getName}")
    thread3.start()
    println("Main: Done")
}
