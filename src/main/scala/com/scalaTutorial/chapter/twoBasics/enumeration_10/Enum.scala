package com.scalaTutorial.chapter.twoBasics.enumeration_10

object Enum extends App {
    object Role extends Enumeration {
        type Role = Value
        val Luffy: Enum.Role.Value = Value("Captain")
        val Zoro: Enum.Role.Value = Value("Vice-Captain")
        val Sanji: Enum.Role.Value = Value("Cook")
        val Nami: Enum.Role.Value = Value("Navigator")
    }
    println(s"Luffy's Role: ${Role.Luffy}")
    println(s"Luffy's Role: ${Role.Luffy.id}")
    println(s"Donut types = ${Role.values}")
    // Pattern Matching
    Role.values.foreach {
        case d if (d == Role.Nami) => println("Crew")
        case _ => None
    }
    // Change Ordering
    object DonutTaste extends Enumeration {
        type DonutTaste = Value

        val Tasty: Enum.DonutTaste.Value = Value(0, "Tasty")
        val VeryTasty:Enum.DonutTaste.Value = Value(1, "Very Tasty")
        val Ok: Enum.DonutTaste.Value = Value(-1, "Ok")
    }

    println(s"Donut taste values = ${DonutTaste.values}")
    println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")
}
