package com.scalaTutorial.chapter.oneIntro.tutorial_10

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithLogging extends App with LazyLogging{
  logger.info("Hello World from Logging.")
}
