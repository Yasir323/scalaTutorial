package com.scalaTutorial.chapter.tenThreading

object Threading extends App {
    val thread1 =  new TempThread(1500)
    val thread2 =  new TempThread(2000)
    val thread3 =  new TempThread(2500)
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

// What if we call Java run() method directly instead start() method?

//Each thread starts in a separate call stack.

//Invoking the run() method from the main thread, the run() method goes
// onto the current call stack rather than at the beginning of a new
// call stack.

// There will be no context-switching because here t1 and t2 will be
// treated as normal object not thread object.
