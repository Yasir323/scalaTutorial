package com.scalaTutorial.chapter.oneIntro.totorial_06

object HelloWorldWithArguments extends App {
  println("Hello World with command line arguments.");
  println("Command line arguments are:");
  println(args.mkString(", "));
}
