package com.scalaTutorial.chapter.twoBasics.escapeCharacters_3

object EscapeCharacters extends App {
  println("Using triple quotes \"\"\" to escape characters")
  val donutJson2: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson2 = $donutJson2")
  val donutJson3: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
      """
  println(donutJson3);
  // Strip Margin
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
      """
   .stripMargin
   print(donutJson4);
  println("\nTip: stripMargin using a different character")
  val donutJson5: String =
  """
  #{
  #"donut_name":"Glazed Donut",
  #"taste_level":"Very Tasty",
  #"price":2.50
  #}
  """ .stripMargin('#')
  println(s"donutJson5 = $donutJson4")
}
