ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scalaTutorial"
  )
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
libraryDependencies ++= Seq(
 "joda-time" % "joda-time" % "2.10.14",
 "org.joda" % "joda-convert" % "2.2.2"
)