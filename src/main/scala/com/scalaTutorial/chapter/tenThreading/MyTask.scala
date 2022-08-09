package com.scalaTutorial.chapter.tenThreading

import java.util.{Date, TimerTask}
import scala.collection.mutable

class MyTask(queue: mutable.Queue[Long]) extends TimerTask{
    var date: Long = 0
    override def run(): Unit = {
        date = new Date().getTime
        queue.enqueue(date)
    }
}
