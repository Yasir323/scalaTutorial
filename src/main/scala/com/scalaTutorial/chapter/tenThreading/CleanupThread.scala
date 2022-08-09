package com.scalaTutorial.chapter.tenThreading

class CleanupThread extends Thread {
     override def run(): Unit = {
        println("Shutdown hook task completed.")
     }
}
