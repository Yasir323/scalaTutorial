package com.scalaTutorial.chapter.tenThreading

import java.util.{Date, Timer, TimerTask}
import scala.collection.mutable

object Tasks extends App {
    val queue: mutable.Queue[Long] = mutable.Queue()
    val timer: Timer = new Timer(); // creating timer
    val task: MyTask = new MyTask(queue); // creating timer task
    timer.scheduleAtFixedRate(task, new Date(),2000);
    var i = 0
    while (i < 10) {
        println(queue.dequeue())
        i += 1
    }
}
