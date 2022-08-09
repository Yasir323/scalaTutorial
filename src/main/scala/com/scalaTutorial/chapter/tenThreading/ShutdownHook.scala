package com.scalaTutorial.chapter.tenThreading

object ShutdownHook extends App {
    val cleanupThread = new CleanupThread
    val runtime = Runtime.getRuntime
    runtime.addShutdownHook(cleanupThread)
    while (true) {}
}
