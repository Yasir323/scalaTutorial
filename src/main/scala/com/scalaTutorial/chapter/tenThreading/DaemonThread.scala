package com.scalaTutorial.chapter.tenThreading

object DaemonThread extends App {
    val thread1 =  new DaemonThreads(1500)
    val thread2 =  new DaemonThreads(2000)
    val thread3 =  new DaemonThreads(2500)
    thread3.setDaemon(true)  // Thread-2 will not finish
    println("Main: Running...")
    println(s"Main: Starting ${thread1.getName}")
    thread1.start()
    println(s"Main: Starting ${thread2.getName}")
    thread2.start()
    println(s"Main: Starting ${thread3.getName}")
    thread3.start()
    thread2.join(1000)
    thread1.join()
    println("Main: Done")
}
