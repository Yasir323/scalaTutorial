package com.scalaTutorial.chapter.twoBasics.tuples_12

object TupleTutorial extends App {

    // Initialization
    val captain = Tuple2("Luffy", 1)

    // Accessing elements
    var name: String = captain._1
    var rank: Int = captain._2

    // Tuple3
    val captain_ = Tuple3("Luffy", 1, 3_000_000_000L)
    name = captain_._1
    rank = captain_._2
    var bounty: Long = captain_._3

    // How to use pattern matching on Tuples
    val captain2 = Tuple3("Luffy", 1, 3_000_000_000L)
    val cook = Tuple3("Sanji", 4, 330_000_000L)
    val navigator = Tuple3("Nami", 2, 66_000_000L)
    val crewList = List(captain2, cook, navigator)
    val bountyOfMember: Any = crewList.foreach { tuple => {
        tuple match {
            case ("Luffy", 1, bounty) => println(s"Luffy has a bounty of $bounty")
            case d if d._1 == "Nami" => println(s"${d._1} has a bounty of ${d._3}")
            case _ => None;
            }
        }
    }
    // Shortcut for creating Tuples
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
}
