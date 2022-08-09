package com.scalaTutorial.chapter.tenThreading

class ThreadWithPriority(time: Long) extends Thread {
    override def run(): Unit = {
        println(s"${this.getName}: Running...")
        Thread.sleep(time)
        println(s"${this.getName}: Done!")
    }
}

